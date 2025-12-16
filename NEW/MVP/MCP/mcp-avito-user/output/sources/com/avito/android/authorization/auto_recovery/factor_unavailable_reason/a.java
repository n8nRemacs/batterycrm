package com.avito.android.authorization.auto_recovery.factor_unavailable_reason;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.auto_recovery.factor_unavailable_reason.b;
import com.avito.android.authorization.auto_recovery.factor_unavailable_reason.mvi.p;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerFactorUnavailableReasonComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class a {

    /* compiled from: DaggerFactorUnavailableReasonComponent.java */
    public static final class b implements com.avito.android.authorization.auto_recovery.factor_unavailable_reason.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f93099a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.authorization.auto_recovery.factor_unavailable_reason.mvi.h f93100b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28373a> f93101c;

        /* renamed from: d, reason: collision with root package name */
        public final p f93102d;

        /* renamed from: e, reason: collision with root package name */
        public final m f93103e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28481c> f93104f;

        /* renamed from: g, reason: collision with root package name */
        public final u<C28478k> f93105g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f93106h;

        /* compiled from: DaggerFactorUnavailableReasonComponent.java */
        /* renamed from: com.avito.android.authorization.auto_recovery.factor_unavailable_reason.a$b$a, reason: collision with other inner class name */
        public static final class C2744a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.auto_recovery.factor_unavailable_reason.c f93107a;

            public C2744a(com.avito.android.authorization.auto_recovery.factor_unavailable_reason.c cVar) {
                this.f93107a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f93107a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerFactorUnavailableReasonComponent.java */
        /* renamed from: com.avito.android.authorization.auto_recovery.factor_unavailable_reason.a$b$b, reason: collision with other inner class name */
        public static final class C2745b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f93108a;

            public C2745b(cv.b bVar) {
                this.f93108a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f93108a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerFactorUnavailableReasonComponent.java */
        public static final class c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.auto_recovery.factor_unavailable_reason.c f93109a;

            public c(com.avito.android.authorization.auto_recovery.factor_unavailable_reason.c cVar) {
                this.f93109a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f93109a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(j jVar, com.avito.android.authorization.auto_recovery.factor_unavailable_reason.c cVar, cv.b bVar, r rVar, FactorUnavailableReasonArguments factorUnavailableReasonArguments, C2743a c2743a) {
            C2745b c2745b = new C2745b(bVar);
            this.f93099a = c2745b;
            this.f93100b = new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.mvi.h(c2745b);
            this.f93102d = new p(dagger.internal.l.a(factorUnavailableReasonArguments), this.f93099a, new C2744a(cVar));
            this.f93103e = new m(new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.mvi.k(this.f93100b, com.avito.android.authorization.auto_recovery.factor_unavailable_reason.mvi.b.a(), com.avito.android.authorization.auto_recovery.factor_unavailable_reason.mvi.m.a(), this.f93102d));
            this.f93104f = new c(cVar);
            u<C28478k> uVarD = dagger.internal.g.d(new k(jVar, dagger.internal.l.a(rVar)));
            this.f93105g = uVarD;
            this.f93106h = com.avito.android.advert.item.delivery_suggests.l.i(this.f93104f, uVarD);
        }
    }

    /* compiled from: DaggerFactorUnavailableReasonComponent.java */
    public static final class c implements b.a {
        public c() {
        }
    }
}
