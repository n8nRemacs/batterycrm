package com.avito.android.str_seller_orders.strsellerorders.mvi;

import android.content.Context;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerOrdersReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f290062a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Context> f290063b;

    public r(dagger.internal.u uVar, Provider provider) {
        this.f290062a = uVar;
        this.f290063b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q((s) this.f290062a.get(), this.f290063b.get());
    }
}
