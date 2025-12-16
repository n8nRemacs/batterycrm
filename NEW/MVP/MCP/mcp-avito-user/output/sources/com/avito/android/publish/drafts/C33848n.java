package com.avito.android.publish.drafts;

import javax.inject.Provider;

/* compiled from: PhotoStorageCleanerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.drafts.n, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33848n implements dagger.internal.h<C33847m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.b> f235394a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.photo_storage.k f235395b;

    public C33848n(Provider provider, com.avito.android.photo_storage.k kVar) {
        this.f235394a = provider;
        this.f235395b = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C33847m(this.f235394a.get(), (com.avito.android.photo_storage.i) this.f235395b.get());
    }
}
