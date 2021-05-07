import java.util.ArrayList;

public class StringAdd {

    private String str;

    public StringAdd(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }


    public static final int add(final String numbers) {

        String delimeters = numbers.charAt(2)+"|\n";

       /* int sum = 0;
      //  if (numbersArray.length > 2) {
      //      throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
       // } else {
            for (String number : numbersArray) {
                if (!number.trim().isEmpty() ) {
                    sum +=Integer.parseInt(number);
                }
            }
        //}
        return sum;*/
        if(numbers.charAt(0) != '/')
            return add(numbers,",|\n");
        return add(numbers.substring(4),delimeters);
    }

    private static int add(final String numbers, final String separator) {
        int sum = 0;
        ArrayList<Integer> neagativeList = new ArrayList<Integer>();
        String[] numbersArray = numbers.split(separator);
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                sum += Integer.parseInt(number.trim());
                if(Integer.parseInt(number.trim()) < 0) {
                    neagativeList.add(Integer.parseInt(number.trim()));
                }
            }
        }
        if(neagativeList.size()>0) {
            System.out.println(neagativeList.toString());
            throw new RuntimeException("Negative Numbers exists " + neagativeList.toString());
        }
        return sum;
    }

}