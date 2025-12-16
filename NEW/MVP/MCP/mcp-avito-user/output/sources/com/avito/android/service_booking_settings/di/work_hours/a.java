package com.avito.android.service_booking_settings.di.work_hours;

import Qt0.InterfaceC14932a;
import St0.C15223c;
import St0.InterfaceC15221a;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.recyclerview.widget.C;
import androidx.view.S0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.service_booking_settings.di.work_hours.b;
import com.avito.android.service_booking_settings.di.work_hours.o;
import com.avito.android.service_booking_settings.domain.converters.r;
import com.avito.android.service_booking_settings.domain.converters.s;
import com.avito.android.service_booking_settings.work_hours.ServiceBookingWorkHoursArgument;
import com.avito.android.service_booking_settings.work_hours.ServiceBookingWorkHoursFragment;
import com.avito.android.service_booking_settings.work_hours.h;
import com.avito.android.service_booking_settings.work_hours.item.schedule.h;
import com.avito.android.service_booking_settings.work_hours.v;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;

/* compiled from: DaggerServiceBookingWorkHoursComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerServiceBookingWorkHoursComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.service_booking_settings.di.work_hours.b.a
        public final com.avito.android.service_booking_settings.di.work_hours.b a(Context context, S0 s02, ServiceBookingWorkHoursArgument serviceBookingWorkHoursArgument, ServiceBookingWorkHoursFragment serviceBookingWorkHoursFragment, ServiceBookingWorkHoursFragment serviceBookingWorkHoursFragment2, ServiceBookingWorkHoursFragment serviceBookingWorkHoursFragment3, InterfaceC39417a interfaceC39417a, d dVar, C28478k c28478k) {
            serviceBookingWorkHoursArgument.getClass();
            interfaceC39417a.getClass();
            return new c(dVar, interfaceC39417a, context, s02, serviceBookingWorkHoursArgument, serviceBookingWorkHoursFragment, serviceBookingWorkHoursFragment2, serviceBookingWorkHoursFragment3, c28478k, null);
        }
    }

    /* compiled from: DaggerServiceBookingWorkHoursComponent.java */
    public static final class c implements com.avito.android.service_booking_settings.di.work_hours.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f277784A;

        /* renamed from: B, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f277785B;

        /* renamed from: C, reason: collision with root package name */
        public final u<com.avito.android.service_booking_settings.work_hours.item.booking_restrictions.a> f277786C;

        /* renamed from: D, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f277787D;

        /* renamed from: E, reason: collision with root package name */
        public final u<com.avito.android.service_booking_settings.work_hours.item.content_description.c> f277788E;

        /* renamed from: F, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f277789F;

        /* renamed from: G, reason: collision with root package name */
        public final u<com.avito.android.service_booking_settings.work_hours.item.schedule_period.c> f277790G;

        /* renamed from: H, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f277791H;

        /* renamed from: I, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f277792I;

        /* renamed from: J, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f277793J;

        /* renamed from: K, reason: collision with root package name */
        public final u<C> f277794K;

        /* renamed from: L, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.h> f277795L;

        /* renamed from: M, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.a> f277796M;

        /* renamed from: N, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.e> f277797N;

        /* renamed from: O, reason: collision with root package name */
        public final u<InterfaceC28481c> f277798O;

        /* renamed from: P, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f277799P;

        /* renamed from: Q, reason: collision with root package name */
        public final dagger.internal.l f277800Q;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f277801a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.service_booking_settings.di.work_hours.d f277802b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC14932a> f277803c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f277804d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.service_booking_settings.domain.converters.g> f277805e = dagger.internal.g.d(com.avito.android.service_booking_settings.domain.converters.i.a());

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC35863o4> f277806f;

        /* renamed from: g, reason: collision with root package name */
        public final u<s> f277807g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.service_booking_settings.domain.converters.p> f277808h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.service_booking_settings.domain.converters.d> f277809i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.l f277810j;

        /* renamed from: k, reason: collision with root package name */
        public final u<SharedPreferences> f277811k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.service_booking_settings.data.preferences.b f277812l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.service_booking_settings.domain.converters.m> f277813m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.service_booking_settings.domain.converters.j> f277814n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.service_booking_settings.domain.converters.a> f277815o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.service_booking_settings.work_hours.mvi.g f277816p;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.service_booking_settings.work_hours.mvi.e f277817q;

        /* renamed from: r, reason: collision with root package name */
        public final u<InterfaceC28373a> f277818r;

        /* renamed from: s, reason: collision with root package name */
        public final u<InterfaceC15221a> f277819s;

        /* renamed from: t, reason: collision with root package name */
        public final com.avito.android.service_booking_settings.work_hours.mvi.n f277820t;

        /* renamed from: u, reason: collision with root package name */
        public final com.avito.android.service_booking_settings.work_hours.f f277821u;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.f f277822v;

        /* renamed from: w, reason: collision with root package name */
        public final u<org.threeten.bp.format.c> f277823w;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.l f277824x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.android.service_booking_settings.work_hours.item.schedule.c> f277825y;

        /* renamed from: z, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f277826z;

        /* compiled from: DaggerServiceBookingWorkHoursComponent.java */
        /* renamed from: com.avito.android.service_booking_settings.di.work_hours.a$c$a, reason: collision with other inner class name */
        public static final class C8250a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking_settings.di.work_hours.d f277827a;

            public C8250a(com.avito.android.service_booking_settings.di.work_hours.d dVar) {
                this.f277827a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f277827a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerServiceBookingWorkHoursComponent.java */
        public static final class b implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking_settings.di.work_hours.d f277828a;

            public b(com.avito.android.service_booking_settings.di.work_hours.d dVar) {
                this.f277828a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f277828a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerServiceBookingWorkHoursComponent.java */
        /* renamed from: com.avito.android.service_booking_settings.di.work_hours.a$c$c, reason: collision with other inner class name */
        public static final class C8251c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking_settings.di.work_hours.d f277829a;

            public C8251c(com.avito.android.service_booking_settings.di.work_hours.d dVar) {
                this.f277829a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f277829a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerServiceBookingWorkHoursComponent.java */
        public static final class d implements u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking_settings.di.work_hours.d f277830a;

            public d(com.avito.android.service_booking_settings.di.work_hours.d dVar) {
                this.f277830a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35863o4 interfaceC35863o4M = this.f277830a.m();
                t.c(interfaceC35863o4M);
                return interfaceC35863o4M;
            }
        }

        /* compiled from: DaggerServiceBookingWorkHoursComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking_settings.di.work_hours.d f277831a;

            public e(com.avito.android.service_booking_settings.di.work_hours.d dVar) {
                this.f277831a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f277831a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerServiceBookingWorkHoursComponent.java */
        public static final class f implements u<InterfaceC14932a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking_settings.di.work_hours.d f277832a;

            public f(com.avito.android.service_booking_settings.di.work_hours.d dVar) {
                this.f277832a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14932a interfaceC14932aHm = this.f277832a.Hm();
                t.c(interfaceC14932aHm);
                return interfaceC14932aHm;
            }
        }

        public c(com.avito.android.service_booking_settings.di.work_hours.d dVar, cv.b bVar, Context context, S0 s02, ServiceBookingWorkHoursArgument serviceBookingWorkHoursArgument, h.c cVar, h.d dVar2, h.b bVar2, C28478k c28478k, C8249a c8249a) {
            this.f277801a = bVar;
            this.f277802b = dVar;
            this.f277803c = new f(dVar);
            this.f277804d = new C8251c(dVar);
            d dVar3 = new d(dVar);
            this.f277806f = dVar3;
            this.f277807g = dagger.internal.g.d(new com.avito.android.service_booking_settings.domain.converters.u(dVar3));
            this.f277808h = dagger.internal.g.d(new r(this.f277806f));
            this.f277809i = dagger.internal.g.d(new com.avito.android.service_booking_settings.domain.converters.f(this.f277806f));
            this.f277810j = dagger.internal.l.a(serviceBookingWorkHoursArgument);
            u<SharedPreferences> uVarD = dagger.internal.g.d(new m(dagger.internal.l.a(context)));
            this.f277811k = uVarD;
            com.avito.android.service_booking_settings.data.preferences.b bVar3 = new com.avito.android.service_booking_settings.data.preferences.b(uVarD);
            this.f277812l = bVar3;
            this.f277813m = dagger.internal.g.d(new com.avito.android.service_booking_settings.domain.converters.o(this.f277810j, bVar3));
            this.f277814n = dagger.internal.g.d(new com.avito.android.service_booking_settings.domain.converters.l(this.f277806f));
            u<com.avito.android.service_booking_settings.domain.converters.a> uVarD2 = dagger.internal.g.d(com.avito.android.service_booking_settings.domain.converters.c.a());
            this.f277815o = uVarD2;
            com.avito.android.service_booking_settings.domain.c cVar2 = new com.avito.android.service_booking_settings.domain.c(this.f277803c, this.f277804d, this.f277805e, this.f277807g, this.f277808h, this.f277809i, this.f277813m, this.f277814n, uVarD2, this.f277812l);
            dagger.internal.l lVar = this.f277810j;
            this.f277816p = new com.avito.android.service_booking_settings.work_hours.mvi.g(cVar2, lVar);
            this.f277817q = new com.avito.android.service_booking_settings.work_hours.mvi.e(cVar2, lVar);
            C8250a c8250a = new C8250a(dVar);
            this.f277818r = c8250a;
            u<InterfaceC15221a> uVarD3 = dagger.internal.g.d(new C15223c(c8250a));
            this.f277819s = uVarD3;
            this.f277820t = new com.avito.android.service_booking_settings.work_hours.mvi.n(this.f277812l, uVarD3, this.f277810j);
            this.f277821u = new com.avito.android.service_booking_settings.work_hours.f(new com.avito.android.service_booking_settings.work_hours.mvi.j(this.f277816p, this.f277817q, com.avito.android.service_booking_settings.work_hours.mvi.l.a(), this.f277820t));
            this.f277822v = new dagger.internal.f();
            this.f277823w = dagger.internal.g.d(o.a.f277846a);
            this.f277824x = dagger.internal.l.a(cVar);
            this.f277825y = dagger.internal.g.d(new com.avito.android.service_booking_settings.work_hours.item.schedule.g(this.f277824x, dagger.internal.l.a(dVar2)));
            this.f277826z = dagger.internal.g.d(new com.avito.android.service_booking_settings.work_hours.item.schedule.b(dagger.internal.l.a(bVar2), this.f277823w, this.f277818r, this.f277825y));
            this.f277784A = new b(dVar);
            this.f277785B = dagger.internal.g.d(new com.avito.android.service_booking_settings.work_hours.item.license_agreement.b(com.avito.android.service_booking_settings.work_hours.item.license_agreement.d.a(), this.f277784A));
            u<com.avito.android.service_booking_settings.work_hours.item.booking_restrictions.a> uVarD4 = dagger.internal.g.d(com.avito.android.service_booking_settings.work_hours.item.booking_restrictions.e.a());
            this.f277786C = uVarD4;
            this.f277787D = dagger.internal.g.d(new com.avito.android.service_booking_settings.work_hours.item.booking_restrictions.g(uVarD4));
            u<com.avito.android.service_booking_settings.work_hours.item.content_description.c> uVarD5 = dagger.internal.g.d(com.avito.android.service_booking_settings.work_hours.item.content_description.e.a());
            this.f277788E = uVarD5;
            this.f277789F = dagger.internal.g.d(new com.avito.android.service_booking_settings.work_hours.item.content_description.b(uVarD5));
            u<com.avito.android.service_booking_settings.work_hours.item.schedule_period.c> uVarD6 = dagger.internal.g.d(com.avito.android.service_booking_settings.work_hours.item.schedule_period.g.a());
            this.f277790G = uVarD6;
            this.f277791H = dagger.internal.g.d(new com.avito.android.service_booking_settings.work_hours.item.schedule_period.b(uVarD6));
            A.b bVarA = A.a(5, 0);
            u<TV0.b<?, ?>> uVar = this.f277826z;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f277785B);
            list.add(this.f277787D);
            list.add(this.f277789F);
            list.add(this.f277791H);
            u<com.avito.konveyor.a> uVarD7 = dagger.internal.g.d(new k(bVarA.b()));
            this.f277792I = uVarD7;
            u<com.avito.konveyor.adapter.j> uVarD8 = dagger.internal.g.d(new n(this.f277822v, uVarD7));
            this.f277793J = uVarD8;
            this.f277794K = dagger.internal.g.d(new l(uVarD8));
            this.f277795L = dagger.internal.g.d(new h(this.f277792I));
            u<com.avito.android.recycler.data_aware.a> uVarD9 = dagger.internal.g.d(com.avito.android.service_booking_settings.work_hours.item.schedule.o.a());
            this.f277796M = uVarD9;
            u<com.avito.android.recycler.data_aware.e> uVarD10 = dagger.internal.g.d(new j(uVarD9));
            this.f277797N = uVarD10;
            dagger.internal.f.a(this.f277822v, dagger.internal.g.d(new i(uVarD10, this.f277794K, this.f277795L)));
            this.f277798O = new e(dVar);
            this.f277799P = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f277798O);
            this.f277800Q = dagger.internal.l.a(new v(new com.avito.android.service_booking_settings.work_hours.u(this.f277822v, this.f277793J, this.f277786C, this.f277790G)));
        }

        @Override // com.avito.android.service_booking_settings.di.work_hours.b
        public final void a(ServiceBookingWorkHoursFragment serviceBookingWorkHoursFragment) {
            serviceBookingWorkHoursFragment.f277897n0 = this.f277821u;
            serviceBookingWorkHoursFragment.f277899p0 = (com.avito.konveyor.adapter.a) this.f277822v.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f277801a.u4();
            t.c(aVarU4);
            serviceBookingWorkHoursFragment.f277900q0 = aVarU4;
            com.avito.android.service_booking_settings.di.work_hours.d dVar = this.f277802b;
            InterfaceC28373a interfaceC28373aA = dVar.a();
            t.c(interfaceC28373aA);
            serviceBookingWorkHoursFragment.f277901r0 = interfaceC28373aA;
            serviceBookingWorkHoursFragment.f277902s0 = this.f277799P.get();
            com.avito.android.util.text.a aVarE = dVar.e();
            t.c(aVarE);
            serviceBookingWorkHoursFragment.f277903t0 = aVarE;
            serviceBookingWorkHoursFragment.f277904u0 = this.f277786C.get();
            serviceBookingWorkHoursFragment.f277905v0 = this.f277790G.get();
            serviceBookingWorkHoursFragment.f277906w0 = (h.a) this.f277800Q.f393949a;
        }
    }

    public static b.a a() {
        return new b();
    }
}
