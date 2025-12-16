package com.avito.android.rating_form.step.di;

import Kh0.C14315a;
import android.app.Application;
import android.content.ContentResolver;
import androidx.recyclerview.widget.C;
import androidx.view.S0;
import com.avito.android.J0;
import com.avito.android.L0;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.w;
import com.avito.android.deep_linking.links.x;
import com.avito.android.photo_list_view.C33210d;
import com.avito.android.photo_list_view.InterfaceC33214h;
import com.avito.android.photo_list_view.N;
import com.avito.android.photo_list_view.r;
import com.avito.android.photo_list_view.s;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.photo_picker.b0;
import com.avito.android.rating_form.C34201d;
import com.avito.android.rating_form.InterfaceC34199b;
import com.avito.android.rating_form.step.RatingFormStepArguments;
import com.avito.android.rating_form.step.RatingFormStepFragment;
import com.avito.android.rating_form.step.di.c;
import com.avito.android.rating_form.step.mvi.B;
import com.avito.android.rating_form.step.mvi.t;
import com.avito.android.rating_form.step.validations.o;
import com.avito.android.rating_form.step.validations.q;
import com.avito.android.rating_form.step.y;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.u;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Set;

/* compiled from: DaggerRatingFormStepComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerRatingFormStepComponent.java */
    public static final class b implements c.a {
        public b() {
        }

        @Override // com.avito.android.rating_form.step.di.c.a
        public final com.avito.android.rating_form.step.di.c a(S0 s02, RatingFormStepArguments ratingFormStepArguments, RatingFormStepFragment ratingFormStepFragment, String str, C28478k c28478k, boolean z12, Y41.l lVar, RatingFormStepFragment.e eVar, com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.e eVar2, com.avito.android.auction.details.i iVar, ContentResolver contentResolver, com.avito.android.rating_form.di.g gVar, InterfaceC39417a interfaceC39417a, d dVar, com.avito.android.rating_form.di.e eVar3) {
            ratingFormStepArguments.getClass();
            str.getClass();
            interfaceC39417a.getClass();
            return new c(gVar, interfaceC39417a, dVar, eVar3, s02, ratingFormStepArguments, ratingFormStepFragment, str, c28478k, Boolean.valueOf(z12), lVar, eVar, eVar2, iVar, contentResolver, null);
        }
    }

    /* compiled from: DaggerRatingFormStepComponent.java */
    public static final class c implements com.avito.android.rating_form.step.di.c {

        /* renamed from: A, reason: collision with root package name */
        public final u<o> f249181A;

        /* renamed from: A0, reason: collision with root package name */
        public final com.avito.android.rating_form.item.file_picker.f f249182A0;

        /* renamed from: B, reason: collision with root package name */
        public final com.avito.android.rating_form.step.mvi.n f249183B;

        /* renamed from: B0, reason: collision with root package name */
        public final u<com.avito.android.rating_form.item.chips.d> f249184B0;

        /* renamed from: C, reason: collision with root package name */
        public final B f249185C;

        /* renamed from: C0, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f249186C0;

        /* renamed from: D, reason: collision with root package name */
        public final u<InterfaceC28481c> f249187D;

        /* renamed from: D0, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.h> f249188D0;

        /* renamed from: E, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f249189E;

        /* renamed from: E0, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.e> f249190E0;

        /* renamed from: F, reason: collision with root package name */
        public final y f249191F;

        /* renamed from: F0, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.c> f249192F0;

        /* renamed from: G, reason: collision with root package name */
        public final dagger.internal.f f249193G;

        /* renamed from: G0, reason: collision with root package name */
        public final u<Set<TV0.d<?, ?>>> f249194G0;

        /* renamed from: H, reason: collision with root package name */
        public final u<C> f249195H;

        /* renamed from: H0, reason: collision with root package name */
        public final u<WeakReference<RatingFormStepFragment>> f249196H0;

        /* renamed from: I, reason: collision with root package name */
        public final dagger.internal.l f249197I;

        /* renamed from: I0, reason: collision with root package name */
        public final u<com.avito.android.rating_form.step.b> f249198I0;

        /* renamed from: J, reason: collision with root package name */
        public final u<com.avito.android.rating_form.item.checkBox.h> f249199J;

        /* renamed from: K, reason: collision with root package name */
        public final dagger.internal.l f249200K;

        /* renamed from: L, reason: collision with root package name */
        public final u<Boolean> f249201L;

        /* renamed from: M, reason: collision with root package name */
        public final com.avito.android.rating_form.item.checkBox.g f249202M;

        /* renamed from: N, reason: collision with root package name */
        public final com.avito.android.rating_form.item.checkBox.m f249203N;

        /* renamed from: O, reason: collision with root package name */
        public final u<com.avito.android.rating_form.item.description.e> f249204O;

        /* renamed from: P, reason: collision with root package name */
        public final com.avito.android.rating_form.item.description.d f249205P;

        /* renamed from: Q, reason: collision with root package name */
        public final com.avito.android.rating_form.item.description.i f249206Q;

        /* renamed from: R, reason: collision with root package name */
        public final u<com.avito.android.rating_form.item.header.d> f249207R;

        /* renamed from: S, reason: collision with root package name */
        public final com.avito.android.rating_form.item.header.c f249208S;

        /* renamed from: T, reason: collision with root package name */
        public final com.avito.android.rating_form.item.header.h f249209T;

        /* renamed from: U, reason: collision with root package name */
        public final u<com.avito.android.rating_form.item.multiLineInput.d> f249210U;

        /* renamed from: V, reason: collision with root package name */
        public final u<C14315a> f249211V;

        /* renamed from: W, reason: collision with root package name */
        public final com.avito.android.rating_form.item.multiLineInput.c f249212W;

        /* renamed from: X, reason: collision with root package name */
        public final com.avito.android.rating_form.item.multiLineInput.i f249213X;

        /* renamed from: Y, reason: collision with root package name */
        public final u<com.avito.android.rating_form.item.select.d> f249214Y;

        /* renamed from: Z, reason: collision with root package name */
        public final com.avito.android.rating_form.item.select.c f249215Z;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.rating_form.di.g f249216a;

        /* renamed from: a0, reason: collision with root package name */
        public final u<com.avito.android.rating_form.item.address.d> f249217a0;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f249218b;

        /* renamed from: b0, reason: collision with root package name */
        public final com.avito.android.rating_form.item.address.c f249219b0;

        /* renamed from: c, reason: collision with root package name */
        public final Boolean f249220c;

        /* renamed from: c0, reason: collision with root package name */
        public final u<com.avito.android.rating_form.item.development.d> f249221c0;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.rating_form.y> f249222d;

        /* renamed from: d0, reason: collision with root package name */
        public final com.avito.android.rating_form.item.development.c f249223d0;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.l f249224e;

        /* renamed from: e0, reason: collision with root package name */
        public final u<com.avito.android.rating_form.item.singleLineInput.d> f249225e0;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.rating_form.item.photo_picker.m> f249226f;

        /* renamed from: f0, reason: collision with root package name */
        public final com.avito.android.rating_form.item.singleLineInput.c f249227f0;

        /* renamed from: g, reason: collision with root package name */
        public final u<N> f249228g;

        /* renamed from: g0, reason: collision with root package name */
        public final com.avito.android.rating_form.item.singleLineInput.i f249229g0;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.l f249230h;

        /* renamed from: h0, reason: collision with root package name */
        public final u<com.avito.android.rating_form.item.stars.e> f249231h0;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.l f249232i;

        /* renamed from: i0, reason: collision with root package name */
        public final com.avito.android.rating_form.item.stars.d f249233i0;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC34199b> f249234j;

        /* renamed from: j0, reason: collision with root package name */
        public final com.avito.android.rating_form.item.stars.j f249235j0;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.rating_form.custom_params.n> f249236k;

        /* renamed from: k0, reason: collision with root package name */
        public final u<Application> f249237k0;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.rating_form.custom_params.b> f249238l;

        /* renamed from: l0, reason: collision with root package name */
        public final u<InterfaceC33214h> f249239l0;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.rating_form.custom_params.g> f249240m;

        /* renamed from: m0, reason: collision with root package name */
        public final u<PhotoPickerIntentFactory> f249241m0;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.rating_form.custom_params.d> f249242n;

        /* renamed from: n0, reason: collision with root package name */
        public final u<b0> f249243n0;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.rating_form.l f249244o;

        /* renamed from: o0, reason: collision with root package name */
        public final u<s.b> f249245o0;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.rating_form.interactor.i> f249246p;

        /* renamed from: p0, reason: collision with root package name */
        public final dagger.internal.l f249247p0;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.l f249248q;

        /* renamed from: q0, reason: collision with root package name */
        public final u<s> f249249q0;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.photo_cache.b> f249250r;

        /* renamed from: r0, reason: collision with root package name */
        public final u<com.avito.android.rating_form.item.photo_picker.e> f249251r0;

        /* renamed from: s, reason: collision with root package name */
        public final u<InterfaceC35745a5> f249252s;

        /* renamed from: s0, reason: collision with root package name */
        public final u<C33210d.a> f249253s0;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.photo_cache.j> f249254t;

        /* renamed from: t0, reason: collision with root package name */
        public final com.avito.android.rating_form.item.photo_picker.c f249255t0;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.l f249256u;

        /* renamed from: u0, reason: collision with root package name */
        public final com.avito.android.rating_form.item.photo_picker.j f249257u0;

        /* renamed from: v, reason: collision with root package name */
        public final u<Vg0.d> f249258v;

        /* renamed from: v0, reason: collision with root package name */
        public final u<com.avito.android.rating_form.item.text.d> f249259v0;

        /* renamed from: w, reason: collision with root package name */
        public final u<J0> f249260w;

        /* renamed from: w0, reason: collision with root package name */
        public final com.avito.android.rating_form.item.text.c f249261w0;

        /* renamed from: x, reason: collision with root package name */
        public final u<R0> f249262x;

        /* renamed from: x0, reason: collision with root package name */
        public final u<com.avito.android.rating_form.item.promo_block.d> f249263x0;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.android.rating_form.step.f> f249264y;

        /* renamed from: y0, reason: collision with root package name */
        public final com.avito.android.rating_form.item.promo_block.c f249265y0;

        /* renamed from: z, reason: collision with root package name */
        public final t f249266z;

        /* renamed from: z0, reason: collision with root package name */
        public final u<com.avito.android.rating_form.item.file_picker.h> f249267z0;

        /* compiled from: DaggerRatingFormStepComponent.java */
        /* renamed from: com.avito.android.rating_form.step.di.a$c$a, reason: collision with other inner class name */
        public static final class C7484a implements u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating_form.di.g f249268a;

            public C7484a(com.avito.android.rating_form.di.g gVar) {
                this.f249268a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f249268a.k();
                dagger.internal.t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerRatingFormStepComponent.java */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating_form.di.g f249269a;

            public b(com.avito.android.rating_form.di.g gVar) {
                this.f249269a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f249269a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerRatingFormStepComponent.java */
        /* renamed from: com.avito.android.rating_form.step.di.a$c$c, reason: collision with other inner class name */
        public static final class C7485c implements u<com.avito.android.rating_form.interactor.i> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating_form.di.e f249270a;

            public C7485c(com.avito.android.rating_form.di.e eVar) {
                this.f249270a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.rating_form.interactor.i iVarKe = this.f249270a.Ke();
                dagger.internal.t.c(iVarKe);
                return iVarKe;
            }
        }

        /* compiled from: DaggerRatingFormStepComponent.java */
        public static final class d implements u<com.avito.android.rating_form.item.photo_picker.m> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating_form.di.g f249271a;

            public d(com.avito.android.rating_form.di.g gVar) {
                this.f249271a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.rating_form.item.photo_picker.m mVarCa = this.f249271a.Ca();
                dagger.internal.t.c(mVarCa);
                return mVarCa;
            }
        }

        /* compiled from: DaggerRatingFormStepComponent.java */
        public static final class e implements u<com.avito.android.photo_cache.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating_form.di.g f249272a;

            public e(com.avito.android.rating_form.di.g gVar) {
                this.f249272a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.photo_cache.b bVarF = this.f249272a.F();
                dagger.internal.t.c(bVarF);
                return bVarF;
            }
        }

        /* compiled from: DaggerRatingFormStepComponent.java */
        public static final class f implements u<PhotoPickerIntentFactory> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating_form.di.g f249273a;

            public f(com.avito.android.rating_form.di.g gVar) {
                this.f249273a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f249273a.X();
            }
        }

        /* compiled from: DaggerRatingFormStepComponent.java */
        public static final class g implements u<Vg0.d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating_form.di.g f249274a;

            public g(com.avito.android.rating_form.di.g gVar) {
                this.f249274a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Vg0.d dVarVe = this.f249274a.ve();
                dagger.internal.t.c(dVarVe);
                return dVarVe;
            }
        }

        /* compiled from: DaggerRatingFormStepComponent.java */
        public static final class h implements u<com.avito.android.rating_form.y> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating_form.di.g f249275a;

            public h(com.avito.android.rating_form.di.g gVar) {
                this.f249275a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.rating_form.y yVarHc = this.f249275a.hc();
                dagger.internal.t.c(yVarHc);
                return yVarHc;
            }
        }

        /* compiled from: DaggerRatingFormStepComponent.java */
        public static final class i implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating_form.di.g f249276a;

            public i(com.avito.android.rating_form.di.g gVar) {
                this.f249276a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f249276a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerRatingFormStepComponent.java */
        public static final class j implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating_form.di.g f249277a;

            public j(com.avito.android.rating_form.di.g gVar) {
                this.f249277a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f249277a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerRatingFormStepComponent.java */
        public static final class k implements u<N> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating_form.step.di.d f249278a;

            public k(com.avito.android.rating_form.step.di.d dVar) {
                this.f249278a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                N nSd = this.f249278a.Sd();
                dagger.internal.t.c(nSd);
                return nSd;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.rating_form.di.g gVar, cv.b bVar, com.avito.android.rating_form.step.di.d dVar, com.avito.android.rating_form.di.e eVar, S0 s02, RatingFormStepArguments ratingFormStepArguments, RatingFormStepFragment ratingFormStepFragment, String str, C28478k c28478k, Boolean bool, Y41.l lVar, com.avito.android.rating_form.item.file_picker.c cVar, w wVar, x xVar, ContentResolver contentResolver, C7483a c7483a) {
            this.f249216a = gVar;
            this.f249218b = bVar;
            this.f249220c = bool;
            this.f249222d = new h(gVar);
            this.f249224e = dagger.internal.l.a(ratingFormStepArguments);
            this.f249226f = new d(gVar);
            this.f249228g = new k(dVar);
            this.f249230h = dagger.internal.l.a(wVar);
            this.f249232i = dagger.internal.l.a(xVar);
            this.f249234j = dagger.internal.g.d(C34201d.a());
            this.f249236k = dagger.internal.g.d(com.avito.android.rating_form.custom_params.o.a());
            this.f249238l = dagger.internal.g.d(com.avito.android.rating_form.custom_params.c.a());
            this.f249240m = dagger.internal.g.d(com.avito.android.rating_form.custom_params.h.a());
            A.b bVarA = A.a(3, 0);
            u<com.avito.android.rating_form.custom_params.n> uVar = this.f249236k;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f249238l);
            list.add(this.f249240m);
            u<com.avito.android.rating_form.custom_params.d> uVarD = dagger.internal.g.d(new com.avito.android.rating_form.custom_params.e(bVarA.b()));
            this.f249242n = uVarD;
            this.f249244o = new com.avito.android.rating_form.l(this.f249230h, this.f249232i, uVarD, this.f249228g, this.f249234j);
            this.f249246p = new C7485c(eVar);
            dagger.internal.l lVarA = dagger.internal.l.a(str);
            this.f249248q = lVarA;
            e eVar2 = new e(gVar);
            this.f249250r = eVar2;
            i iVar = new i(gVar);
            this.f249252s = iVar;
            this.f249254t = dagger.internal.g.d(new com.avito.android.rating_form.item.photo_picker.di.g(lVarA, eVar2, iVar));
            this.f249256u = dagger.internal.l.a(contentResolver);
            this.f249258v = new g(gVar);
            u<J0> uVarD2 = dagger.internal.g.d(L0.f67348a);
            this.f249260w = uVarD2;
            u<com.avito.android.rating_form.step.f> uVarD3 = dagger.internal.g.d(new com.avito.android.rating_form.step.n(this.f249224e, this.f249256u, uVarD2, this.f249258v, this.f249222d, new b(gVar)));
            this.f249264y = uVarD3;
            this.f249266z = new t(this.f249222d, this.f249224e, this.f249226f, this.f249244o, this.f249246p, this.f249254t, uVarD3);
            u<o> uVarD4 = dagger.internal.g.d(q.a());
            this.f249181A = uVarD4;
            u<com.avito.android.rating_form.y> uVar2 = this.f249222d;
            dagger.internal.l lVar2 = this.f249224e;
            this.f249183B = new com.avito.android.rating_form.step.mvi.n(lVar2, uVarD4, uVar2, this.f249246p, this.f249264y);
            this.f249185C = new B(uVar2, lVar2, this.f249244o, this.f249230h, this.f249232i);
            this.f249187D = new j(gVar);
            this.f249189E = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f249187D);
            this.f249191F = new y(new com.avito.android.rating_form.step.mvi.w(this.f249266z, this.f249183B, com.avito.android.rating_form.step.mvi.y.a(), this.f249185C, this.f249189E));
            dagger.internal.f fVar = new dagger.internal.f();
            this.f249193G = fVar;
            this.f249195H = dagger.internal.g.d(new n(fVar));
            dagger.internal.l lVarA2 = dagger.internal.l.a(lVar);
            this.f249197I = lVarA2;
            this.f249199J = dagger.internal.g.d(new com.avito.android.rating_form.item.checkBox.k(lVarA2));
            this.f249200K = dagger.internal.l.a(bool);
            u<Boolean> uVarD5 = dagger.internal.g.d(new com.avito.android.rating_form.step.di.k(this.f249224e));
            this.f249201L = uVarD5;
            u<com.avito.android.rating_form.item.checkBox.h> uVar3 = this.f249199J;
            dagger.internal.l lVar3 = this.f249200K;
            this.f249202M = new com.avito.android.rating_form.item.checkBox.g(lVar3, uVarD5, uVar3);
            this.f249203N = new com.avito.android.rating_form.item.checkBox.m(lVar3, uVarD5, uVar3);
            u<com.avito.android.rating_form.item.description.e> uVarD6 = dagger.internal.g.d(com.avito.android.rating_form.item.description.g.a());
            this.f249204O = uVarD6;
            dagger.internal.l lVar4 = this.f249200K;
            this.f249205P = new com.avito.android.rating_form.item.description.d(lVar4, uVarD6);
            this.f249206Q = new com.avito.android.rating_form.item.description.i(lVar4, uVarD6);
            u<com.avito.android.rating_form.item.header.d> uVarD7 = dagger.internal.g.d(new com.avito.android.rating_form.item.header.f(lVar4));
            this.f249207R = uVarD7;
            dagger.internal.l lVar5 = this.f249200K;
            this.f249208S = new com.avito.android.rating_form.item.header.c(lVar5, uVarD7);
            this.f249209T = new com.avito.android.rating_form.item.header.h(lVar5, uVarD7);
            this.f249210U = dagger.internal.g.d(new com.avito.android.rating_form.item.multiLineInput.g(this.f249197I));
            u<C14315a> uVarD8 = dagger.internal.g.d(com.avito.android.rating_ui.utils.counter.di.b.a());
            this.f249211V = uVarD8;
            u<com.avito.android.rating_form.item.multiLineInput.d> uVar4 = this.f249210U;
            dagger.internal.l lVar6 = this.f249200K;
            this.f249212W = new com.avito.android.rating_form.item.multiLineInput.c(lVar6, uVarD8, uVar4);
            this.f249213X = new com.avito.android.rating_form.item.multiLineInput.i(lVar6, uVarD8, uVar4);
            u<com.avito.android.rating_form.item.select.d> uVarD9 = dagger.internal.g.d(new com.avito.android.rating_form.item.select.g(this.f249197I));
            this.f249214Y = uVarD9;
            this.f249215Z = new com.avito.android.rating_form.item.select.c(uVarD9);
            u<com.avito.android.rating_form.item.address.d> uVarD10 = dagger.internal.g.d(new com.avito.android.rating_form.item.address.h(this.f249197I));
            this.f249217a0 = uVarD10;
            this.f249219b0 = new com.avito.android.rating_form.item.address.c(uVarD10);
            u<com.avito.android.rating_form.item.development.d> uVarD11 = dagger.internal.g.d(new com.avito.android.rating_form.item.development.h(this.f249197I));
            this.f249221c0 = uVarD11;
            this.f249223d0 = new com.avito.android.rating_form.item.development.c(uVarD11);
            u<com.avito.android.rating_form.item.singleLineInput.d> uVarD12 = dagger.internal.g.d(new com.avito.android.rating_form.item.singleLineInput.g(this.f249197I));
            this.f249225e0 = uVarD12;
            dagger.internal.l lVar7 = this.f249200K;
            this.f249227f0 = new com.avito.android.rating_form.item.singleLineInput.c(lVar7, uVarD12);
            this.f249229g0 = new com.avito.android.rating_form.item.singleLineInput.i(lVar7, uVarD12);
            u<com.avito.android.rating_form.item.stars.e> uVarD13 = dagger.internal.g.d(new com.avito.android.rating_form.item.stars.h(this.f249197I));
            this.f249231h0 = uVarD13;
            dagger.internal.l lVar8 = this.f249200K;
            this.f249233i0 = new com.avito.android.rating_form.item.stars.d(lVar8, uVarD13);
            this.f249235j0 = new com.avito.android.rating_form.item.stars.j(lVar8, uVarD13);
            r rVar = new r(this.f249250r);
            C7484a c7484a = new C7484a(gVar);
            this.f249237k0 = c7484a;
            this.f249239l0 = dagger.internal.g.d(new com.avito.android.rating_form.item.photo_picker.di.d(this.f249252s, rVar, c7484a, this.f249248q));
            f fVar2 = new f(gVar);
            u<b0> uVarD14 = dagger.internal.g.d(new com.avito.android.rating_form.item.photo_picker.di.h(this.f249248q, this.f249237k0, fVar2));
            this.f249243n0 = uVarD14;
            this.f249245o0 = dagger.internal.g.d(new com.avito.android.rating_form.item.photo_picker.di.f(uVarD14));
            dagger.internal.l lVarA3 = dagger.internal.l.a(ratingFormStepFragment);
            this.f249247p0 = lVarA3;
            u<s> uVarD15 = dagger.internal.g.d(new com.avito.android.rating_form.item.photo_picker.di.e(lVarA3, this.f249224e, this.f249239l0, this.f249245o0, this.f249252s, this.f249228g));
            this.f249249q0 = uVarD15;
            this.f249251r0 = dagger.internal.g.d(new com.avito.android.rating_form.item.photo_picker.h(uVarD15));
            u<C33210d.a> uVarD16 = dagger.internal.g.d(com.avito.android.rating_form.item.photo_picker.di.c.a());
            this.f249253s0 = uVarD16;
            u<com.avito.android.rating_form.item.photo_picker.e> uVar5 = this.f249251r0;
            dagger.internal.l lVar9 = this.f249200K;
            this.f249255t0 = new com.avito.android.rating_form.item.photo_picker.c(lVar9, uVarD16, uVar5);
            this.f249257u0 = new com.avito.android.rating_form.item.photo_picker.j(lVar9, uVarD16, uVar5);
            u<com.avito.android.rating_form.item.text.d> uVarD17 = dagger.internal.g.d(com.avito.android.rating_form.item.text.f.a());
            this.f249259v0 = uVarD17;
            this.f249261w0 = new com.avito.android.rating_form.item.text.c(uVarD17);
            u<com.avito.android.rating_form.item.promo_block.d> uVarD18 = dagger.internal.g.d(com.avito.android.rating_form.item.promo_block.f.a());
            this.f249263x0 = uVarD18;
            this.f249265y0 = new com.avito.android.rating_form.item.promo_block.c(uVarD18);
            u<com.avito.android.rating_form.item.file_picker.h> uVarD19 = dagger.internal.g.d(new com.avito.android.rating_form.item.file_picker.k(dagger.internal.l.a(cVar)));
            this.f249267z0 = uVarD19;
            this.f249182A0 = new com.avito.android.rating_form.item.file_picker.f(uVarD19);
            u<com.avito.android.rating_form.item.chips.d> uVarD20 = dagger.internal.g.d(new com.avito.android.rating_form.item.chips.g(this.f249197I));
            this.f249184B0 = uVarD20;
            u<com.avito.konveyor.a> uVarD21 = dagger.internal.g.d(new l(this.f249202M, this.f249203N, this.f249205P, this.f249206Q, this.f249208S, this.f249209T, this.f249212W, this.f249213X, this.f249215Z, this.f249219b0, this.f249223d0, this.f249227f0, this.f249229g0, this.f249233i0, this.f249235j0, this.f249255t0, this.f249257u0, this.f249261w0, this.f249265y0, this.f249182A0, new com.avito.android.rating_form.item.chips.c(uVarD20)));
            this.f249186C0 = uVarD21;
            this.f249188D0 = dagger.internal.g.d(new com.avito.android.rating_form.step.di.g(uVarD21));
            u<com.avito.android.recycler.data_aware.e> uVarD22 = dagger.internal.g.d(new com.avito.android.rating_form.step.di.i(com.avito.android.rating_form.step.recycler.d.a(), com.avito.android.rating_form.step.recycler.b.a()));
            this.f249190E0 = uVarD22;
            u<com.avito.android.recycler.data_aware.c> uVarD23 = dagger.internal.g.d(new com.avito.android.rating_form.step.di.h(uVarD22, this.f249195H, this.f249188D0));
            this.f249192F0 = uVarD23;
            dagger.internal.f.a(this.f249193G, dagger.internal.g.d(new com.avito.android.rating_form.step.di.f(uVarD23, this.f249186C0)));
            this.f249194G0 = dagger.internal.g.d(new m(this.f249199J, this.f249204O, this.f249207R, this.f249210U, this.f249214Y, this.f249225e0, this.f249231h0, this.f249251r0, this.f249267z0, this.f249184B0));
            u<WeakReference<RatingFormStepFragment>> uVarD24 = dagger.internal.g.d(new com.avito.android.rating_form.step.di.j(this.f249247p0));
            this.f249196H0 = uVarD24;
            this.f249198I0 = dagger.internal.g.d(new com.avito.android.rating_form.step.c(this.f249197I, uVarD24, this.f249249q0));
        }

        @Override // com.avito.android.rating_form.step.di.c
        public final void a(RatingFormStepFragment ratingFormStepFragment) {
            ratingFormStepFragment.f249145n0 = this.f249191F;
            ratingFormStepFragment.f249147p0 = this.f249189E.get();
            ratingFormStepFragment.f249148q0 = (com.avito.konveyor.adapter.j) this.f249193G.get();
            ratingFormStepFragment.f249149r0 = this.f249192F0.get();
            com.avito.android.rating_form.di.g gVar = this.f249216a;
            ratingFormStepFragment.f249150s0 = gVar.X();
            ratingFormStepFragment.f249151t0 = this.f249251r0.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f249218b.u4();
            dagger.internal.t.c(aVarU4);
            ratingFormStepFragment.f249152u0 = aVarU4;
            ratingFormStepFragment.f249153v0 = this.f249249q0.get();
            ratingFormStepFragment.f249154w0 = this.f249194G0.get();
            InterfaceC35745a5 interfaceC35745a5D = gVar.d();
            dagger.internal.t.c(interfaceC35745a5D);
            ratingFormStepFragment.f249155x0 = interfaceC35745a5D;
            ratingFormStepFragment.f249156y0 = this.f249186C0.get();
            ratingFormStepFragment.f249157z0 = gVar.h();
            ratingFormStepFragment.f249128A0 = gVar.r1();
            ratingFormStepFragment.f249129B0 = gVar.o7();
            ratingFormStepFragment.f249130C0 = this.f249198I0.get();
            ratingFormStepFragment.f249131D0 = this.f249220c.booleanValue();
            ratingFormStepFragment.f249132E0 = this.f249201L.get().booleanValue();
        }
    }

    public static c.a a() {
        return new b();
    }
}
