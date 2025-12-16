package com.avito.android.bbl.screens.limit_increase.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bbl.screens.limit_increase.di.d;
import com.avito.android.bbl.screens.limit_increase.ui.LimitIncreaseFragment;
import com.avito.android.paid_services.PaidServicesResultRepository;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import oh.InterfaceC44774a;

/* compiled from: DaggerLimitIncreaseComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class b {

    /* compiled from: DaggerLimitIncreaseComponent.java */
    /* renamed from: com.avito.android.bbl.screens.limit_increase.di.b$b, reason: collision with other inner class name */
    public static final class C3005b implements d.a {
        public C3005b() {
        }

        @Override // com.avito.android.bbl.screens.limit_increase.di.d.a
        public final d a(long j12, boolean z12, String str, PaidServicesResultRepository paidServicesResultRepository, r rVar, g gVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(new j(), gVar, interfaceC39417a, Long.valueOf(j12), Boolean.valueOf(z12), str, paidServicesResultRepository, rVar, null);
        }
    }

    /* compiled from: DaggerLimitIncreaseComponent.java */
    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f99741a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC44774a> f99742b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f99743c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.l f99744d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.bbl.screens.limit_increase.mvi.d f99745e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.bbl.screens.limit_increase.mvi.b f99746f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28481c> f99747g;

        /* renamed from: h, reason: collision with root package name */
        public final u<C28478k> f99748h;

        /* renamed from: i, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f99749i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.l f99750j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.bbl.screens.limit_increase.ui.h f99751k;

        /* compiled from: DaggerLimitIncreaseComponent.java */
        public static final class a implements u<InterfaceC44774a> {

            /* renamed from: a, reason: collision with root package name */
            public final g f99752a;

            public a(g gVar) {
                this.f99752a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC44774a interfaceC44774aR3 = this.f99752a.r3();
                t.c(interfaceC44774aR3);
                return interfaceC44774aR3;
            }
        }

        /* compiled from: DaggerLimitIncreaseComponent.java */
        /* renamed from: com.avito.android.bbl.screens.limit_increase.di.b$c$b, reason: collision with other inner class name */
        public static final class C3006b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final g f99753a;

            public C3006b(g gVar) {
                this.f99753a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f99753a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerLimitIncreaseComponent.java */
        /* renamed from: com.avito.android.bbl.screens.limit_increase.di.b$c$c, reason: collision with other inner class name */
        public static final class C3007c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final g f99754a;

            public C3007c(g gVar) {
                this.f99754a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f99754a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(j jVar, g gVar, cv.b bVar, Long l12, Boolean bool, String str, PaidServicesResultRepository paidServicesResultRepository, r rVar, a aVar) {
            this.f99741a = bVar;
            this.f99742b = new a(gVar);
            this.f99743c = new C3006b(gVar);
            this.f99744d = dagger.internal.l.a(l12);
            dagger.internal.l lVarA = dagger.internal.l.a(str);
            u<InterfaceC44774a> uVar = this.f99742b;
            u<R0> uVar2 = this.f99743c;
            dagger.internal.l lVar = this.f99744d;
            com.avito.android.bbl.screens.limit_increase.mvi.domain.b bVar2 = new com.avito.android.bbl.screens.limit_increase.mvi.domain.b(lVar, lVarA, uVar, uVar2);
            this.f99745e = new com.avito.android.bbl.screens.limit_increase.mvi.d(bVar2);
            this.f99746f = new com.avito.android.bbl.screens.limit_increase.mvi.b(bVar2, new com.avito.android.bbl.screens.limit_increase.mvi.domain.d(lVar, lVarA, uVar, uVar2));
            this.f99747g = new C3007c(gVar);
            u<C28478k> uVarD = dagger.internal.g.d(new k(jVar, dagger.internal.l.a(rVar)));
            this.f99748h = uVarD;
            this.f99749i = com.avito.android.advert.item.delivery_suggests.l.i(this.f99747g, uVarD);
            this.f99750j = dagger.internal.l.a(bool);
            this.f99751k = new com.avito.android.bbl.screens.limit_increase.ui.h(new com.avito.android.bbl.screens.limit_increase.mvi.g(this.f99745e, this.f99746f, com.avito.android.bbl.screens.limit_increase.mvi.i.a(), com.avito.android.bbl.screens.limit_increase.mvi.k.a(), this.f99749i, this.f99750j));
        }

        @Override // com.avito.android.bbl.screens.limit_increase.di.d
        public final void a(LimitIncreaseFragment limitIncreaseFragment) {
            limitIncreaseFragment.f99815n0 = this.f99751k;
            limitIncreaseFragment.f99817p0 = this.f99749i.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f99741a.u4();
            t.c(aVarU4);
            limitIncreaseFragment.f99818q0 = aVarU4;
        }
    }

    public static d.a a() {
        return new C3005b();
    }
}
