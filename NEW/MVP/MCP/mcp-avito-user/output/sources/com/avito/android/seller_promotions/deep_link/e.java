package com.avito.android.seller_promotions.deep_link;

import com.avito.android.deep_linking.links.PromotionsSellerLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: SellerPromotionsDeeplinkModule_Provide$_avito_seller_promotions_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final c f267672a;

    /* renamed from: b, reason: collision with root package name */
    public final h f267673b;

    public e(c cVar, h hVar) {
        this.f267672a = cVar;
        this.f267673b = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f267672a.getClass();
        b bVar = new b();
        d.f267671a.getClass();
        return new C43834a(PromotionsSellerLink.class, bVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PromotionsSellerLink.class), this.f267673b));
    }
}
