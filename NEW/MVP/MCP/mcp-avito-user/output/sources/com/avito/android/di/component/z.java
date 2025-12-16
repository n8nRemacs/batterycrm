package com.avito.android.di.component;

import android.app.Application;
import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.component.M;
import com.avito.android.di.module.C30093k5;
import com.avito.android.di.module.H7;
import com.avito.android.di.module.I7;
import com.avito.android.di.module.J7;
import com.avito.android.di.module.K7;
import com.avito.android.di.module.M7;
import com.avito.android.service.short_task.metrics.C34906b;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35879r0;
import com.avito.android.util.InterfaceC35951u0;
import com.avito.android.util.L0;

/* compiled from: DaggerSendMetricsServiceComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class z {

    /* compiled from: DaggerSendMetricsServiceComponent.java */
    public static final class b implements M.a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.di.N f143755a;

        public b() {
        }

        @Override // com.avito.android.di.component.M.a
        public final M.a a(com.avito.android.di.N n12) {
            this.f143755a = n12;
            return this;
        }

        @Override // com.avito.android.di.component.M.a
        public final M build() {
            dagger.internal.t.a(com.avito.android.di.N.class, this.f143755a);
            return new c(this.f143755a, null);
        }
    }

    /* compiled from: DaggerSendMetricsServiceComponent.java */
    public static final class c implements M {

        /* renamed from: a, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.permissions.u> f143756a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.u<I30.d> f143757b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.service.short_task.metrics.s f143758c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<L0> f143759d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.service.short_task.metrics.j f143760e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<Context> f143761f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service.short_task.metrics.c> f143762g;

        /* renamed from: h, reason: collision with root package name */
        public final C34906b f143763h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<Application> f143764i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.service.short_task.metrics.l f143765j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35879r0> f143766k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35951u0> f143767l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service.short_task.metrics.g> f143768m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.analytics.H> f143769n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f143770o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f143771p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service.short_task.metrics.w> f143772q;

        /* compiled from: DaggerSendMetricsServiceComponent.java */
        public static final class a implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.di.N f143773a;

            public a(com.avito.android.di.N n12) {
                this.f143773a = n12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f143773a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerSendMetricsServiceComponent.java */
        public static final class b implements dagger.internal.u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.di.N f143774a;

            public b(com.avito.android.di.N n12) {
                this.f143774a = n12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f143774a.k();
                dagger.internal.t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerSendMetricsServiceComponent.java */
        /* renamed from: com.avito.android.di.component.z$c$c, reason: collision with other inner class name */
        public static final class C4207c implements dagger.internal.u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.di.N f143775a;

            public C4207c(com.avito.android.di.N n12) {
                this.f143775a = n12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f143775a.g();
            }
        }

        /* compiled from: DaggerSendMetricsServiceComponent.java */
        public static final class d implements dagger.internal.u<L0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.di.N f143776a;

            public d(com.avito.android.di.N n12) {
                this.f143776a = n12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                L0 l0Z = this.f143776a.z();
                dagger.internal.t.c(l0Z);
                return l0Z;
            }
        }

        /* compiled from: DaggerSendMetricsServiceComponent.java */
        public static final class e implements dagger.internal.u<com.avito.android.analytics.H> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.di.N f143777a;

            public e(com.avito.android.di.N n12) {
                this.f143777a = n12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.analytics.H hY02 = this.f143777a.y0();
                dagger.internal.t.c(hY02);
                return hY02;
            }
        }

        /* compiled from: DaggerSendMetricsServiceComponent.java */
        public static final class f implements dagger.internal.u<I30.d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.di.N f143778a;

            public f(com.avito.android.di.N n12) {
                this.f143778a = n12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f143778a.o1();
            }
        }

        /* compiled from: DaggerSendMetricsServiceComponent.java */
        public static final class g implements dagger.internal.u<com.avito.android.permissions.u> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.di.N f143779a;

            public g(com.avito.android.di.N n12) {
                this.f143779a = n12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f143779a.V();
            }
        }

        /* compiled from: DaggerSendMetricsServiceComponent.java */
        public static final class h implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.di.N f143780a;

            public h(com.avito.android.di.N n12) {
                this.f143780a = n12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f143780a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        public c(com.avito.android.di.N n12, a aVar) {
            this.f143758c = new com.avito.android.service.short_task.metrics.s(new g(n12), new f(n12));
            this.f143760e = new com.avito.android.service.short_task.metrics.j(new d(n12));
            C4207c c4207c = new C4207c(n12);
            this.f143761f = c4207c;
            dagger.internal.u<com.avito.android.service.short_task.metrics.c> uVarD = dagger.internal.g.d(new com.avito.android.service.short_task.metrics.e(c4207c));
            this.f143762g = uVarD;
            this.f143763h = new C34906b(uVarD);
            this.f143765j = new com.avito.android.service.short_task.metrics.l(new C30093k5(new b(n12)));
            dagger.internal.u<InterfaceC35879r0> uVarD2 = dagger.internal.g.d(new I7(this.f143761f));
            this.f143766k = uVarD2;
            dagger.internal.u<InterfaceC35951u0> uVarD3 = dagger.internal.g.d(new J7(uVarD2, this.f143761f));
            this.f143767l = uVarD3;
            dagger.internal.u<com.avito.android.service.short_task.metrics.g> uVarD4 = dagger.internal.g.d(new K7(uVarD3, this.f143766k));
            this.f143768m = uVarD4;
            com.avito.android.service.short_task.metrics.p pVar = new com.avito.android.service.short_task.metrics.p(new e(n12));
            a aVar2 = new a(n12);
            this.f143772q = dagger.internal.g.d(new M7(this.f143758c, this.f143760e, this.f143763h, this.f143765j, uVarD4, pVar, new com.avito.android.service.short_task.metrics.f(aVar2, this.f143761f), aVar2, new h(n12)));
        }

        @Override // com.avito.android.di.component.M
        public final com.avito.android.service.short_task.metrics.t a() {
            com.avito.android.service.short_task.metrics.w wVar = this.f143772q.get();
            H7.f143987a.getClass();
            return new com.avito.android.service.short_task.metrics.t(wVar);
        }
    }

    public static M.a a() {
        return new b();
    }
}
