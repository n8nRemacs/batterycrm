package com.avito.android.passport.profile_add.merge.deeplinking;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: PassportMergeAccountsProfilesListSyncDeepLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class w implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final E50.c f212974a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f212975b;

    public w(E50.c cVar, dv.b bVar) {
        this.f212974a = cVar;
        this.f212975b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new u((E50.a) this.f212974a.get(), (a.InterfaceC4053a) this.f212975b.get());
    }
}
