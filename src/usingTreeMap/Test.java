package usingTreeMap;

public class Test implements Comparable {

    private int intField;
    private String stringField;

    public Test(int intField, String stringField) {
        this.intField = intField;
        this.stringField = stringField;
    }

    public int getIntField() {
        return intField;
    }

    public String getStringField() {
        return stringField;
    }

    @Override
    public int compareTo(Object o) {
        return this.intField - ((Test)o).intField;
    }

    @Override
    public String toString() {
        return "int = " + getIntField() + ", string = " + getStringField();
    }
}
