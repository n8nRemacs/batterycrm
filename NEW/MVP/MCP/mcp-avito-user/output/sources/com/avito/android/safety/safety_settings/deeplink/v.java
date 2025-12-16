package com.avito.android.safety.safety_settings.deeplink;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: SessionsInfoSyncLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class v implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.safety.sessions.i f257600a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f257601b;

    public v(com.avito.android.safety.sessions.i iVar, dv.b bVar) {
        this.f257600a = iVar;
        this.f257601b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new u((com.avito.android.safety.sessions.g) this.f257600a.get(), (a.InterfaceC4053a) this.f257601b.get());
    }
}
