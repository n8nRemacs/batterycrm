package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ky0;
import java.util.Map;

/* loaded from: classes8.dex */
public final class k40 implements ky0.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final m5 f387043a;

    public k40(@Y61.k p60 p60Var) {
        this.f387043a = new m5(p60Var.a());
    }

    @Override // com.yandex.mobile.ads.impl.ky0.a
    @Y61.k
    public final Map<String, Object> a() {
        ly0 ly0Var = new ly0(kotlin.collections.P0.j(new kotlin.Q("ad_type", y6.f391940g.a())));
        ly0Var.b(this.f387043a.d(), "page_id");
        ly0Var.b(this.f387043a.b(), "category_id");
        ly0Var.b(this.f387043a.c(), "imp_id");
        return ly0Var.a();
    }
}
