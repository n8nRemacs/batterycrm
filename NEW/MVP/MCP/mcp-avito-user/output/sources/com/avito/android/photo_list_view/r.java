package com.avito.android.photo_list_view;

import javax.inject.Provider;

/* compiled from: ImageListPhotoInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class r implements dagger.internal.h<C33223q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.b> f218179a;

    public r(Provider<com.avito.android.photo_cache.b> provider) {
        this.f218179a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C33223q(this.f218179a.get());
    }
}
