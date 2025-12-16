package com.avito.android.verification.di.confirm_requisites;

import android.content.res.Resources;
import androidx.view.S0;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.w;
import com.avito.android.remote.A1;
import com.avito.android.util.R0;
import com.avito.android.verification.common.list.button_default.g;
import com.avito.android.verification.di.confirm_requisites.b;
import com.avito.android.verification.inn.list.checkbox.h;
import com.avito.android.verification.inn.o;
import com.avito.android.verification.inn.q;
import com.avito.android.verification.verification_confirm_requisites.VerificationConfirmRequisitesArgs;
import com.avito.android.verification.verification_confirm_requisites.VerificationConfirmRequisitesFragment;
import com.avito.android.verification.verification_confirm_requisites.k;
import com.avito.android.verification.verification_confirm_requisites.mvi.i;
import com.avito.android.verification.verification_confirm_requisites.mvi.n;
import com.avito.android.verification.verification_confirm_requisites.mvi.p;
import com.avito.konveyor.adapter.j;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Set;

/* compiled from: DaggerVerificationConfirmRequisitesComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerVerificationConfirmRequisitesComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.verification.di.confirm_requisites.b.a
        public final com.avito.android.verification.di.confirm_requisites.b a(r rVar, Resources resources, VerificationConfirmRequisitesArgs verificationConfirmRequisitesArgs, S0 s02, com.avito.android.verification.inn.r rVar2, com.avito.android.verification.di.confirm_requisites.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, rVar, resources, verificationConfirmRequisitesArgs, s02, rVar2, null);
        }
    }

    /* compiled from: DaggerVerificationConfirmRequisitesComponent.java */
    public static final class c implements com.avito.android.verification.di.confirm_requisites.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<com.avito.android.verification.inn.list.inn_info.d> f323475A;

        /* renamed from: B, reason: collision with root package name */
        public final u<com.avito.android.verification.inn.list.inn_info.f> f323476B;

        /* renamed from: C, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f323477C;

        /* renamed from: D, reason: collision with root package name */
        public final u<com.avito.android.verification.inn.list.button.c> f323478D;

        /* renamed from: E, reason: collision with root package name */
        public final u<com.avito.android.verification.inn.list.button.e> f323479E;

        /* renamed from: F, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f323480F;

        /* renamed from: G, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f323481G;

        /* renamed from: H, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f323482H;

        /* renamed from: I, reason: collision with root package name */
        public final u<com.avito.android.verification.common.list.space.d> f323483I;

        /* renamed from: J, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f323484J;

        /* renamed from: K, reason: collision with root package name */
        public final u<com.avito.android.verification.common.list.button_default.d> f323485K;

        /* renamed from: L, reason: collision with root package name */
        public final u<g> f323486L;

        /* renamed from: M, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f323487M;

        /* renamed from: N, reason: collision with root package name */
        public final u<com.avito.android.verification.inn.list.group_card.d> f323488N;

        /* renamed from: O, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f323489O;

        /* renamed from: P, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f323490P;

        /* renamed from: Q, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f323491Q;

        /* renamed from: R, reason: collision with root package name */
        public final u<j> f323492R;

        /* renamed from: a, reason: collision with root package name */
        public final u<A1> f323493a;

        /* renamed from: b, reason: collision with root package name */
        public final u<R0> f323494b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.remote.error.f> f323495c;

        /* renamed from: d, reason: collision with root package name */
        public final i f323496d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f323497e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.verification.verification_confirm_requisites.mvi.g f323498f;

        /* renamed from: g, reason: collision with root package name */
        public final vM0.g f323499g;

        /* renamed from: h, reason: collision with root package name */
        public final p f323500h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f323501i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f323502j;

        /* renamed from: k, reason: collision with root package name */
        public final k f323503k;

        /* renamed from: l, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f323504l;

        /* renamed from: m, reason: collision with root package name */
        public final l f323505m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.verification.inn.list.disclosure.d> f323506n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.verification.inn.list.disclosure.f> f323507o;

        /* renamed from: p, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f323508p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.verification.inn.list.checkbox.d> f323509q;

        /* renamed from: r, reason: collision with root package name */
        public final u<w> f323510r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.android.verification.inn.list.checkbox.g> f323511s;

        /* renamed from: t, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f323512t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f323513u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.verification.inn.list.input.e> f323514v;

        /* renamed from: w, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f323515w;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.avito.android.verification.inn.list.select.c> f323516x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.android.verification.inn.list.select.g> f323517y;

        /* renamed from: z, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f323518z;

        /* compiled from: DaggerVerificationConfirmRequisitesComponent.java */
        /* renamed from: com.avito.android.verification.di.confirm_requisites.a$c$a, reason: collision with other inner class name */
        public static final class C10001a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.verification.di.confirm_requisites.c f323519a;

            public C10001a(com.avito.android.verification.di.confirm_requisites.c cVar) {
                this.f323519a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f323519a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerVerificationConfirmRequisitesComponent.java */
        public static final class b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f323520a;

            public b(cv.b bVar) {
                this.f323520a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f323520a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerVerificationConfirmRequisitesComponent.java */
        /* renamed from: com.avito.android.verification.di.confirm_requisites.a$c$c, reason: collision with other inner class name */
        public static final class C10002c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.verification.di.confirm_requisites.c f323521a;

            public C10002c(com.avito.android.verification.di.confirm_requisites.c cVar) {
                this.f323521a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f323521a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerVerificationConfirmRequisitesComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.verification.di.confirm_requisites.c f323522a;

            public d(com.avito.android.verification.di.confirm_requisites.c cVar) {
                this.f323522a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f323522a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerVerificationConfirmRequisitesComponent.java */
        public static final class e implements u<com.avito.android.remote.error.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.verification.di.confirm_requisites.c f323523a;

            public e(com.avito.android.verification.di.confirm_requisites.c cVar) {
                this.f323523a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f323523a.o();
            }
        }

        /* compiled from: DaggerVerificationConfirmRequisitesComponent.java */
        public static final class f implements u<A1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.verification.di.confirm_requisites.c f323524a;

            public f(com.avito.android.verification.di.confirm_requisites.c cVar) {
                this.f323524a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                A1 a1S0 = this.f323524a.s0();
                t.c(a1S0);
                return a1S0;
            }
        }

        public c(com.avito.android.verification.di.confirm_requisites.c cVar, cv.b bVar, r rVar, Resources resources, VerificationConfirmRequisitesArgs verificationConfirmRequisitesArgs, S0 s02, com.avito.android.verification.inn.r rVar2, C10000a c10000a) {
            l lVarA = l.a(verificationConfirmRequisitesArgs);
            com.avito.android.verification.verification_confirm_requisites.c cVar2 = new com.avito.android.verification.verification_confirm_requisites.c(new f(cVar), new C10002c(cVar), new e(cVar));
            this.f323496d = new i(lVarA, cVar2);
            this.f323498f = new com.avito.android.verification.verification_confirm_requisites.mvi.g(lVarA, new b(bVar), cVar2, o.a());
            this.f323499g = new vM0.g(l.a(resources));
            this.f323500h = new p(new q(com.avito.android.verification.inn.validation.c.a(), this.f323499g), com.avito.android.verification.inn.k.a());
            this.f323501i = new d(cVar);
            this.f323502j = dagger.internal.g.d(new com.avito.android.verification.di.confirm_requisites.e(l.a(rVar), this.f323501i));
            this.f323503k = new k(new com.avito.android.verification.verification_confirm_requisites.mvi.l(this.f323496d, this.f323498f, n.a(), this.f323500h, this.f323502j));
            this.f323504l = B.a(com.avito.android.konveyor_adapter_module.d.a());
            l lVarA2 = l.a(rVar2);
            this.f323505m = lVarA2;
            u<com.avito.android.verification.inn.list.disclosure.d> uVarD = dagger.internal.g.d(lVarA2);
            this.f323506n = uVarD;
            u<com.avito.android.verification.inn.list.disclosure.f> uVarD2 = dagger.internal.g.d(new com.avito.android.verification.inn.list.disclosure.g(uVarD));
            this.f323507o = uVarD2;
            this.f323508p = dagger.internal.g.d(new com.avito.android.verification.inn.list.disclosure.c(uVarD2));
            this.f323509q = dagger.internal.g.d(this.f323505m);
            u<w> uVarD3 = dagger.internal.g.d(this.f323505m);
            this.f323510r = uVarD3;
            u<com.avito.android.verification.inn.list.checkbox.g> uVarD4 = dagger.internal.g.d(new h(uVarD3, this.f323509q));
            this.f323511s = uVarD4;
            this.f323512t = dagger.internal.g.d(new com.avito.android.verification.inn.list.checkbox.c(uVarD4));
            C10001a c10001a = new C10001a(cVar);
            this.f323513u = c10001a;
            u<com.avito.android.verification.inn.list.input.e> uVarD5 = dagger.internal.g.d(new com.avito.android.verification.inn.list.input.f(c10001a, this.f323510r));
            this.f323514v = uVarD5;
            this.f323515w = dagger.internal.g.d(new com.avito.android.verification.inn.list.input.c(uVarD5));
            u<com.avito.android.verification.inn.list.select.c> uVarD6 = dagger.internal.g.d(this.f323505m);
            this.f323516x = uVarD6;
            u<com.avito.android.verification.inn.list.select.g> uVarD7 = dagger.internal.g.d(new com.avito.android.verification.inn.list.select.h(this.f323510r, uVarD6, this.f323513u));
            this.f323517y = uVarD7;
            this.f323518z = dagger.internal.g.d(new com.avito.android.verification.inn.list.select.b(uVarD7));
            u<com.avito.android.verification.inn.list.inn_info.d> uVarD8 = dagger.internal.g.d(this.f323505m);
            this.f323475A = uVarD8;
            u<com.avito.android.verification.inn.list.inn_info.f> uVarD9 = dagger.internal.g.d(new com.avito.android.verification.inn.list.inn_info.g(uVarD8));
            this.f323476B = uVarD9;
            this.f323477C = dagger.internal.g.d(new com.avito.android.verification.inn.list.inn_info.c(uVarD9));
            u<com.avito.android.verification.inn.list.button.c> uVarD10 = dagger.internal.g.d(this.f323505m);
            this.f323478D = uVarD10;
            u<com.avito.android.verification.inn.list.button.e> uVarD11 = dagger.internal.g.d(new com.avito.android.verification.inn.list.button.f(uVarD10));
            this.f323479E = uVarD11;
            this.f323480F = dagger.internal.g.d(new com.avito.android.verification.inn.list.button.b(uVarD11));
            this.f323481G = dagger.internal.g.d(new com.avito.android.verification.inn.list.footer.c(new com.avito.android.verification.inn.list.footer.f(this.f323510r)));
            this.f323482H = dagger.internal.g.d(new com.avito.android.verification.inn.list.text.c(new com.avito.android.verification.inn.list.text.f(this.f323510r)));
            u<com.avito.android.verification.common.list.space.d> uVarD12 = dagger.internal.g.d(com.avito.android.verification.common.list.space.e.a());
            this.f323483I = uVarD12;
            this.f323484J = dagger.internal.g.d(new com.avito.android.verification.common.list.space.c(uVarD12));
            u<com.avito.android.verification.common.list.button_default.d> uVarD13 = dagger.internal.g.d(this.f323505m);
            this.f323485K = uVarD13;
            u<g> uVarD14 = dagger.internal.g.d(new com.avito.android.verification.common.list.button_default.h(uVarD13));
            this.f323486L = uVarD14;
            this.f323487M = dagger.internal.g.d(new com.avito.android.verification.common.list.button_default.c(uVarD14));
            u<com.avito.android.verification.inn.list.group_card.d> uVarD15 = dagger.internal.g.d(new com.avito.android.verification.inn.list.group_card.e(this.f323510r));
            this.f323488N = uVarD15;
            this.f323489O = dagger.internal.g.d(new com.avito.android.verification.inn.list.group_card.b(uVarD15));
            A.b bVarA = A.a(11, 1);
            bVarA.f393938b.add(this.f323504l);
            u<TV0.b<?, ?>> uVar = this.f323508p;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f323512t);
            list.add(this.f323515w);
            list.add(this.f323518z);
            list.add(this.f323477C);
            list.add(this.f323480F);
            list.add(this.f323481G);
            list.add(this.f323482H);
            list.add(this.f323484J);
            list.add(this.f323487M);
            list.add(this.f323489O);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f323490P = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f323491Q = uVarH;
            this.f323492R = dagger.internal.g.d(new zM0.d(uVarH, this.f323490P));
        }

        @Override // com.avito.android.verification.di.confirm_requisites.b
        public final void a(VerificationConfirmRequisitesFragment verificationConfirmRequisitesFragment) {
            verificationConfirmRequisitesFragment.f324892n0 = this.f323503k;
            verificationConfirmRequisitesFragment.f324894p0 = this.f323502j.get();
            verificationConfirmRequisitesFragment.f324895q0 = this.f323492R.get();
            verificationConfirmRequisitesFragment.f324896r0 = this.f323491Q.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
