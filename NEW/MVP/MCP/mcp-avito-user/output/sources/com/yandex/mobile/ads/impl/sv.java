package com.yandex.mobile.ads.impl;

import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class sv implements qb<rv> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final e30 f390032a;

    public sv(@j.N e30 e30Var) {
        this.f390032a = e30Var;
    }

    @Override // com.yandex.mobile.ads.impl.qb
    @j.N
    public final rv a(@j.N JSONObject jSONObject) throws yk0 {
        if (jSONObject.has("value")) {
            return new rv(!jSONObject.isNull("value") ? this.f390032a.a(jSONObject) : null);
        }
        throw new yk0("Native Ad json has not required attributes");
    }
}
