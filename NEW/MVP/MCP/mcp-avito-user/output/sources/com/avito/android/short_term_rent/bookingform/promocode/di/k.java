package com.avito.android.short_term_rent.bookingform.promocode.di;

import Y41.l;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.d1;
import com.avito.android.short_term_rent.bookingform.promocode.BookingFormPromoCodeDialogFragment;
import com.avito.android.short_term_rent.bookingform.promocode.BookingFormPromoCodeDialogFragmentOpenParams;
import com.avito.android.short_term_rent.bookingform.promocode.di.a;
import com.avito.android.short_term_rent.bookingform.promocode.mvi.m;
import com.avito.android.short_term_rent.bookingform.promocode.mvi.o;
import com.avito.android.short_term_rent.bookingform.promocode.mvi.s;
import com.avito.android.util.R0;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.u;
import ew0.InterfaceC40169c;
import kotlin.G0;

/* compiled from: DaggerBookingFormPromoCodeComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class k {

    /* compiled from: DaggerBookingFormPromoCodeComponent.java */
    public static final class b implements com.avito.android.short_term_rent.bookingform.promocode.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.short_term_rent.bookingform.promocode.mvi.j f282114a;

        /* renamed from: b, reason: collision with root package name */
        public final u<d1> f282115b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f282116c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.short_term_rent.bookingform.promocode.mvi.h f282117d;

        /* renamed from: e, reason: collision with root package name */
        public final s f282118e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28481c> f282119f;

        /* renamed from: g, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f282120g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.short_term_rent.bookingform.promocode.d f282121h;

        /* renamed from: i, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f282122i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f282123j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f282124k;

        /* compiled from: DaggerBookingFormPromoCodeComponent.java */
        public static final class a implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.short_term_rent.bookingform.promocode.di.b f282125a;

            public a(com.avito.android.short_term_rent.bookingform.promocode.di.b bVar) {
                this.f282125a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f282125a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerBookingFormPromoCodeComponent.java */
        /* renamed from: com.avito.android.short_term_rent.bookingform.promocode.di.k$b$b, reason: collision with other inner class name */
        public static final class C8418b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.short_term_rent.bookingform.promocode.di.b f282126a;

            public C8418b(com.avito.android.short_term_rent.bookingform.promocode.di.b bVar) {
                this.f282126a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f282126a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerBookingFormPromoCodeComponent.java */
        public static final class c implements u<d1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.short_term_rent.bookingform.promocode.di.b f282127a;

            public c(com.avito.android.short_term_rent.bookingform.promocode.di.b bVar) {
                this.f282127a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                d1 d1VarA0 = this.f282127a.a0();
                t.c(d1VarA0);
                return d1VarA0;
            }
        }

        public b() {
            throw null;
        }

        public b(com.avito.android.short_term_rent.bookingform.promocode.di.b bVar, BookingFormPromoCodeDialogFragmentOpenParams bookingFormPromoCodeDialogFragmentOpenParams, r rVar, l lVar, a aVar) {
            this.f282114a = new com.avito.android.short_term_rent.bookingform.promocode.mvi.j(dagger.internal.l.a(bookingFormPromoCodeDialogFragmentOpenParams));
            this.f282117d = new com.avito.android.short_term_rent.bookingform.promocode.mvi.h(new com.avito.android.short_term_rent.bookingform.promocode.mvi.c(new c(bVar), new a(bVar)));
            this.f282118e = new s(com.avito.android.short_term_rent.bookingform.promocode.mvi.u.a());
            this.f282119f = new C8418b(bVar);
            this.f282120g = dagger.internal.g.d(new j(dagger.internal.l.a(rVar), this.f282119f));
            this.f282121h = new com.avito.android.short_term_rent.bookingform.promocode.d(new m(this.f282114a, this.f282117d, o.a(), this.f282118e, this.f282120g));
            this.f282122i = dagger.internal.g.d(new com.avito.android.short_term_rent.bookingform.promocode.promocodeitem.b(new com.avito.android.short_term_rent.bookingform.promocode.promocodeitem.k(dagger.internal.l.a(lVar))));
            A.b bVarA = A.a(1, 0);
            bVarA.f393937a.add(this.f282122i);
            this.f282123j = dagger.internal.g.d(new h(bVarA.b()));
            this.f282124k = dagger.internal.g.d(new g(this.f282123j, new com.avito.android.short_term_rent.bookingform.promocode.promocodeitem.d(com.avito.android.short_term_rent.bookingform.promocode.promocodeitem.g.a())));
        }

        @Override // com.avito.android.short_term_rent.bookingform.promocode.di.a
        public final void a(BookingFormPromoCodeDialogFragment bookingFormPromoCodeDialogFragment) {
            bookingFormPromoCodeDialogFragment.f282048i0 = this.f282121h;
            bookingFormPromoCodeDialogFragment.f282050k0 = this.f282120g.get();
            bookingFormPromoCodeDialogFragment.f282051l0 = this.f282124k.get();
        }
    }

    /* compiled from: DaggerBookingFormPromoCodeComponent.java */
    public static final class c implements a.InterfaceC8417a {
        public c() {
        }

        @Override // com.avito.android.short_term_rent.bookingform.promocode.di.a.InterfaceC8417a
        public final com.avito.android.short_term_rent.bookingform.promocode.di.a a(BookingFormPromoCodeDialogFragmentOpenParams bookingFormPromoCodeDialogFragmentOpenParams, r rVar, l<? super InterfaceC40169c, G0> lVar, com.avito.android.short_term_rent.bookingform.promocode.di.b bVar) {
            return new b(bVar, bookingFormPromoCodeDialogFragmentOpenParams, rVar, lVar, null);
        }
    }

    public static a.InterfaceC8417a a() {
        return new c();
    }
}
