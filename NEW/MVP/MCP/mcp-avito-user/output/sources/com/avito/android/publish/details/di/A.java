package com.avito.android.publish.details.di;

import javax.inject.Provider;

/* compiled from: PublishDetailsIacModule_ProvidePublishMicPermissionBlockItemBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class A implements dagger.internal.h<com.avito.android.publish.items.mic_permission_block.re23.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.items.mic_permission_block.re23.c> f233604a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f233605b;

    public A(dagger.internal.u uVar, Provider provider) {
        this.f233604a = provider;
        this.f233605b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.items.mic_permission_block.re23.c cVar = this.f233604a.get();
        u3.l lVar = (u3.l) this.f233605b.get();
        C33743y.f234604a.getClass();
        return new com.avito.android.publish.items.mic_permission_block.re23.a(cVar, lVar);
    }
}
