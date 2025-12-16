package com.avito.android.search.filter.di;

import com.avito.android.permissions.C33035e;
import com.avito.android.permissions.InterfaceC33034d;

/* compiled from: FiltersModule_ProvideLocationPermissionDialogPresenter$_avito_search_filter_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class q implements dagger.internal.h<InterfaceC33034d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f263282a;

    public q(dagger.internal.u uVar) {
        this.f263282a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.permissions.q qVar = (com.avito.android.permissions.q) this.f263282a.get();
        o oVar = o.f263272a;
        return new C33035e(qVar);
    }
}
