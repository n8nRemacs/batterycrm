package com.avito.android.services_portfolio.project.seller.deeplink;

import bv0.C25723b;
import bv0.InterfaceC25722a;
import com.avito.android.B2;
import com.avito.android.D2;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServicesPortfolioProjectSellerLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f280211a;

    /* renamed from: b, reason: collision with root package name */
    public final D2 f280212b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f280213c;

    /* renamed from: d, reason: collision with root package name */
    public final C25723b f280214d;

    public d(dv.b bVar, D2 d22, dv.b bVar2, C25723b c25723b) {
        this.f280211a = bVar;
        this.f280212b = d22;
        this.f280213c = bVar2;
        this.f280214d = c25723b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.InterfaceC4053a) this.f280211a.get(), (B2) this.f280212b.get(), (a.b) this.f280213c.get(), (InterfaceC25722a) this.f280214d.get());
    }
}
