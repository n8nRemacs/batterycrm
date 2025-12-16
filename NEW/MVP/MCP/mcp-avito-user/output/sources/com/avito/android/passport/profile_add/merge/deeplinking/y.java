package com.avito.android.passport.profile_add.merge.deeplinking;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: PassportSelectBusinessVrfLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class y implements dagger.internal.h<x> {

    /* renamed from: a, reason: collision with root package name */
    public final E50.c f212978a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f212979b;

    public y(E50.c cVar, dv.b bVar) {
        this.f212978a = cVar;
        this.f212979b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new x((E50.a) this.f212978a.get(), (a.InterfaceC4053a) this.f212979b.get());
    }
}
