package com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.di.b;
import com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi.f;
import com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi.i;
import com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi.k;
import com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi.m;
import com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.ui.JsxActualizationBottomSheetDialogFragment;
import com.avito.android.deep_linking.links.DeepLink;
import cv.InterfaceC39417a;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import xt.C49996b;

/* compiled from: DaggerJsxActualizationBottomSheetComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerJsxActualizationBottomSheetComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.di.b.a
        public final com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.di.b a(e eVar, InterfaceC39417a interfaceC39417a, r rVar, DeepLink deepLink, boolean z12) {
            interfaceC39417a.getClass();
            return new c(eVar, interfaceC39417a, rVar, deepLink, Boolean.valueOf(z12), null);
        }
    }

    /* compiled from: DaggerJsxActualizationBottomSheetComponent.java */
    public static final class c implements com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f131465a;

        /* renamed from: b, reason: collision with root package name */
        public final l f131466b;

        /* renamed from: c, reason: collision with root package name */
        public final u<DP.a> f131467c;

        /* renamed from: d, reason: collision with root package name */
        public final C49996b f131468d;

        /* renamed from: e, reason: collision with root package name */
        public final f f131469e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28481c> f131470f;

        /* renamed from: g, reason: collision with root package name */
        public final u<C28478k> f131471g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f131472h;

        /* renamed from: i, reason: collision with root package name */
        public final zt.b f131473i;

        /* compiled from: DaggerJsxActualizationBottomSheetComponent.java */
        /* renamed from: com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.di.a$c$a, reason: collision with other inner class name */
        public static final class C3925a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final e f131474a;

            public C3925a(e eVar) {
                this.f131474a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f131474a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerJsxActualizationBottomSheetComponent.java */
        public static final class b implements u<DP.a> {

            /* renamed from: a, reason: collision with root package name */
            public final e f131475a;

            public b(e eVar) {
                this.f131475a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                DP.a aVarU1 = this.f131475a.u1();
                t.c(aVarU1);
                return aVarU1;
            }
        }

        /* compiled from: DaggerJsxActualizationBottomSheetComponent.java */
        /* renamed from: com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.di.a$c$c, reason: collision with other inner class name */
        public static final class C3926c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f131476a;

            public C3926c(cv.b bVar) {
                this.f131476a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f131476a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        public c(e eVar, cv.b bVar, r rVar, DeepLink deepLink, Boolean bool, C3924a c3924a) {
            this.f131465a = new C3926c(bVar);
            this.f131466b = l.b(deepLink);
            this.f131468d = new C49996b(new b(eVar));
            l lVarA = l.a(bool);
            C49996b c49996b = this.f131468d;
            l lVar = this.f131466b;
            this.f131469e = new f(this.f131465a, lVar, new com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi.action_handler.d(c49996b, lVar, lVarA));
            this.f131470f = new C3925a(eVar);
            u<C28478k> uVarD = g.d(new d(l.a(rVar)));
            this.f131471g = uVarD;
            this.f131472h = com.avito.android.advert.item.delivery_suggests.l.i(this.f131470f, uVarD);
            this.f131473i = new zt.b(new i(m.a(), this.f131469e, k.a(), this.f131472h));
        }

        @Override // com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.di.b
        public final void a(JsxActualizationBottomSheetDialogFragment jsxActualizationBottomSheetDialogFragment) {
            jsxActualizationBottomSheetDialogFragment.f131532h0 = this.f131473i;
            jsxActualizationBottomSheetDialogFragment.f131533i0 = this.f131472h.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
