package com.avito.android.di.module;

import javax.inject.Provider;

/* compiled from: AppendingLoaderModule_ProvideAppendingLoaderItemBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class X0 implements dagger.internal.h<com.avito.android.home.appending_item.loader.d> {

    /* renamed from: a, reason: collision with root package name */
    public final V0 f144184a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.home.appending_item.loader.f> f144185b;

    public X0(V0 v02, Provider<com.avito.android.home.appending_item.loader.f> provider) {
        this.f144184a = v02;
        this.f144185b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.home.appending_item.loader.f fVar = this.f144185b.get();
        this.f144184a.getClass();
        return new com.avito.android.home.appending_item.loader.d(fVar);
    }
}
