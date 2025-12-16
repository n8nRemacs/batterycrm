package com.avito.android.di.module;

import com.avito.android.service.d;

/* compiled from: ImageUploadServiceModule_ProvideServiceCountdownHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.u5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30202u5 implements dagger.internal.h<com.avito.android.service.d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f144614a;

    public C30202u5(dagger.internal.l lVar) {
        this.f144614a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d.a aVar = (d.a) this.f144614a.f393949a;
        C30169r5 c30169r5 = C30169r5.f144559a;
        return new com.avito.android.service.e("ImageUploadService", aVar);
    }
}
