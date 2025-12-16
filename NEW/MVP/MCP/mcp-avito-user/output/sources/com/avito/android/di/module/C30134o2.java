package com.avito.android.di.module;

import com.google.gson.Gson;
import javax.inject.Provider;

/* compiled from: BuildDependenciesModule_ProvideSilentUpdateSchedulerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.o2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30134o2 implements dagger.internal.h<Bw0.i> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f144483a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f144484b;

    /* renamed from: c, reason: collision with root package name */
    public final C30214v6 f144485c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Gson> f144486d;

    public C30134o2(dagger.internal.l lVar, dagger.internal.f fVar, C30214v6 c30214v6, Provider provider) {
        this.f144483a = lVar;
        this.f144484b = fVar;
        this.f144485c = c30214v6;
        this.f144486d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Bw0.f fVar = (Bw0.f) this.f144483a.f393949a;
        com.avito.android.service.short_task.j jVar = (com.avito.android.service.short_task.j) this.f144484b.get();
        AK0.l lVar = (AK0.l) this.f144485c.get();
        Gson gson = this.f144486d.get();
        C29980a2.f144226a.getClass();
        return fVar.c(jVar, lVar, gson);
    }
}
