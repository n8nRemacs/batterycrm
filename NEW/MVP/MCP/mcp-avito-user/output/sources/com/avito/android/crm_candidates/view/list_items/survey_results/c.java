package com.avito.android.crm_candidates.view.list_items.survey_results;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JobCrmPropertyModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f130257a;

    public c(f fVar) {
        this.f130257a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        e eVar = (e) this.f130257a.get();
        a.f130255a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(eVar);
        return c10493a.a();
    }
}
