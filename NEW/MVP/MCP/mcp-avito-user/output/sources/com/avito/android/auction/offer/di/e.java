package com.avito.android.auction.offer.di;

import com.avito.android.auction.offer.di.h;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.ownership.Owners;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import gj.d;
import java.util.Collections;
import javax.inject.Provider;
import kj.C42699b;
import pj.C47099b;

/* compiled from: AuctionOfferModule_ProvideBeduinContextFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements dagger.internal.h<InterfaceC40691b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<gj.d> f92469a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f92470b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a.b> f92471c;

    public e(Provider<gj.d> provider, Provider<com.avito.android.deeplink_handler.handler.composite.a> provider2, Provider<a.b> provider3) {
        this.f92469a = provider;
        this.f92470b = provider2;
        this.f92471c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        gj.d dVarEl = ((h.b.d) this.f92469a).f92494a.El();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((h.b.f) this.f92470b).get();
        a.b bVar = (a.b) ((h.b.g) this.f92471c).get();
        c.f92468a.getClass();
        return d.a.a(dVarEl, aVar, bVar, C47099b.f428743a, null, null, null, new C42699b(null, Collections.singletonList(Owners.f210500j), "AuctionOffer", false, 8, null), 56);
    }
}
