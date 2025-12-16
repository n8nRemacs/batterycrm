package com.avito.android.calltracking.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CalltrackingFragmentModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.calltracking.item.g f113669a;

    public j(com.avito.android.calltracking.item.g gVar) {
        this.f113669a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.calltracking.item.f fVar = (com.avito.android.calltracking.item.f) this.f113669a.get();
        g.f113665a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(fVar);
        return c10493a.a();
    }
}
