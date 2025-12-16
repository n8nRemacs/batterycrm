package com.avito.android.di.module;

import android.content.ContentResolver;
import com.avito.android.util.InterfaceC35827k0;
import javax.inject.Provider;

/* compiled from: PhotoContentProviderModule_ProvidePhotoContentProviderDelegate$_avito_photo_picker_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class G6 implements dagger.internal.h<InterfaceC35827k0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f143972a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.db.f> f143973b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f143974c;

    public G6(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f143972a = provider;
        this.f143973b = provider2;
        this.f143974c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.util.C c12 = this.f143972a.get();
        com.avito.android.db.f fVar = this.f143973b.get();
        ContentResolver contentResolver = (ContentResolver) this.f143974c.f393949a;
        int i12 = F6.f143955a;
        return new com.avito.android.photo_picker.legacy.provider.a(fVar, c12, contentResolver);
    }
}
