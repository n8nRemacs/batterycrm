package com.avito.android.sbc.di;

import Xo0.InterfaceC17032a;
import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.avito.android.C30566f2;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.sbc.create.mvi.C34472b0;
import com.avito.android.sbc.create.mvi.C34478e0;
import com.avito.android.sbc.create.mvi.CreateDiscountDispatchFragment;
import com.avito.android.sbc.create.mvi.G0;
import com.avito.android.sbc.create.mvi.I0;
import com.avito.android.sbc.create.mvi.V0;
import com.avito.android.sbc.create.mvi.Z;
import com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchArg;
import com.avito.android.sbc.di.c;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import java.util.Locale;

/* compiled from: DaggerCreateDiscountDispatchFragmentComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class h {

    /* compiled from: DaggerCreateDiscountDispatchFragmentComponent.java */
    public static final class b implements com.avito.android.sbc.di.c {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.sbc.di.d f259977a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f259978b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<Locale> f259979c;

        /* renamed from: d, reason: collision with root package name */
        public final w f259980d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.util.text.a> f259981e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<Context> f259982f;

        /* renamed from: g, reason: collision with root package name */
        public final I0 f259983g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC17032a> f259984h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.sbc.create.c> f259985i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.l f259986j;

        /* renamed from: k, reason: collision with root package name */
        public final v f259987k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<C30566f2> f259988l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f259989m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<R0> f259990n;

        /* renamed from: o, reason: collision with root package name */
        public final Oo0.m f259991o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<E> f259992p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.deep_linking.x> f259993q;

        /* renamed from: r, reason: collision with root package name */
        public final com.avito.android.sbc.create.mvi.util.h f259994r;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.u<AK0.l> f259995s;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f259996t;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f259997u;

        /* renamed from: v, reason: collision with root package name */
        public final V0 f259998v;

        /* compiled from: DaggerCreateDiscountDispatchFragmentComponent.java */
        public static final class a implements dagger.internal.u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sbc.di.d f259999a;

            public a(com.avito.android.sbc.di.d dVar) {
                this.f259999a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f259999a.i();
                dagger.internal.t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerCreateDiscountDispatchFragmentComponent.java */
        /* renamed from: com.avito.android.sbc.di.h$b$b, reason: collision with other inner class name */
        public static final class C7795b implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sbc.di.d f260000a;

            public C7795b(com.avito.android.sbc.di.d dVar) {
                this.f260000a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f260000a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerCreateDiscountDispatchFragmentComponent.java */
        public static final class c implements dagger.internal.u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sbc.di.d f260001a;

            public c(com.avito.android.sbc.di.d dVar) {
                this.f260001a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f260001a.e();
                dagger.internal.t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerCreateDiscountDispatchFragmentComponent.java */
        public static final class d implements dagger.internal.u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sbc.di.d f260002a;

            public d(com.avito.android.sbc.di.d dVar) {
                this.f260002a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f260002a.g();
            }
        }

        /* compiled from: DaggerCreateDiscountDispatchFragmentComponent.java */
        public static final class e implements dagger.internal.u<com.avito.android.deep_linking.x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sbc.di.d f260003a;

            public e(com.avito.android.sbc.di.d dVar) {
                this.f260003a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deep_linking.x xVarQ = this.f260003a.q();
                dagger.internal.t.c(xVarQ);
                return xVarQ;
            }
        }

        /* compiled from: DaggerCreateDiscountDispatchFragmentComponent.java */
        public static final class f implements dagger.internal.u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sbc.di.d f260004a;

            public f(com.avito.android.sbc.di.d dVar) {
                this.f260004a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f260004a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerCreateDiscountDispatchFragmentComponent.java */
        public static final class g implements dagger.internal.u<Locale> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sbc.di.d f260005a;

            public g(com.avito.android.sbc.di.d dVar) {
                this.f260005a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f260005a.locale();
            }
        }

        /* compiled from: DaggerCreateDiscountDispatchFragmentComponent.java */
        /* renamed from: com.avito.android.sbc.di.h$b$h, reason: collision with other inner class name */
        public static final class C7796h implements dagger.internal.u<AK0.l> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sbc.di.d f260006a;

            public C7796h(com.avito.android.sbc.di.d dVar) {
                this.f260006a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f260006a.r();
            }
        }

        /* compiled from: DaggerCreateDiscountDispatchFragmentComponent.java */
        public static final class i implements dagger.internal.u<InterfaceC17032a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sbc.di.d f260007a;

            public i(com.avito.android.sbc.di.d dVar) {
                this.f260007a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC17032a interfaceC17032aN2 = this.f260007a.N2();
                dagger.internal.t.c(interfaceC17032aN2);
                return interfaceC17032aN2;
            }
        }

        /* compiled from: DaggerCreateDiscountDispatchFragmentComponent.java */
        public static final class j implements dagger.internal.u<C30566f2> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sbc.di.d f260008a;

            public j(com.avito.android.sbc.di.d dVar) {
                this.f260008a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f260008a.z2();
            }
        }

        /* compiled from: DaggerCreateDiscountDispatchFragmentComponent.java */
        public static final class k implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sbc.di.d f260009a;

            public k(com.avito.android.sbc.di.d dVar) {
                this.f260009a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f260009a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(com.avito.android.sbc.di.d dVar, cv.b bVar, Fragment fragment, CreateDiscountDispatchArg createDiscountDispatchArg, Resources resources, C28478k c28478k, a aVar) {
            this.f259977a = dVar;
            this.f259978b = bVar;
            dagger.internal.l lVarA = dagger.internal.l.a(resources);
            g gVar = new g(dVar);
            this.f259979c = gVar;
            w wVar = new w(new x(gVar));
            this.f259980d = wVar;
            this.f259983g = new I0(lVarA, wVar, new c(dVar), new d(dVar));
            this.f259985i = dagger.internal.g.d(new com.avito.android.sbc.create.g(new i(dVar)));
            dagger.internal.l lVarA2 = dagger.internal.l.a(createDiscountDispatchArg);
            this.f259986j = lVarA2;
            this.f259987k = new v(this.f259979c);
            this.f259988l = new j(dVar);
            C7795b c7795b = new C7795b(dVar);
            this.f259989m = c7795b;
            this.f259990n = new f(dVar);
            this.f259991o = new Oo0.m(lVarA2, c7795b);
            this.f259992p = new a(dVar);
            this.f259993q = new e(dVar);
            this.f259994r = new com.avito.android.sbc.create.mvi.util.h(this.f259983g);
            this.f259995s = new C7796h(dVar);
            this.f259996t = new k(dVar);
            dagger.internal.u<ScreenPerformanceTracker> uVarD = dagger.internal.g.d(new com.avito.android.sbc.di.f(dagger.internal.l.a(c28478k), this.f259996t));
            this.f259997u = uVarD;
            this.f259998v = new V0(new C34478e0(new Z(this.f259983g, this.f259980d, this.f259985i, this.f259986j, this.f259987k, this.f259988l, this.f259989m, this.f259990n, this.f259991o, this.f259992p, this.f259993q, this.f259994r, this.f259995s, uVarD), C34472b0.a(), G0.a()));
        }

        @Override // com.avito.android.sbc.di.c
        public final void a(CreateDiscountDispatchFragment createDiscountDispatchFragment) {
            createDiscountDispatchFragment.f259250n0 = this.f259998v;
            com.avito.android.sbc.di.d dVar = this.f259977a;
            InterfaceC28373a interfaceC28373aA = dVar.a();
            dagger.internal.t.c(interfaceC28373aA);
            createDiscountDispatchFragment.f259252p0 = interfaceC28373aA;
            InterfaceC35745a5 interfaceC35745a5D = dVar.d();
            dagger.internal.t.c(interfaceC35745a5D);
            createDiscountDispatchFragment.f259253q0 = interfaceC35745a5D;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f259978b.u4();
            dagger.internal.t.c(aVarU4);
            createDiscountDispatchFragment.f259254r0 = aVarU4;
            createDiscountDispatchFragment.f259255s0 = dVar.h();
            Locale locale = dVar.locale();
            u uVar = u.f260028a;
            uVar.getClass();
            createDiscountDispatchFragment.f259256t0 = new com.avito.android.sbc.utils.b(new com.avito.android.sbc.utils.h(locale));
            createDiscountDispatchFragment.f259257u0 = dVar.b3();
            Locale locale2 = dVar.locale();
            uVar.getClass();
            new com.avito.android.sbc.utils.h(locale2);
            dagger.internal.t.c(dVar.e());
            dVar.g();
            dVar.C();
            com.avito.android.util.text.a aVarE = dVar.e();
            dagger.internal.t.c(aVarE);
            createDiscountDispatchFragment.f259258v0 = aVarE;
            createDiscountDispatchFragment.f259259w0 = new com.avito.android.sbc.create.mvi.util.k();
            createDiscountDispatchFragment.f259260x0 = this.f259997u.get();
        }
    }

    /* compiled from: DaggerCreateDiscountDispatchFragmentComponent.java */
    public static final class c implements c.a {
        public c() {
        }

        @Override // com.avito.android.sbc.di.c.a
        public final com.avito.android.sbc.di.c a(d dVar, CreateDiscountDispatchFragment createDiscountDispatchFragment, CreateDiscountDispatchArg createDiscountDispatchArg, Resources resources, C28478k c28478k, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new b(dVar, interfaceC39417a, createDiscountDispatchFragment, createDiscountDispatchArg, resources, c28478k, null);
        }
    }

    public static c.a a() {
        return new c();
    }
}
