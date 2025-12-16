package com.avito.android.beduin.common.component.barcode;

import Pg.C14782a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BeduinBarcodeComponentFactory_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final C14782a f100767a;

    public d(C14782a c14782a) {
        this.f100767a = c14782a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((Pg.c) this.f100767a.get());
    }
}
