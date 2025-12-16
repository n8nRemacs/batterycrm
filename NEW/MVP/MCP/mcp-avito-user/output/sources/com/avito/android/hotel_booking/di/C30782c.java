package com.avito.android.hotel_booking.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.hotel_booking.di.G;
import com.avito.android.hotel_booking.select_radio.SelectRadioFragment;
import com.avito.android.hotel_booking.select_radio.SelectRadioOpenParams;
import dagger.internal.A;
import kotlin.G0;

/* compiled from: DaggerHotelBookingSelectRadioComponent.java */
@dagger.internal.e
/* renamed from: com.avito.android.hotel_booking.di.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30782c {

    /* compiled from: DaggerHotelBookingSelectRadioComponent.java */
    /* renamed from: com.avito.android.hotel_booking.di.c$b */
    public static final class b implements G.a {
        public b() {
        }

        @Override // com.avito.android.hotel_booking.di.G.a
        public final G a(InterfaceC30799u interfaceC30799u, C28478k c28478k, Y41.l<? super TI.a, G0> lVar, SelectRadioOpenParams selectRadioOpenParams) {
            selectRadioOpenParams.getClass();
            return new C4787c(new H(), interfaceC30799u, c28478k, lVar, selectRadioOpenParams, null);
        }
    }

    /* compiled from: DaggerHotelBookingSelectRadioComponent.java */
    /* renamed from: com.avito.android.hotel_booking.di.c$c, reason: collision with other inner class name */
    public static final class C4787c implements G {

        /* renamed from: a, reason: collision with root package name */
        public final H f163422a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.hotel_booking.select_radio.mvi.f f163423b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f163424c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<SI.a> f163425d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.hotel_booking.select_radio.mvi.d f163426e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f163427f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f163428g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.hotel_booking.select_radio.f f163429h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f163430i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f163431j;

        /* compiled from: DaggerHotelBookingSelectRadioComponent.java */
        /* renamed from: com.avito.android.hotel_booking.di.c$c$a */
        public static final class a implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30799u f163432a;

            public a(InterfaceC30799u interfaceC30799u) {
                this.f163432a = interfaceC30799u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f163432a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerHotelBookingSelectRadioComponent.java */
        /* renamed from: com.avito.android.hotel_booking.di.c$c$b */
        public static final class b implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30799u f163433a;

            public b(InterfaceC30799u interfaceC30799u) {
                this.f163433a = interfaceC30799u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f163433a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public C4787c() {
            throw null;
        }

        public C4787c(H h12, InterfaceC30799u interfaceC30799u, C28478k c28478k, Y41.l lVar, SelectRadioOpenParams selectRadioOpenParams, a aVar) {
            this.f163422a = h12;
            this.f163423b = new com.avito.android.hotel_booking.select_radio.mvi.f(dagger.internal.l.a(selectRadioOpenParams));
            dagger.internal.u<SI.a> uVarD = dagger.internal.g.d(new SI.c(new a(interfaceC30799u)));
            this.f163425d = uVarD;
            this.f163426e = new com.avito.android.hotel_booking.select_radio.mvi.d(uVarD);
            this.f163427f = new b(interfaceC30799u);
            this.f163428g = dagger.internal.g.d(new L(h12, this.f163427f, dagger.internal.l.a(c28478k)));
            this.f163429h = new com.avito.android.hotel_booking.select_radio.f(new com.avito.android.hotel_booking.select_radio.mvi.j(this.f163423b, this.f163426e, com.avito.android.hotel_booking.select_radio.mvi.l.a(), com.avito.android.hotel_booking.select_radio.mvi.o.a(), this.f163428g));
            this.f163430i = dagger.internal.g.d(new com.avito.android.hotel_booking.select_radio.konveyor.radio.b(new com.avito.android.hotel_booking.select_radio.konveyor.radio.g(dagger.internal.l.a(lVar))));
            A.b bVarA = dagger.internal.A.a(1, 0);
            bVarA.f393937a.add(this.f163430i);
            this.f163431j = dagger.internal.g.d(new J(h12, bVarA.b()));
        }

        @Override // com.avito.android.hotel_booking.di.G
        public final void a(SelectRadioFragment selectRadioFragment) {
            selectRadioFragment.f163978h0 = this.f163429h;
            selectRadioFragment.f163980j0 = this.f163428g.get();
            com.avito.konveyor.a aVar = this.f163431j.get();
            this.f163422a.getClass();
            selectRadioFragment.f163981k0 = new com.avito.konveyor.adapter.d(new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null), this.f163431j.get(), new com.avito.android.hotel_booking.select_radio.konveyor.a());
        }
    }

    public static G.a a() {
        return new b();
    }
}
