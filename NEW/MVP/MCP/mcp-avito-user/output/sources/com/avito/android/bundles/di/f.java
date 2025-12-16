package com.avito.android.bundles.di;

import Ck.InterfaceC13314a;
import androidx.fragment.app.Fragment;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bundles.di.i;
import com.avito.android.bundles.di.s;
import com.avito.android.bundles.ui.VasBundlesFragment;
import com.avito.android.util.InterfaceC35745a5;
import cv.InterfaceC39417a;
import dagger.internal.A;
import java.util.List;
import java.util.Set;

/* compiled from: DaggerVasBundlesComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class f {

    /* compiled from: DaggerVasBundlesComponent.java */
    public static final class b implements i.a {
        public b() {
        }

        @Override // com.avito.android.bundles.di.i.a
        public final i a(String str, boolean z12, String str2, VasBundlesFragment vasBundlesFragment, com.avito.android.analytics.screens.r rVar, l lVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(lVar, interfaceC39417a, str, Boolean.valueOf(z12), str2, vasBundlesFragment, rVar, null);
        }
    }

    /* compiled from: DaggerVasBundlesComponent.java */
    public static final class c implements i {

        /* renamed from: A, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f108267A;

        /* renamed from: B, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.a> f108268B;

        /* renamed from: C, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.j> f108269C;

        /* renamed from: D, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.data_aware.b> f108270D;

        /* renamed from: E, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.data_aware.e> f108271E;

        /* renamed from: F, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.data_aware.c> f108272F;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f108273a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.l f108274b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f108275c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC13314a> f108276d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f108277e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.bundles.repository.a> f108278f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.bundles.b> f108279g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f108280h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f108281i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<B> f108282j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.bundles.viewmodel.i> f108283k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.bundles.vas_union.item.header.b> f108284l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f108285m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<Set<TV0.b<?, ?>>> f108286n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.bundles.ui.recycler.item.bundle.d> f108287o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.util.text.a> f108288p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.bundles.ui.recycler.item.benefit.b> f108289q;

        /* renamed from: r, reason: collision with root package name */
        public final com.avito.android.bundles.ui.recycler.item.benefit.j f108290r;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f108291s;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.a> f108292t;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f108293u;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.bundles.ui.recycler.item.banner.d> f108294v;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f108295w;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f108296x;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.bundles.ui.recycler.item.skip_button.d> f108297y;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f108298z;

        /* compiled from: DaggerVasBundlesComponent.java */
        public static final class a implements dagger.internal.u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final l f108299a;

            public a(l lVar) {
                this.f108299a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f108299a.e();
                dagger.internal.t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerVasBundlesComponent.java */
        public static final class b implements dagger.internal.u<InterfaceC13314a> {

            /* renamed from: a, reason: collision with root package name */
            public final l f108300a;

            public b(l lVar) {
                this.f108300a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC13314a interfaceC13314aQd = this.f108300a.qd();
                dagger.internal.t.c(interfaceC13314aQd);
                return interfaceC13314aQd;
            }
        }

        /* compiled from: DaggerVasBundlesComponent.java */
        /* renamed from: com.avito.android.bundles.di.f$c$c, reason: collision with other inner class name */
        public static final class C3243c implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final l f108301a;

            public C3243c(l lVar) {
                this.f108301a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f108301a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerVasBundlesComponent.java */
        public static final class d implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final l f108302a;

            public d(l lVar) {
                this.f108302a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f108302a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(l lVar, cv.b bVar, String str, Boolean bool, String str2, Fragment fragment, com.avito.android.analytics.screens.r rVar, a aVar) {
            this.f108273a = bVar;
            this.f108274b = dagger.internal.l.a(fragment);
            this.f108275c = dagger.internal.l.a(str);
            b bVar2 = new b(lVar);
            C3243c c3243c = new C3243c(lVar);
            this.f108277e = c3243c;
            this.f108278f = dagger.internal.g.d(new com.avito.android.bundles.repository.c(bVar2, c3243c));
            this.f108279g = dagger.internal.g.d(com.avito.android.bundles.d.a());
            this.f108280h = new d(lVar);
            dagger.internal.u<ScreenPerformanceTracker> uVarD = dagger.internal.g.d(new h(dagger.internal.l.a(rVar), this.f108280h));
            this.f108281i = uVarD;
            dagger.internal.u<B> uVarD2 = dagger.internal.g.d(new C(this.f108275c, uVarD, this.f108278f, this.f108279g, this.f108277e));
            this.f108282j = uVarD2;
            this.f108283k = dagger.internal.g.d(new A(this.f108274b, uVarD2));
            dagger.internal.u<com.avito.android.bundles.vas_union.item.header.b> uVarD3 = dagger.internal.g.d(s.a.f108314a);
            this.f108284l = uVarD3;
            this.f108285m = dagger.internal.g.d(new r(uVarD3));
            this.f108286n = dagger.internal.B.a(com.avito.android.konveyor_adapter_module.d.a());
            this.f108287o = dagger.internal.g.d(com.avito.android.bundles.ui.recycler.item.bundle.g.a());
            this.f108288p = new a(lVar);
            dagger.internal.u<com.avito.android.bundles.ui.recycler.item.benefit.b> uVarD4 = dagger.internal.g.d(com.avito.android.bundles.ui.recycler.item.benefit.e.a());
            this.f108289q = uVarD4;
            com.avito.android.bundles.ui.recycler.item.benefit.j jVar = new com.avito.android.bundles.ui.recycler.item.benefit.j(uVarD4);
            this.f108290r = jVar;
            dagger.internal.u<com.avito.konveyor.a> uVarD5 = dagger.internal.g.d(new v(jVar));
            this.f108291s = uVarD5;
            dagger.internal.u<com.avito.konveyor.adapter.a> uVarD6 = dagger.internal.g.d(new u(uVarD5));
            this.f108292t = uVarD6;
            this.f108293u = dagger.internal.g.d(new com.avito.android.bundles.ui.recycler.item.bundle.b(this.f108288p, uVarD6, this.f108287o, this.f108291s));
            dagger.internal.u<com.avito.android.bundles.ui.recycler.item.banner.d> uVarD7 = dagger.internal.g.d(com.avito.android.bundles.ui.recycler.item.banner.f.a());
            this.f108294v = uVarD7;
            this.f108295w = dagger.internal.g.d(new com.avito.android.bundles.ui.recycler.item.banner.c(uVarD7));
            this.f108296x = dagger.internal.g.d(this.f108290r);
            dagger.internal.u<com.avito.android.bundles.ui.recycler.item.skip_button.d> uVarD8 = dagger.internal.g.d(com.avito.android.bundles.ui.recycler.item.skip_button.g.a());
            this.f108297y = uVarD8;
            this.f108298z = dagger.internal.g.d(new com.avito.android.bundles.ui.recycler.item.skip_button.c(uVarD8));
            A.b bVarA = dagger.internal.A.a(5, 1);
            dagger.internal.u<TV0.b<?, ?>> uVar = this.f108285m;
            List<dagger.internal.u<T>> list = bVarA.f393937a;
            list.add(uVar);
            bVarA.f393938b.add(this.f108286n);
            list.add(this.f108293u);
            list.add(this.f108295w);
            list.add(this.f108296x);
            list.add(this.f108298z);
            dagger.internal.u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f108267A = uVarK;
            dagger.internal.u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f108268B = uVarH;
            this.f108269C = dagger.internal.g.d(new z(uVarH, this.f108267A));
            dagger.internal.u<com.avito.android.recycler.data_aware.b> uVarD9 = dagger.internal.g.d(com.avito.android.bundles.ui.recycler.c.a());
            this.f108270D = uVarD9;
            dagger.internal.u<com.avito.android.recycler.data_aware.e> uVarD10 = dagger.internal.g.d(new y(uVarD9));
            this.f108271E = uVarD10;
            this.f108272F = dagger.internal.g.d(new w(uVarD10, this.f108269C, this.f108268B));
        }

        @Override // com.avito.android.bundles.di.i
        public final void a(VasBundlesFragment vasBundlesFragment) {
            vasBundlesFragment.f108336n0 = this.f108283k.get();
            this.f108267A.get();
            vasBundlesFragment.f108337o0 = this.f108272F.get();
            vasBundlesFragment.f108338p0 = this.f108269C.get();
            vasBundlesFragment.f108339q0 = this.f108281i.get();
            dagger.internal.z zVar = new dagger.internal.z(4);
            zVar.a(this.f108287o.get());
            zVar.a(this.f108294v.get());
            zVar.a(this.f108289q.get());
            zVar.a(this.f108297y.get());
            vasBundlesFragment.f108340r0 = zVar.c();
            vasBundlesFragment.f108341s0 = new com.avito.android.bundles.ui.view.b();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f108273a.u4();
            dagger.internal.t.c(aVarU4);
            vasBundlesFragment.f108342t0 = aVarU4;
        }
    }

    public static i.a a() {
        return new b();
    }
}
