package com.avito.android.related_products.bottom_sheet.di;

import FV0.h;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.analytics.screens.w;
import com.avito.android.analytics.screens.x;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.lib.beduin_v2.feature.di.C31142p0;
import com.avito.android.lib.beduin_v2.feature.di.C31144q0;
import com.avito.android.lib.beduin_v2.feature.di.C31145r0;
import com.avito.android.lib.beduin_v2.feature.di.C31151u0;
import com.avito.android.lib.beduin_v2.feature.di.C31153v0;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.related_products.bottom_sheet.RelatedProductsPageFragment;
import com.avito.android.related_products.bottom_sheet.di.b;
import com.avito.android.related_products.bottom_sheet.k;
import com.avito.android.related_products.bottom_sheet.m;
import com.avito.android.related_products.bottom_sheet.mvi.i;
import com.avito.android.related_products.bottom_sheet.q;
import com.avito.android.related_products.perf_const.RelatedProductsBottomSheetBeduinV2Screen;
import com.avito.android.util.R0;
import com.avito.beduin.v2.engine.component.B;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.Set;

/* compiled from: DaggerRelatedProductsBottomSheetComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerRelatedProductsBottomSheetComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.related_products.bottom_sheet.di.b.a
        public final com.avito.android.related_products.bottom_sheet.di.b a(ScreenPerformanceTracker screenPerformanceTracker, RelatedProductsBottomSheetBeduinV2Screen relatedProductsBottomSheetBeduinV2Screen, r rVar, C31138n0 c31138n0, f fVar, InterfaceC39417a interfaceC39417a) {
            screenPerformanceTracker.getClass();
            relatedProductsBottomSheetBeduinV2Screen.getClass();
            interfaceC39417a.getClass();
            return new c(c31138n0, fVar, interfaceC39417a, screenPerformanceTracker, relatedProductsBottomSheetBeduinV2Screen, rVar, null);
        }
    }

    /* compiled from: DaggerRelatedProductsBottomSheetComponent.java */
    public static final class c implements com.avito.android.related_products.bottom_sheet.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<com.avito.android.related_products.bottom_sheet.a> f252884a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.related_products.bottom_sheet.mvi.d f252885b;

        /* renamed from: c, reason: collision with root package name */
        public final l f252886c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.related_products.bottom_sheet.mvi.g f252887d;

        /* renamed from: e, reason: collision with root package name */
        public final u<n.a> f252888e;

        /* renamed from: f, reason: collision with root package name */
        public final u<B> f252889f;

        /* renamed from: g, reason: collision with root package name */
        public final u<Set<h>> f252890g;

        /* renamed from: h, reason: collision with root package name */
        public final u<R0> f252891h;

        /* renamed from: i, reason: collision with root package name */
        public final C31151u0 f252892i;

        /* renamed from: j, reason: collision with root package name */
        public final q f252893j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC28481c> f252894k;

        /* renamed from: l, reason: collision with root package name */
        public final u<w> f252895l;

        /* renamed from: m, reason: collision with root package name */
        public final l f252896m;

        /* renamed from: n, reason: collision with root package name */
        public final u<k> f252897n;

        /* compiled from: DaggerRelatedProductsBottomSheetComponent.java */
        /* renamed from: com.avito.android.related_products.bottom_sheet.di.a$c$a, reason: collision with other inner class name */
        public static final class C7599a implements u<com.avito.android.related_products.bottom_sheet.a> {

            /* renamed from: a, reason: collision with root package name */
            public final f f252898a;

            public C7599a(f fVar) {
                this.f252898a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.related_products.bottom_sheet.a aVarPl = this.f252898a.Pl();
                t.c(aVarPl);
                return aVarPl;
            }
        }

        /* compiled from: DaggerRelatedProductsBottomSheetComponent.java */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final f f252899a;

            public b(f fVar) {
                this.f252899a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f252899a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerRelatedProductsBottomSheetComponent.java */
        /* renamed from: com.avito.android.related_products.bottom_sheet.di.a$c$c, reason: collision with other inner class name */
        public static final class C7600c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final f f252900a;

            public C7600c(f fVar) {
                this.f252900a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f252900a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(C31138n0 c31138n0, f fVar, cv.b bVar, ScreenPerformanceTracker screenPerformanceTracker, Screen screen, r rVar, C7598a c7598a) {
            this.f252885b = new com.avito.android.related_products.bottom_sheet.mvi.d(new C7599a(fVar));
            this.f252886c = l.a(screenPerformanceTracker);
            this.f252887d = new com.avito.android.related_products.bottom_sheet.mvi.g(this.f252885b, com.avito.android.related_products.bottom_sheet.mvi.b.a(), i.a(), com.avito.android.related_products.bottom_sheet.mvi.k.a(), this.f252886c);
            this.f252888e = dagger.internal.B.a(C31142p0.a(c31138n0));
            this.f252889f = dagger.internal.B.a(C31145r0.a(c31138n0));
            this.f252890g = dagger.internal.B.a(C31153v0.a(c31138n0));
            this.f252891h = new b(fVar);
            this.f252892i = C31151u0.a(c31138n0);
            this.f252893j = new q(this.f252887d, this.f252888e, this.f252889f, this.f252890g, this.f252891h, this.f252892i, C31144q0.a(c31138n0));
            this.f252895l = dagger.internal.g.d(new x(new C7600c(fVar)));
            this.f252896m = l.a(screen);
            l lVarA = l.a(rVar);
            this.f252897n = dagger.internal.g.d(new m(this.f252886c, this.f252896m, lVarA, this.f252895l));
        }

        @Override // com.avito.android.related_products.bottom_sheet.di.b
        public final void a(RelatedProductsPageFragment relatedProductsPageFragment) {
            relatedProductsPageFragment.f252831o0 = this.f252893j;
            relatedProductsPageFragment.f252833q0 = this.f252897n.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
