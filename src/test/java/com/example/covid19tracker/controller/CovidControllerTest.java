package com.example.covid19tracker.service;

import com.example.covid19tracker.model.CovidSummary;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@SpringBootTest
class CovidDataServiceTest {

    @Autowired
    private CovidDataService covidDataService;

    @MockBean
    private RestTemplate restTemplate;

    @Test
    void shouldReturnGlobalStatsFromDiseaseApi() {
        CovidSummary summary = new CovidSummary();
        summary.setCases(100L);
        summary.setDeaths(10L);
        summary.setRecovered(80L);
        summary.setActive(10L);

        when(restTemplate.getForEntity(eq("https://disease.sh/v3/covid-19/all"), eq(CovidSummary.class)))
                .thenReturn(ResponseEntity.ok(summary));

        CovidSummary result = covidDataService.getGlobalStats();

        assertThat(result.getCases()).isEqualTo(100L);
        assertThat(result.getDeaths()).isEqualTo(10L);
        assertThat(result.getRecovered()).isEqualTo(80L);
        assertThat(result.getActive()).isEqualTo(10L);
    }
}
