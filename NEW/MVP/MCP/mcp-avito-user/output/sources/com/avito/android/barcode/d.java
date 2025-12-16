package com.avito.android.barcode;

import android.app.Application;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BarcodeIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f98654a;

    public d(l lVar) {
        this.f98654a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((Application) this.f98654a.f393949a);
    }
}
