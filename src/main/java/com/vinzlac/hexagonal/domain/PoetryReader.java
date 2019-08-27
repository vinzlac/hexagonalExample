package com.vinzlac.hexagonal.domain;

public class PoetryReader implements IRequestVerses {
	final private IObtainPoems poetryLibrary;

	public PoetryReader() {
		poetryLibrary = null;
	}

	public PoetryReader(IObtainPoems poetryLibrary) {
		this.poetryLibrary = poetryLibrary;
	}

	@Override
	public String GiveMeSomePoetry() {
		if (poetryLibrary==null) return "If you could read a leaf or tree\\r\\nyou’d have no need of books.\\r\\n-- © Alistair Cockburn (1987)";

		return poetryLibrary.GetAPoem();
	}
}

