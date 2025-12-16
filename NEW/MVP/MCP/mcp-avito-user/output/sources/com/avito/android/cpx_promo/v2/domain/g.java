package com.avito.android.cpx_promo.v2.domain;

import com.avito.android.analytics.InterfaceC28373a;
import cs.InterfaceC39404a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import gs.InterfaceC40725a;
import javax.inject.Provider;

/* compiled from: CpxPromoV2InteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40725a> f127476a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC39404a> f127477b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f127478c;

    public g(Provider<InterfaceC40725a> provider, Provider<InterfaceC39404a> provider2, Provider<InterfaceC28373a> provider3) {
        this.f127476a = provider;
        this.f127477b = provider2;
        this.f127478c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f127476a.get(), this.f127477b.get(), this.f127478c.get());
    }
}
