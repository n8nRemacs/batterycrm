package com.yandex.mobile.ads.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class ld1 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f387447a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f387448b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f387449c = true;

    /* renamed from: d, reason: collision with root package name */
    private final eu0 f387450d;

    private ld1(boolean z12, Float f12, eu0 eu0Var) {
        this.f387447a = z12;
        this.f387448b = f12;
        this.f387450d = eu0Var;
    }

    public static ld1 a(float f12, eu0 eu0Var) {
        return new ld1(true, Float.valueOf(f12), eu0Var);
    }

    public static ld1 a(eu0 eu0Var) {
        return new ld1(false, null, eu0Var);
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f387447a);
            if (this.f387447a) {
                jSONObject.put("skipOffset", this.f387448b);
            }
            jSONObject.put("autoPlay", this.f387449c);
            jSONObject.put("position", this.f387450d);
        } catch (JSONException e12) {
            np1.a("VastProperties: JSON error", e12);
        }
        return jSONObject;
    }
}
