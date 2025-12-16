package com.avito.android.bbl.screens.contact_history.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bbl.screens.contact_history.BblContactHistoryFragment;
import com.avito.android.bbl.screens.contact_history.di.a;
import com.avito.android.bbl.screens.contact_history.k;
import com.avito.android.bbl.screens.contact_history.mvi.i;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import nh.InterfaceC44423b;
import oh.InterfaceC44774a;

/* compiled from: DaggerBblContactHistoryComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class h {

    /* compiled from: DaggerBblContactHistoryComponent.java */
    public static final class b implements com.avito.android.bbl.screens.contact_history.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f99644a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC44774a> f99645b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f99646c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.bbl.screens.contact_history.mvi.d f99647d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.bbl.screens.contact_history.mvi.b f99648e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28481c> f99649f;

        /* renamed from: g, reason: collision with root package name */
        public final u<C28478k> f99650g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f99651h;

        /* renamed from: i, reason: collision with root package name */
        public final k f99652i;

        /* compiled from: DaggerBblContactHistoryComponent.java */
        public static final class a implements u<InterfaceC44774a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44423b f99653a;

            public a(InterfaceC44423b interfaceC44423b) {
                this.f99653a = interfaceC44423b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC44774a interfaceC44774aR3 = this.f99653a.r3();
                t.c(interfaceC44774aR3);
                return interfaceC44774aR3;
            }
        }

        /* compiled from: DaggerBblContactHistoryComponent.java */
        /* renamed from: com.avito.android.bbl.screens.contact_history.di.h$b$b, reason: collision with other inner class name */
        public static final class C3001b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44423b f99654a;

            public C3001b(InterfaceC44423b interfaceC44423b) {
                this.f99654a = interfaceC44423b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f99654a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerBblContactHistoryComponent.java */
        public static final class c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44423b f99655a;

            public c(InterfaceC44423b interfaceC44423b) {
                this.f99655a = interfaceC44423b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f99655a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(InterfaceC44423b interfaceC44423b, cv.b bVar, r rVar, Long l12, a aVar) {
            this.f99644a = bVar;
            this.f99645b = new a(interfaceC44423b);
            this.f99646c = new C3001b(interfaceC44423b);
            com.avito.android.bbl.screens.contact_history.domain.b bVar2 = new com.avito.android.bbl.screens.contact_history.domain.b(l.a(l12), this.f99645b, this.f99646c);
            this.f99647d = new com.avito.android.bbl.screens.contact_history.mvi.d(bVar2);
            this.f99648e = new com.avito.android.bbl.screens.contact_history.mvi.b(bVar2);
            this.f99649f = new c(interfaceC44423b);
            u<C28478k> uVarD = dagger.internal.g.d(new g(l.a(rVar)));
            this.f99650g = uVarD;
            this.f99651h = com.avito.android.advert.item.delivery_suggests.l.i(this.f99649f, uVarD);
            this.f99652i = new k(new com.avito.android.bbl.screens.contact_history.mvi.g(this.f99647d, this.f99648e, i.a(), com.avito.android.bbl.screens.contact_history.mvi.k.a(), this.f99651h));
        }

        @Override // com.avito.android.bbl.screens.contact_history.di.a
        public final void a(BblContactHistoryFragment bblContactHistoryFragment) {
            bblContactHistoryFragment.f99618n0 = this.f99652i;
            bblContactHistoryFragment.f99620p0 = this.f99651h.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f99644a.u4();
            t.c(aVarU4);
            bblContactHistoryFragment.f99622r0 = aVarU4;
        }
    }

    /* compiled from: DaggerBblContactHistoryComponent.java */
    public static final class c implements a.InterfaceC3000a {
        public c() {
        }

        @Override // com.avito.android.bbl.screens.contact_history.di.a.InterfaceC3000a
        public final com.avito.android.bbl.screens.contact_history.di.a a(InterfaceC44423b interfaceC44423b, InterfaceC39417a interfaceC39417a, r rVar, long j12) {
            interfaceC39417a.getClass();
            return new b(interfaceC44423b, interfaceC39417a, rVar, Long.valueOf(j12), null);
        }
    }

    public static a.InterfaceC3000a a() {
        return new c();
    }
}
