package com.avito.android.beduin.common.component.cart_icon;

import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import mU.C44012a;
import mU.C44013b;

/* compiled from: BeduinCartIconViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final l f100875a;

    /* renamed from: b, reason: collision with root package name */
    public final C44013b f100876b;

    public g(l lVar, C44013b c44013b) {
        this.f100875a = lVar;
        this.f100876b = c44013b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.deeplink_handler.handler.composite.a) this.f100875a.f393949a, (C44012a) this.f100876b.get());
    }
}
