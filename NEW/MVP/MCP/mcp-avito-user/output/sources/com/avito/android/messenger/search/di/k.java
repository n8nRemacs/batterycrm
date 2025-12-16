package com.avito.android.messenger.search.di;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.date_time_formatter.o;
import com.avito.android.messenger.B;
import com.avito.android.messenger.InterfaceC32572u;
import com.avito.android.messenger.channels.mvi.data.C31705m;
import com.avito.android.messenger.channels.mvi.data.InterfaceC31700h;
import com.avito.android.messenger.channels.mvi.di.P;
import com.avito.android.messenger.channels.mvi.interactor.I;
import com.avito.android.messenger.channels.mvi.list_feature.s1;
import com.avito.android.messenger.channels.mvi.sync.InterfaceC31857r0;
import com.avito.android.messenger.di.N1;
import com.avito.android.messenger.di.p2;
import com.avito.android.messenger.search.ChannelsSearchFragment;
import com.avito.android.messenger.search.InterfaceC32569e;
import com.avito.android.messenger.search.di.a;
import com.avito.android.messenger.search.di.i;
import com.avito.android.messenger.search.q;
import com.avito.android.messenger.search.s;
import com.avito.android.messenger.search.w;
import com.avito.android.messenger.w0;
import com.avito.android.persistence.messenger.MessengerDatabase;
import com.avito.android.util.C;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.A;
import dagger.internal.q;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Locale;
import ru.avito.messenger.C47743i;
import ru.avito.messenger.F0;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: DaggerChannelsSearchFragmentComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class k {

    /* compiled from: DaggerChannelsSearchFragmentComponent.java */
    public static final class b implements com.avito.android.messenger.search.di.a {

        /* renamed from: A, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f197077A;

        /* renamed from: B, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f197078B;

        /* renamed from: C, reason: collision with root package name */
        public final u<F0> f197079C;

        /* renamed from: D, reason: collision with root package name */
        public final C47743i f197080D;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.messenger.search.di.b f197081a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.l f197082b;

        /* renamed from: c, reason: collision with root package name */
        public final u<w0> f197083c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC47842z> f197084d;

        /* renamed from: e, reason: collision with root package name */
        public final u<B> f197085e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28373a> f197086f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC35745a5> f197087g;

        /* renamed from: h, reason: collision with root package name */
        public final q f197088h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.f f197089i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC32569e> f197090j;

        /* renamed from: k, reason: collision with root package name */
        public final u<Context> f197091k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f197092l;

        /* renamed from: m, reason: collision with root package name */
        public final s1 f197093m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.server_time.f> f197094n;

        /* renamed from: o, reason: collision with root package name */
        public final u<Locale> f197095o;

        /* renamed from: p, reason: collision with root package name */
        public final u<o> f197096p;

        /* renamed from: q, reason: collision with root package name */
        public final fZ.d f197097q;

        /* renamed from: r, reason: collision with root package name */
        public final u<InterfaceC35741a1> f197098r;

        /* renamed from: s, reason: collision with root package name */
        public final u<MessengerDatabase> f197099s;

        /* renamed from: t, reason: collision with root package name */
        public final u<InterfaceC31700h> f197100t;

        /* renamed from: u, reason: collision with root package name */
        public final u<InterfaceC31857r0> f197101u;

        /* renamed from: v, reason: collision with root package name */
        public final u<C30277e1> f197102v;

        /* renamed from: w, reason: collision with root package name */
        public final w f197103w;

        /* renamed from: x, reason: collision with root package name */
        public final u<s> f197104x;

        /* renamed from: y, reason: collision with root package name */
        public final com.avito.android.messenger.search.di.e f197105y;

        /* renamed from: z, reason: collision with root package name */
        public final com.avito.android.messenger.search.di.j f197106z;

        /* compiled from: DaggerChannelsSearchFragmentComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.search.di.b f197107a;

            public a(com.avito.android.messenger.search.di.b bVar) {
                this.f197107a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f197107a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerChannelsSearchFragmentComponent.java */
        /* renamed from: com.avito.android.messenger.search.di.k$b$b, reason: collision with other inner class name */
        public static final class C5801b implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.search.di.b f197108a;

            public C5801b(com.avito.android.messenger.search.di.b bVar) {
                this.f197108a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f197108a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerChannelsSearchFragmentComponent.java */
        public static final class c implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.search.di.b f197109a;

            public c(com.avito.android.messenger.search.di.b bVar) {
                this.f197109a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f197109a.g();
            }
        }

        /* compiled from: DaggerChannelsSearchFragmentComponent.java */
        public static final class d implements u<InterfaceC35741a1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.search.di.b f197110a;

            public d(com.avito.android.messenger.search.di.b bVar) {
                this.f197110a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35741a1 interfaceC35741a1N = this.f197110a.n();
                t.c(interfaceC35741a1N);
                return interfaceC35741a1N;
            }
        }

        /* compiled from: DaggerChannelsSearchFragmentComponent.java */
        public static final class e implements u<Locale> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.search.di.b f197111a;

            public e(com.avito.android.messenger.search.di.b bVar) {
                this.f197111a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f197111a.locale();
            }
        }

        /* compiled from: DaggerChannelsSearchFragmentComponent.java */
        public static final class f implements u<InterfaceC31857r0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.search.di.b f197112a;

            public f(com.avito.android.messenger.search.di.b bVar) {
                this.f197112a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC31857r0 interfaceC31857r0Q7 = this.f197112a.q7();
                t.c(interfaceC31857r0Q7);
                return interfaceC31857r0Q7;
            }
        }

        /* compiled from: DaggerChannelsSearchFragmentComponent.java */
        public static final class g implements u<InterfaceC47842z> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.search.di.b f197113a;

            public g(com.avito.android.messenger.search.di.b bVar) {
                this.f197113a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f197113a.d0();
            }
        }

        /* compiled from: DaggerChannelsSearchFragmentComponent.java */
        public static final class h implements u<MessengerDatabase> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.search.di.b f197114a;

            public h(com.avito.android.messenger.search.di.b bVar) {
                this.f197114a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                MessengerDatabase messengerDatabaseW0 = this.f197114a.W0();
                t.c(messengerDatabaseW0);
                return messengerDatabaseW0;
            }
        }

        /* compiled from: DaggerChannelsSearchFragmentComponent.java */
        public static final class i implements u<B> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.search.di.b f197115a;

            public i(com.avito.android.messenger.search.di.b bVar) {
                this.f197115a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                B bL1 = this.f197115a.L1();
                t.c(bL1);
                return bL1;
            }
        }

        /* compiled from: DaggerChannelsSearchFragmentComponent.java */
        public static final class j implements u<C30277e1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.search.di.b f197116a;

            public j(com.avito.android.messenger.search.di.b bVar) {
                this.f197116a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f197116a.C();
            }
        }

        /* compiled from: DaggerChannelsSearchFragmentComponent.java */
        /* renamed from: com.avito.android.messenger.search.di.k$b$k, reason: collision with other inner class name */
        public static final class C5802k implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.search.di.b f197117a;

            public C5802k(com.avito.android.messenger.search.di.b bVar) {
                this.f197117a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f197117a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerChannelsSearchFragmentComponent.java */
        public static final class l implements u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.search.di.b f197118a;

            public l(com.avito.android.messenger.search.di.b bVar) {
                this.f197118a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f197118a.l();
                t.c(fVarL);
                return fVarL;
            }
        }

        /* compiled from: DaggerChannelsSearchFragmentComponent.java */
        public static final class m implements u<F0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.search.di.b f197119a;

            public m(com.avito.android.messenger.search.di.b bVar) {
                this.f197119a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f197119a.B0();
            }
        }

        /* compiled from: DaggerChannelsSearchFragmentComponent.java */
        public static final class n implements u<w0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.search.di.b f197120a;

            public n(com.avito.android.messenger.search.di.b bVar) {
                this.f197120a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                w0 w0VarK0 = this.f197120a.k0();
                t.c(w0VarK0);
                return w0VarK0;
            }
        }

        public b(com.avito.android.messenger.search.di.b bVar, Fragment fragment, Resources resources, a aVar) {
            this.f197081a = bVar;
            this.f197082b = dagger.internal.l.a(fragment);
            n nVar = new n(bVar);
            this.f197083c = nVar;
            g gVar = new g(bVar);
            i iVar = new i(bVar);
            a aVar2 = new a(bVar);
            this.f197086f = aVar2;
            C5802k c5802k = new C5802k(bVar);
            this.f197087g = c5802k;
            this.f197088h = new q(nVar, gVar, iVar, aVar2, c5802k);
            dagger.internal.f fVar = new dagger.internal.f();
            this.f197089i = fVar;
            this.f197090j = dagger.internal.g.d(new com.avito.android.messenger.search.di.f(fVar, this.f197082b));
            this.f197093m = new s1(new c(bVar), new C5801b(bVar));
            this.f197094n = new l(bVar);
            this.f197095o = new e(bVar);
            u<o> uVarA = dagger.internal.B.a(new p2(dagger.internal.l.a(resources), this.f197094n, this.f197095o));
            this.f197096p = uVarA;
            this.f197097q = new fZ.d(this.f197093m, uVarA);
            this.f197098r = new d(bVar);
            u<InterfaceC31700h> uVarA2 = dagger.internal.B.a(new C31705m(new N1(new h(bVar))));
            this.f197100t = uVarA2;
            f fVar2 = new f(bVar);
            u<InterfaceC35741a1> uVar = this.f197098r;
            u<InterfaceC28373a> uVar2 = this.f197086f;
            u<InterfaceC35745a5> uVar3 = this.f197087g;
            I i12 = new I(uVarA2, uVar, uVar2, uVar3, fVar2, this.f197083c);
            j jVar = new j(bVar);
            this.f197102v = jVar;
            this.f197103w = new w(this.f197090j, this.f197097q, uVar, i12, jVar, uVar3);
            q.b bVarA = dagger.internal.q.a(2);
            bVarA.a(com.avito.android.messenger.search.h.class, this.f197088h);
            bVarA.a(com.avito.android.messenger.search.t.class, this.f197103w);
            dagger.internal.f.a(this.f197089i, dagger.internal.B.a(new P(bVarA.b())));
            u<s> uVarD = dagger.internal.g.d(new com.avito.android.messenger.search.di.g(this.f197089i, this.f197082b));
            this.f197104x = uVarD;
            this.f197105y = new com.avito.android.messenger.search.di.e(new com.avito.android.messenger.search.adapter.channel.d(uVarD));
            this.f197106z = new com.avito.android.messenger.search.di.j(new com.avito.android.messenger.search.adapter.supportchannel.d(uVarD));
            A.b bVarA2 = A.a(3, 0);
            com.avito.android.messenger.search.di.i iVar2 = i.a.f197075a;
            List<u<T>> list = bVarA2.f393937a;
            list.add(iVar2);
            list.add(this.f197105y);
            list.add(this.f197106z);
            u<com.avito.konveyor.a> uVarD2 = dagger.internal.g.d(new com.avito.android.messenger.search.di.h(bVarA2.b()));
            this.f197077A = uVarD2;
            this.f197078B = dagger.internal.g.d(new com.avito.android.messenger.search.di.d(uVarD2));
            this.f197080D = new C47743i(new m(bVar), this.f197102v);
        }

        @Override // com.avito.android.messenger.search.di.a
        public final void a(ChannelsSearchFragment channelsSearchFragment) {
            com.avito.android.messenger.search.di.b bVar = this.f197081a;
            channelsSearchFragment.f196980p0 = bVar.j1();
            channelsSearchFragment.f196981q0 = this.f197104x.get();
            channelsSearchFragment.f196982r0 = this.f197078B.get();
            channelsSearchFragment.f196983s0 = this.f197077A.get();
            C cJ2 = bVar.j();
            t.c(cJ2);
            channelsSearchFragment.f196984t0 = cJ2;
            InterfaceC32572u interfaceC32572uU8 = bVar.U8();
            t.c(interfaceC32572uU8);
            channelsSearchFragment.f196985u0 = interfaceC32572uU8;
            channelsSearchFragment.f196986v0 = this.f197080D;
        }
    }

    /* compiled from: DaggerChannelsSearchFragmentComponent.java */
    public static final class c implements a.InterfaceC5800a {
        public c() {
        }

        @Override // com.avito.android.messenger.search.di.a.InterfaceC5800a
        public final com.avito.android.messenger.search.di.a a(ChannelsSearchFragment channelsSearchFragment, Resources resources, com.avito.android.messenger.search.di.b bVar) {
            return new b(bVar, channelsSearchFragment, resources, null);
        }
    }

    public static a.InterfaceC5800a a() {
        return new c();
    }
}
