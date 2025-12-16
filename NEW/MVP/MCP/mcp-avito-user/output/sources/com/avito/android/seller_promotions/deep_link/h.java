package com.avito.android.seller_promotions.deep_link;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.seller_promotions.j;
import com.avito.android.seller_promotions.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SellerPromotionsLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final l f267683a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f267684b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f267685c;

    /* renamed from: d, reason: collision with root package name */
    public final C25721c f267686d;

    public h(l lVar, dv.b bVar, dv.b bVar2, C25721c c25721c) {
        this.f267683a = lVar;
        this.f267684b = bVar;
        this.f267685c = bVar2;
        this.f267686d = c25721c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((j) this.f267683a.get(), (a.InterfaceC4053a) this.f267684b.get(), (a.b) this.f267685c.get(), (C25719a) this.f267686d.get());
    }
}
