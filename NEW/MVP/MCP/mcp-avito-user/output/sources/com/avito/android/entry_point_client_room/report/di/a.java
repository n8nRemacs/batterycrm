package com.avito.android.entry_point_client_room.report.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.entry_point_client_room.report.SendReportFragment;
import com.avito.android.entry_point_client_room.report.di.d;
import com.avito.android.entry_point_client_room.report.mvi.h;
import com.avito.android.entry_point_client_room.report.mvi.j;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import oz.InterfaceC44959a;

/* compiled from: DaggerSendReportComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerSendReportComponent.java */
    public static final class b implements d.a {
        public b() {
        }

        @Override // com.avito.android.entry_point_client_room.report.di.d.a
        public final d a(e eVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, String str, String str2, Integer num) {
            interfaceC39417a.getClass();
            return new c(eVar, interfaceC39417a, c28478k, str, str2, num, null);
        }
    }

    /* compiled from: DaggerSendReportComponent.java */
    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f147672a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC44959a> f147673b;

        /* renamed from: c, reason: collision with root package name */
        public final l f147674c;

        /* renamed from: d, reason: collision with root package name */
        public final l f147675d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.entry_point_client_room.report.mvi.c f147676e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28481c> f147677f;

        /* renamed from: g, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f147678g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.entry_point_client_room.report.mvi.l f147679h;

        /* compiled from: DaggerSendReportComponent.java */
        /* renamed from: com.avito.android.entry_point_client_room.report.di.a$c$a, reason: collision with other inner class name */
        public static final class C4320a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final e f147680a;

            public C4320a(e eVar) {
                this.f147680a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f147680a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerSendReportComponent.java */
        public static final class b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f147681a;

            public b(cv.b bVar) {
                this.f147681a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f147681a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerSendReportComponent.java */
        /* renamed from: com.avito.android.entry_point_client_room.report.di.a$c$c, reason: collision with other inner class name */
        public static final class C4321c implements u<InterfaceC44959a> {

            /* renamed from: a, reason: collision with root package name */
            public final e f147682a;

            public C4321c(e eVar) {
                this.f147682a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f147682a.b5();
            }
        }

        public c(e eVar, cv.b bVar, C28478k c28478k, String str, String str2, Integer num, C4319a c4319a) {
            this.f147672a = new b(bVar);
            this.f147673b = new C4321c(eVar);
            this.f147674c = l.b(str2);
            this.f147675d = l.b(str);
            this.f147676e = new com.avito.android.entry_point_client_room.report.mvi.c(this.f147674c, this.f147675d, l.b(num), this.f147672a, this.f147673b);
            this.f147677f = new C4320a(eVar);
            this.f147678g = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f147677f);
            this.f147679h = new com.avito.android.entry_point_client_room.report.mvi.l(new com.avito.android.entry_point_client_room.report.mvi.f(this.f147676e, j.a(), h.a(), this.f147678g));
        }

        @Override // com.avito.android.entry_point_client_room.report.di.d
        public final void a(SendReportFragment sendReportFragment) {
            sendReportFragment.f147649n0 = this.f147679h;
        }
    }

    public static d.a a() {
        return new b();
    }
}
