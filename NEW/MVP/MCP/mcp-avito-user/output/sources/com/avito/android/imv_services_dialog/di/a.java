package com.avito.android.imv_services_dialog.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.imv_services_dialog.ImvServicesDialogFragment;
import com.avito.android.imv_services_dialog.ImvServicesDialogScreenParams;
import com.avito.android.imv_services_dialog.di.b;
import com.avito.android.imv_services_dialog.mvi.d;
import com.avito.android.imv_services_dialog.mvi.g;
import com.avito.android.imv_services_dialog.mvi.i;
import com.avito.android.imv_services_dialog.mvi.k;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import mN.InterfaceC43983a;

/* compiled from: DaggerImvServicesDialogComponent.java */
@e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerImvServicesDialogComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.imv_services_dialog.di.b.a
        public final com.avito.android.imv_services_dialog.di.b a(ImvServicesDialogScreenParams imvServicesDialogScreenParams, C28478k c28478k, com.avito.android.imv_services_dialog.di.c cVar, InterfaceC39417a interfaceC39417a) {
            imvServicesDialogScreenParams.getClass();
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, imvServicesDialogScreenParams, c28478k, null);
        }
    }

    /* compiled from: DaggerImvServicesDialogComponent.java */
    public static final class c implements com.avito.android.imv_services_dialog.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f170778a;

        /* renamed from: b, reason: collision with root package name */
        public final d f170779b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC43983a> f170780c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.imv_services_dialog.mvi.b f170781d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28481c> f170782e;

        /* renamed from: f, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f170783f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.imv_services_dialog.e f170784g;

        /* compiled from: DaggerImvServicesDialogComponent.java */
        /* renamed from: com.avito.android.imv_services_dialog.di.a$c$a, reason: collision with other inner class name */
        public static final class C5055a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.imv_services_dialog.di.c f170785a;

            public C5055a(com.avito.android.imv_services_dialog.di.c cVar) {
                this.f170785a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f170785a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerImvServicesDialogComponent.java */
        public static final class b implements u<InterfaceC43983a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.imv_services_dialog.di.c f170786a;

            public b(com.avito.android.imv_services_dialog.di.c cVar) {
                this.f170786a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f170786a.Fe();
            }
        }

        public c(com.avito.android.imv_services_dialog.di.c cVar, cv.b bVar, ImvServicesDialogScreenParams imvServicesDialogScreenParams, C28478k c28478k, C5054a c5054a) {
            this.f170778a = bVar;
            this.f170779b = new d(l.a(imvServicesDialogScreenParams));
            this.f170781d = new com.avito.android.imv_services_dialog.mvi.b(new b(cVar));
            this.f170782e = new C5055a(cVar);
            this.f170783f = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f170782e);
            this.f170784g = new com.avito.android.imv_services_dialog.e(new g(this.f170779b, this.f170781d, i.a(), k.a(), this.f170783f));
        }

        @Override // com.avito.android.imv_services_dialog.di.b
        public final void a(ImvServicesDialogFragment imvServicesDialogFragment) {
            imvServicesDialogFragment.f170722i0 = this.f170784g;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f170778a.u4();
            t.c(aVarU4);
            imvServicesDialogFragment.f170724k0 = aVarU4;
            imvServicesDialogFragment.f170725l0 = this.f170783f.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
