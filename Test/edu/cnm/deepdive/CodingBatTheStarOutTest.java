package edu.cnm.deepdive;

import static edu.cnm.deepdive.CodingBatTheStarOut.starOut;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatTheStarOutTest {

  private String[] starParams = {
      "ab*cd",
  "ab**cd",
  "sm*eilly",
  "sm*eil*ly",
  "sm**eil*ly",
  "sm***eil*ly",
  "stringy*",
  "*stringy",
  "*str*in*gy",
  "abc",
  "a*bc",
  "ab",
  "a*b",
  "a",
  "a*",
  "*a",
  "*",
  ""
  };

  private String[] starExpected = {
      "ad",
      "ad",
      "silly",
      "siy",
      "siy",
      "siy",
      "string",
      "tringy",
      "ty",
      "abc",
      "c",
      "ab",
      "",
      "a",
      "",
      "",
      "",
      ""
  };

  @Test
  void starTest() {
    for (int i = 0; i < starParams.length; i++) {
      String actual = starOut(starParams[i]);
      Assertions.assertEquals(actual, starExpected[i]);
    }
  }

}