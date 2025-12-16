package com.avito.android.publish.free_delivery.di;

import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.publish.C0;
import com.avito.android.publish.free_delivery.FreeDeliveryFragment;
import com.avito.android.publish.free_delivery.di.b;
import com.avito.android.publish.free_delivery.mvi.j;
import com.avito.android.publish.free_delivery.mvi.l;
import com.avito.android.publish.free_delivery.mvi.o;
import com.avito.android.publish.free_delivery.mvi.q;
import com.avito.android.publish.free_delivery.mvi.s;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.t;
import dagger.internal.u;
import dl0.InterfaceC39749a;
import yc.C50213a;

/* compiled from: DaggerFreeDeliveryComponent.java */
@e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerFreeDeliveryComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.publish.free_delivery.di.b.a
        public final com.avito.android.publish.free_delivery.di.b a(com.avito.android.publish.free_delivery.di.c cVar, C28478k c28478k) {
            return new c(cVar, c28478k, null);
        }
    }

    /* compiled from: DaggerFreeDeliveryComponent.java */
    public static final class c implements com.avito.android.publish.free_delivery.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.publish.free_delivery.di.c f235765a;

        /* renamed from: b, reason: collision with root package name */
        public final u<C0> f235766b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC39749a> f235767c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f235768d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.publish.free_delivery.domain.a> f235769e;

        /* renamed from: f, reason: collision with root package name */
        public final l f235770f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28373a> f235771g;

        /* renamed from: h, reason: collision with root package name */
        public final u<C50213a> f235772h;

        /* renamed from: i, reason: collision with root package name */
        public final j f235773i;

        /* renamed from: j, reason: collision with root package name */
        public final s f235774j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC28481c> f235775k;

        /* renamed from: l, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f235776l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.publish.free_delivery.j f235777m;

        /* compiled from: DaggerFreeDeliveryComponent.java */
        /* renamed from: com.avito.android.publish.free_delivery.di.a$c$a, reason: collision with other inner class name */
        public static final class C7108a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.free_delivery.di.c f235778a;

            public C7108a(com.avito.android.publish.free_delivery.di.c cVar) {
                this.f235778a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f235778a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerFreeDeliveryComponent.java */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.free_delivery.di.c f235779a;

            public b(com.avito.android.publish.free_delivery.di.c cVar) {
                this.f235779a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f235779a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerFreeDeliveryComponent.java */
        /* renamed from: com.avito.android.publish.free_delivery.di.a$c$c, reason: collision with other inner class name */
        public static final class C7109c implements u<InterfaceC39749a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.free_delivery.di.c f235780a;

            public C7109c(com.avito.android.publish.free_delivery.di.c cVar) {
                this.f235780a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC39749a interfaceC39749aAh = this.f235780a.ah();
                t.c(interfaceC39749aAh);
                return interfaceC39749aAh;
            }
        }

        /* compiled from: DaggerFreeDeliveryComponent.java */
        public static final class d implements u<C50213a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.free_delivery.di.c f235781a;

            public d(com.avito.android.publish.free_delivery.di.c cVar) {
                this.f235781a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C50213a c50213aD1 = this.f235781a.D1();
                t.c(c50213aD1);
                return c50213aD1;
            }
        }

        /* compiled from: DaggerFreeDeliveryComponent.java */
        public static final class e implements u<C0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.free_delivery.di.c f235782a;

            public e(com.avito.android.publish.free_delivery.di.c cVar) {
                this.f235782a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C0 c0U = this.f235782a.u();
                t.c(c0U);
                return c0U;
            }
        }

        /* compiled from: DaggerFreeDeliveryComponent.java */
        public static final class f implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.free_delivery.di.c f235783a;

            public f(com.avito.android.publish.free_delivery.di.c cVar) {
                this.f235783a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f235783a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.publish.free_delivery.di.c cVar, C28478k c28478k, C7107a c7107a) {
            this.f235765a = cVar;
            e eVar = new e(cVar);
            this.f235766b = eVar;
            u<com.avito.android.publish.free_delivery.domain.a> uVarD = g.d(new com.avito.android.publish.free_delivery.domain.c(eVar, new C7109c(cVar), new b(cVar)));
            this.f235769e = uVarD;
            this.f235770f = new l(uVarD);
            C7108a c7108a = new C7108a(cVar);
            d dVar = new d(cVar);
            u<C0> uVar = this.f235766b;
            this.f235773i = new j(uVarD, uVar, c7108a, dVar);
            this.f235774j = new s(c7108a, uVar, dVar);
            this.f235775k = new f(cVar);
            this.f235776l = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f235775k);
            this.f235777m = new com.avito.android.publish.free_delivery.j(new o(this.f235770f, this.f235773i, q.a(), this.f235774j, this.f235776l));
        }

        @Override // com.avito.android.publish.free_delivery.di.b
        public final void a(FreeDeliveryFragment freeDeliveryFragment) {
            freeDeliveryFragment.f235743n0 = this.f235777m;
            freeDeliveryFragment.f235744o0 = this.f235776l.get();
            com.avito.android.publish.free_delivery.di.c cVar = this.f235765a;
            C0 c0U = cVar.u();
            t.c(c0U);
            freeDeliveryFragment.f235745p0 = c0U;
            u3.l<SimpleTestGroupWithNone> lVarO0 = cVar.O0();
            t.c(lVarO0);
            freeDeliveryFragment.f235746q0 = lVarO0;
        }
    }

    public static b.a a() {
        return new b();
    }
}
