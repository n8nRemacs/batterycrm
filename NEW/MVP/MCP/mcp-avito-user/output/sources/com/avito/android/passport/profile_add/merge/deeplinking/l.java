package com.avito.android.passport.profile_add.merge.deeplinking;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: PassportMergeAccountsCloseAsyncLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f212956a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f212957b;

    public l(dagger.internal.f fVar, dv.b bVar) {
        this.f212956a = fVar;
        this.f212957b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k((com.avito.android.deeplink_handler.handler.composite.a) this.f212956a.get(), (a.InterfaceC4053a) this.f212957b.get());
    }
}
