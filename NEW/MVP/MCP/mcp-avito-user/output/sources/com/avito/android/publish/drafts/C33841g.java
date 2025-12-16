package com.avito.android.publish.drafts;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: DraftPhotosWiperImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.drafts.g, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33841g implements dagger.internal.h<C33840f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.b> f235372a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.photo_storage.k f235373b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f235374c;

    public C33841g(Provider provider, com.avito.android.photo_storage.k kVar, Provider provider2) {
        this.f235372a = provider;
        this.f235373b = kVar;
        this.f235374c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C33840f(this.f235372a.get(), (com.avito.android.photo_storage.i) this.f235373b.get(), this.f235374c.get());
    }
}
