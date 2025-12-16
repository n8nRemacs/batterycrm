package com.avito.android.crm_candidates.view.list_items.list_filter;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JobCrmListFilterModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final b f130150a;

    public e(b bVar) {
        this.f130150a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        a aVar = (a) this.f130150a.get();
        c.f130149a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
