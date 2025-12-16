package com.avito.android.gig_shift_cancel.di;

import android.app.Application;
import android.content.res.Resources;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.gig_shift_cancel.di.b;
import com.avito.android.gig_shift_cancel.mvi.k;
import com.avito.android.gig_shift_cancel.mvi.m;
import com.avito.android.gig_shift_cancel.mvi.p;
import com.avito.android.gig_shift_cancel.mvi.w;
import com.avito.android.gig_shift_cancel.mvi.z;
import com.avito.android.gig_shift_cancel.ui.GigShiftCancelDialogFragment;
import com.avito.android.gig_shift_cancel.ui.GigShiftCancelOpenParams;
import cv.InterfaceC39417a;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import xG.InterfaceC49829a;

/* compiled from: DaggerGigShiftCancelComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerGigShiftCancelComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.gig_shift_cancel.di.b.a
        public final com.avito.android.gig_shift_cancel.di.b a(GigShiftCancelOpenParams gigShiftCancelOpenParams, com.avito.android.gig_shift_cancel.di.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, gigShiftCancelOpenParams, null);
        }
    }

    /* compiled from: DaggerGigShiftCancelComponent.java */
    public static final class c implements com.avito.android.gig_shift_cancel.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC49829a> f160599a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.gig_snippet.a> f160600b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.gig_shift_cancel.domain.b f160601c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28373a> f160602d;

        /* renamed from: e, reason: collision with root package name */
        public final k f160603e;

        /* renamed from: f, reason: collision with root package name */
        public final m f160604f;

        /* renamed from: g, reason: collision with root package name */
        public final u<Application> f160605g;

        /* renamed from: h, reason: collision with root package name */
        public final u<Resources> f160606h;

        /* renamed from: i, reason: collision with root package name */
        public final w f160607i;

        /* renamed from: j, reason: collision with root package name */
        public final z f160608j;

        /* compiled from: DaggerGigShiftCancelComponent.java */
        /* renamed from: com.avito.android.gig_shift_cancel.di.a$c$a, reason: collision with other inner class name */
        public static final class C4695a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.gig_shift_cancel.di.c f160609a;

            public C4695a(com.avito.android.gig_shift_cancel.di.c cVar) {
                this.f160609a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f160609a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerGigShiftCancelComponent.java */
        public static final class b implements u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.gig_shift_cancel.di.c f160610a;

            public b(com.avito.android.gig_shift_cancel.di.c cVar) {
                this.f160610a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f160610a.k();
                t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerGigShiftCancelComponent.java */
        /* renamed from: com.avito.android.gig_shift_cancel.di.a$c$c, reason: collision with other inner class name */
        public static final class C4696c implements u<com.avito.android.gig_snippet.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.gig_shift_cancel.di.c f160611a;

            public C4696c(com.avito.android.gig_shift_cancel.di.c cVar) {
                this.f160611a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f160611a.H1();
            }
        }

        /* compiled from: DaggerGigShiftCancelComponent.java */
        public static final class d implements u<InterfaceC49829a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.gig_shift_cancel.di.c f160612a;

            public d(com.avito.android.gig_shift_cancel.di.c cVar) {
                this.f160612a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC49829a interfaceC49829aEm = this.f160612a.em();
                t.c(interfaceC49829aEm);
                return interfaceC49829aEm;
            }
        }

        public c(com.avito.android.gig_shift_cancel.di.c cVar, cv.b bVar, GigShiftCancelOpenParams gigShiftCancelOpenParams, C4694a c4694a) {
            this.f160601c = new com.avito.android.gig_shift_cancel.domain.b(new d(cVar), new C4696c(cVar));
            l lVarA = l.a(gigShiftCancelOpenParams);
            CH.b bVar2 = new CH.b(new C4695a(cVar));
            com.avito.android.gig_shift_cancel.domain.b bVar3 = this.f160601c;
            this.f160603e = new k(bVar3, lVarA, bVar2);
            this.f160604f = new m(bVar3, lVarA);
            u<Resources> uVarD = g.d(new e(new b(cVar)));
            this.f160606h = uVarD;
            this.f160607i = new w(uVarD);
            this.f160608j = new z(new p(this.f160603e, com.avito.android.gig_shift_cancel.mvi.u.a(), this.f160604f, this.f160607i));
        }

        @Override // com.avito.android.gig_shift_cancel.di.b
        public final void a(GigShiftCancelDialogFragment gigShiftCancelDialogFragment) {
            gigShiftCancelDialogFragment.f160708h0 = this.f160608j;
        }
    }

    public static b.a a() {
        return new b();
    }
}
