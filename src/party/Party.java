package party;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Party {

    public static void main(String[] args) {
        String[] his = {"Zack", "Arvid", "Wilhem", "Anna", "Adam", "Albert", "August", "Doris"};
        String[] hers = {"Stefan", "Sara", "Sune", "Hugo", "Lotta", "Anna", "Adam", "Albert", "Annton"};
        String[] Zacks = {"Hugo", "Albert", "Arvid", "Anna"};

        ArrayList<String> hisFriends = new ArrayList<>(Arrays.asList(his));
        ArrayList<String> herFriends = new ArrayList<>(Arrays.asList(hers));
        ArrayList<String> ZacksFriends = new ArrayList<>(Arrays.asList(Zacks));

        HashSet<String> invited = new HashSet<>(hisFriends);
        invited.addAll(herFriends);
        for (String s : invited) {
            System.out.print(s);

        }
        System.out.println(" ");
        invited.remove("Zack");
        for (String s1 : invited) {
            System.out.print(s1);
        }
        System.out.println(" ");
        invited.removeAll(ZacksFriends);
        for (String s2 : invited) {
            System.out.print(s2);
        }
        System.out.println(" ");
        if (invited.contains("Doris") && invited.contains("Wilhem")) {
            invited.remove("Wilhem");
            for (String s3 : invited) {
                System.out.print(s3);

            }

        }
        System.out.println(" ");
        Iterator<String> itr = invited.iterator();
        while (itr.hasNext()) {
            String s = itr.next();
            if (s.startsWith("A")) {
                itr.remove();
                for (String s4 : invited) {
                    System.out.print(s4);
                }
                System.out.println(" ");

            }
        }

        ArrayList<String>invitedList= new ArrayList<>(invited);
        Collections.shuffle(invitedList);
        for (String s5 : invitedList) {
            System.out.print(s5);

        }
        System.out.println(" ");


    }
}
