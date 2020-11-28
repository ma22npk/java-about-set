# java-about-set
# 【Set】 重複要素のないコレクション


## Setとは

Setは、Listのと同様に 「**データをまとめたもの**」になります。
ですが、双方にはこのような違いがあります。

- Mapのようなキーと値の関連付けをしない
- インデックスが存在しない
- 同じ値のものは2つ以上持てない

SQL にある [「DISTINCT」や、「ORDER BY」 ](https://qiita.com/takahirocook/items/89aba8585dcd42dd310f)のようなイメージだと思います。

### Setの使い所
以上に書いた「 **同じ値のものは2つ以上持てない** 」などの特性をいかし、このような使い所が考えられます。

- 商品を安い順に並べる
- 会社の部署はいくつあるのか調べる
- ポケモンのタイプは何種類あるか調べる
- この学校の生徒はどこの出身者がいるかみる。

といったとき Set が役立つのではないかと思います。

## Setの種類
Setインタフェースを実装するものには、`HashSetクラス`, `TreeSetクラス`, `LinkedHashSetクラス` などがあります。
それぞれの配列の並べ方は以下にです。


| クラス        | 概要       | 要素の並び ( 1 ~ 5 の値が格納されている場合) | 
| ------------- | ---------- | -------------------------------------------- | 
| HashSet       | ランダム   | 2, 4, 3, 5, 1                                | 
| TreeSet       | 昇順       | 1, 2, 3, 4, 5                                | 
| LinkedHashSet | 追加した順 | 1, 3, 4, 5, 2                                | 


## Setの定義

### Set の基本の型
Setも *List*、*Map* 等と同様の書き方ができます。
基本的な書き方は以下です。

```
セットインターフェース名<型> インスタンス名 = new コンストラクタ名<型>();
```

HashSet、TreeSet、LinkedHashSet はそれぞれ次のように定義します。

### HashSet の定義
※Setの代わりに左辺を同じHashSetにしてもOK

```java
Set<String> hashSet = new HashSet<String>();
```
### TreeSet の定義
※Setの代わりに、左辺を同じTreeSetにしてOK

```java
Set<String> treeSet = new TreeSet<String>();
```
### LinkedHashSet の定義
※Set の代わりに、左辺を同じLinkedHashSet にしてもOK

## Setサンプルコード
以下のコードは、各種setを用いて出力結果を比べたものです。

```java
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

        System.out.println("HashSetはランダムで表示"する");
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
```

出力結果

```
HashSetはランダムで表示
人参
大根
すいか
かぼちゃ
ブロッコリー
TreeSet は昇降順に表示する
もも
りんご
ミカン
梨
LinkedHashSet は追加した順に表示する
カツオ
カンパチ
鯵
ブリ
set には同じ値が入らないので重複分は出力されない
牛
羊
豚
鹿
```

これらをうまく利用することで、システムのいろいろな表現ができそうです。
実際に手を動かしながら覚えていきたいと思います。


## 参考文献・記事

- [Progate]
- [ドットインストール]
- [フレームワーク (framework)
](https://wa3.i-3-i.info/word12470.html)
- [【Java入門】ArrayListの使い方！配列との違いも解説
](https://style.potepan.com/articles/14984.html)


[Progate]:https://prog-8.com/
[ドットインストール]:https://dotinstall.com/







[インスタンス]:https://qiita.com/takahirocook/items/ec01cdcbb440cf0d1cc4
[インスタンス化]:https://qiita.com/takahirocook/items/ec01cdcbb440cf0d1cc4
[アクセス修飾子]:https://qiita.com/takahirocook/items/e51b0b9d37d95ad587fe
[フィールド]:https://qiita.com/takahirocook/items/28df75a133049a74ece1
[フィールド変数]:https://qiita.com/takahirocook/items/28df75a133049a74ece1
[new演算子]:https://qiita.com/takahirocook/items/00f9f97592bf50831d39
[カプセル化]:https://qiita.com/takahirocook/items/e469a7c0539a0012868e
[クラス]:https://qiita.com/takahirocook/items/50cbbdca8e21539170e9
[メソッド]:https://qiita.com/takahirocook/items/5bfe43576d87a2a4006c
[mainメソッド]:https://qiita.com/takahirocook/items/f4635915337303de338c
[メソッドの呼び出し]:https://qiita.com/takahirocook/items/f4635915337303de338c
[コンストラクタ]:https://qiita.com/takahirocook/items/fa1822f2f22c3786593e
[引数]:https://qiita.com/takahirocook/items/5e5b0ba79e869f4a592e
[戻り値]:https://qiita.com/takahirocook/items/3b6fa670a1d6dd4a9386
[this]:https://qiita.com/takahirocook/items/d251ec4693c68f6b9538
[getter・setter]:https://qiita.com/takahirocook/items/27828bc8477735612021
[setter]:https://qiita.com/takahirocook/items/27828bc8477735612021
[getter]:https://qiita.com/takahirocook/items/27828bc8477735612021
[オブジェクト指向]:https://qiita.com/takahirocook/items/041ba7a096b71ab8ffd4
[継承]:https://qiita.com/takahirocook/items/6c84ea66a6e2ad536a37
[オーバーライド]:https://qiita.com/takahirocook/items/09dd8e5f56d6617ce45a
[オーバーロード]:https://qiita.com/takahirocook/items/b937c3c07126fe7e02a4
[this]:https://qiita.com/takahirocook/items/d251ec4693c68f6b9538
[super]:https://qiita.com/takahirocook/items/75a07131e7e791c8442c
[スーパークラス]:https://qiita.com/takahirocook/items/75a07131e7e791c8442c
[final]:https://qiita.com/takahirocook/items/5e0916d9bf28bcf68d0c
[final修飾子]:https://qiita.com/takahirocook/items/5e0916d9bf28bcf68d0c
[定数]:https://qiita.com/takahirocook/items/5e0916d9bf28bcf68d0c
[static修飾子]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[static]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[インスタンスフィールド]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[インスタンス変数]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[動的メソッド]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[インスタンス変数]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[静的メソッド]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[クラスメソッド]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[静的メソッド]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[クラスフィールド]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[クラス変数]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[静的変数]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[インターフェイス]:https://qiita.com/takahirocook/items/ca84be8dfef664b19194
[インターフェース]:https://qiita.com/takahirocook/items/ca84be8dfef664b19194
[パッケージ]:https://qiita.com/takahirocook/items/39b58d17abcb159ef5c1
[インポート]:https://qiita.com/takahirocook/items/59a8a09cab6a98d3bca2
[import]:https://qiita.com/takahirocook/items/59a8a09cab6a98d3bca2
[配列]:https://qiita.com/takahirocook/items/16a123fb73b30869053b
[配列操作]:https://qiita.com/takahirocook/items/16a123fb73b30869053b




