package com.avito.android.virtual_deal_room.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ClientRoomDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class k implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f326464a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f326465b;

    /* renamed from: c, reason: collision with root package name */
    public final LN0.c f326466c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.beduin.v2.page.impl.x f326467d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f326468e;

    public k(dv.b bVar, dv.b bVar2, LN0.c cVar, com.avito.android.beduin.v2.page.impl.x xVar, Provider provider) {
        this.f326464a = bVar;
        this.f326465b = bVar2;
        this.f326466c = cVar;
        this.f326467d = xVar;
        this.f326468e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((a.InterfaceC4053a) this.f326464a.get(), (a.b) this.f326465b.get(), (LN0.a) this.f326466c.get(), (com.avito.android.beduin.v2.page.o) this.f326467d.get(), this.f326468e.get());
    }
}
