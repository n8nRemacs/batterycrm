package com.avito.android.passport.profile_add.merge.deeplinking;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: PassportAccountsProfileErrorSyncLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final E50.c f212920a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f212921b;

    public c(E50.c cVar, dv.b bVar) {
        this.f212920a = cVar;
        this.f212921b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((E50.a) this.f212920a.get(), (a.InterfaceC4053a) this.f212921b.get());
    }
}
