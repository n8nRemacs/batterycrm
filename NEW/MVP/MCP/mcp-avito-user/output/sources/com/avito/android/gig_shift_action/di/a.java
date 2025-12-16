package com.avito.android.gig_shift_action.di;

import android.app.Application;
import android.content.res.Resources;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.x;
import com.avito.android.gig_shift_action.di.b;
import com.avito.android.gig_shift_action.mvi.k;
import com.avito.android.gig_shift_action.mvi.m;
import com.avito.android.gig_shift_action.mvi.p;
import com.avito.android.gig_shift_action.mvi.v;
import com.avito.android.gig_shift_action.mvi.y;
import com.avito.android.gig_shift_action.ui.GigShiftActionDialogFragment;
import com.avito.android.gig_shift_action.ui.GigShiftActionOpenParams;
import cv.InterfaceC39417a;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import rG.InterfaceC47539a;

/* compiled from: DaggerGigShiftActionComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerGigShiftActionComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.gig_shift_action.di.b.a
        public final com.avito.android.gig_shift_action.di.b a(GigShiftActionOpenParams gigShiftActionOpenParams, com.avito.android.gig_shift_action.di.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, gigShiftActionOpenParams, null);
        }
    }

    /* compiled from: DaggerGigShiftActionComponent.java */
    public static final class c implements com.avito.android.gig_shift_action.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC47539a> f160421a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.gig_snippet.a> f160422b;

        /* renamed from: c, reason: collision with root package name */
        public final u<Application> f160423c;

        /* renamed from: d, reason: collision with root package name */
        public final u<Resources> f160424d;

        /* renamed from: e, reason: collision with root package name */
        public final u<x> f160425e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.gig_shift_action.domain.b f160426f;

        /* renamed from: g, reason: collision with root package name */
        public final l f160427g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28373a> f160428h;

        /* renamed from: i, reason: collision with root package name */
        public final m f160429i;

        /* renamed from: j, reason: collision with root package name */
        public final v f160430j;

        /* renamed from: k, reason: collision with root package name */
        public final y f160431k;

        /* compiled from: DaggerGigShiftActionComponent.java */
        /* renamed from: com.avito.android.gig_shift_action.di.a$c$a, reason: collision with other inner class name */
        public static final class C4689a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.gig_shift_action.di.c f160432a;

            public C4689a(com.avito.android.gig_shift_action.di.c cVar) {
                this.f160432a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f160432a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerGigShiftActionComponent.java */
        public static final class b implements u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.gig_shift_action.di.c f160433a;

            public b(com.avito.android.gig_shift_action.di.c cVar) {
                this.f160433a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f160433a.k();
                t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerGigShiftActionComponent.java */
        /* renamed from: com.avito.android.gig_shift_action.di.a$c$c, reason: collision with other inner class name */
        public static final class C4690c implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.gig_shift_action.di.c f160434a;

            public C4690c(com.avito.android.gig_shift_action.di.c cVar) {
                this.f160434a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarQ = this.f160434a.q();
                t.c(xVarQ);
                return xVarQ;
            }
        }

        /* compiled from: DaggerGigShiftActionComponent.java */
        public static final class d implements u<com.avito.android.gig_snippet.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.gig_shift_action.di.c f160435a;

            public d(com.avito.android.gig_shift_action.di.c cVar) {
                this.f160435a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f160435a.H1();
            }
        }

        /* compiled from: DaggerGigShiftActionComponent.java */
        public static final class e implements u<InterfaceC47539a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.gig_shift_action.di.c f160436a;

            public e(com.avito.android.gig_shift_action.di.c cVar) {
                this.f160436a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC47539a interfaceC47539aEl = this.f160436a.el();
                t.c(interfaceC47539aEl);
                return interfaceC47539aEl;
            }
        }

        public c(com.avito.android.gig_shift_action.di.c cVar, cv.b bVar, GigShiftActionOpenParams gigShiftActionOpenParams, C4688a c4688a) {
            this.f160421a = new e(cVar);
            this.f160422b = new d(cVar);
            u<Resources> uVarD = g.d(new com.avito.android.gig_shift_action.di.e(new b(cVar)));
            this.f160424d = uVarD;
            this.f160426f = new com.avito.android.gig_shift_action.domain.b(uVarD, this.f160421a, this.f160422b, new C4690c(cVar));
            l lVarA = l.a(gigShiftActionOpenParams);
            this.f160427g = lVarA;
            AH.b bVar2 = new AH.b(new C4689a(cVar));
            com.avito.android.gig_shift_action.domain.b bVar3 = this.f160426f;
            k kVar = new k(bVar3, lVarA, bVar2);
            this.f160429i = new m(bVar3, lVarA);
            this.f160430j = new v(this.f160424d);
            this.f160431k = new y(new p(kVar, com.avito.android.gig_shift_action.mvi.t.a(), this.f160429i, this.f160430j, this.f160427g, this.f160424d));
        }

        @Override // com.avito.android.gig_shift_action.di.b
        public final void a(GigShiftActionDialogFragment gigShiftActionDialogFragment) {
            gigShiftActionDialogFragment.f160552h0 = this.f160431k;
        }
    }

    public static b.a a() {
        return new b();
    }
}
