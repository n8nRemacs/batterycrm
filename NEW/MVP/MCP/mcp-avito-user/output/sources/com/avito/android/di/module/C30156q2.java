package com.avito.android.di.module;

import android.content.Context;
import javax.inject.Provider;

/* compiled from: BuildDependenciesModule_ProvideUpdateDownloaderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.q2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30156q2 implements dagger.internal.h<com.avito.android.silent_update.download.e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f144536a;

    /* renamed from: b, reason: collision with root package name */
    public final C30102l3 f144537b;

    /* renamed from: c, reason: collision with root package name */
    public final C30214v6 f144538c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.util.R0> f144539d;

    public C30156q2(dagger.internal.l lVar, C30102l3 c30102l3, C30214v6 c30214v6, Provider provider) {
        this.f144536a = lVar;
        this.f144537b = c30102l3;
        this.f144538c = c30214v6;
        this.f144539d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Bw0.f fVar = (Bw0.f) this.f144536a.f393949a;
        Context context = (Context) this.f144537b.get();
        AK0.l lVar = (AK0.l) this.f144538c.get();
        com.avito.android.util.R0 r02 = this.f144539d.get();
        C29980a2.f144226a.getClass();
        return fVar.b(lVar, context, r02);
    }
}
