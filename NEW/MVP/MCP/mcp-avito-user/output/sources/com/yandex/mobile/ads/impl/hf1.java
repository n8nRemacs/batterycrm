package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class hf1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final VideoAd f386126a;

    public hf1(@Y61.k VideoAd videoAd) {
        this.f386126a = videoAd;
    }

    @Y61.l
    public final String a() {
        JSONObject jSONObjectA;
        VideoAd videoAd = this.f386126a;
        n60 n60Var = videoAd instanceof n60 ? (n60) videoAd : null;
        String strOptString = (n60Var == null || (jSONObjectA = n60Var.a()) == null) ? null : jSONObjectA.optString("productType");
        if (strOptString == null || strOptString.length() <= 0) {
            return null;
        }
        return strOptString;
    }
}
