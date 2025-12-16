package com.avito.android.location_picker.di;

import com.avito.android.permissions.C33035e;
import com.avito.android.permissions.InterfaceC33034d;

/* compiled from: LocationPickerModule_ProvideLocationPermissionDialogPresenter$_avito_location_picker_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<InterfaceC33034d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f182323a;

    public j(dagger.internal.u uVar) {
        this.f182323a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.permissions.q qVar = (com.avito.android.permissions.q) this.f182323a.get();
        g.f182320a.getClass();
        return new C33035e(qVar);
    }
}
