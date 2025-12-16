package com.avito.android.photo_gallery.di;

import androidx.view.InterfaceC22983P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.ownership.Owners;
import com.avito.android.photo_gallery.GalleryFragment;
import com.avito.android.photo_gallery.di.InterfaceC33184d;
import cv.InterfaceC39417a;
import gj.d;
import java.util.Collections;
import kj.C42699b;
import pj.C47099b;

/* compiled from: DaggerGalleryComponent.java */
@dagger.internal.e
/* renamed from: com.avito.android.photo_gallery.di.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C33181a {

    /* compiled from: DaggerGalleryComponent.java */
    /* renamed from: com.avito.android.photo_gallery.di.a$b */
    public static final class b implements InterfaceC33184d.a {
        public b() {
        }

        @Override // com.avito.android.photo_gallery.di.InterfaceC33184d.a
        public final InterfaceC33184d a(e eVar, kj.c cVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, boolean z12, GalleryFragment galleryFragment) {
            interfaceC39417a.getClass();
            return new c(eVar, cVar, interfaceC39417a, c28478k, Boolean.valueOf(z12), galleryFragment, null);
        }
    }

    /* compiled from: DaggerGalleryComponent.java */
    /* renamed from: com.avito.android.photo_gallery.di.a$c */
    public static final class c implements InterfaceC33184d {

        /* renamed from: a, reason: collision with root package name */
        public final e f216907a;

        /* renamed from: b, reason: collision with root package name */
        public final kj.c f216908b;

        /* renamed from: c, reason: collision with root package name */
        public final cv.b f216909c;

        /* renamed from: d, reason: collision with root package name */
        public final C28478k f216910d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f216911e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f216912f;

        /* renamed from: g, reason: collision with root package name */
        public final W70.e f216913g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<W70.c> f216914h;

        /* compiled from: DaggerGalleryComponent.java */
        /* renamed from: com.avito.android.photo_gallery.di.a$c$a, reason: collision with other inner class name */
        public static final class C6495a implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final e f216915a;

            public C6495a(e eVar) {
                this.f216915a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f216915a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(e eVar, kj.c cVar, cv.b bVar, C28478k c28478k, Boolean bool, InterfaceC22983P interfaceC22983P, C6494a c6494a) {
            this.f216907a = eVar;
            this.f216908b = cVar;
            this.f216909c = bVar;
            this.f216910d = c28478k;
            this.f216911e = new C6495a(eVar);
            dagger.internal.u<ScreenPerformanceTracker> uVarS = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f216911e);
            this.f216912f = uVarS;
            this.f216913g = new W70.e(uVarS);
            this.f216914h = dagger.internal.g.d(new j(this.f216913g, dagger.internal.l.a(bool)));
        }

        @Override // com.avito.android.photo_gallery.di.InterfaceC33184d
        public final void a(GalleryFragment galleryFragment) {
            galleryFragment.f216493M0 = this.f216914h.get();
            e eVar = this.f216907a;
            com.avito.android.connection_quality.connectivity.a aVarU = eVar.U();
            dagger.internal.t.c(aVarU);
            galleryFragment.f216494N0 = aVarU;
            kj.c cVar = this.f216908b;
            gj.d dVarEl = cVar.El();
            cv.b bVar = this.f216909c;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = bVar.u4();
            dagger.internal.t.c(aVarU4);
            a.b bVarB = bVar.b();
            dagger.internal.t.c(bVarB);
            f.f217025a.getClass();
            galleryFragment.f216495O0 = d.a.a(dVarEl, aVarU4, bVarB, C47099b.f428743a, null, null, null, new C42699b(this.f216910d.f90636a.f90471b, Collections.singletonList(Owners.f210394C), "Gallery", false, 8, null), 56);
            galleryFragment.f216496P0 = cVar.Ad();
            galleryFragment.f216497Q0 = cVar.sd();
            galleryFragment.f216498R0 = cVar.Yb();
            com.avito.android.deeplink_handler.handler.composite.a aVarU42 = bVar.u4();
            dagger.internal.t.c(aVarU42);
            galleryFragment.f216499S0 = aVarU42;
            InterfaceC28373a interfaceC28373aA = eVar.a();
            dagger.internal.t.c(interfaceC28373aA);
            galleryFragment.f216500T0 = interfaceC28373aA;
            com.avito.android.pinch_to_zoom.b bVarT1 = eVar.t1();
            dagger.internal.t.c(bVarT1);
            galleryFragment.f216501U0 = bVarT1;
        }
    }

    public static InterfaceC33184d.a a() {
        return new b();
    }
}
