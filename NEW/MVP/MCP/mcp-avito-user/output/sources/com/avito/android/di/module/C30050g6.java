package com.avito.android.di.module;

import y40.C50054a;

/* compiled from: OfflinizationBindingsModule_OfflineAuthorizationPluginFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.g6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30050g6 implements dagger.internal.h<A3.b> {

    /* renamed from: a, reason: collision with root package name */
    public final y40.b f144304a;

    public C30050g6(y40.b bVar) {
        this.f144304a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C50054a c50054a = (C50054a) this.f144304a.get();
        C30039f6.f144289a.getClass();
        return new C30017d6(c50054a);
    }
}
