package com.avito.android.evidence_request.mvi.evidence_details.di;

import Oi0.InterfaceC14698b;
import android.app.Application;
import android.content.res.Resources;
import androidx.recyclerview.widget.C;
import com.avito.android.Q1;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.account.G;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.i0;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.blueprints.input.C28878c;
import com.avito.android.blueprints.publish.html_editor.HtmlEditorViewModel;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.evidence_request.mvi.domain.evidence_details.C30383c;
import com.avito.android.evidence_request.mvi.domain.evidence_details.C30386f;
import com.avito.android.evidence_request.mvi.domain.evidence_details.D;
import com.avito.android.evidence_request.mvi.domain.evidence_details.FilesInteractor;
import com.avito.android.evidence_request.mvi.domain.evidence_details.InterfaceC30381a;
import com.avito.android.evidence_request.mvi.domain.evidence_details.InterfaceC30384d;
import com.avito.android.evidence_request.mvi.domain.evidence_details.z;
import com.avito.android.evidence_request.mvi.domain.evidence_request.AppealId;
import com.avito.android.evidence_request.mvi.domain.evidence_request.ProofDetailsContent;
import com.avito.android.evidence_request.mvi.evidence_details.EvidenceDetailsFragment;
import com.avito.android.evidence_request.mvi.evidence_details.di.b;
import com.avito.android.evidence_request.mvi.evidence_details.di.k;
import com.avito.android.evidence_request.mvi.evidence_details.di.t;
import com.avito.android.evidence_request.mvi.evidence_details.di.w;
import com.avito.android.llm.ui.LlmDescriptionPresenter;
import com.avito.android.photo_list_view.InterfaceC33214h;
import com.avito.android.photo_list_view.InterfaceC33220n;
import com.avito.android.photo_list_view.s;
import com.avito.android.photo_list_view.x;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.photo_picker.b0;
import com.avito.android.remote.K;
import com.avito.android.util.C3;
import com.avito.android.util.C35823j4;
import com.avito.android.util.E3;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35807h4;
import com.avito.android.util.R0;
import com.avito.android.util.S3;
import com.avito.android.validation.C35997a0;
import com.avito.android.validation.C35999b0;
import com.avito.android.validation.C36001c0;
import com.avito.android.validation.C36005e0;
import com.avito.android.validation.C36007f0;
import com.avito.android.validation.C36009g0;
import com.avito.android.validation.C36011h0;
import com.avito.android.validation.C36013i0;
import com.avito.android.validation.H;
import com.avito.android.validation.I;
import com.avito.android.validation.InterfaceC36026p;
import com.avito.android.validation.InterfaceC36030r0;
import com.avito.android.validation.J;
import com.avito.android.validation.L;
import com.avito.android.validation.M;
import com.avito.android.validation.N;
import com.avito.android.validation.P;
import com.avito.android.validation.Q;
import com.avito.android.validation.T;
import com.avito.android.validation.U;
import com.avito.android.validation.V;
import com.avito.android.validation.Y;
import com.avito.android.validation.Z;
import com.avito.android.validation.a1;
import com.avito.android.validation.c1;
import com.avito.android.validation.d1;
import com.avito.android.validation.g1;
import com.avito.android.validation.m1;
import cv.InterfaceC39417a;
import java.util.Locale;
import java.util.Set;

/* compiled from: DaggerEvidenceDetailsComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerEvidenceDetailsComponent.java */
    public static final class b implements com.avito.android.evidence_request.mvi.evidence_details.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC36030r0> f148814A;

        /* renamed from: A0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC33214h> f148815A0;

        /* renamed from: B, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC30381a> f148816B;

        /* renamed from: B0, reason: collision with root package name */
        public final dagger.internal.u<s.b> f148817B0;

        /* renamed from: C, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35807h4> f148818C;

        /* renamed from: C0, reason: collision with root package name */
        public final dagger.internal.u<s.a> f148819C0;

        /* renamed from: D, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprints.select.c> f148820D;

        /* renamed from: D0, reason: collision with root package name */
        public final dagger.internal.u<x> f148821D0;

        /* renamed from: E, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprints.radiogroup.c> f148822E;

        /* renamed from: E0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> f148823E0;

        /* renamed from: F, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprint.radiogroup.c> f148824F;

        /* renamed from: F0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.photo_list_view.s> f148825F0;

        /* renamed from: G, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprints.switcher.b> f148826G;

        /* renamed from: G0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.evidence_request.mvi.evidence_details.adapter.files.c> f148827G0;

        /* renamed from: H, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprint.switcher.c> f148828H;

        /* renamed from: H0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f148829H0;

        /* renamed from: I, reason: collision with root package name */
        public final dagger.internal.u<hJ.h> f148830I;

        /* renamed from: I0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.a> f148831I0;

        /* renamed from: J, reason: collision with root package name */
        public final dagger.internal.u<HtmlEditorViewModel> f148832J;

        /* renamed from: J0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.data_aware.b> f148833J0;

        /* renamed from: K, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f148834K;

        /* renamed from: K0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.data_aware.a> f148835K0;

        /* renamed from: L, reason: collision with root package name */
        public final dagger.internal.u<LlmDescriptionPresenter> f148836L;

        /* renamed from: L0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.data_aware.e> f148837L0;

        /* renamed from: M, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprints.input.d> f148838M;

        /* renamed from: M0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.data_aware.c> f148839M0;

        /* renamed from: N, reason: collision with root package name */
        public final dagger.internal.l f148840N;

        /* renamed from: N0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC14698b> f148841N0;

        /* renamed from: O, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.evidence_request.mvi.evidence_details.adapter.disclaimer.c> f148842O;

        /* renamed from: P, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.evidence_request.mvi.evidence_details.adapter.headerDescription.c> f148843P;

        /* renamed from: Q, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprint.input.c> f148844Q;

        /* renamed from: R, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprint.select.c> f148845R;

        /* renamed from: S, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprint.address.c> f148846S;

        /* renamed from: T, reason: collision with root package name */
        public final dagger.internal.u<Set<TV0.d<?, ?>>> f148847T;

        /* renamed from: U, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.evidence_request.mvi.data.evidence_details.a> f148848U;

        /* renamed from: V, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.evidence_request.mvi.domain.evidence_details.u> f148849V;

        /* renamed from: W, reason: collision with root package name */
        public final dagger.internal.u<z> f148850W;

        /* renamed from: X, reason: collision with root package name */
        public final com.avito.android.evidence_request.mvi.evidence_details.mvi.p f148851X;

        /* renamed from: Y, reason: collision with root package name */
        public final dagger.internal.l f148852Y;

        /* renamed from: Z, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.server_time.h> f148853Z;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f148854a;

        /* renamed from: a0, reason: collision with root package name */
        public final dagger.internal.u<hJ.g> f148855a0;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.evidence_request.mvi.evidence_details.di.c f148856b;

        /* renamed from: b0, reason: collision with root package name */
        public final dagger.internal.u<u3.l<SimpleTestGroupWithNone>> f148857b0;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<R0> f148858c;

        /* renamed from: c0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.category_parameters.a> f148859c0;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.l f148860d;

        /* renamed from: d0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.evidence_request.mvi.domain.evidence_details.n> f148861d0;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<AppealId> f148862e;

        /* renamed from: e0, reason: collision with root package name */
        public final dagger.internal.u<G> f148863e0;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<K> f148864f;

        /* renamed from: f0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.evidence_request.mvi.domain.evidence_details.q> f148865f0;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.photo_cache.b> f148866g;

        /* renamed from: g0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC30384d> f148867g0;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<Application> f148868h;

        /* renamed from: h0, reason: collision with root package name */
        public final com.avito.android.evidence_request.mvi.evidence_details.mvi.d f148869h0;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<PhotoPickerIntentFactory> f148870i;

        /* renamed from: i0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35741a1> f148871i0;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<b0> f148872j;

        /* renamed from: j0, reason: collision with root package name */
        public final com.avito.android.evidence_request.mvi.evidence_details.mvi.u f148873j0;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f148874k;

        /* renamed from: k0, reason: collision with root package name */
        public final com.avito.android.evidence_request.mvi.evidence_details.mvi.w f148875k0;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.photo_cache.j> f148876l;

        /* renamed from: l0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f148877l0;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<FilesInteractor> f148878m;

        /* renamed from: m0, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f148879m0;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.l f148880n;

        /* renamed from: n0, reason: collision with root package name */
        public final com.avito.android.evidence_request.mvi.evidence_details.j f148881n0;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.u<Resources> f148882o;

        /* renamed from: o0, reason: collision with root package name */
        public final dagger.internal.f f148883o0;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<g1> f148884p;

        /* renamed from: p0, reason: collision with root package name */
        public final dagger.internal.u<C> f148885p0;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<hJ.i> f148886q;

        /* renamed from: q0, reason: collision with root package name */
        public final dagger.internal.u<u3.l<SimpleTestGroupWithNone>> f148887q0;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.u<hJ.e> f148888r;

        /* renamed from: r0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprints.select.a> f148889r0;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.u<d1> f148890s;

        /* renamed from: s0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprints.radiogroup.a> f148891s0;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<m1> f148892t;

        /* renamed from: t0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprint.radiogroup.a> f148893t0;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<Locale> f148894u;

        /* renamed from: u0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprints.switcher.a> f148895u0;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.util.C> f148896v;

        /* renamed from: v0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprint.switcher.a> f148897v0;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.u<Q1> f148898w;

        /* renamed from: w0, reason: collision with root package name */
        public final C28878c f148899w0;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC36026p> f148900x;

        /* renamed from: x0, reason: collision with root package name */
        public final com.avito.android.evidence_request.mvi.evidence_details.adapter.disclaimer.b f148901x0;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.util.text.a> f148902y;

        /* renamed from: y0, reason: collision with root package name */
        public final com.avito.android.evidence_request.mvi.evidence_details.adapter.headerDescription.b f148903y0;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.u<i0> f148904z;

        /* renamed from: z0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC33220n> f148905z0;

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        /* renamed from: com.avito.android.evidence_request.mvi.evidence_details.di.a$b$a, reason: collision with other inner class name */
        public static final class C4364a implements dagger.internal.u<G> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.evidence_request.mvi.evidence_details.di.c f148906a;

            public C4364a(com.avito.android.evidence_request.mvi.evidence_details.di.c cVar) {
                this.f148906a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148906a.w();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        /* renamed from: com.avito.android.evidence_request.mvi.evidence_details.di.a$b$b, reason: collision with other inner class name */
        public static final class C4365b implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.evidence_request.mvi.evidence_details.di.c f148907a;

            public C4365b(com.avito.android.evidence_request.mvi.evidence_details.di.c cVar) {
                this.f148907a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148907a.a();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        public static final class c implements dagger.internal.u<AppealId> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.evidence_request.mvi.evidence_details.di.c f148908a;

            public c(com.avito.android.evidence_request.mvi.evidence_details.di.c cVar) {
                this.f148908a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                AppealId appealIdG4 = this.f148908a.G4();
                dagger.internal.t.c(appealIdG4);
                return appealIdG4;
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        public static final class d implements dagger.internal.u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.evidence_request.mvi.evidence_details.di.c f148909a;

            public d(com.avito.android.evidence_request.mvi.evidence_details.di.c cVar) {
                this.f148909a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148909a.k();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        public static final class e implements dagger.internal.u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.evidence_request.mvi.evidence_details.di.c f148910a;

            public e(com.avito.android.evidence_request.mvi.evidence_details.di.c cVar) {
                this.f148910a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148910a.e();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        public static final class f implements dagger.internal.u<com.avito.android.util.C> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.evidence_request.mvi.evidence_details.di.c f148911a;

            public f(com.avito.android.evidence_request.mvi.evidence_details.di.c cVar) {
                this.f148911a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148911a.j();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        public static final class g implements dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f148912a;

            public g(cv.b bVar) {
                this.f148912a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f148912a.u4();
                dagger.internal.t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        public static final class h implements dagger.internal.u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.evidence_request.mvi.evidence_details.di.c f148913a;

            public h(com.avito.android.evidence_request.mvi.evidence_details.di.c cVar) {
                this.f148913a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148913a.c();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        public static final class i implements dagger.internal.u<InterfaceC35741a1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.evidence_request.mvi.evidence_details.di.c f148914a;

            public i(com.avito.android.evidence_request.mvi.evidence_details.di.c cVar) {
                this.f148914a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148914a.n();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        public static final class j implements dagger.internal.u<K> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.evidence_request.mvi.evidence_details.di.c f148915a;

            public j(com.avito.android.evidence_request.mvi.evidence_details.di.c cVar) {
                this.f148915a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148915a.E1();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        public static final class k implements dagger.internal.u<hJ.e> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.evidence_request.mvi.evidence_details.di.c f148916a;

            public k(com.avito.android.evidence_request.mvi.evidence_details.di.c cVar) {
                this.f148916a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148916a.S();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        public static final class l implements dagger.internal.u<hJ.g> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.evidence_request.mvi.evidence_details.di.c f148917a;

            public l(com.avito.android.evidence_request.mvi.evidence_details.di.c cVar) {
                this.f148917a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148917a.p0();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        public static final class m implements dagger.internal.u<hJ.i> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.evidence_request.mvi.evidence_details.di.c f148918a;

            public m(com.avito.android.evidence_request.mvi.evidence_details.di.c cVar) {
                this.f148918a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148918a.Y();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        public static final class n implements dagger.internal.u<LlmDescriptionPresenter> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.evidence_request.mvi.evidence_details.di.c f148919a;

            public n(com.avito.android.evidence_request.mvi.evidence_details.di.c cVar) {
                this.f148919a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148919a.Y0();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        public static final class o implements dagger.internal.u<Locale> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.evidence_request.mvi.evidence_details.di.c f148920a;

            public o(com.avito.android.evidence_request.mvi.evidence_details.di.c cVar) {
                this.f148920a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148920a.locale();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        public static final class p implements dagger.internal.u<com.avito.android.photo_cache.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.evidence_request.mvi.evidence_details.di.c f148921a;

            public p(com.avito.android.evidence_request.mvi.evidence_details.di.c cVar) {
                this.f148921a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148921a.F();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        public static final class q implements dagger.internal.u<PhotoPickerIntentFactory> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.evidence_request.mvi.evidence_details.di.c f148922a;

            public q(com.avito.android.evidence_request.mvi.evidence_details.di.c cVar) {
                this.f148922a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148922a.X();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        public static final class r implements dagger.internal.u<Q1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.evidence_request.mvi.evidence_details.di.c f148923a;

            public r(com.avito.android.evidence_request.mvi.evidence_details.di.c cVar) {
                this.f148923a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148923a.z0();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        public static final class s implements dagger.internal.u<u3.l<SimpleTestGroupWithNone>> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.evidence_request.mvi.evidence_details.di.c f148924a;

            public s(com.avito.android.evidence_request.mvi.evidence_details.di.c cVar) {
                this.f148924a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148924a.c1();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        public static final class t implements dagger.internal.u<u3.l<SimpleTestGroupWithNone>> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.evidence_request.mvi.evidence_details.di.c f148925a;

            public t(com.avito.android.evidence_request.mvi.evidence_details.di.c cVar) {
                this.f148925a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148925a.O0();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        public static final class u implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.evidence_request.mvi.evidence_details.di.c f148926a;

            public u(com.avito.android.evidence_request.mvi.evidence_details.di.c cVar) {
                this.f148926a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148926a.d();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        public static final class v implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30106l7 f148927a;

            public v(InterfaceC30106l7 interfaceC30106l7) {
                this.f148927a = interfaceC30106l7;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f148927a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        public static final class w implements dagger.internal.u<com.avito.android.server_time.h> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.evidence_request.mvi.evidence_details.di.c f148928a;

            public w(com.avito.android.evidence_request.mvi.evidence_details.di.c cVar) {
                this.f148928a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148928a.y();
            }
        }

        public b() {
            throw null;
        }

        public b(com.avito.android.evidence_request.mvi.evidence_details.di.c cVar, InterfaceC30106l7 interfaceC30106l7, cv.b bVar, C28478k c28478k, EvidenceDetailsFragment evidenceDetailsFragment, String str, ProofDetailsContent proofDetailsContent, Y41.l lVar, C4363a c4363a) {
            this.f148854a = bVar;
            this.f148856b = cVar;
            this.f148858c = new h(cVar);
            this.f148860d = dagger.internal.l.a(proofDetailsContent);
            c cVar2 = new c(cVar);
            this.f148862e = cVar2;
            this.f148864f = new j(cVar);
            this.f148866g = new p(cVar);
            d dVar = new d(cVar);
            this.f148868h = dVar;
            this.f148872j = dagger.internal.g.d(new com.avito.android.evidence_request.mvi.evidence_details.di.u(cVar2, dVar, new q(cVar)));
            u uVar = new u(cVar);
            this.f148874k = uVar;
            dagger.internal.u<com.avito.android.photo_cache.j> uVarD = dagger.internal.g.d(new com.avito.android.evidence_request.mvi.evidence_details.di.v(this.f148862e, this.f148866g, uVar));
            this.f148876l = uVarD;
            this.f148878m = dagger.internal.g.d(new com.avito.android.evidence_request.mvi.domain.evidence_details.K(uVarD, this.f148862e, this.f148864f, this.f148866g, this.f148872j));
            dagger.internal.l lVarA = dagger.internal.l.a(evidenceDetailsFragment);
            this.f148880n = lVarA;
            dagger.internal.u<Resources> uVarD2 = dagger.internal.g.d(new com.avito.android.evidence_request.mvi.evidence_details.di.s(lVarA));
            this.f148882o = uVarD2;
            dagger.internal.u<g1> uVarD3 = dagger.internal.g.d(new N(uVarD2));
            this.f148884p = uVarD3;
            m mVar = new m(cVar);
            k kVar = new k(cVar);
            this.f148888r = kVar;
            this.f148890s = dagger.internal.g.d(new U(uVarD3, mVar, kVar));
            dagger.internal.u<m1> uVarD4 = dagger.internal.g.d(w.a.f148985a);
            this.f148892t = uVarD4;
            o oVar = new o(cVar);
            this.f148894u = oVar;
            dagger.internal.u<Resources> uVar2 = this.f148882o;
            S3 s32 = S3.f318734a;
            c1 c1Var = new c1(s32, oVar, uVar2);
            f fVar = new f(cVar);
            r rVar = new r(cVar);
            this.f148898w = rVar;
            this.f148900x = dagger.internal.g.d(new T(this.f148890s, this.f148874k, uVarD4, s32, c1Var, fVar, this.f148884p, rVar));
            this.f148902y = new e(cVar);
            dagger.internal.u<i0> uVarD5 = dagger.internal.g.d(t.a.f148978a);
            this.f148904z = uVarD5;
            this.f148814A = dagger.internal.g.d(new a1(uVarD5, this.f148900x, this.f148874k, this.f148902y));
            this.f148816B = dagger.internal.g.d(C30383c.a());
            dagger.internal.u<InterfaceC35807h4> uVarD6 = dagger.internal.g.d(new C35823j4(this.f148868h));
            this.f148818C = uVarD6;
            this.f148820D = dagger.internal.g.d(new C36013i0(this.f148902y, uVarD6, this.f148898w));
            this.f148822E = dagger.internal.g.d(new C36007f0(this.f148818C, this.f148898w));
            this.f148824F = dagger.internal.g.d(Z.a());
            this.f148826G = dagger.internal.g.d(new Q(this.f148902y, this.f148818C, this.f148898w));
            this.f148828H = dagger.internal.g.d(C36001c0.a());
            this.f148830I = dagger.internal.g.d(new L(this.f148882o));
            dagger.internal.u<HtmlEditorViewModel> uVarD7 = dagger.internal.g.d(k.a.f148940a);
            this.f148832J = uVarD7;
            C4365b c4365b = new C4365b(cVar);
            this.f148834K = c4365b;
            n nVar = new n(cVar);
            this.f148836L = nVar;
            this.f148838M = dagger.internal.g.d(new com.avito.android.blueprints.input.x(nVar, this.f148902y, this.f148830I, uVarD7, c4365b, this.f148818C, this.f148898w));
            dagger.internal.l lVarA2 = dagger.internal.l.a(lVar);
            this.f148840N = lVarA2;
            this.f148842O = dagger.internal.g.d(new com.avito.android.evidence_request.mvi.evidence_details.adapter.disclaimer.e(lVarA2));
            this.f148843P = dagger.internal.g.d(new com.avito.android.evidence_request.mvi.evidence_details.adapter.headerDescription.e(this.f148840N));
            this.f148844Q = dagger.internal.g.d(new com.avito.android.blueprint.input.r(this.f148830I, this.f148832J, this.f148834K, this.f148898w, this.f148836L));
            this.f148845R = dagger.internal.g.d(C35997a0.a());
            dagger.internal.u<com.avito.android.blueprint.address.c> uVarD8 = dagger.internal.g.d(V.a());
            this.f148846S = uVarD8;
            this.f148847T = dagger.internal.g.d(new com.avito.android.evidence_request.mvi.evidence_details.di.p(uVarD8, this.f148820D, this.f148822E, this.f148824F, this.f148826G, this.f148828H, this.f148838M, this.f148842O, this.f148843P, this.f148844Q, this.f148845R));
            this.f148848U = dagger.internal.g.d(new com.avito.android.evidence_request.mvi.data.evidence_details.d(this.f148864f, this.f148862e));
            dagger.internal.u<com.avito.android.evidence_request.mvi.domain.evidence_details.u> uVarD9 = dagger.internal.g.d(com.avito.android.evidence_request.mvi.domain.evidence_details.w.a());
            this.f148849V = uVarD9;
            dagger.internal.u<z> uVarD10 = dagger.internal.g.d(new D(uVarD9, this.f148848U, this.f148874k));
            this.f148850W = uVarD10;
            this.f148851X = new com.avito.android.evidence_request.mvi.evidence_details.mvi.p(this.f148860d, uVarD10, this.f148858c, this.f148878m, this.f148814A, this.f148816B, this.f148847T);
            this.f148852Y = dagger.internal.l.a(str);
            w wVar = new w(cVar);
            l lVar2 = new l(cVar);
            t tVar = new t(cVar);
            this.f148857b0 = tVar;
            dagger.internal.u<com.avito.android.category_parameters.a> uVarD11 = dagger.internal.g.d(new com.avito.android.evidence_request.mvi.evidence_details.di.h(s32, wVar, this.f148894u, this.f148888r, lVar2, this.f148882o, this.f148898w, tVar));
            this.f148859c0 = uVarD11;
            this.f148861d0 = dagger.internal.g.d(new com.avito.android.evidence_request.mvi.domain.evidence_details.p(uVarD11));
            dagger.internal.u<com.avito.android.evidence_request.mvi.domain.evidence_details.q> uVarD12 = dagger.internal.g.d(new com.avito.android.evidence_request.mvi.domain.evidence_details.s(this.f148862e, this.f148864f, new C4364a(cVar), this.f148874k));
            this.f148865f0 = uVarD12;
            dagger.internal.u<InterfaceC30384d> uVarD13 = dagger.internal.g.d(new C30386f(this.f148852Y, uVarD12, this.f148878m, this.f148861d0, this.f148814A));
            this.f148867g0 = uVarD13;
            this.f148869h0 = new com.avito.android.evidence_request.mvi.evidence_details.mvi.d(uVarD13, this.f148816B);
            this.f148873j0 = new com.avito.android.evidence_request.mvi.evidence_details.mvi.u(new i(cVar));
            this.f148875k0 = new com.avito.android.evidence_request.mvi.evidence_details.mvi.w(uVarD13);
            this.f148877l0 = new v(interfaceC30106l7);
            dagger.internal.u<ScreenPerformanceTracker> uVarS = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f148877l0);
            this.f148879m0 = uVarS;
            this.f148881n0 = new com.avito.android.evidence_request.mvi.evidence_details.j(new com.avito.android.evidence_request.mvi.evidence_details.mvi.s(this.f148851X, this.f148869h0, this.f148873j0, this.f148875k0, uVarS));
            dagger.internal.f fVar2 = new dagger.internal.f();
            this.f148883o0 = fVar2;
            this.f148885p0 = dagger.internal.g.d(new M(fVar2));
            s sVar = new s(cVar);
            this.f148887q0 = sVar;
            this.f148889r0 = dagger.internal.g.d(new C36011h0(this.f148820D, this.f148902y, sVar));
            this.f148891s0 = dagger.internal.g.d(new C36005e0(this.f148822E, this.f148902y, this.f148857b0));
            this.f148893t0 = dagger.internal.g.d(new Y(this.f148824F, this.f148902y, this.f148857b0));
            this.f148895u0 = dagger.internal.g.d(new P(this.f148826G, this.f148857b0));
            this.f148897v0 = dagger.internal.g.d(new C35999b0(this.f148828H, this.f148902y, this.f148857b0));
            this.f148899w0 = new C28878c(this.f148838M, this.f148887q0);
            this.f148901x0 = new com.avito.android.evidence_request.mvi.evidence_details.adapter.disclaimer.b(this.f148842O, this.f148902y);
            this.f148903y0 = new com.avito.android.evidence_request.mvi.evidence_details.adapter.headerDescription.b(this.f148843P);
            dagger.internal.u<InterfaceC33220n> uVarD14 = dagger.internal.g.d(new com.avito.android.photo_list_view.r(this.f148866g));
            this.f148905z0 = uVarD14;
            this.f148815A0 = dagger.internal.g.d(new com.avito.android.evidence_request.mvi.evidence_details.di.l(uVarD14, this.f148862e, this.f148874k, this.f148868h));
            this.f148817B0 = dagger.internal.g.d(new com.avito.android.evidence_request.mvi.evidence_details.di.n(this.f148872j));
            this.f148819C0 = dagger.internal.g.d(new com.avito.android.evidence_request.mvi.evidence_details.di.r(this.f148880n));
            dagger.internal.u<x> uVarD15 = dagger.internal.g.d(new com.avito.android.evidence_request.mvi.evidence_details.di.i(this.f148880n));
            this.f148821D0 = uVarD15;
            dagger.internal.u<com.avito.android.photo_list_view.s> uVarD16 = dagger.internal.g.d(new com.avito.android.evidence_request.mvi.evidence_details.di.m(uVarD15, this.f148815A0, this.f148817B0, this.f148819C0, this.f148874k, new g(bVar), this.f148834K));
            this.f148825F0 = uVarD16;
            dagger.internal.u<com.avito.android.evidence_request.mvi.evidence_details.adapter.files.c> uVarD17 = dagger.internal.g.d(new com.avito.android.evidence_request.mvi.evidence_details.adapter.files.h(uVarD16, this.f148902y));
            this.f148827G0 = uVarD17;
            com.avito.android.evidence_request.mvi.evidence_details.adapter.files.b bVar2 = new com.avito.android.evidence_request.mvi.evidence_details.adapter.files.b(uVarD17, this.f148816B);
            dagger.internal.u<com.avito.android.blueprint.input.c> uVar3 = this.f148844Q;
            dagger.internal.u<com.avito.android.util.text.a> uVar4 = this.f148902y;
            dagger.internal.u<u3.l<SimpleTestGroupWithNone>> uVar5 = this.f148887q0;
            dagger.internal.u<com.avito.konveyor.a> uVarD18 = dagger.internal.g.d(new com.avito.android.evidence_request.mvi.evidence_details.di.o(this.f148889r0, this.f148891s0, this.f148893t0, this.f148895u0, this.f148897v0, this.f148899w0, this.f148901x0, this.f148903y0, bVar2, new com.avito.android.blueprint.input.b(uVar3, uVar4, uVar5), new com.avito.android.blueprint.select.b(this.f148845R, uVar4, uVar5), new com.avito.android.blueprint.address.b(this.f148846S, uVar4, uVar5)));
            this.f148829H0 = uVarD18;
            this.f148831I0 = dagger.internal.g.d(new com.avito.android.validation.C(uVarD18));
            this.f148833J0 = dagger.internal.g.d(E3.a());
            dagger.internal.u<com.avito.android.recycler.data_aware.a> uVarD19 = dagger.internal.g.d(C3.a());
            this.f148835K0 = uVarD19;
            dagger.internal.u<com.avito.android.recycler.data_aware.e> uVarD20 = dagger.internal.g.d(new J(uVarD19, this.f148833J0));
            this.f148837L0 = uVarD20;
            this.f148839M0 = dagger.internal.g.d(new H(uVarD20, this.f148885p0, this.f148831I0));
            dagger.internal.u<InterfaceC14698b> uVarD21 = dagger.internal.g.d(new I(this.f148829H0));
            this.f148841N0 = uVarD21;
            dagger.internal.f.a(this.f148883o0, dagger.internal.g.d(new C36009g0(this.f148839M0, uVarD21)));
        }

        @Override // com.avito.android.evidence_request.mvi.evidence_details.di.b
        public final void a(EvidenceDetailsFragment evidenceDetailsFragment) {
            evidenceDetailsFragment.f148739n0 = this.f148881n0;
            evidenceDetailsFragment.f148741p0 = this.f148879m0.get();
            evidenceDetailsFragment.f148742q0 = (com.avito.konveyor.adapter.j) this.f148883o0.get();
            evidenceDetailsFragment.f148743r0 = this.f148839M0.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f148854a.u4();
            dagger.internal.t.c(aVarU4);
            evidenceDetailsFragment.f148744s0 = aVarU4;
            evidenceDetailsFragment.f148745t0 = this.f148856b.h();
        }
    }

    /* compiled from: DaggerEvidenceDetailsComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.evidence_request.mvi.evidence_details.di.b.a
        public final com.avito.android.evidence_request.mvi.evidence_details.di.b a(com.avito.android.evidence_request.mvi.evidence_details.di.c cVar, InterfaceC30106l7 interfaceC30106l7, InterfaceC39417a interfaceC39417a, C28478k c28478k, EvidenceDetailsFragment evidenceDetailsFragment, String str, ProofDetailsContent proofDetailsContent, Y41.l lVar) {
            interfaceC39417a.getClass();
            return new b(cVar, interfaceC30106l7, interfaceC39417a, c28478k, evidenceDetailsFragment, str, proofDetailsContent, lVar, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
