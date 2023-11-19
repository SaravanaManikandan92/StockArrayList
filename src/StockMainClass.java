public class StockMainClass {

    public static void main(String[] args )
    {

        StockArrayList stockArrayList = new StockArrayList();
        stockArrayList.add(1);
        stockArrayList.add(2);
        stockArrayList.add(3);
        stockArrayList.add(4);
        stockArrayList.add(45);
        stockArrayList.add(-1);
        stockArrayList.add(-2);
        stockArrayList.add(-3);
        stockArrayList.add(-4);
        stockArrayList.add(-45);
        System.out.println(stockArrayList);
        System.out.println(stockArrayList.get(8));
       //get functions




    }
}
