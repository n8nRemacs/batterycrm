package com.avito.android.advert;

import Db.InterfaceC13381a;
import com.avito.android.util.InterfaceC35745a5;
import fa.InterfaceC40383a;
import java.util.Set;
import javax.inject.Provider;
import nC.InterfaceC44228a;

/* compiled from: AdvertDetailsInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28238s implements dagger.internal.h<C28234n> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f80964a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC40383a> f80965b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Z9.a> f80966c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.advertising.loaders.n> f80967d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f80968e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.location.r> f80969f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC44228a> f80970g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<Boolean> f80971h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<hJ.i> f80972i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<hJ.e> f80973j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<hJ.h> f80974k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<DP.a> f80975l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<Set<String>> f80976m;

    /* renamed from: n, reason: collision with root package name */
    public final com.avito.android.advert.item.cv_state.interactor.c f80977n;

    /* renamed from: o, reason: collision with root package name */
    public final Provider<com.avito.android.advertising.loaders.beduin.H> f80978o;

    /* renamed from: p, reason: collision with root package name */
    public final Provider<InterfaceC13381a> f80979p;

    public C28238s(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, com.avito.android.advert.item.cv_state.interactor.c cVar, Provider provider13, Provider provider14) {
        this.f80964a = lVar;
        this.f80965b = provider;
        this.f80966c = provider2;
        this.f80967d = provider3;
        this.f80968e = provider4;
        this.f80969f = provider5;
        this.f80970g = provider6;
        this.f80971h = provider7;
        this.f80972i = provider8;
        this.f80973j = provider9;
        this.f80974k = provider10;
        this.f80975l = provider11;
        this.f80976m = provider12;
        this.f80977n = cVar;
        this.f80978o = provider13;
        this.f80979p = provider14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C28234n((String) this.f80964a.f393949a, dagger.internal.g.b(this.f80965b), dagger.internal.g.b(this.f80966c), this.f80967d.get(), this.f80968e.get(), this.f80969f.get(), this.f80970g.get(), this.f80971h.get().booleanValue(), this.f80972i.get(), this.f80973j.get(), this.f80974k.get(), dagger.internal.g.b(this.f80975l), this.f80976m.get(), (com.avito.android.advert.item.cv_state.interactor.b) this.f80977n.get(), this.f80978o.get(), this.f80979p.get());
    }
}
