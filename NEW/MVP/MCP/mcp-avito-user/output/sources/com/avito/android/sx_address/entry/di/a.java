package com.avito.android.sx_address.entry.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.sx_address.entry.SxAddressEntryFragment;
import com.avito.android.sx_address.entry.di.b;
import com.avito.android.sx_address.entry.mvi.d;
import com.avito.android.sx_address.entry.mvi.g;
import com.avito.android.sx_address.entry.mvi.i;
import com.avito.android.sx_address.entry.mvi.k;
import com.avito.android.sx_address.entry.y;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerSxAddressEntryComponent.java */
@e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerSxAddressEntryComponent.java */
    public static final class b implements b.InterfaceC8898b {
        public b() {
        }

        @Override // com.avito.android.sx_address.entry.di.b.InterfaceC8898b
        public final com.avito.android.sx_address.entry.di.b a(com.avito.android.sx_address.entry.di.c cVar, InterfaceC39417a interfaceC39417a, C28478k c28478k) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, c28478k, null);
        }
    }

    /* compiled from: DaggerSxAddressEntryComponent.java */
    public static final class c implements com.avito.android.sx_address.entry.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f292918a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28481c> f292919b;

        /* renamed from: c, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f292920c;

        /* renamed from: d, reason: collision with root package name */
        public final u<EA0.a> f292921d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28373a> f292922e;

        /* renamed from: f, reason: collision with root package name */
        public final d f292923f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.sx_address.entry.mvi.b f292924g;

        /* renamed from: h, reason: collision with root package name */
        public final k f292925h;

        /* renamed from: i, reason: collision with root package name */
        public final y f292926i;

        /* compiled from: DaggerSxAddressEntryComponent.java */
        /* renamed from: com.avito.android.sx_address.entry.di.a$c$a, reason: collision with other inner class name */
        public static final class C8896a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sx_address.entry.di.c f292927a;

            public C8896a(com.avito.android.sx_address.entry.di.c cVar) {
                this.f292927a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f292927a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerSxAddressEntryComponent.java */
        public static final class b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sx_address.entry.di.c f292928a;

            public b(com.avito.android.sx_address.entry.di.c cVar) {
                this.f292928a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f292928a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerSxAddressEntryComponent.java */
        /* renamed from: com.avito.android.sx_address.entry.di.a$c$c, reason: collision with other inner class name */
        public static final class C8897c implements u<EA0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sx_address.entry.di.c f292929a;

            public C8897c(com.avito.android.sx_address.entry.di.c cVar) {
                this.f292929a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                EA0.a aVarQ1 = this.f292929a.q1();
                t.c(aVarQ1);
                return aVarQ1;
            }
        }

        public c(com.avito.android.sx_address.entry.di.c cVar, cv.b bVar, C28478k c28478k, C8895a c8895a) {
            this.f292918a = bVar;
            this.f292919b = new b(cVar);
            this.f292920c = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f292919b);
            com.avito.android.sx_address.entry.domain.d dVar = new com.avito.android.sx_address.entry.domain.d(new C8897c(cVar));
            this.f292923f = new d(dVar, new CA0.c(new C8896a(cVar)));
            this.f292924g = new com.avito.android.sx_address.entry.mvi.b(dVar);
            this.f292925h = new k(com.avito.android.sx_address.entry.mvi.builder.c.a());
            this.f292926i = new y(new g(this.f292923f, this.f292924g, i.a(), this.f292925h));
        }

        @Override // com.avito.android.sx_address.entry.di.b
        public final void a(SxAddressEntryFragment sxAddressEntryFragment) {
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f292918a.u4();
            t.c(aVarU4);
            sxAddressEntryFragment.f292886n0 = aVarU4;
            sxAddressEntryFragment.f292887o0 = this.f292920c.get();
            sxAddressEntryFragment.f292889q0 = this.f292926i;
        }
    }

    public static b.InterfaceC8898b a() {
        return new b();
    }
}
