package com.avito.android.profile.deep_linking;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: ProfileLinkSyncHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class v implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final l90.q f221930a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f221931b;

    public v(l90.q qVar, dv.b bVar) {
        this.f221930a = qVar;
        this.f221931b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new u((l90.o) this.f221930a.get(), (a.InterfaceC4053a) this.f221931b.get());
    }
}
