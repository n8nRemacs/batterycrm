package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class ym1 implements d6 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final AdResponse f392023a;

    public ym1(@j.N AdResponse adResponse) {
        this.f392023a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.d6
    @j.N
    public final Map<String, Object> a() {
        ly0 ly0Var = new ly0(new HashMap());
        ly0Var.b(this.f392023a.l(), "ad_source");
        ly0Var.b(this.f392023a.n(), "ad_type_format");
        ly0Var.b(this.f392023a.o(), "block_id");
        ly0Var.b(this.f392023a.o(), "ad_unit_id");
        ly0Var.b(this.f392023a.A(), "product_type");
        ly0Var.a(this.f392023a.E(), "server_log_id");
        ly0Var.b(m41.b(this.f392023a.F().d()), "size_type");
        ly0Var.b(Integer.valueOf(this.f392023a.F().e()), "width");
        ly0Var.b(Integer.valueOf(this.f392023a.F().c()), "height");
        return ly0Var.a();
    }
}
