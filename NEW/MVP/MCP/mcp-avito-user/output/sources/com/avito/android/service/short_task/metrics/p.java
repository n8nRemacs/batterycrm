package com.avito.android.service.short_task.metrics;

import com.avito.android.analytics.H;
import javax.inject.Provider;

/* compiled from: NetworkMetricProvider_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<H> f274092a;

    public p(Provider<H> provider) {
        this.f274092a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o(this.f274092a.get());
    }
}
