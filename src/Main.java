//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dado d = new Dado(50);
        d.rolar();
        d.setValorFace(55);

        Dado d2 = new Dado(6);
        d2.rolar();
        d2.setValorFace(8);
        }
}