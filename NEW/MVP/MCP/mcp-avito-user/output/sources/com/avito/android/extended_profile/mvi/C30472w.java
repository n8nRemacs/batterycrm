package com.avito.android.extended_profile.mvi;

import com.avito.android.C29640d;
import com.avito.android.InterfaceC34162r0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.extended_profile.InterfaceC30394c;
import com.avito.android.remote.model.FloatingBuyBlock;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.util.R0;
import eA.InterfaceC39978a;
import javax.inject.Provider;
import zA.InterfaceC50427a;

/* compiled from: ExtendedProfileActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.extended_profile.mvi.w, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30472w implements dagger.internal.h<C30451a> {

    /* renamed from: A, reason: collision with root package name */
    public final Provider<com.avito.android.advertising.loaders.j> f150403A;

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f150404a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f150405b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<SearchParams> f150406c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f150407d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.extended_profile.r> f150408e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.extended_profile.search.d> f150409f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.extended_profile.search.a> f150410g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.extended_profile_phone_dialog.g> f150411h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.advert_collection_toast.b> f150412i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.favorite.h> f150413j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<com.avito.android.advert.viewed.a> f150414k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<com.avito.android.extended_profile.e0> f150415l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<InterfaceC34162r0> f150416m;

    /* renamed from: n, reason: collision with root package name */
    public final Provider<InterfaceC50427a> f150417n;

    /* renamed from: o, reason: collision with root package name */
    public final Provider<InterfaceC39978a> f150418o;

    /* renamed from: p, reason: collision with root package name */
    public final Provider<eA.m> f150419p;

    /* renamed from: q, reason: collision with root package name */
    public final Provider<eA.g> f150420q;

    /* renamed from: r, reason: collision with root package name */
    public final Provider<InterfaceC30394c> f150421r;

    /* renamed from: s, reason: collision with root package name */
    public final Provider<com.avito.android.extended_profile_ux_feedback.b> f150422s;

    /* renamed from: t, reason: collision with root package name */
    public final Provider<com.avito.android.account.E> f150423t;

    /* renamed from: u, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f150424u;

    /* renamed from: v, reason: collision with root package name */
    public final Provider<R0> f150425v;

    /* renamed from: w, reason: collision with root package name */
    public final Provider<com.avito.android.extended_profile_adverts.n> f150426w;

    /* renamed from: x, reason: collision with root package name */
    public final Provider<C29640d> f150427x;

    /* renamed from: y, reason: collision with root package name */
    public final com.avito.android.extended_profile_ui_components.search_input.suggest.d f150428y;

    /* renamed from: z, reason: collision with root package name */
    public final dagger.internal.u f150429z;

    public C30472w(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, dagger.internal.l lVar3, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, Provider provider20, Provider provider21, com.avito.android.extended_profile_ui_components.search_input.suggest.d dVar, dagger.internal.u uVar, Provider provider22) {
        this.f150404a = lVar;
        this.f150405b = lVar2;
        this.f150406c = provider;
        this.f150407d = lVar3;
        this.f150408e = provider2;
        this.f150409f = provider3;
        this.f150410g = provider4;
        this.f150411h = provider5;
        this.f150412i = provider6;
        this.f150413j = provider7;
        this.f150414k = provider8;
        this.f150415l = provider9;
        this.f150416m = provider10;
        this.f150417n = provider11;
        this.f150418o = provider12;
        this.f150419p = provider13;
        this.f150420q = provider14;
        this.f150421r = provider15;
        this.f150422s = provider16;
        this.f150423t = provider17;
        this.f150424u = provider18;
        this.f150425v = provider19;
        this.f150426w = provider20;
        this.f150427x = provider21;
        this.f150428y = dVar;
        this.f150429z = uVar;
        this.f150403A = provider22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C30451a((String) this.f150404a.f393949a, (String) this.f150405b.f393949a, this.f150406c.get(), (FloatingBuyBlock) this.f150407d.f393949a, this.f150408e.get(), this.f150409f.get(), this.f150410g.get(), this.f150411h.get(), this.f150412i.get(), this.f150413j.get(), this.f150414k.get(), this.f150415l.get(), this.f150416m.get(), this.f150417n.get(), this.f150418o.get(), this.f150419p.get(), this.f150420q.get(), this.f150421r.get(), this.f150422s.get(), this.f150423t.get(), this.f150424u.get(), this.f150425v.get(), this.f150426w.get(), this.f150427x.get(), (com.avito.android.extended_profile_ui_components.search_input.suggest.a) this.f150428y.get(), (com.avito.android.advertising.loaders.n) this.f150429z.get(), this.f150403A.get());
    }
}
