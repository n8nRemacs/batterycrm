package com.avito.android.vas_performance.screens.applied_services.di;

import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.C30060h5;
import com.avito.android.util.R0;
import com.avito.android.vas_performance.screens.applied_services.di.b;
import com.avito.android.vas_performance.screens.applied_services.mvi.j;
import com.avito.android.vas_performance.screens.applied_services.ui.AppliedServicesFragment;
import com.avito.android.vas_performance.screens.applied_services.ui.i;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import zL0.InterfaceC50482a;

/* compiled from: DaggerAppliedServicesComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class h {

    /* compiled from: DaggerAppliedServicesComponent.java */
    public static final class b implements com.avito.android.vas_performance.screens.applied_services.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f320241a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC50482a> f320242b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f320243c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f320244d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.vas_performance.screens.applied_services.mvi.e f320245e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28481c> f320246f;

        /* renamed from: g, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f320247g;

        /* renamed from: h, reason: collision with root package name */
        public final i f320248h;

        /* compiled from: DaggerAppliedServicesComponent.java */
        public static final class a implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f320249a;

            public a(cv.b bVar) {
                this.f320249a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f320249a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerAppliedServicesComponent.java */
        /* renamed from: com.avito.android.vas_performance.screens.applied_services.di.h$b$b, reason: collision with other inner class name */
        public static final class C9926b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.vas_performance.screens.applied_services.di.c f320250a;

            public C9926b(com.avito.android.vas_performance.screens.applied_services.di.c cVar) {
                this.f320250a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f320250a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerAppliedServicesComponent.java */
        public static final class c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.vas_performance.screens.applied_services.di.c f320251a;

            public c(com.avito.android.vas_performance.screens.applied_services.di.c cVar) {
                this.f320251a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f320251a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerAppliedServicesComponent.java */
        public static final class d implements u<InterfaceC50482a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.vas_performance.screens.applied_services.di.c f320252a;

            public d(com.avito.android.vas_performance.screens.applied_services.di.c cVar) {
                this.f320252a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC50482a interfaceC50482aO0 = this.f320252a.o0();
                t.c(interfaceC50482aO0);
                return interfaceC50482aO0;
            }
        }

        public b(f fVar, com.avito.android.vas_performance.screens.applied_services.di.c cVar, cv.b bVar, r rVar, String str, a aVar) {
            this.f320241a = bVar;
            this.f320245e = new com.avito.android.vas_performance.screens.applied_services.mvi.e(new com.avito.android.vas_performance.screens.applied_services.domain.b(l.a(str), new d(cVar), new C9926b(cVar)), new a(bVar));
            this.f320246f = new c(cVar);
            this.f320247g = dagger.internal.g.d(new C30060h5(this.f320246f, new g(fVar, l.a(rVar))));
            this.f320248h = new i(new com.avito.android.vas_performance.screens.applied_services.mvi.h(this.f320245e, com.avito.android.vas_performance.screens.applied_services.mvi.b.a(), j.a(), com.avito.android.vas_performance.screens.applied_services.mvi.l.a(), this.f320247g));
        }

        @Override // com.avito.android.vas_performance.screens.applied_services.di.b
        public final void a(AppliedServicesFragment appliedServicesFragment) {
            appliedServicesFragment.f320327h0 = this.f320248h;
            appliedServicesFragment.f320329j0 = this.f320247g.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f320241a.u4();
            t.c(aVarU4);
            appliedServicesFragment.f320330k0 = aVarU4;
        }
    }

    /* compiled from: DaggerAppliedServicesComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.vas_performance.screens.applied_services.di.b.a
        public final com.avito.android.vas_performance.screens.applied_services.di.b a(com.avito.android.vas_performance.screens.applied_services.di.c cVar, InterfaceC39417a interfaceC39417a, r rVar, String str) {
            interfaceC39417a.getClass();
            return new b(new f(), cVar, interfaceC39417a, rVar, str, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
