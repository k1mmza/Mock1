package container;

public class NeuronDemo {
    private Neuron n;

    public void demonstrate(){
        double[] weights = {0.2,0.3,0.4};
        double bias = 0.2;
        n = new Neuron(weights, bias);
        Neuron.setMinWeightValue(0.1);
        Neuron.setMaxWeightValue(0.7);
        n.setGradients(0.6);
        n.setValue(1);
    }

    public Neuron getN() {
        return n;
    }

    public void setN(Neuron n) {
        this.n = n;
    }

}
