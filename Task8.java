public class Task8{

    public static int CmS(int... numbers) {
        int totalSum = 0;

        for (int num : numbers) {
       
            int CSum = 0;
            if (num > 0) {
                for (int i = 1; i <= num; i++) {
                    CSum += i;
                }
            } else {
               
                for (int i = 1; i >= num; i--) {
                    CSum += i;
                }
            }

            System.out.println("Cumulative sum for " + num + " = " + CSum);
            
            
            totalSum += CSum;
        }

        return totalSum;
    }

    public static void main(String[] args) {
       
        System.out.println("===== Processing Parameters: (4, 5, 10) =====");
        int total = CmS(4, 5, 10);
        System.out.println("Total Sum: " + total);
    }
}
