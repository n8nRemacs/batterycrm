package com.avito.android.passport.profile_add.merge.deeplinking;

import com.avito.android.deeplink_handler.view.a;
import k60.C42524a;
import k60.C42526c;

/* compiled from: PassportMergeAccountsProfilesListOnboardingSyncDeepLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final E50.c f212967a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f212968b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f212969c;

    /* renamed from: d, reason: collision with root package name */
    public final C42526c f212970d;

    /* renamed from: e, reason: collision with root package name */
    public final r60.f f212971e;

    public t(E50.c cVar, dv.b bVar, dagger.internal.f fVar, C42526c c42526c, r60.f fVar2) {
        this.f212967a = cVar;
        this.f212968b = bVar;
        this.f212969c = fVar;
        this.f212970d = c42526c;
        this.f212971e = fVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new s((E50.a) this.f212967a.get(), (a.InterfaceC4053a) this.f212968b.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f212969c.get(), (C42524a) this.f212970d.get(), (r60.d) this.f212971e.get());
    }
}
