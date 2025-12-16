package com.avito.android.wallet.page.deeplink;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WalletServiceBalanceLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f327785a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.wallet.page.e f327786b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f327787c;

    public h(dv.b bVar, com.avito.android.wallet.page.e eVar, dv.b bVar2) {
        this.f327785a = bVar;
        this.f327786b = eVar;
        this.f327787c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((a.InterfaceC4053a) this.f327785a.get(), (com.avito.android.wallet.page.c) this.f327786b.get(), (a.b) this.f327787c.get());
    }
}
