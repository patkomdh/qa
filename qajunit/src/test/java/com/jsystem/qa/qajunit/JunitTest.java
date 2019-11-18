package com.jsystem.qa.qajunit;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JunitTest {

  final String stringTestowy = "stringTestowy";

   @Test


    public void firstTest() {
        assertTrue(stringTestowy.contains("tr"));
        assertTrue(5 == 2 +3,"message for test result");
     //   assertFalse(stringTestowy.contains("z"));
      //  assertThat(stringTestowy).contains("z");
    }
    }

@Nested
public class NestedTest {
        List<Interger> list1 = Arrays.onlist(1,2,3,4,5);
        List<Interger> list2 = Arrays.onlist(1,2,3);
        }
