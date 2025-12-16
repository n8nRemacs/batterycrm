package com.avito.android.passport.profile_add.merge.deeplinking;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: PassportMergeAccountsAsyncDeepLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final E50.c f212944a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f212945b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f212946c;

    /* renamed from: d, reason: collision with root package name */
    public final C25721c f212947d;

    /* renamed from: e, reason: collision with root package name */
    public final r60.f f212948e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<G50.a> f212949f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<R0> f212950g;

    public h(E50.c cVar, dv.b bVar, dv.b bVar2, C25721c c25721c, r60.f fVar, Provider provider, Provider provider2) {
        this.f212944a = cVar;
        this.f212945b = bVar;
        this.f212946c = bVar2;
        this.f212947d = c25721c;
        this.f212948e = fVar;
        this.f212949f = provider;
        this.f212950g = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((E50.a) this.f212944a.get(), (a.InterfaceC4053a) this.f212945b.get(), (a.b) this.f212946c.get(), (C25719a) this.f212947d.get(), (r60.d) this.f212948e.get(), this.f212949f.get(), this.f212950g.get());
    }
}
