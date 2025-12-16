package com.avito.android.di.component;

import com.avito.android.analytics.statsd.C28518j;
import com.avito.android.analytics.statsd.InterfaceC28514f;
import com.avito.android.analytics.statsd.InterfaceC28520l;
import com.avito.android.analytics.statsd.Q;
import com.avito.android.analytics.statsd.StatsdRecord;
import com.avito.android.di.X;
import com.avito.android.di.component.N;
import com.avito.android.di.module.Q9;
import com.avito.android.util.InterfaceC35745a5;
import wc.C49593a;

/* compiled from: DaggerStatsdSendComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class A {

    /* compiled from: DaggerStatsdSendComponent.java */
    public static final class b implements N.a {

        /* renamed from: a, reason: collision with root package name */
        public X f139277a;

        public b() {
        }

        @Override // com.avito.android.di.component.N.a
        public final N.a a(X x12) {
            this.f139277a = x12;
            return this;
        }

        @Override // com.avito.android.di.component.N.a
        public final N build() {
            dagger.internal.t.a(X.class, this.f139277a);
            return new c(new Q9(), this.f139277a, null);
        }
    }

    /* compiled from: DaggerStatsdSendComponent.java */
    public static final class c implements N {

        /* renamed from: a, reason: collision with root package name */
        public final Q9 f139278a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28520l> f139279b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.analytics.inhouse_transport.u<StatsdRecord>> f139280c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f139281d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.server_time.h> f139282e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.analytics.statsd.J> f139283f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28514f> f139284g;

        /* compiled from: DaggerStatsdSendComponent.java */
        public static final class a implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final X f139285a;

            public a(X x12) {
                this.f139285a = x12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f139285a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerStatsdSendComponent.java */
        public static final class b implements dagger.internal.u<InterfaceC28520l> {

            /* renamed from: a, reason: collision with root package name */
            public final X f139286a;

            public b(X x12) {
                this.f139286a = x12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28520l interfaceC28520lN8 = this.f139286a.n8();
                dagger.internal.t.c(interfaceC28520lN8);
                return interfaceC28520lN8;
            }
        }

        /* compiled from: DaggerStatsdSendComponent.java */
        /* renamed from: com.avito.android.di.component.A$c$c, reason: collision with other inner class name */
        public static final class C4200c implements dagger.internal.u<com.avito.android.analytics.inhouse_transport.u<StatsdRecord>> {

            /* renamed from: a, reason: collision with root package name */
            public final X f139287a;

            public C4200c(X x12) {
                this.f139287a = x12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.analytics.inhouse_transport.u<StatsdRecord> uVarRb = this.f139287a.Rb();
                dagger.internal.t.c(uVarRb);
                return uVarRb;
            }
        }

        /* compiled from: DaggerStatsdSendComponent.java */
        public static final class d implements dagger.internal.u<com.avito.android.server_time.h> {

            /* renamed from: a, reason: collision with root package name */
            public final X f139288a;

            public d(X x12) {
                this.f139288a = x12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.h hVarY = this.f139288a.y();
                dagger.internal.t.c(hVarY);
                return hVarY;
            }
        }

        public c(Q9 q92, X x12, a aVar) {
            this.f139278a = q92;
            b bVar = new b(x12);
            C4200c c4200c = new C4200c(x12);
            a aVar2 = new a(x12);
            d dVar = new d(x12);
            Q.f91048e.getClass();
            dagger.internal.u<com.avito.android.analytics.statsd.J> uVarD = dagger.internal.g.d(new Q(bVar, c4200c, aVar2, dVar));
            this.f139283f = uVarD;
            C28518j.f91056b.getClass();
            this.f139284g = dagger.internal.g.d(new C28518j(uVarD));
        }

        @Override // com.avito.android.di.component.N
        public final C49593a a() {
            InterfaceC28514f interfaceC28514f = this.f139284g.get();
            this.f139278a.getClass();
            return new C49593a(interfaceC28514f);
        }
    }

    public static N.a a() {
        return new b();
    }
}
