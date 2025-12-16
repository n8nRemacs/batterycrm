package com.avito.android.barcode.presentation.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BarcodeActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f98724a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f98725b;

    public c(dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f98724a = lVar;
        this.f98725b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((String) this.f98724a.f393949a, (String) this.f98725b.f393949a);
    }
}
