package com.avito.android.publish.scanner_v2.di;

import android.content.Context;
import com.avito.android.photo_picker.converter.ImageConvertOptions;
import com.avito.android.publish.scanner.BitmapConverterForGallery;
import com.avito.android.publish.scanner.i;
import com.avito.android.publish.scanner_v2.PhotoDimension;
import com.avito.android.publish.scanner_v2.ScannerOpenParams;
import com.avito.android.publish.scanner_v2.di.a;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VinScannerModule_Companion_ProvideUploadConverterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f239424a;

    /* renamed from: b, reason: collision with root package name */
    public final l f239425b;

    public h(l lVar, Provider provider) {
        this.f239424a = provider;
        this.f239425b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) ((a.c.e) this.f239424a).get();
        ScannerOpenParams scannerOpenParams = (ScannerOpenParams) this.f239425b.f393949a;
        e.f239416a.getClass();
        PhotoDimension photoDimension = scannerOpenParams.f239280d;
        return new BitmapConverterForGallery(context, new ImageConvertOptions(photoDimension.f239277c, photoDimension.f239276b, 90, 4194304));
    }
}
