package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class v51 implements InterfaceC39353p<o51> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final s51 f390801a;

    public v51(@j.N bc1 bc1Var) {
        this.f390801a = new s51(new i90(), bc1Var);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39353p
    @j.N
    public final AbstractC39344m a(@j.N JSONObject jSONObject) throws JSONException, yk0 {
        String strA = mm0.a("type", jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < jSONArray.length(); i12++) {
            arrayList.add(this.f390801a.a(jSONArray.getJSONObject(i12)));
        }
        if (arrayList.isEmpty()) {
            throw new yk0("Native Ad json has not required attributes");
        }
        return new o51(strA, arrayList);
    }
}
