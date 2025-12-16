package com.avito.android.publish.input_imei.di;

import Jj.C14204c;
import Oi0.InterfaceC14698b;
import android.app.Application;
import android.content.SharedPreferences;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.C;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.Q1;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.g0;
import com.avito.android.analytics.i0;
import com.avito.android.analytics.k0;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.blueprints.input.C28878c;
import com.avito.android.blueprints.publish.html_editor.HtmlEditorViewModel;
import com.avito.android.deep_linking.x;
import com.avito.android.llm.ui.LlmDescriptionPresenter;
import com.avito.android.publish.C0;
import com.avito.android.publish.analytics.E;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.analytics.O;
import com.avito.android.publish.details.S0;
import com.avito.android.publish.details.U0;
import com.avito.android.publish.input_imei.InputImeiFragment;
import com.avito.android.publish.input_imei.di.b;
import com.avito.android.publish.input_imei.di.g;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.util.C3;
import com.avito.android.util.C35823j4;
import com.avito.android.util.E3;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35807h4;
import com.avito.android.util.S3;
import com.avito.android.validation.C36009g0;
import com.avito.android.validation.H;
import com.avito.android.validation.I;
import com.avito.android.validation.InterfaceC36026p;
import com.avito.android.validation.InterfaceC36030r0;
import com.avito.android.validation.J;
import com.avito.android.validation.L;
import com.avito.android.validation.M;
import com.avito.android.validation.N;
import com.avito.android.validation.T;
import com.avito.android.validation.U;
import com.avito.android.validation.a1;
import com.avito.android.validation.c1;
import com.avito.android.validation.d1;
import com.avito.android.validation.g1;
import com.avito.android.validation.m1;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.t;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import xe0.C49932c;
import yc.C50213a;

/* compiled from: DaggerInputImeiComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerInputImeiComponent.java */
    public static final class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.publish.input_imei.di.c f236229a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC39417a f236230b;

        /* renamed from: c, reason: collision with root package name */
        public Resources f236231c;

        /* renamed from: d, reason: collision with root package name */
        public InputImeiFragment f236232d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f236233e;

        /* renamed from: f, reason: collision with root package name */
        public C28478k f236234f;

        public b() {
        }

        @Override // com.avito.android.publish.input_imei.di.b.a
        public final b.a a(InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            this.f236230b = interfaceC39417a;
            return this;
        }

        @Override // com.avito.android.publish.input_imei.di.b.a
        public final b.a b(Resources resources) {
            this.f236231c = resources;
            return this;
        }

        @Override // com.avito.android.publish.input_imei.di.b.a
        public final com.avito.android.publish.input_imei.di.b build() {
            t.a(com.avito.android.publish.input_imei.di.c.class, this.f236229a);
            t.a(cv.b.class, this.f236230b);
            t.a(Resources.class, this.f236231c);
            t.a(Fragment.class, this.f236232d);
            t.a(Integer.class, this.f236233e);
            t.a(C28478k.class, this.f236234f);
            return new c(new k(), this.f236229a, this.f236230b, this.f236231c, this.f236232d, this.f236233e, this.f236234f, null);
        }

        @Override // com.avito.android.publish.input_imei.di.b.a
        public final b.a c(C28478k c28478k) {
            this.f236234f = c28478k;
            return this;
        }

        @Override // com.avito.android.publish.input_imei.di.b.a
        public final b.a d(int i12) {
            this.f236233e = Integer.valueOf(i12);
            return this;
        }

        @Override // com.avito.android.publish.input_imei.di.b.a
        public final b.a e(com.avito.android.publish.input_imei.di.c cVar) {
            this.f236229a = cVar;
            return this;
        }

        @Override // com.avito.android.publish.input_imei.di.b.a
        public final b.a f(InputImeiFragment inputImeiFragment) {
            this.f236232d = inputImeiFragment;
            return this;
        }
    }

    /* compiled from: DaggerInputImeiComponent.java */
    public static final class c implements com.avito.android.publish.input_imei.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final dagger.internal.u<i0> f236235A;

        /* renamed from: B, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC36030r0> f236236B;

        /* renamed from: C, reason: collision with root package name */
        public final com.avito.android.publish.input_imei.i f236237C;

        /* renamed from: D, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.publish.input_imei.items.scan_button.d> f236238D;

        /* renamed from: E, reason: collision with root package name */
        public final dagger.internal.u<hJ.h> f236239E;

        /* renamed from: F, reason: collision with root package name */
        public final dagger.internal.u<HtmlEditorViewModel> f236240F;

        /* renamed from: G, reason: collision with root package name */
        public final dagger.internal.u<Application> f236241G;

        /* renamed from: H, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35807h4> f236242H;

        /* renamed from: I, reason: collision with root package name */
        public final dagger.internal.u<LlmDescriptionPresenter> f236243I;

        /* renamed from: J, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprints.input.d> f236244J;

        /* renamed from: K, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprint.input.c> f236245K;

        /* renamed from: L, reason: collision with root package name */
        public final dagger.internal.u<Set<TV0.d<?, ?>>> f236246L;

        /* renamed from: M, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC33535v> f236247M;

        /* renamed from: N, reason: collision with root package name */
        public final dagger.internal.u<x> f236248N;

        /* renamed from: O, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> f236249O;

        /* renamed from: P, reason: collision with root package name */
        public final com.avito.android.publish.input_imei.mvi.n f236250P;

        /* renamed from: Q, reason: collision with root package name */
        public final com.avito.android.publish.input_imei.mvi.g f236251Q;

        /* renamed from: R, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f236252R;

        /* renamed from: S, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f236253S;

        /* renamed from: T, reason: collision with root package name */
        public final com.avito.android.publish.input_imei.l f236254T;

        /* renamed from: U, reason: collision with root package name */
        public final dagger.internal.f f236255U;

        /* renamed from: V, reason: collision with root package name */
        public final dagger.internal.u<C> f236256V;

        /* renamed from: W, reason: collision with root package name */
        public final dagger.internal.u<u3.l<SimpleTestGroupWithNone>> f236257W;

        /* renamed from: X, reason: collision with root package name */
        public final C28878c f236258X;

        /* renamed from: Y, reason: collision with root package name */
        public final com.avito.android.blueprint.input.b f236259Y;

        /* renamed from: Z, reason: collision with root package name */
        public final dagger.internal.u<AK0.l> f236260Z;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.publish.input_imei.di.c f236261a;

        /* renamed from: a0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprints.publish.header.e> f236262a0;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.u<C0> f236263b;

        /* renamed from: b0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprints.publish.header.b> f236264b0;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f236265c;

        /* renamed from: c0, reason: collision with root package name */
        public final com.avito.android.publish.input_imei.items.scan_button.b f236266c0;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.publish.input_imei.di.m> f236267d;

        /* renamed from: d0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.publish.view.divider.g> f236268d0;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<CategoryPublishStep> f236269e;

        /* renamed from: e0, reason: collision with root package name */
        public final com.avito.android.publish.view.divider.b f236270e0;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.server_time.h> f236271f;

        /* renamed from: f0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f236272f0;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.l f236273g;

        /* renamed from: g0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.a> f236274g0;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<Locale> f236275h;

        /* renamed from: h0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.data_aware.b> f236276h0;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<hJ.e> f236277i;

        /* renamed from: i0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.data_aware.a> f236278i0;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<hJ.g> f236279j;

        /* renamed from: j0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.data_aware.e> f236280j0;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<Q1> f236281k;

        /* renamed from: k0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.data_aware.c> f236282k0;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<u3.l<SimpleTestGroupWithNone>> f236283l;

        /* renamed from: l0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC14698b> f236284l0;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.category_parameters.a> f236285m;

        /* renamed from: m0, reason: collision with root package name */
        public final dagger.internal.u<E> f236286m0;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<S0> f236287n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.u<SharedPreferences> f236288o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.publish.items.e> f236289p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<g1> f236290q;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.u<hJ.i> f236291r;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.u<d1> f236292s;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f236293t;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f236294u;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.u<C50213a> f236295v;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.u<m1> f236296w;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.util.C> f236297x;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC36026p> f236298y;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.util.text.a> f236299z;

        /* compiled from: DaggerInputImeiComponent.java */
        /* renamed from: com.avito.android.publish.input_imei.di.a$c$a, reason: collision with other inner class name */
        public static final class C7119a implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_imei.di.c f236300a;

            public C7119a(com.avito.android.publish.input_imei.di.c cVar) {
                this.f236300a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f236300a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerInputImeiComponent.java */
        public static final class b implements dagger.internal.u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_imei.di.c f236301a;

            public b(com.avito.android.publish.input_imei.di.c cVar) {
                this.f236301a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f236301a.k();
                dagger.internal.t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerInputImeiComponent.java */
        /* renamed from: com.avito.android.publish.input_imei.di.a$c$c, reason: collision with other inner class name */
        public static final class C7120c implements dagger.internal.u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_imei.di.c f236302a;

            public C7120c(com.avito.android.publish.input_imei.di.c cVar) {
                this.f236302a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f236302a.e();
                dagger.internal.t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerInputImeiComponent.java */
        public static final class d implements dagger.internal.u<com.avito.android.util.C> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_imei.di.c f236303a;

            public d(com.avito.android.publish.input_imei.di.c cVar) {
                this.f236303a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.C cJ2 = this.f236303a.j();
                dagger.internal.t.c(cJ2);
                return cJ2;
            }
        }

        /* compiled from: DaggerInputImeiComponent.java */
        public static final class e implements dagger.internal.u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_imei.di.c f236304a;

            public e(com.avito.android.publish.input_imei.di.c cVar) {
                this.f236304a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarT = this.f236304a.t();
                dagger.internal.t.c(xVarT);
                return xVarT;
            }
        }

        /* compiled from: DaggerInputImeiComponent.java */
        public static final class f implements dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f236305a;

            public f(cv.b bVar) {
                this.f236305a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f236305a.u4();
                dagger.internal.t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerInputImeiComponent.java */
        public static final class g implements dagger.internal.u<hJ.e> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_imei.di.c f236306a;

            public g(com.avito.android.publish.input_imei.di.c cVar) {
                this.f236306a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                hJ.e eVarS = this.f236306a.S();
                dagger.internal.t.c(eVarS);
                return eVarS;
            }
        }

        /* compiled from: DaggerInputImeiComponent.java */
        public static final class h implements dagger.internal.u<hJ.g> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_imei.di.c f236307a;

            public h(com.avito.android.publish.input_imei.di.c cVar) {
                this.f236307a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                hJ.g gVarP0 = this.f236307a.p0();
                dagger.internal.t.c(gVarP0);
                return gVarP0;
            }
        }

        /* compiled from: DaggerInputImeiComponent.java */
        public static final class i implements dagger.internal.u<hJ.i> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_imei.di.c f236308a;

            public i(com.avito.android.publish.input_imei.di.c cVar) {
                this.f236308a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                hJ.i iVarY = this.f236308a.Y();
                dagger.internal.t.c(iVarY);
                return iVarY;
            }
        }

        /* compiled from: DaggerInputImeiComponent.java */
        public static final class j implements dagger.internal.u<LlmDescriptionPresenter> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_imei.di.c f236309a;

            public j(com.avito.android.publish.input_imei.di.c cVar) {
                this.f236309a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f236309a.Y0();
            }
        }

        /* compiled from: DaggerInputImeiComponent.java */
        public static final class k implements dagger.internal.u<Locale> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_imei.di.c f236310a;

            public k(com.avito.android.publish.input_imei.di.c cVar) {
                this.f236310a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f236310a.locale();
            }
        }

        /* compiled from: DaggerInputImeiComponent.java */
        public static final class l implements dagger.internal.u<AK0.l> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_imei.di.c f236311a;

            public l(com.avito.android.publish.input_imei.di.c cVar) {
                this.f236311a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f236311a.r();
            }
        }

        /* compiled from: DaggerInputImeiComponent.java */
        public static final class m implements dagger.internal.u<C50213a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_imei.di.c f236312a;

            public m(com.avito.android.publish.input_imei.di.c cVar) {
                this.f236312a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C50213a c50213aD1 = this.f236312a.D1();
                dagger.internal.t.c(c50213aD1);
                return c50213aD1;
            }
        }

        /* compiled from: DaggerInputImeiComponent.java */
        public static final class n implements dagger.internal.u<InterfaceC33535v> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_imei.di.c f236313a;

            public n(com.avito.android.publish.input_imei.di.c cVar) {
                this.f236313a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f236313a.P();
            }
        }

        /* compiled from: DaggerInputImeiComponent.java */
        public static final class o implements dagger.internal.u<Q1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_imei.di.c f236314a;

            public o(com.avito.android.publish.input_imei.di.c cVar) {
                this.f236314a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f236314a.z0();
            }
        }

        /* compiled from: DaggerInputImeiComponent.java */
        public static final class p implements dagger.internal.u<C0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_imei.di.c f236315a;

            public p(com.avito.android.publish.input_imei.di.c cVar) {
                this.f236315a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C0 c0U = this.f236315a.u();
                dagger.internal.t.c(c0U);
                return c0U;
            }
        }

        /* compiled from: DaggerInputImeiComponent.java */
        public static final class q implements dagger.internal.u<u3.l<SimpleTestGroupWithNone>> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_imei.di.c f236316a;

            public q(com.avito.android.publish.input_imei.di.c cVar) {
                this.f236316a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                u3.l<SimpleTestGroupWithNone> lVarC1 = this.f236316a.c1();
                dagger.internal.t.c(lVarC1);
                return lVarC1;
            }
        }

        /* compiled from: DaggerInputImeiComponent.java */
        public static final class r implements dagger.internal.u<u3.l<SimpleTestGroupWithNone>> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_imei.di.c f236317a;

            public r(com.avito.android.publish.input_imei.di.c cVar) {
                this.f236317a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                u3.l<SimpleTestGroupWithNone> lVarO0 = this.f236317a.O0();
                dagger.internal.t.c(lVarO0);
                return lVarO0;
            }
        }

        /* compiled from: DaggerInputImeiComponent.java */
        public static final class s implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_imei.di.c f236318a;

            public s(com.avito.android.publish.input_imei.di.c cVar) {
                this.f236318a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f236318a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerInputImeiComponent.java */
        public static final class t implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_imei.di.c f236319a;

            public t(com.avito.android.publish.input_imei.di.c cVar) {
                this.f236319a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f236319a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerInputImeiComponent.java */
        public static final class u implements dagger.internal.u<SharedPreferences> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_imei.di.c f236320a;

            public u(com.avito.android.publish.input_imei.di.c cVar) {
                this.f236320a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                SharedPreferences sharedPreferencesR1 = this.f236320a.R1();
                dagger.internal.t.c(sharedPreferencesR1);
                return sharedPreferencesR1;
            }
        }

        /* compiled from: DaggerInputImeiComponent.java */
        public static final class v implements dagger.internal.u<com.avito.android.server_time.h> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_imei.di.c f236321a;

            public v(com.avito.android.publish.input_imei.di.c cVar) {
                this.f236321a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.h hVarY = this.f236321a.y();
                dagger.internal.t.c(hVarY);
                return hVarY;
            }
        }

        public c(com.avito.android.publish.input_imei.di.k kVar, com.avito.android.publish.input_imei.di.c cVar, cv.b bVar, Resources resources, Fragment fragment, Integer num, C28478k c28478k, C7118a c7118a) {
            this.f236261a = cVar;
            this.f236263b = new p(cVar);
            dagger.internal.l lVarA = dagger.internal.l.a(num);
            this.f236265c = lVarA;
            this.f236267d = dagger.internal.g.d(new com.avito.android.publish.input_imei.di.l(kVar, this.f236263b, lVarA));
            this.f236269e = dagger.internal.g.d(new com.avito.android.publish.input_imei.di.f(this.f236265c, this.f236263b));
            this.f236271f = new v(cVar);
            dagger.internal.l lVarA2 = dagger.internal.l.a(resources);
            this.f236273g = lVarA2;
            k kVar2 = new k(cVar);
            this.f236275h = kVar2;
            g gVar = new g(cVar);
            this.f236277i = gVar;
            h hVar = new h(cVar);
            o oVar = new o(cVar);
            this.f236281k = oVar;
            r rVar = new r(cVar);
            S3 s32 = S3.f318734a;
            this.f236285m = dagger.internal.g.d(new com.avito.android.publish.input_imei.di.e(s32, lVarA2, this.f236271f, kVar2, gVar, hVar, oVar, rVar));
            dagger.internal.u<S0> uVarD = dagger.internal.g.d(new U0(this.f236265c, this.f236263b));
            this.f236287n = uVarD;
            this.f236289p = dagger.internal.g.d(new com.avito.android.publish.items.g(uVarD, new C49932c(new u(cVar))));
            dagger.internal.u<g1> uVarD2 = dagger.internal.g.d(new N(this.f236273g));
            this.f236290q = uVarD2;
            this.f236292s = dagger.internal.g.d(new U(uVarD2, new i(cVar), this.f236277i));
            this.f236293t = new s(cVar);
            C7119a c7119a = new C7119a(cVar);
            this.f236294u = c7119a;
            m mVar = new m(cVar);
            this.f236295v = mVar;
            dagger.internal.u<m1> uVarD3 = dagger.internal.g.d(new g0(c7119a, mVar));
            this.f236296w = uVarD3;
            this.f236298y = dagger.internal.g.d(new T(this.f236292s, this.f236293t, uVarD3, s32, new c1(s32, this.f236275h, this.f236273g), new d(cVar), this.f236290q, this.f236281k));
            this.f236299z = new C7120c(cVar);
            dagger.internal.u<i0> uVarD4 = dagger.internal.g.d(new k0(this.f236294u, this.f236295v));
            this.f236235A = uVarD4;
            dagger.internal.u<InterfaceC36030r0> uVarD5 = dagger.internal.g.d(new a1(uVarD4, this.f236298y, this.f236293t, this.f236299z));
            this.f236236B = uVarD5;
            this.f236237C = new com.avito.android.publish.input_imei.i(this.f236265c, uVarD5, this.f236285m, this.f236289p, this.f236263b);
            this.f236238D = dagger.internal.g.d(com.avito.android.publish.input_imei.items.scan_button.g.a());
            this.f236239E = dagger.internal.g.d(new L(this.f236273g));
            this.f236240F = dagger.internal.g.d(g.a.f236333a);
            dagger.internal.u<InterfaceC35807h4> uVarD6 = dagger.internal.g.d(new C35823j4(new b(cVar)));
            this.f236242H = uVarD6;
            j jVar = new j(cVar);
            this.f236243I = jVar;
            this.f236244J = dagger.internal.g.d(new com.avito.android.blueprints.input.x(jVar, this.f236299z, this.f236239E, this.f236240F, this.f236294u, uVarD6, this.f236281k));
            dagger.internal.u<com.avito.android.blueprint.input.c> uVarD7 = dagger.internal.g.d(new com.avito.android.blueprint.input.r(this.f236239E, this.f236240F, this.f236294u, this.f236281k, this.f236243I));
            this.f236245K = uVarD7;
            dagger.internal.u<Set<TV0.d<?, ?>>> uVarD8 = dagger.internal.g.d(new com.avito.android.publish.input_imei.di.i(uVarD7, this.f236238D, this.f236244J));
            this.f236246L = uVarD8;
            n nVar = new n(cVar);
            this.f236247M = nVar;
            e eVar = new e(cVar);
            f fVar = new f(bVar);
            dagger.internal.u<com.avito.android.publish.input_imei.di.m> uVar = this.f236267d;
            dagger.internal.l lVar = this.f236265c;
            dagger.internal.u<CategoryPublishStep> uVar2 = this.f236269e;
            com.avito.android.publish.input_imei.i iVar = this.f236237C;
            this.f236250P = new com.avito.android.publish.input_imei.mvi.n(uVar, lVar, uVar2, iVar, uVarD8, nVar, eVar, fVar);
            this.f236251Q = new com.avito.android.publish.input_imei.mvi.g(uVar, this.f236289p, lVar, nVar, iVar);
            this.f236252R = new t(cVar);
            this.f236253S = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f236252R);
            this.f236254T = new com.avito.android.publish.input_imei.l(new com.avito.android.publish.input_imei.mvi.q(this.f236250P, this.f236251Q, com.avito.android.publish.input_imei.mvi.s.a(), com.avito.android.publish.input_imei.mvi.u.a(), this.f236253S));
            dagger.internal.f fVar2 = new dagger.internal.f();
            this.f236255U = fVar2;
            this.f236256V = dagger.internal.g.d(new M(fVar2));
            q qVar = new q(cVar);
            this.f236258X = new C28878c(this.f236244J, qVar);
            dagger.internal.u<com.avito.android.blueprint.input.c> uVar3 = this.f236245K;
            dagger.internal.u<com.avito.android.util.text.a> uVar4 = this.f236299z;
            this.f236259Y = new com.avito.android.blueprint.input.b(uVar3, uVar4, qVar);
            dagger.internal.u<com.avito.android.blueprints.publish.header.e> uVarD9 = dagger.internal.g.d(new com.avito.android.blueprints.publish.header.i(new C14204c(new l(cVar)), uVar4));
            this.f236262a0 = uVarD9;
            this.f236264b0 = dagger.internal.g.d(new com.avito.android.blueprints.publish.header.d(uVarD9, this.f236281k));
            this.f236266c0 = new com.avito.android.publish.input_imei.items.scan_button.b(this.f236238D);
            dagger.internal.u<com.avito.android.publish.view.divider.g> uVarD10 = dagger.internal.g.d(com.avito.android.publish.view.divider.i.a());
            this.f236268d0 = uVarD10;
            this.f236270e0 = new com.avito.android.publish.view.divider.b(uVarD10);
            A.b bVarA = A.a(5, 0);
            C28878c c28878c = this.f236258X;
            List<dagger.internal.u<T>> list = bVarA.f393937a;
            list.add(c28878c);
            list.add(this.f236259Y);
            list.add(this.f236264b0);
            list.add(this.f236266c0);
            list.add(this.f236270e0);
            dagger.internal.u<com.avito.konveyor.a> uVarD11 = dagger.internal.g.d(new com.avito.android.publish.input_imei.di.h(bVarA.b()));
            this.f236272f0 = uVarD11;
            this.f236274g0 = dagger.internal.g.d(new com.avito.android.validation.C(uVarD11));
            this.f236276h0 = dagger.internal.g.d(E3.a());
            dagger.internal.u<com.avito.android.recycler.data_aware.a> uVarD12 = dagger.internal.g.d(C3.a());
            this.f236278i0 = uVarD12;
            dagger.internal.u<com.avito.android.recycler.data_aware.e> uVarD13 = dagger.internal.g.d(new J(uVarD12, this.f236276h0));
            this.f236280j0 = uVarD13;
            this.f236282k0 = dagger.internal.g.d(new H(uVarD13, this.f236256V, this.f236274g0));
            dagger.internal.u<InterfaceC14698b> uVarD14 = dagger.internal.g.d(new I(this.f236272f0));
            this.f236284l0 = uVarD14;
            dagger.internal.f.a(this.f236255U, dagger.internal.g.d(new C36009g0(this.f236282k0, uVarD14)));
            this.f236286m0 = dagger.internal.g.d(new O(this.f236247M, this.f236287n, this.f236246L, this.f236236B));
        }

        @Override // com.avito.android.publish.input_imei.di.b
        public final void a(InputImeiFragment inputImeiFragment) {
            inputImeiFragment.f236196n0 = this.f236254T;
            inputImeiFragment.f236198p0 = this.f236253S.get();
            inputImeiFragment.f236199q0 = this.f236246L.get();
            inputImeiFragment.f236200r0 = (RecyclerView.Adapter) this.f236255U.get();
            inputImeiFragment.f236201s0 = this.f236282k0.get();
            inputImeiFragment.f236202t0 = this.f236236B.get();
            inputImeiFragment.f236203u0 = this.f236236B.get();
            inputImeiFragment.f236204v0 = this.f236286m0.get();
            inputImeiFragment.f236205w0 = this.f236261a.z0();
        }
    }

    public static b.a a() {
        return new b();
    }
}
