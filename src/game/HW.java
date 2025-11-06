package game;

public class HW {
    
    public static String replaceOne(String text, int i, int n, String sub){
        //   "Hi my name is Josh Roberts."
        //                  ^[14]
        // replaceOne(text, 14, 4, "Andrew");
        String before = text.substring(0, i);

        String after =  text.substring(i + n);

        return before + sub + after;
    }

    public static String replaceAll(String text, String what, String sub){
        // save the original
        savedText.add(text);
        while(text.indexOf(what) != -1) {
            int i = text.indexOf(what);
            int n = what.length();
            text = replaceOne(text, i, n, sub);
        }
        return text;
    }

    // part C hint
    // to get the last item in an ArrayList, savedText.remove(savedText.size()-1);
}
