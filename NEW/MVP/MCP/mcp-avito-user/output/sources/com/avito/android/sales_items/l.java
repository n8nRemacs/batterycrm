package com.avito.android.sales_items;

import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FavoriteSalesCounterLoaderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final u f258240a;

    public l(u uVar) {
        this.f258240a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(dagger.internal.g.a(w.a(this.f258240a)));
    }
}
