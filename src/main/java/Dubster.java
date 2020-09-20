/*

Polycarpus works as a DJ in the best Berland nightclub, and he often uses dubstep music in his performance.
Recently, he has decided to tak<build>
        <pluginManagement>
            <plugins>
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-compiler-plugin</artifactId>
                    <configuration>
                        <source>11</source>
                        <target>11</target>
                    </configuration>
                </plugin>
            </plugins>
        </pluginManagement>
    </build>
e a couple of old songs and make dubstep remixes from them.

Let's assume that a song consists of some number of words. To make the dubstep remix of this song,
Polycarpus inserts a certain number of words "WUB" before the first word of the song (the number may be zero),
after the last word (the number may be zero), and between words (at least one between any pair of neighbouring words),
and then the boy glues together all the words, including "WUB", in one string and plays the song at the club.

For example, a song with words "I AM X" can transform into a dubstep remix as "WUBWUBIWUBAMWUBWUBX"
and cannot transform into "WUBWUBIAMWUBX".

Recently, Jonny has heard Polycarpus's new dubstep track, but since he isn't into modern music,
he decided to find out what was the initial song that Polycarpus remixed. Help Jonny restore the original song.

Input
The input consists of a single non-empty string, consisting only of uppercase English letters, the string's length
doesn't exceed 200 characters

Output
Return the words of the initial song that Polycarpus used to make a dubsteb remix. Separate the words with a space.


*/

public class Dubster {
    public static String songDecoder(String song) {
//        String song = "We are young and lost and so afraid";
//        String songWub = "";
//        String wub = "WUB";
//        int wubs = 3;
//        for (int i = 1; i <= wubs; i++) {
//            songWub = songWub + wub;
//        }
//        for (String word : song.split(" ")) {
//            word = word + wub;
//            System.out.print(word);
//        }
//
//
//
//        System.out.println("");
//        System.out.println("songWub - " + songWub);

        String res = "";
        Boolean isFirst = true;
        String[] wubs = song.split("WUB");
        for (String letter:wubs) {
            if(!letter.equals("")){
                res = res+letter;
                isFirst = true;
            } else if(letter.equals("") && isFirst){
                res = res+" ";
                isFirst = false;
            }

        }

        return res.trim();
//        return song.replace("WUB", " ").trim();

//        return songWub + word + songWub;
    }

}
