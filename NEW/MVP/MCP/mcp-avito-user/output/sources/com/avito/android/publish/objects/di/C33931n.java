package com.avito.android.publish.objects.di;

import com.avito.android.publish.details.C33681c;
import com.avito.android.publish.details.InterfaceC33685d0;
import com.avito.android.util.L0;

/* compiled from: ImageUploadModule_ProvideInsertPhotoInteractorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.objects.di.n, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33931n implements dagger.internal.h<InterfaceC33685d0> {

    /* renamed from: a, reason: collision with root package name */
    public final C33930m f238014a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f238015b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f238016c;

    public C33931n(C33930m c33930m, dagger.internal.u uVar, dagger.internal.u uVar2) {
        this.f238014a = c33930m;
        this.f238015b = uVar;
        this.f238016c = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C33681c(this.f238014a.f238013a, (com.avito.android.photo_cache.b) this.f238015b.get(), (L0) this.f238016c.get());
    }
}
