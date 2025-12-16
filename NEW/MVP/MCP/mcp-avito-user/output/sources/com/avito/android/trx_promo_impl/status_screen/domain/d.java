package com.avito.android.trx_promo_impl.status_screen.domain;

import com.avito.android.trx_promo_public.data.TrxPromoStatus;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TrxPromoStatusUseCaseImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f304441a;

    /* renamed from: b, reason: collision with root package name */
    public final l f304442b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<TF0.a> f304443c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f304444d;

    public d(l lVar, l lVar2, Provider provider, Provider provider2) {
        this.f304441a = lVar;
        this.f304442b = lVar2;
        this.f304443c = provider;
        this.f304444d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((String) this.f304441a.f393949a, (TrxPromoStatus) this.f304442b.f393949a, this.f304443c.get(), this.f304444d.get());
    }
}
