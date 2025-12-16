package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
final class f40 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final e40 f385168a = new e40();

    @j.N
    public final ArrayList a(@j.N JSONObject jSONObject) throws JSONException, yk0 {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("installedPackages");
        if (jSONArrayOptJSONArray != null) {
            for (int i12 = 0; i12 < jSONArrayOptJSONArray.length(); i12++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i12);
                this.f385168a.getClass();
                if (!nm0.a(jSONObject2, "name")) {
                    throw new yk0("Native Ad json has not required attributes");
                }
                String strA = mm0.a("name", jSONObject2);
                int i13 = g7.f385602b;
                int iOptInt = jSONObject2.optInt("minVersion", 0);
                if (iOptInt < 0) {
                    iOptInt = 0;
                }
                int i14 = Integer.MAX_VALUE;
                int iOptInt2 = jSONObject2.optInt("maxVersion", Integer.MAX_VALUE);
                if (iOptInt2 >= 0) {
                    i14 = iOptInt2;
                }
                arrayList.add(new d40(iOptInt, i14, strA));
            }
        }
        return arrayList;
    }
}
