package com.avito.android.wallet.page.deeplink;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TopUpFormDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f327773a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.wallet.page.e f327774b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f327775c;

    public b(dv.b bVar, com.avito.android.wallet.page.e eVar, dv.b bVar2) {
        this.f327773a = bVar;
        this.f327774b = eVar;
        this.f327775c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.InterfaceC4053a) this.f327773a.get(), (com.avito.android.wallet.page.c) this.f327774b.get(), (a.b) this.f327775c.get());
    }
}
