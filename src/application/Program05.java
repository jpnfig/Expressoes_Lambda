package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import entities.Product;

public class Program05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

// 		versão 4:
		double factor = 1.1;
		
//		Consumer<Product> cons = p -> {
//			p.setPrice(p.getPrice() * factor);
//		};
		
//		list.forEach(cons);
		
//		versão 5:
		list.forEach(p -> p.setPrice(p.getPrice() * factor));
		
//		versão 1:
//		list.forEach(new PriceUpdate());
		
//		versão 2:		
//		list.forEach(Product::staticPriceUpdate);
		
//		versão 3:		
//		list.forEach(Product::nonStaticPriceUpdate);
		
		list.forEach(System.out::println);

	}
}
