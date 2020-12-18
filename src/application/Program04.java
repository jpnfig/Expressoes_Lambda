package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;
import util.ProductPredicate;

public class Program04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		double min = 100.0;
		
//      versão 4:		
		Predicate<Product> pred = p -> p.getPrice() >= min;
		
		list.removeIf(pred);
		
//      versão 5:		
		list.removeIf(p -> p.getPrice() >= min);

//      versão 1:
		list.removeIf(new ProductPredicate());
		
//      versão 2:		
		list.removeIf(Product::staticProductPredicate);
		
//      versão 3:		
		list.removeIf(Product::nonStaticProductPredicate);
		
		for (Product p : list) {
			System.out.println(p);
		}

	}
}
