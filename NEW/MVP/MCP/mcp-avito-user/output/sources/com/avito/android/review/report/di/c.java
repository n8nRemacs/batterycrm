package com.avito.android.review.report.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.review.report.ComfortableDealReviewsActivity;
import com.avito.android.review.report.di.a;
import com.avito.android.review.report.mvi.h;
import com.avito.android.review.report.mvi.j;
import com.avito.android.review.report.mvi.n;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerComfortableDealReviewsComponent.java */
@e
/* loaded from: classes12.dex */
public final class c {

    /* compiled from: DaggerComfortableDealReviewsComponent.java */
    public static final class b implements com.avito.android.review.report.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC28481c> f255389a;

        /* renamed from: b, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f255390b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.review.data_source.a> f255391c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.review.report.mvi.b f255392d;

        /* renamed from: e, reason: collision with root package name */
        public final n f255393e;

        /* compiled from: DaggerComfortableDealReviewsComponent.java */
        public static final class a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.review.report.di.b f255394a;

            public a(com.avito.android.review.report.di.b bVar) {
                this.f255394a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f255394a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerComfortableDealReviewsComponent.java */
        /* renamed from: com.avito.android.review.report.di.c$b$b, reason: collision with other inner class name */
        public static final class C7646b implements u<com.avito.android.review.data_source.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.review.report.di.b f255395a;

            public C7646b(com.avito.android.review.report.di.b bVar) {
                this.f255395a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f255395a.Lb();
            }
        }

        public b(com.avito.android.review.report.di.b bVar, C28478k c28478k, a aVar) {
            this.f255389a = new a(bVar);
            this.f255390b = com.avito.android.actions_sheet.a.D(l.a(c28478k), this.f255389a);
            this.f255392d = new com.avito.android.review.report.mvi.b(new C7646b(bVar));
            this.f255393e = new n(new h(com.avito.android.review.report.mvi.e.a(), com.avito.android.review.report.mvi.l.a(), j.a(), this.f255390b, this.f255392d));
        }

        @Override // com.avito.android.review.report.di.a
        public final void a(ComfortableDealReviewsActivity comfortableDealReviewsActivity) {
            comfortableDealReviewsActivity.f255368m = this.f255393e;
        }
    }

    /* compiled from: DaggerComfortableDealReviewsComponent.java */
    /* renamed from: com.avito.android.review.report.di.c$c, reason: collision with other inner class name */
    public static final class C7647c implements a.InterfaceC7645a {
        public C7647c() {
        }

        @Override // com.avito.android.review.report.di.a.InterfaceC7645a
        public final com.avito.android.review.report.di.a a(com.avito.android.review.report.di.b bVar, C28478k c28478k) {
            return new b(bVar, c28478k, null);
        }
    }

    public static a.InterfaceC7645a a() {
        return new C7647c();
    }
}
