package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.impl.ky0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class d5 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final AdResponse f384526a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final o5 f384527b = new o5();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ny0 f384528c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final n2 f384529d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final b4 f384530e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private ky0.a f384531f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private final v11 f384532g;

    public d5(@j.N Context context, @j.N AdResponse adResponse, @j.N n2 n2Var, @j.N a4 a4Var, @j.N e00 e00Var) {
        this.f384526a = adResponse;
        this.f384529d = n2Var;
        this.f384531f = e00Var;
        this.f384530e = new b4(a4Var);
        this.f384528c = m9.a(context);
        this.f384532g = q21.b().a(context);
    }

    public final void a() {
        ly0 ly0Var = new ly0(new HashMap());
        ly0Var.b(this.f384526a.o(), "block_id");
        ly0Var.b(this.f384526a.o(), "ad_unit_id");
        ly0Var.b("Yandex", "adapter");
        ly0Var.b(this.f384526a.A(), "product_type");
        ly0Var.b(this.f384526a.n(), "ad_type_format");
        ly0Var.b(this.f384526a.l(), "ad_source");
        ly0Var.a(this.f384526a.c());
        ly0Var.a(this.f384531f.a());
        ly0Var.a(this.f384530e.b());
        Map<String, Object> mapR = this.f384526a.r();
        if (mapR != null) {
            ly0Var.a(mapR);
        }
        SizeInfo sizeInfoN = this.f384529d.n();
        if (sizeInfoN != null) {
            ly0Var.b(m41.b(sizeInfoN.d()), "size_type");
            ly0Var.b(Integer.valueOf(sizeInfoN.e()), "width");
            ly0Var.b(Integer.valueOf(sizeInfoN.c()), "height");
        }
        v11 v11Var = this.f384532g;
        if (v11Var != null) {
            ly0Var.b(v11Var.e(), "banner_size_calculation_type");
        }
        y6 y6VarM = this.f384526a.m();
        ly0Var.b(y6VarM != null ? y6VarM.a() : null, "ad_type");
        ly0Var.a(this.f384527b.a(this.f384529d.a()));
        this.f384528c.a(new ky0(ky0.b.f387302c.a(), ly0Var.a()));
    }
}
