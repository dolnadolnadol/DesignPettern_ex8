public class App {
    public static void main(String[] args) {
        ImageManager manager = new ImageManager();
		manager.setStrategy(new SmartphoneRenderer());
		manager.show();
    }
}
