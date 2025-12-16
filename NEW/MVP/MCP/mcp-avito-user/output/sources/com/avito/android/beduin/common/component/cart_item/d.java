package com.avito.android.beduin.common.component.cart_item;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BeduinCartItemComponentFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f100901a;

    public d(dagger.internal.f fVar) {
        this.f100901a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(dagger.internal.g.b(this.f100901a));
    }
}
