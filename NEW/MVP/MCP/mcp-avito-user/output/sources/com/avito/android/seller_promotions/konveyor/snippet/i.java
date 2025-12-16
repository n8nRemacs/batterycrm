package com.avito.android.seller_promotions.konveyor.snippet;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SnippetItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.seller_promotions.formatter.b f267857a;

    /* renamed from: b, reason: collision with root package name */
    public final l f267858b;

    public i(com.avito.android.seller_promotions.formatter.b bVar, l lVar) {
        this.f267857a = bVar;
        this.f267858b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((com.avito.android.seller_promotions.formatter.a) this.f267857a.get(), (Y41.l) this.f267858b.f393949a);
    }
}
