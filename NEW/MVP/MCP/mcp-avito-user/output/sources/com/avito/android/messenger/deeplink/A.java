package com.avito.android.messenger.deeplink;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: CreateChannelByOpponentUserDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class A implements dagger.internal.h<C32418z> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.messenger.H f195282a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f195283b;

    public A(com.avito.android.messenger.H h12, dv.b bVar) {
        this.f195282a = h12;
        this.f195283b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32418z((a.InterfaceC4053a) this.f195283b.get(), (com.avito.android.messenger.F) this.f195282a.get());
    }
}
