package com.avito.android.publish.scanner.di;

import android.content.Context;
import com.avito.android.publish.scanner.BitmapConverterForGallery;
import com.avito.android.publish.scanner.ScannerParams;
import com.avito.android.publish.scanner.di.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ScannerModule_ProvideUploadConverterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<com.avito.android.publish.scanner.i> {

    /* renamed from: a, reason: collision with root package name */
    public final f f239202a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Context> f239203b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f239204c;

    public j(f fVar, Provider provider, dagger.internal.l lVar) {
        this.f239202a = fVar;
        this.f239203b = provider;
        this.f239204c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) ((a.c.C7189c) this.f239203b).get();
        ScannerParams scannerParams = (ScannerParams) this.f239204c.f393949a;
        this.f239202a.getClass();
        return new BitmapConverterForGallery(context, scannerParams.f239143b);
    }
}
