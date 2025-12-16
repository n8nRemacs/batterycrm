package com.avito.android.trx_promo_goods.screens.configure.item.header;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TrxPromoGoodsConfigureHeaderBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f303554a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f303555b;

    public b(u uVar, Provider provider) {
        this.f303554a = uVar;
        this.f303555b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f303554a.get(), this.f303555b.get());
    }
}
