package com.avito.android.mortgage.landing.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;

/* compiled from: LandingAnalyticsHandlerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.mortgage.landing.analytics.g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32642g implements dagger.internal.h<C32641f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f199525a;

    public C32642g(Provider<InterfaceC28373a> provider) {
        this.f199525a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32641f(this.f199525a.get());
    }
}
