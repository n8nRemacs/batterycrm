package com.avito.android.photo_picker;

import android.app.Application;
import javax.inject.Provider;

/* compiled from: UploadConverterProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class T implements dagger.internal.h<S> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Application> f218873a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.photo_storage.k f218874b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.photo_picker.converter.b> f218875c;

    /* renamed from: d, reason: collision with root package name */
    public final N70.d f218876d;

    public T(Provider provider, com.avito.android.photo_storage.k kVar, Provider provider2, N70.d dVar) {
        this.f218873a = provider;
        this.f218874b = kVar;
        this.f218875c = provider2;
        this.f218876d = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new S(this.f218873a.get(), (com.avito.android.photo_storage.i) this.f218874b.get(), this.f218875c.get(), (N70.b) this.f218876d.get());
    }
}
