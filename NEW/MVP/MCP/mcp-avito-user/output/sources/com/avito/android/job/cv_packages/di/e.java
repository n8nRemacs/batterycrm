package com.avito.android.job.cv_packages.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CvPackagesModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.job.cv_packages.item.c f174358a;

    public e(com.avito.android.job.cv_packages.item.c cVar) {
        this.f174358a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.job.cv_packages.item.b bVar = (com.avito.android.job.cv_packages.item.b) this.f174358a.get();
        c.f174356a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        return c10493a.a();
    }
}
