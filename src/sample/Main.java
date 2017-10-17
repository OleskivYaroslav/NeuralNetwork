package sample;


public class Main{

    public static void main(String[] args) {

    }

    private double [] enters;
    private double [] neural;
    private double [][][] weightOfConnections;
    private Layer[] layers;

    public Main(int countOfEnters, int countOfNeural, int countOfLayers){
        this.enters = new double[countOfEnters];
        this.neural = new double[countOfNeural];

        this.layers = new Layer[countOfLayers];
        this.weightOfConnections = new double[layers.length][neural.length][neural.length];

    }

    public Main(double[] enters, double[] neural, double[][][] weight, Layer[] layers){
        this.enters = enters;
        this.neural = neural;
        this.weightOfConnections = weight;
        this.layers = layers;

    }

    public class Layer{

        private double zsuw;
        private double[] neural;
        private double ActivationFunction(){
            return 0;
        }



        public Layer(){

        }

        public Layer(double[] neural, double zsuw){

            this.neural = neural;;
            this.zsuw= zsuw;

        }
        public Layer(int countOfNeural){

            this.neural = new double[countOfNeural];

        }

        public double[] getNeural() {
            return neural;
        }

        public void setNeural(double[] neural) {
            this.neural = neural;
        }
    }




    public double[] getEnters() {
        return enters;
    }

    public void setEnters(double[] enters) {
        this.enters = enters;
    }

    public double[] getNeural() {
        return neural;
    }

    public void setNeural(double[] neural) {
        this.neural = neural;
    }

    public double[][][] getWeightOfConnections() {
        return weightOfConnections;
    }

    public void setWeightOfConnections(double[][][] weightOfConnections) {
        this.weightOfConnections = weightOfConnections;
    }

    public Layer[] getLayers() {
        return layers;
    }

    public void setLayers(Layer[] layers) {
        this.layers = layers;
    }
}
