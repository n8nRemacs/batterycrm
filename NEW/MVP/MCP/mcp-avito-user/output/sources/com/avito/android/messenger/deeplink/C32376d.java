package com.avito.android.messenger.deeplink;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: BlockUserWithReasonDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.deeplink.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32376d implements dagger.internal.h<C32374c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.messenger.H f195502a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f195503b;

    public C32376d(com.avito.android.messenger.H h12, dv.b bVar) {
        this.f195502a = h12;
        this.f195503b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32374c((a.InterfaceC4053a) this.f195503b.get(), (com.avito.android.messenger.F) this.f195502a.get());
    }
}
