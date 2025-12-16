package com.avito.android.favorite_sellers;

import com.avito.android.InterfaceC34162r0;
import com.avito.android.util.R0;
import javax.inject.Provider;
import zz.InterfaceC50647a;

/* compiled from: FavoriteSellersInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.favorite_sellers.t, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30595t implements dagger.internal.h<C30589m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.remote.Q> f156126a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC34162r0> f156127b;

    /* renamed from: c, reason: collision with root package name */
    public final I30.b f156128c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f156129d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.common.a> f156130e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC30580d> f156131f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC30583g> f156132g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<L> f156133h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<InterfaceC50647a> f156134i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.account.E> f156135j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<com.avito.android.connection_quality.connectivity.a> f156136k;

    /* renamed from: l, reason: collision with root package name */
    public final dagger.internal.u f156137l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<R0> f156138m;

    public C30595t(Provider provider, Provider provider2, I30.b bVar, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, dagger.internal.u uVar, Provider provider11) {
        this.f156126a = provider;
        this.f156127b = provider2;
        this.f156128c = bVar;
        this.f156129d = provider3;
        this.f156130e = provider4;
        this.f156131f = provider5;
        this.f156132g = provider6;
        this.f156133h = provider7;
        this.f156134i = provider8;
        this.f156135j = provider9;
        this.f156136k = provider10;
        this.f156137l = uVar;
        this.f156138m = provider11;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C30589m(this.f156126a.get(), this.f156127b.get(), (I30.d) this.f156128c.get(), this.f156129d.get(), this.f156130e.get(), this.f156131f.get(), this.f156132g.get(), this.f156133h.get(), this.f156134i.get(), this.f156135j.get(), this.f156136k.get(), (V) this.f156137l.get(), this.f156138m.get());
    }
}
