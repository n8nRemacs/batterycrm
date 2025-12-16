package com.avito.android.orders.feature.beduin_orders_list;

import com.avito.android.orders.feature.beduin_orders_list.mvi.s;
import com.avito.android.orders.feature.beduin_orders_list.mvi.t;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: BeduinOrdersViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f210057a;

    /* renamed from: b, reason: collision with root package name */
    public final t f210058b;

    public e(Provider provider, t tVar) {
        this.f210057a = provider;
        this.f210058b = tVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f210057a.get(), (s) this.f210058b.get());
    }
}
