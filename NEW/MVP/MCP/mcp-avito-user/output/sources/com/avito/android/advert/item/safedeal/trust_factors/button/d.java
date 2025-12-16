package com.avito.android.advert.item.safedeal.trust_factors.button;

import com.avito.android.advert.item.safedeal.InterfaceC28173a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TrustFactorsButtonPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.safedeal.trust_factors.d> f79059a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.analytics.a> f79060b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28173a> f79061c;

    public d(Provider<com.avito.android.advert.item.safedeal.trust_factors.d> provider, Provider<com.avito.android.advert_core.analytics.a> provider2, Provider<InterfaceC28173a> provider3) {
        this.f79059a = provider;
        this.f79060b = provider2;
        this.f79061c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f79059a.get(), this.f79060b.get(), this.f79061c.get());
    }
}
