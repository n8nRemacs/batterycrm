package com.avito.android.service_booking.mvi.di;

import Gt0.InterfaceC13916a;
import Ks0.InterfaceC14347a;
import android.content.res.Resources;
import com.avito.android.B2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.service_booking.BookingFlow;
import com.avito.android.service_booking.BookingFlowSource;
import com.avito.android.service_booking.mvi.ServiceBookingMviActivity;
import com.avito.android.service_booking.mvi.di.q;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import mV0.C44020b;
import ys0.InterfaceC50295f;

/* compiled from: DaggerServiceBookingMviComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class c {

    /* compiled from: DaggerServiceBookingMviComponent.java */
    public static final class b implements q.a {
        public b() {
        }

        @Override // com.avito.android.service_booking.mvi.di.q.a
        public final q a(String str, String str2, String str3, String str4, String str5, BookingFlow bookingFlow, BookingFlowSource bookingFlowSource, Resources resources, C28478k c28478k, r rVar, InterfaceC39417a interfaceC39417a) {
            bookingFlowSource.getClass();
            interfaceC39417a.getClass();
            return new C8147c(rVar, interfaceC39417a, str, str2, str3, str4, str5, bookingFlow, bookingFlowSource, resources, c28478k, null);
        }
    }

    /* compiled from: DaggerServiceBookingMviComponent.java */
    /* renamed from: com.avito.android.service_booking.mvi.di.c$c, reason: collision with other inner class name */
    public static final class C8147c implements q {

        /* renamed from: a, reason: collision with root package name */
        public final r f274318a;

        /* renamed from: b, reason: collision with root package name */
        public final BookingFlow f274319b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f274320c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.l f274321d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.l f274322e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.l f274323f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.l f274324g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f274325h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC50295f> f274326i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.l f274327j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.server_time.j> f274328k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35945t1<Long>> f274329l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_common.n> f274330m;

        /* renamed from: n, reason: collision with root package name */
        public final com.avito.android.service_booking.mvi.navigation.mvi.e f274331n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.service_booking.mvi.f f274332o;

        /* compiled from: DaggerServiceBookingMviComponent.java */
        /* renamed from: com.avito.android.service_booking.mvi.di.c$c$a */
        public static final class a implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final r f274333a;

            public a(r rVar) {
                this.f274333a = rVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f274333a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerServiceBookingMviComponent.java */
        /* renamed from: com.avito.android.service_booking.mvi.di.c$c$b */
        public static final class b implements dagger.internal.u<com.avito.android.server_time.j> {

            /* renamed from: a, reason: collision with root package name */
            public final r f274334a;

            public b(r rVar) {
                this.f274334a = rVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.j jVarN1 = this.f274334a.N1();
                dagger.internal.t.c(jVarN1);
                return jVarN1;
            }
        }

        public C8147c(r rVar, cv.b bVar, String str, String str2, String str3, String str4, String str5, BookingFlow bookingFlow, BookingFlowSource bookingFlowSource, Resources resources, C28478k c28478k, a aVar) {
            this.f274318a = rVar;
            this.f274319b = bookingFlow;
            this.f274320c = dagger.internal.l.b(str2);
            this.f274321d = dagger.internal.l.b(str5);
            this.f274322e = dagger.internal.l.b(str3);
            this.f274323f = dagger.internal.l.b(str4);
            this.f274324g = dagger.internal.l.a(bookingFlow);
            this.f274326i = dagger.internal.g.d(new t(this.f274320c, this.f274321d, this.f274322e, this.f274323f, this.f274324g, dagger.internal.l.a(bookingFlowSource), new a(rVar)));
            this.f274327j = dagger.internal.l.a(resources);
            dagger.internal.u<InterfaceC35945t1<Long>> uVarD = dagger.internal.g.d(new u(new b(rVar)));
            this.f274329l = uVarD;
            this.f274330m = dagger.internal.g.d(new com.avito.android.service_booking_common.p(this.f274327j, uVarD));
            this.f274331n = new com.avito.android.service_booking.mvi.navigation.mvi.e(dagger.internal.l.a(str));
            this.f274332o = new com.avito.android.service_booking.mvi.f(new com.avito.android.service_booking.mvi.navigation.mvi.h(com.avito.android.service_booking.mvi.navigation.mvi.c.a(), this.f274331n, com.avito.android.service_booking.mvi.navigation.mvi.n.a(), com.avito.android.service_booking.mvi.navigation.mvi.j.a()));
        }

        @Override // com.avito.android.service_booking.mvi.step.di.c
        public final InterfaceC14347a F6() {
            InterfaceC14347a interfaceC14347aF6 = this.f274318a.F6();
            dagger.internal.t.c(interfaceC14347aF6);
            return interfaceC14347aF6;
        }

        @Override // com.avito.android.service_booking.mvi.step.di.c
        public final BookingFlow Mh() {
            return this.f274319b;
        }

        @Override // com.avito.android.service_booking.mvi.step.di.c
        public final com.avito.android.server_time.j N1() {
            com.avito.android.server_time.j jVarN1 = this.f274318a.N1();
            dagger.internal.t.c(jVarN1);
            return jVarN1;
        }

        @Override // com.avito.android.service_booking.mvi.step.di.c
        public final B2 S0() {
            return this.f274318a.S0();
        }

        @Override // com.avito.android.service_booking.mvi.step.di.c
        public final InterfaceC28481c b() {
            InterfaceC28481c interfaceC28481cB = this.f274318a.b();
            dagger.internal.t.c(interfaceC28481cB);
            return interfaceC28481cB;
        }

        @Override // com.avito.android.service_booking.mvi.step.di.c
        public final R0 c() {
            R0 r0C = this.f274318a.c();
            dagger.internal.t.c(r0C);
            return r0C;
        }

        @Override // com.avito.android.service_booking.mvi.di.q
        public final void ii(ServiceBookingMviActivity serviceBookingMviActivity) {
            serviceBookingMviActivity.f274299n = this.f274332o;
            R0 r0C = this.f274318a.c();
            dagger.internal.t.c(r0C);
            serviceBookingMviActivity.f274304s = r0C;
        }

        @Override // com.avito.android.service_booking.mvi.step.di.c
        public final InterfaceC13916a j7() {
            InterfaceC13916a interfaceC13916aJ7 = this.f274318a.j7();
            dagger.internal.t.c(interfaceC13916aJ7);
            return interfaceC13916aJ7;
        }

        @Override // com.avito.android.service_booking.mvi.di.q
        public final com.avito.android.service_booking.mvi.f n9() {
            return this.f274332o;
        }

        @Override // com.avito.android.service_booking.mvi.step.di.c
        public final com.avito.android.service_booking_common.n nb() {
            return this.f274330m.get();
        }

        @Override // com.avito.android.service_booking.mvi.step.di.c
        public final C44020b x7() {
            C44020b c44020bX7 = this.f274318a.x7();
            dagger.internal.t.c(c44020bX7);
            return c44020bX7;
        }

        @Override // com.avito.android.service_booking.mvi.step.di.c
        public final InterfaceC50295f y7() {
            return this.f274326i.get();
        }
    }

    public static q.a a() {
        return new b();
    }
}
