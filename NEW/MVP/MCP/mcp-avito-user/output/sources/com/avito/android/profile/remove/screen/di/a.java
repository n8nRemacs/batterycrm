package com.avito.android.profile.remove.screen.di;

import Y41.l;
import androidx.fragment.app.Fragment;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.profile.remove.analytics.ProfileRemoveAnalytics;
import com.avito.android.profile.remove.screen.ProfileRemoveItemsFragment;
import com.avito.android.profile.remove.screen.di.b;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerProfileRemoveItemsComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerProfileRemoveItemsComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.profile.remove.screen.di.b.a
        public final com.avito.android.profile.remove.screen.di.b a(ProfileRemoveItemsFragment profileRemoveItemsFragment, com.avito.android.profile.remove.screen.di.c cVar, r rVar, String str, l lVar, boolean z12) {
            return new c(cVar, profileRemoveItemsFragment, rVar, str, lVar, Boolean.valueOf(z12), null);
        }
    }

    /* compiled from: DaggerProfileRemoveItemsComponent.java */
    public static final class c implements com.avito.android.profile.remove.screen.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<C28478k> f223993A;

        /* renamed from: B, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f223994B;

        /* renamed from: C, reason: collision with root package name */
        public final com.avito.android.profile.remove.screen.mvi.d f223995C;

        /* renamed from: D, reason: collision with root package name */
        public final u<com.avito.android.profile.remove.screen.e> f223996D;

        /* renamed from: E, reason: collision with root package name */
        public final u<com.avito.android.profile.remove.screen.items.a> f223997E;

        /* renamed from: F, reason: collision with root package name */
        public final com.avito.android.profile.remove.screen.mvi.l f223998F;

        /* renamed from: G, reason: collision with root package name */
        public final com.avito.android.profile.remove.screen.d f223999G;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.profile.remove.screen.di.c f224000a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.profile.remove.screen.items.title.d> f224001b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.profile.remove.screen.items.title.c f224002c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.l f224003d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.profile.remove.screen.items.link.d> f224004e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.profile.remove.screen.items.link.c f224005f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.profile.remove.screen.items.text.d> f224006g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f224007h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.profile.remove.screen.items.text.c f224008i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.profile.remove.screen.items.subtitle.d> f224009j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.profile.remove.screen.items.subtitle.c f224010k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.profile.remove.screen.items.header.d> f224011l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.profile.remove.screen.items.header.c f224012m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.profile.remove.screen.items.banner.d> f224013n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.profile.remove.screen.items.banner.c f224014o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.profile.remove.screen.items.text_area_item.d> f224015p;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.profile.remove.screen.items.text_area_item.b f224016q;

        /* renamed from: r, reason: collision with root package name */
        public final u<InterfaceC28373a> f224017r;

        /* renamed from: s, reason: collision with root package name */
        public final u<E> f224018s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.profile.remove.screen.items.list_item.d> f224019t;

        /* renamed from: u, reason: collision with root package name */
        public final com.avito.android.profile.remove.screen.items.list_item.c f224020u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.profile.remove.screen.items.spacer.d> f224021v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f224022w;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f224023x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f224024y;

        /* renamed from: z, reason: collision with root package name */
        public final u<InterfaceC28481c> f224025z;

        /* compiled from: DaggerProfileRemoveItemsComponent.java */
        /* renamed from: com.avito.android.profile.remove.screen.di.a$c$a, reason: collision with other inner class name */
        public static final class C6785a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.remove.screen.di.c f224026a;

            public C6785a(com.avito.android.profile.remove.screen.di.c cVar) {
                this.f224026a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f224026a.i();
            }
        }

        /* compiled from: DaggerProfileRemoveItemsComponent.java */
        public static final class b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.remove.screen.di.c f224027a;

            public b(com.avito.android.profile.remove.screen.di.c cVar) {
                this.f224027a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f224027a.a();
            }
        }

        /* compiled from: DaggerProfileRemoveItemsComponent.java */
        /* renamed from: com.avito.android.profile.remove.screen.di.a$c$c, reason: collision with other inner class name */
        public static final class C6786c implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.remove.screen.di.c f224028a;

            public C6786c(com.avito.android.profile.remove.screen.di.c cVar) {
                this.f224028a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f224028a.e();
            }
        }

        /* compiled from: DaggerProfileRemoveItemsComponent.java */
        public static final class d implements u<com.avito.android.profile.remove.screen.e> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.remove.screen.di.c f224029a;

            public d(com.avito.android.profile.remove.screen.di.c cVar) {
                this.f224029a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.profile.remove.screen.e eVarFh = this.f224029a.Fh();
                t.c(eVarFh);
                return eVarFh;
            }
        }

        /* compiled from: DaggerProfileRemoveItemsComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.remove.screen.di.c f224030a;

            public e(com.avito.android.profile.remove.screen.di.c cVar) {
                this.f224030a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f224030a.b();
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.profile.remove.screen.di.c cVar, Fragment fragment, r rVar, String str, l lVar, Boolean bool, C6784a c6784a) {
            this.f224000a = cVar;
            u<com.avito.android.profile.remove.screen.items.title.d> uVarD = dagger.internal.g.d(com.avito.android.profile.remove.screen.items.title.f.a());
            this.f224001b = uVarD;
            this.f224002c = new com.avito.android.profile.remove.screen.items.title.c(uVarD);
            dagger.internal.l lVarA = dagger.internal.l.a(lVar);
            this.f224003d = lVarA;
            u<com.avito.android.profile.remove.screen.items.link.d> uVarD2 = dagger.internal.g.d(new com.avito.android.profile.remove.screen.items.link.g(lVarA));
            this.f224004e = uVarD2;
            this.f224005f = new com.avito.android.profile.remove.screen.items.link.c(uVarD2);
            u<com.avito.android.profile.remove.screen.items.text.d> uVarD3 = dagger.internal.g.d(new com.avito.android.profile.remove.screen.items.text.f(this.f224003d));
            this.f224006g = uVarD3;
            C6786c c6786c = new C6786c(cVar);
            this.f224007h = c6786c;
            this.f224008i = new com.avito.android.profile.remove.screen.items.text.c(uVarD3, c6786c);
            u<com.avito.android.profile.remove.screen.items.subtitle.d> uVarD4 = dagger.internal.g.d(com.avito.android.profile.remove.screen.items.subtitle.f.a());
            this.f224009j = uVarD4;
            this.f224010k = new com.avito.android.profile.remove.screen.items.subtitle.c(uVarD4);
            u<com.avito.android.profile.remove.screen.items.header.d> uVarD5 = dagger.internal.g.d(com.avito.android.profile.remove.screen.items.header.f.a());
            this.f224011l = uVarD5;
            this.f224012m = new com.avito.android.profile.remove.screen.items.header.c(uVarD5);
            u<com.avito.android.profile.remove.screen.items.banner.d> uVarD6 = dagger.internal.g.d(new com.avito.android.profile.remove.screen.items.banner.g(this.f224003d));
            this.f224013n = uVarD6;
            this.f224014o = new com.avito.android.profile.remove.screen.items.banner.c(uVarD6);
            u<com.avito.android.profile.remove.screen.items.text_area_item.d> uVarD7 = dagger.internal.g.d(new com.avito.android.profile.remove.screen.items.text_area_item.f(this.f224003d));
            this.f224015p = uVarD7;
            this.f224016q = new com.avito.android.profile.remove.screen.items.text_area_item.b(uVarD7, this.f224007h);
            u<com.avito.android.profile.remove.screen.items.list_item.d> uVarD8 = dagger.internal.g.d(new com.avito.android.profile.remove.screen.items.list_item.g(this.f224003d, new H90.a(new b(cVar), new C6785a(cVar))));
            this.f224019t = uVarD8;
            this.f224020u = new com.avito.android.profile.remove.screen.items.list_item.c(uVarD8);
            u<com.avito.android.profile.remove.screen.items.spacer.d> uVarD9 = dagger.internal.g.d(com.avito.android.profile.remove.screen.items.spacer.f.a());
            this.f224021v = uVarD9;
            u<com.avito.konveyor.a> uVarD10 = dagger.internal.g.d(new i(this.f224002c, this.f224005f, this.f224008i, this.f224010k, this.f224012m, this.f224014o, this.f224016q, this.f224020u, new com.avito.android.profile.remove.screen.items.spacer.c(uVarD9)));
            this.f224022w = uVarD10;
            u<com.avito.konveyor.adapter.a> uVarD11 = dagger.internal.g.d(new h(uVarD10));
            this.f224023x = uVarD11;
            this.f224024y = dagger.internal.g.d(new g(uVarD11, this.f224022w));
            this.f224025z = new e(cVar);
            u<C28478k> uVarD12 = dagger.internal.g.d(new com.avito.android.profile.remove.screen.di.e(dagger.internal.l.a(rVar)));
            this.f223993A = uVarD12;
            this.f223994B = com.avito.android.advert.item.delivery_suggests.l.i(this.f224025z, uVarD12);
            this.f223995C = new com.avito.android.profile.remove.screen.mvi.d(dagger.internal.l.a(bool));
            this.f223996D = new d(cVar);
            this.f223997E = dagger.internal.g.d(com.avito.android.profile.remove.screen.items.c.a());
            this.f223998F = new com.avito.android.profile.remove.screen.mvi.l(dagger.internal.l.a(str), this.f223996D, this.f223997E);
            this.f223999G = new com.avito.android.profile.remove.screen.d(new com.avito.android.profile.remove.screen.mvi.g(this.f223995C, com.avito.android.profile.remove.screen.mvi.b.a(), com.avito.android.profile.remove.screen.mvi.i.a(), this.f223998F, this.f223994B));
        }

        @Override // com.avito.android.profile.remove.screen.di.b
        public final void a(ProfileRemoveItemsFragment profileRemoveItemsFragment) {
            profileRemoveItemsFragment.f223973n0 = this.f224023x.get();
            profileRemoveItemsFragment.f223974o0 = this.f224024y.get();
            profileRemoveItemsFragment.f223975p0 = this.f223994B.get();
            com.avito.android.profile.remove.screen.di.c cVar = this.f224000a;
            com.avito.android.profile.remove.screen.f fVarTj = cVar.Tj();
            t.c(fVarTj);
            profileRemoveItemsFragment.f223976q0 = fVarTj;
            profileRemoveItemsFragment.f223977r0 = new ProfileRemoveAnalytics(cVar.i(), cVar.a());
            profileRemoveItemsFragment.f223980u0 = this.f223999G;
        }
    }

    public static b.a a() {
        return new b();
    }
}
