public class Main {
    public static void main(String[] args) {
        SuperHero sh = new SuperHero();
        sh.fly();//SuperHeroに書いた処理
        sh.run();//Heroに書いた処理
        sh.test();
        Hero h = new Hero();
        h.run();
        h.test();
    }
}