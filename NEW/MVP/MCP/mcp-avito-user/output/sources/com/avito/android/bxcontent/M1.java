package com.avito.android.bxcontent;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: ItemsSearchLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class M1 implements dagger.internal.h<L1> {

    /* renamed from: a, reason: collision with root package name */
    public final C29245q0 f109363a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.O f109364b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f109365c;

    public M1(C29245q0 c29245q0, com.avito.android.O o12, dv.b bVar) {
        this.f109363a = c29245q0;
        this.f109364b = o12;
        this.f109365c = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new L1((BxContentIntentFactory) this.f109363a.get(), (com.avito.android.L) this.f109364b.get(), (a.InterfaceC4053a) this.f109365c.get());
    }
}
