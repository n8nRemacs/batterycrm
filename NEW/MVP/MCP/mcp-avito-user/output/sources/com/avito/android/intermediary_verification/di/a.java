package com.avito.android.intermediary_verification.di;

import Y41.l;
import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.intermediary_verification.IntermediaryVerificationActivity;
import com.avito.android.intermediary_verification.data.model.IntermediaryVerificationData;
import com.avito.android.intermediary_verification.data.model.IntermediaryVerificationWaitingData;
import com.avito.android.intermediary_verification.di.b;
import com.avito.android.intermediary_verification.presentation.mvi.entity.IntermediaryVerificationAction;
import com.avito.android.intermediary_verification.presentation.mvi.g;
import com.avito.android.intermediary_verification.presentation.mvi.i;
import com.avito.android.intermediary_verification.presentation.mvi.k;
import com.avito.android.intermediary_verification.presentation.mvi.m;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import kotlin.G0;

/* compiled from: DaggerIntermediaryVerificationComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerIntermediaryVerificationComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.intermediary_verification.di.b.a
        public final com.avito.android.intermediary_verification.di.b a(IntermediaryVerificationData intermediaryVerificationData, IntermediaryVerificationWaitingData intermediaryVerificationWaitingData, l lVar, Resources resources, C28478k c28478k, com.avito.android.intermediary_verification.di.c cVar, InterfaceC39417a interfaceC39417a) {
            intermediaryVerificationData.getClass();
            intermediaryVerificationWaitingData.getClass();
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, intermediaryVerificationData, intermediaryVerificationWaitingData, lVar, resources, c28478k, null);
        }
    }

    /* compiled from: DaggerIntermediaryVerificationComponent.java */
    public static final class c implements com.avito.android.intermediary_verification.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final l<? super IntermediaryVerificationAction, G0> f173131a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f173132b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f173133c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f173134d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.intermediary_verification.presentation.mvi.d f173135e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28481c> f173136f;

        /* renamed from: g, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f173137g;

        /* renamed from: h, reason: collision with root package name */
        public final m f173138h;

        /* compiled from: DaggerIntermediaryVerificationComponent.java */
        /* renamed from: com.avito.android.intermediary_verification.di.a$c$a, reason: collision with other inner class name */
        public static final class C5105a implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f173139a;

            public C5105a(cv.b bVar) {
                this.f173139a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f173139a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerIntermediaryVerificationComponent.java */
        public static final class b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.intermediary_verification.di.c f173140a;

            public b(com.avito.android.intermediary_verification.di.c cVar) {
                this.f173140a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cY2 = this.f173140a.Y2();
                t.c(interfaceC28481cY2);
                return interfaceC28481cY2;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.intermediary_verification.di.c cVar, cv.b bVar, IntermediaryVerificationData intermediaryVerificationData, IntermediaryVerificationWaitingData intermediaryVerificationWaitingData, l lVar, Resources resources, C28478k c28478k, C5104a c5104a) {
            this.f173131a = lVar;
            this.f173132b = bVar;
            this.f173133c = dagger.internal.l.a(intermediaryVerificationData);
            this.f173135e = new com.avito.android.intermediary_verification.presentation.mvi.d(new C5105a(bVar));
            this.f173136f = new b(cVar);
            this.f173137g = com.avito.android.actions_sheet.a.D(dagger.internal.l.a(c28478k), this.f173136f);
            this.f173138h = new m(new g(this.f173133c, this.f173135e, com.avito.android.intermediary_verification.presentation.mvi.b.a(), i.a(), k.a(), this.f173137g));
        }

        @Override // com.avito.android.intermediary_verification.di.b
        public final void a(IntermediaryVerificationActivity intermediaryVerificationActivity) {
            intermediaryVerificationActivity.f173074m = this.f173138h;
            intermediaryVerificationActivity.f173076o = this.f173137g.get();
            intermediaryVerificationActivity.f173077p = this.f173131a;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f173132b.u4();
            t.c(aVarU4);
            intermediaryVerificationActivity.f173078q = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}
