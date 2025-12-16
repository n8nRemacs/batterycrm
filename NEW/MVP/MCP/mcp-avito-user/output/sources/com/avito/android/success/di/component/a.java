package com.avito.android.success.di.component;

import Y41.l;
import cA0.InterfaceC26997a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.success.SuccessFragment;
import com.avito.android.success.di.component.b;
import com.avito.android.success.i;
import com.avito.android.success.m;
import com.avito.android.success.mvi.f;
import com.avito.android.success.mvi.k;
import com.avito.android.util.R0;
import com.avito.konveyor.adapter.j;
import cv.InterfaceC39417a;
import dA0.C39549b;
import dA0.C39550c;
import dA0.C39551d;
import dA0.h;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerSuccessComponent.java */
@e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerSuccessComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.success.di.component.b.a
        public final com.avito.android.success.di.component.b a(C28478k c28478k, String str, l lVar, com.avito.android.success.di.component.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, c28478k, str, lVar, null);
        }
    }

    /* compiled from: DaggerSuccessComponent.java */
    public static final class c implements com.avito.android.success.di.component.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f291588a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.success.di.component.c f291589b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC26997a> f291590c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f291591d;

        /* renamed from: e, reason: collision with root package name */
        public final f f291592e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.success.mvi.d f291593f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28481c> f291594g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f291595h;

        /* renamed from: i, reason: collision with root package name */
        public final m f291596i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.success.konveyor.header.b f291597j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f291598k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f291599l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f291600m;

        /* renamed from: n, reason: collision with root package name */
        public final u<j> f291601n;

        /* compiled from: DaggerSuccessComponent.java */
        /* renamed from: com.avito.android.success.di.component.a$c$a, reason: collision with other inner class name */
        public static final class C8823a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.success.di.component.c f291602a;

            public C8823a(com.avito.android.success.di.component.c cVar) {
                this.f291602a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f291602a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerSuccessComponent.java */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.success.di.component.c f291603a;

            public b(com.avito.android.success.di.component.c cVar) {
                this.f291603a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f291603a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerSuccessComponent.java */
        /* renamed from: com.avito.android.success.di.component.a$c$c, reason: collision with other inner class name */
        public static final class C8824c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.success.di.component.c f291604a;

            public C8824c(com.avito.android.success.di.component.c cVar) {
                this.f291604a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f291604a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerSuccessComponent.java */
        public static final class d implements u<InterfaceC26997a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.success.di.component.c f291605a;

            public d(com.avito.android.success.di.component.c cVar) {
                this.f291605a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC26997a interfaceC26997aZ7 = this.f291605a.Z7();
                t.c(interfaceC26997aZ7);
                return interfaceC26997aZ7;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.success.di.component.c cVar, cv.b bVar, C28478k c28478k, String str, l lVar, C8822a c8822a) {
            this.f291588a = bVar;
            this.f291589b = cVar;
            dagger.internal.l lVarA = dagger.internal.l.a(str);
            d dVar = new d(cVar);
            this.f291591d = new b(cVar);
            com.avito.android.success.domain.b bVar2 = new com.avito.android.success.domain.b(lVarA, dVar, i.a(), this.f291591d);
            this.f291592e = new f(bVar2);
            this.f291593f = new com.avito.android.success.mvi.d(bVar2);
            this.f291594g = new C8824c(cVar);
            this.f291595h = g.d(new h(dagger.internal.l.a(c28478k), this.f291594g));
            this.f291596i = new m(new com.avito.android.success.mvi.i(this.f291592e, this.f291593f, k.a(), com.avito.android.success.mvi.m.a(), this.f291595h));
            this.f291597j = new com.avito.android.success.konveyor.header.b(com.avito.android.success.konveyor.header.e.a());
            this.f291598k = new C8823a(cVar);
            dagger.internal.l lVarA2 = dagger.internal.l.a(lVar);
            u<com.avito.android.util.text.a> uVar = this.f291598k;
            u<com.avito.konveyor.a> uVarD = g.d(new C39550c(this.f291597j, new com.avito.android.success.konveyor.title.b(new com.avito.android.success.konveyor.title.e(lVarA2, uVar)), new com.avito.android.success.konveyor.service.b(new com.avito.android.success.konveyor.service.e(lVarA2, uVar)), new com.avito.android.success.konveyor.charity.b(new com.avito.android.success.konveyor.charity.h(lVarA2, uVar))));
            this.f291599l = uVarD;
            u<com.avito.konveyor.adapter.a> uVarD2 = g.d(new C39549b(uVarD));
            this.f291600m = uVarD2;
            this.f291601n = g.d(new C39551d(uVarD2, this.f291599l));
        }

        @Override // com.avito.android.success.di.component.b
        public final void a(SuccessFragment successFragment) {
            successFragment.f291546n0 = this.f291596i;
            successFragment.f291548p0 = this.f291595h.get();
            successFragment.f291549q0 = this.f291601n.get();
            successFragment.f291550r0 = this.f291600m.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f291588a.u4();
            t.c(aVarU4);
            successFragment.f291551s0 = aVarU4;
            com.avito.android.util.text.a aVarE = this.f291589b.e();
            t.c(aVarE);
            successFragment.f291552t0 = aVarE;
        }
    }

    public static b.a a() {
        return new b();
    }
}
