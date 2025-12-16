package com.avito.android.messenger.deeplink;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: ChannelBottomSheetInputLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.deeplink.f, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32380f implements dagger.internal.h<C32378e> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f195509a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.messenger.H f195510b;

    public C32380f(com.avito.android.messenger.H h12, dv.b bVar) {
        this.f195509a = bVar;
        this.f195510b = h12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32378e((a.InterfaceC4053a) this.f195509a.get(), (com.avito.android.messenger.F) this.f195510b.get());
    }
}
