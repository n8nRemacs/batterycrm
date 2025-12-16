package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
final class pu0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ou0 f389000a;

    public pu0(@j.N bc1 bc1Var) {
        this.f389000a = new ou0(bc1Var);
    }

    @j.N
    public final ArrayList a(@j.P JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i12);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(this.f389000a.a(jSONObjectOptJSONObject));
                }
            }
        }
        return arrayList;
    }
}
