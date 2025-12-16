package com.avito.android.gig_apply.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.x;
import com.avito.android.gig_apply.di.c;
import com.avito.android.gig_apply.mvi.i;
import com.avito.android.gig_apply.mvi.k;
import com.avito.android.gig_apply.mvi.m;
import com.avito.android.gig_apply.ui.GigApplyActivity;
import com.avito.android.gig_apply.ui.GigApplyOpenParams;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import mH.C43963b;
import yF.InterfaceC50106a;

/* compiled from: DaggerGigApplyComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerGigApplyComponent.java */
    public static final class b implements c.a {
        public b() {
        }

        @Override // com.avito.android.gig_apply.di.c.a
        public final com.avito.android.gig_apply.di.c a(GigApplyOpenParams gigApplyOpenParams, d dVar, InterfaceC39417a interfaceC39417a) {
            gigApplyOpenParams.getClass();
            interfaceC39417a.getClass();
            return new c(dVar, interfaceC39417a, gigApplyOpenParams, null);
        }
    }

    /* compiled from: DaggerGigApplyComponent.java */
    public static final class c implements com.avito.android.gig_apply.di.c {

        /* renamed from: a, reason: collision with root package name */
        public final u<com.avito.android.gig_snippet.a> f159624a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC50106a> f159625b;

        /* renamed from: c, reason: collision with root package name */
        public final u<x> f159626c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f159627d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28373a> f159628e;

        /* renamed from: f, reason: collision with root package name */
        public final m f159629f;

        /* compiled from: DaggerGigApplyComponent.java */
        /* renamed from: com.avito.android.gig_apply.di.a$c$a, reason: collision with other inner class name */
        public static final class C4669a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.gig_apply.di.d f159630a;

            public C4669a(com.avito.android.gig_apply.di.d dVar) {
                this.f159630a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f159630a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerGigApplyComponent.java */
        public static final class b implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.gig_apply.di.d f159631a;

            public b(com.avito.android.gig_apply.di.d dVar) {
                this.f159631a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarQ = this.f159631a.q();
                t.c(xVarQ);
                return xVarQ;
            }
        }

        /* compiled from: DaggerGigApplyComponent.java */
        /* renamed from: com.avito.android.gig_apply.di.a$c$c, reason: collision with other inner class name */
        public static final class C4670c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f159632a;

            public C4670c(cv.b bVar) {
                this.f159632a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f159632a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerGigApplyComponent.java */
        public static final class d implements u<InterfaceC50106a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.gig_apply.di.d f159633a;

            public d(com.avito.android.gig_apply.di.d dVar) {
                this.f159633a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC50106a interfaceC50106aFa = this.f159633a.Fa();
                t.c(interfaceC50106aFa);
                return interfaceC50106aFa;
            }
        }

        /* compiled from: DaggerGigApplyComponent.java */
        public static final class e implements u<com.avito.android.gig_snippet.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.gig_apply.di.d f159634a;

            public e(com.avito.android.gig_apply.di.d dVar) {
                this.f159634a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f159634a.H1();
            }
        }

        public c(com.avito.android.gig_apply.di.d dVar, cv.b bVar, GigApplyOpenParams gigApplyOpenParams, C4668a c4668a) {
            l lVarA = l.a(gigApplyOpenParams);
            e eVar = new e(dVar);
            d dVar2 = new d(dVar);
            b bVar2 = new b(dVar);
            this.f159629f = new m(new com.avito.android.gig_apply.mvi.g(lVarA, eVar, new com.avito.android.gig_apply.mvi.d(new com.avito.android.gig_apply.domain.d(dVar2, bVar2), lVarA), new i(lVarA, new C4670c(bVar), bVar2, new C43963b(new C4669a(dVar))), new k(lVarA)));
        }

        @Override // com.avito.android.gig_apply.di.c
        public final void a(GigApplyActivity gigApplyActivity) {
            gigApplyActivity.f159826m = this.f159629f;
        }
    }

    public static c.a a() {
        return new b();
    }
}
