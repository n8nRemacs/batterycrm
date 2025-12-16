package com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi;

import ch.InterfaceC27193a;
import com.avito.android.barcode_scanner_public.BarcodeScannerParams;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BarcodeScannerActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f99005a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC27193a> f99006b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.barcode_scanner_impl.domain.e> f99007c;

    /* renamed from: d, reason: collision with root package name */
    public final u f99008d;

    public g(dagger.internal.l lVar, u uVar, Provider provider, Provider provider2) {
        this.f99005a = lVar;
        this.f99006b = provider;
        this.f99007c = provider2;
        this.f99008d = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((BarcodeScannerParams) this.f99005a.f393949a, this.f99006b.get(), this.f99007c.get(), (j) this.f99008d.get());
    }
}
