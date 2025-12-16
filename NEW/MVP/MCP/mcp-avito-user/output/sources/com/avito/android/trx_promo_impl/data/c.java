package com.avito.android.trx_promo_impl.data;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TrxPromoRepositoryImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<TF0.a> f303925a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f303926b;

    public c(Provider<TF0.a> provider, Provider<R0> provider2) {
        this.f303925a = provider;
        this.f303926b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f303925a.get(), this.f303926b.get());
    }
}
