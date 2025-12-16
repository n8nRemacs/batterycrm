package com.avito.android.seller_promotions.konveyor.pagination;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PaginationItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final e f267817a;

    public c(e eVar) {
        this.f267817a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f267817a.get());
    }
}
