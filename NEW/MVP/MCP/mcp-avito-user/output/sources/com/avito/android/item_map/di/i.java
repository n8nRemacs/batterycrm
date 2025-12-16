package com.avito.android.item_map.di;

import com.avito.android.permissions.C33035e;
import com.avito.android.permissions.InterfaceC33034d;
import com.avito.android.permissions.q;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ItemMapModule_ProvideLocationPermissionDialogPresenter$_avito_item_map_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<InterfaceC33034d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f173331a;

    public i(u uVar) {
        this.f173331a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        q qVar = (q) this.f173331a.get();
        d dVar = d.f173318a;
        return new C33035e(qVar);
    }
}
