package com.yandex.mobile.ads.impl;

import com.yandex.div2.C38273c1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class pu {
    @j.P
    public static String a(@j.N C38273c1 c38273c1) {
        JSONObject jSONObject = c38273c1.f374691b;
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.getString("view_name");
        } catch (JSONException unused) {
            return null;
        }
    }
}
