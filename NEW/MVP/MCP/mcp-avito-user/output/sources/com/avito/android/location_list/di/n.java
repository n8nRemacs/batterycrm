package com.avito.android.location_list.di;

import com.avito.android.permissions.C33035e;
import com.avito.android.permissions.InterfaceC33034d;
import com.avito.android.permissions.q;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LocationListModule_ProvideLocationPermissionDialogPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class n implements dagger.internal.h<InterfaceC33034d> {

    /* renamed from: a, reason: collision with root package name */
    public final d f182034a;

    /* renamed from: b, reason: collision with root package name */
    public final u f182035b;

    public n(d dVar, u uVar) {
        this.f182034a = dVar;
        this.f182035b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        q qVar = (q) this.f182035b.get();
        this.f182034a.getClass();
        return new C33035e(qVar);
    }
}
