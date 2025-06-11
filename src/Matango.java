public class Matango {
    String name;
    int hp;
    final int level = 10;
    char suffix;

    public void run() {
        System.out.println("お化けキノコ" + this.suffix + "は逃げ出しt！");
    }

    public void attack() {
        System.out.println(this.suffix + "は攻撃した！");
        System.out.println("15のダメージ！");
    }
}
