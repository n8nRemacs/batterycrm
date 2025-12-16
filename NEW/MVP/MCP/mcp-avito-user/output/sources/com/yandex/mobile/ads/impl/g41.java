package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class g41 implements no {

    /* renamed from: b, reason: collision with root package name */
    private static final long f385579b = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final AdResponse<?> f385580a;

    public g41(@Y61.k AdResponse<?> adResponse) {
        this.f385580a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.no
    public final long a() {
        Long lD2 = this.f385580a.D();
        return lD2 == null ? f385579b : lD2.longValue();
    }
}
