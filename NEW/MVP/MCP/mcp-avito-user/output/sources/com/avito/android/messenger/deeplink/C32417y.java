package com.avito.android.messenger.deeplink;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: ChannelsDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.deeplink.y, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32417y implements dagger.internal.h<C32415x> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.messenger.H f195587a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.O f195588b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f195589c;

    public C32417y(com.avito.android.messenger.H h12, com.avito.android.O o12, dv.b bVar) {
        this.f195587a = h12;
        this.f195588b = o12;
        this.f195589c = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32415x((com.avito.android.messenger.F) this.f195587a.get(), (com.avito.android.L) this.f195588b.get(), (a.InterfaceC4053a) this.f195589c.get());
    }
}
