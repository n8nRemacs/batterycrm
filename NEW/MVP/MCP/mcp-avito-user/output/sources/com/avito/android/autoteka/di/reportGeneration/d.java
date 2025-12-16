package com.avito.android.autoteka.di.reportGeneration;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutotekaReportGenerationModule_Companion_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.autoteka.items.reportGeneration.b f96579a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.autoteka.items.fullScreenError.reportGenerationError.b f96580b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.autoteka.items.reportGenerationResponse.b f96581c;

    public d(com.avito.android.autoteka.items.reportGeneration.b bVar, com.avito.android.autoteka.items.fullScreenError.reportGenerationError.b bVar2, com.avito.android.autoteka.items.reportGenerationResponse.b bVar3) {
        this.f96579a = bVar;
        this.f96580b = bVar2;
        this.f96581c = bVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.autoteka.items.reportGeneration.a aVar = (com.avito.android.autoteka.items.reportGeneration.a) this.f96579a.get();
        com.avito.android.autoteka.items.fullScreenError.reportGenerationError.a aVar2 = (com.avito.android.autoteka.items.fullScreenError.reportGenerationError.a) this.f96580b.get();
        com.avito.android.autoteka.items.reportGenerationResponse.a aVar3 = (com.avito.android.autoteka.items.reportGenerationResponse.a) this.f96581c.get();
        b.f96576a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(aVar3);
        return c10493a.a();
    }
}
