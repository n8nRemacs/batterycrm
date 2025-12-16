package com.avito.android.autoteka.items.purchaseViaStandalone;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PurchaseViaStandaloneBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f96941a;

    public b(f fVar) {
        this.f96941a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f96941a.get());
    }
}
