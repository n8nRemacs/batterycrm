package Oa1;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.P0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class i0 {
    public static h0 a(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject(str2);
        String string = jSONObject.getString("name");
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            arrayList.add(new kotlin.Q(next, jSONObject2.get(next).toString()));
        }
        return new h0(str, string, P0.p(arrayList));
    }
}
