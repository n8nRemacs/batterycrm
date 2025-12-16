package com.yandex.mobile.ads.impl;

import com.yandex.div2.C38273c1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class ou {
    @j.P
    public static Integer a(@j.N C38273c1 c38273c1) {
        JSONObject jSONObject = c38273c1.f374691b;
        if (jSONObject == null) {
            return null;
        }
        try {
            return Integer.valueOf(jSONObject.getInt("position"));
        } catch (JSONException unused) {
            return null;
        }
    }
}
