package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class k29 {
    public static JSONObject a(Set set, ti1 ti1Var, fje fjeVar) throws JSONException {
        String str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("participantId", ti1Var != null ? ti1Var.b() : null);
        JSONArray jSONArray = new JSONArray();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int i = j29.$EnumSwitchMapping$0[((g29) it.next()).ordinal()];
            if (i == 1) {
                str = "AUDIO";
            } else if (i == 2) {
                str = "VIDEO";
            } else if (i == 3) {
                str = "SCREEN_SHARING";
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "MOVIE_SHARING";
            }
            jSONArray.put(str);
        }
        jSONObject.put("requestedMedia", jSONArray);
        jSONObject.put("command", "mute-participant");
        if (fjeVar instanceof eje) {
            jSONObject.put("roomId", ((eje) fjeVar).a);
        }
        return jSONObject;
    }

    public static JSONObject b(Map map, ti1 ti1Var, fje fjeVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("participantId", ti1Var != null ? ti1Var.b() : null);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("AUDIO", paj.A((h29) map.get(g29.a)));
        jSONObject2.put("VIDEO", paj.A((h29) map.get(g29.b)));
        jSONObject2.put("SCREEN_SHARING", paj.A((h29) map.get(g29.c)));
        jSONObject2.put("MOVIE_SHARING", paj.A((h29) map.get(g29.d)));
        jSONObject.put("muteStates", jSONObject2);
        jSONObject.put("command", "mute-participant");
        if (fjeVar instanceof eje) {
            jSONObject.put("roomId", ((eje) fjeVar).a);
        }
        return jSONObject;
    }
}
