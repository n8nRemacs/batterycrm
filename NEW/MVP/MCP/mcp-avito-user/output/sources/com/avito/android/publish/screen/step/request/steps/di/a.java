package com.avito.android.publish.screen.step.request.steps.di;

import Zd0.InterfaceC19543a;
import Zd0.InterfaceC19545c;
import android.app.Application;
import com.avito.android.Q1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.publish.C0;
import com.avito.android.publish.PublishParametersInteractor;
import com.avito.android.publish.T0;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.details.InterfaceC33685d0;
import com.avito.android.publish.di.I;
import com.avito.android.publish.di.J;
import com.avito.android.publish.di.S;
import com.avito.android.publish.di.U;
import com.avito.android.publish.drafts.E;
import com.avito.android.publish.drafts.PublishDraftRepository;
import com.avito.android.publish.objects.di.C33930m;
import com.avito.android.publish.objects.di.C33931n;
import com.avito.android.publish.objects.di.C33932o;
import com.avito.android.publish.screen.step.request.steps.StepsRequestFragment;
import com.avito.android.publish.screen.step.request.steps.di.b;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.category_parameters.AttributesTreeConverter;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.util.C;
import com.avito.android.util.L0;
import com.avito.android.util.R0;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import hz.InterfaceC41196a;
import yc.C50213a;

/* compiled from: DaggerStepsRequestComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerStepsRequestComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.publish.screen.step.request.steps.di.b.a
        public final com.avito.android.publish.screen.step.request.steps.di.b a(com.avito.android.publish.screen.step.request.steps.di.c cVar, C33930m c33930m, boolean z12, boolean z13) {
            return new c(new I(), new S(), c33930m, cVar, Boolean.valueOf(z12), Boolean.valueOf(z13), null);
        }
    }

    /* compiled from: DaggerStepsRequestComponent.java */
    public static final class c implements com.avito.android.publish.screen.step.request.steps.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final com.avito.android.publish.screen.step.request.steps.c f241966A;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.publish.screen.step.request.steps.di.c f241967a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.l f241968b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f241969c;

        /* renamed from: d, reason: collision with root package name */
        public final u<C0> f241970d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC33535v> f241971e;

        /* renamed from: f, reason: collision with root package name */
        public final u<Application> f241972f;

        /* renamed from: g, reason: collision with root package name */
        public final u<C> f241973g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.photo_cache.a> f241974h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.computer_vision.a> f241975i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.photo_cache.b> f241976j;

        /* renamed from: k, reason: collision with root package name */
        public final u<L0> f241977k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC33685d0> f241978l;

        /* renamed from: m, reason: collision with root package name */
        public final u<C50213a> f241979m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC19543a> f241980n;

        /* renamed from: o, reason: collision with root package name */
        public final u<H0> f241981o;

        /* renamed from: p, reason: collision with root package name */
        public final u<PublishDraftRepository> f241982p;

        /* renamed from: q, reason: collision with root package name */
        public final u<CategoryParametersConverter> f241983q;

        /* renamed from: r, reason: collision with root package name */
        public final u<AttributesTreeConverter> f241984r;

        /* renamed from: s, reason: collision with root package name */
        public final u<E> f241985s;

        /* renamed from: t, reason: collision with root package name */
        public final u<Q1> f241986t;

        /* renamed from: u, reason: collision with root package name */
        public final u<InterfaceC41196a> f241987u;

        /* renamed from: v, reason: collision with root package name */
        public final u<T0> f241988v;

        /* renamed from: w, reason: collision with root package name */
        public final u<PublishParametersInteractor> f241989w;

        /* renamed from: x, reason: collision with root package name */
        public final u<InterfaceC19545c> f241990x;

        /* renamed from: y, reason: collision with root package name */
        public final u<R0> f241991y;

        /* renamed from: z, reason: collision with root package name */
        public final u<com.avito.android.publish.screen.step.request.steps.loader.a> f241992z;

        /* compiled from: DaggerStepsRequestComponent.java */
        /* renamed from: com.avito.android.publish.screen.step.request.steps.di.a$c$a, reason: collision with other inner class name */
        public static final class C7249a implements u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.request.steps.di.c f241993a;

            public C7249a(com.avito.android.publish.screen.step.request.steps.di.c cVar) {
                this.f241993a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f241993a.k();
                t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerStepsRequestComponent.java */
        public static final class b implements u<AttributesTreeConverter> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.request.steps.di.c f241994a;

            public b(com.avito.android.publish.screen.step.request.steps.di.c cVar) {
                this.f241994a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                AttributesTreeConverter attributesTreeConverterUe = this.f241994a.Ue();
                t.c(attributesTreeConverterUe);
                return attributesTreeConverterUe;
            }
        }

        /* compiled from: DaggerStepsRequestComponent.java */
        /* renamed from: com.avito.android.publish.screen.step.request.steps.di.a$c$c, reason: collision with other inner class name */
        public static final class C7250c implements u<C> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.request.steps.di.c f241995a;

            public C7250c(com.avito.android.publish.screen.step.request.steps.di.c cVar) {
                this.f241995a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C cJ2 = this.f241995a.j();
                t.c(cJ2);
                return cJ2;
            }
        }

        /* compiled from: DaggerStepsRequestComponent.java */
        public static final class d implements u<CategoryParametersConverter> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.request.steps.di.c f241996a;

            public d(com.avito.android.publish.screen.step.request.steps.di.c cVar) {
                this.f241996a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                CategoryParametersConverter categoryParametersConverterI = this.f241996a.I();
                t.c(categoryParametersConverterI);
                return categoryParametersConverterI;
            }
        }

        /* compiled from: DaggerStepsRequestComponent.java */
        public static final class e implements u<com.avito.android.computer_vision.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.request.steps.di.c f241997a;

            public e(com.avito.android.publish.screen.step.request.steps.di.c cVar) {
                this.f241997a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.computer_vision.a aVarG6 = this.f241997a.g6();
                t.c(aVarG6);
                return aVarG6;
            }
        }

        /* compiled from: DaggerStepsRequestComponent.java */
        public static final class f implements u<L0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.request.steps.di.c f241998a;

            public f(com.avito.android.publish.screen.step.request.steps.di.c cVar) {
                this.f241998a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                L0 l0Z = this.f241998a.z();
                t.c(l0Z);
                return l0Z;
            }
        }

        /* compiled from: DaggerStepsRequestComponent.java */
        public static final class g implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.request.steps.di.c f241999a;

            public g(com.avito.android.publish.screen.step.request.steps.di.c cVar) {
                this.f241999a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f241999a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerStepsRequestComponent.java */
        public static final class h implements u<InterfaceC19543a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.request.steps.di.c f242000a;

            public h(com.avito.android.publish.screen.step.request.steps.di.c cVar) {
                this.f242000a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f242000a.L4();
            }
        }

        /* compiled from: DaggerStepsRequestComponent.java */
        public static final class i implements u<InterfaceC41196a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.request.steps.di.c f242001a;

            public i(com.avito.android.publish.screen.step.request.steps.di.c cVar) {
                this.f242001a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC41196a interfaceC41196aE0 = this.f242001a.E0();
                t.c(interfaceC41196aE0);
                return interfaceC41196aE0;
            }
        }

        /* compiled from: DaggerStepsRequestComponent.java */
        public static final class j implements u<com.avito.android.photo_cache.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.request.steps.di.c f242002a;

            public j(com.avito.android.publish.screen.step.request.steps.di.c cVar) {
                this.f242002a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f242002a.Zd();
            }
        }

        /* compiled from: DaggerStepsRequestComponent.java */
        public static final class k implements u<C50213a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.request.steps.di.c f242003a;

            public k(com.avito.android.publish.screen.step.request.steps.di.c cVar) {
                this.f242003a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C50213a c50213aD1 = this.f242003a.D1();
                t.c(c50213aD1);
                return c50213aD1;
            }
        }

        /* compiled from: DaggerStepsRequestComponent.java */
        public static final class l implements u<H0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.request.steps.di.c f242004a;

            public l(com.avito.android.publish.screen.step.request.steps.di.c cVar) {
                this.f242004a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                H0 h0I3 = this.f242004a.I3();
                t.c(h0I3);
                return h0I3;
            }
        }

        /* compiled from: DaggerStepsRequestComponent.java */
        public static final class m implements u<PublishDraftRepository> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.request.steps.di.c f242005a;

            public m(com.avito.android.publish.screen.step.request.steps.di.c cVar) {
                this.f242005a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                PublishDraftRepository publishDraftRepositoryMa = this.f242005a.Ma();
                t.c(publishDraftRepositoryMa);
                return publishDraftRepositoryMa;
            }
        }

        /* compiled from: DaggerStepsRequestComponent.java */
        public static final class n implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.request.steps.di.c f242006a;

            public n(com.avito.android.publish.screen.step.request.steps.di.c cVar) {
                this.f242006a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eJg = this.f242006a.jg();
                t.c(eJg);
                return eJg;
            }
        }

        /* compiled from: DaggerStepsRequestComponent.java */
        public static final class o implements u<InterfaceC33535v> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.request.steps.di.c f242007a;

            public o(com.avito.android.publish.screen.step.request.steps.di.c cVar) {
                this.f242007a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f242007a.P();
            }
        }

        /* compiled from: DaggerStepsRequestComponent.java */
        public static final class p implements u<Q1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.request.steps.di.c f242008a;

            public p(com.avito.android.publish.screen.step.request.steps.di.c cVar) {
                this.f242008a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f242008a.z0();
            }
        }

        /* compiled from: DaggerStepsRequestComponent.java */
        public static final class q implements u<InterfaceC19545c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.request.steps.di.c f242009a;

            public q(com.avito.android.publish.screen.step.request.steps.di.c cVar) {
                this.f242009a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC19545c interfaceC19545cD5 = this.f242009a.d5();
                t.c(interfaceC19545cD5);
                return interfaceC19545cD5;
            }
        }

        /* compiled from: DaggerStepsRequestComponent.java */
        public static final class r implements u<C0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.request.steps.di.c f242010a;

            public r(com.avito.android.publish.screen.step.request.steps.di.c cVar) {
                this.f242010a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C0 c0U = this.f242010a.u();
                t.c(c0U);
                return c0U;
            }
        }

        /* compiled from: DaggerStepsRequestComponent.java */
        public static final class s implements u<T0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.request.steps.di.c f242011a;

            public s(com.avito.android.publish.screen.step.request.steps.di.c cVar) {
                this.f242011a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                T0 t0G0 = this.f242011a.G0();
                t.c(t0G0);
                return t0G0;
            }
        }

        public c(I i12, S s5, C33930m c33930m, com.avito.android.publish.screen.step.request.steps.di.c cVar, Boolean bool, Boolean bool2, C7248a c7248a) {
            this.f241967a = cVar;
            this.f241968b = dagger.internal.l.a(bool);
            this.f241969c = dagger.internal.l.a(bool2);
            this.f241970d = new r(cVar);
            this.f241971e = new o(cVar);
            u<com.avito.android.photo_cache.b> uVarD = dagger.internal.g.d(new C33932o(c33930m, new C7249a(cVar), new C7250c(cVar), new j(cVar), new e(cVar)));
            this.f241976j = uVarD;
            this.f241978l = dagger.internal.g.d(new C33931n(c33930m, uVarD, new f(cVar)));
            k kVar = new k(cVar);
            this.f241979m = kVar;
            this.f241980n = new h(cVar);
            u<PublishParametersInteractor> uVarA = B.a(new J(i12, new l(cVar), kVar, new m(cVar), new d(cVar), new b(cVar), new n(cVar), new p(cVar), new i(cVar), new s(cVar)));
            this.f241989w = uVarA;
            u<com.avito.android.publish.screen.step.request.steps.loader.a> uVarD2 = dagger.internal.g.d(new com.avito.android.publish.screen.step.request.steps.loader.i(this.f241968b, this.f241969c, this.f241970d, this.f241971e, this.f241978l, this.f241979m, this.f241980n, uVarA, new q(cVar), new U(s5), new g(cVar)));
            this.f241992z = uVarD2;
            this.f241966A = new com.avito.android.publish.screen.step.request.steps.c(new com.avito.android.publish.screen.step.request.steps.mvi.h(new com.avito.android.publish.screen.step.request.steps.mvi.e(uVarD2), new com.avito.android.publish.screen.step.request.steps.mvi.c(uVarD2, this.f241970d), com.avito.android.publish.screen.step.request.steps.mvi.j.a(), com.avito.android.publish.screen.step.request.steps.mvi.l.a()));
        }

        @Override // com.avito.android.publish.screen.step.request.steps.di.b
        public final void a(StepsRequestFragment stepsRequestFragment) {
            stepsRequestFragment.f241946n0 = this.f241966A;
            com.avito.android.publish.screen.step.request.steps.di.c cVar = this.f241967a;
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            stepsRequestFragment.f241948p0 = interfaceC28373aA;
            C0 c0U = cVar.u();
            t.c(c0U);
            stepsRequestFragment.f241949q0 = c0U;
        }
    }

    public static b.a a() {
        return new b();
    }
}
