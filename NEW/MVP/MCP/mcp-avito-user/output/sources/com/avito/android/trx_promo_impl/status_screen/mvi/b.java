package com.avito.android.trx_promo_impl.status_screen.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TrxPromoStatusActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f304451a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f304452b;

    public b(u uVar, Provider provider) {
        this.f304451a = uVar;
        this.f304452b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.trx_promo_impl.status_screen.domain.a) this.f304451a.get(), this.f304452b.get());
    }
}
