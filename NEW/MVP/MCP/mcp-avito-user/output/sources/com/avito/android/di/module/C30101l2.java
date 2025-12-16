package com.avito.android.di.module;

import android.content.Context;

/* compiled from: BuildDependenciesModule_ProvidePermissionsActivityIntentFactoryFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.l2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30101l2 implements dagger.internal.h<com.avito.android.silent_update.permissions.c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f144382a;

    /* renamed from: b, reason: collision with root package name */
    public final C30102l3 f144383b;

    public C30101l2(dagger.internal.l lVar, C30102l3 c30102l3) {
        this.f144382a = lVar;
        this.f144383b = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Bw0.f fVar = (Bw0.f) this.f144382a.f393949a;
        Context context = (Context) this.f144383b.get();
        C29980a2.f144226a.getClass();
        return fVar.d(context);
    }
}
