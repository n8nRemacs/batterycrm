package com.avito.android.comfortable_deal.deeplink;

import com.avito.android.deeplink_handler.view.a;
import javax.inject.Provider;

/* compiled from: ComfortableDealOfferDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f121974a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.webview.n f121975b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f121976c;

    public p(dv.b bVar, com.avito.android.webview.n nVar, Provider provider) {
        this.f121974a = bVar;
        this.f121975b = nVar;
        this.f121976c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o((a.InterfaceC4053a) this.f121974a.get(), (com.avito.android.webview.l) this.f121975b.get(), this.f121976c.get());
    }
}
