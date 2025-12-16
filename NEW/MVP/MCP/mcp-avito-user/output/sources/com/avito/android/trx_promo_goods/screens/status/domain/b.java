package com.avito.android.trx_promo_goods.screens.status.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GetTrxPromoGoodsStatusUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f303831a;

    /* renamed from: b, reason: collision with root package name */
    public final l f303832b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<IF0.a> f303833c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f303834d;

    public b(l lVar, l lVar2, Provider provider, Provider provider2) {
        this.f303831a = lVar;
        this.f303832b = lVar2;
        this.f303833c = provider;
        this.f303834d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((String) this.f303831a.f393949a, (TrxPromoGoodsStatus) this.f303832b.f393949a, this.f303833c.get(), this.f303834d.get());
    }
}
