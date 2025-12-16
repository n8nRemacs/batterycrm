package com.avito.android.upload_doc.di;

import android.app.Application;
import com.avito.android.photo_storage.i;
import com.avito.android.photo_storage.k;
import com.avito.android.upload_doc.di.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GigUploadDocModule_ProvideBitmapFileProviderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<com.avito.android.photo_picker.converter.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Application> f306786a;

    /* renamed from: b, reason: collision with root package name */
    public final k f306787b;

    public g(Provider provider, k kVar) {
        this.f306786a = provider;
        this.f306787b = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) ((a.c.C9429c) this.f306786a).get();
        i iVar = (i) this.f306787b.get();
        e.f306784a.getClass();
        return new com.avito.android.photo_picker.converter.c(application.getApplicationContext(), iVar);
    }
}
