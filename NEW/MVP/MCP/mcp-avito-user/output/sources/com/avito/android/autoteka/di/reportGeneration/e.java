package com.avito.android.autoteka.di.reportGeneration;

import com.avito.konveyor.adapter.j;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutotekaReportGenerationModule_Companion_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f96582a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f96583b;

    public e(u uVar, Provider provider) {
        this.f96582a = uVar;
        this.f96583b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f96582a.get();
        com.avito.konveyor.a aVar2 = this.f96583b.get();
        b.f96576a.getClass();
        return new j(aVar, aVar2);
    }
}
