package com.yandex.mobile.ads.impl;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class x4 {
    @X41.n
    @Y61.k
    public static final q4 a(@Y61.k JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("items");
        return new q4(jSONArrayOptJSONArray != null ? w4.a(jSONArrayOptJSONArray) : null);
    }
}
