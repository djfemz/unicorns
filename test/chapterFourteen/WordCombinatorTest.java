package chapterFourteen;

import static org.junit.jupiter.api.Assertions.*;

class WordCombinatorTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.Test
    void generateThreeLetterCharacterCombinationsTest() {
        String word="bathe";
        var combinations = WordCombinator
                .generateThreeLetterCharacterCombinations(word);
        for (String wrd:combinations) {
            assertEquals(3, wrd.length());
            assertTrue(wrd.matches("\\w"));
        }
    }

}