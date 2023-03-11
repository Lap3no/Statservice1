import ru.netology.stats.StatService1;

public class Main {

    public static void main(String[] args) {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(service.calculateSum(sales));

        int[] averageSum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(service.calcAverageSum(averageSum));

        long[] salesMin = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(service.minSales(salesMin));

        long[] salesMax = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(service.maxSales(salesMax));

        int[] aboveAverageSale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(service.aboveAverageSum(aboveAverageSale));

        int[] belowAverageSale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(service.belowAverageSum(belowAverageSale));
    }
}
