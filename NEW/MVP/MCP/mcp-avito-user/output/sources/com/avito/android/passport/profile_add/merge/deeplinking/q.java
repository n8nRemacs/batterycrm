package com.avito.android.passport.profile_add.merge.deeplinking;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: PassportMergeAccountsProfilesListFlowSyncDeepLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final E50.c f212960a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f212961b;

    public q(E50.c cVar, dv.b bVar) {
        this.f212960a = cVar;
        this.f212961b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p((E50.a) this.f212960a.get(), (a.InterfaceC4053a) this.f212961b.get());
    }
}
