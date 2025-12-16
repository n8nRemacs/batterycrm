package com.avito.android.change_specific.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExtendedProfileChangeSpecificModule_ProvideItemsBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.change_specific.adapter.d f117970a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.change_specific.adapter.l f117971b;

    public g(com.avito.android.change_specific.adapter.d dVar, com.avito.android.change_specific.adapter.l lVar) {
        this.f117970a = dVar;
        this.f117971b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.change_specific.adapter.c cVar = (com.avito.android.change_specific.adapter.c) this.f117970a.get();
        com.avito.android.change_specific.adapter.k kVar = (com.avito.android.change_specific.adapter.k) this.f117971b.get();
        d.f117965a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(cVar);
        c10493a.b(kVar);
        return c10493a.a();
    }
}
