package container;

import function.Function;
import util.Activation;
import util.GenRandom;

public class Layer {
    private Neuron[] neurons;
    private Function function;

    public Layer(int inNeurons, int nNeurons, Function function){
        this.function = function;
        this.neurons = new Neuron[nNeurons];
        for(int i = 0;i < nNeurons;i++){
            double[] weights = new double[inNeurons];
            double bias = GenRandom.randomDouble(0,1);
            for(int j = 0;j < inNeurons;j++){
                weights[j] = GenRandom.randomDouble(Neuron.getMinWeightValue(), Neuron.getMaxWeightValue());
            }
            this.neurons[i] = new Neuron(weights, bias);
        }
    }

    public Layer(double[] input){
        this.neurons = new Neuron[input.length];
        for(int i = 0;i < input.length;i++){
            this.neurons[i] = new Neuron(input[i]);
        }
        this.function = null;
    }

    public double applyActivation(double x){
        if(this.function != Function.SIGMOID && this.function != Function.TANH && this.function != Function.RELU){
            throw new IllegalArgumentException("Unknown activation function: " + this.function);
        } else {
            switch (this.function) {
                case SIGMOID:
                    return Activation.sigmoid(x);
                case TANH:
                    return Activation.tanh(x);
                case RELU:
                    return Activation.relu(x);
                default:
                    throw new IllegalArgumentException("Unknown activation function: " + this.function);
            }
        }
    }

    public double applyActivationDerivative(double x){
        if(this.function != Function.SIGMOID && this.function != Function.TANH && this.function != Function.RELU){
            throw new IllegalArgumentException("Unknown activation function: " + this.function);
        } else {
            switch (this.function) {
                case SIGMOID:
                    return Activation.sigmoidDerivative(x);
                case TANH:
                    return Activation.tanhDerivative(x);
                case RELU:
                    return Activation.reluDerivative(x);
                default:
                    throw new IllegalArgumentException("Unknown activation function: " + this.function);
            }
        }
    }

    public Neuron[] getNeurons() {
        return neurons;
    }

    public void setNeurons(Neuron[] neurons) {
        this.neurons = neurons;
    }

    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }


}
