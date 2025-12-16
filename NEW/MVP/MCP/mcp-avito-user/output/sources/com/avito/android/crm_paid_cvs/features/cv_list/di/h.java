package com.avito.android.crm_paid_cvs.features.cv_list.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CvListModule_ProvideCvPresenter$_avito_job_crm_paid_cvs_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f130386a;

    public h(u uVar) {
        this.f130386a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f130386a.get();
        d.f130382a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
