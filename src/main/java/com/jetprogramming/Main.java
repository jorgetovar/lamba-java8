package com.jetprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Camisa> camisaList = new ArrayList<>();
		camisaList.add(new Camisa("ROJA", "XL"));
		camisaList.add(new Camisa("VERDE", "L"));
		camisaList.add(new Camisa("VERDE", "M"));
		camisaList.forEach(u -> System.out.println(u));
		System.out.println(filter(camisaList, new CamisaRoja()));
		System.out.println(camisaList.stream().filter(u -> u.getColor().equals("ROJA")).collect(Collectors.toList()));
		System.out.println(filter(camisaList, (Camisa c) -> c.getTalla().equals("L")));
	}

	public static List<Camisa> filter(List<Camisa> camisaList, CamisaPredicate predicate) {
		List<Camisa> sub = new ArrayList<>();
		for (Camisa camisa : camisaList) {
			if (predicate.test(camisa)) {
				sub.add(camisa);
			}
		}
		return sub;
	}

	public static List<Camisa> filtrar(List<Camisa> camisaList, Predicate<Camisa> predicate) {
		List<Camisa> sub = new ArrayList<>();
		for (Camisa camisa : camisaList) {
			if (predicate.test(camisa)) {
				sub.add(camisa);
			}
		}
		return sub;
	}
}
