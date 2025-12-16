package com.avito.android.seller_promotions.mvi;

import Rq0.InterfaceC15072a;
import com.avito.android.seller_promotions.model.SellerPromotionsArguments;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: SellerPromotionsInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class D implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC15072a> f267918a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f267919b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f267920c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.lib.beduin_v2.repository.domain.cart_items.h> f267921d;

    public D(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f267918a = provider;
        this.f267919b = lVar;
        this.f267920c = provider2;
        this.f267921d = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C(dagger.internal.g.b(this.f267918a), (SellerPromotionsArguments) this.f267919b.f393949a, this.f267920c.get(), this.f267921d.get());
    }
}
