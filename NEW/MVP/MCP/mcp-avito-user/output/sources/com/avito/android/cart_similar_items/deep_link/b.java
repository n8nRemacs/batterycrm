package com.avito.android.cart_similar_items.deep_link;

import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CartSimilarItemsDeeplinkModule_Provide$_avito_cart_similar_items_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final h f115718a;

    /* renamed from: b, reason: collision with root package name */
    public final e f115719b;

    public b(h hVar, e eVar) {
        this.f115718a = hVar;
        this.f115719b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f115718a.getClass();
        g gVar = new g();
        a.f115717a.getClass();
        return new C43834a(CartSimilarItemsLink.class, gVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(CartSimilarItemsLink.class), this.f115719b));
    }
}
