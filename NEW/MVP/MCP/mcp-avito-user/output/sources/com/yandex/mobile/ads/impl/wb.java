package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ky0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class wb {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final InterfaceC39315d1 f391371a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final y6 f391372b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final d6 f391373c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private ky0.a f391374d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private final String f391375e;

    public wb(@j.N t3 t3Var, @j.N y6 y6Var, @j.P String str) {
        this.f391371a = t3Var.a();
        this.f391373c = t3Var.b();
        this.f391372b = y6Var;
        this.f391375e = str;
    }

    public final void a(@j.N ky0.a aVar) {
        this.f391374d = aVar;
    }

    @j.N
    public final Map<String, Object> a() {
        ly0 ly0Var = new ly0(new HashMap());
        ly0Var.b(this.f391372b.a(), "ad_type");
        ly0Var.a(this.f391375e, "ad_id");
        ly0Var.a(this.f391371a.a());
        ly0Var.a(this.f391373c.a());
        ky0.a aVar = this.f391374d;
        if (aVar != null) {
            ly0Var.a(aVar.a());
        }
        return ly0Var.a();
    }
}
