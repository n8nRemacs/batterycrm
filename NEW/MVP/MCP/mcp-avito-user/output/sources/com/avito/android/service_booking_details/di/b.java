package com.avito.android.service_booking_details.di;

import Bs0.InterfaceC13182a;
import Pu0.InterfaceC14839a;
import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.content.res.Resources;
import androidx.recyclerview.widget.C;
import com.avito.android.B2;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.service_booking_common.blueprints.check_price_list.o;
import com.avito.android.service_booking_common.di.A;
import com.avito.android.service_booking_common.di.D;
import com.avito.android.service_booking_common.di.q;
import com.avito.android.service_booking_common.di.s;
import com.avito.android.service_booking_common.di.v;
import com.avito.android.service_booking_common.di.x;
import com.avito.android.service_booking_common.di.y;
import com.avito.android.service_booking_common.di.z;
import com.avito.android.service_booking_details.ServiceBookingItemDetailsActivity;
import com.avito.android.service_booking_details.di.c;
import com.avito.android.service_booking_details.mvi.p;
import com.avito.android.service_booking_details.mvi.r;
import com.avito.android.service_booking_details.t;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.R0;
import com.avito.android.util.S;
import com.avito.android.util.V;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.u;
import java.util.Set;
import rt0.C47721c;
import rt0.C47724f;
import rt0.InterfaceC47719a;
import rt0.InterfaceC47722d;
import vK0.C49228b;

/* compiled from: DaggerServiceBookingItemDetailsComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class b {

    /* compiled from: DaggerServiceBookingItemDetailsComponent.java */
    /* renamed from: com.avito.android.service_booking_details.di.b$b, reason: collision with other inner class name */
    public static final class C8236b implements c.a {
        public C8236b() {
        }

        @Override // com.avito.android.service_booking_details.di.c.a
        public final com.avito.android.service_booking_details.di.c a(ServiceBookingItemDetailsActivity serviceBookingItemDetailsActivity, d dVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, String str, Resources resources, Y41.l lVar) {
            interfaceC39417a.getClass();
            return new c(dVar, interfaceC39417a, serviceBookingItemDetailsActivity, c28478k, str, resources, lVar, null);
        }
    }

    /* compiled from: DaggerServiceBookingItemDetailsComponent.java */
    public static final class c implements com.avito.android.service_booking_details.di.c {

        /* renamed from: A, reason: collision with root package name */
        public final u<com.avito.android.service_booking_details.mvi.a> f277214A;

        /* renamed from: A0, reason: collision with root package name */
        public final u<com.avito.android.service_booking_common.blueprints.offer.d> f277215A0;

        /* renamed from: B, reason: collision with root package name */
        public final r f277216B;

        /* renamed from: B0, reason: collision with root package name */
        public final u<Set<TV0.d<?, ?>>> f277217B0;

        /* renamed from: C, reason: collision with root package name */
        public final u<InterfaceC28481c> f277218C;

        /* renamed from: C0, reason: collision with root package name */
        public final u<E> f277219C0;

        /* renamed from: D, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f277220D;

        /* renamed from: D0, reason: collision with root package name */
        public final u<SK0.b> f277221D0;

        /* renamed from: E, reason: collision with root package name */
        public final t f277222E;

        /* renamed from: E0, reason: collision with root package name */
        public final u<com.avito.android.service_booking_utils.ux_feedback.a> f277223E0;

        /* renamed from: F, reason: collision with root package name */
        public final dagger.internal.f f277224F;

        /* renamed from: G, reason: collision with root package name */
        public final u<C> f277225G;

        /* renamed from: H, reason: collision with root package name */
        public final com.avito.android.service_booking_common.blueprints.text_block.b f277226H;

        /* renamed from: I, reason: collision with root package name */
        public final u<com.avito.android.service_booking_common.blueprints.check_price_list.d> f277227I;

        /* renamed from: J, reason: collision with root package name */
        public final com.avito.android.service_booking_common.blueprints.check_price_list.b f277228J;

        /* renamed from: K, reason: collision with root package name */
        public final com.avito.android.service_booking_common.blueprints.price_list.b f277229K;

        /* renamed from: L, reason: collision with root package name */
        public final u<com.avito.android.service_booking_common.blueprints.input.d> f277230L;

        /* renamed from: M, reason: collision with root package name */
        public final com.avito.android.service_booking_common.blueprints.input.b f277231M;

        /* renamed from: N, reason: collision with root package name */
        public final u<com.avito.android.service_booking_common.blueprints.date.date_list.e> f277232N;

        /* renamed from: O, reason: collision with root package name */
        public final u<com.avito.android.service_booking_common.blueprints.date.timeslot_list.d> f277233O;

        /* renamed from: P, reason: collision with root package name */
        public final u<com.avito.android.service_booking_common.blueprints.date.d> f277234P;

        /* renamed from: Q, reason: collision with root package name */
        public final dagger.internal.f f277235Q;

        /* renamed from: R, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f277236R;

        /* renamed from: S, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.h> f277237S;

        /* renamed from: T, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.b> f277238T;

        /* renamed from: U, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.a> f277239U;

        /* renamed from: V, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.e> f277240V;

        /* renamed from: W, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f277241W;

        /* renamed from: X, reason: collision with root package name */
        public final dagger.internal.f f277242X;

        /* renamed from: Y, reason: collision with root package name */
        public final u<InterfaceC35945t1<Long>> f277243Y;

        /* renamed from: Z, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f277244Z;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.service_booking_details.di.d f277245a;

        /* renamed from: a0, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.h> f277246a0;

        /* renamed from: b, reason: collision with root package name */
        public final Resources f277247b;

        /* renamed from: b0, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.b> f277248b0;

        /* renamed from: c, reason: collision with root package name */
        public final cv.b f277249c;

        /* renamed from: c0, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.a> f277250c0;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC13182a> f277251d;

        /* renamed from: d0, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.e> f277252d0;

        /* renamed from: e, reason: collision with root package name */
        public final u<B2> f277253e;

        /* renamed from: e0, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f277254e0;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.service_booking_common.g> f277255f;

        /* renamed from: f0, reason: collision with root package name */
        public final u<InterfaceC35945t1<Long>> f277256f0;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.server_time.j> f277257g;

        /* renamed from: g0, reason: collision with root package name */
        public final com.avito.android.service_booking_common.blueprints.date.b f277258g0;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC47719a> f277259h;

        /* renamed from: h0, reason: collision with root package name */
        public final com.avito.android.service_booking_common.blueprints.offer.g f277260h0;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.l f277261i;

        /* renamed from: i0, reason: collision with root package name */
        public final com.avito.android.service_booking_common.blueprints.offer.b f277262i0;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC35945t1<Long>> f277263j;

        /* renamed from: j0, reason: collision with root package name */
        public final u<com.avito.android.service_booking_common.blueprints.contact.d> f277264j0;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.service_booking_common.n> f277265k;

        /* renamed from: k0, reason: collision with root package name */
        public final com.avito.android.service_booking_common.blueprints.contact.b f277266k0;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC47722d> f277267l;

        /* renamed from: l0, reason: collision with root package name */
        public final u<com.avito.android.service_booking_common.blueprints.comment.d> f277268l0;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.service_booking_details.domain.g> f277269m;

        /* renamed from: m0, reason: collision with root package name */
        public final com.avito.android.service_booking_common.blueprints.comment.b f277270m0;

        /* renamed from: n, reason: collision with root package name */
        public final u<R0> f277271n;

        /* renamed from: n0, reason: collision with root package name */
        public final u<com.avito.android.service_booking_common.blueprints.specialist.c> f277272n0;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.service_booking_details.domain.a> f277273o;

        /* renamed from: o0, reason: collision with root package name */
        public final com.avito.android.service_booking_common.blueprints.specialist.b f277274o0;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.l f277275p;

        /* renamed from: p0, reason: collision with root package name */
        public final u<com.avito.android.service_booking_common.blueprints.any_specialist.c> f277276p0;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.service_booking_details.mvi.k f277277q;

        /* renamed from: q0, reason: collision with root package name */
        public final com.avito.android.service_booking_common.blueprints.any_specialist.b f277278q0;

        /* renamed from: r, reason: collision with root package name */
        public final u<InterfaceC14839a> f277279r;

        /* renamed from: r0, reason: collision with root package name */
        public final u<com.avito.android.service_booking_common.blueprints.partner_logo.c> f277280r0;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.android.service_booking_details.domain.d> f277281s;

        /* renamed from: s0, reason: collision with root package name */
        public final com.avito.android.service_booking_common.blueprints.partner_logo.b f277282s0;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f277283t;

        /* renamed from: t0, reason: collision with root package name */
        public final u<com.avito.android.service_booking_common.blueprints.geo_reference.c> f277284t0;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.android.service_booking_details.l> f277285u;

        /* renamed from: u0, reason: collision with root package name */
        public final com.avito.android.service_booking_common.blueprints.geo_reference.b f277286u0;

        /* renamed from: v, reason: collision with root package name */
        public final com.avito.android.service_booking_details.mvi.i f277287v;

        /* renamed from: v0, reason: collision with root package name */
        public final u<com.avito.android.service_booking_common.blueprints.info_banner.c> f277288v0;

        /* renamed from: w, reason: collision with root package name */
        public final u<SharedPreferences> f277289w;

        /* renamed from: w0, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f277290w0;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.avito.android.service_booking_details.domain.preferences.a> f277291x;

        /* renamed from: x0, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.h> f277292x0;

        /* renamed from: y, reason: collision with root package name */
        public final p f277293y;

        /* renamed from: y0, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.e> f277294y0;

        /* renamed from: z, reason: collision with root package name */
        public final u<InterfaceC28373a> f277295z;

        /* renamed from: z0, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f277296z0;

        /* compiled from: DaggerServiceBookingItemDetailsComponent.java */
        public static final class a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking_details.di.d f277297a;

            public a(com.avito.android.service_booking_details.di.d dVar) {
                this.f277297a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f277297a.i();
                dagger.internal.t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerServiceBookingItemDetailsComponent.java */
        /* renamed from: com.avito.android.service_booking_details.di.b$c$b, reason: collision with other inner class name */
        public static final class C8237b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking_details.di.d f277298a;

            public C8237b(com.avito.android.service_booking_details.di.d dVar) {
                this.f277298a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f277298a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerServiceBookingItemDetailsComponent.java */
        /* renamed from: com.avito.android.service_booking_details.di.b$c$c, reason: collision with other inner class name */
        public static final class C8238c implements u<SK0.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking_details.di.d f277299a;

            public C8238c(com.avito.android.service_booking_details.di.d dVar) {
                this.f277299a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                SK0.b bVarP = this.f277299a.p();
                dagger.internal.t.c(bVarP);
                return bVarP;
            }
        }

        /* compiled from: DaggerServiceBookingItemDetailsComponent.java */
        public static final class d implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f277300a;

            public d(cv.b bVar) {
                this.f277300a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f277300a.u4();
                dagger.internal.t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerServiceBookingItemDetailsComponent.java */
        public static final class e implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking_details.di.d f277301a;

            public e(com.avito.android.service_booking_details.di.d dVar) {
                this.f277301a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f277301a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerServiceBookingItemDetailsComponent.java */
        public static final class f implements u<InterfaceC13182a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking_details.di.d f277302a;

            public f(com.avito.android.service_booking_details.di.d dVar) {
                this.f277302a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC13182a interfaceC13182aU4 = this.f277302a.U4();
                dagger.internal.t.c(interfaceC13182aU4);
                return interfaceC13182aU4;
            }
        }

        /* compiled from: DaggerServiceBookingItemDetailsComponent.java */
        public static final class g implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking_details.di.d f277303a;

            public g(com.avito.android.service_booking_details.di.d dVar) {
                this.f277303a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f277303a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerServiceBookingItemDetailsComponent.java */
        public static final class h implements u<B2> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking_details.di.d f277304a;

            public h(com.avito.android.service_booking_details.di.d dVar) {
                this.f277304a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f277304a.S0();
            }
        }

        /* compiled from: DaggerServiceBookingItemDetailsComponent.java */
        public static final class i implements u<InterfaceC14839a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking_details.di.d f277305a;

            public i(com.avito.android.service_booking_details.di.d dVar) {
                this.f277305a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14839a interfaceC14839aR4 = this.f277305a.r4();
                dagger.internal.t.c(interfaceC14839aR4);
                return interfaceC14839aR4;
            }
        }

        /* compiled from: DaggerServiceBookingItemDetailsComponent.java */
        public static final class j implements u<com.avito.android.server_time.j> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking_details.di.d f277306a;

            public j(com.avito.android.service_booking_details.di.d dVar) {
                this.f277306a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.j jVarN1 = this.f277306a.N1();
                dagger.internal.t.c(jVarN1);
                return jVarN1;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.service_booking_details.di.d dVar, cv.b bVar, Activity activity, C28478k c28478k, String str, Resources resources, Y41.l lVar, a aVar) {
            this.f277245a = dVar;
            this.f277247b = resources;
            this.f277249c = bVar;
            this.f277251d = new f(dVar);
            h hVar = new h(dVar);
            this.f277253e = hVar;
            u<com.avito.android.service_booking_common.g> uVarD = dagger.internal.g.d(new com.avito.android.service_booking_common.i(hVar));
            this.f277255f = uVarD;
            j jVar = new j(dVar);
            this.f277257g = jVar;
            this.f277259h = dagger.internal.g.d(new C47721c(uVarD, jVar, this.f277253e));
            this.f277261i = dagger.internal.l.a(resources);
            u<InterfaceC35945t1<Long>> uVarD2 = dagger.internal.g.d(new m(this.f277257g));
            this.f277263j = uVarD2;
            u<com.avito.android.service_booking_common.n> uVarD3 = dagger.internal.g.d(new com.avito.android.service_booking_common.p(this.f277261i, uVarD2));
            this.f277265k = uVarD3;
            u<InterfaceC47722d> uVarD4 = dagger.internal.g.d(new C47724f(uVarD3, this.f277253e, this.f277259h));
            this.f277267l = uVarD4;
            u<com.avito.android.service_booking_details.domain.g> uVarD5 = dagger.internal.g.d(new com.avito.android.service_booking_details.domain.i(uVarD4, this.f277253e));
            this.f277269m = uVarD5;
            e eVar = new e(dVar);
            this.f277271n = eVar;
            this.f277273o = dagger.internal.g.d(new com.avito.android.service_booking_details.domain.c(uVarD5, this.f277251d, eVar));
            dagger.internal.l lVarA = dagger.internal.l.a(str);
            this.f277275p = lVarA;
            this.f277277q = new com.avito.android.service_booking_details.mvi.k(lVarA, this.f277273o);
            this.f277281s = dagger.internal.g.d(new com.avito.android.service_booking_details.domain.f(new i(dVar), this.f277271n));
            this.f277283t = new d(bVar);
            u<com.avito.android.service_booking_details.l> uVarD6 = dagger.internal.g.d(com.avito.android.service_booking_details.n.a());
            this.f277285u = uVarD6;
            this.f277287v = new com.avito.android.service_booking_details.mvi.i(this.f277275p, uVarD6, this.f277273o, this.f277281s, this.f277283t);
            u<SharedPreferences> uVarD7 = dagger.internal.g.d(new k(dagger.internal.l.a(activity)));
            this.f277289w = uVarD7;
            u<com.avito.android.service_booking_details.domain.preferences.a> uVarD8 = dagger.internal.g.d(new com.avito.android.service_booking_details.domain.preferences.c(uVarD7));
            this.f277291x = uVarD8;
            this.f277293y = new p(uVarD8);
            u<com.avito.android.service_booking_details.mvi.a> uVarD9 = dagger.internal.g.d(new com.avito.android.service_booking_details.mvi.c(this.f277275p, new C8237b(dVar)));
            this.f277214A = uVarD9;
            this.f277216B = new r(uVarD9);
            this.f277218C = new g(dVar);
            u<ScreenPerformanceTracker> uVarD10 = com.avito.android.actions_sheet.a.D(dagger.internal.l.a(c28478k), this.f277218C);
            this.f277220D = uVarD10;
            this.f277222E = new t(new com.avito.android.service_booking_details.mvi.n(this.f277277q, this.f277287v, this.f277293y, this.f277216B, uVarD10));
            dagger.internal.f fVar = new dagger.internal.f();
            this.f277224F = fVar;
            this.f277225G = dagger.internal.g.d(new com.avito.android.service_booking_details.di.j(fVar));
            this.f277226H = new com.avito.android.service_booking_common.blueprints.text_block.b(com.avito.android.service_booking_common.blueprints.text_block.d.a());
            u<com.avito.android.service_booking_common.blueprints.check_price_list.d> uVarD11 = dagger.internal.g.d(o.a());
            this.f277227I = uVarD11;
            this.f277228J = new com.avito.android.service_booking_common.blueprints.check_price_list.b(uVarD11);
            this.f277229K = new com.avito.android.service_booking_common.blueprints.price_list.b(com.avito.android.service_booking_common.blueprints.price_list.d.a());
            u<com.avito.android.service_booking_common.blueprints.input.d> uVarD12 = dagger.internal.g.d(com.avito.android.service_booking_common.blueprints.input.i.a());
            this.f277230L = uVarD12;
            this.f277231M = new com.avito.android.service_booking_common.blueprints.input.b(uVarD12);
            this.f277232N = dagger.internal.g.d(com.avito.android.service_booking_common.blueprints.date.date_list.i.a());
            u<com.avito.android.service_booking_common.blueprints.date.timeslot_list.d> uVarA = B.a(com.avito.android.service_booking_common.blueprints.date.timeslot_list.h.a());
            this.f277233O = uVarA;
            this.f277234P = dagger.internal.g.d(new com.avito.android.service_booking_common.blueprints.date.l(uVarA, this.f277232N));
            this.f277235Q = new dagger.internal.f();
            u<com.avito.konveyor.a> uVarD13 = dagger.internal.g.d(new com.avito.android.service_booking_common.di.r(new com.avito.android.service_booking_common.blueprints.date.date_list.b(this.f277257g, this.f277232N)));
            this.f277236R = uVarD13;
            this.f277237S = dagger.internal.g.d(new com.avito.android.service_booking_common.di.l(uVarD13));
            this.f277238T = dagger.internal.g.d(com.avito.android.service_booking_common.di.n.a());
            u<com.avito.android.recycler.data_aware.a> uVarD14 = dagger.internal.g.d(com.avito.android.service_booking_common.di.m.a());
            this.f277239U = uVarD14;
            u<com.avito.android.recycler.data_aware.e> uVarD15 = dagger.internal.g.d(new q(uVarD14, this.f277238T));
            this.f277240V = uVarD15;
            u<com.avito.konveyor.adapter.a> uVarD16 = dagger.internal.g.d(new com.avito.android.service_booking_common.di.o(this.f277235Q, uVarD15, this.f277237S));
            this.f277241W = uVarD16;
            dagger.internal.f.a(this.f277235Q, dagger.internal.g.d(new s(uVarD16, this.f277236R)));
            this.f277242X = new dagger.internal.f();
            u<InterfaceC35945t1<Long>> uVarA2 = B.a(new com.avito.android.service_booking_common.di.E(this.f277257g));
            this.f277243Y = uVarA2;
            u<com.avito.konveyor.a> uVarA3 = B.a(new com.avito.android.service_booking_common.di.C(new com.avito.android.service_booking_common.blueprints.date.timeslot_list.b(uVarA2, this.f277233O)));
            this.f277244Z = uVarA3;
            this.f277246a0 = B.a(new x(uVarA3));
            this.f277248b0 = B.a(z.a());
            u<com.avito.android.recycler.data_aware.a> uVarA4 = B.a(y.a());
            this.f277250c0 = uVarA4;
            u<com.avito.android.recycler.data_aware.e> uVarA5 = B.a(new com.avito.android.service_booking_common.di.B(uVarA4, this.f277248b0));
            this.f277252d0 = uVarA5;
            u<com.avito.konveyor.adapter.a> uVarA6 = B.a(new A(this.f277242X, uVarA5, this.f277246a0));
            this.f277254e0 = uVarA6;
            dagger.internal.f.a(this.f277242X, B.a(new D(uVarA6, this.f277244Z)));
            u<InterfaceC35945t1<Long>> uVarD17 = dagger.internal.g.d(new com.avito.android.service_booking_common.di.p(this.f277257g));
            this.f277256f0 = uVarD17;
            this.f277258g0 = new com.avito.android.service_booking_common.blueprints.date.b(this.f277234P, this.f277235Q, this.f277241W, this.f277242X, this.f277254e0, uVarD17, new com.avito.android.service_booking_common.blueprints.date.date_list.d(this.f277261i));
            this.f277260h0 = new com.avito.android.service_booking_common.blueprints.offer.g(this.f277271n);
            this.f277262i0 = new com.avito.android.service_booking_common.blueprints.offer.b(this.f277260h0);
            u<com.avito.android.service_booking_common.blueprints.contact.d> uVarD18 = dagger.internal.g.d(com.avito.android.service_booking_common.blueprints.contact.i.a());
            this.f277264j0 = uVarD18;
            this.f277266k0 = new com.avito.android.service_booking_common.blueprints.contact.b(uVarD18);
            u<com.avito.android.service_booking_common.blueprints.comment.d> uVarD19 = dagger.internal.g.d(com.avito.android.service_booking_common.blueprints.comment.g.a());
            this.f277268l0 = uVarD19;
            this.f277270m0 = new com.avito.android.service_booking_common.blueprints.comment.b(uVarD19);
            u<com.avito.android.service_booking_common.blueprints.specialist.c> uVarD20 = dagger.internal.g.d(com.avito.android.service_booking_common.blueprints.specialist.e.a());
            this.f277272n0 = uVarD20;
            this.f277274o0 = new com.avito.android.service_booking_common.blueprints.specialist.b(uVarD20);
            u<com.avito.android.service_booking_common.blueprints.any_specialist.c> uVarD21 = dagger.internal.g.d(com.avito.android.service_booking_common.blueprints.any_specialist.e.a());
            this.f277276p0 = uVarD21;
            this.f277278q0 = new com.avito.android.service_booking_common.blueprints.any_specialist.b(uVarD21);
            u<com.avito.android.service_booking_common.blueprints.partner_logo.c> uVarD22 = dagger.internal.g.d(com.avito.android.service_booking_common.blueprints.partner_logo.e.a());
            this.f277280r0 = uVarD22;
            this.f277282s0 = new com.avito.android.service_booking_common.blueprints.partner_logo.b(uVarD22);
            u<com.avito.android.service_booking_common.blueprints.geo_reference.c> uVarD23 = dagger.internal.g.d(new com.avito.android.service_booking_common.blueprints.geo_reference.f(dagger.internal.l.a(lVar)));
            this.f277284t0 = uVarD23;
            this.f277286u0 = new com.avito.android.service_booking_common.blueprints.geo_reference.b(uVarD23);
            u<com.avito.android.service_booking_common.blueprints.info_banner.c> uVarD24 = dagger.internal.g.d(com.avito.android.service_booking_common.blueprints.info_banner.e.a());
            this.f277288v0 = uVarD24;
            u<com.avito.konveyor.a> uVarD25 = dagger.internal.g.d(new com.avito.android.service_booking_common.di.u(this.f277226H, this.f277228J, this.f277229K, this.f277231M, this.f277258g0, this.f277262i0, this.f277266k0, this.f277270m0, this.f277274o0, this.f277278q0, this.f277282s0, this.f277286u0, new com.avito.android.service_booking_common.blueprints.info_banner.b(uVarD24)));
            this.f277290w0 = uVarD25;
            this.f277292x0 = dagger.internal.g.d(new com.avito.android.service_booking_details.di.g(uVarD25));
            u<com.avito.android.recycler.data_aware.e> uVarD26 = dagger.internal.g.d(new com.avito.android.service_booking_details.di.i(com.avito.android.service_booking_common.k.a(), com.avito.android.service_booking_common.m.a()));
            this.f277294y0 = uVarD26;
            u<com.avito.konveyor.adapter.a> uVarD27 = dagger.internal.g.d(new com.avito.android.service_booking_details.di.h(uVarD26, this.f277225G, this.f277292x0));
            this.f277296z0 = uVarD27;
            dagger.internal.f.a(this.f277224F, dagger.internal.g.d(new l(uVarD27, this.f277290w0)));
            u<com.avito.android.service_booking_common.blueprints.offer.d> uVarD28 = dagger.internal.g.d(this.f277260h0);
            this.f277215A0 = uVarD28;
            this.f277217B0 = dagger.internal.g.d(new v(uVarD28, this.f277227I, this.f277234P, this.f277230L, this.f277264j0, this.f277268l0, this.f277272n0, this.f277276p0, this.f277280r0, this.f277284t0));
            this.f277219C0 = new a(dVar);
            this.f277223E0 = dagger.internal.g.d(new com.avito.android.service_booking_utils.ux_feedback.d(this.f277219C0, new C8238c(dVar)));
        }

        @Override // com.avito.android.service_booking_details.di.c
        public final void a(ServiceBookingItemDetailsActivity serviceBookingItemDetailsActivity) {
            serviceBookingItemDetailsActivity.f277178m = this.f277222E;
            serviceBookingItemDetailsActivity.f277180o = this.f277220D.get();
            serviceBookingItemDetailsActivity.f277181p = (com.avito.konveyor.adapter.j) this.f277224F.get();
            serviceBookingItemDetailsActivity.f277182q = this.f277296z0.get();
            com.avito.android.service_booking_details.di.d dVar = this.f277245a;
            com.avito.android.util.text.a aVarE = dVar.e();
            dagger.internal.t.c(aVarE);
            serviceBookingItemDetailsActivity.f277183r = aVarE;
            R0 r0C = dVar.c();
            dagger.internal.t.c(r0C);
            serviceBookingItemDetailsActivity.f277184s = r0C;
            serviceBookingItemDetailsActivity.f277185t = new com.avito.android.service_booking_details.j(this.f277247b);
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f277249c.u4();
            dagger.internal.t.c(aVarU4);
            serviceBookingItemDetailsActivity.f277186u = aVarU4;
            InterfaceC28373a interfaceC28373aA = dVar.a();
            dagger.internal.t.c(interfaceC28373aA);
            serviceBookingItemDetailsActivity.f277187v = interfaceC28373aA;
            dagger.internal.z zVar = new dagger.internal.z(1);
            zVar.b(this.f277217B0.get());
            serviceBookingItemDetailsActivity.f277188w = zVar.c();
            serviceBookingItemDetailsActivity.f277189x = this.f277223E0.get();
            dVar.S0();
            serviceBookingItemDetailsActivity.f277190y = this.f277285u.get();
            Application applicationK = dVar.k();
            dagger.internal.t.c(applicationK);
            C49228b.f440688b.getClass();
            serviceBookingItemDetailsActivity.f277191z = new V(C49228b.a.a(applicationK), new S());
        }
    }

    public static c.a a() {
        return new C8236b();
    }
}
