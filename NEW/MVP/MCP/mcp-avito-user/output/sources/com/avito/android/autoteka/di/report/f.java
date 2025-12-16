package com.avito.android.autoteka.di.report;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutotekaReportModule_Companion_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.autoteka.items.fullScreenError.report.b f96542a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.autoteka.items.skeleton.report.b f96543b;

    public f(com.avito.android.autoteka.items.fullScreenError.report.b bVar, com.avito.android.autoteka.items.skeleton.report.b bVar2) {
        this.f96542a = bVar;
        this.f96543b = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.autoteka.items.fullScreenError.report.a aVar = (com.avito.android.autoteka.items.fullScreenError.report.a) this.f96542a.get();
        com.avito.android.autoteka.items.skeleton.report.a aVar2 = (com.avito.android.autoteka.items.skeleton.report.a) this.f96543b.get();
        b.f96534a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(aVar2);
        return c10493a.a();
    }
}
