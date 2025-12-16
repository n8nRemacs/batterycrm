package com.avito.android.safety.safety_settings.deeplink;

import com.avito.android.deeplink_handler.view.a;
import po0.InterfaceC47119a;

/* compiled from: SessionsSocialLogoutSyncLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class y implements dagger.internal.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.safety.sessions.m f257605a;

    /* renamed from: b, reason: collision with root package name */
    public final fo0.g f257606b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f257607c;

    public y(com.avito.android.safety.sessions.m mVar, fo0.g gVar, dv.b bVar) {
        this.f257605a = mVar;
        this.f257606b = gVar;
        this.f257607c = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new w((com.avito.android.safety.sessions.k) this.f257605a.get(), (InterfaceC47119a) this.f257606b.get(), (a.InterfaceC4053a) this.f257607c.get());
    }
}
