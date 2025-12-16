package com.avito.android.verification.di.fetch_invoice;

import android.content.res.Resources;
import androidx.view.S0;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.w;
import com.avito.android.remote.A1;
import com.avito.android.util.R0;
import com.avito.android.verification.common.list.button_default.g;
import com.avito.android.verification.di.fetch_invoice.b;
import com.avito.android.verification.inn.list.checkbox.h;
import com.avito.android.verification.inn.q;
import com.avito.android.verification.verification_fetch_invoice.VerificationFetchInvoiceArgs;
import com.avito.android.verification.verification_fetch_invoice.VerificationFetchInvoiceFragment;
import com.avito.android.verification.verification_fetch_invoice.k;
import com.avito.android.verification.verification_fetch_invoice.mvi.n;
import com.avito.konveyor.adapter.j;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Set;

/* compiled from: DaggerVerificationFetchInvoiceComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerVerificationFetchInvoiceComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.verification.di.fetch_invoice.b.a
        public final com.avito.android.verification.di.fetch_invoice.b a(r rVar, Resources resources, VerificationFetchInvoiceArgs verificationFetchInvoiceArgs, S0 s02, com.avito.android.verification.inn.r rVar2, com.avito.android.verification.di.fetch_invoice.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, rVar, resources, verificationFetchInvoiceArgs, s02, rVar2, null);
        }
    }

    /* compiled from: DaggerVerificationFetchInvoiceComponent.java */
    public static final class c implements com.avito.android.verification.di.fetch_invoice.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<com.avito.android.verification.inn.list.inn_info.d> f323554A;

        /* renamed from: B, reason: collision with root package name */
        public final u<com.avito.android.verification.inn.list.inn_info.f> f323555B;

        /* renamed from: C, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f323556C;

        /* renamed from: D, reason: collision with root package name */
        public final u<com.avito.android.verification.inn.list.button.c> f323557D;

        /* renamed from: E, reason: collision with root package name */
        public final u<com.avito.android.verification.inn.list.button.e> f323558E;

        /* renamed from: F, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f323559F;

        /* renamed from: G, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f323560G;

        /* renamed from: H, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f323561H;

        /* renamed from: I, reason: collision with root package name */
        public final u<com.avito.android.verification.common.list.space.d> f323562I;

        /* renamed from: J, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f323563J;

        /* renamed from: K, reason: collision with root package name */
        public final u<com.avito.android.verification.common.list.button_default.d> f323564K;

        /* renamed from: L, reason: collision with root package name */
        public final u<g> f323565L;

        /* renamed from: M, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f323566M;

        /* renamed from: N, reason: collision with root package name */
        public final u<com.avito.android.verification.inn.list.group_card.d> f323567N;

        /* renamed from: O, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f323568O;

        /* renamed from: P, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f323569P;

        /* renamed from: Q, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f323570Q;

        /* renamed from: R, reason: collision with root package name */
        public final u<j> f323571R;

        /* renamed from: a, reason: collision with root package name */
        public final u<A1> f323572a;

        /* renamed from: b, reason: collision with root package name */
        public final u<R0> f323573b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.remote.error.f> f323574c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.verification.verification_fetch_invoice.mvi.g f323575d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f323576e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.verification.verification_fetch_invoice.mvi.e f323577f;

        /* renamed from: g, reason: collision with root package name */
        public final vM0.g f323578g;

        /* renamed from: h, reason: collision with root package name */
        public final n f323579h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f323580i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f323581j;

        /* renamed from: k, reason: collision with root package name */
        public final k f323582k;

        /* renamed from: l, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f323583l;

        /* renamed from: m, reason: collision with root package name */
        public final l f323584m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.verification.inn.list.disclosure.d> f323585n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.verification.inn.list.disclosure.f> f323586o;

        /* renamed from: p, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f323587p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.verification.inn.list.checkbox.d> f323588q;

        /* renamed from: r, reason: collision with root package name */
        public final u<w> f323589r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.android.verification.inn.list.checkbox.g> f323590s;

        /* renamed from: t, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f323591t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f323592u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.verification.inn.list.input.e> f323593v;

        /* renamed from: w, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f323594w;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.avito.android.verification.inn.list.select.c> f323595x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.android.verification.inn.list.select.g> f323596y;

        /* renamed from: z, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f323597z;

        /* compiled from: DaggerVerificationFetchInvoiceComponent.java */
        /* renamed from: com.avito.android.verification.di.fetch_invoice.a$c$a, reason: collision with other inner class name */
        public static final class C10007a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.verification.di.fetch_invoice.c f323598a;

            public C10007a(com.avito.android.verification.di.fetch_invoice.c cVar) {
                this.f323598a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f323598a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerVerificationFetchInvoiceComponent.java */
        public static final class b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f323599a;

            public b(cv.b bVar) {
                this.f323599a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f323599a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerVerificationFetchInvoiceComponent.java */
        /* renamed from: com.avito.android.verification.di.fetch_invoice.a$c$c, reason: collision with other inner class name */
        public static final class C10008c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.verification.di.fetch_invoice.c f323600a;

            public C10008c(com.avito.android.verification.di.fetch_invoice.c cVar) {
                this.f323600a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f323600a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerVerificationFetchInvoiceComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.verification.di.fetch_invoice.c f323601a;

            public d(com.avito.android.verification.di.fetch_invoice.c cVar) {
                this.f323601a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f323601a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerVerificationFetchInvoiceComponent.java */
        public static final class e implements u<com.avito.android.remote.error.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.verification.di.fetch_invoice.c f323602a;

            public e(com.avito.android.verification.di.fetch_invoice.c cVar) {
                this.f323602a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f323602a.o();
            }
        }

        /* compiled from: DaggerVerificationFetchInvoiceComponent.java */
        public static final class f implements u<A1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.verification.di.fetch_invoice.c f323603a;

            public f(com.avito.android.verification.di.fetch_invoice.c cVar) {
                this.f323603a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                A1 a1S0 = this.f323603a.s0();
                t.c(a1S0);
                return a1S0;
            }
        }

        public c(com.avito.android.verification.di.fetch_invoice.c cVar, cv.b bVar, r rVar, Resources resources, VerificationFetchInvoiceArgs verificationFetchInvoiceArgs, S0 s02, com.avito.android.verification.inn.r rVar2, C10006a c10006a) {
            l lVarA = l.a(verificationFetchInvoiceArgs);
            com.avito.android.verification.verification_fetch_invoice.c cVar2 = new com.avito.android.verification.verification_fetch_invoice.c(new f(cVar), new C10008c(cVar), new e(cVar));
            this.f323575d = new com.avito.android.verification.verification_fetch_invoice.mvi.g(lVarA, cVar2);
            this.f323577f = new com.avito.android.verification.verification_fetch_invoice.mvi.e(lVarA, new b(bVar), cVar2);
            this.f323578g = new vM0.g(l.a(resources));
            this.f323579h = new n(new q(com.avito.android.verification.inn.validation.c.a(), this.f323578g), com.avito.android.verification.inn.k.a());
            this.f323580i = new d(cVar);
            this.f323581j = dagger.internal.g.d(new com.avito.android.verification.di.fetch_invoice.e(l.a(rVar), this.f323580i));
            this.f323582k = new k(new com.avito.android.verification.verification_fetch_invoice.mvi.j(this.f323575d, this.f323577f, com.avito.android.verification.verification_fetch_invoice.mvi.l.a(), this.f323579h, this.f323581j));
            this.f323583l = B.a(com.avito.android.konveyor_adapter_module.d.a());
            l lVarA2 = l.a(rVar2);
            this.f323584m = lVarA2;
            u<com.avito.android.verification.inn.list.disclosure.d> uVarD = dagger.internal.g.d(lVarA2);
            this.f323585n = uVarD;
            u<com.avito.android.verification.inn.list.disclosure.f> uVarD2 = dagger.internal.g.d(new com.avito.android.verification.inn.list.disclosure.g(uVarD));
            this.f323586o = uVarD2;
            this.f323587p = dagger.internal.g.d(new com.avito.android.verification.inn.list.disclosure.c(uVarD2));
            this.f323588q = dagger.internal.g.d(this.f323584m);
            u<w> uVarD3 = dagger.internal.g.d(this.f323584m);
            this.f323589r = uVarD3;
            u<com.avito.android.verification.inn.list.checkbox.g> uVarD4 = dagger.internal.g.d(new h(uVarD3, this.f323588q));
            this.f323590s = uVarD4;
            this.f323591t = dagger.internal.g.d(new com.avito.android.verification.inn.list.checkbox.c(uVarD4));
            C10007a c10007a = new C10007a(cVar);
            this.f323592u = c10007a;
            u<com.avito.android.verification.inn.list.input.e> uVarD5 = dagger.internal.g.d(new com.avito.android.verification.inn.list.input.f(c10007a, this.f323589r));
            this.f323593v = uVarD5;
            this.f323594w = dagger.internal.g.d(new com.avito.android.verification.inn.list.input.c(uVarD5));
            u<com.avito.android.verification.inn.list.select.c> uVarD6 = dagger.internal.g.d(this.f323584m);
            this.f323595x = uVarD6;
            u<com.avito.android.verification.inn.list.select.g> uVarD7 = dagger.internal.g.d(new com.avito.android.verification.inn.list.select.h(this.f323589r, uVarD6, this.f323592u));
            this.f323596y = uVarD7;
            this.f323597z = dagger.internal.g.d(new com.avito.android.verification.inn.list.select.b(uVarD7));
            u<com.avito.android.verification.inn.list.inn_info.d> uVarD8 = dagger.internal.g.d(this.f323584m);
            this.f323554A = uVarD8;
            u<com.avito.android.verification.inn.list.inn_info.f> uVarD9 = dagger.internal.g.d(new com.avito.android.verification.inn.list.inn_info.g(uVarD8));
            this.f323555B = uVarD9;
            this.f323556C = dagger.internal.g.d(new com.avito.android.verification.inn.list.inn_info.c(uVarD9));
            u<com.avito.android.verification.inn.list.button.c> uVarD10 = dagger.internal.g.d(this.f323584m);
            this.f323557D = uVarD10;
            u<com.avito.android.verification.inn.list.button.e> uVarD11 = dagger.internal.g.d(new com.avito.android.verification.inn.list.button.f(uVarD10));
            this.f323558E = uVarD11;
            this.f323559F = dagger.internal.g.d(new com.avito.android.verification.inn.list.button.b(uVarD11));
            this.f323560G = dagger.internal.g.d(new com.avito.android.verification.inn.list.footer.c(new com.avito.android.verification.inn.list.footer.f(this.f323589r)));
            this.f323561H = dagger.internal.g.d(new com.avito.android.verification.inn.list.text.c(new com.avito.android.verification.inn.list.text.f(this.f323589r)));
            u<com.avito.android.verification.common.list.space.d> uVarD12 = dagger.internal.g.d(com.avito.android.verification.common.list.space.e.a());
            this.f323562I = uVarD12;
            this.f323563J = dagger.internal.g.d(new com.avito.android.verification.common.list.space.c(uVarD12));
            u<com.avito.android.verification.common.list.button_default.d> uVarD13 = dagger.internal.g.d(this.f323584m);
            this.f323564K = uVarD13;
            u<g> uVarD14 = dagger.internal.g.d(new com.avito.android.verification.common.list.button_default.h(uVarD13));
            this.f323565L = uVarD14;
            this.f323566M = dagger.internal.g.d(new com.avito.android.verification.common.list.button_default.c(uVarD14));
            u<com.avito.android.verification.inn.list.group_card.d> uVarD15 = dagger.internal.g.d(new com.avito.android.verification.inn.list.group_card.e(this.f323589r));
            this.f323567N = uVarD15;
            this.f323568O = dagger.internal.g.d(new com.avito.android.verification.inn.list.group_card.b(uVarD15));
            A.b bVarA = A.a(11, 1);
            bVarA.f393938b.add(this.f323583l);
            u<TV0.b<?, ?>> uVar = this.f323587p;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f323591t);
            list.add(this.f323594w);
            list.add(this.f323597z);
            list.add(this.f323556C);
            list.add(this.f323559F);
            list.add(this.f323560G);
            list.add(this.f323561H);
            list.add(this.f323563J);
            list.add(this.f323566M);
            list.add(this.f323568O);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f323569P = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f323570Q = uVarH;
            this.f323571R = dagger.internal.g.d(new zM0.d(uVarH, this.f323569P));
        }

        @Override // com.avito.android.verification.di.fetch_invoice.b
        public final void a(VerificationFetchInvoiceFragment verificationFetchInvoiceFragment) {
            verificationFetchInvoiceFragment.f325133n0 = this.f323582k;
            verificationFetchInvoiceFragment.f325135p0 = this.f323581j.get();
            verificationFetchInvoiceFragment.f325136q0 = this.f323571R.get();
            verificationFetchInvoiceFragment.f325137r0 = this.f323570Q.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
