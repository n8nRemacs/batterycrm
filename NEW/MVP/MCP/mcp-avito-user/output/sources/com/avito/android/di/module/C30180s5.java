package com.avito.android.di.module;

import android.app.Application;
import javax.inject.Provider;

/* compiled from: ImageUploadServiceModule_ProvideBitmapFileProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.s5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30180s5 implements dagger.internal.h<com.avito.android.photo_picker.converter.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Application> f144576a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.photo_storage.k f144577b;

    public C30180s5(Provider provider, com.avito.android.photo_storage.k kVar) {
        this.f144576a = provider;
        this.f144577b = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = this.f144576a.get();
        com.avito.android.photo_storage.i iVar = (com.avito.android.photo_storage.i) this.f144577b.get();
        C30169r5 c30169r5 = C30169r5.f144559a;
        return new com.avito.android.photo_picker.converter.c(application.getApplicationContext(), iVar);
    }
}
