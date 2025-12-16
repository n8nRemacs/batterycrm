package com.avito.android.di.component;

import com.avito.android.H0;
import com.avito.android.InterfaceC32896n;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.clickstream.C28393s;
import com.avito.android.analytics.clickstream.H;
import com.avito.android.analytics.clickstream.InterfaceC28377b;
import com.avito.android.analytics.clickstream.h0;
import com.avito.android.analytics.clickstream.l0;
import com.avito.android.di.InterfaceC29969f;
import com.avito.android.di.component.InterfaceC29907n;
import com.avito.android.di.module.J2;
import com.avito.android.di.module.L2;
import com.avito.android.di.module.M2;
import com.avito.android.remote.t1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35950u;
import com.google.common.collect.H1;
import java.util.Set;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import proto.events.apps.EventOuterClass;
import xs0.C49992b;
import xs0.C49993c;

/* compiled from: DaggerClickStreamSendComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class s {

    /* compiled from: DaggerClickStreamSendComponent.java */
    public static final class b implements InterfaceC29907n.a {

        /* renamed from: a, reason: collision with root package name */
        public InterfaceC29969f f139329a;

        public b() {
        }

        @Override // com.avito.android.di.component.InterfaceC29907n.a
        public final InterfaceC29907n.a a(InterfaceC29969f interfaceC29969f) {
            this.f139329a = interfaceC29969f;
            return this;
        }

        @Override // com.avito.android.di.component.InterfaceC29907n.a
        public final InterfaceC29907n build() {
            dagger.internal.t.a(InterfaceC29969f.class, this.f139329a);
            return new c(this.f139329a, null);
        }
    }

    /* compiled from: DaggerClickStreamSendComponent.java */
    public static final class c implements InterfaceC29907n {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC29969f f139330a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.util.C> f139331b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<Set<Interceptor>> f139332c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<OkHttpClient> f139333d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<H0> f139334e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<String> f139335f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28377b> f139336g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.analytics.inhouse_transport.u<EventOuterClass.Event>> f139337h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.remote.H> f139338i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35950u> f139339j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<t1> f139340k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.geo.j> f139341l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<H.a> f139342m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f139343n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.analytics.clickstream.H> f139344o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32896n> f139345p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f139346q;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.u<h0> f139347r;

        /* compiled from: DaggerClickStreamSendComponent.java */
        public static final class a implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29969f f139348a;

            public a(InterfaceC29969f interfaceC29969f) {
                this.f139348a = interfaceC29969f;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f139348a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerClickStreamSendComponent.java */
        public static final class b implements dagger.internal.u<InterfaceC32896n> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29969f f139349a;

            public b(InterfaceC29969f interfaceC29969f) {
                this.f139349a = interfaceC29969f;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC32896n interfaceC32896nKh = this.f139349a.kh();
                dagger.internal.t.c(interfaceC32896nKh);
                return interfaceC32896nKh;
            }
        }

        /* compiled from: DaggerClickStreamSendComponent.java */
        /* renamed from: com.avito.android.di.component.s$c$c, reason: collision with other inner class name */
        public static final class C4204c implements dagger.internal.u<InterfaceC35950u> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29969f f139350a;

            public C4204c(InterfaceC29969f interfaceC29969f) {
                this.f139350a = interfaceC29969f;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35950u interfaceC35950uOg = this.f139350a.Og();
                dagger.internal.t.c(interfaceC35950uOg);
                return interfaceC35950uOg;
            }
        }

        /* compiled from: DaggerClickStreamSendComponent.java */
        public static final class d implements dagger.internal.u<com.avito.android.util.C> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29969f f139351a;

            public d(InterfaceC29969f interfaceC29969f) {
                this.f139351a = interfaceC29969f;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.C cJ2 = this.f139351a.j();
                dagger.internal.t.c(cJ2);
                return cJ2;
            }
        }

        /* compiled from: DaggerClickStreamSendComponent.java */
        public static final class e implements dagger.internal.u<com.avito.android.analytics.inhouse_transport.u<EventOuterClass.Event>> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29969f f139352a;

            public e(InterfaceC29969f interfaceC29969f) {
                this.f139352a = interfaceC29969f;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.analytics.inhouse_transport.u<EventOuterClass.Event> uVarVb = this.f139352a.vb();
                dagger.internal.t.c(uVarVb);
                return uVarVb;
            }
        }

        /* compiled from: DaggerClickStreamSendComponent.java */
        public static final class f implements dagger.internal.u<com.avito.android.remote.H> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29969f f139353a;

            public f(InterfaceC29969f interfaceC29969f) {
                this.f139353a = interfaceC29969f;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.remote.H hK2 = this.f139353a.K();
                dagger.internal.t.c(hK2);
                return hK2;
            }
        }

        /* compiled from: DaggerClickStreamSendComponent.java */
        public static final class g implements dagger.internal.u<com.avito.android.geo.j> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29969f f139354a;

            public g(InterfaceC29969f interfaceC29969f) {
                this.f139354a = interfaceC29969f;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.geo.j jVarUh = this.f139354a.Uh();
                dagger.internal.t.c(jVarUh);
                return jVarUh;
            }
        }

        /* compiled from: DaggerClickStreamSendComponent.java */
        public static final class h implements dagger.internal.u<H0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29969f f139355a;

            public h(InterfaceC29969f interfaceC29969f) {
                this.f139355a = interfaceC29969f;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                H0 h0M = this.f139355a.M();
                dagger.internal.t.c(h0M);
                return h0M;
            }
        }

        /* compiled from: DaggerClickStreamSendComponent.java */
        public static final class i implements dagger.internal.u<Set<Interceptor>> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29969f f139356a;

            public i(InterfaceC29969f interfaceC29969f) {
                this.f139356a = interfaceC29969f;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                H1 h1Hl = this.f139356a.Hl();
                dagger.internal.t.c(h1Hl);
                return h1Hl;
            }
        }

        /* compiled from: DaggerClickStreamSendComponent.java */
        public static final class j implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29969f f139357a;

            public j(InterfaceC29969f interfaceC29969f) {
                this.f139357a = interfaceC29969f;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f139357a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerClickStreamSendComponent.java */
        public static final class k implements dagger.internal.u<t1> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29969f f139358a;

            public k(InterfaceC29969f interfaceC29969f) {
                this.f139358a = interfaceC29969f;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f139358a.u7();
            }
        }

        public c(InterfaceC29969f interfaceC29969f, a aVar) {
            this.f139330a = interfaceC29969f;
            d dVar = new d(interfaceC29969f);
            this.f139331b = dVar;
            this.f139333d = dagger.internal.B.a(new com.avito.android.analytics.inhouse_transport.s(dVar, new i(interfaceC29969f)));
            dagger.internal.u<String> uVarD = dagger.internal.g.d(new L2(new h(interfaceC29969f), this.f139331b));
            this.f139335f = uVarD;
            this.f139336g = dagger.internal.B.a(new C28393s(uVarD, this.f139331b, this.f139333d));
            this.f139337h = new e(interfaceC29969f);
            f fVar = new f(interfaceC29969f);
            this.f139338i = fVar;
            dagger.internal.u<H.a> uVarD2 = dagger.internal.g.d(new C49992b(new C4204c(interfaceC29969f), fVar, new k(interfaceC29969f), new g(interfaceC29969f)));
            this.f139342m = uVarD2;
            dagger.internal.u<com.avito.android.analytics.clickstream.H> uVarD3 = dagger.internal.g.d(new M2(uVarD2, this.f139336g, this.f139337h, this.f139338i, new j(interfaceC29969f), this.f139331b));
            this.f139344o = uVarD3;
            this.f139347r = dagger.internal.g.d(new l0(uVarD3, new b(interfaceC29969f), new a(interfaceC29969f)));
        }

        @Override // com.avito.android.di.component.InterfaceC29907n
        public final C49993c a() {
            h0 h0Var = this.f139347r.get();
            J2.f144015a.getClass();
            return new C49993c(h0Var);
        }
    }

    public static InterfaceC29907n.a a() {
        return new b();
    }
}
