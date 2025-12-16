package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ky0;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes8.dex */
public final class tm0 implements ky0.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ky0.a f390227a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private bc f390228b;

    public tm0(@Y61.k ky0.a aVar, @Y61.k bc bcVar) {
        this.f390227a = aVar;
        this.f390228b = bcVar;
    }

    @Override // com.yandex.mobile.ads.impl.ky0.a
    @Y61.k
    public final Map<String, Object> a() {
        return kotlin.collections.P0.k(this.f390227a.a(), Collections.singletonMap("assets", Collections.singletonMap("rendered", this.f390228b.a())));
    }
}
