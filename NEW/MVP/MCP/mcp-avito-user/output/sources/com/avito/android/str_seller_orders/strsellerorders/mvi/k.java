package com.avito.android.str_seller_orders.strsellerorders.mvi;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import xz0.C50025b;

/* compiled from: StrSellerOrdersBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.str_seller_orders.strsellerorders.domain.a> f290044a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.str_core.c> f290045b;

    /* renamed from: c, reason: collision with root package name */
    public final xz0.c f290046c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f290047d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f290048e;

    public k(Provider provider, Provider provider2, xz0.c cVar, Provider provider3, dagger.internal.l lVar) {
        this.f290044a = provider;
        this.f290045b = provider2;
        this.f290046c = cVar;
        this.f290047d = provider3;
        this.f290048e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f290044a.get(), this.f290045b.get(), (C50025b) this.f290046c.get(), this.f290047d.get(), ((Boolean) this.f290048e.f393949a).booleanValue());
    }
}
