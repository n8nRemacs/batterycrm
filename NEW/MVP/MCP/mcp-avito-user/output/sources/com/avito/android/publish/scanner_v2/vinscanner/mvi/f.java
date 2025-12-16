package com.avito.android.publish.scanner_v2.vinscanner.mvi;

import com.avito.android.publish.R0;
import com.avito.android.remote.model.category_parameters.VinScanner;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VinScannerActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f239506a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f239507b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.util.R0> f239508c;

    public f(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f239506a = provider;
        this.f239507b = lVar;
        this.f239508c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f239506a.get(), (VinScanner) this.f239507b.f393949a, this.f239508c.get());
    }
}
