package com.avito.android.wallet.page.deeplink;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WalletPageLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f327782a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.wallet.page.e f327783b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f327784c;

    public e(dv.b bVar, com.avito.android.wallet.page.e eVar, dv.b bVar2) {
        this.f327782a = bVar;
        this.f327783b = eVar;
        this.f327784c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((a.InterfaceC4053a) this.f327782a.get(), (com.avito.android.wallet.page.c) this.f327783b.get(), (a.b) this.f327784c.get());
    }
}
