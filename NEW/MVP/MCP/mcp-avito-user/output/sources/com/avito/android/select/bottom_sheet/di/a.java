package com.avito.android.select.bottom_sheet.di;

import Wp0.InterfaceC15789a;
import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import aq0.C23655d;
import aq0.C23656e;
import aq0.InterfaceC23653b;
import cE.C27025b;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.candy.s;
import com.avito.android.features.auto.ab_tests.configs.AutoGlowFiltersTestGroup;
import com.avito.android.select.Arguments;
import com.avito.android.select.InterfaceC34610a;
import com.avito.android.select.SelectSignificantState;
import com.avito.android.select.bottom_sheet.SelectBottomSheetMviFragment;
import com.avito.android.select.bottom_sheet.blueprints.group.r;
import com.avito.android.select.bottom_sheet.blueprints.p;
import com.avito.android.select.bottom_sheet.di.b;
import com.avito.android.select.bottom_sheet.di.j;
import com.avito.android.select.bottom_sheet.di.k;
import com.avito.android.select.bottom_sheet.di.l;
import com.avito.android.select.bottom_sheet.di.m;
import com.avito.android.select.bottom_sheet.n;
import com.avito.android.select.bottom_sheet_pagination.blueprints.PaginationState;
import com.avito.android.select.mvi.o;
import com.avito.android.select.mvi.q;
import com.avito.android.select.mvi.w;
import com.avito.android.select.u;
import com.avito.android.select.v;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import dq0.InterfaceC39781c;
import kotlin.G0;

/* compiled from: DaggerSelectBottomSheetComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerSelectBottomSheetComponent.java */
    public static final class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public InterfaceC23653b f265187a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC39417a f265188b;

        /* renamed from: c, reason: collision with root package name */
        public Arguments f265189c;

        /* renamed from: d, reason: collision with root package name */
        public Resources f265190d;

        /* renamed from: e, reason: collision with root package name */
        public InterfaceC19588c<? super InterfaceC19587b> f265191e;

        /* renamed from: f, reason: collision with root package name */
        public C28478k f265192f;

        /* renamed from: g, reason: collision with root package name */
        public SelectSignificantState f265193g;

        /* renamed from: h, reason: collision with root package name */
        public Y41.l<? super InterfaceC39781c, G0> f265194h;

        public b() {
        }

        @Override // com.avito.android.select.bottom_sheet.di.b.a
        public final b.a a(InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            this.f265188b = interfaceC39417a;
            return this;
        }

        @Override // com.avito.android.select.bottom_sheet.di.b.a
        public final b.a b(Resources resources) {
            this.f265190d = resources;
            return this;
        }

        @Override // com.avito.android.select.bottom_sheet.di.b.a
        public final com.avito.android.select.bottom_sheet.di.b build() {
            t.a(InterfaceC23653b.class, this.f265187a);
            t.a(cv.b.class, this.f265188b);
            t.a(Arguments.class, this.f265189c);
            t.a(Resources.class, this.f265190d);
            t.a(C28478k.class, this.f265192f);
            return new c(this.f265188b, this.f265187a, null, this.f265189c, this.f265190d, this.f265191e, this.f265192f, this.f265193g, this.f265194h, null);
        }

        @Override // com.avito.android.select.bottom_sheet.di.b.a
        public final b.a c(C28478k c28478k) {
            this.f265192f = c28478k;
            return this;
        }

        @Override // com.avito.android.select.bottom_sheet.di.b.a
        public final b.a d(InterfaceC23653b interfaceC23653b) {
            this.f265187a = interfaceC23653b;
            return this;
        }

        @Override // com.avito.android.select.bottom_sheet.di.b.a
        public final b.a e(InterfaceC19588c interfaceC19588c) {
            this.f265191e = interfaceC19588c;
            return this;
        }

        @Override // com.avito.android.select.bottom_sheet.di.b.a
        public final b.a f(Y41.l lVar) {
            this.f265194h = lVar;
            return this;
        }

        @Override // com.avito.android.select.bottom_sheet.di.b.a
        public final b.a g(SelectSignificantState selectSignificantState) {
            this.f265193g = selectSignificantState;
            return this;
        }

        @Override // com.avito.android.select.bottom_sheet.di.b.a
        public final b.a h(Arguments arguments) {
            arguments.getClass();
            this.f265189c = arguments;
            return this;
        }
    }

    /* compiled from: DaggerSelectBottomSheetComponent.java */
    public static final class c implements com.avito.android.select.bottom_sheet.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<com.avito.android.select.bottom_sheet.blueprints.b> f265195A;

        /* renamed from: B, reason: collision with root package name */
        public final u<InterfaceC34610a> f265196B;

        /* renamed from: C, reason: collision with root package name */
        public final u<com.avito.android.select.bottom_sheet.blueprints.i> f265197C;

        /* renamed from: D, reason: collision with root package name */
        public final u<com.avito.android.select.bottom_sheet.blueprints.e> f265198D;

        /* renamed from: E, reason: collision with root package name */
        public final u<com.avito.android.select.bottom_sheet.blueprints.group.h> f265199E;

        /* renamed from: F, reason: collision with root package name */
        public final u<com.avito.android.select.bottom_sheet.blueprints.group.b> f265200F;

        /* renamed from: G, reason: collision with root package name */
        public final u<Context> f265201G;

        /* renamed from: H, reason: collision with root package name */
        public final com.avito.android.select.bottom_sheet.blueprints.chips.c f265202H;

        /* renamed from: I, reason: collision with root package name */
        public final u<com.avito.android.select.bottom_sheet_pagination.blueprints.error.c> f265203I;

        /* renamed from: J, reason: collision with root package name */
        public final com.avito.android.select.bottom_sheet_pagination.blueprints.error.b f265204J;

        /* renamed from: K, reason: collision with root package name */
        public final u<com.avito.android.select.bottom_sheet_pagination.blueprints.loading.c> f265205K;

        /* renamed from: L, reason: collision with root package name */
        public final com.avito.android.select.bottom_sheet_pagination.blueprints.loading.b f265206L;

        /* renamed from: M, reason: collision with root package name */
        public final u<com.avito.android.select.bottom_sheet.blueprints.candy.e> f265207M;

        /* renamed from: N, reason: collision with root package name */
        public final com.avito.android.candy.k f265208N;

        /* renamed from: O, reason: collision with root package name */
        public final u<InterfaceC35745a5> f265209O;

        /* renamed from: P, reason: collision with root package name */
        public final s f265210P;

        /* renamed from: Q, reason: collision with root package name */
        public final u<com.avito.android.candy.e> f265211Q;

        /* renamed from: R, reason: collision with root package name */
        public final u<com.avito.android.select.bottom_sheet.blueprints.candy.b> f265212R;

        /* renamed from: S, reason: collision with root package name */
        public final com.avito.android.select.bottom_sheet.blueprints.t f265213S;

        /* renamed from: T, reason: collision with root package name */
        public final u<com.avito.android.select.glow_animation.f> f265214T;

        /* renamed from: U, reason: collision with root package name */
        public final com.avito.android.select.glow_animation.c f265215U;

        /* renamed from: V, reason: collision with root package name */
        public final u<com.avito.android.select.collapsable_chips.i> f265216V;

        /* renamed from: W, reason: collision with root package name */
        public final u<com.avito.android.select.collapsable_chips.d> f265217W;

        /* renamed from: X, reason: collision with root package name */
        public final u<com.avito.android.select.bottom_sheet.blueprints.nd_trx.e> f265218X;

        /* renamed from: Y, reason: collision with root package name */
        public final u<com.avito.android.select.bottom_sheet.blueprints.nd_trx.b> f265219Y;

        /* renamed from: Z, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f265220Z;

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC23653b f265221a;

        /* renamed from: a0, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f265222a0;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.l f265223b;

        /* renamed from: b0, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.a> f265224b0;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.select.g> f265225c;

        /* renamed from: c0, reason: collision with root package name */
        public final u<n> f265226c0;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f265227d;

        /* renamed from: d0, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f265228d0;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.select.mvi.l f265229e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.select.mvi.j f265230f;

        /* renamed from: g, reason: collision with root package name */
        public final u<Gson> f265231g;

        /* renamed from: h, reason: collision with root package name */
        public final u<Application> f265232h;

        /* renamed from: i, reason: collision with root package name */
        public final u<AK0.l> f265233i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.select.i> f265234j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.select.variant.b> f265235k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.select.bottom_sheet.blueprints.group.e> f265236l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC15789a> f265237m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.remote.error.f> f265238n;

        /* renamed from: o, reason: collision with root package name */
        public final u<u3.g<AutoGlowFiltersTestGroup>> f265239o;

        /* renamed from: p, reason: collision with root package name */
        public final w f265240p;

        /* renamed from: q, reason: collision with root package name */
        public final u<InterfaceC28481c> f265241q;

        /* renamed from: r, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f265242r;

        /* renamed from: s, reason: collision with root package name */
        public final o f265243s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.jakewharton.rxrelay3.c<PaginationState>> f265244t;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.l f265245u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.select.title.b> f265246v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.android.select.title.f> f265247w;

        /* renamed from: x, reason: collision with root package name */
        public final u<C27025b> f265248x;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.l f265249y;

        /* renamed from: z, reason: collision with root package name */
        public final u<com.avito.android.select.bottom_sheet.blueprints.m> f265250z;

        /* compiled from: DaggerSelectBottomSheetComponent.java */
        /* renamed from: com.avito.android.select.bottom_sheet.di.a$c$a, reason: collision with other inner class name */
        public static final class C7919a implements u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC23653b f265251a;

            public C7919a(InterfaceC23653b interfaceC23653b) {
                this.f265251a = interfaceC23653b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f265251a.k();
                t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerSelectBottomSheetComponent.java */
        public static final class b implements u<u3.g<AutoGlowFiltersTestGroup>> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC23653b f265252a;

            public b(InterfaceC23653b interfaceC23653b) {
                this.f265252a = interfaceC23653b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                u3.g<AutoGlowFiltersTestGroup> gVarQ5 = this.f265252a.Q5();
                t.c(gVarQ5);
                return gVarQ5;
            }
        }

        /* compiled from: DaggerSelectBottomSheetComponent.java */
        /* renamed from: com.avito.android.select.bottom_sheet.di.a$c$c, reason: collision with other inner class name */
        public static final class C7920c implements u<InterfaceC34610a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC23653b f265253a;

            public C7920c(InterfaceC23653b interfaceC23653b) {
                this.f265253a = interfaceC23653b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f265253a.Pe();
            }
        }

        /* compiled from: DaggerSelectBottomSheetComponent.java */
        public static final class d implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC23653b f265254a;

            public d(InterfaceC23653b interfaceC23653b) {
                this.f265254a = interfaceC23653b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f265254a.g();
            }
        }

        /* compiled from: DaggerSelectBottomSheetComponent.java */
        public static final class e implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC23653b f265255a;

            public e(InterfaceC23653b interfaceC23653b) {
                this.f265255a = interfaceC23653b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f265255a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerSelectBottomSheetComponent.java */
        public static final class f implements u<Gson> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC23653b f265256a;

            public f(InterfaceC23653b interfaceC23653b) {
                this.f265256a = interfaceC23653b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Gson gsonS = this.f265256a.s();
                t.c(gsonS);
                return gsonS;
            }
        }

        /* compiled from: DaggerSelectBottomSheetComponent.java */
        public static final class g implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC23653b f265257a;

            public g(InterfaceC23653b interfaceC23653b) {
                this.f265257a = interfaceC23653b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f265257a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerSelectBottomSheetComponent.java */
        public static final class h implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC23653b f265258a;

            public h(InterfaceC23653b interfaceC23653b) {
                this.f265258a = interfaceC23653b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f265258a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerSelectBottomSheetComponent.java */
        public static final class i implements u<C27025b> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC23653b f265259a;

            public i(InterfaceC23653b interfaceC23653b) {
                this.f265259a = interfaceC23653b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f265259a.v0();
            }
        }

        /* compiled from: DaggerSelectBottomSheetComponent.java */
        public static final class j implements u<com.avito.android.remote.error.f> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC23653b f265260a;

            public j(InterfaceC23653b interfaceC23653b) {
                this.f265260a = interfaceC23653b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f265260a.o();
            }
        }

        public c() {
            throw null;
        }

        public c(cv.b bVar, InterfaceC23653b interfaceC23653b, Bundle bundle, Arguments arguments, Resources resources, InterfaceC19588c interfaceC19588c, C28478k c28478k, SelectSignificantState selectSignificantState, Y41.l lVar, C7918a c7918a) {
            this.f265221a = interfaceC23653b;
            this.f265223b = dagger.internal.l.a(arguments);
            this.f265225c = dagger.internal.g.d(new com.avito.android.select.bottom_sheet.di.h(this.f265223b, dagger.internal.l.b(interfaceC19588c)));
            this.f265227d = new e(interfaceC23653b);
            dagger.internal.l lVarB = dagger.internal.l.b(selectSignificantState);
            dagger.internal.l lVar2 = this.f265223b;
            u<com.avito.android.select.g> uVar = this.f265225c;
            u<R0> uVar2 = this.f265227d;
            this.f265229e = new com.avito.android.select.mvi.l(lVar2, lVarB, uVar, uVar2);
            this.f265230f = new com.avito.android.select.mvi.j(uVar, uVar2);
            this.f265231g = new f(interfaceC23653b);
            u<AK0.l> uVarD = dagger.internal.g.d(new C23655d(new C7919a(interfaceC23653b)));
            this.f265233i = uVarD;
            this.f265234j = dagger.internal.g.d(new C23656e(uVarD, this.f265231g));
            this.f265235k = dagger.internal.g.d(com.avito.android.select.variant.d.a());
            this.f265236l = dagger.internal.g.d(j.a.f265283a);
            u<InterfaceC15789a> uVarD2 = dagger.internal.g.d(k.a.f265284a);
            this.f265237m = uVarD2;
            j jVar = new j(interfaceC23653b);
            this.f265239o = new b(interfaceC23653b);
            this.f265240p = new w(this.f265223b, this.f265234j, this.f265235k, this.f265236l, uVarD2, jVar, com.avito.android.select.glow_animation.e.a(), this.f265239o);
            this.f265241q = new h(interfaceC23653b);
            this.f265242r = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f265241q);
            this.f265243s = new o(this.f265229e, this.f265230f, q.a(), this.f265240p, this.f265242r, this.f265223b);
            u<com.jakewharton.rxrelay3.c<PaginationState>> uVarD3 = dagger.internal.g.d(m.a.f265286a);
            this.f265244t = uVarD3;
            this.f265245u = dagger.internal.l.a(new com.avito.android.select.w(new v(this.f265243s, uVarD3)));
            u<com.avito.android.select.title.b> uVarD4 = dagger.internal.g.d(com.avito.android.select.title.d.a());
            this.f265246v = uVarD4;
            this.f265247w = dagger.internal.g.d(new com.avito.android.select.title.h(uVarD4));
            this.f265248x = new i(interfaceC23653b);
            dagger.internal.l lVarB2 = dagger.internal.l.b(lVar);
            this.f265249y = lVarB2;
            u<com.avito.android.select.bottom_sheet.blueprints.m> uVarD5 = dagger.internal.g.d(new p(this.f265223b, lVarB2, this.f265248x));
            this.f265250z = uVarD5;
            this.f265195A = dagger.internal.g.d(new com.avito.android.select.bottom_sheet.blueprints.d(uVarD5));
            C7920c c7920c = new C7920c(interfaceC23653b);
            this.f265196B = c7920c;
            this.f265197C = dagger.internal.g.d(new com.avito.android.select.bottom_sheet.blueprints.k(this.f265250z, c7920c));
            this.f265198D = dagger.internal.g.d(new com.avito.android.select.bottom_sheet.blueprints.g(this.f265250z, this.f265196B));
            u<com.avito.android.select.bottom_sheet.blueprints.group.h> uVarD6 = dagger.internal.g.d(new r(this.f265249y));
            this.f265199E = uVarD6;
            this.f265200F = dagger.internal.g.d(new com.avito.android.select.bottom_sheet.blueprints.group.d(uVarD6));
            d dVar = new d(interfaceC23653b);
            this.f265201G = dVar;
            this.f265202H = new com.avito.android.select.bottom_sheet.blueprints.chips.c(new com.avito.android.select.bottom_sheet.blueprints.chips.f(this.f265249y, dVar));
            u<com.avito.android.select.bottom_sheet_pagination.blueprints.error.c> uVarD7 = dagger.internal.g.d(new com.avito.android.select.bottom_sheet_pagination.blueprints.error.e(this.f265244t));
            this.f265203I = uVarD7;
            this.f265204J = new com.avito.android.select.bottom_sheet_pagination.blueprints.error.b(uVarD7);
            u<com.avito.android.select.bottom_sheet_pagination.blueprints.loading.c> uVarD8 = dagger.internal.g.d(new com.avito.android.select.bottom_sheet_pagination.blueprints.loading.e(this.f265244t));
            this.f265205K = uVarD8;
            this.f265206L = new com.avito.android.select.bottom_sheet_pagination.blueprints.loading.b(uVarD8);
            this.f265207M = dagger.internal.g.d(new com.avito.android.select.bottom_sheet.blueprints.candy.h(this.f265249y));
            u<Context> uVar3 = this.f265201G;
            this.f265208N = new com.avito.android.candy.k(uVar3);
            g gVar = new g(interfaceC23653b);
            this.f265209O = gVar;
            this.f265210P = new s(gVar, new com.avito.android.candy.d(uVar3, gVar));
            u<com.avito.android.candy.e> uVarD9 = dagger.internal.g.d(new com.avito.android.candy.g(com.avito.android.candy.v.a(), this.f265208N, this.f265210P));
            this.f265211Q = uVarD9;
            this.f265212R = dagger.internal.g.d(new com.avito.android.select.bottom_sheet.blueprints.candy.d(uVarD9, this.f265207M, this.f265209O));
            this.f265213S = new com.avito.android.select.bottom_sheet.blueprints.t(this.f265250z);
            u<com.avito.android.select.glow_animation.f> uVarD10 = dagger.internal.g.d(com.avito.android.select.glow_animation.j.a());
            this.f265214T = uVarD10;
            this.f265215U = new com.avito.android.select.glow_animation.c(uVarD10);
            u<com.avito.android.select.collapsable_chips.i> uVarD11 = dagger.internal.g.d(new com.avito.android.select.collapsable_chips.l(this.f265249y));
            this.f265216V = uVarD11;
            this.f265217W = dagger.internal.g.d(new com.avito.android.select.collapsable_chips.f(uVarD11));
            u<com.avito.android.select.bottom_sheet.blueprints.nd_trx.e> uVarD12 = dagger.internal.g.d(com.avito.android.select.bottom_sheet.blueprints.nd_trx.h.a());
            this.f265218X = uVarD12;
            u<com.avito.android.select.bottom_sheet.blueprints.nd_trx.b> uVarD13 = dagger.internal.g.d(new com.avito.android.select.bottom_sheet.blueprints.nd_trx.d(uVarD12));
            this.f265219Y = uVarD13;
            u<com.avito.konveyor.a> uVarD14 = dagger.internal.g.d(new com.avito.android.select.bottom_sheet.di.e(this.f265247w, this.f265195A, this.f265197C, this.f265198D, this.f265200F, this.f265202H, this.f265204J, this.f265206L, this.f265212R, this.f265213S, this.f265215U, this.f265217W, uVarD13, new com.avito.android.select.bottom_sheet.blueprints.icon_button_right.d(new com.avito.android.select.bottom_sheet.blueprints.icon_button_right.h(this.f265249y))));
            this.f265220Z = uVarD14;
            this.f265222a0 = dagger.internal.g.d(new com.avito.android.select.bottom_sheet.di.d(uVarD14));
            u<com.avito.android.recycler.data_aware.a> uVarD15 = dagger.internal.g.d(l.a.f265285a);
            this.f265224b0 = uVarD15;
            u<n> uVarD16 = dagger.internal.g.d(new com.avito.android.select.bottom_sheet.di.i(uVarD15));
            this.f265226c0 = uVarD16;
            this.f265228d0 = dagger.internal.g.d(new com.avito.android.select.bottom_sheet.di.g(uVarD16, this.f265222a0, this.f265220Z));
        }

        @Override // com.avito.android.select.bottom_sheet.di.b
        public final void a(SelectBottomSheetMviFragment selectBottomSheetMviFragment) {
            selectBottomSheetMviFragment.f265005h0 = (u.f) this.f265245u.f393949a;
            selectBottomSheetMviFragment.f265007j0 = this.f265242r.get();
            selectBottomSheetMviFragment.f265008k0 = this.f265228d0.get();
            selectBottomSheetMviFragment.f265009l0 = this.f265221a.G();
        }
    }

    public static b.a a() {
        return new b();
    }
}
