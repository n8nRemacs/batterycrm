package com.avito.android.barcode_scanner_impl.di;

import ch.C27194b;
import ch.InterfaceC27193a;
import com.avito.android.barcode_scanner_impl.di.j;
import com.avito.android.permissions.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BarcodeScannerModule_BindCameraPermissionHelperFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<InterfaceC27193a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<u> f98887a;

    public g(Provider<u> provider) {
        this.f98887a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        u uVar = (u) ((j.b.c) this.f98887a).get();
        d.f98884a.getClass();
        return new C27194b(uVar);
    }
}
