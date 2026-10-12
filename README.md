# covid-19-tracker

A Java Spring Boot application that fetches and displays live global COVID-19 statistics from the disease.sh API: https://disease.sh/v3/covid-19/all

## Features
- Fetches live global COVID-19 statistics from disease.sh
- Exposes a REST endpoint: `/api/covid/global`
- Renders a simple dashboard on the home page using Thymeleaf
- Includes unit tests for the controller and service layer
- Ready for Jenkins freestyle build, test, package, and archive workflow

## Tech stack
- Java 17
- Spring Boot 3.3.x
- Maven
- Thymeleaf
- JUnit 5

## Run locally

Prerequisites:
- Java 17+
- Maven 3.9+

From the project root:

```bash
mvn spring-boot:run
```

Then open:
- UI: http://localhost:8080/
- API: http://localhost:8080/api/covid/global

Example API response:

```json
{
  "updated": 1728123456789,
  "cases": 772000000,
  "todayCases": 1200,
  "deaths": 6980000,
  "todayDeaths": 35,
  "recovered": 740000000,
  "todayRecovered": 2100,
  "active": 25800000,
  "critical": 40000,
  "casesPerOneMillion": 98600,
  "deathsPerOneMillion": 900,
  "tests": 1200000000,
  "testsPerOneMillion": 150000,
  "population": 8000000000,
  "oneCasePerPeople": 10,
  "oneDeathPerPeople": 120,
  "oneTestPerPeople": 7,
  "activePerOneMillion": 3200,
  "recoveredPerOneMillion": 92000,
  "criticalPerOneMillion": 50,
  "affectedCountries": 220
}
```

## Jenkins freestyle job setup

This repository includes a template configuration at:
- `jenkins/covid19-tracker-freestyle-job.xml`

Recommended Jenkins configuration:

1. Open Jenkins and click New Item
2. Create a Freestyle project named `covid-19-tracker`
3. Under Source Code Management: choose Git
   - Repository URL: `https://github.com/riyashoffz-boop/covid-19-tracker.git`
4. Under Build:
   - Add a Maven build step
   - Goals and options: `clean test package`
5. Under Post-build Actions:
   - Archive the artifacts: `target/**`
6. Save and run the job

This performs the requested workflow:
- checkout repo
- build with Maven
- run unit tests
- package the app
- archive the `target/` directory as a Jenkins artifact

## Jenkins artifact archive example

Set the artifact pattern to:

```text
target/**
```

This archives the generated JAR and any packaged output under the `target/` directory.

## GitHub repository

Repository:
- https://github.com/riyashoffz-boop/covid-19-tracker

## License
MIT
