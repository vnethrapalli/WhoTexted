package Stats;


public class Dataset {

    double[] values;
    double mean;
    double sampleStdDev;

    public Dataset(double[] values) {
        this.values = values;

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
}
