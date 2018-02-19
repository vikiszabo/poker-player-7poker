package org.leanpoker.player;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Player {

    static final String VERSION = "TryCatch5";
    private static final Logger logger = LoggerFactory.getLogger(Player.class);

    public static int betRequest(JsonElement request) {
        try {

//            String result = "{\"tournament_id\":\"5a78496392506b0004000003\",\"game_id\":\"5a8aafd0f2411c00040000cc\",\"round\":0,\"players\":[{\"name\":\"Spookers\",\"stack\":1000,\"status\":\"active\",\"bet\":0,\"time_used\":0,\"version\":\"8\",\"id\":0},{\"name\":\"PyChart\",\"stack\":998,\"status\":\"active\",\"bet\":2,\"time_used\":0,\"version\":\"Error check\",\"id\":1},{\"name\":\"Mazsolaaak\",\"stack\":996,\"status\":\"active\",\"bet\":4,\"time_used\":0,\"version\":\"NEM VAGYOK ROBOT 0.8\",\"id\":2},{\"name\":\"7Poker\",\"stack\":1000,\"status\":\"active\",\"bet\":0,\"hole_cards\":[{\"rank\":\"8\",\"suit\":\"clubs\"},{\"rank\":\"J\",\"suit\":\"diamonds\"}],\"time_used\":0,\"version\":\"Default Java folding player\",\"id\":3},{\"name\":\"ScriptEm\",\"stack\":1000,\"status\":\"active\",\"bet\":0,\"time_used\":0,\"version\":\"0.1\",\"id\":4},{\"name\":\"return 0\",\"stack\":1000,\"status\":\"active\",\"bet\":0,\"time_used\":0,\"version\":\"0.1\",\"id\":5}],\"small_blind\":2,\"big_blind\":4,\"orbits\":0,\"dealer\":0,\"community_cards\":[],\"current_buy_in\":4,\"pot\":6,\"in_action\":3,\"minimum_raise\":2,\"bet_index\":2}";
//            JSONObject json = new JSONObject(result);
            JsonObject gson = request.getAsJsonObject();
            JSONObject json = new JSONObject(gson.toString());
            JSONArray players = json.getJSONArray("players");
            JSONObject cards = players.getJSONObject(3);
            JSONArray cards2 = cards.getJSONArray("hole_cards");
            JSONObject firstCard = cards2.getJSONObject(0);
            JSONObject secondCard = cards2.getJSONObject(1);
            String rank1 = firstCard.get("rank").toString();
            String rank2 = secondCard.get("rank").toString();
            logger.error("{}, {}", rank1, rank2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static void showdown(JsonElement game) {
    }
}
