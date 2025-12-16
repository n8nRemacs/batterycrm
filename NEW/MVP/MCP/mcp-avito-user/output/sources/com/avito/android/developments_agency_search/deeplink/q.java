package com.avito.android.developments_agency_search.deeplink;

import com.avito.android.P;
import com.avito.android.S;
import com.avito.android.deeplink_handler.view.a;

/* compiled from: MortgageProApplicationLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f136457a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.webview.n f136458b;

    /* renamed from: c, reason: collision with root package name */
    public final S f136459c;

    public q(dv.b bVar, com.avito.android.webview.n nVar, S s5) {
        this.f136457a = bVar;
        this.f136458b = nVar;
        this.f136459c = s5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p((a.InterfaceC4053a) this.f136457a.get(), (com.avito.android.webview.l) this.f136458b.get(), (P) this.f136459c.get());
    }
}
