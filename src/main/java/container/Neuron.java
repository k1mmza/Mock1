package container;

public class Neuron {
    private static double minWeightValue;
    private static double maxWeightValue;
    private double[] weights;
    private double gradient;
    private double bias;
    private double value;

    public Neuron(double[] weights, double bias) {
        this.weights = weights;
        this.bias = bias;
        this.gradient = 0;
        this.value = 0;
    }

    public Neuron(double value){
        this.value = value;
        this.weights = null;
        this.bias = -1;
        this.gradient = -1;
    }

    public static void setRangeWeight(double min, double max){
        minWeightValue = min;
        maxWeightValue = max;
    }
    public static double getMinWeightValue() {
        return minWeightValue;
    }

    public static void setMinWeightValue(double minWeightValue) {
        Neuron.minWeightValue = minWeightValue;
    }

    public static double getMaxWeightValue() {
        return maxWeightValue;
    }

    public static void setMaxWeightValue(double maxWeightValue) {
        Neuron.maxWeightValue = maxWeightValue;
    }

    public double[] getWeights() {
        return weights;
    }

    public void setWeights(double[] weights) {
        this.weights = weights;
    }

    public double getGradient() {
        return gradient;
    }

    public void setGradients(double gradients) {
        this.gradient = gradients;
    }

    public double getBias() {
        return bias;
    }

    public void setBias(double bias) {
        this.bias = bias;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }



}
