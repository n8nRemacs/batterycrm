package com.avito.android.messenger.deeplink;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: ChannelDetailsDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.deeplink.t, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32407t implements dagger.internal.h<C32405s> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.messenger.H f195568a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f195569b;

    public C32407t(com.avito.android.messenger.H h12, dv.b bVar) {
        this.f195568a = h12;
        this.f195569b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32405s((a.InterfaceC4053a) this.f195569b.get(), (com.avito.android.messenger.F) this.f195568a.get());
    }
}
