package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class zb {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final pb f392215a;

    public zb(@Y61.k Context context) {
        this.f392215a = new pb(context, new i90());
    }

    @Y61.k
    public final ArrayList a(@Y61.k JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("assets");
        int length = jSONArray.length();
        for (int i12 = 0; i12 < length; i12++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i12);
            boolean z12 = jSONObject2.getBoolean("required");
            try {
                arrayList.add(this.f392215a.a(jSONObject2));
            } catch (Throwable th2) {
                if (z12) {
                    throw th2;
                }
            }
        }
        return arrayList;
    }
}
