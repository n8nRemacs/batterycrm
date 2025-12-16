package com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BarcodeScannerClickStreamTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f99015a;

    public l(Provider<InterfaceC28373a> provider) {
        this.f99015a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f99015a.get());
    }
}
