package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.impl.ky0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class px0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final AdResponse f389017a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ny0 f389018b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final n2 f389019c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final o5 f389020d = new o5();

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private ky0.a f389021e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private final v11 f389022f;

    public px0(@j.N Context context, @j.N AdResponse adResponse, @j.N n2 n2Var) {
        this.f389017a = adResponse;
        this.f389019c = n2Var;
        this.f389018b = m9.a(context);
        this.f389022f = q21.b().a(context);
    }

    public final void a(@j.P tm0 tm0Var) {
        this.f389021e = tm0Var;
    }

    public final void a() {
        ly0 ly0Var = new ly0(new HashMap());
        ly0Var.b("Yandex", "adapter");
        ly0Var.b(this.f389017a.o(), "block_id");
        ly0Var.b(this.f389017a.o(), "ad_unit_id");
        ly0Var.b(this.f389017a.n(), "ad_type_format");
        ly0Var.b(this.f389017a.A(), "product_type");
        ly0Var.b(this.f389017a.l(), "ad_source");
        ly0Var.a(this.f389017a.c());
        Map<String, Object> mapR = this.f389017a.r();
        if (mapR != null) {
            ly0Var.a(mapR);
        }
        y6 y6VarM = this.f389017a.m();
        ly0Var.b(y6VarM != null ? y6VarM.a() : null, "ad_type");
        ky0.a aVar = this.f389021e;
        if (aVar != null) {
            ly0Var.a(aVar.a());
        }
        SizeInfo sizeInfoN = this.f389019c.n();
        if (sizeInfoN != null) {
            ly0Var.b(m41.b(sizeInfoN.d()), "size_type");
            ly0Var.b(Integer.valueOf(sizeInfoN.e()), "width");
            ly0Var.b(Integer.valueOf(sizeInfoN.c()), "height");
        }
        ly0Var.a(this.f389020d.a(this.f389019c.a()));
        v11 v11Var = this.f389022f;
        if (v11Var != null) {
            ly0Var.b(v11Var.e(), "banner_size_calculation_type");
        }
        this.f389018b.a(new ky0(ky0.b.f387320u.a(), ly0Var.a()));
    }
}
