package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class e41 implements InterfaceC39327g1 {

    /* renamed from: b, reason: collision with root package name */
    private static final long f384753b = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final AdResponse<?> f384754a;

    public e41(@Y61.k AdResponse<?> adResponse) {
        this.f384754a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39327g1
    public final long a() {
        Long lD2 = this.f384754a.D();
        return lD2 != null ? lD2.longValue() : f384753b;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39327g1
    public final long a(long j12) {
        Long lD2 = this.f384754a.D();
        return lD2 != null ? Math.min(j12, lD2.longValue()) : j12;
    }
}
