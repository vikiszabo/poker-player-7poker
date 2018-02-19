package org.leanpoker.player;

import com.google.gson.JsonElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Player {

    static final String VERSION = "Default Java folding player";
    private static final Logger logger = LoggerFactory.getLogger(Player.class);

    public static int betRequest(JsonElement request) {
        System.err.printf("%s", request.toString());
        logger.error("{}", request.toString());
        return 1000;
    }

    public static void showdown(JsonElement game) {
    }
}
