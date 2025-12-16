package com.avito.android.publish.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: PublishRealtyEventTrackerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class d0 implements dagger.internal.h<c0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f232203a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C50213a> f232204b;

    public d0(Provider<InterfaceC28373a> provider, Provider<C50213a> provider2) {
        this.f232203a = provider;
        this.f232204b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c0(this.f232203a.get(), this.f232204b.get());
    }
}
