package com.avito.android.profile.user_profile.di;

import android.app.Application;
import com.avito.android.profile.user_profile.di.C33370a;
import javax.inject.Provider;

/* compiled from: UserProfileModule_ProvideBitmapFileProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<com.avito.android.photo_picker.converter.b> {

    /* renamed from: a, reason: collision with root package name */
    public final f f226102a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Application> f226103b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.photo_storage.k f226104c;

    public k(f fVar, Provider provider, com.avito.android.photo_storage.k kVar) {
        this.f226102a = fVar;
        this.f226103b = provider;
        this.f226104c = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) ((C33370a.c.C33376h) this.f226103b).get();
        com.avito.android.photo_storage.i iVar = (com.avito.android.photo_storage.i) this.f226104c.get();
        this.f226102a.getClass();
        return new com.avito.android.photo_picker.converter.c(application.getApplicationContext(), iVar);
    }
}
