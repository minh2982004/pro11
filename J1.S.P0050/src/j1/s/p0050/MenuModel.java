package j1.s.p0050;



public class MenuModel {
    private String[] menuItems = {
        "Calculate Superlative Equation",
        "Calculate Quadratic Equation",
        "Exit"
    };

    private int selectedMenuItem;

    public String[] getMenuItems() {
        return menuItems;
    }

    public void setSelectedMenuItem(int selectedMenuItem) {
        this.selectedMenuItem = selectedMenuItem;
    }

    public int getSelectedMenuItem() {
        return selectedMenuItem;
    }
}
