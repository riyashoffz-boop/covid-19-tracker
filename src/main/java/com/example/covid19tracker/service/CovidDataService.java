package com.example.covid19tracker.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CovidSummary {

    private Long updated;
    private Long cases;
    private Long todayCases;
    private Long deaths;
    private Long todayDeaths;
    private Long recovered;
    private Long todayRecovered;
    private Long active;
    private Long critical;
    private Long casesPerOneMillion;
    private Long deathsPerOneMillion;
    private Long tests;
    private Long testsPerOneMillion;
    private Long population;
    private Long oneCasePerPeople;
    private Long oneDeathPerPeople;
    private Long oneTestPerPeople;
    private Long activePerOneMillion;
    private Long recoveredPerOneMillion;
    private Long criticalPerOneMillion;
    private Long affectedCountries;

    public Long getUpdated() {
        return updated;
    }

    public void setUpdated(Long updated) {
        this.updated = updated;
    }

    public Long getCases() {
        return cases;
    }

    public void setCases(Long cases) {
        this.cases = cases;
    }

    public Long getTodayCases() {
        return todayCases;
    }

    public void setTodayCases(Long todayCases) {
        this.todayCases = todayCases;
    }

    public Long getDeaths() {
        return deaths;
    }

    public void setDeaths(Long deaths) {
        this.deaths = deaths;
    }

    public Long getTodayDeaths() {
        return todayDeaths;
    }

    public void setTodayDeaths(Long todayDeaths) {
        this.todayDeaths = todayDeaths;
    }

    public Long getRecovered() {
        return recovered;
    }

    public void setRecovered(Long recovered) {
        this.recovered = recovered;
    }

    public Long getTodayRecovered() {
        return todayRecovered;
    }

    public void setTodayRecovered(Long todayRecovered) {
        this.todayRecovered = todayRecovered;
    }

    public Long getActive() {
        return active;
    }

    public void setActive(Long active) {
        this.active = active;
    }

    public Long getCritical() {
        return critical;
    }

    public void setCritical(Long critical) {
        this.critical = critical;
    }

    public Long getCasesPerOneMillion() {
        return casesPerOneMillion;
    }

    public void setCasesPerOneMillion(Long casesPerOneMillion) {
        this.casesPerOneMillion = casesPerOneMillion;
    }

    public Long getDeathsPerOneMillion() {
        return deathsPerOneMillion;
    }

    public void setDeathsPerOneMillion(Long deathsPerOneMillion) {
        this.deathsPerOneMillion = deathsPerOneMillion;
    }

    public Long getTests() {
        return tests;
    }

    public void setTests(Long tests) {
        this.tests = tests;
    }

    public Long getTestsPerOneMillion() {
        return testsPerOneMillion;
    }

    public void setTestsPerOneMillion(Long testsPerOneMillion) {
        this.testsPerOneMillion = testsPerOneMillion;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public Long getOneCasePerPeople() {
        return oneCasePerPeople;
    }

    public void setOneCasePerPeople(Long oneCasePerPeople) {
        this.oneCasePerPeople = oneCasePerPeople;
    }

    public Long getOneDeathPerPeople() {
        return oneDeathPerPeople;
    }

    public void setOneDeathPerPeople(Long oneDeathPerPeople) {
        this.oneDeathPerPeople = oneDeathPerPeople;
    }

    public Long getOneTestPerPeople() {
        return oneTestPerPeople;
    }

    public void setOneTestPerPeople(Long oneTestPerPeople) {
        this.oneTestPerPeople = oneTestPerPeople;
    }

    public Long getActivePerOneMillion() {
        return activePerOneMillion;
    }

    public void setActivePerOneMillion(Long activePerOneMillion) {
        this.activePerOneMillion = activePerOneMillion;
    }

    public Long getRecoveredPerOneMillion() {
        return recoveredPerOneMillion;
    }

    public void setRecoveredPerOneMillion(Long recoveredPerOneMillion) {
        this.recoveredPerOneMillion = recoveredPerOneMillion;
    }

    public Long getCriticalPerOneMillion() {
        return criticalPerOneMillion;
    }

    public void setCriticalPerOneMillion(Long criticalPerOneMillion) {
        this.criticalPerOneMillion = criticalPerOneMillion;
    }

    public Long getAffectedCountries() {
        return affectedCountries;
    }

    public void setAffectedCountries(Long affectedCountries) {
        this.affectedCountries = affectedCountries;
    }
}
