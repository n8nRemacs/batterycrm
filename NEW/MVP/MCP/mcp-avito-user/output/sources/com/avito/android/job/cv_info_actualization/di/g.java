package com.avito.android.job.cv_info_actualization.di;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JsxCvInfoActualizationModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f174075a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f174076b;

    public g(u uVar, Provider provider) {
        this.f174075a = uVar;
        this.f174076b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f174075a.get();
        com.avito.konveyor.a aVar2 = this.f174076b.get();
        e.f174073a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
