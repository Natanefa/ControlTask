public class JadenCase {

/*
Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013).
Jaden is also known for some of his philosophy that he delivers via Twitter.
When writing on Twitter, he is known for almost always capitalizing every word.

Your task is to convert strings to how they would be written by Jaden Smith.
The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.

Example:

Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"

Note that the Java version expects a return value of null for an empty string or null.

*/

    public String toJadenCase(String s1) {
//        String s1 = "How can mirrors be real if our eyes aren't real", s2 = "";
        String s2 = "";

        if(s1 == "" || s1 == null) {
            s2 = null;
        }
            else{

            s2 = s2 + s1.substring(0, 1).toUpperCase();
            for (int i = 1; i < s1.length(); i++) {
                if (" ".equals(s1.substring(i - 1, i)))
                    s2 = s2 + s1.substring(i, i + 1).toUpperCase();
                else
                    s2 = s2 + s1.substring(i, i + 1);
            }
            System.out.println(s2);
        }
        return s2;
    }


}