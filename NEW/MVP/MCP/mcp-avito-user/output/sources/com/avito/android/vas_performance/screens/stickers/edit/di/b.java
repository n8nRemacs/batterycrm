package com.avito.android.vas_performance.screens.stickers.edit.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.paid_services.PaidServicesResultRepository;
import com.avito.android.util.R0;
import com.avito.android.vas_performance.screens.stickers.edit.di.d;
import com.avito.android.vas_performance.screens.stickers.edit.mvi.m;
import com.avito.android.vas_performance.screens.stickers.edit.ui.StickersEditFragment;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import zL0.InterfaceC50482a;

/* compiled from: DaggerStickersEditComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class b {

    /* compiled from: DaggerStickersEditComponent.java */
    /* renamed from: com.avito.android.vas_performance.screens.stickers.edit.di.b$b, reason: collision with other inner class name */
    public static final class C9938b implements d.a {
        public C9938b() {
        }

        @Override // com.avito.android.vas_performance.screens.stickers.edit.di.d.a
        public final d a(String str, boolean z12, PaidServicesResultRepository paidServicesResultRepository, r rVar, g gVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(gVar, interfaceC39417a, str, Boolean.valueOf(z12), paidServicesResultRepository, rVar, null);
        }
    }

    /* compiled from: DaggerStickersEditComponent.java */
    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f320754a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC50482a> f320755b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f320756c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.vas_performance.screens.stickers.edit.mvi.f f320757d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.vas_performance.screens.stickers.edit.mvi.d f320758e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28481c> f320759f;

        /* renamed from: g, reason: collision with root package name */
        public final u<C28478k> f320760g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f320761h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.l f320762i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.vas_performance.screens.stickers.edit.ui.g f320763j;

        /* compiled from: DaggerStickersEditComponent.java */
        public static final class a implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final g f320764a;

            public a(g gVar) {
                this.f320764a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f320764a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerStickersEditComponent.java */
        /* renamed from: com.avito.android.vas_performance.screens.stickers.edit.di.b$c$b, reason: collision with other inner class name */
        public static final class C9939b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final g f320765a;

            public C9939b(g gVar) {
                this.f320765a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f320765a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerStickersEditComponent.java */
        /* renamed from: com.avito.android.vas_performance.screens.stickers.edit.di.b$c$c, reason: collision with other inner class name */
        public static final class C9940c implements u<InterfaceC50482a> {

            /* renamed from: a, reason: collision with root package name */
            public final g f320766a;

            public C9940c(g gVar) {
                this.f320766a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC50482a interfaceC50482aO0 = this.f320766a.o0();
                t.c(interfaceC50482aO0);
                return interfaceC50482aO0;
            }
        }

        public c(g gVar, cv.b bVar, String str, Boolean bool, PaidServicesResultRepository paidServicesResultRepository, r rVar, a aVar) {
            this.f320754a = bVar;
            this.f320755b = new C9940c(gVar);
            this.f320756c = new a(gVar);
            dagger.internal.l lVarA = dagger.internal.l.a(str);
            u<InterfaceC50482a> uVar = this.f320755b;
            u<R0> uVar2 = this.f320756c;
            com.avito.android.vas_performance.screens.stickers.edit.mvi.domain.b bVar2 = new com.avito.android.vas_performance.screens.stickers.edit.mvi.domain.b(lVarA, uVar, uVar2);
            this.f320757d = new com.avito.android.vas_performance.screens.stickers.edit.mvi.f(bVar2);
            this.f320758e = new com.avito.android.vas_performance.screens.stickers.edit.mvi.d(new com.avito.android.vas_performance.screens.stickers.edit.mvi.domain.d(lVarA, uVar, uVar2), bVar2, lVarA);
            this.f320759f = new C9939b(gVar);
            u<C28478k> uVarD = dagger.internal.g.d(new k(dagger.internal.l.a(rVar)));
            this.f320760g = uVarD;
            this.f320761h = com.avito.android.advert.item.delivery_suggests.l.i(this.f320759f, uVarD);
            this.f320762i = dagger.internal.l.a(bool);
            this.f320763j = new com.avito.android.vas_performance.screens.stickers.edit.ui.g(new com.avito.android.vas_performance.screens.stickers.edit.mvi.i(this.f320757d, this.f320758e, com.avito.android.vas_performance.screens.stickers.edit.mvi.k.a(), m.a(), this.f320761h, this.f320762i));
        }

        @Override // com.avito.android.vas_performance.screens.stickers.edit.di.d
        public final void a(StickersEditFragment stickersEditFragment) {
            stickersEditFragment.f320828n0 = this.f320763j;
            stickersEditFragment.f320830p0 = this.f320761h.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f320754a.u4();
            t.c(aVarU4);
            stickersEditFragment.f320831q0 = aVarU4;
        }
    }

    public static d.a a() {
        return new C9938b();
    }
}
