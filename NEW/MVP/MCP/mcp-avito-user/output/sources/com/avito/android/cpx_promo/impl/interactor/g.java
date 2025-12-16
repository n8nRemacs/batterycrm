package com.avito.android.cpx_promo.impl.interactor;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import gs.InterfaceC40725a;
import javax.inject.Provider;

/* compiled from: CpxPromoInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40725a> f126993a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f126994b;

    public g(Provider<InterfaceC40725a> provider, Provider<InterfaceC28373a> provider2) {
        this.f126993a = provider;
        this.f126994b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f126993a.get(), this.f126994b.get());
    }
}
