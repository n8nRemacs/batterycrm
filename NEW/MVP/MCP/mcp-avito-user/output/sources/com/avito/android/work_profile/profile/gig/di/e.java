package com.avito.android.work_profile.profile.gig.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GigModule_ProvideContentAdapterPresenter$_avito_job_work_profile_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f331121a;

    public e(u uVar) {
        this.f331121a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f331121a.get();
        d.f331120a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
