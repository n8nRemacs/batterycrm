package com.avito.android.safedeal.delivery.order_cancellation.details.di;

import Cn0.C13330a;
import Cn0.C13331b;
import Cn0.C13332c;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import bk0.InterfaceC25671a;
import com.avito.android.Z0;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.B;
import com.avito.android.remote.model.ReasonRds;
import com.avito.android.safedeal.delivery.di.module.m;
import com.avito.android.safedeal.delivery.order_cancellation.details.ReasonDetailsFragment;
import com.avito.android.safedeal.delivery.order_cancellation.details.di.b;
import com.avito.android.safedeal.delivery.order_cancellation.details.mvi.i;
import com.avito.android.safedeal.delivery.order_cancellation.details.mvi.k;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerReasonDetailsComponent.java */
@e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerReasonDetailsComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.safedeal.delivery.order_cancellation.details.di.b.a
        public final com.avito.android.safedeal.delivery.order_cancellation.details.di.b a(ReasonDetailsFragment reasonDetailsFragment, r rVar, ReasonRds reasonRds, String str, com.avito.android.safedeal.delivery.order_cancellation.details.b bVar, com.avito.android.safedeal.delivery.di.component.b bVar2, Integer num, Resources resources) {
            reasonRds.getClass();
            return new c(new C13330a(), bVar2, reasonDetailsFragment, rVar, reasonRds, str, bVar, num, resources, null);
        }
    }

    /* compiled from: DaggerReasonDetailsComponent.java */
    public static final class c implements com.avito.android.safedeal.delivery.order_cancellation.details.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<com.avito.android.safedeal.delivery.order_cancellation.details.domain.b> f256170a = dagger.internal.g.d(com.avito.android.safedeal.delivery.order_cancellation.details.domain.d.a());

        /* renamed from: b, reason: collision with root package name */
        public final l f256171b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.safedeal.delivery.order_cancellation.details.mvi.d f256172c;

        /* renamed from: d, reason: collision with root package name */
        public final u<B> f256173d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC25671a> f256174e;

        /* renamed from: f, reason: collision with root package name */
        public final u<R0> f256175f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.safedeal.delivery.order_cancellation.data.a> f256176g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.remote.error.f> f256177h;

        /* renamed from: i, reason: collision with root package name */
        public final u<E> f256178i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC28373a> f256179j;

        /* renamed from: k, reason: collision with root package name */
        public final u<Z0> f256180k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.safedeal.delivery.order_cancellation.details.mvi.b f256181l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC28481c> f256182m;

        /* renamed from: n, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f256183n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.safedeal.delivery.order_cancellation.details.f f256184o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.title.c f256185p;

        /* renamed from: q, reason: collision with root package name */
        public final l f256186q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.radio_group.c> f256187r;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.radio_group.b f256188s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.input.c> f256189t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f256190u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f256191v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f256192w;

        /* compiled from: DaggerReasonDetailsComponent.java */
        /* renamed from: com.avito.android.safedeal.delivery.order_cancellation.details.di.a$c$a, reason: collision with other inner class name */
        public static final class C7672a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safedeal.delivery.di.component.b f256193a;

            public C7672a(com.avito.android.safedeal.delivery.di.component.b bVar) {
                this.f256193a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f256193a.i();
                t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerReasonDetailsComponent.java */
        public static final class b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safedeal.delivery.di.component.b f256194a;

            public b(com.avito.android.safedeal.delivery.di.component.b bVar) {
                this.f256194a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f256194a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerReasonDetailsComponent.java */
        /* renamed from: com.avito.android.safedeal.delivery.order_cancellation.details.di.a$c$c, reason: collision with other inner class name */
        public static final class C7673c implements u<B> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safedeal.delivery.di.component.b f256195a;

            public C7673c(com.avito.android.safedeal.delivery.di.component.b bVar) {
                this.f256195a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                B bW3 = this.f256195a.w3();
                t.c(bW3);
                return bW3;
            }
        }

        /* compiled from: DaggerReasonDetailsComponent.java */
        public static final class d implements u<InterfaceC25671a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safedeal.delivery.di.component.b f256196a;

            public d(com.avito.android.safedeal.delivery.di.component.b bVar) {
                this.f256196a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC25671a interfaceC25671aIb = this.f256196a.ib();
                t.c(interfaceC25671aIb);
                return interfaceC25671aIb;
            }
        }

        /* compiled from: DaggerReasonDetailsComponent.java */
        public static final class e implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safedeal.delivery.di.component.b f256197a;

            public e(com.avito.android.safedeal.delivery.di.component.b bVar) {
                this.f256197a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f256197a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerReasonDetailsComponent.java */
        public static final class f implements u<Z0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safedeal.delivery.di.component.b f256198a;

            public f(com.avito.android.safedeal.delivery.di.component.b bVar) {
                this.f256198a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f256198a.Yh();
            }
        }

        /* compiled from: DaggerReasonDetailsComponent.java */
        public static final class g implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safedeal.delivery.di.component.b f256199a;

            public g(com.avito.android.safedeal.delivery.di.component.b bVar) {
                this.f256199a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f256199a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerReasonDetailsComponent.java */
        public static final class h implements u<com.avito.android.remote.error.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safedeal.delivery.di.component.b f256200a;

            public h(com.avito.android.safedeal.delivery.di.component.b bVar) {
                this.f256200a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f256200a.o();
            }
        }

        public c(C13330a c13330a, com.avito.android.safedeal.delivery.di.component.b bVar, Fragment fragment, r rVar, ReasonRds reasonRds, String str, com.avito.android.safedeal.delivery.order_cancellation.details.domain.a aVar, Integer num, Resources resources, C7671a c7671a) {
            l lVarA = l.a(reasonRds);
            this.f256171b = lVarA;
            this.f256172c = new com.avito.android.safedeal.delivery.order_cancellation.details.mvi.d(lVarA, this.f256170a);
            this.f256176g = dagger.internal.g.d(new com.avito.android.safedeal.delivery.order_cancellation.data.d(new C7673c(bVar), new d(bVar), new e(bVar)));
            this.f256177h = new h(bVar);
            l lVarA2 = l.a(str);
            C7672a c7672a = new C7672a(bVar);
            b bVar2 = new b(bVar);
            f fVar = new f(bVar);
            u<com.avito.android.safedeal.delivery.order_cancellation.data.a> uVar = this.f256176g;
            u<com.avito.android.remote.error.f> uVar2 = this.f256177h;
            l lVar = this.f256171b;
            this.f256181l = new com.avito.android.safedeal.delivery.order_cancellation.details.mvi.b(lVar, new com.avito.android.safedeal.delivery.order_cancellation.details.usecase.c(lVarA2, lVar, uVar, uVar2, c7672a, bVar2, fVar));
            this.f256182m = new g(bVar);
            this.f256183n = dagger.internal.g.d(new m(l.a(rVar), this.f256182m));
            this.f256184o = new com.avito.android.safedeal.delivery.order_cancellation.details.f(new com.avito.android.safedeal.delivery.order_cancellation.details.mvi.g(this.f256172c, this.f256181l, i.a(), k.a(), this.f256183n));
            this.f256185p = new com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.title.c(com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.title.g.a());
            this.f256186q = l.a(aVar);
            u<com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.radio_group.c> uVarD = dagger.internal.g.d(new com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.radio_group.f(this.f256186q, l.b(num)));
            this.f256187r = uVarD;
            this.f256188s = new com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.radio_group.b(uVarD);
            u<com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.input.c> uVarD2 = dagger.internal.g.d(new com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.input.f(this.f256186q));
            this.f256189t = uVarD2;
            u<com.avito.konveyor.a> uVarD3 = dagger.internal.g.d(new C13332c(c13330a, this.f256185p, this.f256188s, new com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.input.b(uVarD2)));
            this.f256190u = uVarD3;
            u<com.avito.konveyor.adapter.a> uVarD4 = dagger.internal.g.d(new C13331b(c13330a, uVarD3));
            this.f256191v = uVarD4;
            this.f256192w = dagger.internal.g.d(new Cn0.d(c13330a, uVarD4, this.f256190u));
        }

        @Override // com.avito.android.safedeal.delivery.order_cancellation.details.di.b
        public final void a(ReasonDetailsFragment reasonDetailsFragment) {
            reasonDetailsFragment.f256150n0 = this.f256184o;
            reasonDetailsFragment.f256152p0 = this.f256183n.get();
            reasonDetailsFragment.f256153q0 = this.f256192w.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
