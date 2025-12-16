package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.impl.ky0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class dj implements oy0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final o5 f384616a = new o5();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ny0 f384617b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final AdResponse f384618c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private final n2 f384619d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private final ky0.a f384620e;

    public dj(@j.N Context context, @j.N AdResponse adResponse, @j.P n2 n2Var, @j.P yj0 yj0Var) {
        this.f384618c = adResponse;
        this.f384619d = n2Var;
        this.f384620e = yj0Var;
        this.f384617b = m9.a(context);
    }

    public final void a(@j.N HashMap map) {
        this.f384617b.a(a(ky0.b.f387280A, map));
    }

    public final void a(@j.N ky0.b bVar) {
        this.f384617b.a(a(bVar, new HashMap()));
    }

    private ky0 a(@j.N ky0.b bVar, @j.N HashMap map) {
        SizeInfo sizeInfoN;
        ly0 ly0Var = new ly0(map);
        y6 y6VarM = this.f384618c.m();
        if (y6VarM != null) {
            ly0Var.b(y6VarM.a(), "ad_type");
        } else {
            ly0Var.a("ad_type");
        }
        ly0Var.b(this.f384618c.o(), "block_id");
        ly0Var.b(this.f384618c.o(), "ad_unit_id");
        ly0Var.b("Yandex", "adapter");
        ly0Var.b(this.f384618c.n(), "ad_type_format");
        ly0Var.b(this.f384618c.A(), "product_type");
        ly0Var.b(this.f384618c.l(), "ad_source");
        Map<String, Object> mapR = this.f384618c.r();
        if (mapR != null) {
            ly0Var.a(mapR);
        }
        n2 n2Var = this.f384619d;
        if (n2Var != null && (sizeInfoN = n2Var.n()) != null) {
            ly0Var.b(m41.b(sizeInfoN.d()), "size_type");
            ly0Var.b(Integer.valueOf(sizeInfoN.e()), "width");
            ly0Var.b(Integer.valueOf(sizeInfoN.c()), "height");
        }
        ly0Var.a(this.f384618c.c());
        n2 n2Var2 = this.f384619d;
        if (n2Var2 != null) {
            map.putAll(this.f384616a.a(n2Var2.a()));
        }
        ky0.a aVar = this.f384620e;
        if (aVar != null) {
            map.putAll(aVar.a());
        }
        return new ky0(bVar.a(), ly0Var.a());
    }
}
