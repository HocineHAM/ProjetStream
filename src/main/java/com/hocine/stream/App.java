package com.hocine.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

import com.hocine.streamparalleles.Facture2;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		List<Facture2> factures = new ArrayList<Facture2>();

		factures.add(new Facture2("2019-02-19", 123.23));
		factures.add(new Facture2("2019-02-03", 224.11));
		factures.add(new Facture2("2019-08-05", 11473.43));
		factures.add(new Facture2("2019-10-12", 786.55));
		factures.add(new Facture2("2019-12-05", 543.13));

		factures.stream().filter(f -> f.getTotal() > 100).map(Facture2::getNumero).sequential()
				.forEach(System.out::println);

	}
}
