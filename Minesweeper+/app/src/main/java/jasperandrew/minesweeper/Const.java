package jasperandrew.minesweeper;

import android.graphics.Typeface;

class Const {
    static final int MAX_FPS = 30;

    static int SCREEN_WIDTH;
    static int SCREEN_HEIGHT;

    static int BLOCK_WIDTH;
    static int NUM_COLUMNS;
    static int NUM_ROWS;

    static Typeface FONT;

    enum State {
        BLOCK, FLAG, NUM
    }

    enum GameState {
        READY, RUNNING, OVER
    }

    static GameState gameState = GameState.READY;
}

/*
Theme members:
    - background color
    - number images
    - block_images
    - font color
    - font
 */