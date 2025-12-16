package com.avito.android.btob_business_trip.screens.resultSuccessScreen.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import rk.InterfaceC47669a;

/* compiled from: B2bBusinessTripSuccessScreenActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f108098a;

    public b(u uVar) {
        this.f108098a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC47669a interfaceC47669a = (InterfaceC47669a) this.f108098a.get();
        a aVar = new a();
        aVar.f108097a = interfaceC47669a;
        return aVar;
    }
}
