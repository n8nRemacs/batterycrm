package com.avito.android.barcode_scanner_impl.di;

import android.content.Context;
import android.os.Vibrator;
import com.avito.android.barcode_scanner_impl.di.j;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BarcodeScannerModule_VibrateHelperFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<ch.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f98889a;

    public i(Provider<Context> provider) {
        this.f98889a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) ((j.b.C2981b) this.f98889a).get();
        d.f98884a.getClass();
        return new ch.d((Vibrator) androidx.core.content.d.getSystemService(context, Vibrator.class));
    }
}
