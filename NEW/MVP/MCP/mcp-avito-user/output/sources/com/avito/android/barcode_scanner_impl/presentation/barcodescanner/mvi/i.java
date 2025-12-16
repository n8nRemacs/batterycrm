package com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi;

import ch.InterfaceC27193a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BarcodeScannerBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f99013a;

    public i(u uVar) {
        this.f99013a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((InterfaceC27193a) this.f99013a.get());
    }
}
