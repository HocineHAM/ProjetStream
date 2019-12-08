package com.hocine.stream;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> liste = new ArrayList<String>();
		liste.add("FAbien");
		liste.add("Hocine");

//		Stream s = liste.stream();
//		
//		s.forEach(System.out::println);

		Stream.of("Fabien", "Hocine").forEach(System.out::println);
		Stream.Builder b = Stream.builder();
		b.accept("Fabien");
		b.accept("Hocine");
		b.build().forEach(System.out::println);
		
		DoubleStream.Builder bd = DoubleStream.builder();
		
		bd.accept(3.4);
		bd.accept(4.5);
		
		bd.build().forEach(System.out::println);
		
		List<Facture> factures = new ArrayList<Facture>();
		
		factures.add(new Facture("2019-02-19", 123.23, "Hocine"));
		factures.add(new Facture("2019-02-03", 224.11, "Bassel"));
		factures.add(new Facture("2019-08-05", 11473.43, "Yazid"));
		factures.add(new Facture("2019-10-12", 786.55, "Xavien"));
		factures.add(new Facture("2019-12-05", 543.13, "Mathias"));
		
		factures.stream().forEach(s -> System.out.println(s));
		factures.stream().filter(f-> f.getTotal()<600).forEach(System.out::println);
		factures.stream().map(f->f.getTotal()).filter(d -> d<10000).forEach(System.out::println);
		Optional<Double> resultat = factures.stream().map(f->f.getTotal()).filter(d -> d<10000).reduce(Double :: sum);
		System.out.println("Total : " + resultat.get());
	}

}
