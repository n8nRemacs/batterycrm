package com.avito.android.publish.objects.di;

import com.avito.android.photo_list_view.C33223q;
import com.avito.android.photo_list_view.InterfaceC33220n;
import javax.inject.Provider;

/* compiled from: ImageListUploadModule_ProvideImageListPhotoInteractorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.objects.di.h, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33925h implements dagger.internal.h<InterfaceC33220n> {

    /* renamed from: a, reason: collision with root package name */
    public final C33921d f237998a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.b> f237999b;

    public C33925h(C33921d c33921d, Provider<com.avito.android.photo_cache.b> provider) {
        this.f237998a = c33921d;
        this.f237999b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.photo_cache.b bVar = this.f237999b.get();
        this.f237998a.getClass();
        return new C33223q(bVar);
    }
}
