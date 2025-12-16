package com.avito.android.bxcontent;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: ItemListLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class J1 implements dagger.internal.h<I1> {

    /* renamed from: a, reason: collision with root package name */
    public final C29245q0 f109351a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f109352b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.location.A f109353c;

    public J1(C29245q0 c29245q0, dv.b bVar, com.avito.android.location.A a12) {
        this.f109351a = c29245q0;
        this.f109352b = bVar;
        this.f109353c = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new I1((BxContentIntentFactory) this.f109351a.get(), (a.InterfaceC4053a) this.f109352b.get(), (com.avito.android.location.r) this.f109353c.get());
    }
}
