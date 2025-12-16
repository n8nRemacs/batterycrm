package com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi;

import com.avito.android.barcode_scanner_public.BarcodeScannerParams;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BarcodeScannerOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f99030a;

    /* renamed from: b, reason: collision with root package name */
    public final u f99031b;

    public q(dagger.internal.l lVar, u uVar) {
        this.f99030a = lVar;
        this.f99031b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new p((BarcodeScannerParams) this.f99030a.f393949a, (com.avito.android.barcode_scanner_impl.domain.a) this.f99031b.get());
    }
}
