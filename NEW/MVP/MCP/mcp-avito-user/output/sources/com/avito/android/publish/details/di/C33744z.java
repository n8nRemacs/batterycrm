package com.avito.android.publish.details.di;

import javax.inject.Provider;

/* compiled from: PublishDetailsIacModule_ProvideMicPermissionBlockItemBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.details.di.z, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33744z implements dagger.internal.h<com.avito.android.publish.items.mic_permission_block.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.items.mic_permission_block.c> f234606a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f234607b;

    public C33744z(dagger.internal.u uVar, Provider provider) {
        this.f234606a = provider;
        this.f234607b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.items.mic_permission_block.c cVar = this.f234606a.get();
        u3.l lVar = (u3.l) this.f234607b.get();
        C33743y.f234604a.getClass();
        return new com.avito.android.publish.items.mic_permission_block.a(cVar, lVar);
    }
}
