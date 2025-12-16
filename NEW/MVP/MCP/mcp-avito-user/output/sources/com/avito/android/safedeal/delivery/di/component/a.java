package com.avito.android.safedeal.delivery.di.component;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.C;
import androidx.view.InterfaceC22983P;
import bk0.InterfaceC25671a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.B;
import com.avito.android.safedeal.delivery.di.component.d;
import com.avito.android.safedeal.delivery.di.module.k;
import com.avito.android.safedeal.delivery.order_cancellation.RdsOrderCancellationReasonsFragment;
import com.avito.android.safedeal.delivery.order_cancellation.i;
import com.avito.android.safedeal.delivery.order_cancellation.j;
import com.avito.android.safedeal.delivery.order_cancellation.konveyor.f;
import com.avito.android.safedeal.delivery.order_cancellation.n;
import com.avito.android.safedeal.delivery.order_cancellation.p;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerRdsOrderCancellationComponent.java */
@e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerRdsOrderCancellationComponent.java */
    public static final class b implements d.a {
        public b() {
        }

        @Override // com.avito.android.safedeal.delivery.di.component.d.a
        public final d a(Resources resources, RdsOrderCancellationReasonsFragment rdsOrderCancellationReasonsFragment, RdsOrderCancellationReasonsFragment rdsOrderCancellationReasonsFragment2, r rVar, String str, j jVar, com.avito.android.safedeal.delivery.di.component.b bVar) {
            return new c(bVar, resources, rdsOrderCancellationReasonsFragment, rdsOrderCancellationReasonsFragment2, rVar, str, jVar, null);
        }
    }

    /* compiled from: DaggerRdsOrderCancellationComponent.java */
    public static final class c implements com.avito.android.safedeal.delivery.di.component.d {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.safedeal.delivery.di.component.b f256037a;

        /* renamed from: b, reason: collision with root package name */
        public final Resources f256038b;

        /* renamed from: c, reason: collision with root package name */
        public final l f256039c;

        /* renamed from: d, reason: collision with root package name */
        public final u<B> f256040d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC25671a> f256041e;

        /* renamed from: f, reason: collision with root package name */
        public final u<R0> f256042f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.safedeal.delivery.order_cancellation.data.a> f256043g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.safedeal.delivery.order_cancellation.mvi.d f256044h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.safedeal.delivery.order_cancellation.mvi.b f256045i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC28481c> f256046j;

        /* renamed from: k, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f256047k;

        /* renamed from: l, reason: collision with root package name */
        public final n f256048l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f256049m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f256050n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f256051o;

        /* renamed from: p, reason: collision with root package name */
        public final u<C> f256052p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.e> f256053q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.c> f256054r;

        /* compiled from: DaggerRdsOrderCancellationComponent.java */
        /* renamed from: com.avito.android.safedeal.delivery.di.component.a$c$a, reason: collision with other inner class name */
        public static final class C7667a implements u<B> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safedeal.delivery.di.component.b f256055a;

            public C7667a(com.avito.android.safedeal.delivery.di.component.b bVar) {
                this.f256055a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                B bW3 = this.f256055a.w3();
                t.c(bW3);
                return bW3;
            }
        }

        /* compiled from: DaggerRdsOrderCancellationComponent.java */
        public static final class b implements u<InterfaceC25671a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safedeal.delivery.di.component.b f256056a;

            public b(com.avito.android.safedeal.delivery.di.component.b bVar) {
                this.f256056a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC25671a interfaceC25671aIb = this.f256056a.ib();
                t.c(interfaceC25671aIb);
                return interfaceC25671aIb;
            }
        }

        /* compiled from: DaggerRdsOrderCancellationComponent.java */
        /* renamed from: com.avito.android.safedeal.delivery.di.component.a$c$c, reason: collision with other inner class name */
        public static final class C7668c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safedeal.delivery.di.component.b f256057a;

            public C7668c(com.avito.android.safedeal.delivery.di.component.b bVar) {
                this.f256057a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f256057a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerRdsOrderCancellationComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safedeal.delivery.di.component.b f256058a;

            public d(com.avito.android.safedeal.delivery.di.component.b bVar) {
                this.f256058a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f256058a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.safedeal.delivery.di.component.b bVar, Resources resources, Fragment fragment, InterfaceC22983P interfaceC22983P, r rVar, String str, p pVar, C7666a c7666a) {
            this.f256037a = bVar;
            this.f256038b = resources;
            this.f256039c = l.a(str);
            u<com.avito.android.safedeal.delivery.order_cancellation.data.a> uVarD = g.d(new com.avito.android.safedeal.delivery.order_cancellation.data.d(new C7667a(bVar), new b(bVar), new C7668c(bVar)));
            this.f256043g = uVarD;
            com.avito.android.safedeal.delivery.order_cancellation.domain.b bVar2 = new com.avito.android.safedeal.delivery.order_cancellation.domain.b(this.f256039c, uVarD, i.a());
            this.f256044h = new com.avito.android.safedeal.delivery.order_cancellation.mvi.d(bVar2);
            this.f256045i = new com.avito.android.safedeal.delivery.order_cancellation.mvi.b(bVar2);
            this.f256046j = new d(bVar);
            this.f256047k = g.d(new k(l.a(rVar), this.f256046j));
            this.f256048l = new n(new com.avito.android.safedeal.delivery.order_cancellation.mvi.g(this.f256044h, this.f256045i, com.avito.android.safedeal.delivery.order_cancellation.mvi.i.a(), com.avito.android.safedeal.delivery.order_cancellation.mvi.k.a(), this.f256047k));
            u<com.avito.konveyor.a> uVarD2 = g.d(new com.avito.android.safedeal.delivery.di.module.e(new com.avito.android.safedeal.delivery.order_cancellation.konveyor.c(new f(l.a(pVar)))));
            this.f256049m = uVarD2;
            u<com.avito.konveyor.adapter.a> uVarD3 = g.d(new com.avito.android.safedeal.delivery.di.module.b(uVarD2));
            this.f256050n = uVarD3;
            u<com.avito.konveyor.adapter.j> uVarD4 = g.d(new com.avito.android.safedeal.delivery.di.module.g(uVarD3, this.f256049m));
            this.f256051o = uVarD4;
            this.f256052p = g.d(new com.avito.android.safedeal.delivery.di.module.f(uVarD4));
            u<com.avito.android.recycler.data_aware.e> uVarD5 = g.d(com.avito.android.safedeal.delivery.di.module.d.a());
            this.f256053q = uVarD5;
            this.f256054r = g.d(new com.avito.android.safedeal.delivery.di.module.c(uVarD5, this.f256052p, this.f256050n));
        }

        @Override // com.avito.android.safedeal.delivery.di.component.d
        public final void a(RdsOrderCancellationReasonsFragment rdsOrderCancellationReasonsFragment) {
            rdsOrderCancellationReasonsFragment.f256075n0 = this.f256048l;
            InterfaceC28373a interfaceC28373aA = this.f256037a.a();
            t.c(interfaceC28373aA);
            rdsOrderCancellationReasonsFragment.f256077p0 = interfaceC28373aA;
            rdsOrderCancellationReasonsFragment.f256078q0 = this.f256051o.get();
            rdsOrderCancellationReasonsFragment.f256079r0 = this.f256054r.get();
            rdsOrderCancellationReasonsFragment.f256080s0 = new com.avito.android.safedeal.delivery.order_cancellation.c(this.f256038b);
            rdsOrderCancellationReasonsFragment.f256081t0 = this.f256047k.get();
        }
    }

    public static d.a a() {
        return new b();
    }
}
