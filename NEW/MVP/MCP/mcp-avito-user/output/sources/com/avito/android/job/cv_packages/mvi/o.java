package com.avito.android.job.cv_packages.mvi;

import dagger.internal.y;

/* compiled from: CvPackagesBootstrap_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.job.cv_packages.e f174489a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f174490b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f174491c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f174492d;

    public o(com.avito.android.job.cv_packages.e eVar, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3) {
        this.f174489a = eVar;
        this.f174490b = lVar;
        this.f174491c = lVar2;
        this.f174492d = lVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new n((com.avito.android.job.cv_packages.b) this.f174489a.get(), (String) this.f174490b.f393949a, (String) this.f174491c.f393949a, ((Boolean) this.f174492d.f393949a).booleanValue());
    }
}
