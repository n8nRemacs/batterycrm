package com.avito.android.search.subscriptions;

import com.avito.android.account.G;
import com.avito.android.favorites.FavoritesSpace;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SearchSubscriptionPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f263983a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.libs.saved_searches.domain.i> f263984b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<l> f263985c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<TV.f> f263986d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<G> f263987e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f263988f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f263989g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<EE0.d> f263990h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f263991i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<Rp0.b> f263992j;

    /* renamed from: k, reason: collision with root package name */
    public final dagger.internal.l f263993k;

    public j(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, dagger.internal.l lVar) {
        this.f263983a = provider;
        this.f263984b = provider2;
        this.f263985c = provider3;
        this.f263986d = provider4;
        this.f263987e = provider5;
        this.f263988f = provider6;
        this.f263989g = provider7;
        this.f263990h = provider8;
        this.f263991i = provider9;
        this.f263992j = provider10;
        this.f263993k = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f263983a.get(), this.f263984b.get(), this.f263985c.get(), this.f263986d.get(), this.f263987e.get(), this.f263988f.get(), this.f263989g.get(), this.f263990h.get(), this.f263991i.get(), this.f263992j.get(), (FavoritesSpace) this.f263993k.f393949a);
    }
}
