package com.avito.android.publish.vinsuggest.di;

import com.avito.android.Q1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.publish.C0;
import com.avito.android.publish.PublishParametersInteractor;
import com.avito.android.publish.T0;
import com.avito.android.publish.di.I;
import com.avito.android.publish.di.J;
import com.avito.android.publish.drafts.E;
import com.avito.android.publish.drafts.PublishDraftRepository;
import com.avito.android.publish.vinsuggest.VinSuggestFragment;
import com.avito.android.publish.vinsuggest.VinSuggestOpenParams;
import com.avito.android.publish.vinsuggest.di.b;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.category_parameters.AttributesTreeConverter;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import dagger.internal.B;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;
import dl0.InterfaceC39749a;
import hz.InterfaceC41196a;
import lD.C43617a;
import yc.C50213a;

/* compiled from: DaggerVinSuggestComponent.java */
@e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerVinSuggestComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.publish.vinsuggest.di.b.a
        public final com.avito.android.publish.vinsuggest.di.b a(com.avito.android.publish.vinsuggest.di.c cVar, VinSuggestOpenParams vinSuggestOpenParams) {
            return new c(new I(), cVar, vinSuggestOpenParams, null);
        }
    }

    /* compiled from: DaggerVinSuggestComponent.java */
    public static final class c implements com.avito.android.publish.vinsuggest.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.publish.vinsuggest.di.c f245726a;

        /* renamed from: b, reason: collision with root package name */
        public final u<H0> f245727b;

        /* renamed from: c, reason: collision with root package name */
        public final u<C50213a> f245728c;

        /* renamed from: d, reason: collision with root package name */
        public final u<PublishDraftRepository> f245729d;

        /* renamed from: e, reason: collision with root package name */
        public final u<CategoryParametersConverter> f245730e;

        /* renamed from: f, reason: collision with root package name */
        public final u<AttributesTreeConverter> f245731f;

        /* renamed from: g, reason: collision with root package name */
        public final u<E> f245732g;

        /* renamed from: h, reason: collision with root package name */
        public final u<Q1> f245733h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC41196a> f245734i;

        /* renamed from: j, reason: collision with root package name */
        public final u<T0> f245735j;

        /* renamed from: k, reason: collision with root package name */
        public final u<PublishParametersInteractor> f245736k;

        /* renamed from: l, reason: collision with root package name */
        public final u<C0> f245737l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC39749a> f245738m;

        /* renamed from: n, reason: collision with root package name */
        public final u<R0> f245739n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC35745a5> f245740o;

        /* renamed from: p, reason: collision with root package name */
        public final u<C43617a> f245741p;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.publish.vinsuggest.j f245742q;

        /* compiled from: DaggerVinSuggestComponent.java */
        /* renamed from: com.avito.android.publish.vinsuggest.di.a$c$a, reason: collision with other inner class name */
        public static final class C7364a implements u<AttributesTreeConverter> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.vinsuggest.di.c f245743a;

            public C7364a(com.avito.android.publish.vinsuggest.di.c cVar) {
                this.f245743a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                AttributesTreeConverter attributesTreeConverterUe = this.f245743a.Ue();
                t.c(attributesTreeConverterUe);
                return attributesTreeConverterUe;
            }
        }

        /* compiled from: DaggerVinSuggestComponent.java */
        public static final class b implements u<C43617a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.vinsuggest.di.c f245744a;

            public b(com.avito.android.publish.vinsuggest.di.c cVar) {
                this.f245744a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f245744a.C0();
            }
        }

        /* compiled from: DaggerVinSuggestComponent.java */
        /* renamed from: com.avito.android.publish.vinsuggest.di.a$c$c, reason: collision with other inner class name */
        public static final class C7365c implements u<CategoryParametersConverter> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.vinsuggest.di.c f245745a;

            public C7365c(com.avito.android.publish.vinsuggest.di.c cVar) {
                this.f245745a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                CategoryParametersConverter categoryParametersConverterI = this.f245745a.I();
                t.c(categoryParametersConverterI);
                return categoryParametersConverterI;
            }
        }

        /* compiled from: DaggerVinSuggestComponent.java */
        public static final class d implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.vinsuggest.di.c f245746a;

            public d(com.avito.android.publish.vinsuggest.di.c cVar) {
                this.f245746a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f245746a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerVinSuggestComponent.java */
        public static final class e implements u<InterfaceC41196a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.vinsuggest.di.c f245747a;

            public e(com.avito.android.publish.vinsuggest.di.c cVar) {
                this.f245747a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC41196a interfaceC41196aE0 = this.f245747a.E0();
                t.c(interfaceC41196aE0);
                return interfaceC41196aE0;
            }
        }

        /* compiled from: DaggerVinSuggestComponent.java */
        public static final class f implements u<InterfaceC39749a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.vinsuggest.di.c f245748a;

            public f(com.avito.android.publish.vinsuggest.di.c cVar) {
                this.f245748a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC39749a interfaceC39749aAh = this.f245748a.ah();
                t.c(interfaceC39749aAh);
                return interfaceC39749aAh;
            }
        }

        /* compiled from: DaggerVinSuggestComponent.java */
        public static final class g implements u<C50213a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.vinsuggest.di.c f245749a;

            public g(com.avito.android.publish.vinsuggest.di.c cVar) {
                this.f245749a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C50213a c50213aD1 = this.f245749a.D1();
                t.c(c50213aD1);
                return c50213aD1;
            }
        }

        /* compiled from: DaggerVinSuggestComponent.java */
        public static final class h implements u<H0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.vinsuggest.di.c f245750a;

            public h(com.avito.android.publish.vinsuggest.di.c cVar) {
                this.f245750a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                H0 h0I3 = this.f245750a.I3();
                t.c(h0I3);
                return h0I3;
            }
        }

        /* compiled from: DaggerVinSuggestComponent.java */
        public static final class i implements u<PublishDraftRepository> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.vinsuggest.di.c f245751a;

            public i(com.avito.android.publish.vinsuggest.di.c cVar) {
                this.f245751a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                PublishDraftRepository publishDraftRepositoryMa = this.f245751a.Ma();
                t.c(publishDraftRepositoryMa);
                return publishDraftRepositoryMa;
            }
        }

        /* compiled from: DaggerVinSuggestComponent.java */
        public static final class j implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.vinsuggest.di.c f245752a;

            public j(com.avito.android.publish.vinsuggest.di.c cVar) {
                this.f245752a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eJg = this.f245752a.jg();
                t.c(eJg);
                return eJg;
            }
        }

        /* compiled from: DaggerVinSuggestComponent.java */
        public static final class k implements u<Q1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.vinsuggest.di.c f245753a;

            public k(com.avito.android.publish.vinsuggest.di.c cVar) {
                this.f245753a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f245753a.z0();
            }
        }

        /* compiled from: DaggerVinSuggestComponent.java */
        public static final class l implements u<C0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.vinsuggest.di.c f245754a;

            public l(com.avito.android.publish.vinsuggest.di.c cVar) {
                this.f245754a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C0 c0U = this.f245754a.u();
                t.c(c0U);
                return c0U;
            }
        }

        /* compiled from: DaggerVinSuggestComponent.java */
        public static final class m implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.vinsuggest.di.c f245755a;

            public m(com.avito.android.publish.vinsuggest.di.c cVar) {
                this.f245755a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f245755a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerVinSuggestComponent.java */
        public static final class n implements u<T0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.vinsuggest.di.c f245756a;

            public n(com.avito.android.publish.vinsuggest.di.c cVar) {
                this.f245756a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                T0 t0G0 = this.f245756a.G0();
                t.c(t0G0);
                return t0G0;
            }
        }

        public c(I i12, com.avito.android.publish.vinsuggest.di.c cVar, VinSuggestOpenParams vinSuggestOpenParams, C7363a c7363a) {
            this.f245726a = cVar;
            h hVar = new h(cVar);
            g gVar = new g(cVar);
            i iVar = new i(cVar);
            this.f245729d = iVar;
            this.f245736k = B.a(new J(i12, hVar, gVar, iVar, new C7365c(cVar), new C7364a(cVar), new j(cVar), new k(cVar), new e(cVar), new n(cVar)));
            this.f245737l = new l(cVar);
            this.f245738m = new f(cVar);
            this.f245739n = new d(cVar);
            this.f245742q = new com.avito.android.publish.vinsuggest.j(new com.avito.android.publish.vinsuggest.mvi.g(new com.avito.android.publish.vinsuggest.mvi.d(new com.avito.android.publish.vinsuggest.g(dagger.internal.l.a(vinSuggestOpenParams), this.f245736k, this.f245737l, this.f245738m, this.f245739n, this.f245729d, new m(cVar), new b(cVar))), com.avito.android.publish.vinsuggest.mvi.b.a(), com.avito.android.publish.vinsuggest.mvi.i.a(), com.avito.android.publish.vinsuggest.mvi.k.a()));
        }

        @Override // com.avito.android.publish.vinsuggest.di.b
        public final void a(VinSuggestFragment vinSuggestFragment) {
            vinSuggestFragment.f245686o0 = this.f245742q;
            com.avito.android.publish.vinsuggest.di.c cVar = this.f245726a;
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            vinSuggestFragment.f245688q0 = interfaceC28373aA;
            C0 c0U = cVar.u();
            t.c(c0U);
            vinSuggestFragment.f245689r0 = c0U;
        }
    }

    public static b.a a() {
        return new b();
    }
}
