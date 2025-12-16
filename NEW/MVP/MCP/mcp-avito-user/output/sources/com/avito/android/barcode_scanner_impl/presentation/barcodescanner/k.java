package com.avito.android.barcode_scanner_impl.presentation.barcodescanner;

import com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.n;
import com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.o;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: BarcodeScannerViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final o f98959a;

    public k(o oVar) {
        this.f98959a = oVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        n nVar = (n) this.f98959a.get();
        i2.f411430a.getClass();
        return new j(nVar, i2.a.f411433c);
    }
}
