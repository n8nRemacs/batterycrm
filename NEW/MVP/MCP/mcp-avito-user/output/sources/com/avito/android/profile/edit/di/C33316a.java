package com.avito.android.profile.edit.di;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.geo_common.interactor.InterfaceC30715a;
import com.avito.android.profile.edit.EditProfileActivity;
import com.avito.android.profile.edit.InterfaceC33312a;
import com.avito.android.profile.edit.InterfaceC33315d;
import com.avito.android.profile.edit.InterfaceC33343x;
import com.avito.android.profile.edit.M;
import com.avito.android.profile.edit.V;
import com.avito.android.profile.edit.d0;
import com.avito.android.profile.edit.di.C33323h;
import com.avito.android.profile.edit.di.E;
import com.avito.android.profile.edit.di.G;
import com.avito.android.profile.edit.di.InterfaceC33317b;
import com.avito.android.profile.edit.di.j;
import com.avito.android.profile.edit.di.o;
import com.avito.android.profile.edit.di.q;
import com.avito.android.profile.edit.di.x;
import com.avito.android.profile.edit.di.z;
import com.avito.android.profile.edit.g0;
import com.avito.android.profile.edit.i0;
import com.avito.android.profile.edit.refactoring.adapter.InterfaceC33337a;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.remote.X;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.Kundle;
import com.google.gson.Gson;

/* compiled from: DaggerEditProfileComponent.java */
@dagger.internal.e
/* renamed from: com.avito.android.profile.edit.di.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33316a {

    /* compiled from: DaggerEditProfileComponent.java */
    /* renamed from: com.avito.android.profile.edit.di.a$b */
    public static final class b implements InterfaceC33317b.a {

        /* renamed from: a, reason: collision with root package name */
        public InterfaceC33318c f222098a;

        /* renamed from: b, reason: collision with root package name */
        public EditProfileActivity f222099b;

        /* renamed from: c, reason: collision with root package name */
        public Kundle f222100c;

        /* renamed from: d, reason: collision with root package name */
        public Kundle f222101d;

        /* renamed from: e, reason: collision with root package name */
        public Kundle f222102e;

        /* renamed from: f, reason: collision with root package name */
        public Gson f222103f;

        public b() {
        }

        @Override // com.avito.android.profile.edit.di.InterfaceC33317b.a
        public final InterfaceC33317b.a a(Gson gson) {
            this.f222103f = gson;
            return this;
        }

        @Override // com.avito.android.profile.edit.di.InterfaceC33317b.a
        public final InterfaceC33317b.a b(EditProfileActivity editProfileActivity) {
            this.f222099b = editProfileActivity;
            return this;
        }

        @Override // com.avito.android.profile.edit.di.InterfaceC33317b.a
        public final InterfaceC33317b build() {
            dagger.internal.t.a(InterfaceC33318c.class, this.f222098a);
            dagger.internal.t.a(Activity.class, this.f222099b);
            dagger.internal.t.a(Gson.class, this.f222103f);
            return new c(this.f222098a, this.f222099b, this.f222100c, this.f222101d, this.f222102e, this.f222103f, null);
        }

        @Override // com.avito.android.profile.edit.di.InterfaceC33317b.a
        public final InterfaceC33317b.a c(Kundle kundle) {
            this.f222101d = kundle;
            return this;
        }

        @Override // com.avito.android.profile.edit.di.InterfaceC33317b.a
        public final InterfaceC33317b.a d(Kundle kundle) {
            this.f222100c = kundle;
            return this;
        }

        @Override // com.avito.android.profile.edit.di.InterfaceC33317b.a
        public final InterfaceC33317b.a e(InterfaceC33318c interfaceC33318c) {
            this.f222098a = interfaceC33318c;
            return this;
        }

        @Override // com.avito.android.profile.edit.di.InterfaceC33317b.a
        public final InterfaceC33317b.a f(Kundle kundle) {
            this.f222102e = kundle;
            return this;
        }
    }

    /* compiled from: DaggerEditProfileComponent.java */
    /* renamed from: com.avito.android.profile.edit.di.a$c */
    public static final class c implements InterfaceC33317b {

        /* renamed from: A, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile.edit.refactoring.adapter.p> f222104A;

        /* renamed from: B, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile.edit.adapter.k> f222105B;

        /* renamed from: C, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile.edit.refactoring.adapter.j> f222106C;

        /* renamed from: D, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile.edit.adapter.e> f222107D;

        /* renamed from: E, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile.edit.refactoring.adapter.z> f222108E;

        /* renamed from: F, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile.edit.adapter.m> f222109F;

        /* renamed from: G, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f222110G;

        /* renamed from: H, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.j> f222111H;

        /* renamed from: I, reason: collision with root package name */
        public final dagger.internal.u<androidx.recyclerview.widget.C> f222112I;

        /* renamed from: J, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.a> f222113J;

        /* renamed from: K, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.data_aware.b> f222114K;

        /* renamed from: L, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.data_aware.e> f222115L;

        /* renamed from: M, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35741a1> f222116M;

        /* renamed from: N, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC33343x> f222117N;

        /* renamed from: O, reason: collision with root package name */
        public final dagger.internal.u<l90.c> f222118O;

        /* renamed from: P, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35863o4> f222119P;

        /* renamed from: Q, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC33312a> f222120Q;

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC33318c f222121a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC30715a> f222122b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<X> f222123c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f222124d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<Context> f222125e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<d0> f222126f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<V> f222127g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC34401z0> f222128h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.account.G> f222129i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<i0> f222130j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<Application> f222131k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.photo_picker.converter.b> f222132l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.photo_picker.converter.f> f222133m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile.edit.avatar.a> f222134n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.u<M> f222135o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC33315d> f222136p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f222137q;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.f f222138r;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC33337a> f222139s;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile.edit.adapter.a> f222140t;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile.edit.refactoring.adapter.l> f222141u;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile.edit.adapter.f> f222142v;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile.edit.adapter.h> f222143w;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile.edit.adapter.g> f222144x;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile.edit.refactoring.adapter.w> f222145y;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile.edit.adapter.l> f222146z;

        /* compiled from: DaggerEditProfileComponent.java */
        /* renamed from: com.avito.android.profile.edit.di.a$c$a, reason: collision with other inner class name */
        public static final class C6719a implements dagger.internal.u<com.avito.android.account.G> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC33318c f222147a;

            public C6719a(InterfaceC33318c interfaceC33318c) {
                this.f222147a = interfaceC33318c;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.account.G gW2 = this.f222147a.w();
                dagger.internal.t.c(gW2);
                return gW2;
            }
        }

        /* compiled from: DaggerEditProfileComponent.java */
        /* renamed from: com.avito.android.profile.edit.di.a$c$b */
        public static final class b implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC33318c f222148a;

            public b(InterfaceC33318c interfaceC33318c) {
                this.f222148a = interfaceC33318c;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f222148a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerEditProfileComponent.java */
        /* renamed from: com.avito.android.profile.edit.di.a$c$c, reason: collision with other inner class name */
        public static final class C6720c implements dagger.internal.u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC33318c f222149a;

            public C6720c(InterfaceC33318c interfaceC33318c) {
                this.f222149a = interfaceC33318c;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f222149a.k();
                dagger.internal.t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerEditProfileComponent.java */
        /* renamed from: com.avito.android.profile.edit.di.a$c$d */
        public static final class d implements dagger.internal.u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC33318c f222150a;

            public d(InterfaceC33318c interfaceC33318c) {
                this.f222150a = interfaceC33318c;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f222150a.g();
            }
        }

        /* compiled from: DaggerEditProfileComponent.java */
        /* renamed from: com.avito.android.profile.edit.di.a$c$e */
        public static final class e implements dagger.internal.u<InterfaceC35741a1> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC33318c f222151a;

            public e(InterfaceC33318c interfaceC33318c) {
                this.f222151a = interfaceC33318c;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35741a1 interfaceC35741a1N = this.f222151a.n();
                dagger.internal.t.c(interfaceC35741a1N);
                return interfaceC35741a1N;
            }
        }

        /* compiled from: DaggerEditProfileComponent.java */
        /* renamed from: com.avito.android.profile.edit.di.a$c$f */
        public static final class f implements dagger.internal.u<X> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC33318c f222152a;

            public f(InterfaceC33318c interfaceC33318c) {
                this.f222152a = interfaceC33318c;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f222152a.L2();
            }
        }

        /* compiled from: DaggerEditProfileComponent.java */
        /* renamed from: com.avito.android.profile.edit.di.a$c$g */
        public static final class g implements dagger.internal.u<l90.c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC33318c f222153a;

            public g(InterfaceC33318c interfaceC33318c) {
                this.f222153a = interfaceC33318c;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f222153a.s6();
            }
        }

        /* compiled from: DaggerEditProfileComponent.java */
        /* renamed from: com.avito.android.profile.edit.di.a$c$h */
        public static final class h implements dagger.internal.u<InterfaceC30715a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC33318c f222154a;

            public h(InterfaceC33318c interfaceC33318c) {
                this.f222154a = interfaceC33318c;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC30715a interfaceC30715aK3 = this.f222154a.k3();
                dagger.internal.t.c(interfaceC30715aK3);
                return interfaceC30715aK3;
            }
        }

        /* compiled from: DaggerEditProfileComponent.java */
        /* renamed from: com.avito.android.profile.edit.di.a$c$i */
        public static final class i implements dagger.internal.u<InterfaceC34401z0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC33318c f222155a;

            public i(InterfaceC33318c interfaceC33318c) {
                this.f222155a = interfaceC33318c;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34401z0 interfaceC34401z0B = this.f222155a.B();
                dagger.internal.t.c(interfaceC34401z0B);
                return interfaceC34401z0B;
            }
        }

        /* compiled from: DaggerEditProfileComponent.java */
        /* renamed from: com.avito.android.profile.edit.di.a$c$j */
        public static final class j implements dagger.internal.u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC33318c f222156a;

            public j(InterfaceC33318c interfaceC33318c) {
                this.f222156a = interfaceC33318c;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35863o4 interfaceC35863o4M = this.f222156a.m();
                dagger.internal.t.c(interfaceC35863o4M);
                return interfaceC35863o4M;
            }
        }

        /* compiled from: DaggerEditProfileComponent.java */
        /* renamed from: com.avito.android.profile.edit.di.a$c$k */
        public static final class k implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC33318c f222157a;

            public k(InterfaceC33318c interfaceC33318c) {
                this.f222157a = interfaceC33318c;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f222157a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        public c(InterfaceC33318c interfaceC33318c, Activity activity, Kundle kundle, Kundle kundle2, Kundle kundle3, Gson gson, C6718a c6718a) {
            this.f222121a = interfaceC33318c;
            this.f222122b = new h(interfaceC33318c);
            this.f222123c = new f(interfaceC33318c);
            this.f222124d = new k(interfaceC33318c);
            d dVar = new d(interfaceC33318c);
            this.f222125e = dVar;
            this.f222126f = dagger.internal.g.d(new v(dVar));
            dagger.internal.u<V> uVarD = dagger.internal.g.d(new u(dagger.internal.l.b(kundle2), this.f222122b, this.f222123c, this.f222124d, this.f222126f));
            this.f222127g = uVarD;
            i iVar = new i(interfaceC33318c);
            this.f222128h = iVar;
            this.f222130j = dagger.internal.g.d(new C(uVarD, iVar, new C6719a(interfaceC33318c), this.f222124d));
            this.f222131k = new C6720c(interfaceC33318c);
            this.f222132l = dagger.internal.g.d(new com.avito.android.profile.edit.di.i(this.f222131k, com.avito.android.photo_storage.k.a(this.f222125e)));
            dagger.internal.u<com.avito.android.photo_picker.converter.f> uVarD2 = dagger.internal.g.d(new H(this.f222132l, N70.d.a(dagger.internal.l.a(gson))));
            this.f222133m = uVarD2;
            this.f222134n = dagger.internal.g.d(new C33321f(uVarD2, this.f222128h, this.f222124d));
            this.f222135o = dagger.internal.g.d(new m(this.f222125e));
            this.f222136p = dagger.internal.g.d(new r(dagger.internal.l.b(kundle3), this.f222127g, this.f222124d, this.f222130j, this.f222134n, this.f222135o));
            this.f222137q = new b(interfaceC33318c);
            this.f222138r = new dagger.internal.f();
            dagger.internal.u<InterfaceC33337a> uVarD3 = dagger.internal.g.d(C33323h.a.f222166a);
            this.f222139s = uVarD3;
            this.f222140t = dagger.internal.g.d(new C33322g(uVarD3));
            dagger.internal.u<com.avito.android.profile.edit.refactoring.adapter.l> uVarD4 = dagger.internal.g.d(q.a.f222178a);
            this.f222141u = uVarD4;
            this.f222142v = dagger.internal.g.d(new p(uVarD4));
            dagger.internal.u<com.avito.android.profile.edit.adapter.h> uVarD5 = dagger.internal.g.d(x.a.f222200a);
            this.f222143w = uVarD5;
            this.f222144x = dagger.internal.g.d(new w(uVarD5));
            dagger.internal.u<com.avito.android.profile.edit.refactoring.adapter.w> uVarD6 = dagger.internal.g.d(E.a.f222093a);
            this.f222145y = uVarD6;
            this.f222146z = dagger.internal.g.d(new D(uVarD6));
            dagger.internal.u<com.avito.android.profile.edit.refactoring.adapter.p> uVarD7 = dagger.internal.g.d(z.a.f222202a);
            this.f222104A = uVarD7;
            this.f222105B = dagger.internal.g.d(new y(uVarD7));
            dagger.internal.u<com.avito.android.profile.edit.refactoring.adapter.j> uVarD8 = dagger.internal.g.d(o.a.f222176a);
            this.f222106C = uVarD8;
            this.f222107D = dagger.internal.g.d(new n(uVarD8));
            dagger.internal.u<com.avito.android.profile.edit.refactoring.adapter.z> uVarD9 = dagger.internal.g.d(G.a.f222095a);
            this.f222108E = uVarD9;
            dagger.internal.u<com.avito.android.profile.edit.adapter.m> uVarD10 = dagger.internal.g.d(new F(uVarD9));
            this.f222109F = uVarD10;
            dagger.internal.u<com.avito.konveyor.a> uVarD11 = dagger.internal.g.d(new s(uVarD10, this.f222140t, this.f222142v, this.f222144x, this.f222146z, this.f222105B, this.f222107D));
            this.f222110G = uVarD11;
            dagger.internal.u<com.avito.konveyor.adapter.j> uVarD12 = dagger.internal.g.d(new B(this.f222138r, uVarD11));
            this.f222111H = uVarD12;
            this.f222112I = dagger.internal.g.d(new t(uVarD12));
            this.f222113J = dagger.internal.g.d(new C33320e(this.f222110G));
            dagger.internal.u<com.avito.android.recycler.data_aware.b> uVarD13 = dagger.internal.g.d(j.a.f222169a);
            this.f222114K = uVarD13;
            dagger.internal.u<com.avito.android.recycler.data_aware.e> uVarD14 = dagger.internal.g.d(new l(uVarD13));
            this.f222115L = uVarD14;
            dagger.internal.f.a(this.f222138r, dagger.internal.g.d(new com.avito.android.profile.edit.di.k(uVarD14, this.f222112I, this.f222113J)));
            this.f222116M = new e(interfaceC33318c);
            this.f222117N = dagger.internal.g.d(new A(this.f222136p, this.f222137q, this.f222138r, this.f222124d, this.f222116M, dagger.internal.l.b(kundle)));
            this.f222120Q = dagger.internal.g.d(new g0(new g(interfaceC33318c), new j(interfaceC33318c)));
        }

        @Override // com.avito.android.profile.edit.di.InterfaceC33317b
        public final void a(EditProfileActivity editProfileActivity) {
            editProfileActivity.f221946m = this.f222117N.get();
            editProfileActivity.f221947n = this.f222136p.get();
            editProfileActivity.f221948o = this.f222127g.get();
            InterfaceC33318c interfaceC33318c = this.f222121a;
            editProfileActivity.f221949p = interfaceC33318c.P8();
            editProfileActivity.f221950q = interfaceC33318c.y3();
            editProfileActivity.f221951r = interfaceC33318c.t0();
            editProfileActivity.f221952s = this.f222120Q.get();
            editProfileActivity.f221953t = this.f222111H.get();
            InterfaceC28373a interfaceC28373aA = interfaceC33318c.a();
            dagger.internal.t.c(interfaceC28373aA);
            editProfileActivity.f221954u = interfaceC28373aA;
            editProfileActivity.f221955v = interfaceC33318c.h();
        }
    }

    public static InterfaceC33317b.a a() {
        return new b();
    }
}
