package com.avito.android.hotel_booking.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.hotel_booking.di.O;
import com.avito.android.hotel_booking.select_single_value.SelectSingleValueFragment;
import com.avito.android.hotel_booking.select_single_value.SelectSingleValueOpenParams;
import dagger.internal.A;
import kotlin.G0;

/* compiled from: DaggerSelectSingleValueComponent.java */
@dagger.internal.e
/* renamed from: com.avito.android.hotel_booking.di.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30783d {

    /* compiled from: DaggerSelectSingleValueComponent.java */
    /* renamed from: com.avito.android.hotel_booking.di.d$b */
    public static final class b implements O.a {
        public b() {
        }

        @Override // com.avito.android.hotel_booking.di.O.a
        public final O a(InterfaceC30799u interfaceC30799u, C28478k c28478k, Y41.l<? super VI.a, G0> lVar, SelectSingleValueOpenParams selectSingleValueOpenParams) {
            selectSingleValueOpenParams.getClass();
            return new c(new P(), interfaceC30799u, c28478k, lVar, selectSingleValueOpenParams, null);
        }
    }

    /* compiled from: DaggerSelectSingleValueComponent.java */
    /* renamed from: com.avito.android.hotel_booking.di.d$c */
    public static final class c implements O {

        /* renamed from: a, reason: collision with root package name */
        public final P f163434a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.hotel_booking.select_single_value.mvi.e f163435b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f163436c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<UI.a> f163437d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.hotel_booking.select_single_value.mvi.c f163438e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f163439f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f163440g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.hotel_booking.select_single_value.d f163441h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f163442i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f163443j;

        /* compiled from: DaggerSelectSingleValueComponent.java */
        /* renamed from: com.avito.android.hotel_booking.di.d$c$a */
        public static final class a implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30799u f163444a;

            public a(InterfaceC30799u interfaceC30799u) {
                this.f163444a = interfaceC30799u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f163444a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerSelectSingleValueComponent.java */
        /* renamed from: com.avito.android.hotel_booking.di.d$c$b */
        public static final class b implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30799u f163445a;

            public b(InterfaceC30799u interfaceC30799u) {
                this.f163445a = interfaceC30799u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f163445a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c() {
            throw null;
        }

        public c(P p12, InterfaceC30799u interfaceC30799u, C28478k c28478k, Y41.l lVar, SelectSingleValueOpenParams selectSingleValueOpenParams, a aVar) {
            this.f163434a = p12;
            this.f163435b = new com.avito.android.hotel_booking.select_single_value.mvi.e(dagger.internal.l.a(selectSingleValueOpenParams));
            dagger.internal.u<UI.a> uVarD = dagger.internal.g.d(new UI.c(new a(interfaceC30799u)));
            this.f163437d = uVarD;
            this.f163438e = new com.avito.android.hotel_booking.select_single_value.mvi.c(uVarD);
            this.f163439f = new b(interfaceC30799u);
            this.f163440g = dagger.internal.g.d(new U(p12, this.f163439f, dagger.internal.l.a(c28478k)));
            this.f163441h = new com.avito.android.hotel_booking.select_single_value.d(new com.avito.android.hotel_booking.select_single_value.mvi.i(this.f163435b, this.f163438e, com.avito.android.hotel_booking.select_single_value.mvi.k.a(), com.avito.android.hotel_booking.select_single_value.mvi.n.a(), this.f163440g));
            this.f163442i = dagger.internal.g.d(new com.avito.android.hotel_booking.select_single_value.konveyor.checkmark.b(new com.avito.android.hotel_booking.select_single_value.konveyor.checkmark.g(dagger.internal.l.a(lVar))));
            A.b bVarA = dagger.internal.A.a(1, 0);
            bVarA.f393937a.add(this.f163442i);
            this.f163443j = dagger.internal.g.d(new S(p12, bVarA.b()));
        }

        @Override // com.avito.android.hotel_booking.di.O
        public final void a(SelectSingleValueFragment selectSingleValueFragment) {
            selectSingleValueFragment.f164055h0 = this.f163441h;
            selectSingleValueFragment.f164057j0 = this.f163440g.get();
            com.avito.konveyor.a aVar = this.f163443j.get();
            this.f163434a.getClass();
            selectSingleValueFragment.f164058k0 = new com.avito.konveyor.adapter.d(new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null), this.f163443j.get(), new com.avito.android.hotel_booking.select_single_value.konveyor.a());
        }
    }

    public static O.a a() {
        return new b();
    }
}
