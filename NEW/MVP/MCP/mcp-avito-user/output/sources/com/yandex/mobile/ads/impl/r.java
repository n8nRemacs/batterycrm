package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final bc1 f389351a = new bc1();

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private Map<String, InterfaceC39353p> f389352b;

    @j.P
    public final InterfaceC39353p a(@j.N JSONObject jSONObject) {
        String strA = mm0.a("type", jSONObject);
        if (this.f389352b == null) {
            this.f389352b = new C39356q(this);
        }
        return (InterfaceC39353p) ((HashMap) this.f389352b).get(strA);
    }
}
