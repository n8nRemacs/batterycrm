package com.avito.android.order.feature.di.module;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;

/* compiled from: OrderModule_ProvideComponentsFormsFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<com.avito.android.order.feature.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f209571a;

    public g(u uVar) {
        this.f209571a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC40691b interfaceC40691b = (InterfaceC40691b) this.f209571a.get();
        c.f209563a.getClass();
        return new com.avito.android.order.feature.a(interfaceC40691b.j());
    }
}
