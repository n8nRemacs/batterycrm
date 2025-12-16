package com.avito.android.trx_promo_goods.screens.configure.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GetTrxPromoGoodsConfigureUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f303477a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<IF0.a> f303478b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f303479c;

    public b(l lVar, Provider provider, Provider provider2) {
        this.f303477a = lVar;
        this.f303478b = provider;
        this.f303479c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((String) this.f303477a.f393949a, this.f303478b.get(), this.f303479c.get());
    }
}
