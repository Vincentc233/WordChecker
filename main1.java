import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        // WordChecker w = new WordChecker();
        ArrayList<String> words = new ArrayList<String>();
        words.add("an");
        words.add("band");
        words.add("band");
        words.add("abandon");
        // System.out.print(words);
        //WordChecker x = new WordChecker(words);
        // System.out.println(x.isWordChain());
        ArrayList<String> words2 = new ArrayList<String>();
        words2.add("to");
        words2.add("too");
        words2.add("stool");
        words2.add("tools");
        WordChecker y = new WordChecker(words2);
        System.out.println(y.isWordChain());
        ArrayList<String> test1 = new ArrayList<String>();
        test1.add("catch");
        test1.add("bobcat");
        test1.add("catchacat");
        test1.add("cat");
        test1.add("at");
        WordChecker x = new WordChecker(test1);
        System.out.println(x.createList("cat"));
        System.out.println(x.createList("catch"));
        System.out.println(x.createList("dog"));
    }

}
