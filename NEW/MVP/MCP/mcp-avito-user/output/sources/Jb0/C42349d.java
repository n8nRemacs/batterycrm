package jb0;

import com.avito.android.photo_picker.converter.ImageConvertOptions;
import com.avito.android.photo_picker.converter.f;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileManagementImageModule_ProvideUploadConverterFactory.java */
@e
@y
@x
/* renamed from: jb0.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C42349d implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final C42347b f405668a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.photo_picker.converter.b> f405669b;

    /* renamed from: c, reason: collision with root package name */
    public final N70.d f405670c;

    public C42349d(C42347b c42347b, Provider provider, N70.d dVar) {
        this.f405668a = c42347b;
        this.f405669b = provider;
        this.f405670c = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.photo_picker.converter.b bVar = this.f405669b.get();
        N70.b bVar2 = (N70.b) this.f405670c.get();
        this.f405668a.getClass();
        return new com.avito.android.photo_picker.converter.d(bVar, new ImageConvertOptions(960, 1280, 90, 4194304), bVar2);
    }
}
