package com.yandex.mobile.ads.impl;

import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class k3 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final vz f387041a;

    public k3(@Y61.k vz vzVar) {
        this.f387041a = vzVar;
    }

    @Y61.l
    public final String a(@Y61.k JSONObject jSONObject) {
        String strOptString = jSONObject.optString("dev_ad_host", null);
        this.f387041a.getClass();
        if (vz.a(strOptString)) {
            return strOptString;
        }
        return null;
    }
}
