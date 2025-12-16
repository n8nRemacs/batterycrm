package com.avito.android.messenger.deeplink;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: SupportChatFormDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class T0 implements dagger.internal.h<S0> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.messenger.H f195429a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f195430b;

    public T0(com.avito.android.messenger.H h12, dv.b bVar) {
        this.f195429a = h12;
        this.f195430b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new S0((a.InterfaceC4053a) this.f195430b.get(), (com.avito.android.messenger.F) this.f195429a.get());
    }
}
