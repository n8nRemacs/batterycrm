package com.avito.android.comfortable_deal.deeplink;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.P;
import com.avito.android.S;
import com.avito.android.deeplink_handler.view.a;
import javax.inject.Provider;

/* compiled from: ComfortableDealDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class m implements dagger.internal.h<C29470k> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f121966a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.webview.n f121967b;

    /* renamed from: c, reason: collision with root package name */
    public final C25721c f121968c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f121969d;

    /* renamed from: e, reason: collision with root package name */
    public final S f121970e;

    public m(dv.b bVar, com.avito.android.webview.n nVar, C25721c c25721c, Provider provider, S s5) {
        this.f121966a = bVar;
        this.f121967b = nVar;
        this.f121968c = c25721c;
        this.f121969d = provider;
        this.f121970e = s5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C29470k((a.InterfaceC4053a) this.f121966a.get(), (com.avito.android.webview.l) this.f121967b.get(), (C25719a) this.f121968c.get(), this.f121969d.get(), (P) this.f121970e.get());
    }
}
