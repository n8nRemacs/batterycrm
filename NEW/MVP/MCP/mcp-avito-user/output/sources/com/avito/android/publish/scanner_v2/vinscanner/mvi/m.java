package com.avito.android.publish.scanner_v2.vinscanner.mvi;

import com.avito.android.remote.model.category_parameters.VinScanner;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VinScannerReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f239518a;

    public m(dagger.internal.l lVar) {
        this.f239518a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l((VinScanner) this.f239518a.f393949a);
    }
}
