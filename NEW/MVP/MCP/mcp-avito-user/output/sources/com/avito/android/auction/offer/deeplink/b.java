package com.avito.android.auction.offer.deeplink;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AuctionOfferDeeplinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f92464a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f92465b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f92466c;

    /* renamed from: d, reason: collision with root package name */
    public final f f92467d;

    public b(C30102l3 c30102l3, dv.b bVar, dv.b bVar2, f fVar) {
        this.f92464a = c30102l3;
        this.f92465b = bVar;
        this.f92466c = bVar2;
        this.f92467d = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((Context) this.f92464a.get(), (a.InterfaceC4053a) this.f92465b.get(), (a.b) this.f92466c.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f92467d.get());
    }
}
