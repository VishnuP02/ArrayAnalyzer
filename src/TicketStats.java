import java.util.Arrays;

public class TicketStats {
    // Entry point for the ticket statistics analysis feature
    public static void run() {
        // Array of ticket prices (cheapest tickets for various tours)
        double[] prices = {54, 159, 35, 57, 52, 49, 59, 33, 48, 33, 40, 14, 58, 37, 47, 33, 29, 25, 25};

        // Calculate and print the average price
        System.out.println("Average: " + calculateAverage(prices));

        // Find and print the maximum price
        System.out.println("Maximum: " + findMax(prices));

        // Find and print the minimum price
        System.out.println("Minimum: " + findMin(prices));

        // Calculate and print the median price
        System.out.println("Median: " + findMedian(prices));
    }

    // Method to calculate the average of an array
    public static double calculateAverage(double[] array) {
        double sum = 0;
        // Sum all elements in the array
        for (double value : array) {
            sum += value;
        }
        // Return the average
        return sum / array.length;
    }

    // Method to find the maximum value in an array
    public static double findMax(double[] array) {
        // Use Java Streams to find the maximum value
        return Arrays.stream(array).max().orElse(Double.NaN);
    }

    // Method to find the minimum value in an array
    public static double findMin(double[] array) {
        // Use Java Streams to find the minimum value
        return Arrays.stream(array).min().orElse(Double.NaN);
    }

    // Method to calculate the median value of an array
    public static double findMedian(double[] array) {
        // Sort the array to prepare for median calculation
        Arrays.sort(array);
        int middle = array.length / 2;

        // If the array length is even, average the two middle elements
        if (array.length % 2 == 0) {
            return (array[middle - 1] + array[middle]) / 2.0;
        } else {
            // If the array length is odd, return the middle element
            return array[middle];
        }
    }
}