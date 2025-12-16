package com.avito.android.passport.profile_add.merge.deeplinking;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: PassportBlockingErrorSyncDeepLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final E50.c f212924a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f212925b;

    public e(E50.c cVar, dv.b bVar) {
        this.f212924a = cVar;
        this.f212925b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((E50.a) this.f212924a.get(), (a.InterfaceC4053a) this.f212925b.get());
    }
}
