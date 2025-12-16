package com.avito.android.analytics;

import javax.inject.Provider;

/* compiled from: FavoriteAdvertsAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.analytics.v, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28528v implements dagger.internal.h<C28527u> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f91117a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.account.E> f91118b;

    public C28528v(Provider<InterfaceC28373a> provider, Provider<com.avito.android.account.E> provider2) {
        this.f91117a = provider;
        this.f91118b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28527u(this.f91118b.get(), this.f91117a.get());
    }
}
