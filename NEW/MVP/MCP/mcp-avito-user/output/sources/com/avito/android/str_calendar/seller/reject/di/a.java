package com.avito.android.str_calendar.seller.reject.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.model.StrSellerCalendarRejectInfo;
import com.avito.android.str_calendar.seller.reject.StrCalendarRejectFragment;
import com.avito.android.str_calendar.seller.reject.di.b;
import com.avito.android.str_calendar.seller.reject.mvi.g;
import com.avito.android.str_calendar.seller.reject.mvi.i;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerStrCalendarRejectComponent.java */
@e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerStrCalendarRejectComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.str_calendar.seller.reject.di.b.a
        public final com.avito.android.str_calendar.seller.reject.di.b a(com.avito.android.str_calendar.seller.reject.di.c cVar, com.avito.android.str_calendar.seller.core.di.c cVar2, InterfaceC39417a interfaceC39417a, C28478k c28478k, StrSellerCalendarRejectInfo strSellerCalendarRejectInfo) {
            interfaceC39417a.getClass();
            return new c(interfaceC39417a, cVar, cVar2, c28478k, strSellerCalendarRejectInfo, null);
        }
    }

    /* compiled from: DaggerStrCalendarRejectComponent.java */
    public static final class c implements com.avito.android.str_calendar.seller.reject.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f288038a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.str_calendar.seller.core.di.c f288039b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28481c> f288040c;

        /* renamed from: d, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f288041d;

        /* renamed from: e, reason: collision with root package name */
        public final l f288042e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.str_calendar.seller.reject.e f288043f;

        /* compiled from: DaggerStrCalendarRejectComponent.java */
        /* renamed from: com.avito.android.str_calendar.seller.reject.di.a$c$a, reason: collision with other inner class name */
        public static final class C8654a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_calendar.seller.reject.di.c f288044a;

            public C8654a(com.avito.android.str_calendar.seller.reject.di.c cVar) {
                this.f288044a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f288044a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        public c(cv.b bVar, com.avito.android.str_calendar.seller.reject.di.c cVar, com.avito.android.str_calendar.seller.core.di.c cVar2, C28478k c28478k, StrSellerCalendarRejectInfo strSellerCalendarRejectInfo, C8653a c8653a) {
            this.f288038a = bVar;
            this.f288039b = cVar2;
            this.f288040c = new C8654a(cVar);
            this.f288041d = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f288040c);
            this.f288042e = l.a(strSellerCalendarRejectInfo);
            this.f288043f = new com.avito.android.str_calendar.seller.reject.e(new com.avito.android.str_calendar.seller.reject.mvi.e(com.avito.android.str_calendar.seller.reject.mvi.b.a(), g.a(), i.a(), this.f288041d, this.f288042e));
        }

        @Override // com.avito.android.str_calendar.seller.reject.di.b
        public final void a(StrCalendarRejectFragment strCalendarRejectFragment) {
            strCalendarRejectFragment.f288017n0 = this.f288043f;
            strCalendarRejectFragment.f288019p0 = this.f288041d.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f288038a.u4();
            t.c(aVarU4);
            strCalendarRejectFragment.f288020q0 = aVarU4;
            com.avito.android.str_calendar.seller.core.c cVarZb = this.f288039b.zb();
            t.c(cVarZb);
            strCalendarRejectFragment.f288021r0 = cVarZb;
        }
    }

    public static b.a a() {
        return new b();
    }
}
