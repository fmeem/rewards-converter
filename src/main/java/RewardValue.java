package main.java;

public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;
    }

    // Constructor that accepts miles value
    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    // Method to get cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get miles value
    public double getMilesValue() {
        return milesValue;
    }
}
