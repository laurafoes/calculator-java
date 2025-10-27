

public class Calculator {
    private double valueA;
    private double valueB;

    public Calculator() {
        this(0, 0);
    }

    public Calculator(double valueA, double valueB) {
        setValueA(valueA);
        setValueB(valueB);
    }

    public double getValueA() {
        return valueA;
    }

    public double getValueB() {
        return valueB;
    }

    public void setValueA(double valueA) {
        this.valueA = valueA;
    }

    public void setValueB(double valueB) {
        this.valueB = valueB;
    }

    public double getSum() {
        return (getValueA() + getValueB());
    }

    public double getDifference() {
        return (getValueA() - getValueB());
    }

    public double getProduct() {
        return (getValueA() * getValueB());
    }

    public double getQuotient() {
        return (getValueA() / getValueB());
    }
}
