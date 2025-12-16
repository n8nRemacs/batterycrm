package com.yandex.mobile.ads.impl;

import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class rj implements qb<qj> {
    @Override // com.yandex.mobile.ads.impl.qb
    @j.N
    public final qj a(@j.N JSONObject jSONObject) {
        return (jSONObject.has("value") && jSONObject.isNull("value")) ? new qj(2, null) : new qj(1, mm0.a("value", jSONObject));
    }
}
