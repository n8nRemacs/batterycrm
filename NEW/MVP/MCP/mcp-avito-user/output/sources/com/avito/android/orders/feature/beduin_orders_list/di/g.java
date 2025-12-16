package com.avito.android.orders.feature.beduin_orders_list.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;

/* compiled from: BeduinOrdersModule_ProvideComponentsFormsFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<com.avito.android.orders.feature.beduin_orders_list.f> {

    /* renamed from: a, reason: collision with root package name */
    public final u f210024a;

    public g(u uVar) {
        this.f210024a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC40691b interfaceC40691b = (InterfaceC40691b) this.f210024a.get();
        d.f210016a.getClass();
        return new com.avito.android.orders.feature.beduin_orders_list.f(interfaceC40691b.j(), interfaceC40691b.j(), interfaceC40691b.j());
    }
}
