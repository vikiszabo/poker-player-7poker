package org.leanpoker.player;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Player {

    static final String VERSION = "Default Java folding player";
    private static final Logger logger = LoggerFactory.getLogger(Player.class);

    public static int betRequest(JsonElement request) {
        JsonObject ob = request.getAsJsonObject();
        String arr = ob.get("hole_cards").toString();
//        for (JsonElement jsonelement : arr) {
//            String rank = jsonelement.getAsString();
//            if (rank.indexOf("A") > 0) {
//                return 1000;
//            }
//        }
        logger.error("{}", request.toString());
        logger.error("{}", arr);
        return 1000;
    }

    public static void showdown(JsonElement game) {
    }
}
