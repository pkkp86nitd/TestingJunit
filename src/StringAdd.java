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
        String[] numbersArray = numbers.split(",");
        int sum = 0;
      //  if (numbersArray.length > 2) {
      //      throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
       // } else {
            for (String number : numbersArray) {
                if (!number.trim().isEmpty() ) {
                    sum +=Integer.parseInt(number);
                }
            }
        //}
        return sum;
    }

}