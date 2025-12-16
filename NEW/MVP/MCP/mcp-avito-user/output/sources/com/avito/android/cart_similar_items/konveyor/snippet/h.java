package com.avito.android.cart_similar_items.konveyor.snippet;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SnippetItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.cart_similar_items.formatter.b f115895a;

    /* renamed from: b, reason: collision with root package name */
    public final l f115896b;

    public h(com.avito.android.cart_similar_items.formatter.b bVar, l lVar) {
        this.f115895a = bVar;
        this.f115896b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.cart_similar_items.formatter.a) this.f115895a.get(), (Y41.l) this.f115896b.f393949a);
    }
}
