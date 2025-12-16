package com.yandex.metrica.impl.ob;

import android.util.Pair;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.yandex.metrica.impl.ob.C38708bi;
import com.yandex.metrica.impl.ob.Tl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class Pi {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, C38708bi.a> f379217a = Collections.unmodifiableMap(new a());

    public class a extends HashMap<String, C38708bi.a> {
        public a() {
            put("wifi", C38708bi.a.WIFI);
            put("cell", C38708bi.a.CELL);
        }
    }

    public void a(@j.N Ui ui2, @j.N Tl.a aVar) {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject = aVar.optJSONObject("requests");
        if (jSONObjectOptJSONObject == null || !jSONObjectOptJSONObject.has("list") || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("list")) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
        for (int i12 = 0; i12 < jSONArrayOptJSONArray.length(); i12++) {
            try {
                arrayList.add(a(jSONArrayOptJSONArray.getJSONObject(i12)));
            } catch (Throwable unused) {
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ui2.g(arrayList);
    }

    @j.N
    private C38708bi a(@j.N JSONObject jSONObject) throws JSONException {
        int i12;
        JSONObject jSONObject2 = jSONObject.getJSONObject("headers");
        ArrayList arrayList = new ArrayList(jSONObject2.length());
        Iterator<String> itKeys = jSONObject2.keys();
        while (true) {
            i12 = 0;
            if (!itKeys.hasNext()) {
                break;
            }
            String next = itKeys.next();
            JSONArray jSONArray = jSONObject2.getJSONArray(next);
            while (i12 < jSONArray.length()) {
                arrayList.add(new Pair(next, jSONArray.getString(i12)));
                i12++;
            }
        }
        String strB = Tl.b(jSONObject, "id");
        String strB2 = Tl.b(jSONObject, ContextActionHandler.Link.URL);
        String strB3 = Tl.b(jSONObject, "method");
        Long lValueOf = Long.valueOf(jSONObject.getLong("delay_seconds"));
        ArrayList arrayList2 = new ArrayList();
        if (jSONObject.has("accept_network_types")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("accept_network_types");
            while (i12 < jSONArray2.length()) {
                arrayList2.add(f379217a.get(jSONArray2.getString(i12)));
                i12++;
            }
        }
        return new C38708bi(strB, strB2, strB3, arrayList, lValueOf, arrayList2);
    }
}
