package com.avito.android.beduin.common.component.cart_item;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BeduinCartItemExtractionStrategy_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f100903a;

    public f(dagger.internal.f fVar) {
        this.f100903a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(dagger.internal.g.b(this.f100903a));
    }
}
