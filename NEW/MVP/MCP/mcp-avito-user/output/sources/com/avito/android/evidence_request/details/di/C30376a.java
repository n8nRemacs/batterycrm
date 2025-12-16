package com.avito.android.evidence_request.details.di;

import Oi0.InterfaceC14698b;
import Rz.InterfaceC15097a;
import android.app.Application;
import android.content.res.Resources;
import androidx.view.P0;
import com.avito.android.Q1;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.account.G;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.i0;
import com.avito.android.blueprints.input.C28878c;
import com.avito.android.blueprints.publish.html_editor.HtmlEditorViewModel;
import com.avito.android.evidence_request.AppealId;
import com.avito.android.evidence_request.details.EvidenceDetailsFragment;
import com.avito.android.evidence_request.details.di.InterfaceC30377b;
import com.avito.android.evidence_request.details.di.h;
import com.avito.android.evidence_request.details.di.l;
import com.avito.android.evidence_request.details.di.q;
import com.avito.android.evidence_request.details.di.r;
import com.avito.android.evidence_request.details.files.FilesInteractor;
import com.avito.android.llm.ui.LlmDescriptionPresenter;
import com.avito.android.photo_list_view.InterfaceC33214h;
import com.avito.android.photo_list_view.s;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.photo_picker.b0;
import com.avito.android.remote.K;
import com.avito.android.util.C3;
import com.avito.android.util.C35823j4;
import com.avito.android.util.E3;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35807h4;
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
/* renamed from: com.avito.android.evidence_request.details.di.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30376a {

    /* compiled from: DaggerEvidenceDetailsComponent.java */
    /* renamed from: com.avito.android.evidence_request.details.di.a$b */
    public static final class b implements InterfaceC30377b {

        /* renamed from: A, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprints.radiogroup.c> f148272A;

        /* renamed from: A0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.a> f148273A0;

        /* renamed from: B, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprint.radiogroup.c> f148274B;

        /* renamed from: B0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.data_aware.b> f148275B0;

        /* renamed from: C, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprints.switcher.b> f148276C;

        /* renamed from: C0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.data_aware.a> f148277C0;

        /* renamed from: D, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprint.switcher.c> f148278D;

        /* renamed from: D0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.data_aware.e> f148279D0;

        /* renamed from: E, reason: collision with root package name */
        public final dagger.internal.u<hJ.h> f148280E;

        /* renamed from: E0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.data_aware.c> f148281E0;

        /* renamed from: F, reason: collision with root package name */
        public final dagger.internal.u<HtmlEditorViewModel> f148282F;

        /* renamed from: F0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC14698b> f148283F0;

        /* renamed from: G, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f148284G;

        /* renamed from: H, reason: collision with root package name */
        public final dagger.internal.u<LlmDescriptionPresenter> f148285H;

        /* renamed from: I, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprints.input.d> f148286I;

        /* renamed from: J, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.evidence_request.details.params.disclaimer.c> f148287J;

        /* renamed from: K, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.evidence_request.details.headerDescription.c> f148288K;

        /* renamed from: L, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprint.input.c> f148289L;

        /* renamed from: M, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprint.select.c> f148290M;

        /* renamed from: N, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprint.address.c> f148291N;

        /* renamed from: O, reason: collision with root package name */
        public final dagger.internal.u<Set<TV0.d<?, ?>>> f148292O;

        /* renamed from: P, reason: collision with root package name */
        public final dagger.internal.u<AppealId> f148293P;

        /* renamed from: Q, reason: collision with root package name */
        public final dagger.internal.u<K> f148294Q;

        /* renamed from: R, reason: collision with root package name */
        public final dagger.internal.u<G> f148295R;

        /* renamed from: S, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.evidence_request.details.y> f148296S;

        /* renamed from: T, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35741a1> f148297T;

        /* renamed from: U, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.photo_cache.b> f148298U;

        /* renamed from: V, reason: collision with root package name */
        public final dagger.internal.u<PhotoPickerIntentFactory> f148299V;

        /* renamed from: W, reason: collision with root package name */
        public final dagger.internal.u<b0> f148300W;

        /* renamed from: X, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.photo_cache.j> f148301X;

        /* renamed from: Y, reason: collision with root package name */
        public final dagger.internal.u<FilesInteractor> f148302Y;

        /* renamed from: Z, reason: collision with root package name */
        public final dagger.internal.l f148303Z;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f148304a;

        /* renamed from: a0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.evidence_request.details.validation.k> f148305a0;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC30378c f148306b;

        /* renamed from: b0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.evidence_request.details.validation.a> f148307b0;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f148308c;

        /* renamed from: c0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.evidence_request.details.validation.f> f148309c0;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.evidence_request.details.g> f148310d;

        /* renamed from: d0, reason: collision with root package name */
        public final dagger.internal.u<P0.c> f148311d0;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.server_time.h> f148312e;

        /* renamed from: e0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.evidence_request.details.h> f148313e0;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<Locale> f148314f;

        /* renamed from: f0, reason: collision with root package name */
        public final dagger.internal.f f148315f0;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<hJ.e> f148316g;

        /* renamed from: g0, reason: collision with root package name */
        public final dagger.internal.u<androidx.recyclerview.widget.C> f148317g0;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<hJ.g> f148318h;

        /* renamed from: h0, reason: collision with root package name */
        public final dagger.internal.u<u3.l<SimpleTestGroupWithNone>> f148319h0;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<Resources> f148320i;

        /* renamed from: i0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprints.select.a> f148321i0;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<Q1> f148322j;

        /* renamed from: j0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprints.radiogroup.a> f148323j0;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<u3.l<SimpleTestGroupWithNone>> f148324k;

        /* renamed from: k0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprint.radiogroup.a> f148325k0;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.category_parameters.a> f148326l;

        /* renamed from: l0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprints.switcher.a> f148327l0;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.evidence_request.details.params.a> f148328m;

        /* renamed from: m0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprint.switcher.a> f148329m0;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<g1> f148330n;

        /* renamed from: n0, reason: collision with root package name */
        public final C28878c f148331n0;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.u<hJ.i> f148332o;

        /* renamed from: o0, reason: collision with root package name */
        public final com.avito.android.evidence_request.details.params.disclaimer.b f148333o0;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<d1> f148334p;

        /* renamed from: p0, reason: collision with root package name */
        public final com.avito.android.evidence_request.details.headerDescription.b f148335p0;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f148336q;

        /* renamed from: q0, reason: collision with root package name */
        public final com.avito.android.photo_list_view.r f148337q0;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.u<m1> f148338r;

        /* renamed from: r0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC33214h> f148339r0;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.util.C> f148340s;

        /* renamed from: s0, reason: collision with root package name */
        public final dagger.internal.u<s.b> f148341s0;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC36026p> f148342t;

        /* renamed from: t0, reason: collision with root package name */
        public final dagger.internal.u<s.a> f148343t0;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.util.text.a> f148344u;

        /* renamed from: u0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.photo_list_view.x> f148345u0;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.u<i0> f148346v;

        /* renamed from: v0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> f148347v0;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC36030r0> f148348w;

        /* renamed from: w0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.photo_list_view.s> f148349w0;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.u<Application> f148350x;

        /* renamed from: x0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.evidence_request.details.files.view.c> f148351x0;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35807h4> f148352y;

        /* renamed from: y0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC15097a> f148353y0;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprints.select.c> f148354z;

        /* renamed from: z0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f148355z0;

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        /* renamed from: com.avito.android.evidence_request.details.di.a$b$a, reason: collision with other inner class name */
        public static final class C4345a implements dagger.internal.u<G> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30378c f148356a;

            public C4345a(InterfaceC30378c interfaceC30378c) {
                this.f148356a = interfaceC30378c;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148356a.w();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        /* renamed from: com.avito.android.evidence_request.details.di.a$b$b, reason: collision with other inner class name */
        public static final class C4346b implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30378c f148357a;

            public C4346b(InterfaceC30378c interfaceC30378c) {
                this.f148357a = interfaceC30378c;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148357a.a();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        /* renamed from: com.avito.android.evidence_request.details.di.a$b$c */
        public static final class c implements dagger.internal.u<AppealId> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30378c f148358a;

            public c(InterfaceC30378c interfaceC30378c) {
                this.f148358a = interfaceC30378c;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                AppealId appealIdG4 = this.f148358a.G4();
                dagger.internal.t.c(appealIdG4);
                return appealIdG4;
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        /* renamed from: com.avito.android.evidence_request.details.di.a$b$d */
        public static final class d implements dagger.internal.u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30378c f148359a;

            public d(InterfaceC30378c interfaceC30378c) {
                this.f148359a = interfaceC30378c;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148359a.k();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        /* renamed from: com.avito.android.evidence_request.details.di.a$b$e */
        public static final class e implements dagger.internal.u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30378c f148360a;

            public e(InterfaceC30378c interfaceC30378c) {
                this.f148360a = interfaceC30378c;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148360a.e();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        /* renamed from: com.avito.android.evidence_request.details.di.a$b$f */
        public static final class f implements dagger.internal.u<com.avito.android.util.C> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30378c f148361a;

            public f(InterfaceC30378c interfaceC30378c) {
                this.f148361a = interfaceC30378c;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148361a.j();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        /* renamed from: com.avito.android.evidence_request.details.di.a$b$g */
        public static final class g implements dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f148362a;

            public g(cv.b bVar) {
                this.f148362a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f148362a.u4();
                dagger.internal.t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        /* renamed from: com.avito.android.evidence_request.details.di.a$b$h */
        public static final class h implements dagger.internal.u<com.avito.android.evidence_request.details.g> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30378c f148363a;

            public h(InterfaceC30378c interfaceC30378c) {
                this.f148363a = interfaceC30378c;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.evidence_request.details.g gVarXh = this.f148363a.Xh();
                dagger.internal.t.c(gVarXh);
                return gVarXh;
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        /* renamed from: com.avito.android.evidence_request.details.di.a$b$i */
        public static final class i implements dagger.internal.u<InterfaceC35741a1> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30378c f148364a;

            public i(InterfaceC30378c interfaceC30378c) {
                this.f148364a = interfaceC30378c;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148364a.n();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        /* renamed from: com.avito.android.evidence_request.details.di.a$b$j */
        public static final class j implements dagger.internal.u<K> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30378c f148365a;

            public j(InterfaceC30378c interfaceC30378c) {
                this.f148365a = interfaceC30378c;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148365a.E1();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        /* renamed from: com.avito.android.evidence_request.details.di.a$b$k */
        public static final class k implements dagger.internal.u<hJ.e> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30378c f148366a;

            public k(InterfaceC30378c interfaceC30378c) {
                this.f148366a = interfaceC30378c;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148366a.S();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        /* renamed from: com.avito.android.evidence_request.details.di.a$b$l */
        public static final class l implements dagger.internal.u<hJ.g> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30378c f148367a;

            public l(InterfaceC30378c interfaceC30378c) {
                this.f148367a = interfaceC30378c;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148367a.p0();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        /* renamed from: com.avito.android.evidence_request.details.di.a$b$m */
        public static final class m implements dagger.internal.u<hJ.i> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30378c f148368a;

            public m(InterfaceC30378c interfaceC30378c) {
                this.f148368a = interfaceC30378c;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148368a.Y();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        /* renamed from: com.avito.android.evidence_request.details.di.a$b$n */
        public static final class n implements dagger.internal.u<LlmDescriptionPresenter> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30378c f148369a;

            public n(InterfaceC30378c interfaceC30378c) {
                this.f148369a = interfaceC30378c;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148369a.Y0();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        /* renamed from: com.avito.android.evidence_request.details.di.a$b$o */
        public static final class o implements dagger.internal.u<Locale> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30378c f148370a;

            public o(InterfaceC30378c interfaceC30378c) {
                this.f148370a = interfaceC30378c;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148370a.locale();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        /* renamed from: com.avito.android.evidence_request.details.di.a$b$p */
        public static final class p implements dagger.internal.u<com.avito.android.photo_cache.b> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30378c f148371a;

            public p(InterfaceC30378c interfaceC30378c) {
                this.f148371a = interfaceC30378c;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148371a.F();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        /* renamed from: com.avito.android.evidence_request.details.di.a$b$q */
        public static final class q implements dagger.internal.u<PhotoPickerIntentFactory> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30378c f148372a;

            public q(InterfaceC30378c interfaceC30378c) {
                this.f148372a = interfaceC30378c;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148372a.X();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        /* renamed from: com.avito.android.evidence_request.details.di.a$b$r */
        public static final class r implements dagger.internal.u<Q1> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30378c f148373a;

            public r(InterfaceC30378c interfaceC30378c) {
                this.f148373a = interfaceC30378c;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148373a.z0();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        /* renamed from: com.avito.android.evidence_request.details.di.a$b$s */
        public static final class s implements dagger.internal.u<u3.l<SimpleTestGroupWithNone>> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30378c f148374a;

            public s(InterfaceC30378c interfaceC30378c) {
                this.f148374a = interfaceC30378c;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148374a.c1();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        /* renamed from: com.avito.android.evidence_request.details.di.a$b$t */
        public static final class t implements dagger.internal.u<u3.l<SimpleTestGroupWithNone>> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30378c f148375a;

            public t(InterfaceC30378c interfaceC30378c) {
                this.f148375a = interfaceC30378c;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148375a.O0();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        /* renamed from: com.avito.android.evidence_request.details.di.a$b$u */
        public static final class u implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30378c f148376a;

            public u(InterfaceC30378c interfaceC30378c) {
                this.f148376a = interfaceC30378c;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148376a.d();
            }
        }

        /* compiled from: DaggerEvidenceDetailsComponent.java */
        /* renamed from: com.avito.android.evidence_request.details.di.a$b$v */
        public static final class v implements dagger.internal.u<com.avito.android.server_time.h> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30378c f148377a;

            public v(InterfaceC30378c interfaceC30378c) {
                this.f148377a = interfaceC30378c;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f148377a.y();
            }
        }

        public b(InterfaceC30378c interfaceC30378c, cv.b bVar, EvidenceDetailsFragment evidenceDetailsFragment, String str, C4344a c4344a) {
            this.f148304a = bVar;
            this.f148306b = interfaceC30378c;
            dagger.internal.l lVarA = dagger.internal.l.a(evidenceDetailsFragment);
            this.f148308c = lVarA;
            this.f148310d = new h(interfaceC30378c);
            this.f148312e = new v(interfaceC30378c);
            this.f148314f = new o(interfaceC30378c);
            this.f148316g = new k(interfaceC30378c);
            this.f148318h = new l(interfaceC30378c);
            dagger.internal.u<Resources> uVarD = dagger.internal.g.d(new com.avito.android.evidence_request.details.di.u(lVarA));
            this.f148320i = uVarD;
            r rVar = new r(interfaceC30378c);
            this.f148322j = rVar;
            t tVar = new t(interfaceC30378c);
            this.f148324k = tVar;
            S3 s32 = S3.f318734a;
            dagger.internal.u<com.avito.android.category_parameters.a> uVarD2 = dagger.internal.g.d(new com.avito.android.evidence_request.details.di.g(s32, this.f148312e, this.f148314f, this.f148316g, this.f148318h, uVarD, rVar, tVar));
            this.f148326l = uVarD2;
            this.f148328m = dagger.internal.g.d(new com.avito.android.evidence_request.details.di.o(uVarD2));
            dagger.internal.u<g1> uVarD3 = dagger.internal.g.d(new N(this.f148320i));
            this.f148330n = uVarD3;
            this.f148334p = dagger.internal.g.d(new U(uVarD3, new m(interfaceC30378c), this.f148316g));
            this.f148336q = new u(interfaceC30378c);
            dagger.internal.u<m1> uVarD4 = dagger.internal.g.d(r.a.f148417a);
            this.f148338r = uVarD4;
            this.f148342t = dagger.internal.g.d(new T(this.f148334p, this.f148336q, uVarD4, s32, new c1(s32, this.f148314f, this.f148320i), new f(interfaceC30378c), this.f148330n, this.f148322j));
            this.f148344u = new e(interfaceC30378c);
            dagger.internal.u<i0> uVarD5 = dagger.internal.g.d(q.a.f148416a);
            this.f148346v = uVarD5;
            this.f148348w = dagger.internal.g.d(new a1(uVarD5, this.f148342t, this.f148336q, this.f148344u));
            d dVar = new d(interfaceC30378c);
            this.f148350x = dVar;
            dagger.internal.u<InterfaceC35807h4> uVarD6 = dagger.internal.g.d(new C35823j4(dVar));
            this.f148352y = uVarD6;
            this.f148354z = dagger.internal.g.d(new C36013i0(this.f148344u, uVarD6, this.f148322j));
            this.f148272A = dagger.internal.g.d(new C36007f0(this.f148352y, this.f148322j));
            this.f148274B = dagger.internal.g.d(Z.a());
            this.f148276C = dagger.internal.g.d(new Q(this.f148344u, this.f148352y, this.f148322j));
            this.f148278D = dagger.internal.g.d(C36001c0.a());
            this.f148280E = dagger.internal.g.d(new L(this.f148320i));
            dagger.internal.u<HtmlEditorViewModel> uVarD7 = dagger.internal.g.d(l.a.f148390a);
            this.f148282F = uVarD7;
            C4346b c4346b = new C4346b(interfaceC30378c);
            this.f148284G = c4346b;
            n nVar = new n(interfaceC30378c);
            this.f148285H = nVar;
            this.f148286I = dagger.internal.g.d(new com.avito.android.blueprints.input.x(nVar, this.f148344u, this.f148280E, uVarD7, c4346b, this.f148352y, this.f148322j));
            this.f148287J = dagger.internal.g.d(h.a.f148387a);
            this.f148288K = dagger.internal.g.d(com.avito.android.evidence_request.details.headerDescription.e.a());
            this.f148289L = dagger.internal.g.d(new com.avito.android.blueprint.input.r(this.f148280E, this.f148282F, this.f148284G, this.f148322j, this.f148285H));
            this.f148290M = dagger.internal.g.d(C35997a0.a());
            dagger.internal.u<com.avito.android.blueprint.address.c> uVarD8 = dagger.internal.g.d(V.a());
            this.f148291N = uVarD8;
            this.f148292O = dagger.internal.g.d(new com.avito.android.evidence_request.details.di.n(uVarD8, this.f148354z, this.f148272A, this.f148274B, this.f148276C, this.f148278D, this.f148286I, this.f148287J, this.f148288K, this.f148289L, this.f148290M));
            c cVar = new c(interfaceC30378c);
            this.f148293P = cVar;
            j jVar = new j(interfaceC30378c);
            this.f148294Q = jVar;
            this.f148296S = dagger.internal.g.d(new com.avito.android.evidence_request.details.di.t(cVar, jVar, new C4345a(interfaceC30378c), this.f148336q));
            this.f148297T = new i(interfaceC30378c);
            this.f148298U = new p(interfaceC30378c);
            this.f148300W = dagger.internal.g.d(new D(this.f148293P, this.f148350x, new q(interfaceC30378c)));
            dagger.internal.u<com.avito.android.photo_cache.j> uVarD9 = dagger.internal.g.d(new E(this.f148293P, this.f148298U, this.f148336q));
            this.f148301X = uVarD9;
            this.f148302Y = dagger.internal.g.d(new y(uVarD9, this.f148293P, this.f148298U, this.f148300W, this.f148336q, this.f148294Q));
            this.f148303Z = dagger.internal.l.a(str);
            this.f148305a0 = dagger.internal.g.d(new com.avito.android.evidence_request.details.validation.n(this.f148294Q, this.f148293P));
            dagger.internal.u<com.avito.android.evidence_request.details.validation.a> uVarD10 = dagger.internal.g.d(com.avito.android.evidence_request.details.validation.c.a());
            this.f148307b0 = uVarD10;
            dagger.internal.u<com.avito.android.evidence_request.details.validation.f> uVarD11 = dagger.internal.g.d(new com.avito.android.evidence_request.details.validation.j(uVarD10, this.f148305a0, this.f148336q));
            this.f148309c0 = uVarD11;
            dagger.internal.u<P0.c> uVarD12 = dagger.internal.g.d(new com.avito.android.evidence_request.details.w(this.f148303Z, uVarD11, this.f148310d, this.f148328m, this.f148348w, this.f148292O, this.f148296S, this.f148297T, this.f148302Y));
            this.f148311d0 = uVarD12;
            this.f148313e0 = dagger.internal.g.d(new com.avito.android.evidence_request.details.di.v(this.f148308c, uVarD12));
            dagger.internal.f fVar = new dagger.internal.f();
            this.f148315f0 = fVar;
            this.f148317g0 = dagger.internal.g.d(new M(fVar));
            s sVar = new s(interfaceC30378c);
            this.f148319h0 = sVar;
            this.f148321i0 = dagger.internal.g.d(new C36011h0(this.f148354z, this.f148344u, sVar));
            this.f148323j0 = dagger.internal.g.d(new C36005e0(this.f148272A, this.f148344u, this.f148324k));
            this.f148325k0 = dagger.internal.g.d(new Y(this.f148274B, this.f148344u, this.f148324k));
            this.f148327l0 = dagger.internal.g.d(new P(this.f148276C, this.f148324k));
            this.f148329m0 = dagger.internal.g.d(new C35999b0(this.f148278D, this.f148344u, this.f148324k));
            this.f148331n0 = new C28878c(this.f148286I, this.f148319h0);
            this.f148333o0 = new com.avito.android.evidence_request.details.params.disclaimer.b(this.f148287J, this.f148344u);
            this.f148335p0 = new com.avito.android.evidence_request.details.headerDescription.b(this.f148288K);
            this.f148337q0 = new com.avito.android.photo_list_view.r(this.f148298U);
            this.f148339r0 = dagger.internal.g.d(new z(this.f148293P, this.f148336q, this.f148337q0, this.f148350x));
            this.f148341s0 = dagger.internal.g.d(new B(this.f148300W));
            this.f148343t0 = dagger.internal.g.d(new com.avito.android.evidence_request.details.di.p(this.f148308c));
            dagger.internal.u<com.avito.android.photo_list_view.x> uVarD13 = dagger.internal.g.d(new com.avito.android.evidence_request.details.di.j(this.f148308c));
            this.f148345u0 = uVarD13;
            dagger.internal.u<com.avito.android.photo_list_view.s> uVarD14 = dagger.internal.g.d(new A(uVarD13, this.f148339r0, this.f148341s0, this.f148343t0, this.f148336q, new g(bVar), this.f148284G));
            this.f148349w0 = uVarD14;
            this.f148351x0 = dagger.internal.g.d(new com.avito.android.evidence_request.details.files.view.f(uVarD14, this.f148344u));
            dagger.internal.u<InterfaceC15097a> uVarD15 = dagger.internal.g.d(new com.avito.android.evidence_request.details.di.i(this.f148308c));
            this.f148353y0 = uVarD15;
            com.avito.android.evidence_request.details.files.view.b bVar2 = new com.avito.android.evidence_request.details.files.view.b(uVarD15, this.f148351x0);
            dagger.internal.u<com.avito.android.blueprint.input.c> uVar = this.f148289L;
            dagger.internal.u<com.avito.android.util.text.a> uVar2 = this.f148344u;
            dagger.internal.u<u3.l<SimpleTestGroupWithNone>> uVar3 = this.f148319h0;
            dagger.internal.u<com.avito.konveyor.a> uVarD16 = dagger.internal.g.d(new com.avito.android.evidence_request.details.di.m(this.f148321i0, this.f148323j0, this.f148325k0, this.f148327l0, this.f148329m0, this.f148331n0, this.f148333o0, this.f148335p0, bVar2, new com.avito.android.blueprint.input.b(uVar, uVar2, uVar3), new com.avito.android.blueprint.select.b(this.f148290M, uVar2, uVar3), new com.avito.android.blueprint.address.b(this.f148291N, uVar2, uVar3)));
            this.f148355z0 = uVarD16;
            this.f148273A0 = dagger.internal.g.d(new com.avito.android.validation.C(uVarD16));
            this.f148275B0 = dagger.internal.g.d(E3.a());
            dagger.internal.u<com.avito.android.recycler.data_aware.a> uVarD17 = dagger.internal.g.d(C3.a());
            this.f148277C0 = uVarD17;
            dagger.internal.u<com.avito.android.recycler.data_aware.e> uVarD18 = dagger.internal.g.d(new J(uVarD17, this.f148275B0));
            this.f148279D0 = uVarD18;
            this.f148281E0 = dagger.internal.g.d(new H(uVarD18, this.f148317g0, this.f148273A0));
            dagger.internal.u<InterfaceC14698b> uVarD19 = dagger.internal.g.d(new I(this.f148355z0));
            this.f148283F0 = uVarD19;
            dagger.internal.f.a(this.f148315f0, dagger.internal.g.d(new C36009g0(this.f148281E0, uVarD19)));
        }

        @Override // com.avito.android.evidence_request.details.di.InterfaceC30377b
        public final void a(EvidenceDetailsFragment evidenceDetailsFragment) {
            evidenceDetailsFragment.f148227n0 = this.f148313e0.get();
            evidenceDetailsFragment.f148228o0 = (com.avito.konveyor.adapter.j) this.f148315f0.get();
            evidenceDetailsFragment.f148229p0 = this.f148281E0.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f148304a.u4();
            dagger.internal.t.c(aVarU4);
            evidenceDetailsFragment.f148230q0 = aVarU4;
            evidenceDetailsFragment.f148231r0 = this.f148306b.h();
            evidenceDetailsFragment.f148232s0 = this.f148348w.get();
        }
    }

    /* compiled from: DaggerEvidenceDetailsComponent.java */
    /* renamed from: com.avito.android.evidence_request.details.di.a$c */
    public static final class c implements InterfaceC30377b.a {
        public c() {
        }

        @Override // com.avito.android.evidence_request.details.di.InterfaceC30377b.a
        public final InterfaceC30377b a(EvidenceDetailsFragment evidenceDetailsFragment, String str, InterfaceC30378c interfaceC30378c, InterfaceC39417a interfaceC39417a) {
            evidenceDetailsFragment.getClass();
            interfaceC39417a.getClass();
            return new b(interfaceC30378c, interfaceC39417a, evidenceDetailsFragment, str, null);
        }
    }

    public static InterfaceC30377b.a a() {
        return new c();
    }
}
