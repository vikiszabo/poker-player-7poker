package org.leanpoker.player;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Player {

    static final String VERSION = "0.17";
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
            String color1 = firstCard.get("suit").toString();
            String color2 = secondCard.get("suit").toString();
            JSONArray community = json.getJSONArray("community_cards");
            if (rank1.matches("[10JQKA]") && rank1.equals(rank2)) return 1000;
            if (rank1.equals(rank2)) return 200;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 4;
    }

    public static void showdown(JsonElement game) {
    }
}
