package com.avito.android.publish.input_vin.di;

import Jj.C14204c;
import Oi0.InterfaceC14698b;
import android.app.Application;
import android.content.SharedPreferences;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.Q1;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.g0;
import com.avito.android.analytics.i0;
import com.avito.android.analytics.k0;
import com.avito.android.blueprints.input.C28878c;
import com.avito.android.blueprints.publish.html_editor.HtmlEditorViewModel;
import com.avito.android.llm.ui.LlmDescriptionPresenter;
import com.avito.android.publish.C0;
import com.avito.android.publish.PublishParametersInteractor;
import com.avito.android.publish.T0;
import com.avito.android.publish.analytics.E;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.analytics.O;
import com.avito.android.publish.details.S0;
import com.avito.android.publish.details.U0;
import com.avito.android.publish.di.I;
import com.avito.android.publish.drafts.PublishDraftRepository;
import com.avito.android.publish.input_vin.di.b;
import com.avito.android.publish.input_vin.di.f;
import com.avito.android.publish.input_vin.mvi.InputVinMviFragment;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.category_parameters.AttributesTreeConverter;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.util.C3;
import com.avito.android.util.C35823j4;
import com.avito.android.util.E3;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35807h4;
import com.avito.android.util.R0;
import com.avito.android.util.S3;
import com.avito.android.validation.C36009g0;
import com.avito.android.validation.H;
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
import dagger.internal.A;
import dagger.internal.t;
import hz.InterfaceC41196a;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import lD.C43617a;
import me0.C44073b;
import oe0.C44766c;
import oe0.InterfaceC44764a;
import oe0.InterfaceC44767d;
import xe0.C49932c;
import yc.C50213a;

/* compiled from: DaggerInputVinComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerInputVinComponent.java */
    public static final class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.publish.input_vin.di.c f236458a;

        /* renamed from: b, reason: collision with root package name */
        public Resources f236459b;

        /* renamed from: c, reason: collision with root package name */
        public InputVinMviFragment f236460c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f236461d;

        /* renamed from: e, reason: collision with root package name */
        public Boolean f236462e;

        public b() {
        }

        @Override // com.avito.android.publish.input_vin.di.b.a
        public final b.a a(com.avito.android.publish.input_vin.di.c cVar) {
            this.f236458a = cVar;
            return this;
        }

        @Override // com.avito.android.publish.input_vin.di.b.a
        public final b.a b(Resources resources) {
            this.f236459b = resources;
            return this;
        }

        @Override // com.avito.android.publish.input_vin.di.b.a
        public final com.avito.android.publish.input_vin.di.b build() {
            t.a(com.avito.android.publish.input_vin.di.c.class, this.f236458a);
            t.a(Resources.class, this.f236459b);
            t.a(Fragment.class, this.f236460c);
            t.a(Integer.class, this.f236461d);
            t.a(Boolean.class, this.f236462e);
            return new c(new I(), this.f236458a, this.f236459b, this.f236460c, this.f236461d, this.f236462e, null);
        }

        @Override // com.avito.android.publish.input_vin.di.b.a
        public final b.a c(InputVinMviFragment inputVinMviFragment) {
            this.f236460c = inputVinMviFragment;
            return this;
        }

        @Override // com.avito.android.publish.input_vin.di.b.a
        public final b.a d(int i12) {
            this.f236461d = Integer.valueOf(i12);
            return this;
        }

        @Override // com.avito.android.publish.input_vin.di.b.a
        public final b.a e(boolean z12) {
            this.f236462e = Boolean.valueOf(z12);
            return this;
        }
    }

    /* compiled from: DaggerInputVinComponent.java */
    public static final class c implements com.avito.android.publish.input_vin.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final com.avito.android.publish.slots.vin_cropped_image.item.vin_cropped_image.e f236463A;

        /* renamed from: B, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.publish.view.divider.g> f236464B;

        /* renamed from: C, reason: collision with root package name */
        public final com.avito.android.publish.view.divider.b f236465C;

        /* renamed from: D, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f236466D;

        /* renamed from: E, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.a> f236467E;

        /* renamed from: F, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.data_aware.b> f236468F;

        /* renamed from: G, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.data_aware.a> f236469G;

        /* renamed from: H, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.data_aware.e> f236470H;

        /* renamed from: I, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.data_aware.c> f236471I;

        /* renamed from: J, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC14698b> f236472J;

        /* renamed from: K, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC33535v> f236473K;

        /* renamed from: L, reason: collision with root package name */
        public final dagger.internal.u<C0> f236474L;

        /* renamed from: M, reason: collision with root package name */
        public final dagger.internal.l f236475M;

        /* renamed from: N, reason: collision with root package name */
        public final dagger.internal.u<S0> f236476N;

        /* renamed from: O, reason: collision with root package name */
        public final dagger.internal.u<Set<TV0.d<?, ?>>> f236477O;

        /* renamed from: P, reason: collision with root package name */
        public final dagger.internal.u<g1> f236478P;

        /* renamed from: Q, reason: collision with root package name */
        public final dagger.internal.u<hJ.i> f236479Q;

        /* renamed from: R, reason: collision with root package name */
        public final dagger.internal.u<hJ.e> f236480R;

        /* renamed from: S, reason: collision with root package name */
        public final dagger.internal.u<d1> f236481S;

        /* renamed from: T, reason: collision with root package name */
        public final dagger.internal.u<C50213a> f236482T;

        /* renamed from: U, reason: collision with root package name */
        public final dagger.internal.u<m1> f236483U;

        /* renamed from: V, reason: collision with root package name */
        public final dagger.internal.u<Locale> f236484V;

        /* renamed from: W, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.util.C> f236485W;

        /* renamed from: X, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC36026p> f236486X;

        /* renamed from: Y, reason: collision with root package name */
        public final dagger.internal.u<i0> f236487Y;

        /* renamed from: Z, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC36030r0> f236488Z;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.publish.input_vin.di.c f236489a;

        /* renamed from: a0, reason: collision with root package name */
        public final dagger.internal.u<E> f236490a0;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f236491b;

        /* renamed from: b0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC44767d> f236492b0;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.progress_overlay.h> f236493c;

        /* renamed from: c0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC44764a> f236494c0;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.progress_overlay.b> f236495d;

        /* renamed from: d0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.server_time.h> f236496d0;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.f f236497e;

        /* renamed from: e0, reason: collision with root package name */
        public final dagger.internal.u<hJ.g> f236498e0;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<androidx.recyclerview.widget.C> f236499f;

        /* renamed from: f0, reason: collision with root package name */
        public final dagger.internal.u<u3.l<SimpleTestGroupWithNone>> f236500f0;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.util.text.a> f236501g;

        /* renamed from: g0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.category_parameters.a> f236502g0;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.l f236503h;

        /* renamed from: h0, reason: collision with root package name */
        public final dagger.internal.u<SharedPreferences> f236504h0;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<hJ.h> f236505i;

        /* renamed from: i0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.publish.items.e> f236506i0;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<HtmlEditorViewModel> f236507j;

        /* renamed from: j0, reason: collision with root package name */
        public final dagger.internal.u<R0> f236508j0;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<Application> f236509k;

        /* renamed from: k0, reason: collision with root package name */
        public final dagger.internal.u<C43617a> f236510k0;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35807h4> f236511l;

        /* renamed from: l0, reason: collision with root package name */
        public final com.avito.android.publish.input_vin.mvi.mvi.h f236512l0;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<Q1> f236513m;

        /* renamed from: m0, reason: collision with root package name */
        public final com.avito.android.publish.input_vin.mvi.mvi.q f236514m0;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<LlmDescriptionPresenter> f236515n;

        /* renamed from: n0, reason: collision with root package name */
        public final C44073b f236516n0;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprints.input.d> f236517o;

        /* renamed from: o0, reason: collision with root package name */
        public final dagger.internal.u<H0> f236518o0;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<u3.l<SimpleTestGroupWithNone>> f236519p;

        /* renamed from: p0, reason: collision with root package name */
        public final dagger.internal.u<PublishDraftRepository> f236520p0;

        /* renamed from: q, reason: collision with root package name */
        public final C28878c f236521q;

        /* renamed from: q0, reason: collision with root package name */
        public final dagger.internal.u<CategoryParametersConverter> f236522q0;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprint.input.c> f236523r;

        /* renamed from: r0, reason: collision with root package name */
        public final dagger.internal.u<AttributesTreeConverter> f236524r0;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.blueprint.input.b f236525s;

        /* renamed from: s0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.publish.drafts.E> f236526s0;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<AK0.l> f236527t;

        /* renamed from: t0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC41196a> f236528t0;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprints.publish.header.e> f236529u;

        /* renamed from: u0, reason: collision with root package name */
        public final dagger.internal.u<T0> f236530u0;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprints.publish.header.b> f236531v;

        /* renamed from: v0, reason: collision with root package name */
        public final dagger.internal.u<PublishParametersInteractor> f236532v0;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.publish.input_vin.items.scan_button.d> f236533w;

        /* renamed from: w0, reason: collision with root package name */
        public final com.avito.android.publish.input_vin.mvi.y f236534w0;

        /* renamed from: x, reason: collision with root package name */
        public final com.avito.android.publish.input_vin.items.scan_button.b f236535x;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f236536y;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.publish.slots.vin_cropped_image.item.vin_cropped_image.g> f236537z;

        /* compiled from: DaggerInputVinComponent.java */
        public static final class A implements dagger.internal.u<SharedPreferences> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_vin.di.c f236538a;

            public A(com.avito.android.publish.input_vin.di.c cVar) {
                this.f236538a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                SharedPreferences sharedPreferencesR1 = this.f236538a.R1();
                dagger.internal.t.c(sharedPreferencesR1);
                return sharedPreferencesR1;
            }
        }

        /* compiled from: DaggerInputVinComponent.java */
        public static final class B implements dagger.internal.u<T0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_vin.di.c f236539a;

            public B(com.avito.android.publish.input_vin.di.c cVar) {
                this.f236539a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                T0 t0G0 = this.f236539a.G0();
                dagger.internal.t.c(t0G0);
                return t0G0;
            }
        }

        /* compiled from: DaggerInputVinComponent.java */
        public static final class C implements dagger.internal.u<com.avito.android.server_time.h> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_vin.di.c f236540a;

            public C(com.avito.android.publish.input_vin.di.c cVar) {
                this.f236540a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.h hVarY = this.f236540a.y();
                dagger.internal.t.c(hVarY);
                return hVarY;
            }
        }

        /* compiled from: DaggerInputVinComponent.java */
        /* renamed from: com.avito.android.publish.input_vin.di.a$c$a, reason: collision with other inner class name */
        public static final class C7124a implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_vin.di.c f236541a;

            public C7124a(com.avito.android.publish.input_vin.di.c cVar) {
                this.f236541a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f236541a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerInputVinComponent.java */
        /* renamed from: com.avito.android.publish.input_vin.di.a$c$b, reason: case insensitive filesystem */
        public static final class C33867b implements dagger.internal.u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_vin.di.c f236542a;

            public C33867b(com.avito.android.publish.input_vin.di.c cVar) {
                this.f236542a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f236542a.k();
                dagger.internal.t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerInputVinComponent.java */
        /* renamed from: com.avito.android.publish.input_vin.di.a$c$c, reason: collision with other inner class name */
        public static final class C7125c implements dagger.internal.u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_vin.di.c f236543a;

            public C7125c(com.avito.android.publish.input_vin.di.c cVar) {
                this.f236543a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f236543a.e();
                dagger.internal.t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerInputVinComponent.java */
        public static final class d implements dagger.internal.u<AttributesTreeConverter> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_vin.di.c f236544a;

            public d(com.avito.android.publish.input_vin.di.c cVar) {
                this.f236544a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                AttributesTreeConverter attributesTreeConverterUe = this.f236544a.Ue();
                dagger.internal.t.c(attributesTreeConverterUe);
                return attributesTreeConverterUe;
            }
        }

        /* compiled from: DaggerInputVinComponent.java */
        public static final class e implements dagger.internal.u<C43617a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_vin.di.c f236545a;

            public e(com.avito.android.publish.input_vin.di.c cVar) {
                this.f236545a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f236545a.C0();
            }
        }

        /* compiled from: DaggerInputVinComponent.java */
        public static final class f implements dagger.internal.u<com.avito.android.util.C> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_vin.di.c f236546a;

            public f(com.avito.android.publish.input_vin.di.c cVar) {
                this.f236546a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.C cJ2 = this.f236546a.j();
                dagger.internal.t.c(cJ2);
                return cJ2;
            }
        }

        /* compiled from: DaggerInputVinComponent.java */
        public static final class g implements dagger.internal.u<CategoryParametersConverter> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_vin.di.c f236547a;

            public g(com.avito.android.publish.input_vin.di.c cVar) {
                this.f236547a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                CategoryParametersConverter categoryParametersConverterI = this.f236547a.I();
                dagger.internal.t.c(categoryParametersConverterI);
                return categoryParametersConverterI;
            }
        }

        /* compiled from: DaggerInputVinComponent.java */
        public static final class h implements dagger.internal.u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_vin.di.c f236548a;

            public h(com.avito.android.publish.input_vin.di.c cVar) {
                this.f236548a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f236548a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerInputVinComponent.java */
        public static final class i implements dagger.internal.u<InterfaceC41196a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_vin.di.c f236549a;

            public i(com.avito.android.publish.input_vin.di.c cVar) {
                this.f236549a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC41196a interfaceC41196aE0 = this.f236549a.E0();
                dagger.internal.t.c(interfaceC41196aE0);
                return interfaceC41196aE0;
            }
        }

        /* compiled from: DaggerInputVinComponent.java */
        public static final class j implements dagger.internal.u<hJ.e> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_vin.di.c f236550a;

            public j(com.avito.android.publish.input_vin.di.c cVar) {
                this.f236550a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                hJ.e eVarS = this.f236550a.S();
                dagger.internal.t.c(eVarS);
                return eVarS;
            }
        }

        /* compiled from: DaggerInputVinComponent.java */
        public static final class k implements dagger.internal.u<hJ.g> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_vin.di.c f236551a;

            public k(com.avito.android.publish.input_vin.di.c cVar) {
                this.f236551a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                hJ.g gVarP0 = this.f236551a.p0();
                dagger.internal.t.c(gVarP0);
                return gVarP0;
            }
        }

        /* compiled from: DaggerInputVinComponent.java */
        public static final class l implements dagger.internal.u<hJ.i> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_vin.di.c f236552a;

            public l(com.avito.android.publish.input_vin.di.c cVar) {
                this.f236552a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                hJ.i iVarY = this.f236552a.Y();
                dagger.internal.t.c(iVarY);
                return iVarY;
            }
        }

        /* compiled from: DaggerInputVinComponent.java */
        public static final class m implements dagger.internal.u<LlmDescriptionPresenter> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_vin.di.c f236553a;

            public m(com.avito.android.publish.input_vin.di.c cVar) {
                this.f236553a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f236553a.Y0();
            }
        }

        /* compiled from: DaggerInputVinComponent.java */
        public static final class n implements dagger.internal.u<Locale> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_vin.di.c f236554a;

            public n(com.avito.android.publish.input_vin.di.c cVar) {
                this.f236554a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f236554a.locale();
            }
        }

        /* compiled from: DaggerInputVinComponent.java */
        public static final class o implements dagger.internal.u<AK0.l> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_vin.di.c f236555a;

            public o(com.avito.android.publish.input_vin.di.c cVar) {
                this.f236555a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f236555a.r();
            }
        }

        /* compiled from: DaggerInputVinComponent.java */
        public static final class p implements dagger.internal.u<com.avito.android.progress_overlay.h> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_vin.di.c f236556a;

            public p(com.avito.android.publish.input_vin.di.c cVar) {
                this.f236556a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.progress_overlay.h hVarXj = this.f236556a.Xj();
                dagger.internal.t.c(hVarXj);
                return hVarXj;
            }
        }

        /* compiled from: DaggerInputVinComponent.java */
        public static final class q implements dagger.internal.u<C50213a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_vin.di.c f236557a;

            public q(com.avito.android.publish.input_vin.di.c cVar) {
                this.f236557a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C50213a c50213aD1 = this.f236557a.D1();
                dagger.internal.t.c(c50213aD1);
                return c50213aD1;
            }
        }

        /* compiled from: DaggerInputVinComponent.java */
        public static final class r implements dagger.internal.u<H0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_vin.di.c f236558a;

            public r(com.avito.android.publish.input_vin.di.c cVar) {
                this.f236558a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                H0 h0I3 = this.f236558a.I3();
                dagger.internal.t.c(h0I3);
                return h0I3;
            }
        }

        /* compiled from: DaggerInputVinComponent.java */
        public static final class s implements dagger.internal.u<PublishDraftRepository> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_vin.di.c f236559a;

            public s(com.avito.android.publish.input_vin.di.c cVar) {
                this.f236559a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                PublishDraftRepository publishDraftRepositoryMa = this.f236559a.Ma();
                dagger.internal.t.c(publishDraftRepositoryMa);
                return publishDraftRepositoryMa;
            }
        }

        /* compiled from: DaggerInputVinComponent.java */
        public static final class t implements dagger.internal.u<com.avito.android.publish.drafts.E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_vin.di.c f236560a;

            public t(com.avito.android.publish.input_vin.di.c cVar) {
                this.f236560a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.publish.drafts.E eJg = this.f236560a.jg();
                dagger.internal.t.c(eJg);
                return eJg;
            }
        }

        /* compiled from: DaggerInputVinComponent.java */
        public static final class u implements dagger.internal.u<InterfaceC33535v> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_vin.di.c f236561a;

            public u(com.avito.android.publish.input_vin.di.c cVar) {
                this.f236561a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f236561a.P();
            }
        }

        /* compiled from: DaggerInputVinComponent.java */
        public static final class v implements dagger.internal.u<Q1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_vin.di.c f236562a;

            public v(com.avito.android.publish.input_vin.di.c cVar) {
                this.f236562a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f236562a.z0();
            }
        }

        /* compiled from: DaggerInputVinComponent.java */
        public static final class w implements dagger.internal.u<C0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_vin.di.c f236563a;

            public w(com.avito.android.publish.input_vin.di.c cVar) {
                this.f236563a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C0 c0U = this.f236563a.u();
                dagger.internal.t.c(c0U);
                return c0U;
            }
        }

        /* compiled from: DaggerInputVinComponent.java */
        public static final class x implements dagger.internal.u<u3.l<SimpleTestGroupWithNone>> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_vin.di.c f236564a;

            public x(com.avito.android.publish.input_vin.di.c cVar) {
                this.f236564a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                u3.l<SimpleTestGroupWithNone> lVarC1 = this.f236564a.c1();
                dagger.internal.t.c(lVarC1);
                return lVarC1;
            }
        }

        /* compiled from: DaggerInputVinComponent.java */
        public static final class y implements dagger.internal.u<u3.l<SimpleTestGroupWithNone>> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_vin.di.c f236565a;

            public y(com.avito.android.publish.input_vin.di.c cVar) {
                this.f236565a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                u3.l<SimpleTestGroupWithNone> lVarO0 = this.f236565a.O0();
                dagger.internal.t.c(lVarO0);
                return lVarO0;
            }
        }

        /* compiled from: DaggerInputVinComponent.java */
        public static final class z implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.input_vin.di.c f236566a;

            public z(com.avito.android.publish.input_vin.di.c cVar) {
                this.f236566a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f236566a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        public c(I i12, com.avito.android.publish.input_vin.di.c cVar, Resources resources, Fragment fragment, Integer num, Boolean bool, C7123a c7123a) {
            this.f236489a = cVar;
            C7124a c7124a = new C7124a(cVar);
            this.f236491b = c7124a;
            this.f236495d = dagger.internal.g.d(new com.avito.android.progress_overlay.d(c7124a, new p(cVar)));
            dagger.internal.f fVar = new dagger.internal.f();
            this.f236497e = fVar;
            this.f236499f = dagger.internal.g.d(new M(fVar));
            this.f236501g = new C7125c(cVar);
            dagger.internal.l lVarA = dagger.internal.l.a(resources);
            this.f236503h = lVarA;
            this.f236505i = dagger.internal.g.d(new L(lVarA));
            this.f236507j = dagger.internal.g.d(f.a.f236576a);
            dagger.internal.u<InterfaceC35807h4> uVarD = dagger.internal.g.d(new C35823j4(new C33867b(cVar)));
            this.f236511l = uVarD;
            v vVar = new v(cVar);
            this.f236513m = vVar;
            m mVar = new m(cVar);
            this.f236515n = mVar;
            dagger.internal.u<com.avito.android.blueprints.input.d> uVarD2 = dagger.internal.g.d(new com.avito.android.blueprints.input.x(mVar, this.f236501g, this.f236505i, this.f236507j, this.f236491b, uVarD, vVar));
            this.f236517o = uVarD2;
            x xVar = new x(cVar);
            this.f236519p = xVar;
            this.f236521q = new C28878c(uVarD2, xVar);
            dagger.internal.u<com.avito.android.blueprint.input.c> uVarD3 = dagger.internal.g.d(new com.avito.android.blueprint.input.r(this.f236505i, this.f236507j, this.f236491b, this.f236513m, this.f236515n));
            this.f236523r = uVarD3;
            dagger.internal.u<com.avito.android.util.text.a> uVar = this.f236501g;
            this.f236525s = new com.avito.android.blueprint.input.b(uVarD3, uVar, this.f236519p);
            dagger.internal.u<com.avito.android.blueprints.publish.header.e> uVarD4 = dagger.internal.g.d(new com.avito.android.blueprints.publish.header.i(new C14204c(new o(cVar)), uVar));
            this.f236529u = uVarD4;
            this.f236531v = dagger.internal.g.d(new com.avito.android.blueprints.publish.header.d(uVarD4, this.f236513m));
            dagger.internal.u<com.avito.android.publish.input_vin.items.scan_button.d> uVarD5 = dagger.internal.g.d(com.avito.android.publish.input_vin.items.scan_button.h.a());
            this.f236533w = uVarD5;
            this.f236535x = new com.avito.android.publish.input_vin.items.scan_button.b(uVarD5);
            this.f236536y = new z(cVar);
            dagger.internal.u<com.avito.android.publish.slots.vin_cropped_image.item.vin_cropped_image.g> uVarD6 = dagger.internal.g.d(new com.avito.android.publish.slots.vin_cropped_image.item.vin_cropped_image.m(com.avito.android.publish.slots.vin_cropped_image.item.vin_cropped_image.c.a(), this.f236536y));
            this.f236537z = uVarD6;
            this.f236463A = new com.avito.android.publish.slots.vin_cropped_image.item.vin_cropped_image.e(uVarD6);
            dagger.internal.u<com.avito.android.publish.view.divider.g> uVarD7 = dagger.internal.g.d(com.avito.android.publish.view.divider.i.a());
            this.f236464B = uVarD7;
            this.f236465C = new com.avito.android.publish.view.divider.b(uVarD7);
            A.b bVarA = dagger.internal.A.a(6, 0);
            C28878c c28878c = this.f236521q;
            List<dagger.internal.u<T>> list = bVarA.f393937a;
            list.add(c28878c);
            list.add(this.f236525s);
            list.add(this.f236531v);
            list.add(this.f236535x);
            list.add(this.f236463A);
            list.add(this.f236465C);
            dagger.internal.u<com.avito.konveyor.a> uVarD8 = dagger.internal.g.d(new com.avito.android.publish.input_vin.di.g(bVarA.b()));
            this.f236466D = uVarD8;
            this.f236467E = dagger.internal.g.d(new com.avito.android.validation.C(uVarD8));
            this.f236468F = dagger.internal.g.d(E3.a());
            dagger.internal.u<com.avito.android.recycler.data_aware.a> uVarD9 = dagger.internal.g.d(C3.a());
            this.f236469G = uVarD9;
            dagger.internal.u<com.avito.android.recycler.data_aware.e> uVarD10 = dagger.internal.g.d(new J(uVarD9, this.f236468F));
            this.f236470H = uVarD10;
            this.f236471I = dagger.internal.g.d(new H(uVarD10, this.f236499f, this.f236467E));
            dagger.internal.u<InterfaceC14698b> uVarD11 = dagger.internal.g.d(new com.avito.android.validation.I(this.f236466D));
            this.f236472J = uVarD11;
            dagger.internal.f.a(this.f236497e, dagger.internal.g.d(new C36009g0(this.f236471I, uVarD11)));
            this.f236473K = new u(cVar);
            this.f236474L = new w(cVar);
            dagger.internal.l lVarA2 = dagger.internal.l.a(num);
            this.f236475M = lVarA2;
            this.f236476N = dagger.internal.g.d(new U0(lVarA2, this.f236474L));
            this.f236477O = dagger.internal.g.d(new com.avito.android.publish.input_vin.di.h(this.f236533w, this.f236517o, this.f236537z, this.f236523r));
            dagger.internal.u<g1> uVarD12 = dagger.internal.g.d(new N(this.f236503h));
            this.f236478P = uVarD12;
            l lVar = new l(cVar);
            j jVar = new j(cVar);
            this.f236480R = jVar;
            this.f236481S = dagger.internal.g.d(new U(uVarD12, lVar, jVar));
            q qVar = new q(cVar);
            this.f236482T = qVar;
            dagger.internal.u<m1> uVarD13 = dagger.internal.g.d(new g0(this.f236491b, qVar));
            this.f236483U = uVarD13;
            n nVar = new n(cVar);
            this.f236484V = nVar;
            dagger.internal.l lVar2 = this.f236503h;
            S3 s32 = S3.f318734a;
            this.f236486X = dagger.internal.g.d(new T(this.f236481S, this.f236536y, uVarD13, s32, new c1(s32, nVar, lVar2), new f(cVar), this.f236478P, this.f236513m));
            dagger.internal.u<i0> uVarD14 = dagger.internal.g.d(new k0(this.f236491b, this.f236482T));
            this.f236487Y = uVarD14;
            dagger.internal.u<InterfaceC36030r0> uVarD15 = dagger.internal.g.d(new a1(uVarD14, this.f236486X, this.f236536y, this.f236501g));
            this.f236488Z = uVarD15;
            this.f236490a0 = dagger.internal.g.d(new O(this.f236473K, this.f236476N, this.f236477O, uVarD15));
            dagger.internal.u<InterfaceC44767d> uVarD16 = dagger.internal.g.d(new oe0.f(this.f236501g));
            this.f236492b0 = uVarD16;
            this.f236494c0 = dagger.internal.g.d(new C44766c(uVarD16));
            this.f236496d0 = new C(cVar);
            this.f236498e0 = new k(cVar);
            this.f236500f0 = new y(cVar);
            this.f236502g0 = dagger.internal.g.d(new com.avito.android.publish.input_vin.di.e(s32, this.f236503h, this.f236496d0, this.f236484V, this.f236480R, this.f236498e0, this.f236513m, this.f236500f0));
            this.f236506i0 = dagger.internal.g.d(new com.avito.android.publish.items.g(this.f236476N, new C49932c(new A(cVar))));
            this.f236508j0 = new h(cVar);
            dagger.internal.l lVarA3 = dagger.internal.l.a(bool);
            e eVar = new e(cVar);
            this.f236512l0 = new com.avito.android.publish.input_vin.mvi.mvi.h(this.f236475M, lVarA3, this.f236474L, this.f236508j0, eVar);
            this.f236514m0 = new com.avito.android.publish.input_vin.mvi.mvi.q(this.f236502g0, this.f236506i0);
            this.f236516n0 = new C44073b(this.f236503h);
            dagger.internal.u<PublishParametersInteractor> uVarA = dagger.internal.B.a(new com.avito.android.publish.di.J(i12, new r(cVar), this.f236482T, new s(cVar), new g(cVar), new d(cVar), new t(cVar), this.f236513m, new i(cVar), new B(cVar)));
            this.f236532v0 = uVarA;
            dagger.internal.u<R0> uVar2 = this.f236508j0;
            C44073b c44073b = this.f236516n0;
            dagger.internal.u<C0> uVar3 = this.f236474L;
            dagger.internal.l lVar3 = this.f236475M;
            com.avito.android.publish.input_vin.mvi.A a12 = new com.avito.android.publish.input_vin.mvi.A(uVarA, uVar2, c44073b, uVar3, lVar3);
            dagger.internal.u<InterfaceC36030r0> uVar4 = this.f236488Z;
            com.avito.android.publish.input_vin.mvi.mvi.q qVar2 = this.f236514m0;
            dagger.internal.u<InterfaceC33535v> uVar5 = this.f236473K;
            this.f236534w0 = new com.avito.android.publish.input_vin.mvi.y(new com.avito.android.publish.input_vin.mvi.mvi.k(this.f236512l0, new com.avito.android.publish.input_vin.mvi.mvi.b(new com.avito.android.publish.input_vin.mvi.mvi.handlers.c(uVar3, uVar4, lVar3, qVar2, uVar2, uVar5, c44073b, a12), uVar3, lVar3, uVar5), com.avito.android.publish.input_vin.mvi.mvi.m.a(), com.avito.android.publish.input_vin.mvi.mvi.o.a()));
        }

        @Override // com.avito.android.publish.input_vin.di.b
        public final void a(InputVinMviFragment inputVinMviFragment) {
            inputVinMviFragment.f236606n0 = this.f236495d.get();
            com.avito.android.publish.input_vin.di.c cVar = this.f236489a;
            inputVinMviFragment.f236607o0 = cVar.h();
            inputVinMviFragment.f236608p0 = (RecyclerView.Adapter) this.f236497e.get();
            inputVinMviFragment.f236609q0 = this.f236471I.get();
            inputVinMviFragment.f236610r0 = this.f236490a0.get();
            C0 c0U = cVar.u();
            dagger.internal.t.c(c0U);
            inputVinMviFragment.f236611s0 = c0U;
            inputVinMviFragment.f236612t0 = this.f236494c0.get();
            inputVinMviFragment.f236613u0 = this.f236477O.get();
            inputVinMviFragment.f236614v0 = this.f236488Z.get();
            inputVinMviFragment.f236615w0 = this.f236488Z.get();
            inputVinMviFragment.f236616x0 = new com.avito.android.publish.input_vin.mvi.mvi.p(this.f236502g0.get(), this.f236506i0.get());
            inputVinMviFragment.f236617y0 = cVar.z0();
            inputVinMviFragment.f236618z0 = this.f236534w0;
        }
    }

    public static b.a a() {
        return new b();
    }
}
