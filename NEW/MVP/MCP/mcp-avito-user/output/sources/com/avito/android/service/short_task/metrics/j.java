package com.avito.android.service.short_task.metrics;

import com.avito.android.util.L0;
import javax.inject.Provider;

/* compiled from: DeviceInfoMetricProvider_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<L0> f274083a;

    public j(Provider<L0> provider) {
        this.f274083a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f274083a.get());
    }
}
