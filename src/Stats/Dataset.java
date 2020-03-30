package Stats;


public class Dataset {

    double[] values;
    double mean;
    double sampleStdDev;
    int size;

    public Dataset(double[] values) {
        this.values = values;
        size = values.length;

        //mean
        double total = 0;
        for (double a : values)
            total += a;
        mean = total / values.length;

        //sample standard dev
        double sqDevSum = 0;
        for (double a: values)
            sqDevSum += (a - mean) * (a - mean);
        sampleStdDev = Math.sqrt(sqDevSum / (values.length - 1));

        System.out.println(mean);
        System.out.println(sampleStdDev);

    }

    public double getMean() {
        return mean;
    }

    public double getSampleStdDev() {
        return sampleStdDev;
    }

    public int getSize() {
        return size;
    }
}
