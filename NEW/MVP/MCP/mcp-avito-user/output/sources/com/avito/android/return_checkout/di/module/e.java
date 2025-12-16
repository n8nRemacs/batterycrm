package com.avito.android.return_checkout.di.module;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;

/* compiled from: DeliveryReturnCheckoutModule_ProvideComponentFormsFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<com.avito.android.return_checkout.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f255287a;

    public e(u uVar) {
        this.f255287a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC40691b interfaceC40691b = (InterfaceC40691b) this.f255287a.get();
        c.f255281a.getClass();
        return new com.avito.android.return_checkout.a(interfaceC40691b.j(), interfaceC40691b.j(), interfaceC40691b.j());
    }
}
