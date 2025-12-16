package com.avito.android.publish.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: PublishDeliveryDbsEventTrackerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class r implements dagger.internal.h<C33531q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f232272a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C50213a> f232273b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.provider.a> f232274c;

    public r(Provider<InterfaceC28373a> provider, Provider<C50213a> provider2, Provider<com.avito.android.analytics.provider.a> provider3) {
        this.f232272a = provider;
        this.f232273b = provider2;
        this.f232274c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C33531q(this.f232272a.get(), this.f232273b.get(), this.f232274c.get());
    }
}
