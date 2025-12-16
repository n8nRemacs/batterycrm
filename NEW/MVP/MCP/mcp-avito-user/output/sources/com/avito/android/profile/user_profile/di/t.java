package com.avito.android.profile.user_profile.di;

import com.avito.android.photo_picker.converter.ImageConvertOptions;
import javax.inject.Provider;

/* compiled from: UserProfileModule_ProvideUploadConverterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class t implements dagger.internal.h<com.avito.android.photo_picker.converter.f> {

    /* renamed from: a, reason: collision with root package name */
    public final f f226125a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.photo_picker.converter.b> f226126b;

    /* renamed from: c, reason: collision with root package name */
    public final N70.d f226127c;

    public t(f fVar, Provider provider, N70.d dVar) {
        this.f226125a = fVar;
        this.f226126b = provider;
        this.f226127c = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.photo_picker.converter.b bVar = this.f226126b.get();
        N70.b bVar2 = (N70.b) this.f226127c.get();
        this.f226125a.getClass();
        return new com.avito.android.photo_picker.converter.d(bVar, new ImageConvertOptions(960, 1280, 90, 4194304), bVar2);
    }
}
