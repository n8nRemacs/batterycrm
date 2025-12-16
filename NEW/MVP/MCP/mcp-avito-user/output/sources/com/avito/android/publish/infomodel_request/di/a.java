package com.avito.android.publish.infomodel_request.di;

import Zd0.InterfaceC19543a;
import Zd0.InterfaceC19545c;
import android.app.Application;
import com.avito.android.Q1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.tracker.Z;
import com.avito.android.analytics.screens.tracker.b0;
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
import com.avito.android.publish.infomodel_request.InfomodelRequestFragment;
import com.avito.android.publish.infomodel_request.di.b;
import com.avito.android.publish.objects.di.C33930m;
import com.avito.android.publish.objects.di.C33931n;
import com.avito.android.publish.objects.di.C33932o;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.category_parameters.AttributesTreeConverter;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.util.C;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.L0;
import dagger.internal.B;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;
import hz.InterfaceC41196a;
import yc.C50213a;

/* compiled from: DaggerInfomodelRequestComponent.java */
@e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerInfomodelRequestComponent.java */
    public static final class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.publish.infomodel_request.di.c f236100a;

        /* renamed from: b, reason: collision with root package name */
        public C33930m f236101b;

        public b() {
        }

        @Override // com.avito.android.publish.infomodel_request.di.b.a
        public final b.a a(C33930m c33930m) {
            this.f236101b = c33930m;
            return this;
        }

        @Override // com.avito.android.publish.infomodel_request.di.b.a
        public final b.a b(com.avito.android.publish.infomodel_request.di.c cVar) {
            this.f236100a = cVar;
            return this;
        }

        @Override // com.avito.android.publish.infomodel_request.di.b.a
        public final com.avito.android.publish.infomodel_request.di.b build() {
            t.a(com.avito.android.publish.infomodel_request.di.c.class, this.f236100a);
            t.a(C33930m.class, this.f236101b);
            return new c(new I(), new S(), this.f236101b, this.f236100a, null);
        }
    }

    /* compiled from: DaggerInfomodelRequestComponent.java */
    public static final class c implements com.avito.android.publish.infomodel_request.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<com.avito.android.publish.infomodel_request.o> f236102A;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.publish.infomodel_request.di.c f236103a;

        /* renamed from: b, reason: collision with root package name */
        public final u<H0> f236104b;

        /* renamed from: c, reason: collision with root package name */
        public final u<C50213a> f236105c;

        /* renamed from: d, reason: collision with root package name */
        public final u<PublishDraftRepository> f236106d;

        /* renamed from: e, reason: collision with root package name */
        public final u<CategoryParametersConverter> f236107e;

        /* renamed from: f, reason: collision with root package name */
        public final u<AttributesTreeConverter> f236108f;

        /* renamed from: g, reason: collision with root package name */
        public final u<E> f236109g;

        /* renamed from: h, reason: collision with root package name */
        public final u<Q1> f236110h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC41196a> f236111i;

        /* renamed from: j, reason: collision with root package name */
        public final u<T0> f236112j;

        /* renamed from: k, reason: collision with root package name */
        public final u<PublishParametersInteractor> f236113k;

        /* renamed from: l, reason: collision with root package name */
        public final u<Application> f236114l;

        /* renamed from: m, reason: collision with root package name */
        public final u<C> f236115m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.photo_cache.a> f236116n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.computer_vision.a> f236117o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.photo_cache.b> f236118p;

        /* renamed from: q, reason: collision with root package name */
        public final u<L0> f236119q;

        /* renamed from: r, reason: collision with root package name */
        public final u<InterfaceC33685d0> f236120r;

        /* renamed from: s, reason: collision with root package name */
        public final U f236121s;

        /* renamed from: t, reason: collision with root package name */
        public final u<InterfaceC35745a5> f236122t;

        /* renamed from: u, reason: collision with root package name */
        public final u<InterfaceC33535v> f236123u;

        /* renamed from: v, reason: collision with root package name */
        public final u<InterfaceC19543a> f236124v;

        /* renamed from: w, reason: collision with root package name */
        public final u<InterfaceC19545c> f236125w;

        /* renamed from: x, reason: collision with root package name */
        public final u<D> f236126x;

        /* renamed from: y, reason: collision with root package name */
        public final u<Z> f236127y;

        /* renamed from: z, reason: collision with root package name */
        public final u<C0> f236128z;

        /* compiled from: DaggerInfomodelRequestComponent.java */
        /* renamed from: com.avito.android.publish.infomodel_request.di.a$c$a, reason: collision with other inner class name */
        public static final class C7114a implements u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.infomodel_request.di.c f236129a;

            public C7114a(com.avito.android.publish.infomodel_request.di.c cVar) {
                this.f236129a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f236129a.k();
                dagger.internal.t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerInfomodelRequestComponent.java */
        public static final class b implements u<AttributesTreeConverter> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.infomodel_request.di.c f236130a;

            public b(com.avito.android.publish.infomodel_request.di.c cVar) {
                this.f236130a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                AttributesTreeConverter attributesTreeConverterUe = this.f236130a.Ue();
                dagger.internal.t.c(attributesTreeConverterUe);
                return attributesTreeConverterUe;
            }
        }

        /* compiled from: DaggerInfomodelRequestComponent.java */
        /* renamed from: com.avito.android.publish.infomodel_request.di.a$c$c, reason: collision with other inner class name */
        public static final class C7115c implements u<C> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.infomodel_request.di.c f236131a;

            public C7115c(com.avito.android.publish.infomodel_request.di.c cVar) {
                this.f236131a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C cJ2 = this.f236131a.j();
                dagger.internal.t.c(cJ2);
                return cJ2;
            }
        }

        /* compiled from: DaggerInfomodelRequestComponent.java */
        public static final class d implements u<CategoryParametersConverter> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.infomodel_request.di.c f236132a;

            public d(com.avito.android.publish.infomodel_request.di.c cVar) {
                this.f236132a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                CategoryParametersConverter categoryParametersConverterI = this.f236132a.I();
                dagger.internal.t.c(categoryParametersConverterI);
                return categoryParametersConverterI;
            }
        }

        /* compiled from: DaggerInfomodelRequestComponent.java */
        public static final class e implements u<com.avito.android.computer_vision.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.infomodel_request.di.c f236133a;

            public e(com.avito.android.publish.infomodel_request.di.c cVar) {
                this.f236133a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.computer_vision.a aVarG6 = this.f236133a.g6();
                dagger.internal.t.c(aVarG6);
                return aVarG6;
            }
        }

        /* compiled from: DaggerInfomodelRequestComponent.java */
        public static final class f implements u<L0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.infomodel_request.di.c f236134a;

            public f(com.avito.android.publish.infomodel_request.di.c cVar) {
                this.f236134a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                L0 l0Z = this.f236134a.z();
                dagger.internal.t.c(l0Z);
                return l0Z;
            }
        }

        /* compiled from: DaggerInfomodelRequestComponent.java */
        public static final class g implements u<InterfaceC19543a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.infomodel_request.di.c f236135a;

            public g(com.avito.android.publish.infomodel_request.di.c cVar) {
                this.f236135a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f236135a.L4();
            }
        }

        /* compiled from: DaggerInfomodelRequestComponent.java */
        public static final class h implements u<InterfaceC41196a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.infomodel_request.di.c f236136a;

            public h(com.avito.android.publish.infomodel_request.di.c cVar) {
                this.f236136a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC41196a interfaceC41196aE0 = this.f236136a.E0();
                dagger.internal.t.c(interfaceC41196aE0);
                return interfaceC41196aE0;
            }
        }

        /* compiled from: DaggerInfomodelRequestComponent.java */
        public static final class i implements u<com.avito.android.photo_cache.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.infomodel_request.di.c f236137a;

            public i(com.avito.android.publish.infomodel_request.di.c cVar) {
                this.f236137a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f236137a.Zd();
            }
        }

        /* compiled from: DaggerInfomodelRequestComponent.java */
        public static final class j implements u<C50213a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.infomodel_request.di.c f236138a;

            public j(com.avito.android.publish.infomodel_request.di.c cVar) {
                this.f236138a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C50213a c50213aD1 = this.f236138a.D1();
                dagger.internal.t.c(c50213aD1);
                return c50213aD1;
            }
        }

        /* compiled from: DaggerInfomodelRequestComponent.java */
        public static final class k implements u<H0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.infomodel_request.di.c f236139a;

            public k(com.avito.android.publish.infomodel_request.di.c cVar) {
                this.f236139a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                H0 h0I3 = this.f236139a.I3();
                dagger.internal.t.c(h0I3);
                return h0I3;
            }
        }

        /* compiled from: DaggerInfomodelRequestComponent.java */
        public static final class l implements u<PublishDraftRepository> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.infomodel_request.di.c f236140a;

            public l(com.avito.android.publish.infomodel_request.di.c cVar) {
                this.f236140a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                PublishDraftRepository publishDraftRepositoryMa = this.f236140a.Ma();
                dagger.internal.t.c(publishDraftRepositoryMa);
                return publishDraftRepositoryMa;
            }
        }

        /* compiled from: DaggerInfomodelRequestComponent.java */
        public static final class m implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.infomodel_request.di.c f236141a;

            public m(com.avito.android.publish.infomodel_request.di.c cVar) {
                this.f236141a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eJg = this.f236141a.jg();
                dagger.internal.t.c(eJg);
                return eJg;
            }
        }

        /* compiled from: DaggerInfomodelRequestComponent.java */
        public static final class n implements u<InterfaceC33535v> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.infomodel_request.di.c f236142a;

            public n(com.avito.android.publish.infomodel_request.di.c cVar) {
                this.f236142a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f236142a.P();
            }
        }

        /* compiled from: DaggerInfomodelRequestComponent.java */
        public static final class o implements u<Q1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.infomodel_request.di.c f236143a;

            public o(com.avito.android.publish.infomodel_request.di.c cVar) {
                this.f236143a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f236143a.z0();
            }
        }

        /* compiled from: DaggerInfomodelRequestComponent.java */
        public static final class p implements u<InterfaceC19545c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.infomodel_request.di.c f236144a;

            public p(com.avito.android.publish.infomodel_request.di.c cVar) {
                this.f236144a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC19545c interfaceC19545cD5 = this.f236144a.d5();
                dagger.internal.t.c(interfaceC19545cD5);
                return interfaceC19545cD5;
            }
        }

        /* compiled from: DaggerInfomodelRequestComponent.java */
        public static final class q implements u<C0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.infomodel_request.di.c f236145a;

            public q(com.avito.android.publish.infomodel_request.di.c cVar) {
                this.f236145a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C0 c0U = this.f236145a.u();
                dagger.internal.t.c(c0U);
                return c0U;
            }
        }

        /* compiled from: DaggerInfomodelRequestComponent.java */
        public static final class r implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.infomodel_request.di.c f236146a;

            public r(com.avito.android.publish.infomodel_request.di.c cVar) {
                this.f236146a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f236146a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerInfomodelRequestComponent.java */
        public static final class s implements u<T0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.infomodel_request.di.c f236147a;

            public s(com.avito.android.publish.infomodel_request.di.c cVar) {
                this.f236147a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                T0 t0G0 = this.f236147a.G0();
                dagger.internal.t.c(t0G0);
                return t0G0;
            }
        }

        /* compiled from: DaggerInfomodelRequestComponent.java */
        public static final class t implements u<D> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.infomodel_request.di.c f236148a;

            public t(com.avito.android.publish.infomodel_request.di.c cVar) {
                this.f236148a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f236148a.N5();
            }
        }

        public c(I i12, S s5, C33930m c33930m, com.avito.android.publish.infomodel_request.di.c cVar, C7113a c7113a) {
            this.f236103a = cVar;
            k kVar = new k(cVar);
            j jVar = new j(cVar);
            this.f236105c = jVar;
            this.f236113k = B.a(new J(i12, kVar, jVar, new l(cVar), new d(cVar), new b(cVar), new m(cVar), new o(cVar), new h(cVar), new s(cVar)));
            u<com.avito.android.photo_cache.b> uVarD = dagger.internal.g.d(new C33932o(c33930m, new C7114a(cVar), new C7115c(cVar), new i(cVar), new e(cVar)));
            this.f236118p = uVarD;
            this.f236120r = dagger.internal.g.d(new C33931n(c33930m, uVarD, new f(cVar)));
            this.f236121s = new U(s5);
            this.f236122t = new r(cVar);
            this.f236123u = new n(cVar);
            this.f236124v = new g(cVar);
            this.f236125w = new p(cVar);
            u<Z> uVarD2 = dagger.internal.g.d(new b0(new t(cVar)));
            this.f236127y = uVarD2;
            this.f236102A = dagger.internal.g.d(new com.avito.android.publish.infomodel_request.q(this.f236113k, this.f236120r, this.f236121s, this.f236122t, this.f236123u, this.f236124v, this.f236105c, this.f236125w, uVarD2, new q(cVar)));
        }

        @Override // com.avito.android.publish.infomodel_request.di.b
        public final void a(InfomodelRequestFragment infomodelRequestFragment) {
            infomodelRequestFragment.f236082f0 = this.f236102A.get();
            com.avito.android.publish.infomodel_request.di.c cVar = this.f236103a;
            InterfaceC28373a interfaceC28373aA = cVar.a();
            dagger.internal.t.c(interfaceC28373aA);
            infomodelRequestFragment.f236083g0 = interfaceC28373aA;
            infomodelRequestFragment.f236084h0 = this.f236127y.get();
            C0 c0U = cVar.u();
            dagger.internal.t.c(c0U);
            infomodelRequestFragment.f236085i0 = c0U;
        }
    }

    public static b.a a() {
        return new b();
    }
}
