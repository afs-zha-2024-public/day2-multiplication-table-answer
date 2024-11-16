package com.tw;

public class MultiplicationTableBuilder {
    public boolean isInRange(int number) {
        return number > 0 && number < 1000;
    }

    public boolean isStarterSmallerThanEnder(int start, int end) {
        return start <= end;
    }

    public String generateExpression(int start, int end) {
        return start + "*" + end + "=" + start * end;
    }

    public String generateLine(int start, int end) {
        StringBuilder line = new StringBuilder();
        for (int i = start; i <= end; i++) {
            line.append(generateExpression(i, end));
            if (i != end) {
                line.append(" ");
            }
        }
        return line.toString();
    }

    public String generateTable(int start, int end) {
        StringBuilder table = new StringBuilder();
        for (int i = start; i <= end; i++) {
            table.append(generateLine(start, i));
            if (i != end) {
                table.append("\n");
            }
        }
        return table.toString();
    }

    public boolean isValid(int start, int end) {
        return isStarterSmallerThanEnder(start, end);
    }
}
