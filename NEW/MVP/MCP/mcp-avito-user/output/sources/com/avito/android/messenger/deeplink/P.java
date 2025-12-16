package com.avito.android.messenger.deeplink;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: CreateChannelWithAvitoDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class P implements dagger.internal.h<O> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.messenger.H f195400a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f195401b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f195402c;

    public P(com.avito.android.messenger.H h12, dv.b bVar, dv.b bVar2) {
        this.f195400a = h12;
        this.f195401b = bVar;
        this.f195402c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new O((com.avito.android.messenger.F) this.f195400a.get(), (a.b) this.f195401b.get(), (a.InterfaceC4053a) this.f195402c.get());
    }
}
