<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>COVID-19 Tracker</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            background: #f4f7fb;
            color: #1e293b;
        }
        .container {
            max-width: 1100px;
            margin: 40px auto;
            padding: 20px;
        }
        .header {
            margin-bottom: 30px;
        }
        .stats-grid {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(220px, 1fr));
            gap: 20px;
        }
        .card {
            background: #fff;
            border-radius: 10px;
            box-shadow: 0 2px 12px rgba(15, 23, 42, 0.08);
            padding: 20px;
        }
        .label {
            font-size: 14px;
            color: #64748b;
            margin-bottom: 10px;
        }
        .value {
            font-size: 28px;
            font-weight: 700;
        }
        .muted {
            color: #475569;
            font-size: 14px;
            margin-top: 12px;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="header">
        <h1>COVID-19 Tracker</h1>
        <p>Live global statistics from disease.sh API</p>
    </div>

    <div class="stats-grid">
        <div class="card">
            <div class="label">Total Cases</div>
            <div class="value" th:text="${#numbers.formatInteger(stats.cases, 3, 'COMMA')}">0</div>
        </div>
        <div class="card">
            <div class="label">Total Deaths</div>
            <div class="value" th:text="${#numbers.formatInteger(stats.deaths, 3, 'COMMA')}">0</div>
        </div>
        <div class="card">
            <div class="label">Recovered</div>
            <div class="value" th:text="${#numbers.formatInteger(stats.recovered, 3, 'COMMA')}">0</div>
        </div>
        <div class="card">
            <div class="label">Active</div>
            <div class="value" th:text="${#numbers.formatInteger(stats.active, 3, 'COMMA')}">0</div>
        </div>
        <div class="card">
            <div class="label">Critical</div>
            <div class="value" th:text="${#numbers.formatInteger(stats.critical, 3, 'COMMA')}">0</div>
        </div>
        <div class="card">
            <div class="label">Tests</div>
            <div class="value" th:text="${#numbers.formatInteger(stats.tests, 3, 'COMMA')}">0</div>
        </div>
    </div>

    <div class="muted">
        Updated: <span th:text="${#dates.format(stats.updated, 'yyyy-MM-dd HH:mm:ss')}">N/A</span>
    </div>
</div>
</body>
</html>
