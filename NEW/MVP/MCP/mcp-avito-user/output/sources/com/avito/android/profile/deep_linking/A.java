package com.avito.android.profile.deep_linking;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: RemoveProfileLinkSyncHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class A implements dagger.internal.h<z> {

    /* renamed from: a, reason: collision with root package name */
    public final l90.q f221886a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f221887b;

    public A(l90.q qVar, dv.b bVar) {
        this.f221886a = qVar;
        this.f221887b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new z((l90.o) this.f221886a.get(), (a.InterfaceC4053a) this.f221887b.get());
    }
}
