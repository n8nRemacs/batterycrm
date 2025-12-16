package com.avito.android.publish.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: PublishDeliveryEventTrackerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.analytics.u, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33534u implements dagger.internal.h<C33533t> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f232278a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C50213a> f232279b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.provider.a> f232280c;

    public C33534u(Provider<InterfaceC28373a> provider, Provider<C50213a> provider2, Provider<com.avito.android.analytics.provider.a> provider3) {
        this.f232278a = provider;
        this.f232279b = provider2;
        this.f232280c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C33533t(this.f232278a.get(), this.f232279b.get(), this.f232280c.get());
    }
}
