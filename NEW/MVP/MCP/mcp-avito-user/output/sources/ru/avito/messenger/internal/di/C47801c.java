package ru.avito.messenger.internal.di;

import Oq.InterfaceC14725a;
import com.avito.android.util.InterfaceC35745a5;
import com.google.gson.Gson;
import l91.C43605a;
import m91.InterfaceC43936c;
import okhttp3.OkHttpClient;
import ru.avito.messenger.A0;
import ru.avito.messenger.C47730b0;
import ru.avito.messenger.InterfaceC47728a0;
import ru.avito.messenger.InterfaceC47842z;
import ru.avito.messenger.MessengerApi;
import ru.avito.messenger.MessengerApiService;
import ru.avito.messenger.api.entity.MessengerResponse;
import ru.avito.messenger.internal.C47745a;
import ru.avito.messenger.internal.connection.InterfaceC47751d;
import ru.avito.messenger.u0;
import ru.avito.websocket.InterfaceC47843a;

/* compiled from: DaggerMessengerComponent.java */
@dagger.internal.e
/* renamed from: ru.avito.messenger.internal.di.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47801c {

    /* compiled from: DaggerMessengerComponent.java */
    /* renamed from: ru.avito.messenger.internal.di.c$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public C47817t f431588a;

        /* renamed from: b, reason: collision with root package name */
        public J f431589b;

        /* renamed from: c, reason: collision with root package name */
        public C47805g f431590c;

        /* renamed from: d, reason: collision with root package name */
        public C f431591d;

        /* renamed from: e, reason: collision with root package name */
        public C47799a f431592e;

        /* renamed from: f, reason: collision with root package name */
        public r f431593f;

        /* renamed from: g, reason: collision with root package name */
        public H f431594g;

        /* renamed from: h, reason: collision with root package name */
        public F f431595h;

        /* renamed from: i, reason: collision with root package name */
        public C47803e f431596i;

        /* renamed from: j, reason: collision with root package name */
        public C47808j f431597j;

        /* renamed from: k, reason: collision with root package name */
        public C47813o f431598k;

        /* renamed from: l, reason: collision with root package name */
        public z f431599l;

        public final y a() {
            dagger.internal.t.a(C47817t.class, this.f431588a);
            if (this.f431589b == null) {
                this.f431589b = new J();
            }
            dagger.internal.t.a(C47805g.class, this.f431590c);
            dagger.internal.t.a(C.class, this.f431591d);
            dagger.internal.t.a(C47799a.class, this.f431592e);
            dagger.internal.t.a(r.class, this.f431593f);
            dagger.internal.t.a(H.class, this.f431594g);
            if (this.f431595h == null) {
                this.f431595h = new F();
            }
            dagger.internal.t.a(C47803e.class, this.f431596i);
            if (this.f431597j == null) {
                this.f431597j = new C47808j();
            }
            dagger.internal.t.a(C47813o.class, this.f431598k);
            if (this.f431599l == null) {
                this.f431599l = new z();
            }
            return new C12408c(this.f431588a, this.f431589b, this.f431590c, this.f431591d, this.f431592e, this.f431593f, this.f431594g, this.f431595h, this.f431596i, this.f431597j, this.f431598k, this.f431599l, null);
        }

        public b() {
        }
    }

    /* compiled from: DaggerMessengerComponent.java */
    /* renamed from: ru.avito.messenger.internal.di.c$c, reason: collision with other inner class name */
    public static final class C12408c implements y {

        /* renamed from: a, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f431600a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.u<C47745a> f431601b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<OkHttpClient> f431602c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<A0> f431603d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<ru.avito.websocket.l> f431604e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<ru.avito.websocket.z> f431605f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC47843a> f431606g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC43936c> f431607h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<Gson> f431608i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC14725a> f431609j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<ru.avito.websocket.A<MessengerResponse>> f431610k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.jsonrpc.client.b<com.google.gson.i>> f431611l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<C43605a> f431612m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<Class<? extends MessengerApiService>> f431613n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.u<MessengerApiService> f431614o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<u0> f431615p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<Y81.d> f431616q;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC47751d> f431617r;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC47842z> f431618s;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<OkHttpClient> f431619t;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC47728a0> f431620u;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.u<Y81.c> f431621v;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.u<ru.avito.messenger.internal.jsonrpc.b> f431622w;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.jsonrpc.client.b<com.google.gson.i>> f431623x;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.u<MessengerApiService> f431624y;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.u<MessengerApi> f431625z;

        public C12408c(C47817t c47817t, J j12, C47805g c47805g, C c12, C47799a c47799a, r rVar, H h12, F f12, C47803e c47803e, C47808j c47808j, C47813o c47813o, z zVar, a aVar) {
            this.f431600a = dagger.internal.g.d(new G(f12));
            dagger.internal.u<C47745a> uVarD = dagger.internal.g.d(new C47800b(c47799a));
            this.f431601b = uVarD;
            this.f431602c = dagger.internal.g.d(new D(c12, uVarD));
            dagger.internal.u<A0> uVarD2 = dagger.internal.g.d(new Q(j12));
            this.f431603d = uVarD2;
            dagger.internal.u<ru.avito.websocket.l> uVarD3 = dagger.internal.g.d(new P(j12, this.f431601b, uVarD2));
            this.f431604e = uVarD3;
            dagger.internal.u<ru.avito.websocket.z> uVarD4 = dagger.internal.g.d(new T(j12, this.f431602c, uVarD3));
            this.f431605f = uVarD4;
            this.f431606g = dagger.internal.g.d(new S(j12, uVarD4, this.f431601b, this.f431600a));
            dagger.internal.u<InterfaceC43936c> uVarD5 = dagger.internal.g.d(new C47816s(rVar));
            this.f431607h = uVarD5;
            this.f431608i = dagger.internal.g.d(new C47807i(c47805g, uVarD5));
            dagger.internal.u<InterfaceC14725a> uVarD6 = dagger.internal.g.d(new C47804f(c47803e));
            this.f431609j = uVarD6;
            dagger.internal.u<ru.avito.websocket.A<MessengerResponse>> uVarD7 = dagger.internal.g.d(new W(j12, this.f431608i, uVarD6));
            this.f431610k = uVarD7;
            this.f431611l = dagger.internal.g.d(new U(j12, this.f431606g, uVarD7, this.f431608i, this.f431601b, this.f431607h, this.f431600a, this.f431609j));
            this.f431612m = dagger.internal.g.d(new C47806h(c47805g, this.f431608i));
            dagger.internal.u<Class<? extends MessengerApiService>> uVarD8 = dagger.internal.g.d(new I(h12));
            this.f431613n = uVarD8;
            this.f431614o = dagger.internal.g.d(new V(j12, this.f431611l, this.f431612m, this.f431607h, uVarD8));
            this.f431615p = dagger.internal.g.d(new x(c47817t, this.f431601b));
            dagger.internal.u<Y81.d> uVarD9 = dagger.internal.g.d(new B(zVar, this.f431601b));
            this.f431616q = uVarD9;
            dagger.internal.u<InterfaceC47751d> uVarD10 = dagger.internal.g.d(new C47818u(c47817t, this.f431606g, this.f431614o, this.f431610k, this.f431615p, this.f431601b, uVarD9, this.f431600a, this.f431607h, this.f431609j));
            this.f431617r = uVarD10;
            this.f431618s = dagger.internal.g.d(new C47819v(c47817t, this.f431600a, uVarD10, this.f431601b));
            dagger.internal.u<OkHttpClient> uVarD11 = dagger.internal.g.d(new C47815q(c47813o, this.f431602c));
            this.f431619t = uVarD11;
            this.f431620u = dagger.internal.g.d(new C47814p(c47813o, uVarD11, this.f431601b, this.f431608i, this.f431600a));
            this.f431621v = dagger.internal.g.d(new A(zVar, this.f431616q, this.f431600a));
            dagger.internal.u<ru.avito.messenger.internal.jsonrpc.b> uVarD12 = dagger.internal.g.d(new C47810l(c47808j, this.f431602c, this.f431608i, this.f431601b));
            this.f431622w = uVarD12;
            dagger.internal.u<com.avito.android.jsonrpc.client.b<com.google.gson.i>> uVarD13 = dagger.internal.g.d(new C47811m(c47808j, uVarD12, this.f431601b, this.f431607h, this.f431600a, this.f431609j));
            this.f431623x = uVarD13;
            dagger.internal.u<MessengerApiService> uVarD14 = dagger.internal.g.d(new C47812n(c47808j, this.f431613n, uVarD13, this.f431612m, this.f431607h));
            this.f431624y = uVarD14;
            this.f431625z = dagger.internal.g.d(new C47820w(c47817t, uVarD14));
        }

        @Override // ru.avito.messenger.internal.di.y
        public final C47730b0<MessengerApi> a() {
            return new C47730b0<>(this.f431618s.get(), this.f431620u.get(), this.f431608i.get(), this.f431621v.get(), this.f431625z.get());
        }
    }
}
