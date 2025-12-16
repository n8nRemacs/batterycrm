package com.avito.android.multigeo_flow.full_list.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JobMultiGeoFullListModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.multigeo_flow.full_list.list.b f206907a;

    public f(com.avito.android.multigeo_flow.full_list.list.b bVar) {
        this.f206907a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.multigeo_flow.full_list.list.a aVar = (com.avito.android.multigeo_flow.full_list.list.a) this.f206907a.get();
        d.f206905a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
