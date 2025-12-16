package com.avito.android.trx_promo_impl.item.header;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TrxPromoHeaderBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f304304a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f304305b;

    public b(u uVar, Provider provider) {
        this.f304304a = uVar;
        this.f304305b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f304304a.get(), this.f304305b.get());
    }
}
