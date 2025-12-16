package com.avito.android.sx_address.new_address.di;

import android.content.res.Resources;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.sx_address.SxAddressControl;
import com.avito.android.sx_address.new_address.SxNewAddressFragment;
import com.avito.android.sx_address.new_address.di.c;
import com.avito.android.sx_address.new_address.di.d;
import com.avito.android.sx_address.new_address.domain.i;
import com.avito.android.sx_address.new_address.g;
import com.avito.android.sx_address.new_address.h;
import com.avito.android.sx_address.new_address.mvi.A;
import com.avito.android.sx_address.new_address.mvi.C35188c;
import com.avito.android.sx_address.new_address.mvi.C35191f;
import com.avito.android.sx_address.new_address.mvi.E;
import com.avito.android.sx_address.new_address.mvi.F;
import com.avito.android.sx_address.new_address.mvi.H;
import com.avito.android.sx_address.new_address.mvi.y;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerSxNewAddressComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerSxNewAddressComponent.java */
    public static final class b implements d.a {
        public b() {
        }

        @Override // com.avito.android.sx_address.new_address.di.d.a
        public final d a(SxAddressControl sxAddressControl, Resources resources, e eVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(eVar, interfaceC39417a, sxAddressControl, resources, null);
        }
    }

    /* compiled from: DaggerSxNewAddressComponent.java */
    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        public final e f293583a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f293584b;

        /* renamed from: c, reason: collision with root package name */
        public final SxAddressControl f293585c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.sx_address.new_address.d> f293586d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.sx_address.new_address.analytics.c> f293587e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28373a> f293588f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.sx_address.new_address.analytics.e> f293589g;

        /* renamed from: h, reason: collision with root package name */
        public final u<EA0.a> f293590h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.sx_address.new_address.domain.a> f293591i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.sx_address.features.a> f293592j;

        /* renamed from: k, reason: collision with root package name */
        public final C35188c f293593k;

        /* renamed from: l, reason: collision with root package name */
        public final y f293594l;

        /* renamed from: m, reason: collision with root package name */
        public final u<F> f293595m;

        /* renamed from: n, reason: collision with root package name */
        public final l f293596n;

        /* compiled from: DaggerSxNewAddressComponent.java */
        /* renamed from: com.avito.android.sx_address.new_address.di.a$c$a, reason: collision with other inner class name */
        public static final class C8922a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final e f293597a;

            public C8922a(e eVar) {
                this.f293597a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f293597a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerSxNewAddressComponent.java */
        public static final class b implements u<EA0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final e f293598a;

            public b(e eVar) {
                this.f293598a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                EA0.a aVarQ1 = this.f293598a.q1();
                t.c(aVarQ1);
                return aVarQ1;
            }
        }

        /* compiled from: DaggerSxNewAddressComponent.java */
        /* renamed from: com.avito.android.sx_address.new_address.di.a$c$c, reason: collision with other inner class name */
        public static final class C8923c implements u<com.avito.android.sx_address.features.a> {

            /* renamed from: a, reason: collision with root package name */
            public final e f293599a;

            public C8923c(e eVar) {
                this.f293599a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f293599a.J5();
            }
        }

        public c(e eVar, cv.b bVar, SxAddressControl sxAddressControl, Resources resources, C8921a c8921a) {
            this.f293583a = eVar;
            this.f293584b = bVar;
            this.f293585c = sxAddressControl;
            this.f293586d = g.d(new com.avito.android.sx_address.new_address.f(l.a(resources)));
            u<com.avito.android.sx_address.new_address.analytics.c> uVarD = g.d(c.a.f293601a);
            this.f293587e = uVarD;
            this.f293589g = B.a(new com.avito.android.sx_address.new_address.analytics.g(uVarD, new C8922a(eVar)));
            this.f293591i = g.d(new i(new b(eVar)));
            l lVarA = l.a(sxAddressControl);
            C8923c c8923c = new C8923c(eVar);
            u<com.avito.android.sx_address.new_address.domain.a> uVar = this.f293591i;
            u<com.avito.android.sx_address.new_address.analytics.c> uVar2 = this.f293587e;
            this.f293593k = new C35188c(lVarA, uVar, uVar2, c8923c);
            this.f293594l = new y(lVarA, uVar, uVar2, this.f293589g, c8923c);
            u<F> uVarD2 = g.d(H.a());
            this.f293595m = uVarD2;
            this.f293596n = l.a(new com.avito.android.sx_address.new_address.i(new h(new C35191f(this.f293593k, this.f293594l, new E(uVarD2), A.a()))));
        }

        @Override // com.avito.android.sx_address.new_address.di.d
        public final void a(SxNewAddressFragment sxNewAddressFragment) {
            sxNewAddressFragment.f293549n0 = this.f293583a.ja();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f293584b.u4();
            t.c(aVarU4);
            sxNewAddressFragment.f293550o0 = aVarU4;
            sxNewAddressFragment.f293551p0 = this.f293585c;
            sxNewAddressFragment.f293552q0 = this.f293586d.get();
            sxNewAddressFragment.f293553r0 = this.f293587e.get();
            sxNewAddressFragment.f293554s0 = this.f293589g.get();
            sxNewAddressFragment.f293555t0 = (g.a) this.f293596n.f393949a;
        }
    }

    public static d.a a() {
        return new b();
    }
}
