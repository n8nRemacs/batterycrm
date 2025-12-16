package com.avito.android.search.filter.location_filter.di;

import com.avito.android.permissions.C33035e;
import com.avito.android.permissions.InterfaceC33034d;
import com.avito.android.permissions.q;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LocationFiltersModule_ProvideLocationPermissionDialogPresenter$_avito_search_filter_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<InterfaceC33034d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f263625a;

    public m(u uVar) {
        this.f263625a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        q qVar = (q) this.f263625a.get();
        k kVar = k.f263616a;
        return new C33035e(qVar);
    }
}
