public class ImageManager {
	private Strategy strategy;

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public void show() {
		this.strategy.showImage();
	}
}