package com.avito.android.barcode.presentation.mvi;

import com.avito.android.barcode_encoder.BarcodeFormat;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BarcodeBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f98733a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f98734b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f98735c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f98736d;

    public e(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, dagger.internal.l lVar4) {
        this.f98733a = lVar;
        this.f98734b = lVar2;
        this.f98735c = lVar3;
        this.f98736d = lVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((BarcodeFormat) this.f98736d.f393949a, (String) this.f98733a.f393949a, (String) this.f98734b.f393949a, (String) this.f98735c.f393949a);
    }
}
