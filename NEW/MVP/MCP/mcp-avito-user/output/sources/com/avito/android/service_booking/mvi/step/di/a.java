package com.avito.android.service_booking.mvi.step.di;

import Gt0.InterfaceC13916a;
import Is0.C14155a;
import Ks0.InterfaceC14347a;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import androidx.recyclerview.widget.C;
import com.avito.android.B2;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.lib.beduin_v2.feature.di.C31142p0;
import com.avito.android.lib.beduin_v2.feature.di.C31144q0;
import com.avito.android.lib.beduin_v2.feature.di.C31145r0;
import com.avito.android.lib.beduin_v2.feature.di.C31153v0;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.service_booking.BookingFlow;
import com.avito.android.service_booking.BookingFlowSource;
import com.avito.android.service_booking.mvi.step.C34908b;
import com.avito.android.service_booking.mvi.step.C34912f;
import com.avito.android.service_booking.mvi.step.L;
import com.avito.android.service_booking.mvi.step.M;
import com.avito.android.service_booking.mvi.step.S;
import com.avito.android.service_booking.mvi.step.ServiceBookingMviStepFragment;
import com.avito.android.service_booking.mvi.step.di.b;
import com.avito.android.service_booking_common.di.A;
import com.avito.android.service_booking_common.di.D;
import com.avito.android.service_booking_common.di.E;
import com.avito.android.service_booking_common.di.r;
import com.avito.android.service_booking_common.di.s;
import com.avito.android.service_booking_common.di.v;
import com.avito.android.service_booking_common.di.x;
import com.avito.android.service_booking_common.di.y;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.R0;
import com.avito.beduin.v2.engine.component.B;
import com.avito.beduin.v2.engine.core.z;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Map;
import java.util.Set;
import rt0.C47721c;
import rt0.C47724f;
import rt0.InterfaceC47719a;
import rt0.InterfaceC47722d;
import ys0.InterfaceC50295f;

/* compiled from: DaggerServiceBookingMviStepComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerServiceBookingMviStepComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.service_booking.mvi.step.di.b.a
        public final com.avito.android.service_booking.mvi.step.di.b a(com.avito.android.service_booking.mvi.step.di.c cVar, InterfaceC39417a interfaceC39417a, C31138n0 c31138n0, Context context, String str, String str2, String str3, BookingFlowSource bookingFlowSource, Resources resources, C28478k c28478k, Map map, Y41.l lVar) {
            interfaceC39417a.getClass();
            str.getClass();
            map.getClass();
            return new c(c31138n0, new m(), cVar, interfaceC39417a, context, str, str2, str3, bookingFlowSource, resources, c28478k, map, lVar, null);
        }
    }

    /* compiled from: DaggerServiceBookingMviStepComponent.java */
    public static final class c implements com.avito.android.service_booking.mvi.step.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<com.avito.android.service_booking.storage.preferences.a> f274520A;

        /* renamed from: A0, reason: collision with root package name */
        public final u<com.avito.android.service_booking_common.blueprints.any_specialist.c> f274521A0;

        /* renamed from: B, reason: collision with root package name */
        public final com.avito.android.service_booking.mvi.step.mvi.o f274522B;

        /* renamed from: B0, reason: collision with root package name */
        public final com.avito.android.service_booking_common.blueprints.any_specialist.b f274523B0;

        /* renamed from: C, reason: collision with root package name */
        public final u<InterfaceC50295f> f274524C;

        /* renamed from: C0, reason: collision with root package name */
        public final u<com.avito.android.service_booking_common.blueprints.partner_logo.c> f274525C0;

        /* renamed from: D, reason: collision with root package name */
        public final u<com.avito.android.service_booking.mvi.domain.a> f274526D;

        /* renamed from: D0, reason: collision with root package name */
        public final com.avito.android.service_booking_common.blueprints.partner_logo.b f274527D0;

        /* renamed from: E, reason: collision with root package name */
        public final u<com.avito.android.service_booking.mvi.a> f274528E;

        /* renamed from: E0, reason: collision with root package name */
        public final u<com.avito.android.service_booking_common.blueprints.geo_reference.c> f274529E0;

        /* renamed from: F, reason: collision with root package name */
        public final com.avito.android.service_booking.mvi.step.mvi.u f274530F;

        /* renamed from: F0, reason: collision with root package name */
        public final com.avito.android.service_booking_common.blueprints.geo_reference.b f274531F0;

        /* renamed from: G, reason: collision with root package name */
        public final u<InterfaceC28481c> f274532G;

        /* renamed from: G0, reason: collision with root package name */
        public final u<com.avito.android.service_booking_common.blueprints.info_banner.c> f274533G0;

        /* renamed from: H, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f274534H;

        /* renamed from: H0, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f274535H0;

        /* renamed from: I, reason: collision with root package name */
        public final com.avito.android.service_booking.mvi.step.mvi.m f274536I;

        /* renamed from: I0, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.h> f274537I0;

        /* renamed from: J, reason: collision with root package name */
        public final u<n.a> f274538J;

        /* renamed from: J0, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.e> f274539J0;

        /* renamed from: K, reason: collision with root package name */
        public final u<B> f274540K;

        /* renamed from: K0, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f274541K0;

        /* renamed from: L, reason: collision with root package name */
        public final u<Set<FV0.h>> f274542L;

        /* renamed from: L0, reason: collision with root package name */
        public final C34908b f274543L0;

        /* renamed from: M, reason: collision with root package name */
        public final S f274544M;

        /* renamed from: M0, reason: collision with root package name */
        public final u<Is0.b> f274545M0;

        /* renamed from: N, reason: collision with root package name */
        public final u<z> f274546N;

        /* renamed from: N0, reason: collision with root package name */
        public final u<com.avito.android.service_booking_common.blueprints.offer.d> f274547N0;

        /* renamed from: O, reason: collision with root package name */
        public final u<C14155a> f274548O;

        /* renamed from: O0, reason: collision with root package name */
        public final u<Set<TV0.d<?, ?>>> f274549O0;

        /* renamed from: P, reason: collision with root package name */
        public final dagger.internal.f f274550P;

        /* renamed from: P0, reason: collision with root package name */
        public final dagger.internal.l f274551P0;

        /* renamed from: Q, reason: collision with root package name */
        public final u<C> f274552Q;

        /* renamed from: R, reason: collision with root package name */
        public final com.avito.android.service_booking_common.blueprints.text_block.b f274553R;

        /* renamed from: S, reason: collision with root package name */
        public final u<com.avito.android.service_booking_common.blueprints.check_price_list.d> f274554S;

        /* renamed from: T, reason: collision with root package name */
        public final com.avito.android.service_booking_common.blueprints.check_price_list.b f274555T;

        /* renamed from: U, reason: collision with root package name */
        public final com.avito.android.service_booking_common.blueprints.price_list.b f274556U;

        /* renamed from: V, reason: collision with root package name */
        public final u<com.avito.android.service_booking_common.blueprints.input.d> f274557V;

        /* renamed from: W, reason: collision with root package name */
        public final com.avito.android.service_booking_common.blueprints.input.b f274558W;

        /* renamed from: X, reason: collision with root package name */
        public final u<com.avito.android.service_booking_common.blueprints.date.date_list.e> f274559X;

        /* renamed from: Y, reason: collision with root package name */
        public final u<com.avito.android.service_booking_common.blueprints.date.timeslot_list.d> f274560Y;

        /* renamed from: Z, reason: collision with root package name */
        public final u<com.avito.android.service_booking_common.blueprints.date.d> f274561Z;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.service_booking.mvi.step.di.c f274562a;

        /* renamed from: a0, reason: collision with root package name */
        public final dagger.internal.f f274563a0;

        /* renamed from: b, reason: collision with root package name */
        public final Map<String, Map<String, Set<Object>>> f274564b;

        /* renamed from: b0, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f274565b0;

        /* renamed from: c, reason: collision with root package name */
        public final cv.b f274566c;

        /* renamed from: c0, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.h> f274567c0;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC14347a> f274568d;

        /* renamed from: d0, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.b> f274569d0;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC13916a> f274570e;

        /* renamed from: e0, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.a> f274571e0;

        /* renamed from: f, reason: collision with root package name */
        public final u<R0> f274572f;

        /* renamed from: f0, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.e> f274573f0;

        /* renamed from: g, reason: collision with root package name */
        public final u<B2> f274574g;

        /* renamed from: g0, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f274575g0;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.service_booking_common.g> f274576h;

        /* renamed from: h0, reason: collision with root package name */
        public final dagger.internal.f f274577h0;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.server_time.j> f274578i;

        /* renamed from: i0, reason: collision with root package name */
        public final u<InterfaceC35945t1<Long>> f274579i0;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC47719a> f274580j;

        /* renamed from: j0, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f274581j0;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.service_booking_common.n> f274582k;

        /* renamed from: k0, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.h> f274583k0;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC47722d> f274584l;

        /* renamed from: l0, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.b> f274585l0;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.service_booking.mvi.domain.converters.h> f274586m;

        /* renamed from: m0, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.a> f274587m0;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.service_booking.mvi.domain.converters.e> f274588n;

        /* renamed from: n0, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.e> f274589n0;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.service_booking.mvi.domain.converters.k> f274590o;

        /* renamed from: o0, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f274591o0;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.l f274592p;

        /* renamed from: p0, reason: collision with root package name */
        public final u<InterfaceC35945t1<Long>> f274593p0;

        /* renamed from: q, reason: collision with root package name */
        public final u<Map<String, List<String>>> f274594q;

        /* renamed from: q0, reason: collision with root package name */
        public final dagger.internal.l f274595q0;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.service_booking.mvi.domain.converters.a> f274596r;

        /* renamed from: r0, reason: collision with root package name */
        public final com.avito.android.service_booking_common.blueprints.date.b f274597r0;

        /* renamed from: s, reason: collision with root package name */
        public final u<BookingFlow> f274598s;

        /* renamed from: s0, reason: collision with root package name */
        public final com.avito.android.service_booking_common.blueprints.offer.g f274599s0;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.service_booking.mvi.domain.interactors.a> f274600t;

        /* renamed from: t0, reason: collision with root package name */
        public final com.avito.android.service_booking_common.blueprints.offer.b f274601t0;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.l f274602u;

        /* renamed from: u0, reason: collision with root package name */
        public final u<com.avito.android.service_booking_common.blueprints.contact.d> f274603u0;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.l f274604v;

        /* renamed from: v0, reason: collision with root package name */
        public final com.avito.android.service_booking_common.blueprints.contact.b f274605v0;

        /* renamed from: w, reason: collision with root package name */
        public final com.avito.android.service_booking.mvi.step.mvi.j f274606w;

        /* renamed from: w0, reason: collision with root package name */
        public final u<com.avito.android.service_booking_common.blueprints.comment.d> f274607w0;

        /* renamed from: x, reason: collision with root package name */
        public final com.avito.android.service_booking.mvi.step.mvi.h f274608x;

        /* renamed from: x0, reason: collision with root package name */
        public final com.avito.android.service_booking_common.blueprints.comment.b f274609x0;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.l f274610y;

        /* renamed from: y0, reason: collision with root package name */
        public final u<com.avito.android.service_booking_common.blueprints.specialist.c> f274611y0;

        /* renamed from: z, reason: collision with root package name */
        public final u<SharedPreferences> f274612z;

        /* renamed from: z0, reason: collision with root package name */
        public final com.avito.android.service_booking_common.blueprints.specialist.b f274613z0;

        /* compiled from: DaggerServiceBookingMviStepComponent.java */
        /* renamed from: com.avito.android.service_booking.mvi.step.di.a$c$a, reason: collision with other inner class name */
        public static final class C8151a implements u<BookingFlow> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking.mvi.step.di.c f274614a;

            public C8151a(com.avito.android.service_booking.mvi.step.di.c cVar) {
                this.f274614a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                BookingFlow bookingFlowMh = this.f274614a.Mh();
                t.c(bookingFlowMh);
                return bookingFlowMh;
            }
        }

        /* compiled from: DaggerServiceBookingMviStepComponent.java */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking.mvi.step.di.c f274615a;

            public b(com.avito.android.service_booking.mvi.step.di.c cVar) {
                this.f274615a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f274615a.c();
            }
        }

        /* compiled from: DaggerServiceBookingMviStepComponent.java */
        /* renamed from: com.avito.android.service_booking.mvi.step.di.a$c$c, reason: collision with other inner class name */
        public static final class C8152c implements u<InterfaceC50295f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking.mvi.step.di.c f274616a;

            public C8152c(com.avito.android.service_booking.mvi.step.di.c cVar) {
                this.f274616a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC50295f interfaceC50295fY7 = this.f274616a.y7();
                t.c(interfaceC50295fY7);
                return interfaceC50295fY7;
            }
        }

        /* compiled from: DaggerServiceBookingMviStepComponent.java */
        public static final class d implements u<com.avito.android.service_booking_common.n> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking.mvi.step.di.c f274617a;

            public d(com.avito.android.service_booking.mvi.step.di.c cVar) {
                this.f274617a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.service_booking_common.n nVarNb = this.f274617a.nb();
                t.c(nVarNb);
                return nVarNb;
            }
        }

        /* compiled from: DaggerServiceBookingMviStepComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking.mvi.step.di.c f274618a;

            public e(com.avito.android.service_booking.mvi.step.di.c cVar) {
                this.f274618a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f274618a.b();
            }
        }

        /* compiled from: DaggerServiceBookingMviStepComponent.java */
        public static final class f implements u<InterfaceC13916a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking.mvi.step.di.c f274619a;

            public f(com.avito.android.service_booking.mvi.step.di.c cVar) {
                this.f274619a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f274619a.j7();
            }
        }

        /* compiled from: DaggerServiceBookingMviStepComponent.java */
        public static final class g implements u<InterfaceC14347a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking.mvi.step.di.c f274620a;

            public g(com.avito.android.service_booking.mvi.step.di.c cVar) {
                this.f274620a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f274620a.F6();
            }
        }

        /* compiled from: DaggerServiceBookingMviStepComponent.java */
        public static final class h implements u<B2> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking.mvi.step.di.c f274621a;

            public h(com.avito.android.service_booking.mvi.step.di.c cVar) {
                this.f274621a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f274621a.S0();
            }
        }

        /* compiled from: DaggerServiceBookingMviStepComponent.java */
        public static final class i implements u<com.avito.android.server_time.j> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking.mvi.step.di.c f274622a;

            public i(com.avito.android.service_booking.mvi.step.di.c cVar) {
                this.f274622a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f274622a.N1();
            }
        }

        public c() {
            throw null;
        }

        public c(C31138n0 c31138n0, m mVar, com.avito.android.service_booking.mvi.step.di.c cVar, cv.b bVar, Context context, String str, String str2, String str3, BookingFlowSource bookingFlowSource, Resources resources, C28478k c28478k, Map map, Y41.l lVar, C8150a c8150a) {
            this.f274562a = cVar;
            this.f274564b = map;
            this.f274566c = bVar;
            this.f274568d = new g(cVar);
            this.f274570e = new f(cVar);
            this.f274572f = new b(cVar);
            h hVar = new h(cVar);
            this.f274574g = hVar;
            u<com.avito.android.service_booking_common.g> uVarD = dagger.internal.g.d(new com.avito.android.service_booking_common.i(hVar));
            this.f274576h = uVarD;
            i iVar = new i(cVar);
            this.f274578i = iVar;
            u<InterfaceC47719a> uVarD2 = dagger.internal.g.d(new C47721c(uVarD, iVar, this.f274574g));
            this.f274580j = uVarD2;
            d dVar = new d(cVar);
            this.f274582k = dVar;
            this.f274584l = dagger.internal.g.d(new C47724f(dVar, this.f274574g, uVarD2));
            this.f274586m = dagger.internal.g.d(com.avito.android.service_booking.mvi.domain.converters.j.a());
            this.f274588n = dagger.internal.g.d(new com.avito.android.service_booking.mvi.domain.converters.g(this.f274582k));
            this.f274590o = dagger.internal.g.d(com.avito.android.service_booking.mvi.domain.converters.m.a());
            dagger.internal.l lVarA = dagger.internal.l.a(map);
            this.f274592p = lVarA;
            this.f274594q = dagger.internal.g.d(new l(lVarA));
            this.f274596r = dagger.internal.g.d(com.avito.android.service_booking.mvi.domain.converters.c.a());
            this.f274598s = new C8151a(cVar);
            this.f274600t = dagger.internal.g.d(new com.avito.android.service_booking.mvi.domain.interactors.e(this.f274568d, this.f274570e, this.f274572f, this.f274584l, this.f274586m, this.f274588n, this.f274590o, this.f274582k, this.f274594q, this.f274596r, this.f274574g, this.f274598s, dagger.internal.l.a(bookingFlowSource)));
            this.f274602u = dagger.internal.l.b(str2);
            this.f274604v = dagger.internal.l.a(str);
            dagger.internal.l lVarB = dagger.internal.l.b(str3);
            u<com.avito.android.service_booking.mvi.domain.interactors.a> uVar = this.f274600t;
            dagger.internal.l lVar2 = this.f274592p;
            dagger.internal.l lVar3 = this.f274602u;
            dagger.internal.l lVar4 = this.f274604v;
            this.f274606w = new com.avito.android.service_booking.mvi.step.mvi.j(lVar2, lVar3, lVar4, lVarB, uVar);
            this.f274608x = new com.avito.android.service_booking.mvi.step.mvi.h(lVar2, lVar4, lVarB, lVar3, uVar, this.f274598s);
            dagger.internal.l lVarA2 = dagger.internal.l.a(context);
            this.f274610y = lVarA2;
            u<SharedPreferences> uVarD3 = dagger.internal.g.d(new j(lVarA2));
            this.f274612z = uVarD3;
            u<com.avito.android.service_booking.storage.preferences.a> uVarD4 = dagger.internal.g.d(new com.avito.android.service_booking.storage.preferences.c(uVarD3));
            this.f274520A = uVarD4;
            this.f274522B = new com.avito.android.service_booking.mvi.step.mvi.o(uVarD4);
            this.f274524C = new C8152c(cVar);
            u<com.avito.android.service_booking.mvi.domain.a> uVarD5 = dagger.internal.g.d(com.avito.android.service_booking.mvi.domain.c.a());
            this.f274526D = uVarD5;
            u<com.avito.android.service_booking.mvi.a> uVarD6 = dagger.internal.g.d(new com.avito.android.service_booking.mvi.c(this.f274604v, this.f274610y, uVarD5, this.f274524C));
            this.f274528E = uVarD6;
            this.f274530F = new com.avito.android.service_booking.mvi.step.mvi.u(uVarD6, this.f274582k, this.f274598s);
            this.f274532G = new e(cVar);
            u<ScreenPerformanceTracker> uVarS = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f274532G);
            this.f274534H = uVarS;
            this.f274536I = new com.avito.android.service_booking.mvi.step.mvi.m(this.f274606w, this.f274608x, this.f274522B, this.f274530F, uVarS);
            this.f274538J = dagger.internal.B.a(C31142p0.a(c31138n0));
            this.f274540K = dagger.internal.B.a(C31145r0.a(c31138n0));
            this.f274542L = dagger.internal.B.a(C31153v0.a(c31138n0));
            this.f274544M = new S(this.f274536I, this.f274538J, this.f274540K, this.f274542L, C31144q0.a(c31138n0));
            u<z> uVarD7 = dagger.internal.g.d(new o(mVar));
            this.f274546N = uVarD7;
            this.f274548O = dagger.internal.g.d(new n(mVar, uVarD7));
            dagger.internal.f fVar = new dagger.internal.f();
            this.f274550P = fVar;
            this.f274552Q = dagger.internal.g.d(new com.avito.android.service_booking.mvi.step.di.i(fVar));
            this.f274553R = new com.avito.android.service_booking_common.blueprints.text_block.b(com.avito.android.service_booking_common.blueprints.text_block.d.a());
            u<com.avito.android.service_booking_common.blueprints.check_price_list.d> uVarD8 = dagger.internal.g.d(com.avito.android.service_booking_common.blueprints.check_price_list.o.a());
            this.f274554S = uVarD8;
            this.f274555T = new com.avito.android.service_booking_common.blueprints.check_price_list.b(uVarD8);
            this.f274556U = new com.avito.android.service_booking_common.blueprints.price_list.b(com.avito.android.service_booking_common.blueprints.price_list.d.a());
            u<com.avito.android.service_booking_common.blueprints.input.d> uVarD9 = dagger.internal.g.d(com.avito.android.service_booking_common.blueprints.input.i.a());
            this.f274557V = uVarD9;
            this.f274558W = new com.avito.android.service_booking_common.blueprints.input.b(uVarD9);
            this.f274559X = dagger.internal.g.d(com.avito.android.service_booking_common.blueprints.date.date_list.i.a());
            u<com.avito.android.service_booking_common.blueprints.date.timeslot_list.d> uVarA = dagger.internal.B.a(com.avito.android.service_booking_common.blueprints.date.timeslot_list.h.a());
            this.f274560Y = uVarA;
            this.f274561Z = dagger.internal.g.d(new com.avito.android.service_booking_common.blueprints.date.l(uVarA, this.f274559X));
            this.f274563a0 = new dagger.internal.f();
            u<com.avito.konveyor.a> uVarD10 = dagger.internal.g.d(new r(new com.avito.android.service_booking_common.blueprints.date.date_list.b(this.f274578i, this.f274559X)));
            this.f274565b0 = uVarD10;
            this.f274567c0 = dagger.internal.g.d(new com.avito.android.service_booking_common.di.l(uVarD10));
            this.f274569d0 = dagger.internal.g.d(com.avito.android.service_booking_common.di.n.a());
            u<com.avito.android.recycler.data_aware.a> uVarD11 = dagger.internal.g.d(com.avito.android.service_booking_common.di.m.a());
            this.f274571e0 = uVarD11;
            u<com.avito.android.recycler.data_aware.e> uVarD12 = dagger.internal.g.d(new com.avito.android.service_booking_common.di.q(uVarD11, this.f274569d0));
            this.f274573f0 = uVarD12;
            u<com.avito.konveyor.adapter.a> uVarD13 = dagger.internal.g.d(new com.avito.android.service_booking_common.di.o(this.f274563a0, uVarD12, this.f274567c0));
            this.f274575g0 = uVarD13;
            dagger.internal.f.a(this.f274563a0, dagger.internal.g.d(new s(uVarD13, this.f274565b0)));
            this.f274577h0 = new dagger.internal.f();
            u<InterfaceC35945t1<Long>> uVarA2 = dagger.internal.B.a(new E(this.f274578i));
            this.f274579i0 = uVarA2;
            u<com.avito.konveyor.a> uVarA3 = dagger.internal.B.a(new com.avito.android.service_booking_common.di.C(new com.avito.android.service_booking_common.blueprints.date.timeslot_list.b(uVarA2, this.f274560Y)));
            this.f274581j0 = uVarA3;
            this.f274583k0 = dagger.internal.B.a(new x(uVarA3));
            this.f274585l0 = dagger.internal.B.a(com.avito.android.service_booking_common.di.z.a());
            u<com.avito.android.recycler.data_aware.a> uVarA4 = dagger.internal.B.a(y.a());
            this.f274587m0 = uVarA4;
            u<com.avito.android.recycler.data_aware.e> uVarA5 = dagger.internal.B.a(new com.avito.android.service_booking_common.di.B(uVarA4, this.f274585l0));
            this.f274589n0 = uVarA5;
            u<com.avito.konveyor.adapter.a> uVarA6 = dagger.internal.B.a(new A(this.f274577h0, uVarA5, this.f274583k0));
            this.f274591o0 = uVarA6;
            dagger.internal.f.a(this.f274577h0, dagger.internal.B.a(new D(uVarA6, this.f274581j0)));
            this.f274593p0 = dagger.internal.g.d(new com.avito.android.service_booking_common.di.p(this.f274578i));
            dagger.internal.l lVarA3 = dagger.internal.l.a(resources);
            this.f274595q0 = lVarA3;
            this.f274597r0 = new com.avito.android.service_booking_common.blueprints.date.b(this.f274561Z, this.f274563a0, this.f274575g0, this.f274577h0, this.f274591o0, this.f274593p0, new com.avito.android.service_booking_common.blueprints.date.date_list.d(lVarA3));
            com.avito.android.service_booking_common.blueprints.offer.g gVar = new com.avito.android.service_booking_common.blueprints.offer.g(this.f274572f);
            this.f274599s0 = gVar;
            this.f274601t0 = new com.avito.android.service_booking_common.blueprints.offer.b(gVar);
            u<com.avito.android.service_booking_common.blueprints.contact.d> uVarD14 = dagger.internal.g.d(com.avito.android.service_booking_common.blueprints.contact.i.a());
            this.f274603u0 = uVarD14;
            this.f274605v0 = new com.avito.android.service_booking_common.blueprints.contact.b(uVarD14);
            u<com.avito.android.service_booking_common.blueprints.comment.d> uVarD15 = dagger.internal.g.d(com.avito.android.service_booking_common.blueprints.comment.g.a());
            this.f274607w0 = uVarD15;
            this.f274609x0 = new com.avito.android.service_booking_common.blueprints.comment.b(uVarD15);
            u<com.avito.android.service_booking_common.blueprints.specialist.c> uVarD16 = dagger.internal.g.d(com.avito.android.service_booking_common.blueprints.specialist.e.a());
            this.f274611y0 = uVarD16;
            this.f274613z0 = new com.avito.android.service_booking_common.blueprints.specialist.b(uVarD16);
            u<com.avito.android.service_booking_common.blueprints.any_specialist.c> uVarD17 = dagger.internal.g.d(com.avito.android.service_booking_common.blueprints.any_specialist.e.a());
            this.f274521A0 = uVarD17;
            this.f274523B0 = new com.avito.android.service_booking_common.blueprints.any_specialist.b(uVarD17);
            u<com.avito.android.service_booking_common.blueprints.partner_logo.c> uVarD18 = dagger.internal.g.d(com.avito.android.service_booking_common.blueprints.partner_logo.e.a());
            this.f274525C0 = uVarD18;
            this.f274527D0 = new com.avito.android.service_booking_common.blueprints.partner_logo.b(uVarD18);
            u<com.avito.android.service_booking_common.blueprints.geo_reference.c> uVarD19 = dagger.internal.g.d(new com.avito.android.service_booking_common.blueprints.geo_reference.f(dagger.internal.l.a(lVar)));
            this.f274529E0 = uVarD19;
            this.f274531F0 = new com.avito.android.service_booking_common.blueprints.geo_reference.b(uVarD19);
            u<com.avito.android.service_booking_common.blueprints.info_banner.c> uVarD20 = dagger.internal.g.d(com.avito.android.service_booking_common.blueprints.info_banner.e.a());
            this.f274533G0 = uVarD20;
            u<com.avito.konveyor.a> uVarD21 = dagger.internal.g.d(new com.avito.android.service_booking_common.di.u(this.f274553R, this.f274555T, this.f274556U, this.f274558W, this.f274597r0, this.f274601t0, this.f274605v0, this.f274609x0, this.f274613z0, this.f274523B0, this.f274527D0, this.f274531F0, new com.avito.android.service_booking_common.blueprints.info_banner.b(uVarD20)));
            this.f274535H0 = uVarD21;
            this.f274537I0 = dagger.internal.g.d(new com.avito.android.service_booking.mvi.step.di.f(uVarD21));
            u<com.avito.android.recycler.data_aware.e> uVarD22 = dagger.internal.g.d(new com.avito.android.service_booking.mvi.step.di.h(com.avito.android.service_booking_common.k.a(), com.avito.android.service_booking_common.m.a()));
            this.f274539J0 = uVarD22;
            u<com.avito.konveyor.adapter.a> uVarD23 = dagger.internal.g.d(new com.avito.android.service_booking.mvi.step.di.g(uVarD22, this.f274552Q, this.f274537I0));
            this.f274541K0 = uVarD23;
            dagger.internal.f.a(this.f274550P, dagger.internal.g.d(new k(uVarD23, this.f274535H0)));
            this.f274543L0 = new C34908b(this.f274595q0);
            this.f274545M0 = dagger.internal.g.d(new Is0.f(this.f274610y));
            u<com.avito.android.service_booking_common.blueprints.offer.d> uVarD24 = dagger.internal.g.d(this.f274599s0);
            this.f274547N0 = uVarD24;
            this.f274549O0 = dagger.internal.g.d(new v(uVarD24, this.f274554S, this.f274561Z, this.f274557V, this.f274603u0, this.f274607w0, this.f274611y0, this.f274521A0, this.f274525C0, this.f274529E0));
            A.b bVarA = dagger.internal.A.a(0, 1);
            bVarA.f393938b.add(this.f274549O0);
            this.f274551P0 = dagger.internal.l.a(new M(new L(this.f274550P, this.f274541K0, this.f274543L0, this.f274545M0, this.f274592p, bVarA.b())));
        }

        @Override // com.avito.android.service_booking.mvi.step.di.b
        public final void a(ServiceBookingMviStepFragment serviceBookingMviStepFragment) {
            serviceBookingMviStepFragment.f274490o0 = this.f274544M;
            serviceBookingMviStepFragment.f274491p0 = this.f274548O.get();
            serviceBookingMviStepFragment.f274492q0 = this.f274562a.x7();
            serviceBookingMviStepFragment.f274496u0 = (C34912f.a) this.f274551P0.f393949a;
            serviceBookingMviStepFragment.f274498w0 = this.f274564b;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f274566c.u4();
            t.c(aVarU4);
            serviceBookingMviStepFragment.f274499x0 = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}
