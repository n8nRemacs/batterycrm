package com.avito.android.autoteka.items.choosingProduct;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ChoosingProductBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f96711a;

    public b(f fVar) {
        this.f96711a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f96711a.get());
    }
}
