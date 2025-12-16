package com.avito.android.di.module;

import android.app.Application;
import javax.inject.Provider;

/* compiled from: PhotoPickerStorageModule_ProvidePhotoInteractorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class M6 implements dagger.internal.h<com.avito.android.photo_cache.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f144062a;

    /* renamed from: b, reason: collision with root package name */
    public final s80.c f144063b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f144064c;

    public M6(Provider provider, s80.c cVar, dagger.internal.l lVar) {
        this.f144062a = provider;
        this.f144063b = cVar;
        this.f144064c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.util.C c12 = this.f144062a.get();
        com.avito.android.photo_cache.a aVar = (com.avito.android.photo_cache.a) this.f144063b.get();
        Application application = (Application) this.f144064c.f393949a;
        int i12 = L6.f144048a;
        return new com.avito.android.photo_cache.c(application.getMainLooper(), aVar, c12, application.getContentResolver(), null, 16, null);
    }
}
