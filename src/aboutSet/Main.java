package aboutSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        HashSet<String> vegetableSet = new HashSet<String>();

        //適当に値を入れていく
        vegetableSet.add("大根");
        vegetableSet.add("人参");
        vegetableSet.add("ブロッコリー");
        vegetableSet.add("すいか");
        vegetableSet.add("かぼちゃ");

        System.out.println("HashSetはランダムで表示");
        //拡張for文 で変数vs を vegetableSet から一つづつ取り出す
        for (String vs : vegetableSet) {
            System.out.println(vs);
        }

        TreeSet<String> fruitsSet = new TreeSet<String>();

        //適当に値を入れていく
        fruitsSet.add("もも");
        fruitsSet.add("ミカン");
        fruitsSet.add("りんご");
        fruitsSet.add("梨");
        System.out.println("TreeSet は昇降順に表示する");

        for (String fs : fruitsSet) {
            System.out.println(fs);
        }

        LinkedHashSet<String> fishSet = new LinkedHashSet<String>();

        fishSet.add("カツオ");
        fishSet.add("カンパチ");
        fishSet.add("鯵");
        fishSet.add("ブリ");
        System.out.println("LinkedHashSet は追加した順に表示する");

        for (String fs : fishSet) {
            System.out.println(fs);

        }

        TreeSet<String> meetSet = new TreeSet<String>();

        //適当に値を入れていく
        meetSet.add("牛");
        meetSet.add("豚");
        meetSet.add("鹿");
        meetSet.add("豚");
        meetSet.add("牛");
        meetSet.add("牛");
        meetSet.add("牛");
        meetSet.add("牛");
        meetSet.add("豚");
        meetSet.add("豚");
        meetSet.add("羊");
        meetSet.add("豚");
        meetSet.add("鹿");
        meetSet.add("羊");
        meetSet.add("羊");
        meetSet.add("豚");
        meetSet.add("羊");
        meetSet.add("豚");
        meetSet.add("鹿");
        meetSet.add("羊");

        System.out.println("set には同じ値が入らないので重複分は出力されない");

        for (String ms : meetSet) {
            System.out.println(ms);
        }
    }
}