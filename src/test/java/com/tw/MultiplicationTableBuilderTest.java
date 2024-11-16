package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTableBuilderTest {
    @Test
    void should_return_true_when_isInRange_given_a_number_5() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int number = 5;

        // When
        boolean isInRange = multiplicationTableBuilder.isInRange(number);

        // Then
        assertTrue(isInRange);
    }

    @Test
    void should_return_false_when_isInRange_given_a_number_0() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int number = 0;

        // When
        boolean isInRange = multiplicationTableBuilder.isInRange(number);

        // Then
        assertFalse(isInRange);
    }

    @Test
    void should_return_false_when_isInRange_given_a_number_1001() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int number = 1001;

        // When
        boolean isInRange = multiplicationTableBuilder.isInRange(number);

        // Then
        assertFalse(isInRange);
    }

    @Test
    void should_return_true_when_isStarterSmallerThanEnder_given_a_start_2_and_end_3() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 3;

        // When
        boolean isStarterSmallerThanEnder = multiplicationTableBuilder.isStarterSmallerThanEnder(start, end);

        // Then
        assertTrue(isStarterSmallerThanEnder);
    }

    @Test
    void should_return_true_when_isStarterSmallerThanEnder_given_a_start_3_and_end_3() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 3;
        int end = 3;

        // When
        boolean isStarterSmallerThanEnder = multiplicationTableBuilder.isStarterSmallerThanEnder(start, end);

        // Then
        assertTrue(isStarterSmallerThanEnder);
    }

    @Test
    void should_return_false_when_isStarterSmallerThanEnder_given_a_start_3_and_end_2() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start =3;
        int end = 2;

        // When
        boolean isStarterSmallerThanEnder = multiplicationTableBuilder.isStarterSmallerThanEnder(start, end);

        // Then
        assertFalse(isStarterSmallerThanEnder);
    }

    @Test
    void should_generate_expression_when_generateExpression_given_a_start_2_and_end_4() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;

        // When
        String expression = multiplicationTableBuilder.generateExpression(start, end);

        // Then
        assertEquals("2*4=8", expression);
    }
}
