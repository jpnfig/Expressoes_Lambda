package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program01 {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

//		versão 2:
//		Comparator<Product> comp = new Comparator<Product>() {
//			@Override
//			public int compare(Product p1, Product p2) {
//				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//			}			
//		};
		
//		versão 3:			
//		Comparator<Product> comp = (p1, p2) -> {
//			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//		};
		
//		versão 4:		
//		Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
//		Collections.sort(list);

//		versão 1:		
//		list.sort(new MyComparator());
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		for (Product p : list) {
			System.out.println(p);
		}

	}
}
