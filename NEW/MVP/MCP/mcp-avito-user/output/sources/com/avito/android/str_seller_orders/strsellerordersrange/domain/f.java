package com.avito.android.str_seller_orders.strsellerordersrange.domain;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import ez0.InterfaceC40183a;
import javax.inject.Provider;

/* compiled from: StrSellerOrdersRangeInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f290258a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC40183a> f290259b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f290260c;

    public f(Provider<InterfaceC28373a> provider, Provider<InterfaceC40183a> provider2, Provider<R0> provider3) {
        this.f290258a = provider;
        this.f290259b = provider2;
        this.f290260c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f290258a.get(), this.f290259b.get(), this.f290260c.get());
    }
}
