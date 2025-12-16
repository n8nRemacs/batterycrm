package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdImpressionData;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class yf0 {
    @Y61.l
    public static AdImpressionData a(@Y61.k JSONObject jSONObject) {
        try {
            return new AdImpressionData(m80.a("impression_data", jSONObject));
        } catch (Exception unused) {
            return null;
        }
    }
}
