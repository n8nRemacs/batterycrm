package com.avito.android.upload_doc.di;

import com.avito.android.photo_picker.converter.ImageConvertOptions;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GigUploadDocModule_ProvideUploadConverterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<com.avito.android.photo_picker.converter.f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.photo_picker.converter.b> f306788a;

    /* renamed from: b, reason: collision with root package name */
    public final N70.d f306789b;

    public h(Provider provider, N70.d dVar) {
        this.f306788a = provider;
        this.f306789b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.photo_picker.converter.b bVar = this.f306788a.get();
        N70.b bVar2 = (N70.b) this.f306789b.get();
        e.f306784a.getClass();
        return new com.avito.android.photo_picker.converter.d(bVar, new ImageConvertOptions(2048, 2048, 90, 8388608), bVar2);
    }
}
