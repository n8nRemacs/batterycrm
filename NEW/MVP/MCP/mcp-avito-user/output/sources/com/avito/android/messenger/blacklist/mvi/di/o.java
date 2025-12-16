package com.avito.android.messenger.blacklist.mvi.di;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.view.M0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.InterfaceC32572u;
import com.avito.android.messenger.blacklist.mvi.BlacklistFragment;
import com.avito.android.messenger.blacklist.mvi.C31686p;
import com.avito.android.messenger.blacklist.mvi.E;
import com.avito.android.messenger.blacklist.mvi.G;
import com.avito.android.messenger.blacklist.mvi.H;
import com.avito.android.messenger.blacklist.mvi.InterfaceC31683m;
import com.avito.android.messenger.blacklist.mvi.L;
import com.avito.android.messenger.blacklist.mvi.di.c;
import com.avito.android.messenger.channels.mvi.di.P;
import com.avito.android.messenger.w0;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.B;
import dagger.internal.q;
import dagger.internal.t;
import dagger.internal.u;
import java.util.Locale;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: DaggerBlacklistFragmentComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class o {

    /* compiled from: DaggerBlacklistFragmentComponent.java */
    public static final class b implements com.avito.android.messenger.blacklist.mvi.di.c {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.messenger.blacklist.mvi.di.d f186434a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.l f186435b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC35745a5> f186436c;

        /* renamed from: d, reason: collision with root package name */
        public final u<w0> f186437d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC47842z> f186438e;

        /* renamed from: f, reason: collision with root package name */
        public final u<M0> f186439f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.f f186440g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC31683m> f186441h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.server_time.f> f186442i;

        /* renamed from: j, reason: collision with root package name */
        public final u<Locale> f186443j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.date_time_formatter.a> f186444k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC35741a1> f186445l;

        /* renamed from: m, reason: collision with root package name */
        public final u<M0> f186446m;

        /* renamed from: n, reason: collision with root package name */
        public final u<G> f186447n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.messenger.blacklist.mvi.adapter.blocked_user.i> f186448o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.messenger.blacklist.mvi.adapter.blocked_user.e> f186449p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.messenger.blacklist.mvi.adapter.blocked_user.b> f186450q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f186451r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f186452s;

        /* compiled from: DaggerBlacklistFragmentComponent.java */
        public static final class a implements u<InterfaceC35741a1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.blacklist.mvi.di.d f186453a;

            public a(com.avito.android.messenger.blacklist.mvi.di.d dVar) {
                this.f186453a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35741a1 interfaceC35741a1N = this.f186453a.n();
                t.c(interfaceC35741a1N);
                return interfaceC35741a1N;
            }
        }

        /* compiled from: DaggerBlacklistFragmentComponent.java */
        /* renamed from: com.avito.android.messenger.blacklist.mvi.di.o$b$b, reason: collision with other inner class name */
        public static final class C5468b implements u<Locale> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.blacklist.mvi.di.d f186454a;

            public C5468b(com.avito.android.messenger.blacklist.mvi.di.d dVar) {
                this.f186454a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f186454a.locale();
            }
        }

        /* compiled from: DaggerBlacklistFragmentComponent.java */
        public static final class c implements u<InterfaceC47842z> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.blacklist.mvi.di.d f186455a;

            public c(com.avito.android.messenger.blacklist.mvi.di.d dVar) {
                this.f186455a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f186455a.d0();
            }
        }

        /* compiled from: DaggerBlacklistFragmentComponent.java */
        public static final class d implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.blacklist.mvi.di.d f186456a;

            public d(com.avito.android.messenger.blacklist.mvi.di.d dVar) {
                this.f186456a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f186456a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerBlacklistFragmentComponent.java */
        public static final class e implements u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.blacklist.mvi.di.d f186457a;

            public e(com.avito.android.messenger.blacklist.mvi.di.d dVar) {
                this.f186457a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f186457a.l();
                t.c(fVarL);
                return fVarL;
            }
        }

        /* compiled from: DaggerBlacklistFragmentComponent.java */
        public static final class f implements u<w0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.blacklist.mvi.di.d f186458a;

            public f(com.avito.android.messenger.blacklist.mvi.di.d dVar) {
                this.f186458a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                w0 w0VarK0 = this.f186458a.k0();
                t.c(w0VarK0);
                return w0VarK0;
            }
        }

        public b(com.avito.android.messenger.blacklist.mvi.di.d dVar, Fragment fragment, Resources resources, a aVar) {
            this.f186434a = dVar;
            this.f186435b = dagger.internal.l.a(fragment);
            d dVar2 = new d(dVar);
            this.f186436c = dVar2;
            this.f186439f = dagger.internal.g.d(new E(dVar2, new f(dVar), new c(dVar)));
            dagger.internal.f fVar = new dagger.internal.f();
            this.f186440g = fVar;
            this.f186441h = dagger.internal.g.d(new h(fVar, this.f186435b));
            this.f186442i = new e(dVar);
            u<com.avito.android.date_time_formatter.a> uVarD = dagger.internal.g.d(new g(dagger.internal.l.a(resources), this.f186442i, new C5468b(dVar)));
            this.f186444k = uVarD;
            this.f186446m = dagger.internal.g.d(new L(uVarD, this.f186436c, this.f186441h, new a(dVar)));
            q.b bVarA = q.a(2);
            bVarA.a(C31686p.class, this.f186439f);
            bVarA.a(H.class, this.f186446m);
            dagger.internal.f.a(this.f186440g, B.a(new P(bVarA.b())));
            u<G> uVarD2 = dagger.internal.g.d(new i(this.f186440g, this.f186435b));
            this.f186447n = uVarD2;
            u<com.avito.android.messenger.blacklist.mvi.adapter.blocked_user.i> uVarD3 = dagger.internal.g.d(new m(uVarD2));
            this.f186448o = uVarD3;
            u<com.avito.android.messenger.blacklist.mvi.adapter.blocked_user.e> uVarD4 = dagger.internal.g.d(new k(uVarD3));
            this.f186449p = uVarD4;
            u<com.avito.android.messenger.blacklist.mvi.adapter.blocked_user.b> uVarD5 = dagger.internal.g.d(new j(uVarD4));
            this.f186450q = uVarD5;
            u<com.avito.konveyor.a> uVarD6 = dagger.internal.g.d(new l(uVarD5));
            this.f186451r = uVarD6;
            this.f186452s = dagger.internal.g.d(new com.avito.android.messenger.blacklist.mvi.di.f(uVarD6));
        }

        @Override // com.avito.android.messenger.blacklist.mvi.di.c
        public final void a(BlacklistFragment blacklistFragment) {
            com.avito.android.messenger.blacklist.mvi.di.d dVar = this.f186434a;
            InterfaceC35745a5 interfaceC35745a5D = dVar.d();
            t.c(interfaceC35745a5D);
            blacklistFragment.f186337n0 = interfaceC35745a5D;
            InterfaceC28373a interfaceC28373aA = dVar.a();
            t.c(interfaceC28373aA);
            blacklistFragment.f186338o0 = interfaceC28373aA;
            blacklistFragment.f186339p0 = this.f186452s.get();
            blacklistFragment.f186340q0 = this.f186451r.get();
            blacklistFragment.f186341r0 = this.f186447n.get();
            InterfaceC32572u interfaceC32572uX0 = dVar.x0();
            t.c(interfaceC32572uX0);
            blacklistFragment.f186342s0 = interfaceC32572uX0;
        }
    }

    /* compiled from: DaggerBlacklistFragmentComponent.java */
    public static final class c implements c.a {

        /* renamed from: a, reason: collision with root package name */
        public BlacklistFragment f186459a;

        /* renamed from: b, reason: collision with root package name */
        public Resources f186460b;

        /* renamed from: c, reason: collision with root package name */
        public d f186461c;

        public c() {
        }

        @Override // com.avito.android.messenger.blacklist.mvi.di.c.a
        public final c.a a(d dVar) {
            this.f186461c = dVar;
            return this;
        }

        @Override // com.avito.android.messenger.blacklist.mvi.di.c.a
        public final c.a b(Resources resources) {
            this.f186460b = resources;
            return this;
        }

        @Override // com.avito.android.messenger.blacklist.mvi.di.c.a
        public final com.avito.android.messenger.blacklist.mvi.di.c build() {
            t.a(Fragment.class, this.f186459a);
            t.a(Resources.class, this.f186460b);
            t.a(d.class, this.f186461c);
            return new b(this.f186461c, this.f186459a, this.f186460b, null);
        }

        @Override // com.avito.android.messenger.blacklist.mvi.di.c.a
        public final c.a c(BlacklistFragment blacklistFragment) {
            this.f186459a = blacklistFragment;
            return this;
        }
    }

    public static c.a a() {
        return new c();
    }
}
