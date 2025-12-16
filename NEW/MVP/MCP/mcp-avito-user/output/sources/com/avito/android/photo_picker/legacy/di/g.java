package com.avito.android.photo_picker.legacy.di;

import android.app.Application;
import com.avito.android.photo_picker.legacy.di.a;
import javax.inject.Provider;

/* compiled from: PhotoPickerModule_ProvideBitmapFileProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<com.avito.android.photo_picker.converter.b> {

    /* renamed from: a, reason: collision with root package name */
    public final f f219726a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Application> f219727b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.photo_storage.k f219728c;

    public g(f fVar, Provider provider, com.avito.android.photo_storage.k kVar) {
        this.f219726a = fVar;
        this.f219727b = provider;
        this.f219728c = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) ((a.c.C6606a) this.f219727b).get();
        com.avito.android.photo_storage.i iVar = (com.avito.android.photo_storage.i) this.f219728c.get();
        this.f219726a.getClass();
        return new com.avito.android.photo_picker.converter.c(application, iVar);
    }
}
