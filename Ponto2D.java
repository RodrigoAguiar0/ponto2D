
public class Ponto2D {
	
	private double x, y;
	
	public Ponto2D(){
		this.x = 0;
		this.y = 0;
	}
	
	public Ponto2D(double abcissa, double ordenada){
		this.x = abcissa;
		this.y = ordenada;
	}
	
	public Ponto2D(Ponto2D ponto){
		this.x = ponto.getX();
		this.y = ponto.getY();
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public void movimentar(){
		this.setX(0);
		this.setY(0);
	}
	
	public void movimentar(double abcissa, double ordenada){
		this.setX(abcissa);
		this.setY(ordenada);
	}
	
	public void movimentar(Ponto2D ponto){
		this.setX(ponto.getX());
		this.setY(ponto.getY());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ponto2D other = (Ponto2D) obj;
		if (this.getX() != other.getX())
			return false;
		if (this.getY() != other.getY())
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ponto2D [x=" + x + ", y=" + y + "]";
	}
	
	public void calcularDistancia(Ponto2D ponto){
		Double difX, difY;
		difX = Math.abs(this.getX() - ponto.getX());
		difY = Math.abs(this.getY() - ponto.getY());
		if (this.getX() == ponto.getX()){
			System.out.println("A distância entre o ponto emissor e o outro ponto é de " + difY);
		} else if (this.getY() == ponto.getY()){
			System.out.println("A distância entre o ponto emissor e o outro ponto é de " + difX);
		} else {
			System.out.println("A distância entre o ponto emissor e o outro ponto é de " + Math.sqrt(difX*difX + difY*difY));
		}
	}
	
	public void criarPonto(Ponto2D ponto){
		Ponto2D novoPonto = new Ponto2D(ponto.getX(), ponto.getY());
	}
}
