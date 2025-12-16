package com.avito.android.publish.screen.step.request.publish.di;

import android.app.Application;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.photo_picker.b0;
import com.avito.android.publish.C0;
import com.avito.android.publish.InterfaceC33544d;
import com.avito.android.publish.W0;
import com.avito.android.publish.objects.di.C33930m;
import com.avito.android.publish.objects.di.C33932o;
import com.avito.android.publish.objects.di.C33933p;
import com.avito.android.publish.objects.di.C33934q;
import com.avito.android.publish.screen.step.request.publish.PublishRequestFragment;
import com.avito.android.publish.screen.step.request.publish.di.b;
import com.avito.android.publish.screen.step.request.publish.mvi.p;
import com.avito.android.publish.screen.step.request.publish.mvi.r;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.util.C;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;
import yc.C50213a;

/* compiled from: DaggerPublishRequestComponent.java */
@e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerPublishRequestComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.publish.screen.step.request.publish.di.b.a
        public final com.avito.android.publish.screen.step.request.publish.di.b a(com.avito.android.publish.screen.step.request.publish.di.c cVar, C33930m c33930m) {
            return new c(c33930m, cVar, null);
        }
    }

    /* compiled from: DaggerPublishRequestComponent.java */
    public static final class c implements com.avito.android.publish.screen.step.request.publish.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.publish.screen.step.request.publish.di.c f241858a;

        /* renamed from: b, reason: collision with root package name */
        public final u<C0> f241859b;

        /* renamed from: c, reason: collision with root package name */
        public final u<Application> f241860c;

        /* renamed from: d, reason: collision with root package name */
        public final u<C> f241861d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.photo_cache.a> f241862e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.computer_vision.a> f241863f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.photo_cache.b> f241864g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC35745a5> f241865h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.photo_cache.j> f241866i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC33544d> f241867j;

        /* renamed from: k, reason: collision with root package name */
        public final u<H0> f241868k;

        /* renamed from: l, reason: collision with root package name */
        public final u<C50213a> f241869l;

        /* renamed from: m, reason: collision with root package name */
        public final u<CategoryParametersConverter> f241870m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.publish.publish_advert_request.data.a> f241871n;

        /* renamed from: o, reason: collision with root package name */
        public final u<W0> f241872o;

        /* renamed from: p, reason: collision with root package name */
        public final u<InterfaceC28373a> f241873p;

        /* renamed from: q, reason: collision with root package name */
        public final u<R0> f241874q;

        /* renamed from: r, reason: collision with root package name */
        public final u<PhotoPickerIntentFactory> f241875r;

        /* renamed from: s, reason: collision with root package name */
        public final u<b0> f241876s;

        /* renamed from: t, reason: collision with root package name */
        public final com.avito.android.publish.screen.step.request.publish.c f241877t;

        /* compiled from: DaggerPublishRequestComponent.java */
        /* renamed from: com.avito.android.publish.screen.step.request.publish.di.a$c$a, reason: collision with other inner class name */
        public static final class C7246a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.request.publish.di.c f241878a;

            public C7246a(com.avito.android.publish.screen.step.request.publish.di.c cVar) {
                this.f241878a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f241878a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerPublishRequestComponent.java */
        public static final class b implements u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.request.publish.di.c f241879a;

            public b(com.avito.android.publish.screen.step.request.publish.di.c cVar) {
                this.f241879a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f241879a.k();
                t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerPublishRequestComponent.java */
        /* renamed from: com.avito.android.publish.screen.step.request.publish.di.a$c$c, reason: collision with other inner class name */
        public static final class C7247c implements u<C> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.request.publish.di.c f241880a;

            public C7247c(com.avito.android.publish.screen.step.request.publish.di.c cVar) {
                this.f241880a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C cJ2 = this.f241880a.j();
                t.c(cJ2);
                return cJ2;
            }
        }

        /* compiled from: DaggerPublishRequestComponent.java */
        public static final class d implements u<CategoryParametersConverter> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.request.publish.di.c f241881a;

            public d(com.avito.android.publish.screen.step.request.publish.di.c cVar) {
                this.f241881a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                CategoryParametersConverter categoryParametersConverterI = this.f241881a.I();
                t.c(categoryParametersConverterI);
                return categoryParametersConverterI;
            }
        }

        /* compiled from: DaggerPublishRequestComponent.java */
        public static final class e implements u<com.avito.android.computer_vision.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.request.publish.di.c f241882a;

            public e(com.avito.android.publish.screen.step.request.publish.di.c cVar) {
                this.f241882a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.computer_vision.a aVarG6 = this.f241882a.g6();
                t.c(aVarG6);
                return aVarG6;
            }
        }

        /* compiled from: DaggerPublishRequestComponent.java */
        public static final class f implements u<InterfaceC33544d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.request.publish.di.c f241883a;

            public f(com.avito.android.publish.screen.step.request.publish.di.c cVar) {
                this.f241883a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC33544d interfaceC33544dN1 = this.f241883a.n1();
                t.c(interfaceC33544dN1);
                return interfaceC33544dN1;
            }
        }

        /* compiled from: DaggerPublishRequestComponent.java */
        public static final class g implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.request.publish.di.c f241884a;

            public g(com.avito.android.publish.screen.step.request.publish.di.c cVar) {
                this.f241884a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f241884a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerPublishRequestComponent.java */
        public static final class h implements u<com.avito.android.photo_cache.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.request.publish.di.c f241885a;

            public h(com.avito.android.publish.screen.step.request.publish.di.c cVar) {
                this.f241885a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f241885a.Zd();
            }
        }

        /* compiled from: DaggerPublishRequestComponent.java */
        public static final class i implements u<PhotoPickerIntentFactory> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.request.publish.di.c f241886a;

            public i(com.avito.android.publish.screen.step.request.publish.di.c cVar) {
                this.f241886a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f241886a.X();
            }
        }

        /* compiled from: DaggerPublishRequestComponent.java */
        public static final class j implements u<C50213a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.request.publish.di.c f241887a;

            public j(com.avito.android.publish.screen.step.request.publish.di.c cVar) {
                this.f241887a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C50213a c50213aD1 = this.f241887a.D1();
                t.c(c50213aD1);
                return c50213aD1;
            }
        }

        /* compiled from: DaggerPublishRequestComponent.java */
        public static final class k implements u<H0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.request.publish.di.c f241888a;

            public k(com.avito.android.publish.screen.step.request.publish.di.c cVar) {
                this.f241888a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                H0 h0I3 = this.f241888a.I3();
                t.c(h0I3);
                return h0I3;
            }
        }

        /* compiled from: DaggerPublishRequestComponent.java */
        public static final class l implements u<C0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.request.publish.di.c f241889a;

            public l(com.avito.android.publish.screen.step.request.publish.di.c cVar) {
                this.f241889a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C0 c0U = this.f241889a.u();
                t.c(c0U);
                return c0U;
            }
        }

        /* compiled from: DaggerPublishRequestComponent.java */
        public static final class m implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.request.publish.di.c f241890a;

            public m(com.avito.android.publish.screen.step.request.publish.di.c cVar) {
                this.f241890a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f241890a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerPublishRequestComponent.java */
        public static final class n implements u<W0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.request.publish.di.c f241891a;

            public n(com.avito.android.publish.screen.step.request.publish.di.c cVar) {
                this.f241891a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                W0 w0I4 = this.f241891a.i4();
                t.c(w0I4);
                return w0I4;
            }
        }

        public c(C33930m c33930m, com.avito.android.publish.screen.step.request.publish.di.c cVar, C7245a c7245a) {
            this.f241858a = cVar;
            this.f241859b = new l(cVar);
            b bVar = new b(cVar);
            this.f241860c = bVar;
            u<com.avito.android.photo_cache.b> uVarD = dagger.internal.g.d(new C33932o(c33930m, bVar, new C7247c(cVar), new h(cVar), new e(cVar)));
            this.f241864g = uVarD;
            this.f241866i = dagger.internal.g.d(new C33934q(c33930m, uVarD, new m(cVar)));
            this.f241867j = new f(cVar);
            this.f241871n = dagger.internal.g.d(new com.avito.android.publish.publish_advert_request.data.d(new k(cVar), new j(cVar), new d(cVar)));
            this.f241872o = new n(cVar);
            this.f241873p = new C7246a(cVar);
            this.f241874q = new g(cVar);
            u<b0> uVarD2 = dagger.internal.g.d(new C33933p(c33930m, this.f241860c, new i(cVar)));
            this.f241876s = uVarD2;
            this.f241877t = new com.avito.android.publish.screen.step.request.publish.c(new com.avito.android.publish.screen.step.request.publish.mvi.n(new com.avito.android.publish.screen.step.request.publish.mvi.k(uVarD2, this.f241859b, this.f241866i, this.f241867j, this.f241871n, this.f241872o, this.f241873p, this.f241874q), p.a(), r.a()));
        }

        @Override // com.avito.android.publish.screen.step.request.publish.di.b
        public final void a(PublishRequestFragment publishRequestFragment) {
            publishRequestFragment.f241834n0 = this.f241877t;
            InterfaceC28373a interfaceC28373aA = this.f241858a.a();
            t.c(interfaceC28373aA);
            publishRequestFragment.f241836p0 = interfaceC28373aA;
            publishRequestFragment.f241837q0 = this.f241866i.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
