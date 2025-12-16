package com.avito.android.profile.edit.di;

import com.avito.android.photo_picker.converter.ImageConvertOptions;
import javax.inject.Provider;

/* compiled from: EditProfileModule_ProvideUploadConverterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class H implements dagger.internal.h<com.avito.android.photo_picker.converter.f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.photo_picker.converter.b> f222096a;

    /* renamed from: b, reason: collision with root package name */
    public final N70.d f222097b;

    public H(Provider provider, N70.d dVar) {
        this.f222096a = provider;
        this.f222097b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.photo_picker.converter.b bVar = this.f222096a.get();
        N70.b bVar2 = (N70.b) this.f222097b.get();
        C33319d.f222158a.getClass();
        return new com.avito.android.photo_picker.converter.d(bVar, new ImageConvertOptions(960, 1280, 90, 4194304), bVar2);
    }
}
