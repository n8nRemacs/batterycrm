package com.avito.android.beduin.di;

import android.app.Application;
import javax.inject.Provider;

/* compiled from: BeduinPhotoPickerModule_ProvideBitmapFileProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class P implements dagger.internal.h<com.avito.android.photo_picker.converter.b> {

    /* renamed from: a, reason: collision with root package name */
    public final O f103909a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Application> f103910b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.photo_storage.k f103911c;

    public P(O o12, Provider provider, com.avito.android.photo_storage.k kVar) {
        this.f103909a = o12;
        this.f103910b = provider;
        this.f103911c = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = this.f103910b.get();
        com.avito.android.photo_storage.i iVar = (com.avito.android.photo_storage.i) this.f103911c.get();
        this.f103909a.getClass();
        return new com.avito.android.photo_picker.converter.c(application, iVar);
    }
}
