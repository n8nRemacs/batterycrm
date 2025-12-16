package com.avito.android.messenger.deeplink;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: ChannelMapDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.deeplink.w, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32413w implements dagger.internal.h<C32411v> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.messenger.H f195578a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f195579b;

    public C32413w(com.avito.android.messenger.H h12, dv.b bVar) {
        this.f195578a = h12;
        this.f195579b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32411v((a.InterfaceC4053a) this.f195579b.get(), (com.avito.android.messenger.F) this.f195578a.get());
    }
}
