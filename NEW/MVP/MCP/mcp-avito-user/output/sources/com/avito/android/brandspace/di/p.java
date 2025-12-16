package com.avito.android.brandspace.di;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.brandspace.beduin_v2.BrandspaceBeduinV2Fragment;
import com.avito.android.brandspace.di.a;
import com.avito.android.deep_linking.x;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.lib.beduin_v2.feature.di.C31142p0;
import com.avito.android.lib.beduin_v2.feature.di.C31144q0;
import com.avito.android.lib.beduin_v2.feature.di.C31145r0;
import com.avito.android.lib.beduin_v2.feature.di.C31151u0;
import com.avito.android.lib.beduin_v2.feature.di.C31153v0;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.beduin.v2.engine.component.B;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import java.util.Set;

/* compiled from: DaggerBrandspaceBeduinV2Component.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class p {

    /* compiled from: DaggerBrandspaceBeduinV2Component.java */
    public static final class b implements com.avito.android.brandspace.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final dagger.internal.l f107693a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.brandspace.beduin_v2.mvi.e f107694b;

        /* renamed from: c, reason: collision with root package name */
        public final u<n.a> f107695c;

        /* renamed from: d, reason: collision with root package name */
        public final u<B> f107696d;

        /* renamed from: e, reason: collision with root package name */
        public final u<Set<FV0.h>> f107697e;

        /* renamed from: f, reason: collision with root package name */
        public final C31144q0 f107698f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f107699g;

        /* renamed from: h, reason: collision with root package name */
        public final u<x> f107700h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.brandspace.beduin_v2.d f107701i;

        /* compiled from: DaggerBrandspaceBeduinV2Component.java */
        public static final class a implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final Fu.d f107702a;

            public a(Fu.d dVar) {
                this.f107702a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarQ = this.f107702a.q();
                t.c(xVarQ);
                return xVarQ;
            }
        }

        /* compiled from: DaggerBrandspaceBeduinV2Component.java */
        /* renamed from: com.avito.android.brandspace.di.p$b$b, reason: collision with other inner class name */
        public static final class C3221b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f107703a;

            public C3221b(cv.b bVar) {
                this.f107703a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f107703a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        public b(C31138n0 c31138n0, InterfaceC30106l7 interfaceC30106l7, cv.b bVar, Fu.d dVar, ScreenPerformanceTracker screenPerformanceTracker, a aVar) {
            this.f107693a = dagger.internal.l.a(screenPerformanceTracker);
            this.f107694b = new com.avito.android.brandspace.beduin_v2.mvi.e(com.avito.android.brandspace.beduin_v2.mvi.b.a(), com.avito.android.brandspace.beduin_v2.mvi.i.a(), com.avito.android.brandspace.beduin_v2.mvi.g.a(), this.f107693a);
            this.f107695c = dagger.internal.B.a(C31142p0.a(c31138n0));
            this.f107696d = dagger.internal.B.a(C31145r0.a(c31138n0));
            this.f107697e = dagger.internal.B.a(C31153v0.a(c31138n0));
            this.f107698f = C31144q0.a(c31138n0);
            this.f107701i = new com.avito.android.brandspace.beduin_v2.d(this.f107694b, this.f107695c, this.f107696d, this.f107697e, this.f107698f, C31151u0.a(c31138n0), new C3221b(bVar), new a(dVar));
        }

        @Override // com.avito.android.brandspace.di.a
        public final void a(BrandspaceBeduinV2Fragment brandspaceBeduinV2Fragment) {
            brandspaceBeduinV2Fragment.f107505o0 = this.f107701i;
        }
    }

    /* compiled from: DaggerBrandspaceBeduinV2Component.java */
    public static final class c implements a.InterfaceC3220a {
        public c() {
        }

        @Override // com.avito.android.brandspace.di.a.InterfaceC3220a
        public final com.avito.android.brandspace.di.a a(ScreenPerformanceTracker screenPerformanceTracker, C31138n0 c31138n0, InterfaceC30106l7 interfaceC30106l7, InterfaceC39417a interfaceC39417a, Fu.d dVar) {
            screenPerformanceTracker.getClass();
            interfaceC39417a.getClass();
            return new b(c31138n0, interfaceC30106l7, interfaceC39417a, dVar, screenPerformanceTracker, null);
        }
    }

    public static a.InterfaceC3220a a() {
        return new c();
    }
}
