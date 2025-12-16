package com.avito.android.autoteka.di.previewsearch;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.autoteka.deeplinks.AutotekaPreviewSearchDetails;
import com.avito.android.autoteka.di.previewsearch.a;
import com.avito.android.autoteka.presentation.previewsearch.AutotekaPreviewSearchActivity;
import com.avito.android.autoteka.presentation.previewsearch.f;
import com.avito.android.autoteka.presentation.previewsearch.h;
import com.avito.android.autoteka.presentation.previewsearch.mvi.g;
import com.avito.android.autoteka.presentation.previewsearch.mvi.i;
import com.avito.android.autoteka.presentation.previewsearch.mvi.k;
import com.avito.android.autoteka.presentation.previewsearch.mvi.m;
import com.avito.android.photo_gallery.PhotoGalleryIntentFactory;
import com.avito.konveyor.adapter.j;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import xj0.InterfaceC49957a;

/* compiled from: DaggerAutotekaPreviewSearchComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class f {

    /* compiled from: DaggerAutotekaPreviewSearchComponent.java */
    public static final class b implements com.avito.android.autoteka.di.previewsearch.a {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC49957a> f96512a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.autoteka.data.previewSearch.a> f96513b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f96514c;

        /* renamed from: d, reason: collision with root package name */
        public final l f96515d;

        /* renamed from: e, reason: collision with root package name */
        public final g f96516e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.autoteka.data.a> f96517f;

        /* renamed from: g, reason: collision with root package name */
        public final u<PhotoGalleryIntentFactory> f96518g;

        /* renamed from: h, reason: collision with root package name */
        public final k f96519h;

        /* renamed from: i, reason: collision with root package name */
        public final m f96520i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC28481c> f96521j;

        /* renamed from: k, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f96522k;

        /* renamed from: l, reason: collision with root package name */
        public final l f96523l;

        /* renamed from: m, reason: collision with root package name */
        public final l f96524m;

        /* renamed from: n, reason: collision with root package name */
        public final com.avito.android.autoteka.items.readyToPreviewSearch.b f96525n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f96526o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f96527p;

        /* renamed from: q, reason: collision with root package name */
        public final u<j> f96528q;

        /* compiled from: DaggerAutotekaPreviewSearchComponent.java */
        public static final class a implements u<com.avito.android.autoteka.data.a> {

            /* renamed from: a, reason: collision with root package name */
            public final yf.l f96529a;

            public a(yf.l lVar) {
                this.f96529a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.autoteka.data.a aVarT1 = this.f96529a.T1();
                t.c(aVarT1);
                return aVarT1;
            }
        }

        /* compiled from: DaggerAutotekaPreviewSearchComponent.java */
        /* renamed from: com.avito.android.autoteka.di.previewsearch.f$b$b, reason: collision with other inner class name */
        public static final class C2863b implements u<InterfaceC49957a> {

            /* renamed from: a, reason: collision with root package name */
            public final yf.l f96530a;

            public C2863b(yf.l lVar) {
                this.f96530a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC49957a interfaceC49957aZa = this.f96530a.Za();
                t.c(interfaceC49957aZa);
                return interfaceC49957aZa;
            }
        }

        /* compiled from: DaggerAutotekaPreviewSearchComponent.java */
        public static final class c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final yf.l f96531a;

            public c(yf.l lVar) {
                this.f96531a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f96531a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerAutotekaPreviewSearchComponent.java */
        public static final class d implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f96532a;

            public d(cv.b bVar) {
                this.f96532a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f96532a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerAutotekaPreviewSearchComponent.java */
        public static final class e implements u<PhotoGalleryIntentFactory> {

            /* renamed from: a, reason: collision with root package name */
            public final yf.l f96533a;

            public e(yf.l lVar) {
                this.f96533a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f96533a.F0();
            }
        }

        public b() {
            throw null;
        }

        public b(yf.l lVar, cv.b bVar, C28478k c28478k, Y41.l lVar2, AutotekaPreviewSearchDetails autotekaPreviewSearchDetails, a aVar) {
            this.f96513b = dagger.internal.g.d(new com.avito.android.autoteka.data.previewSearch.c(new C2863b(lVar)));
            this.f96514c = new d(bVar);
            l lVarA = l.a(autotekaPreviewSearchDetails);
            this.f96515d = lVarA;
            u<com.avito.android.autoteka.data.previewSearch.a> uVar = this.f96513b;
            u<com.avito.android.deeplink_handler.handler.composite.a> uVar2 = this.f96514c;
            this.f96516e = new g(lVarA, uVar, uVar2);
            this.f96519h = new k(uVar2, new a(lVar), new e(lVar));
            this.f96520i = new m(lVarA);
            this.f96521j = new c(lVar);
            u<ScreenPerformanceTracker> uVarD = com.avito.android.actions_sheet.a.D(l.a(c28478k), this.f96521j);
            this.f96522k = uVarD;
            this.f96523l = l.a(new h(new com.avito.android.autoteka.presentation.previewsearch.g(new i(this.f96516e, this.f96519h, this.f96520i, uVarD, this.f96515d))));
            l lVarA2 = l.a(lVar2);
            this.f96524m = lVarA2;
            this.f96525n = new com.avito.android.autoteka.items.readyToPreviewSearch.b(new com.avito.android.autoteka.items.readyToPreviewSearch.f(lVarA2));
            com.avito.android.autoteka.items.previewGeneration.b bVar2 = new com.avito.android.autoteka.items.previewGeneration.b(com.avito.android.autoteka.items.previewGeneration.e.a());
            l lVar3 = this.f96524m;
            u<com.avito.konveyor.a> uVarD2 = dagger.internal.g.d(new com.avito.android.autoteka.di.previewsearch.d(this.f96525n, bVar2, new com.avito.android.autoteka.items.preview.b(new com.avito.android.autoteka.items.preview.g(lVar3)), new com.avito.android.autoteka.items.fullScreenError.previewsearch.b(new com.avito.android.autoteka.items.fullScreenError.previewsearch.e(lVar3))));
            this.f96526o = uVarD2;
            u<com.avito.konveyor.adapter.a> uVarD3 = dagger.internal.g.d(new com.avito.android.autoteka.di.previewsearch.c(uVarD2));
            this.f96527p = uVarD3;
            this.f96528q = dagger.internal.g.d(new com.avito.android.autoteka.di.previewsearch.e(uVarD3, this.f96526o));
        }

        @Override // com.avito.android.autoteka.di.previewsearch.a
        public final void a(AutotekaPreviewSearchActivity autotekaPreviewSearchActivity) {
            autotekaPreviewSearchActivity.f97530m = (f.a) this.f96523l.f393949a;
            autotekaPreviewSearchActivity.f97532o = this.f96522k.get();
            autotekaPreviewSearchActivity.f97533p = this.f96528q.get();
            autotekaPreviewSearchActivity.f97534q = this.f96527p.get();
        }
    }

    /* compiled from: DaggerAutotekaPreviewSearchComponent.java */
    public static final class c implements a.InterfaceC2862a {
        public c() {
        }

        @Override // com.avito.android.autoteka.di.previewsearch.a.InterfaceC2862a
        public final com.avito.android.autoteka.di.previewsearch.a a(yf.l lVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, Y41.l lVar2, AutotekaPreviewSearchDetails autotekaPreviewSearchDetails) {
            interfaceC39417a.getClass();
            autotekaPreviewSearchDetails.getClass();
            return new b(lVar, interfaceC39417a, c28478k, lVar2, autotekaPreviewSearchDetails, null);
        }
    }

    public static a.InterfaceC2862a a() {
        return new c();
    }
}
