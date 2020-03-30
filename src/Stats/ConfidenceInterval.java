package Stats;


public class ConfidenceInterval {

    private double center;
    private double marginError;
    private double[] tVals = {2.262, 2.228, 2.201, 2.179, 2.160, 2.145}; //t* for df = 9 to 14


    public double ConfidenceInterval(double statistic, double stdDev, int sampleSize) {
        center = statistic;



    }
}
