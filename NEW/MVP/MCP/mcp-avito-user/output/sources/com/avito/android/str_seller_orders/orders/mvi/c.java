package com.avito.android.str_seller_orders.orders.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrOrdersActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f288880a;

    public c(Provider<InterfaceC28373a> provider) {
        this.f288880a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f288880a.get());
    }
}
