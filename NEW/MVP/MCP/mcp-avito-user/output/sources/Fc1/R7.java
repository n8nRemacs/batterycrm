package Fc1;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class R7 {
    @Y61.k
    public static final ArrayList a(@Y61.k String str, @Y61.k JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i12 = 0; i12 < length; i12++) {
                arrayList.add(jSONArrayOptJSONArray.getString(i12));
            }
        }
        return arrayList;
    }

    @Y61.l
    public static final String b(@Y61.k JSONObject jSONObject, @Y61.k String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.getString(str);
    }
}
