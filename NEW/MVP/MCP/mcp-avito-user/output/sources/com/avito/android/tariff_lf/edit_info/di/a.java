package com.avito.android.tariff_lf.edit_info.di;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.P0;
import bD0.InterfaceC25499a;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.C30060h5;
import com.avito.android.tariff_lf.edit_info.EditInfoFragment;
import com.avito.android.tariff_lf.edit_info.di.b;
import com.avito.android.tariff_lf.edit_info.viewmodel.C35209c;
import com.avito.android.tariff_lf.edit_info.viewmodel.F;
import com.avito.android.tariff_lf.edit_info.viewmodel.H;
import com.avito.android.tariff_lf.edit_info.viewmodel.InterfaceC35207a;
import com.avito.android.tariff_lf.edit_info.viewmodel.InterfaceC35211e;
import com.avito.android.util.InterfaceC35745a5;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import dagger.internal.z;

/* compiled from: DaggerEditInfoComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerEditInfoComponent.java */
    public static final class b implements com.avito.android.tariff_lf.edit_info.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final com.avito.android.tariff_lf.bar.c f298781A;

        /* renamed from: B, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf.edit_info.item.edit_button.d> f298782B;

        /* renamed from: C, reason: collision with root package name */
        public final com.avito.android.tariff_lf.edit_info.item.edit_button.c f298783C;

        /* renamed from: D, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf.edit_info.item.banner.f> f298784D;

        /* renamed from: E, reason: collision with root package name */
        public final com.avito.android.tariff_lf.edit_info.item.banner.b f298785E;

        /* renamed from: F, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf.edit_info.item.tools_header_item.d> f298786F;

        /* renamed from: G, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f298787G;

        /* renamed from: H, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f298788H;

        /* renamed from: I, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.f> f298789I;

        /* renamed from: J, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.b> f298790J;

        /* renamed from: K, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.a> f298791K;

        /* renamed from: L, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.e> f298792L;

        /* renamed from: M, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.c> f298793M;

        /* renamed from: N, reason: collision with root package name */
        public final dagger.internal.l f298794N;

        /* renamed from: O, reason: collision with root package name */
        public final dagger.internal.l f298795O;

        /* renamed from: P, reason: collision with root package name */
        public final u<InterfaceC25499a> f298796P;

        /* renamed from: Q, reason: collision with root package name */
        public final u<InterfaceC35745a5> f298797Q;

        /* renamed from: R, reason: collision with root package name */
        public final u<InterfaceC35211e> f298798R;

        /* renamed from: S, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf.bar.i> f298799S;

        /* renamed from: T, reason: collision with root package name */
        public final u<F> f298800T;

        /* renamed from: U, reason: collision with root package name */
        public final u<Context> f298801U;

        /* renamed from: V, reason: collision with root package name */
        public final u<InterfaceC35207a> f298802V;

        /* renamed from: W, reason: collision with root package name */
        public final u<InterfaceC28481c> f298803W;

        /* renamed from: X, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f298804X;

        /* renamed from: Y, reason: collision with root package name */
        public final u<P0.c> f298805Y;

        /* renamed from: Z, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf.edit_info.viewmodel.k> f298806Z;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.tariff_lf.common.di.a f298807a;

        /* renamed from: a0, reason: collision with root package name */
        public final u<RecyclerView.l> f298808a0;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f298809b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.f f298810c = new dagger.internal.f();

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf.edit_info.item.header.c> f298811d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.tariff_lf.edit_info.item.header.b f298812e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf.edit_info.item.info.d> f298813f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.tariff_lf.edit_info.item.info.c f298814g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf.edit_info.item.prolongation.d> f298815h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f298816i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.tariff_lf.edit_info.item.prolongation.c f298817j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf.edit_info.item.package_title.d> f298818k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.tariff_lf.edit_info.item.package_title.c f298819l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf.edit_info.item.edit_package.regular.d> f298820m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf.edit_info.item.edit_package.micro_category.c> f298821n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f298822o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f298823p;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.tariff_lf.edit_info.item.edit_package.regular.c f298824q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf.edit_info.item.button.d> f298825r;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.tariff_lf.edit_info.item.button.c f298826s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf.edit_info.item.manager_call.f> f298827t;

        /* renamed from: u, reason: collision with root package name */
        public final com.avito.android.tariff_lf.edit_info.item.manager_call.b f298828u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf.edit_info.item.add_category.d> f298829v;

        /* renamed from: w, reason: collision with root package name */
        public final com.avito.android.tariff_lf.edit_info.item.add_category.c f298830w;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf.edit_info.item.edit_package.realty_plus.d> f298831x;

        /* renamed from: y, reason: collision with root package name */
        public final com.avito.android.tariff_lf.edit_info.item.edit_package.realty_plus.c f298832y;

        /* renamed from: z, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf.bar.d> f298833z;

        /* compiled from: DaggerEditInfoComponent.java */
        /* renamed from: com.avito.android.tariff_lf.edit_info.di.a$b$a, reason: collision with other inner class name */
        public static final class C9138a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.tariff_lf.common.di.a f298834a;

            public C9138a(com.avito.android.tariff_lf.common.di.a aVar) {
                this.f298834a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f298834a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerEditInfoComponent.java */
        /* renamed from: com.avito.android.tariff_lf.edit_info.di.a$b$b, reason: collision with other inner class name */
        public static final class C9139b implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.tariff_lf.common.di.a f298835a;

            public C9139b(com.avito.android.tariff_lf.common.di.a aVar) {
                this.f298835a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f298835a.g();
            }
        }

        /* compiled from: DaggerEditInfoComponent.java */
        public static final class c implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.tariff_lf.common.di.a f298836a;

            public c(com.avito.android.tariff_lf.common.di.a aVar) {
                this.f298836a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f298836a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerEditInfoComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.tariff_lf.common.di.a f298837a;

            public d(com.avito.android.tariff_lf.common.di.a aVar) {
                this.f298837a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f298837a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerEditInfoComponent.java */
        public static final class e implements u<InterfaceC25499a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.tariff_lf.common.di.a f298838a;

            public e(com.avito.android.tariff_lf.common.di.a aVar) {
                this.f298838a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC25499a interfaceC25499aQl = this.f298838a.Ql();
                t.c(interfaceC25499aQl);
                return interfaceC25499aQl;
            }
        }

        public b(com.avito.android.tariff_lf.common.di.a aVar, cv.b bVar, Fragment fragment, String str, Resources resources, com.avito.android.analytics.screens.r rVar, C9137a c9137a) {
            this.f298807a = aVar;
            this.f298809b = bVar;
            u<com.avito.android.tariff_lf.edit_info.item.header.c> uVarD = dagger.internal.g.d(com.avito.android.tariff_lf.edit_info.item.header.di.c.a());
            this.f298811d = uVarD;
            this.f298812e = new com.avito.android.tariff_lf.edit_info.item.header.b(uVarD);
            u<com.avito.android.tariff_lf.edit_info.item.info.d> uVarD2 = dagger.internal.g.d(com.avito.android.tariff_lf.edit_info.item.info.f.a());
            this.f298813f = uVarD2;
            this.f298814g = new com.avito.android.tariff_lf.edit_info.item.info.c(uVarD2);
            u<com.avito.android.tariff_lf.edit_info.item.prolongation.d> uVarD3 = dagger.internal.g.d(com.avito.android.tariff_lf.edit_info.item.prolongation.g.a());
            this.f298815h = uVarD3;
            C9138a c9138a = new C9138a(aVar);
            this.f298816i = c9138a;
            this.f298817j = new com.avito.android.tariff_lf.edit_info.item.prolongation.c(uVarD3, c9138a);
            u<com.avito.android.tariff_lf.edit_info.item.package_title.d> uVarD4 = dagger.internal.g.d(com.avito.android.tariff_lf.edit_info.item.package_title.f.a());
            this.f298818k = uVarD4;
            this.f298819l = new com.avito.android.tariff_lf.edit_info.item.package_title.c(uVarD4);
            this.f298820m = dagger.internal.g.d(com.avito.android.tariff_lf.edit_info.item.edit_package.regular.g.a());
            u<com.avito.android.tariff_lf.edit_info.item.edit_package.micro_category.c> uVarD5 = dagger.internal.g.d(com.avito.android.tariff_lf.edit_info.item.edit_package.micro_category.e.a());
            this.f298821n = uVarD5;
            u<com.avito.konveyor.a> uVarD6 = dagger.internal.g.d(new i(new com.avito.android.tariff_lf.edit_info.item.edit_package.micro_category.b(uVarD5)));
            this.f298822o = uVarD6;
            u<com.avito.konveyor.adapter.a> uVarD7 = dagger.internal.g.d(new h(uVarD6));
            this.f298823p = uVarD7;
            this.f298824q = new com.avito.android.tariff_lf.edit_info.item.edit_package.regular.c(uVarD7, this.f298820m, this.f298822o);
            u<com.avito.android.tariff_lf.edit_info.item.button.d> uVarD8 = dagger.internal.g.d(com.avito.android.tariff_lf.edit_info.item.button.g.a());
            this.f298825r = uVarD8;
            this.f298826s = new com.avito.android.tariff_lf.edit_info.item.button.c(uVarD8);
            u<com.avito.android.tariff_lf.edit_info.item.manager_call.f> uVarD9 = dagger.internal.g.d(com.avito.android.tariff_lf.edit_info.item.manager_call.i.a());
            this.f298827t = uVarD9;
            this.f298828u = new com.avito.android.tariff_lf.edit_info.item.manager_call.b(uVarD9);
            u<com.avito.android.tariff_lf.edit_info.item.add_category.d> uVarD10 = dagger.internal.g.d(com.avito.android.tariff_lf.edit_info.item.add_category.g.a());
            this.f298829v = uVarD10;
            this.f298830w = new com.avito.android.tariff_lf.edit_info.item.add_category.c(uVarD10);
            u<com.avito.android.tariff_lf.edit_info.item.edit_package.realty_plus.d> uVarD11 = dagger.internal.g.d(com.avito.android.tariff_lf.edit_info.item.edit_package.realty_plus.g.a());
            this.f298831x = uVarD11;
            this.f298832y = new com.avito.android.tariff_lf.edit_info.item.edit_package.realty_plus.c(uVarD11, this.f298823p, this.f298822o);
            u<com.avito.android.tariff_lf.bar.d> uVarD12 = dagger.internal.g.d(com.avito.android.tariff_lf.bar.f.a());
            this.f298833z = uVarD12;
            this.f298781A = new com.avito.android.tariff_lf.bar.c(uVarD12);
            u<com.avito.android.tariff_lf.edit_info.item.edit_button.d> uVarD13 = dagger.internal.g.d(com.avito.android.tariff_lf.edit_info.item.edit_button.g.a());
            this.f298782B = uVarD13;
            this.f298783C = new com.avito.android.tariff_lf.edit_info.item.edit_button.c(uVarD13);
            u<com.avito.android.tariff_lf.edit_info.item.banner.f> uVarD14 = dagger.internal.g.d(com.avito.android.tariff_lf.edit_info.item.banner.i.a());
            this.f298784D = uVarD14;
            u<com.avito.android.util.text.a> uVar = this.f298816i;
            this.f298785E = new com.avito.android.tariff_lf.edit_info.item.banner.b(uVarD14, uVar);
            u<com.avito.android.tariff_lf.edit_info.item.tools_header_item.d> uVarD15 = dagger.internal.g.d(new com.avito.android.tariff_lf.edit_info.item.tools_header_item.f(uVar));
            this.f298786F = uVarD15;
            u<com.avito.konveyor.a> uVarD16 = dagger.internal.g.d(new g(this.f298812e, this.f298814g, this.f298817j, this.f298819l, this.f298824q, this.f298826s, this.f298828u, this.f298830w, this.f298832y, this.f298781A, this.f298783C, this.f298785E, new com.avito.android.tariff_lf.edit_info.item.tools_header_item.c(uVarD15)));
            this.f298787G = uVarD16;
            this.f298788H = dagger.internal.g.d(new com.avito.android.tariff_lf.edit_info.di.d(uVarD16));
            this.f298789I = dagger.internal.g.d(com.avito.android.tariff_lf.edit_info.ui.d.a());
            this.f298790J = dagger.internal.g.d(com.avito.android.tariff_lf.edit_info.ui.b.a());
            u<com.avito.android.recycler.data_aware.a> uVarD17 = dagger.internal.g.d(com.avito.android.tariff_lf.edit_info.item.prolongation.k.a());
            this.f298791K = uVarD17;
            u<com.avito.android.recycler.data_aware.e> uVarD18 = dagger.internal.g.d(new f(uVarD17, this.f298789I, this.f298790J));
            this.f298792L = uVarD18;
            u<com.avito.android.recycler.data_aware.c> uVarD19 = dagger.internal.g.d(new com.avito.android.tariff_lf.edit_info.di.e(this.f298810c, uVarD18, this.f298788H));
            this.f298793M = uVarD19;
            dagger.internal.f.a(this.f298810c, dagger.internal.g.d(new k(uVarD19, this.f298787G)));
            this.f298794N = dagger.internal.l.a(fragment);
            this.f298795O = dagger.internal.l.a(str);
            e eVar = new e(aVar);
            c cVar = new c(aVar);
            this.f298797Q = cVar;
            this.f298798R = dagger.internal.g.d(new com.avito.android.tariff_lf.edit_info.viewmodel.j(eVar, cVar));
            this.f298799S = dagger.internal.g.d(com.avito.android.tariff_lf.bar.k.a());
            u<F> uVarD20 = dagger.internal.g.d(H.a());
            this.f298800T = uVarD20;
            this.f298802V = dagger.internal.g.d(new C35209c(uVarD20, this.f298799S, this.f298816i, new C9139b(aVar)));
            this.f298803W = new d(aVar);
            u<ScreenPerformanceTracker> uVarD21 = dagger.internal.g.d(new C30060h5(this.f298803W, new j(dagger.internal.l.a(rVar))));
            this.f298804X = uVarD21;
            u<P0.c> uVarD22 = dagger.internal.g.d(new com.avito.android.tariff_lf.edit_info.viewmodel.m(this.f298795O, uVarD21, this.f298798R, this.f298802V, this.f298797Q));
            this.f298805Y = uVarD22;
            this.f298806Z = dagger.internal.g.d(new l(this.f298794N, uVarD22));
            this.f298808a0 = dagger.internal.g.d(new com.avito.android.tariff_lf.edit_info.ui.f(this.f298787G));
        }

        @Override // com.avito.android.tariff_lf.edit_info.di.b
        public final void a(EditInfoFragment editInfoFragment) {
            editInfoFragment.f298749n0 = (com.avito.konveyor.adapter.j) this.f298810c.get();
            editInfoFragment.f298750o0 = this.f298793M.get();
            editInfoFragment.f298751p0 = this.f298806Z.get();
            com.avito.android.util.text.a aVarE = this.f298807a.e();
            t.c(aVarE);
            editInfoFragment.f298752q0 = aVarE;
            editInfoFragment.f298753r0 = this.f298808a0.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f298809b.u4();
            t.c(aVarU4);
            editInfoFragment.f298754s0 = aVarU4;
            z zVar = new z(10);
            zVar.a(this.f298833z.get());
            zVar.a(this.f298782B.get());
            zVar.a(this.f298784D.get());
            zVar.a(this.f298820m.get());
            zVar.a(this.f298831x.get());
            zVar.a(this.f298821n.get());
            zVar.a(this.f298829v.get());
            zVar.a(this.f298825r.get());
            zVar.a(this.f298815h.get());
            zVar.a(this.f298827t.get());
            editInfoFragment.f298755t0 = zVar.c();
            editInfoFragment.f298757v0 = this.f298804X.get();
        }
    }

    /* compiled from: DaggerEditInfoComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.tariff_lf.edit_info.di.b.a
        public final com.avito.android.tariff_lf.edit_info.di.b a(EditInfoFragment editInfoFragment, String str, Resources resources, com.avito.android.tariff_lf.common.di.a aVar, InterfaceC39417a interfaceC39417a, com.avito.android.analytics.screens.r rVar) {
            interfaceC39417a.getClass();
            return new b(aVar, interfaceC39417a, editInfoFragment, str, resources, rVar, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
