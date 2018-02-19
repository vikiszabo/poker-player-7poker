package org.leanpoker.player;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Player {

    static final String VERSION = "TryCatch8";
    private static final Logger logger = LoggerFactory.getLogger(Player.class);

    public static int betRequest(JsonElement request) {
        try {
            JsonObject gson = request.getAsJsonObject();
            JSONObject json = new JSONObject(gson.toString());
            JSONArray players = json.getJSONArray("players");
            JSONObject cards = players.getJSONObject(3);
            JSONArray cards2 = cards.getJSONArray("hole_cards");
            JSONObject firstCard = cards2.getJSONObject(0);
            JSONObject secondCard = cards2.getJSONObject(1);
            String rank1 = firstCard.get("rank").toString();
            String rank2 = secondCard.get("rank").toString();
            if (rank1.equals("A") || rank2.equals("A") || rank1.equals(rank2)) return 500;
            logger.error("{}, {}", rank1, rank2);
            logger.error("{}", json.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static void showdown(JsonElement game) {
    }
}
