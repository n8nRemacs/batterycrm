package com.avito.android.publish.objects.di;

import com.avito.android.util.InterfaceC35745a5;

/* compiled from: ImageUploadModule_ProvideUploadingProgressInteractor$_avito_publish_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.objects.di.q, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33934q implements dagger.internal.h<com.avito.android.photo_cache.j> {

    /* renamed from: a, reason: collision with root package name */
    public final C33930m f238025a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f238026b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f238027c;

    public C33934q(C33930m c33930m, dagger.internal.u uVar, dagger.internal.u uVar2) {
        this.f238025a = c33930m;
        this.f238026b = uVar;
        this.f238027c = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new com.avito.android.photo_cache.n(this.f238025a.f238013a, (com.avito.android.photo_cache.b) this.f238026b.get(), (InterfaceC35745a5) this.f238027c.get());
    }
}
