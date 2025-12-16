package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ky0;
import java.util.Map;

/* loaded from: classes8.dex */
public final class e70 implements ky0.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final jk1 f384796a;

    public e70(@Y61.k jk1 jk1Var) {
        this.f384796a = jk1Var;
    }

    @Override // com.yandex.mobile.ads.impl.ky0.a
    @Y61.k
    public final Map<String, Object> a() {
        return kotlin.collections.P0.g(new kotlin.Q("ad_type", y6.f391940g.a()), new kotlin.Q("page_id", this.f384796a.c()), new kotlin.Q("category_id", this.f384796a.b()));
    }
}
