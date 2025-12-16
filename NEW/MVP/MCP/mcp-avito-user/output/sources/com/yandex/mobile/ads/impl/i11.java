package com.yandex.mobile.ads.impl;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class i11 {
    @Y61.l
    public static Object a(@Y61.k String str, @Y61.k JSONObject jSONObject) {
        try {
            return jSONObject.get(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Y61.l
    public static Object a(@Y61.k JSONArray jSONArray, int i12) {
        try {
            return jSONArray.get(i12);
        } catch (JSONException unused) {
            return null;
        }
    }
}
