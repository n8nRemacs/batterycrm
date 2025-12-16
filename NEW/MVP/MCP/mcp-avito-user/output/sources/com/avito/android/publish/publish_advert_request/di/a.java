package com.avito.android.publish.publish_advert_request.di;

import android.app.Application;
import android.content.res.Resources;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.photo_cache.j;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.photo_picker.b0;
import com.avito.android.publish.C0;
import com.avito.android.publish.InterfaceC33544d;
import com.avito.android.publish.W0;
import com.avito.android.publish.objects.di.C33930m;
import com.avito.android.publish.objects.di.C33932o;
import com.avito.android.publish.objects.di.C33933p;
import com.avito.android.publish.objects.di.C33934q;
import com.avito.android.publish.publish_advert_request.PublishAdvertRequestFragment;
import com.avito.android.publish.publish_advert_request.di.c;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.util.C;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;
import yc.C50213a;

/* compiled from: DaggerPublishAdvertRequestComponent.java */
@e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerPublishAdvertRequestComponent.java */
    public static final class b implements c.a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.publish.publish_advert_request.di.b f238973a;

        /* renamed from: b, reason: collision with root package name */
        public C33930m f238974b;

        /* renamed from: c, reason: collision with root package name */
        public Resources f238975c;

        public b() {
        }

        @Override // com.avito.android.publish.publish_advert_request.di.c.a
        public final c.a a(C33930m c33930m) {
            this.f238974b = c33930m;
            return this;
        }

        @Override // com.avito.android.publish.publish_advert_request.di.c.a
        public final c.a b(Resources resources) {
            this.f238975c = resources;
            return this;
        }

        @Override // com.avito.android.publish.publish_advert_request.di.c.a
        public final com.avito.android.publish.publish_advert_request.di.c build() {
            t.a(com.avito.android.publish.publish_advert_request.di.b.class, this.f238973a);
            t.a(C33930m.class, this.f238974b);
            t.a(Resources.class, this.f238975c);
            return new c(this.f238974b, this.f238973a, this.f238975c, null);
        }

        @Override // com.avito.android.publish.publish_advert_request.di.c.a
        public final c.a c(com.avito.android.publish.publish_advert_request.di.b bVar) {
            this.f238973a = bVar;
            return this;
        }
    }

    /* compiled from: DaggerPublishAdvertRequestComponent.java */
    public static final class c implements com.avito.android.publish.publish_advert_request.di.c {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.publish.publish_advert_request.di.b f238976a;

        /* renamed from: b, reason: collision with root package name */
        public final u<H0> f238977b;

        /* renamed from: c, reason: collision with root package name */
        public final u<C50213a> f238978c;

        /* renamed from: d, reason: collision with root package name */
        public final u<CategoryParametersConverter> f238979d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.publish.publish_advert_request.data.a> f238980e;

        /* renamed from: f, reason: collision with root package name */
        public final u<Application> f238981f;

        /* renamed from: g, reason: collision with root package name */
        public final u<PhotoPickerIntentFactory> f238982g;

        /* renamed from: h, reason: collision with root package name */
        public final u<b0> f238983h;

        /* renamed from: i, reason: collision with root package name */
        public final u<C> f238984i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.photo_cache.a> f238985j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.computer_vision.a> f238986k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.photo_cache.b> f238987l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC35745a5> f238988m;

        /* renamed from: n, reason: collision with root package name */
        public final u<j> f238989n;

        /* compiled from: DaggerPublishAdvertRequestComponent.java */
        /* renamed from: com.avito.android.publish.publish_advert_request.di.a$c$a, reason: collision with other inner class name */
        public static final class C7180a implements u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.publish_advert_request.di.b f238990a;

            public C7180a(com.avito.android.publish.publish_advert_request.di.b bVar) {
                this.f238990a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f238990a.k();
                t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerPublishAdvertRequestComponent.java */
        public static final class b implements u<C> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.publish_advert_request.di.b f238991a;

            public b(com.avito.android.publish.publish_advert_request.di.b bVar) {
                this.f238991a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C cJ2 = this.f238991a.j();
                t.c(cJ2);
                return cJ2;
            }
        }

        /* compiled from: DaggerPublishAdvertRequestComponent.java */
        /* renamed from: com.avito.android.publish.publish_advert_request.di.a$c$c, reason: collision with other inner class name */
        public static final class C7181c implements u<CategoryParametersConverter> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.publish_advert_request.di.b f238992a;

            public C7181c(com.avito.android.publish.publish_advert_request.di.b bVar) {
                this.f238992a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                CategoryParametersConverter categoryParametersConverterI = this.f238992a.I();
                t.c(categoryParametersConverterI);
                return categoryParametersConverterI;
            }
        }

        /* compiled from: DaggerPublishAdvertRequestComponent.java */
        public static final class d implements u<com.avito.android.computer_vision.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.publish_advert_request.di.b f238993a;

            public d(com.avito.android.publish.publish_advert_request.di.b bVar) {
                this.f238993a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.computer_vision.a aVarG6 = this.f238993a.g6();
                t.c(aVarG6);
                return aVarG6;
            }
        }

        /* compiled from: DaggerPublishAdvertRequestComponent.java */
        public static final class e implements u<com.avito.android.photo_cache.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.publish_advert_request.di.b f238994a;

            public e(com.avito.android.publish.publish_advert_request.di.b bVar) {
                this.f238994a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f238994a.Zd();
            }
        }

        /* compiled from: DaggerPublishAdvertRequestComponent.java */
        public static final class f implements u<PhotoPickerIntentFactory> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.publish_advert_request.di.b f238995a;

            public f(com.avito.android.publish.publish_advert_request.di.b bVar) {
                this.f238995a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f238995a.X();
            }
        }

        /* compiled from: DaggerPublishAdvertRequestComponent.java */
        public static final class g implements u<C50213a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.publish_advert_request.di.b f238996a;

            public g(com.avito.android.publish.publish_advert_request.di.b bVar) {
                this.f238996a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C50213a c50213aD1 = this.f238996a.D1();
                t.c(c50213aD1);
                return c50213aD1;
            }
        }

        /* compiled from: DaggerPublishAdvertRequestComponent.java */
        public static final class h implements u<H0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.publish_advert_request.di.b f238997a;

            public h(com.avito.android.publish.publish_advert_request.di.b bVar) {
                this.f238997a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                H0 h0I3 = this.f238997a.I3();
                t.c(h0I3);
                return h0I3;
            }
        }

        /* compiled from: DaggerPublishAdvertRequestComponent.java */
        public static final class i implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.publish_advert_request.di.b f238998a;

            public i(com.avito.android.publish.publish_advert_request.di.b bVar) {
                this.f238998a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f238998a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        public c(C33930m c33930m, com.avito.android.publish.publish_advert_request.di.b bVar, Resources resources, C7179a c7179a) {
            this.f238976a = bVar;
            this.f238980e = dagger.internal.g.d(new com.avito.android.publish.publish_advert_request.data.d(new h(bVar), new g(bVar), new C7181c(bVar)));
            C7180a c7180a = new C7180a(bVar);
            this.f238981f = c7180a;
            this.f238983h = dagger.internal.g.d(new C33933p(c33930m, c7180a, new f(bVar)));
            u<com.avito.android.photo_cache.b> uVarD = dagger.internal.g.d(new C33932o(c33930m, this.f238981f, new b(bVar), new e(bVar), new d(bVar)));
            this.f238987l = uVarD;
            this.f238989n = dagger.internal.g.d(new C33934q(c33930m, uVarD, new i(bVar)));
        }

        @Override // com.avito.android.publish.publish_advert_request.di.c
        public final void a(PublishAdvertRequestFragment publishAdvertRequestFragment) {
            com.avito.android.publish.publish_advert_request.data.a aVar = this.f238980e.get();
            com.avito.android.publish.publish_advert_request.di.b bVar = this.f238976a;
            InterfaceC28373a interfaceC28373aA = bVar.a();
            t.c(interfaceC28373aA);
            InterfaceC35745a5 interfaceC35745a5D = bVar.d();
            t.c(interfaceC35745a5D);
            b0 b0Var = this.f238983h.get();
            j jVar = this.f238989n.get();
            InterfaceC33544d interfaceC33544dN1 = bVar.n1();
            t.c(interfaceC33544dN1);
            C0 c0U = bVar.u();
            t.c(c0U);
            publishAdvertRequestFragment.f238955f0 = new com.avito.android.publish.publish_advert_request.g(aVar, interfaceC28373aA, interfaceC35745a5D, b0Var, jVar, interfaceC33544dN1, c0U);
            InterfaceC28373a interfaceC28373aA2 = bVar.a();
            t.c(interfaceC28373aA2);
            publishAdvertRequestFragment.f238956g0 = interfaceC28373aA2;
            W0 w0I4 = bVar.i4();
            t.c(w0I4);
            publishAdvertRequestFragment.f238957h0 = w0I4;
        }
    }

    public static c.a a() {
        return new b();
    }
}
