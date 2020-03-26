$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/Testcase.feature");
formatter.feature({
  "line": 2,
  "name": "Automation Website",
  "description": "",
  "id": "automation-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Automation"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "#1",
  "description": "register in the Automation demo website",
  "id": "automation-website;#1",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@TC01_Automation"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "the user open the  Automation demo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "the user register using \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "click on the register button user nagivate to the next page",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "automation-website;#1;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 14,
      "id": "automation-website;#1;;1"
    },
    {
      "cells": [
        "user1",
        "passwd"
      ],
      "line": 15,
      "id": "automation-website;#1;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "#1",
  "description": "register in the Automation demo website",
  "id": "automation-website;#1;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Automation"
    },
    {
      "line": 4,
      "name": "@TC01_Automation"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "the user open the  Automation demo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "the user register using user1 and passwd",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "click on the register button user nagivate to the next page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});