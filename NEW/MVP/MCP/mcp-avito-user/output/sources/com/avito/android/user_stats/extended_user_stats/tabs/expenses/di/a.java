package com.avito.android.user_stats.extended_user_stats.tabs.expenses.di;

import android.content.res.Resources;
import androidx.recyclerview.widget.C;
import cW0.InterfaceC27112a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.ExpensesTabFragment;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.b;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.h;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.n;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.Set;

/* compiled from: DaggerExpensesTabComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerExpensesTabComponent.java */
    public static final class b implements com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.item_loader.c> f317546A;

        /* renamed from: B, reason: collision with root package name */
        public final com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.item_loader.b f317547B;

        /* renamed from: C, reason: collision with root package name */
        public final u<com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.empty_items.c> f317548C;

        /* renamed from: D, reason: collision with root package name */
        public final com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.empty_items.b f317549D;

        /* renamed from: E, reason: collision with root package name */
        public final u<com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.skeleton_chart.c> f317550E;

        /* renamed from: F, reason: collision with root package name */
        public final com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.skeleton_chart.b f317551F;

        /* renamed from: G, reason: collision with root package name */
        public final u<com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.skeleton_items.c> f317552G;

        /* renamed from: H, reason: collision with root package name */
        public final com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.skeleton_items.b f317553H;

        /* renamed from: I, reason: collision with root package name */
        public final u<com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.space.c> f317554I;

        /* renamed from: J, reason: collision with root package name */
        public final com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.space.b f317555J;

        /* renamed from: K, reason: collision with root package name */
        public final u<com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.sort_split.c> f317556K;

        /* renamed from: L, reason: collision with root package name */
        public final com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.sort_split.b f317557L;

        /* renamed from: M, reason: collision with root package name */
        public final u<com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.value_item.c> f317558M;

        /* renamed from: N, reason: collision with root package name */
        public final com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.value_item.b f317559N;

        /* renamed from: O, reason: collision with root package name */
        public final u<com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.vas_item.c> f317560O;

        /* renamed from: P, reason: collision with root package name */
        public final com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.vas_item.b f317561P;

        /* renamed from: Q, reason: collision with root package name */
        public final u<com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.vas_item_detail.c> f317562Q;

        /* renamed from: R, reason: collision with root package name */
        public final com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.vas_item_detail.b f317563R;

        /* renamed from: S, reason: collision with root package name */
        public final u<com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.region.c> f317564S;

        /* renamed from: T, reason: collision with root package name */
        public final com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.region.b f317565T;

        /* renamed from: U, reason: collision with root package name */
        public final u<com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.hint.c> f317566U;

        /* renamed from: V, reason: collision with root package name */
        public final com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.hint.b f317567V;

        /* renamed from: W, reason: collision with root package name */
        public final u<com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.horizontal_chart.c> f317568W;

        /* renamed from: X, reason: collision with root package name */
        public final com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.horizontal_chart.b f317569X;

        /* renamed from: Y, reason: collision with root package name */
        public final u<com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.expense.c> f317570Y;

        /* renamed from: Z, reason: collision with root package name */
        public final com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.expense.b f317571Z;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.c f317572a;

        /* renamed from: a0, reason: collision with root package name */
        public final u<com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.chart.e> f317573a0;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f317574b;

        /* renamed from: b0, reason: collision with root package name */
        public final com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.chart.b f317575b0;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC27112a> f317576c;

        /* renamed from: c0, reason: collision with root package name */
        public final u<com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.common_indicator.d> f317577c0;

        /* renamed from: d, reason: collision with root package name */
        public final u<VJ0.a> f317578d;

        /* renamed from: d0, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f317579d0;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC35745a5> f317580e;

        /* renamed from: e0, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.h> f317581e0;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.user_stats.b> f317582f;

        /* renamed from: f0, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.e> f317583f0;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28373a> f317584g;

        /* renamed from: g0, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f317585g0;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.d f317586h;

        /* renamed from: h0, reason: collision with root package name */
        public final u<Set<TV0.d<?, ?>>> f317587h0;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC35863o4> f317588i;

        /* renamed from: j, reason: collision with root package name */
        public final u<QJ0.f> f317589j;

        /* renamed from: k, reason: collision with root package name */
        public final n f317590k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC28481c> f317591l;

        /* renamed from: m, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f317592m;

        /* renamed from: n, reason: collision with root package name */
        public final l f317593n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.f f317594o;

        /* renamed from: p, reason: collision with root package name */
        public final u<C> f317595p;

        /* renamed from: q, reason: collision with root package name */
        public final l f317596q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.total.c> f317597r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f317598s;

        /* renamed from: t, reason: collision with root package name */
        public final com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.total.b f317599t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.date_select.d> f317600u;

        /* renamed from: v, reason: collision with root package name */
        public final com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.date_select.b f317601v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.total_bottom.c> f317602w;

        /* renamed from: x, reason: collision with root package name */
        public final com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.total_bottom.b f317603x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.dynamic_item.c> f317604y;

        /* renamed from: z, reason: collision with root package name */
        public final com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.dynamic_item.b f317605z;

        /* compiled from: DaggerExpensesTabComponent.java */
        /* renamed from: com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.a$b$a, reason: collision with other inner class name */
        public static final class C9855a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.c f317606a;

            public C9855a(com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.c cVar) {
                this.f317606a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f317606a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerExpensesTabComponent.java */
        /* renamed from: com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.a$b$b, reason: collision with other inner class name */
        public static final class C9856b implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.c f317607a;

            public C9856b(com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.c cVar) {
                this.f317607a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f317607a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerExpensesTabComponent.java */
        public static final class c implements u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.c f317608a;

            public c(com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.c cVar) {
                this.f317608a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35863o4 interfaceC35863o4M = this.f317608a.m();
                t.c(interfaceC35863o4M);
                return interfaceC35863o4M;
            }
        }

        /* compiled from: DaggerExpensesTabComponent.java */
        public static final class d implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.c f317609a;

            public d(com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.c cVar) {
                this.f317609a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f317609a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerExpensesTabComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.c f317610a;

            public e(com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.c cVar) {
                this.f317610a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f317610a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerExpensesTabComponent.java */
        public static final class f implements u<InterfaceC27112a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.c f317611a;

            public f(com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.c cVar) {
                this.f317611a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC27112a interfaceC27112aX2 = this.f317611a.x2();
                t.c(interfaceC27112aX2);
                return interfaceC27112aX2;
            }
        }

        /* compiled from: DaggerExpensesTabComponent.java */
        public static final class g implements u<VJ0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.c f317612a;

            public g(com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.c cVar) {
                this.f317612a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                VJ0.a aVarT2 = this.f317612a.t2();
                t.c(aVarT2);
                return aVarT2;
            }
        }

        public b() {
            throw null;
        }

        public b(com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.c cVar, cv.b bVar, Resources resources, C28478k c28478k, Y41.l lVar, C9854a c9854a) {
            this.f317572a = cVar;
            this.f317574b = bVar;
            u<com.avito.android.user_stats.b> uVarD = dagger.internal.g.d(new com.avito.android.user_stats.e(new f(cVar), new g(cVar), new d(cVar)));
            this.f317582f = uVarD;
            this.f317586h = new com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.d(uVarD, new C9855a(cVar));
            this.f317588i = new c(cVar);
            u<QJ0.f> uVarD2 = dagger.internal.g.d(new QJ0.h(l.a(resources)));
            this.f317589j = uVarD2;
            this.f317590k = new n(uVarD2, this.f317588i);
            this.f317591l = new e(cVar);
            this.f317592m = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f317591l);
            this.f317593n = l.a(new com.avito.android.user_stats.extended_user_stats.tabs.expenses.j(new com.avito.android.user_stats.extended_user_stats.tabs.expenses.i(new com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.i(com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.f.a(), this.f317586h, com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.k.a(), this.f317590k, this.f317592m))));
            dagger.internal.f fVar = new dagger.internal.f();
            this.f317594o = fVar;
            this.f317595p = dagger.internal.g.d(new j(fVar));
            l lVarA = l.a(lVar);
            this.f317596q = lVarA;
            u<com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.total.c> uVarD3 = dagger.internal.g.d(new com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.total.e(lVarA));
            this.f317597r = uVarD3;
            C9856b c9856b = new C9856b(cVar);
            this.f317598s = c9856b;
            this.f317599t = new com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.total.b(uVarD3, c9856b);
            u<com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.date_select.d> uVarD4 = dagger.internal.g.d(new com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.date_select.f(this.f317596q));
            this.f317600u = uVarD4;
            this.f317601v = new com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.date_select.b(uVarD4);
            u<com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.total_bottom.c> uVarD5 = dagger.internal.g.d(com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.total_bottom.e.a());
            this.f317602w = uVarD5;
            this.f317603x = new com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.total_bottom.b(uVarD5);
            u<com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.dynamic_item.c> uVarD6 = dagger.internal.g.d(new com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.dynamic_item.e(this.f317596q));
            this.f317604y = uVarD6;
            this.f317605z = new com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.dynamic_item.b(uVarD6);
            u<com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.item_loader.c> uVarD7 = dagger.internal.g.d(com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.item_loader.e.a());
            this.f317546A = uVarD7;
            this.f317547B = new com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.item_loader.b(uVarD7);
            u<com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.empty_items.c> uVarD8 = dagger.internal.g.d(new com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.empty_items.e(this.f317596q));
            this.f317548C = uVarD8;
            this.f317549D = new com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.empty_items.b(uVarD8);
            u<com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.skeleton_chart.c> uVarD9 = dagger.internal.g.d(com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.skeleton_chart.e.a());
            this.f317550E = uVarD9;
            this.f317551F = new com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.skeleton_chart.b(uVarD9);
            u<com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.skeleton_items.c> uVarD10 = dagger.internal.g.d(com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.skeleton_items.e.a());
            this.f317552G = uVarD10;
            this.f317553H = new com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.skeleton_items.b(uVarD10);
            u<com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.space.c> uVarD11 = dagger.internal.g.d(new com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.space.e(this.f317596q));
            this.f317554I = uVarD11;
            this.f317555J = new com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.space.b(uVarD11);
            u<com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.sort_split.c> uVarD12 = dagger.internal.g.d(new com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.sort_split.e(this.f317596q));
            this.f317556K = uVarD12;
            this.f317557L = new com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.sort_split.b(uVarD12);
            u<com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.value_item.c> uVarD13 = dagger.internal.g.d(new com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.value_item.e(this.f317596q));
            this.f317558M = uVarD13;
            this.f317559N = new com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.value_item.b(uVarD13, this.f317598s);
            u<com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.vas_item.c> uVarD14 = dagger.internal.g.d(new com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.vas_item.e(this.f317596q));
            this.f317560O = uVarD14;
            this.f317561P = new com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.vas_item.b(uVarD14, this.f317598s);
            u<com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.vas_item_detail.c> uVarD15 = dagger.internal.g.d(new com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.vas_item_detail.e(this.f317596q));
            this.f317562Q = uVarD15;
            this.f317563R = new com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.vas_item_detail.b(uVarD15, this.f317598s);
            u<com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.region.c> uVarD16 = dagger.internal.g.d(new com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.region.e(this.f317596q));
            this.f317564S = uVarD16;
            this.f317565T = new com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.region.b(uVarD16);
            u<com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.hint.c> uVarD17 = dagger.internal.g.d(com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.hint.e.a());
            this.f317566U = uVarD17;
            this.f317567V = new com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.hint.b(uVarD17);
            u<com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.horizontal_chart.c> uVarD18 = dagger.internal.g.d(com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.horizontal_chart.e.a());
            this.f317568W = uVarD18;
            this.f317569X = new com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.horizontal_chart.b(uVarD18);
            u<com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.expense.c> uVarD19 = dagger.internal.g.d(new com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.expense.e(this.f317596q));
            this.f317570Y = uVarD19;
            this.f317571Z = new com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.expense.b(uVarD19);
            u<com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.chart.e> uVarD20 = dagger.internal.g.d(new com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.chart.g(this.f317596q));
            this.f317573a0 = uVarD20;
            this.f317575b0 = new com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.chart.b(uVarD20);
            u<com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.common_indicator.d> uVarD21 = dagger.internal.g.d(com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.common_indicator.f.a());
            this.f317577c0 = uVarD21;
            u<com.avito.konveyor.a> uVarD22 = dagger.internal.g.d(new h(this.f317599t, this.f317601v, this.f317603x, this.f317605z, this.f317547B, this.f317549D, this.f317551F, this.f317553H, this.f317555J, this.f317557L, this.f317559N, this.f317561P, this.f317563R, this.f317565T, this.f317567V, this.f317569X, this.f317571Z, this.f317575b0, new com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.common_indicator.b(uVarD21, this.f317598s)));
            this.f317579d0 = uVarD22;
            this.f317581e0 = dagger.internal.g.d(new com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.e(uVarD22));
            u<com.avito.android.recycler.data_aware.e> uVarD23 = dagger.internal.g.d(new com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.g(com.avito.android.user_stats.extended_user_stats.tabs.expenses.l.a(), com.avito.android.user_stats.extended_user_stats.tabs.expenses.n.a()));
            this.f317583f0 = uVarD23;
            u<com.avito.konveyor.adapter.a> uVarD24 = dagger.internal.g.d(new com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.f(uVarD23, this.f317595p, this.f317581e0));
            this.f317585g0 = uVarD24;
            dagger.internal.f.a(this.f317594o, dagger.internal.g.d(new k(uVarD24, this.f317579d0)));
            this.f317587h0 = dagger.internal.g.d(new i(this.f317597r, this.f317600u, this.f317602w, this.f317604y, this.f317546A, this.f317548C, this.f317550E, this.f317552G, this.f317554I, this.f317556K, this.f317558M, this.f317560O, this.f317562Q, this.f317564S, this.f317566U, this.f317568W, this.f317570Y, this.f317573a0, this.f317577c0));
        }

        @Override // com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.b
        public final void a(ExpensesTabFragment expensesTabFragment) {
            expensesTabFragment.f317521n0 = (h.a) this.f317593n.f393949a;
            expensesTabFragment.f317523p0 = this.f317592m.get();
            expensesTabFragment.f317524q0 = (com.avito.konveyor.adapter.j) this.f317594o.get();
            expensesTabFragment.f317525r0 = this.f317587h0.get();
            expensesTabFragment.f317526s0 = this.f317585g0.get();
            com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.c cVar = this.f317572a;
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            expensesTabFragment.f317527t0 = interfaceC28373aA;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f317574b.u4();
            t.c(aVarU4);
            expensesTabFragment.f317528u0 = aVarU4;
            com.avito.android.util.text.a aVarE = cVar.e();
            t.c(aVarE);
            expensesTabFragment.f317529v0 = aVarE;
            SK0.b bVarP = cVar.p();
            t.c(bVarP);
            expensesTabFragment.f317530w0 = bVarP;
        }
    }

    /* compiled from: DaggerExpensesTabComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.b.a
        public final com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.b a(Resources resources, C28478k c28478k, com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.c cVar, Y41.l lVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new b(cVar, interfaceC39417a, resources, c28478k, lVar, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
