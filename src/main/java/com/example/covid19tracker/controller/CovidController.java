package com.example.covid19tracker.service;

import com.example.covid19tracker.model.CovidSummary;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CovidDataService {

    private static final String API_URL = "https://disease.sh/v3/covid-19/all";

    private final RestTemplate restTemplate;

    public CovidDataService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public CovidSummary getGlobalStats() {
        ResponseEntity<CovidSummary> response = restTemplate.getForEntity(API_URL, CovidSummary.class);

        if (response.getStatusCode().is2xxSuccessful() && response.getBody() != null) {
            return response.getBody();
        }

        throw new IllegalStateException("Unable to fetch COVID-19 data from disease.sh");
    }
}
