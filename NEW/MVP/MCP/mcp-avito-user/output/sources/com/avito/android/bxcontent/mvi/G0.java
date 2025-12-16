package com.avito.android.bxcontent.mvi;

import Rj.C15047a;
import cD.C27006b;
import com.avito.android.B2;
import com.avito.android.C36135w2;
import com.avito.android.di.module.S7;
import com.avito.android.di.module.W7;
import com.avito.android.inline_filters.InterfaceC30995b;
import com.avito.android.location.InterfaceC31506h;
import com.avito.android.remote.InterfaceC34323k;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.converters.SharingButtonConverterImpl_Factory;
import com.avito.android.serp.adapter.search_bar.InterfaceC34822a;
import com.avito.android.util.C35838l3;
import java.util.Set;
import javax.inject.Provider;
import jl.C42394a;
import jl.C42395b;
import sZ.InterfaceC48136b;
import ur.InterfaceC49101b;

/* compiled from: BxContentInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class G0 implements dagger.internal.h<F> {

    /* renamed from: A, reason: collision with root package name */
    public final Provider<InterfaceC30995b> f111318A;

    /* renamed from: B, reason: collision with root package name */
    public final Provider<com.avito.android.carousel_items.domain.a> f111319B;

    /* renamed from: C, reason: collision with root package name */
    public final Provider<com.avito.android.connection_quality.connectivity.a> f111320C;

    /* renamed from: D, reason: collision with root package name */
    public final Provider<InterfaceC48136b> f111321D;

    /* renamed from: E, reason: collision with root package name */
    public final Provider<com.avito.android.home.o> f111322E;

    /* renamed from: F, reason: collision with root package name */
    public final Provider<AK0.l> f111323F;

    /* renamed from: G, reason: collision with root package name */
    public final C27006b f111324G;

    /* renamed from: H, reason: collision with root package name */
    public final Provider<com.avito.android.main_start_onboarding.a> f111325H;

    /* renamed from: I, reason: collision with root package name */
    public final C42395b f111326I;

    /* renamed from: J, reason: collision with root package name */
    public final Provider<Set<String>> f111327J;

    /* renamed from: K, reason: collision with root package name */
    public final dagger.internal.l f111328K;

    /* renamed from: L, reason: collision with root package name */
    public final Provider<com.avito.android.onboarding.q> f111329L;

    /* renamed from: M, reason: collision with root package name */
    public final Provider<C15047a> f111330M;

    /* renamed from: N, reason: collision with root package name */
    public final Provider<InterfaceC49101b> f111331N;

    /* renamed from: O, reason: collision with root package name */
    public final Provider<com.avito.android.brand_global_rubricator.c> f111332O;

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34323k> f111333a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.i> f111334b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.Y0> f111335c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<SearchParamsConverter> f111336d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.shortcut_navigation_bar.j0> f111337e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.mini_menu.o> f111338f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.visual_rubricator.N> f111339g;

    /* renamed from: h, reason: collision with root package name */
    public final SharingButtonConverterImpl_Factory f111340h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.bxcontent.search_bar_promo_widget.a> f111341i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.hero_banner.widget.d> f111342j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<com.avito.android.bxcontent.search_bar_promo_widget.m> f111343k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<La.j> f111344l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<InterfaceC31506h> f111345m;

    /* renamed from: n, reason: collision with root package name */
    public final Provider<com.avito.android.advertising.loaders.n> f111346n;

    /* renamed from: o, reason: collision with root package name */
    public final Provider<com.avito.android.advertising.loaders.j> f111347o;

    /* renamed from: p, reason: collision with root package name */
    public final Provider<com.avito.android.bxcontent.U0> f111348p;

    /* renamed from: q, reason: collision with root package name */
    public final Provider<com.avito.android.util.R0> f111349q;

    /* renamed from: r, reason: collision with root package name */
    public final S7 f111350r;

    /* renamed from: s, reason: collision with root package name */
    public final W7 f111351s;

    /* renamed from: t, reason: collision with root package name */
    public final Provider<com.avito.android.bxcontent.analytics.a> f111352t;

    /* renamed from: u, reason: collision with root package name */
    public final com.avito.android.bxcontent.business360.c f111353u;

    /* renamed from: v, reason: collision with root package name */
    public final Provider<InterfaceC34822a> f111354v;

    /* renamed from: w, reason: collision with root package name */
    public final Provider<C36135w2> f111355w;

    /* renamed from: x, reason: collision with root package name */
    public final Provider<B2> f111356x;

    /* renamed from: y, reason: collision with root package name */
    public final Provider<Ig.c> f111357y;

    /* renamed from: z, reason: collision with root package name */
    public final Provider<com.avito.android.advertising.kebab.n> f111358z;

    public G0(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, SharingButtonConverterImpl_Factory sharingButtonConverterImpl_Factory, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, Provider provider15, Provider provider16, S7 s72, W7 w72, Provider provider17, com.avito.android.bxcontent.business360.c cVar, Provider provider18, Provider provider19, Provider provider20, Provider provider21, Provider provider22, Provider provider23, Provider provider24, Provider provider25, Provider provider26, Provider provider27, Provider provider28, C27006b c27006b, Provider provider29, C42395b c42395b, Provider provider30, dagger.internal.l lVar, Provider provider31, Provider provider32, Provider provider33, Provider provider34) {
        this.f111333a = provider;
        this.f111334b = provider2;
        this.f111335c = provider3;
        this.f111336d = provider4;
        this.f111337e = provider5;
        this.f111338f = provider6;
        this.f111339g = provider7;
        this.f111340h = sharingButtonConverterImpl_Factory;
        this.f111341i = provider8;
        this.f111342j = provider9;
        this.f111343k = provider10;
        this.f111344l = provider11;
        this.f111345m = provider12;
        this.f111346n = provider13;
        this.f111347o = provider14;
        this.f111348p = provider15;
        this.f111349q = provider16;
        this.f111350r = s72;
        this.f111351s = w72;
        this.f111352t = provider17;
        this.f111353u = cVar;
        this.f111354v = provider18;
        this.f111355w = provider19;
        this.f111356x = provider20;
        this.f111357y = provider21;
        this.f111358z = provider22;
        this.f111318A = provider23;
        this.f111319B = provider24;
        this.f111320C = provider25;
        this.f111321D = provider26;
        this.f111322E = provider27;
        this.f111323F = provider28;
        this.f111324G = c27006b;
        this.f111325H = provider29;
        this.f111326I = c42395b;
        this.f111327J = provider30;
        this.f111328K = lVar;
        this.f111329L = provider31;
        this.f111330M = provider32;
        this.f111331N = provider33;
        this.f111332O = provider34;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new F(dagger.internal.g.b(this.f111333a), this.f111334b.get(), this.f111335c.get(), this.f111336d.get(), this.f111337e.get(), this.f111338f.get(), this.f111339g.get(), this.f111340h.get(), this.f111341i.get(), this.f111342j.get(), this.f111343k.get(), this.f111344l.get(), this.f111345m.get(), this.f111346n.get(), this.f111347o.get(), this.f111348p.get(), this.f111349q.get(), (com.avito.android.search.h) this.f111350r.get(), (com.avito.android.serp.warning.f) this.f111351s.get(), this.f111352t.get(), (com.avito.android.bxcontent.business360.a) this.f111353u.get(), this.f111354v.get(), this.f111355w.get(), this.f111356x.get(), this.f111357y.get(), this.f111358z.get(), this.f111318A.get(), this.f111319B.get(), this.f111320C.get(), this.f111321D.get(), this.f111322E.get(), dagger.internal.g.b(this.f111323F), dagger.internal.g.b(this.f111324G), this.f111325H.get(), (C42394a) this.f111326I.get(), this.f111327J.get(), (C35838l3) this.f111328K.f393949a, this.f111329L.get(), this.f111330M.get(), this.f111331N.get(), this.f111332O.get());
    }
}
