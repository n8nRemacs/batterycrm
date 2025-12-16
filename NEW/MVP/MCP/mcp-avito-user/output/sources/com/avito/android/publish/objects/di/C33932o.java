package com.avito.android.publish.objects.di;

import android.app.Application;

/* compiled from: ImageUploadModule_ProvidePhotoInteractor$_avito_publish_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.objects.di.o, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33932o implements dagger.internal.h<com.avito.android.photo_cache.b> {

    /* renamed from: a, reason: collision with root package name */
    public final C33930m f238017a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f238018b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f238019c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f238020d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f238021e;

    public C33932o(C33930m c33930m, dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3, dagger.internal.u uVar4) {
        this.f238017a = c33930m;
        this.f238018b = uVar;
        this.f238019c = uVar2;
        this.f238020d = uVar3;
        this.f238021e = uVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f238018b.get();
        com.avito.android.util.C c12 = (com.avito.android.util.C) this.f238019c.get();
        com.avito.android.photo_cache.a aVar = (com.avito.android.photo_cache.a) this.f238020d.get();
        com.avito.android.computer_vision.a aVar2 = (com.avito.android.computer_vision.a) this.f238021e.get();
        this.f238017a.getClass();
        return new com.avito.android.photo_cache.c(application.getMainLooper(), aVar, c12, application.getContentResolver(), new C33929l(aVar2));
    }
}
