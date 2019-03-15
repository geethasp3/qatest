$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test1.feature");
formatter.feature({
  "line": 1,
  "name": "Testing of scenarios for cumcumber",
  "description": "",
  "id": "testing-of-scenarios-for-cumcumber",
  "keyword": "Feature"
});
formatter.before({
  "duration": 327229,
  "status": "passed"
});
formatter.before({
  "duration": 196761,
  "status": "passed"
});
formatter.before({
  "duration": 150920,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "SCEANRIO 2",
  "description": "",
  "id": "testing-of-scenarios-for-cumcumber;sceanrio-2",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Second"
    },
    {
      "line": 10,
      "name": "@smoketest1"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "this is teh first step for scenario2",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "we use the second stpe for scenario2",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "we get the third step for scenario2",
  "keyword": "Then "
});
formatter.match({
  "location": "testscenario1.this_is_teh_first_step_for_scenario2()"
});
formatter.result({
  "duration": 184649599,
  "status": "passed"
});
formatter.match({
  "location": "testscenario1.we_use_the_second_stpe_for_scenario2()"
});
formatter.result({
  "duration": 297961,
  "status": "passed"
});
formatter.match({
  "location": "testscenario1.we_get_the_third_step_for_scenario2()"
});
formatter.result({
  "duration": 107901,
  "status": "passed"
});
formatter.after({
  "duration": 643526,
  "status": "passed"
});
formatter.after({
  "duration": 420319,
  "status": "passed"
});
});