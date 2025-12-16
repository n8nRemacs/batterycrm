package com.avito.android.str_seller_orders.strsellerordersrange.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerOrdersRangeBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.str_seller_orders.strsellerordersrange.domain.b> f290299a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f290300b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f290301c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f290302d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f290303e;

    public g(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, dagger.internal.l lVar4, Provider provider) {
        this.f290299a = provider;
        this.f290300b = lVar;
        this.f290301c = lVar2;
        this.f290302d = lVar3;
        this.f290303e = lVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f290299a.get(), (String) this.f290300b.f393949a, (String) this.f290301c.f393949a, (String) this.f290302d.f393949a, ((Boolean) this.f290303e.f393949a).booleanValue());
    }
}
