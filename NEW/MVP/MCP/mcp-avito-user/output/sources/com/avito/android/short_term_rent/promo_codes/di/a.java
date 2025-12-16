package com.avito.android.short_term_rent.promo_codes.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.d1;
import com.avito.android.short_term_rent.promo_codes.di.b;
import com.avito.android.short_term_rent.promo_codes.mvi.h;
import com.avito.android.short_term_rent.promo_codes.mvi.j;
import com.avito.android.short_term_rent.promo_codes.ui.StrSoftBookingPromoCodesDialogFragment;
import com.avito.android.short_term_rent.promo_codes.ui.StrSoftBookingPromoCodesDialogOpenParams;
import com.avito.android.short_term_rent.utils.m;
import com.avito.android.short_term_rent.utils.o;
import com.avito.android.util.R0;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import kw0.C43506b;
import lw0.C43843c;
import lw0.InterfaceC43841a;

/* compiled from: DaggerStrSoftBookingPromoCodesComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerStrSoftBookingPromoCodesComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.short_term_rent.promo_codes.di.b.a
        public final com.avito.android.short_term_rent.promo_codes.di.b a(r rVar, StrSoftBookingPromoCodesDialogOpenParams strSoftBookingPromoCodesDialogOpenParams, com.avito.android.short_term_rent.promo_codes.di.c cVar) {
            strSoftBookingPromoCodesDialogOpenParams.getClass();
            return new c(cVar, rVar, strSoftBookingPromoCodesDialogOpenParams, null);
        }
    }

    /* compiled from: DaggerStrSoftBookingPromoCodesComponent.java */
    public static final class c implements com.avito.android.short_term_rent.promo_codes.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.short_term_rent.promo_codes.mvi.e f282415a;

        /* renamed from: b, reason: collision with root package name */
        public final u<d1> f282416b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28373a> f282417c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC43841a> f282418d;

        /* renamed from: e, reason: collision with root package name */
        public final u<R0> f282419e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.short_term_rent.promo_codes.mvi.domain.a> f282420f;

        /* renamed from: g, reason: collision with root package name */
        public final u<m> f282421g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.short_term_rent.promo_codes.mvi.c f282422h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f282423i;

        /* renamed from: j, reason: collision with root package name */
        public final u<C28478k> f282424j;

        /* renamed from: k, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f282425k;

        /* renamed from: l, reason: collision with root package name */
        public final C43506b f282426l;

        /* compiled from: DaggerStrSoftBookingPromoCodesComponent.java */
        /* renamed from: com.avito.android.short_term_rent.promo_codes.di.a$c$a, reason: collision with other inner class name */
        public static final class C8431a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.short_term_rent.promo_codes.di.c f282427a;

            public C8431a(com.avito.android.short_term_rent.promo_codes.di.c cVar) {
                this.f282427a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f282427a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerStrSoftBookingPromoCodesComponent.java */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.short_term_rent.promo_codes.di.c f282428a;

            public b(com.avito.android.short_term_rent.promo_codes.di.c cVar) {
                this.f282428a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f282428a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerStrSoftBookingPromoCodesComponent.java */
        /* renamed from: com.avito.android.short_term_rent.promo_codes.di.a$c$c, reason: collision with other inner class name */
        public static final class C8432c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.short_term_rent.promo_codes.di.c f282429a;

            public C8432c(com.avito.android.short_term_rent.promo_codes.di.c cVar) {
                this.f282429a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f282429a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerStrSoftBookingPromoCodesComponent.java */
        public static final class d implements u<d1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.short_term_rent.promo_codes.di.c f282430a;

            public d(com.avito.android.short_term_rent.promo_codes.di.c cVar) {
                this.f282430a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                d1 d1VarA0 = this.f282430a.a0();
                t.c(d1VarA0);
                return d1VarA0;
            }
        }

        public c(com.avito.android.short_term_rent.promo_codes.di.c cVar, r rVar, StrSoftBookingPromoCodesDialogOpenParams strSoftBookingPromoCodesDialogOpenParams, C8430a c8430a) {
            l lVarA = l.a(strSoftBookingPromoCodesDialogOpenParams);
            this.f282415a = new com.avito.android.short_term_rent.promo_codes.mvi.e(lVarA);
            this.f282416b = new d(cVar);
            u<InterfaceC43841a> uVarD = g.d(new C43843c(lVarA, new C8431a(cVar)));
            this.f282418d = uVarD;
            this.f282420f = g.d(new com.avito.android.short_term_rent.promo_codes.mvi.domain.e(uVarD, this.f282416b, new b(cVar)));
            u<m> uVarD2 = g.d(o.a());
            this.f282421g = uVarD2;
            this.f282422h = new com.avito.android.short_term_rent.promo_codes.mvi.c(uVarD2, this.f282420f);
            this.f282423i = new C8432c(cVar);
            u<C28478k> uVarD3 = g.d(new e(l.a(rVar)));
            this.f282424j = uVarD3;
            this.f282425k = g.d(new f(uVarD3, this.f282423i));
            this.f282426l = new C43506b(new h(this.f282415a, this.f282422h, j.a(), com.avito.android.short_term_rent.promo_codes.mvi.l.a(), this.f282425k));
        }

        @Override // com.avito.android.short_term_rent.promo_codes.di.b
        public final void a(StrSoftBookingPromoCodesDialogFragment strSoftBookingPromoCodesDialogFragment) {
            strSoftBookingPromoCodesDialogFragment.f282486h0 = this.f282426l;
            strSoftBookingPromoCodesDialogFragment.f282488j0 = this.f282425k.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
