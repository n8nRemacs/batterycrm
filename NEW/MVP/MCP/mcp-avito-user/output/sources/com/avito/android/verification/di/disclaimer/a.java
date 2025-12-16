package com.avito.android.verification.di.disclaimer;

import android.content.res.Resources;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.w;
import com.avito.android.util.R0;
import com.avito.android.verification.di.disclaimer.b;
import com.avito.android.verification.verification_disclaimer.VerificationDisclaimerArgs;
import com.avito.android.verification.verification_disclaimer.VerificationDisclaimerFragment;
import com.avito.android.verification.verification_disclaimer.h;
import com.avito.android.verification.verification_disclaimer.l;
import com.avito.android.verification.verification_disclaimer.mvi.j;
import com.avito.android.verification.verification_disclaimer.mvi.m;
import com.avito.android.verification.verification_disclaimer.mvi.o;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Set;

/* compiled from: DaggerVerificationDisclaimerComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerVerificationDisclaimerComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.verification.di.disclaimer.b.a
        public final com.avito.android.verification.di.disclaimer.b a(r rVar, Resources resources, VerificationDisclaimerArgs verificationDisclaimerArgs, com.avito.android.tariff.cpa.configure_info.items.feature.e eVar, com.avito.android.verification.di.disclaimer.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, rVar, resources, verificationDisclaimerArgs, eVar, null);
        }
    }

    /* compiled from: DaggerVerificationDisclaimerComponent.java */
    public static final class c implements com.avito.android.verification.di.disclaimer.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f323528a;

        /* renamed from: b, reason: collision with root package name */
        public final u<BM0.a> f323529b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f323530c;

        /* renamed from: d, reason: collision with root package name */
        public final h f323531d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.verification.verification_disclaimer.mvi.c f323532e;

        /* renamed from: f, reason: collision with root package name */
        public final o f323533f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.verification.verification_disclaimer.mvi.h f323534g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28481c> f323535h;

        /* renamed from: i, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f323536i;

        /* renamed from: j, reason: collision with root package name */
        public final l f323537j;

        /* renamed from: k, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f323538k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.verification.list_items.attributed_text.c f323539l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.verification.list_items.square_icon_with_text.c f323540m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f323541n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f323542o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f323543p;

        /* compiled from: DaggerVerificationDisclaimerComponent.java */
        /* renamed from: com.avito.android.verification.di.disclaimer.a$c$a, reason: collision with other inner class name */
        public static final class C10004a implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f323544a;

            public C10004a(cv.b bVar) {
                this.f323544a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f323544a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerVerificationDisclaimerComponent.java */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.verification.di.disclaimer.c f323545a;

            public b(com.avito.android.verification.di.disclaimer.c cVar) {
                this.f323545a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f323545a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerVerificationDisclaimerComponent.java */
        /* renamed from: com.avito.android.verification.di.disclaimer.a$c$c, reason: collision with other inner class name */
        public static final class C10005c implements u<BM0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.verification.di.disclaimer.c f323546a;

            public C10005c(com.avito.android.verification.di.disclaimer.c cVar) {
                this.f323546a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                BM0.a aVarAh = this.f323546a.Ah();
                t.c(aVarAh);
                return aVarAh;
            }
        }

        /* compiled from: DaggerVerificationDisclaimerComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.verification.di.disclaimer.c f323547a;

            public d(com.avito.android.verification.di.disclaimer.c cVar) {
                this.f323547a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f323547a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.verification.di.disclaimer.c cVar, cv.b bVar, r rVar, Resources resources, VerificationDisclaimerArgs verificationDisclaimerArgs, w wVar, C10003a c10003a) {
            this.f323528a = new C10004a(bVar);
            this.f323529b = new C10005c(cVar);
            this.f323530c = new b(cVar);
            h hVar = new h(dagger.internal.l.a(verificationDisclaimerArgs), this.f323529b, this.f323530c);
            this.f323531d = hVar;
            this.f323532e = new com.avito.android.verification.verification_disclaimer.mvi.c(hVar, this.f323528a);
            this.f323533f = new o(com.avito.android.verification.verification_disclaimer.b.a());
            this.f323534g = new com.avito.android.verification.verification_disclaimer.mvi.h(this.f323531d, this.f323528a);
            this.f323535h = new d(cVar);
            u<ScreenPerformanceTracker> uVarD = dagger.internal.g.d(new g(dagger.internal.l.a(rVar), this.f323535h));
            this.f323536i = uVarD;
            this.f323537j = new l(new m(this.f323532e, this.f323533f, this.f323534g, uVarD, j.a()));
            this.f323538k = B.a(com.avito.android.konveyor_adapter_module.d.a());
            dagger.internal.l lVarA = dagger.internal.l.a(wVar);
            this.f323539l = new com.avito.android.verification.list_items.attributed_text.c(new com.avito.android.verification.list_items.attributed_text.f(lVarA));
            this.f323540m = new com.avito.android.verification.list_items.square_icon_with_text.c(new com.avito.android.verification.list_items.square_icon_with_text.f(lVarA));
            A.b bVarA = A.a(2, 1);
            bVarA.f393938b.add(this.f323538k);
            com.avito.android.verification.list_items.attributed_text.c cVar2 = this.f323539l;
            List<u<T>> list = bVarA.f393937a;
            list.add(cVar2);
            list.add(this.f323540m);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f323541n = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f323542o = uVarH;
            this.f323543p = dagger.internal.g.d(new e(uVarH, this.f323541n));
        }

        @Override // com.avito.android.verification.di.disclaimer.b
        public final void a(VerificationDisclaimerFragment verificationDisclaimerFragment) {
            verificationDisclaimerFragment.f325021n0 = this.f323537j;
            verificationDisclaimerFragment.f325023p0 = this.f323536i.get();
            verificationDisclaimerFragment.f325024q0 = this.f323543p.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
