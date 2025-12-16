package com.avito.android.favorites.di;

import com.avito.android.permissions.C33035e;
import com.avito.android.permissions.InterfaceC33034d;

/* compiled from: FavoriteAdvertsModule_ProvideLocationPermissionDialogPresenter$_avito_favorites_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class v implements dagger.internal.h<InterfaceC33034d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f157355a;

    public v(dagger.internal.u uVar) {
        this.f157355a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.permissions.q qVar = (com.avito.android.permissions.q) this.f157355a.get();
        C30647e.f157320a.getClass();
        return new C33035e(qVar);
    }
}
