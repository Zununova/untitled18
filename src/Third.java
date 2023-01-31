public final class Third extends Second{

    private String Text;

    @Override
    public void print(int number, Words words, String word) {
        super.print(number, words, word);
        System.out.println("Third Override Second");
    }

    public Third(int number, Words words, String Text, String word) {
        super(number, words, word);
        this.Text = Text;
    }

    public String getText() {
        return Text;
    }
}
