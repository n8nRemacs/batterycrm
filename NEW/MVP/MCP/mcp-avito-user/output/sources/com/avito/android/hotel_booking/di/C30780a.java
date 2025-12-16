package com.avito.android.hotel_booking.di;

import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.hotel_booking.di.InterfaceC30785f;
import com.avito.android.hotel_booking.enter_data.EnterDataFragment;
import com.avito.android.hotel_booking.enter_data.EnterDataOpenParams;
import com.avito.android.util.R0;
import dagger.internal.A;
import java.util.List;
import kotlin.G0;

/* compiled from: DaggerEnterDataComponent.java */
@dagger.internal.e
/* renamed from: com.avito.android.hotel_booking.di.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30780a {

    /* compiled from: DaggerEnterDataComponent.java */
    /* renamed from: com.avito.android.hotel_booking.di.a$b */
    public static final class b implements InterfaceC30785f {

        /* renamed from: a, reason: collision with root package name */
        public final C30786g f163355a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.hotel_booking.enter_data.mvi.f f163356b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<R0> f163357c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.hotel_booking.enter_data.mvi.p> f163358d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f163359e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<Context> f163360f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<PI.a> f163361g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.hotel_booking.enter_data.mvi.d f163362h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.hotel_booking.enter_data.mvi.o f163363i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f163364j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f163365k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.hotel_booking.enter_data.d f163366l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f163367m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f163368n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f163369o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f163370p;

        /* compiled from: DaggerEnterDataComponent.java */
        /* renamed from: com.avito.android.hotel_booking.di.a$b$a, reason: collision with other inner class name */
        public static final class C4782a implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30799u f163371a;

            public C4782a(InterfaceC30799u interfaceC30799u) {
                this.f163371a = interfaceC30799u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f163371a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerEnterDataComponent.java */
        /* renamed from: com.avito.android.hotel_booking.di.a$b$b, reason: collision with other inner class name */
        public static final class C4783b implements dagger.internal.u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30799u f163372a;

            public C4783b(InterfaceC30799u interfaceC30799u) {
                this.f163372a = interfaceC30799u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f163372a.g();
            }
        }

        /* compiled from: DaggerEnterDataComponent.java */
        /* renamed from: com.avito.android.hotel_booking.di.a$b$c */
        public static final class c implements dagger.internal.u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30799u f163373a;

            public c(InterfaceC30799u interfaceC30799u) {
                this.f163373a = interfaceC30799u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f163373a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerEnterDataComponent.java */
        /* renamed from: com.avito.android.hotel_booking.di.a$b$d */
        public static final class d implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30799u f163374a;

            public d(InterfaceC30799u interfaceC30799u) {
                this.f163374a = interfaceC30799u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f163374a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b() {
            throw null;
        }

        public b(C30786g c30786g, InterfaceC30799u interfaceC30799u, C28478k c28478k, Y41.l lVar, EnterDataOpenParams enterDataOpenParams, C4781a c4781a) {
            this.f163355a = c30786g;
            this.f163356b = new com.avito.android.hotel_booking.enter_data.mvi.f(dagger.internal.l.a(enterDataOpenParams));
            this.f163358d = dagger.internal.g.d(new com.avito.android.hotel_booking.enter_data.mvi.r(new c(interfaceC30799u)));
            dagger.internal.u<PI.a> uVarD = dagger.internal.g.d(new PI.c(new C4782a(interfaceC30799u), new C4783b(interfaceC30799u)));
            this.f163361g = uVarD;
            this.f163362h = new com.avito.android.hotel_booking.enter_data.mvi.d(uVarD, this.f163358d);
            this.f163363i = new com.avito.android.hotel_booking.enter_data.mvi.o(com.avito.android.hotel_booking.enter_data.mvi.u.a());
            this.f163364j = new d(interfaceC30799u);
            this.f163365k = dagger.internal.g.d(new C30790k(c30786g, this.f163364j, dagger.internal.l.a(c28478k)));
            this.f163366l = new com.avito.android.hotel_booking.enter_data.d(new com.avito.android.hotel_booking.enter_data.mvi.j(this.f163356b, this.f163362h, com.avito.android.hotel_booking.enter_data.mvi.l.a(), this.f163363i, this.f163365k));
            this.f163367m = dagger.internal.g.d(new com.avito.android.hotel_booking.enter_data.konveyor.input.b(new com.avito.android.hotel_booking.enter_data.konveyor.input.i(dagger.internal.l.a(lVar))));
            this.f163368n = dagger.internal.g.d(new com.avito.android.hotel_booking.enter_data.konveyor.text.b(com.avito.android.hotel_booking.enter_data.konveyor.text.e.a()));
            this.f163369o = dagger.internal.g.d(new com.avito.android.hotel_booking.konveyor.spacing.b(com.avito.android.hotel_booking.konveyor.spacing.e.a()));
            A.b bVarA = dagger.internal.A.a(3, 0);
            dagger.internal.u<TV0.b<?, ?>> uVar = this.f163367m;
            List<dagger.internal.u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f163368n);
            list.add(this.f163369o);
            this.f163370p = dagger.internal.g.d(new C30788i(c30786g, bVarA.b()));
        }

        @Override // com.avito.android.hotel_booking.di.InterfaceC30785f
        public final void a(EnterDataFragment enterDataFragment) {
            enterDataFragment.f163476h0 = this.f163366l;
            enterDataFragment.f163478j0 = this.f163365k.get();
            com.avito.konveyor.a aVar = this.f163370p.get();
            this.f163355a.getClass();
            enterDataFragment.f163479k0 = new com.avito.konveyor.adapter.d(new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null), this.f163370p.get(), new com.avito.android.hotel_booking.enter_data.konveyor.a());
        }
    }

    /* compiled from: DaggerEnterDataComponent.java */
    /* renamed from: com.avito.android.hotel_booking.di.a$c */
    public static final class c implements InterfaceC30785f.a {
        public c() {
        }

        @Override // com.avito.android.hotel_booking.di.InterfaceC30785f.a
        public final InterfaceC30785f a(InterfaceC30799u interfaceC30799u, C28478k c28478k, Y41.l<? super QI.a, G0> lVar, EnterDataOpenParams enterDataOpenParams) {
            enterDataOpenParams.getClass();
            return new b(new C30786g(), interfaceC30799u, c28478k, lVar, enterDataOpenParams, null);
        }
    }

    public static InterfaceC30785f.a a() {
        return new c();
    }
}
