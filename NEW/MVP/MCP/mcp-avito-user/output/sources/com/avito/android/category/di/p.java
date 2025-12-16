package com.avito.android.category.di;

import Nn.InterfaceC14592a;
import Pn.InterfaceC14813a;
import android.content.res.Resources;
import com.avito.android.I1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.category.CategoryArguments;
import com.avito.android.category.CategoryFragment;
import com.avito.android.category.di.c;
import com.avito.android.category.di.g;
import com.avito.android.category.di.h;
import com.avito.android.category.q;
import com.avito.android.category.s;
import com.avito.android.geo_common.interactor.B;
import com.avito.android.location.A;
import com.avito.android.location.H;
import com.avito.android.location.r;
import com.avito.android.remote.V0;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.util.C;
import com.avito.android.util.L0;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import kotlin.G0;
import nW.InterfaceC44343a;

/* compiled from: DaggerCategoryComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class p {

    /* compiled from: DaggerCategoryComponent.java */
    public static final class b implements c.a {

        /* renamed from: a, reason: collision with root package name */
        public Resources f116556a;

        /* renamed from: b, reason: collision with root package name */
        public CategoryArguments f116557b;

        /* renamed from: c, reason: collision with root package name */
        public C28478k f116558c;

        /* renamed from: d, reason: collision with root package name */
        public Y41.l<? super InterfaceC14813a, G0> f116559d;

        /* renamed from: e, reason: collision with root package name */
        public InterfaceC39417a f116560e;

        /* renamed from: f, reason: collision with root package name */
        public d f116561f;

        public b() {
        }

        @Override // com.avito.android.category.di.c.a
        public final c.a b(Resources resources) {
            this.f116556a = resources;
            return this;
        }

        @Override // com.avito.android.category.di.c.a
        public final com.avito.android.category.di.c build() {
            t.a(Resources.class, this.f116556a);
            t.a(CategoryArguments.class, this.f116557b);
            t.a(C28478k.class, this.f116558c);
            t.a(Y41.l.class, this.f116559d);
            t.a(cv.b.class, this.f116560e);
            t.a(d.class, this.f116561f);
            return new c(this.f116561f, this.f116560e, this.f116556a, this.f116557b, this.f116558c, this.f116559d, null);
        }

        @Override // com.avito.android.category.di.c.a
        public final c.a c(Y41.l lVar) {
            this.f116559d = lVar;
            return this;
        }

        @Override // com.avito.android.category.di.c.a
        public final c.a d(InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            this.f116560e = interfaceC39417a;
            return this;
        }

        @Override // com.avito.android.category.di.c.a
        public final c.a e(CategoryArguments categoryArguments) {
            this.f116557b = categoryArguments;
            return this;
        }

        @Override // com.avito.android.category.di.c.a
        public final c.a f(C28478k c28478k) {
            this.f116558c = c28478k;
            return this;
        }

        @Override // com.avito.android.category.di.c.a
        public final c.a g(d dVar) {
            this.f116561f = dVar;
            return this;
        }
    }

    /* compiled from: DaggerCategoryComponent.java */
    public static final class c implements com.avito.android.category.di.c {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.category.di.d f116562a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f116563b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28373a> f116564c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.analytics.provider.e> f116565d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.l f116566e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC14592a> f116567f;

        /* renamed from: g, reason: collision with root package name */
        public final u<H> f116568g;

        /* renamed from: h, reason: collision with root package name */
        public final u<B> f116569h;

        /* renamed from: i, reason: collision with root package name */
        public final u<I1> f116570i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC44343a> f116571j;

        /* renamed from: k, reason: collision with root package name */
        public final u<r> f116572k;

        /* renamed from: l, reason: collision with root package name */
        public final u<V0> f116573l;

        /* renamed from: m, reason: collision with root package name */
        public final u<SearchParamsConverter> f116574m;

        /* renamed from: n, reason: collision with root package name */
        public final u<R0> f116575n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.category.d> f116576o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.category.mvi.i f116577p;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.category.mvi.g f116578q;

        /* renamed from: r, reason: collision with root package name */
        public final u<InterfaceC28481c> f116579r;

        /* renamed from: s, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f116580s;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.l f116581t;

        /* compiled from: DaggerCategoryComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.category.di.d f116582a;

            public a(com.avito.android.category.di.d dVar) {
                this.f116582a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f116582a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerCategoryComponent.java */
        public static final class b implements u<InterfaceC44343a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.category.di.d f116583a;

            public b(com.avito.android.category.di.d dVar) {
                this.f116583a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC44343a interfaceC44343aD6 = this.f116583a.d6();
                t.c(interfaceC44343aD6);
                return interfaceC44343aD6;
            }
        }

        /* compiled from: DaggerCategoryComponent.java */
        /* renamed from: com.avito.android.category.di.p$c$c, reason: collision with other inner class name */
        public static final class C3399c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.category.di.d f116584a;

            public C3399c(com.avito.android.category.di.d dVar) {
                this.f116584a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f116584a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerCategoryComponent.java */
        public static final class d implements u<I1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.category.di.d f116585a;

            public d(com.avito.android.category.di.d dVar) {
                this.f116585a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f116585a.H();
            }
        }

        /* compiled from: DaggerCategoryComponent.java */
        public static final class e implements u<H> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.category.di.d f116586a;

            public e(com.avito.android.category.di.d dVar) {
                this.f116586a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f116586a.i3();
            }
        }

        /* compiled from: DaggerCategoryComponent.java */
        public static final class f implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.category.di.d f116587a;

            public f(com.avito.android.category.di.d dVar) {
                this.f116587a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f116587a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerCategoryComponent.java */
        public static final class g implements u<V0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.category.di.d f116588a;

            public g(com.avito.android.category.di.d dVar) {
                this.f116588a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                V0 v0Z = this.f116588a.Z();
                t.c(v0Z);
                return v0Z;
            }
        }

        /* compiled from: DaggerCategoryComponent.java */
        public static final class h implements u<B> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.category.di.d f116589a;

            public h(com.avito.android.category.di.d dVar) {
                this.f116589a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                B bQ3 = this.f116589a.q3();
                t.c(bQ3);
                return bQ3;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.category.di.d dVar, cv.b bVar, Resources resources, CategoryArguments categoryArguments, C28478k c28478k, Y41.l lVar, a aVar) {
            this.f116562a = dVar;
            this.f116563b = bVar;
            this.f116564c = new a(dVar);
            this.f116565d = dagger.internal.g.d(h.a.f116547a);
            dagger.internal.l lVarA = dagger.internal.l.a(categoryArguments);
            this.f116566e = lVarA;
            this.f116567f = dagger.internal.g.d(new com.avito.android.category.di.f(lVarA, this.f116564c, this.f116565d));
            this.f116572k = dagger.internal.B.a(A.a(new e(dVar), new d(dVar), new h(dVar), new b(dVar)));
            this.f116573l = new g(dVar);
            u<SearchParamsConverter> uVarD = dagger.internal.g.d(g.a.f116546a);
            this.f116574m = uVarD;
            u<com.avito.android.category.d> uVarD2 = dagger.internal.g.d(new com.avito.android.category.h(uVarD, this.f116572k, this.f116573l, new C3399c(dVar)));
            this.f116576o = uVarD2;
            u<InterfaceC14592a> uVar = this.f116567f;
            this.f116577p = new com.avito.android.category.mvi.i(this.f116566e, uVarD2, uVar);
            this.f116578q = new com.avito.android.category.mvi.g(uVarD2, uVar);
            this.f116579r = new f(dVar);
            this.f116580s = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f116579r);
            this.f116581t = dagger.internal.l.a(new s(new com.avito.android.category.r(new com.avito.android.category.mvi.m(this.f116577p, this.f116578q, com.avito.android.category.mvi.p.a(), com.avito.android.category.mvi.s.a(), this.f116580s, this.f116566e))));
        }

        @Override // com.avito.android.category.di.c
        public final void a(CategoryFragment categoryFragment) {
            categoryFragment.f116456n0 = (q.a) this.f116581t.f393949a;
            categoryFragment.f116458p0 = this.f116580s.get();
            categoryFragment.f116459q0 = this.f116567f.get();
            com.avito.android.category.di.d dVar = this.f116562a;
            L0 l0Z = dVar.z();
            t.c(l0Z);
            categoryFragment.f116460r0 = l0Z;
            C cJ2 = dVar.j();
            t.c(cJ2);
            categoryFragment.f116461s0 = cJ2;
            InterfaceC28373a interfaceC28373aA = dVar.a();
            t.c(interfaceC28373aA);
            categoryFragment.f116462t0 = interfaceC28373aA;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f116563b.u4();
            t.c(aVarU4);
            categoryFragment.f116463u0 = aVarU4;
        }
    }

    public static c.a a() {
        return new b();
    }
}
