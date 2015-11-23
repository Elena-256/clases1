package Progra;

public class oop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Descuento des1=new Descuento(0.1,100);
		des1.setTotal_compra(150);

		double total=des1.getTotal();
		System.out.println("Total_compra:"+total);
		System.out.println("Total_compra:"+des1.getTotal());
			
	}

}
