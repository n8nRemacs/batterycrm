package com.avito.android.freemium.screens.contact_history.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.freemium.screens.contact_history.FreemiumContactHistoryFragment;
import com.avito.android.freemium.screens.contact_history.di.b;
import com.avito.android.freemium.screens.contact_history.k;
import com.avito.android.freemium.screens.contact_history.mvi.i;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerFreemiumContactHistoryComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerFreemiumContactHistoryComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.freemium.screens.contact_history.di.b.a
        public final com.avito.android.freemium.screens.contact_history.di.b a(YE.c cVar, InterfaceC39417a interfaceC39417a, r rVar, long j12) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, rVar, Long.valueOf(j12), null);
        }
    }

    /* compiled from: DaggerFreemiumContactHistoryComponent.java */
    public static final class c implements com.avito.android.freemium.screens.contact_history.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f158955a;

        /* renamed from: b, reason: collision with root package name */
        public final u<ZE.a> f158956b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f158957c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.freemium.screens.contact_history.mvi.d f158958d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.freemium.screens.contact_history.mvi.b f158959e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28481c> f158960f;

        /* renamed from: g, reason: collision with root package name */
        public final u<C28478k> f158961g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f158962h;

        /* renamed from: i, reason: collision with root package name */
        public final k f158963i;

        /* compiled from: DaggerFreemiumContactHistoryComponent.java */
        /* renamed from: com.avito.android.freemium.screens.contact_history.di.a$c$a, reason: collision with other inner class name */
        public static final class C4643a implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final YE.c f158964a;

            public C4643a(YE.c cVar) {
                this.f158964a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f158964a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerFreemiumContactHistoryComponent.java */
        public static final class b implements u<ZE.a> {

            /* renamed from: a, reason: collision with root package name */
            public final YE.c f158965a;

            public b(YE.c cVar) {
                this.f158965a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                ZE.a aVarYf = this.f158965a.yf();
                t.c(aVarYf);
                return aVarYf;
            }
        }

        /* compiled from: DaggerFreemiumContactHistoryComponent.java */
        /* renamed from: com.avito.android.freemium.screens.contact_history.di.a$c$c, reason: collision with other inner class name */
        public static final class C4644c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final YE.c f158966a;

            public C4644c(YE.c cVar) {
                this.f158966a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f158966a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(YE.c cVar, cv.b bVar, r rVar, Long l12, C4642a c4642a) {
            this.f158955a = bVar;
            this.f158956b = new b(cVar);
            this.f158957c = new C4643a(cVar);
            com.avito.android.freemium.screens.contact_history.domain.b bVar2 = new com.avito.android.freemium.screens.contact_history.domain.b(l.a(l12), this.f158956b, this.f158957c);
            this.f158958d = new com.avito.android.freemium.screens.contact_history.mvi.d(bVar2);
            this.f158959e = new com.avito.android.freemium.screens.contact_history.mvi.b(bVar2);
            this.f158960f = new C4644c(cVar);
            u<C28478k> uVarD = dagger.internal.g.d(new h(l.a(rVar)));
            this.f158961g = uVarD;
            this.f158962h = com.avito.android.advert.item.delivery_suggests.l.i(this.f158960f, uVarD);
            this.f158963i = new k(new com.avito.android.freemium.screens.contact_history.mvi.g(this.f158958d, this.f158959e, i.a(), com.avito.android.freemium.screens.contact_history.mvi.k.a(), this.f158962h));
        }

        @Override // com.avito.android.freemium.screens.contact_history.di.b
        public final void a(FreemiumContactHistoryFragment freemiumContactHistoryFragment) {
            freemiumContactHistoryFragment.f158935n0 = this.f158963i;
            freemiumContactHistoryFragment.f158937p0 = this.f158962h.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f158955a.u4();
            t.c(aVarU4);
            freemiumContactHistoryFragment.f158939r0 = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}
