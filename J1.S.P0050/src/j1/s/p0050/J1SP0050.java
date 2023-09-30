package j1.s.p0050;

public class J1SP0050 {

    public static void main(String[] args) {
        MenuModel model = new MenuModel();
        MenuView view = new MenuView(model);
        Manager manager = new Manager(model, view);
        manager.startMenu();
}
}   
