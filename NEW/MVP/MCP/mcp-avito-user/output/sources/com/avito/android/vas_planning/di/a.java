package com.avito.android.vas_planning.di;

import aM0.InterfaceC19791a;
import android.content.res.Resources;
import androidx.recyclerview.widget.C;
import androidx.view.InterfaceC23487e;
import androidx.view.P0;
import com.avito.android.J0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.vas_planning.VasPlanningFragment;
import com.avito.android.vas_planning.VasPlanningFragmentArgument;
import com.avito.android.vas_planning.di.b;
import com.avito.android.vas_planning.di.j;
import com.avito.android.vas_planning.q;
import com.avito.android.vas_planning.s;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;

/* compiled from: DaggerVasPlanningComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerVasPlanningComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.vas_planning.di.b.a
        public final com.avito.android.vas_planning.di.b a(VasPlanningFragmentArgument vasPlanningFragmentArgument, VasPlanningFragment vasPlanningFragment, VasPlanningFragment vasPlanningFragment2, Resources resources, e eVar, InterfaceC39417a interfaceC39417a) {
            vasPlanningFragmentArgument.getClass();
            vasPlanningFragment.getClass();
            interfaceC39417a.getClass();
            return new c(eVar, interfaceC39417a, vasPlanningFragmentArgument, vasPlanningFragment, vasPlanningFragment2, resources, null);
        }
    }

    /* compiled from: DaggerVasPlanningComponent.java */
    public static final class c implements com.avito.android.vas_planning.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.e> f322259A;

        /* renamed from: B, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f322260B;

        /* renamed from: a, reason: collision with root package name */
        public final e f322261a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f322262b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f322263c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC23487e> f322264d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.l f322265e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC19791a> f322266f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.l f322267g;

        /* renamed from: h, reason: collision with root package name */
        public final u<J0> f322268h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.vas_planning.domain.e> f322269i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC35745a5> f322270j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.vas_planning.domain.h> f322271k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.vas_planning.domain.a> f322272l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.vas_planning.domain.k> f322273m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC28373a> f322274n;

        /* renamed from: o, reason: collision with root package name */
        public final u<P0.c> f322275o;

        /* renamed from: p, reason: collision with root package name */
        public final u<q> f322276p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.vas_planning.item.date_time.d> f322277q;

        /* renamed from: r, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f322278r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.android.vas_planning.item.radio.d> f322279s;

        /* renamed from: t, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f322280t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.android.vas_planning.item.title.c> f322281u;

        /* renamed from: v, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f322282v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f322283w;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.h> f322284x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f322285y;

        /* renamed from: z, reason: collision with root package name */
        public final u<C> f322286z;

        /* compiled from: DaggerVasPlanningComponent.java */
        /* renamed from: com.avito.android.vas_planning.di.a$c$a, reason: collision with other inner class name */
        public static final class C9965a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final e f322287a;

            public C9965a(e eVar) {
                this.f322287a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f322287a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerVasPlanningComponent.java */
        public static final class b implements u<J0> {

            /* renamed from: a, reason: collision with root package name */
            public final e f322288a;

            public b(e eVar) {
                this.f322288a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                J0 j0F0 = this.f322288a.f0();
                t.c(j0F0);
                return j0F0;
            }
        }

        /* compiled from: DaggerVasPlanningComponent.java */
        /* renamed from: com.avito.android.vas_planning.di.a$c$c, reason: collision with other inner class name */
        public static final class C9966c implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final e f322289a;

            public C9966c(e eVar) {
                this.f322289a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f322289a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerVasPlanningComponent.java */
        public static final class d implements u<InterfaceC19791a> {

            /* renamed from: a, reason: collision with root package name */
            public final e f322290a;

            public d(e eVar) {
                this.f322290a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC19791a interfaceC19791aW3 = this.f322290a.W3();
                t.c(interfaceC19791aW3);
                return interfaceC19791aW3;
            }
        }

        public c(e eVar, cv.b bVar, VasPlanningFragmentArgument vasPlanningFragmentArgument, VasPlanningFragment vasPlanningFragment, com.avito.android.vas_planning.b bVar2, Resources resources, C9964a c9964a) {
            this.f322261a = eVar;
            this.f322262b = bVar;
            dagger.internal.l lVarA = dagger.internal.l.a(vasPlanningFragment);
            this.f322263c = lVarA;
            this.f322264d = dagger.internal.g.d(lVarA);
            this.f322265e = dagger.internal.l.a(vasPlanningFragmentArgument);
            this.f322266f = new d(eVar);
            dagger.internal.l lVarA2 = dagger.internal.l.a(resources);
            this.f322267g = lVarA2;
            b bVar3 = new b(eVar);
            this.f322268h = bVar3;
            this.f322269i = dagger.internal.g.d(new com.avito.android.vas_planning.domain.g(lVarA2, bVar3));
            this.f322270j = new C9966c(eVar);
            this.f322271k = dagger.internal.g.d(com.avito.android.vas_planning.domain.j.a());
            u<com.avito.android.vas_planning.domain.a> uVarD = dagger.internal.g.d(com.avito.android.vas_planning.domain.d.a());
            this.f322272l = uVarD;
            u<com.avito.android.vas_planning.domain.k> uVarD2 = dagger.internal.g.d(new com.avito.android.vas_planning.domain.q(this.f322267g, uVarD, this.f322266f, this.f322269i, this.f322270j, this.f322271k));
            this.f322273m = uVarD2;
            C9965a c9965a = new C9965a(eVar);
            u<P0.c> uVarD3 = dagger.internal.g.d(new s(this.f322265e, uVarD2, this.f322264d, this.f322270j, this.f322268h, c9965a));
            this.f322275o = uVarD3;
            this.f322276p = dagger.internal.g.d(new o(this.f322263c, uVarD3));
            u<com.avito.android.vas_planning.item.date_time.d> uVarD4 = dagger.internal.g.d(new com.avito.android.vas_planning.item.date_time.j(dagger.internal.l.a(bVar2), this.f322276p));
            this.f322277q = uVarD4;
            this.f322278r = dagger.internal.g.d(new com.avito.android.vas_planning.item.date_time.c(uVarD4));
            u<com.avito.android.vas_planning.item.radio.d> uVarD5 = dagger.internal.g.d(new com.avito.android.vas_planning.item.radio.g(this.f322276p));
            this.f322279s = uVarD5;
            this.f322280t = dagger.internal.g.d(new com.avito.android.vas_planning.item.radio.c(uVarD5));
            u<com.avito.android.vas_planning.item.title.c> uVarD6 = dagger.internal.g.d(com.avito.android.vas_planning.item.title.e.a());
            this.f322281u = uVarD6;
            this.f322282v = dagger.internal.g.d(new com.avito.android.vas_planning.item.title.b(uVarD6));
            A.b bVarA = A.a(3, 0);
            u<TV0.b<?, ?>> uVar = this.f322278r;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f322280t);
            list.add(this.f322282v);
            u<com.avito.konveyor.a> uVarD7 = dagger.internal.g.d(new k(bVarA.b()));
            this.f322283w = uVarD7;
            u<com.avito.konveyor.adapter.h> uVarD8 = dagger.internal.g.d(new m(uVarD7));
            this.f322284x = uVarD8;
            u<com.avito.konveyor.adapter.j> uVarD9 = dagger.internal.g.d(new n(uVarD8, this.f322283w));
            this.f322285y = uVarD9;
            this.f322286z = dagger.internal.g.d(new l(uVarD9));
            u<com.avito.android.recycler.data_aware.e> uVarD10 = dagger.internal.g.d(j.a.f322299a);
            this.f322259A = uVarD10;
            this.f322260B = dagger.internal.g.d(new i(uVarD10, this.f322286z, this.f322284x));
        }

        @Override // com.avito.android.vas_planning.di.b
        public final void a(VasPlanningFragment vasPlanningFragment) {
            vasPlanningFragment.f322183q0 = this.f322276p.get();
            vasPlanningFragment.f322184r0 = this.f322260B.get();
            vasPlanningFragment.f322185s0 = this.f322285y.get();
            e eVar = this.f322261a;
            vasPlanningFragment.f322186t0 = eVar.Qe();
            vasPlanningFragment.f322187u0 = this.f322283w.get();
            InterfaceC28373a interfaceC28373aA = eVar.a();
            t.c(interfaceC28373aA);
            vasPlanningFragment.f322189w0 = interfaceC28373aA;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f322262b.u4();
            t.c(aVarU4);
            vasPlanningFragment.f322190x0 = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}
