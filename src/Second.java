public class Second extends First {
    private String word;
    private Words words;



    public Second(int number, Words words, String word) {
        super(number);
        this.words = words;
        this.word = word;
    }

      public  void print(int number, Words words, String word) {
          System.out.println("It is Second method");
    }

      public  void print(int number, String word) {
          System.out.println("It is Second method");
    }

     public final  void print( Words words, String word ) {
         System.out.println("It is Second method");

    }

        public String getWord() {
            return word;
        }

        public Words getWords() {
            return words;
        }
}
