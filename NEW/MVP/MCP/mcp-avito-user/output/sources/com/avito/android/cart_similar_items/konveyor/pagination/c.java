package com.avito.android.cart_similar_items.konveyor.pagination;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PaginationItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final e f115856a;

    public c(e eVar) {
        this.f115856a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f115856a.get());
    }
}
