package com.yandex.mobile.ads.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class k6 {

    /* renamed from: a, reason: collision with root package name */
    private final lr0 f387057a;

    /* renamed from: b, reason: collision with root package name */
    private final lr0 f387058b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f387059c;

    /* renamed from: d, reason: collision with root package name */
    private final qm f387060d;

    /* renamed from: e, reason: collision with root package name */
    private final t30 f387061e;

    private k6() {
        qm qmVar = qm.f389238b;
        t30 t30Var = t30.f390062b;
        lr0 lr0Var = lr0.f387698b;
        this.f387060d = qmVar;
        this.f387061e = t30Var;
        this.f387057a = lr0Var;
        this.f387058b = lr0Var;
        this.f387059c = false;
    }

    public static k6 a() {
        return new k6();
    }

    public final boolean b() {
        return lr0.f387698b == this.f387057a;
    }

    public final boolean c() {
        return lr0.f387698b == this.f387058b;
    }

    public final JSONObject d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        gp1.a(jSONObject, "impressionOwner", this.f387057a);
        gp1.a(jSONObject, "mediaEventsOwner", this.f387058b);
        gp1.a(jSONObject, "creativeType", this.f387060d);
        gp1.a(jSONObject, "impressionType", this.f387061e);
        gp1.a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f387059c));
        return jSONObject;
    }
}
