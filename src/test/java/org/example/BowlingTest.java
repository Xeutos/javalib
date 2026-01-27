package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BowlingTest {

    @Test
    void gutterGameGiveScoreZero() {
        Bowling bowlingGame = new Bowling();

        for (int i = 0; i < 20 ; i++) {
            bowlingGame.roll(0);
        }

        assertThat(bowlingGame.score()).isEqualTo(0);
    }

    @Test
    void allOnesGivesScoreTwenty() {
        Bowling bowlingGame = new Bowling();

        for (int i = 0; i < 20; i++) {
            bowlingGame.roll(1);
        }

        assertThat(bowlingGame.score()).isEqualTo(20);
    }

    @Test
    void oneSpareGivesScoreTwentyNine(){
        Bowling bowlingGame = new Bowling();
        bowlingGame.roll(5);
        bowlingGame.roll(5);
        for (int i = 0; i < 18; i++) {
            bowlingGame.roll(1);
        }

        assertThat(bowlingGame.score()).isEqualTo(29);
    }

}
