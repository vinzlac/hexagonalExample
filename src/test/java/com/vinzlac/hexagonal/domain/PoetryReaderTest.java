package com.vinzlac.hexagonal.domain;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;

class PoetryReaderTest {

	@Test
	void Should_give_verses_when_asked_for_poetry() {
		// GIVEN
		IRequestVerses poetryReader = new PoetryReader();

		// WHEN
		String somePoetry = poetryReader.GiveMeSomePoetry();

		// THEN
		assertThat(somePoetry).isEqualTo("If you could read a leaf or tree\\r\\nyou’d have no need of books.\\r\\n-- © Alistair Cockburn (1987)");
	}

	@Test
	void Should_give_verses_from_a_PoetryLibrary() {
		// GIVEN
		IObtainPoems poetryLibrary = Mockito.mock(IObtainPoems.class);
		Mockito.when(poetryLibrary.GetAPoem()).thenReturn("I want to sleep\\r\\nSwat the flies\\r\\nSoftly, please.\\r\\n\\r\\n-- Masaoka Shiki (1867-1902)");
		IRequestVerses poetryReader = new PoetryReader(poetryLibrary);


		// WHEN
		String somePoetry = poetryReader.GiveMeSomePoetry();

		// THEN
		assertThat(somePoetry).isEqualTo("I want to sleep\\r\\nSwat the flies\\r\\nSoftly, please.\\r\\n\\r\\n-- Masaoka Shiki (1867-1902)");
	}

}