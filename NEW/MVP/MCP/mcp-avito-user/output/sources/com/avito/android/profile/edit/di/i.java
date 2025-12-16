package com.avito.android.profile.edit.di;

import android.app.Application;
import com.avito.android.profile.edit.di.C33316a;
import javax.inject.Provider;

/* compiled from: EditProfileModule_ProvideBitmapFileProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<com.avito.android.photo_picker.converter.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Application> f222167a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.photo_storage.k f222168b;

    public i(Provider provider, com.avito.android.photo_storage.k kVar) {
        this.f222167a = provider;
        this.f222168b = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) ((C33316a.c.C6720c) this.f222167a).get();
        com.avito.android.photo_storage.i iVar = (com.avito.android.photo_storage.i) this.f222168b.get();
        C33319d.f222158a.getClass();
        return new com.avito.android.photo_picker.converter.c(application.getApplicationContext(), iVar);
    }
}
