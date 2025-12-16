package com.avito.android.str_seller_orders.strsellerorders.domain;

import com.avito.android.remote.d1;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import ez0.InterfaceC40183a;
import javax.inject.Provider;

/* compiled from: StrSellerOrdersInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d1> f289810a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC40183a> f289811b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f289812c;

    public d(Provider<d1> provider, Provider<InterfaceC40183a> provider2, Provider<R0> provider3) {
        this.f289810a = provider;
        this.f289811b = provider2;
        this.f289812c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f289810a.get(), this.f289811b.get(), this.f289812c.get());
    }
}
