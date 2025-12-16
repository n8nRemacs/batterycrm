package com.avito.android.di.module;

/* compiled from: AppendingLoaderModule_ProvideAppendingLargeLoaderItemBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class W0 implements dagger.internal.h<com.avito.android.home.appending_item.loader.b> {

    /* renamed from: a, reason: collision with root package name */
    public final V0 f144165a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f144166b;

    public W0(V0 v02, dagger.internal.u uVar) {
        this.f144165a = v02;
        this.f144166b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.home.appending_item.loader.f fVar = (com.avito.android.home.appending_item.loader.f) this.f144166b.get();
        this.f144165a.getClass();
        return new com.avito.android.home.appending_item.loader.b(fVar);
    }
}
