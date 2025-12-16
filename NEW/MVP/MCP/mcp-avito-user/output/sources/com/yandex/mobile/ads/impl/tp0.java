package com.yandex.mobile.ads.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class tp0 implements qb<String> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final yz0 f390278a = new yz0();

    @Override // com.yandex.mobile.ads.impl.qb
    @j.N
    public final String a(@j.N JSONObject jSONObject) throws JSONException, yk0 {
        String strA = mm0.a("name", jSONObject);
        String strA2 = mm0.a("value", jSONObject);
        return "review_count".equals(strA) ? this.f390278a.a(strA2) : strA2;
    }
}
