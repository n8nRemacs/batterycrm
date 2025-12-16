package com.avito.android.tariff.cpx.configure.advance.mvi;

import dagger.internal.x;
import dagger.internal.y;
import kB0.InterfaceC42564a;

/* compiled from: CpxConfigureAdvanceReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final kB0.c f295769a;

    public n(kB0.c cVar) {
        this.f295769a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m((InterfaceC42564a) this.f295769a.get());
    }
}
