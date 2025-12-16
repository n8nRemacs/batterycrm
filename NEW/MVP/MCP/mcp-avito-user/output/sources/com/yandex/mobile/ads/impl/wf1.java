package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.ky0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class wf1 implements ky0.a {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final n2 f391396a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final AdResponse<?> f391397b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final o5 f391398c = new o5();

    public wf1(@j.N n2 n2Var, @j.N AdResponse<?> adResponse) {
        this.f391396a = n2Var;
        this.f391397b = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.ky0.a
    @j.N
    public final Map<String, Object> a() {
        ly0 ly0Var = new ly0(new HashMap());
        ly0Var.b("Yandex", "adapter");
        ly0Var.b(this.f391397b.o(), "block_id");
        ly0Var.b(this.f391397b.o(), "ad_unit_id");
        ly0Var.b(this.f391397b.n(), "ad_type_format");
        ly0Var.b(this.f391397b.A(), "product_type");
        ly0Var.b(this.f391397b.l(), "ad_source");
        ly0Var.a(this.f391397b.c());
        y6 y6VarM = this.f391397b.m();
        if (y6VarM != null) {
            ly0Var.b(y6VarM.a(), "ad_type");
        } else {
            ly0Var.a("ad_type");
        }
        Map<String, Object> mapR = this.f391397b.r();
        if (mapR != null) {
            ly0Var.a(mapR);
        }
        ly0Var.a(this.f391398c.a(this.f391396a.a()));
        return ly0Var.a();
    }
}
