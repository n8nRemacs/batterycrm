package com.yandex.mobile.ads.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class cd0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final me f384236a = new me();

    @j.N
    public final Object a(@j.N JSONObject jSONObject) throws JSONException, yk0 {
        String strA = this.f384236a.a("html", jSONObject);
        float f12 = (float) jSONObject.getDouble("aspectRatio");
        if (f12 == 0.0f) {
            f12 = 1.7777778f;
        }
        return new rb0(strA, f12);
    }
}
