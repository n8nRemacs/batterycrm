package com.avito.android.str_calendar.seller.last_minute_offer.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.d1;
import com.avito.android.str_calendar.common.models.SelectedDateRange;
import com.avito.android.str_calendar.seller.last_minute_offer.di.b;
import com.avito.android.str_calendar.seller.last_minute_offer.i;
import com.avito.android.str_calendar.seller.last_minute_offer.k;
import com.avito.android.str_calendar.seller.last_minute_offer.mvi.m;
import com.avito.android.str_calendar.seller.last_minute_offer.mvi.n;
import com.avito.android.str_calendar.seller.last_minute_offer.mvi.p;
import com.avito.android.str_calendar.seller.last_minute_offer.o;
import com.avito.android.str_calendar.seller.last_minute_offer.ui.LastMinuteOfferFragment;
import com.avito.android.util.R0;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerLastMinuteOfferComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerLastMinuteOfferComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.str_calendar.seller.last_minute_offer.di.b.a
        public final com.avito.android.str_calendar.seller.last_minute_offer.di.b a(com.avito.android.str_calendar.seller.last_minute_offer.di.c cVar, com.avito.android.str_calendar.seller.core.di.c cVar2, r rVar, SelectedDateRange selectedDateRange, String str) {
            return new c(cVar, cVar2, rVar, selectedDateRange, str, null);
        }
    }

    /* compiled from: DaggerLastMinuteOfferComponent.java */
    public static final class c implements com.avito.android.str_calendar.seller.last_minute_offer.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.str_calendar.seller.core.di.c f287859a;

        /* renamed from: b, reason: collision with root package name */
        public final u<d1> f287860b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f287861c;

        /* renamed from: d, reason: collision with root package name */
        public final l f287862d;

        /* renamed from: e, reason: collision with root package name */
        public final l f287863e;

        /* renamed from: f, reason: collision with root package name */
        public final u<k> f287864f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.str_calendar.seller.last_minute_offer.b> f287865g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.str_calendar.seller.last_minute_offer.mvi.f f287866h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.str_calendar.seller.last_minute_offer.mvi.d f287867i;

        /* renamed from: j, reason: collision with root package name */
        public final u<n> f287868j;

        /* renamed from: k, reason: collision with root package name */
        public final m f287869k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC28481c> f287870l;

        /* renamed from: m, reason: collision with root package name */
        public final u<C28478k> f287871m;

        /* renamed from: n, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f287872n;

        /* renamed from: o, reason: collision with root package name */
        public final o f287873o;

        /* compiled from: DaggerLastMinuteOfferComponent.java */
        /* renamed from: com.avito.android.str_calendar.seller.last_minute_offer.di.a$c$a, reason: collision with other inner class name */
        public static final class C8649a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_calendar.seller.last_minute_offer.di.c f287874a;

            public C8649a(com.avito.android.str_calendar.seller.last_minute_offer.di.c cVar) {
                this.f287874a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f287874a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerLastMinuteOfferComponent.java */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_calendar.seller.last_minute_offer.di.c f287875a;

            public b(com.avito.android.str_calendar.seller.last_minute_offer.di.c cVar) {
                this.f287875a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f287875a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerLastMinuteOfferComponent.java */
        /* renamed from: com.avito.android.str_calendar.seller.last_minute_offer.di.a$c$c, reason: collision with other inner class name */
        public static final class C8650c implements u<d1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_calendar.seller.last_minute_offer.di.c f287876a;

            public C8650c(com.avito.android.str_calendar.seller.last_minute_offer.di.c cVar) {
                this.f287876a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                d1 d1VarA0 = this.f287876a.a0();
                t.c(d1VarA0);
                return d1VarA0;
            }
        }

        public c(com.avito.android.str_calendar.seller.last_minute_offer.di.c cVar, com.avito.android.str_calendar.seller.core.di.c cVar2, r rVar, SelectedDateRange selectedDateRange, String str, C8648a c8648a) {
            this.f287859a = cVar2;
            this.f287860b = new C8650c(cVar);
            this.f287861c = new b(cVar);
            this.f287862d = l.a(str);
            this.f287863e = l.a(selectedDateRange);
            u<k> uVarD = g.d(com.avito.android.str_calendar.seller.last_minute_offer.m.a());
            this.f287864f = uVarD;
            u<com.avito.android.str_calendar.seller.last_minute_offer.b> uVarD2 = g.d(new i(this.f287862d, this.f287863e, uVarD, this.f287860b, this.f287861c));
            this.f287865g = uVarD2;
            this.f287866h = new com.avito.android.str_calendar.seller.last_minute_offer.mvi.f(uVarD2);
            this.f287867i = new com.avito.android.str_calendar.seller.last_minute_offer.mvi.d(uVarD2);
            u<n> uVarD3 = g.d(p.a());
            this.f287868j = uVarD3;
            this.f287869k = new m(uVarD3);
            this.f287870l = new C8649a(cVar);
            u<C28478k> uVarD4 = g.d(new e(l.a(rVar)));
            this.f287871m = uVarD4;
            this.f287872n = g.d(new f(uVarD4, this.f287870l));
            this.f287873o = new o(new com.avito.android.str_calendar.seller.last_minute_offer.mvi.i(this.f287866h, this.f287867i, com.avito.android.str_calendar.seller.last_minute_offer.mvi.k.a(), this.f287869k, this.f287872n));
        }

        @Override // com.avito.android.str_calendar.seller.last_minute_offer.di.b
        public final void a(LastMinuteOfferFragment lastMinuteOfferFragment) {
            lastMinuteOfferFragment.f287980n0 = this.f287873o;
            lastMinuteOfferFragment.f287982p0 = this.f287872n.get();
            com.avito.android.str_calendar.seller.core.c cVarZb = this.f287859a.zb();
            t.c(cVarZb);
            lastMinuteOfferFragment.f287983q0 = cVarZb;
        }
    }

    public static b.a a() {
        return new b();
    }
}
