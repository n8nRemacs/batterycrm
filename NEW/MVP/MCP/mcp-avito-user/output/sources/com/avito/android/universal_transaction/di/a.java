package com.avito.android.universal_transaction.di;

import FV0.h;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.lib.beduin_v2.feature.di.C31142p0;
import com.avito.android.lib.beduin_v2.feature.di.C31144q0;
import com.avito.android.lib.beduin_v2.feature.di.C31145r0;
import com.avito.android.lib.beduin_v2.feature.di.C31151u0;
import com.avito.android.lib.beduin_v2.feature.di.C31153v0;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.universal_transaction.di.b;
import com.avito.android.universal_transaction.mvi.j;
import com.avito.android.universal_transaction.mvi.o;
import com.avito.android.universal_transaction.mvi.q;
import com.avito.android.universal_transaction.mvi.s;
import com.avito.android.universal_transaction.transaction.TransactionFragment;
import com.avito.android.util.R0;
import com.avito.beduin.v2.engine.component.B;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.Set;
import xG0.C49834c;
import xG0.C49835d;
import yG0.C50113a;
import zG0.InterfaceC50459a;

/* compiled from: DaggerTransactionComponent.java */
@e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerTransactionComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.universal_transaction.di.b.a
        public final com.avito.android.universal_transaction.di.b a(String str, String str2, String str3, String str4, String str5, C28478k c28478k, com.avito.android.universal_transaction.di.c cVar, C31138n0 c31138n0) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            return new c(c31138n0, new C49834c(), cVar, str, str2, str3, str4, str5, c28478k, null);
        }
    }

    /* compiled from: DaggerTransactionComponent.java */
    public static final class c implements com.avito.android.universal_transaction.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.universal_transaction.di.c f306354a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC50459a> f306355b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f306356c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.universal_transaction.mvi.domain.b f306357d;

        /* renamed from: e, reason: collision with root package name */
        public final l f306358e;

        /* renamed from: f, reason: collision with root package name */
        public final l f306359f;

        /* renamed from: g, reason: collision with root package name */
        public final l f306360g;

        /* renamed from: h, reason: collision with root package name */
        public final l f306361h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.universal_transaction.mvi.l f306362i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.clientEventBus.a> f306363j;

        /* renamed from: k, reason: collision with root package name */
        public final j f306364k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC28481c> f306365l;

        /* renamed from: m, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f306366m;

        /* renamed from: n, reason: collision with root package name */
        public final o f306367n;

        /* renamed from: o, reason: collision with root package name */
        public final u<n.a> f306368o;

        /* renamed from: p, reason: collision with root package name */
        public final C31151u0 f306369p;

        /* renamed from: q, reason: collision with root package name */
        public final u<C50113a> f306370q;

        /* renamed from: r, reason: collision with root package name */
        public final u<B> f306371r;

        /* renamed from: s, reason: collision with root package name */
        public final u<Set<h>> f306372s;

        /* renamed from: t, reason: collision with root package name */
        public final com.avito.android.universal_transaction.transaction.B f306373t;

        /* compiled from: DaggerTransactionComponent.java */
        /* renamed from: com.avito.android.universal_transaction.di.a$c$a, reason: collision with other inner class name */
        public static final class C9411a implements u<com.avito.android.clientEventBus.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.universal_transaction.di.c f306374a;

            public C9411a(com.avito.android.universal_transaction.di.c cVar) {
                this.f306374a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.clientEventBus.a aVarH0 = this.f306374a.h0();
                t.c(aVarH0);
                return aVarH0;
            }
        }

        /* compiled from: DaggerTransactionComponent.java */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.universal_transaction.di.c f306375a;

            public b(com.avito.android.universal_transaction.di.c cVar) {
                this.f306375a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f306375a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerTransactionComponent.java */
        /* renamed from: com.avito.android.universal_transaction.di.a$c$c, reason: collision with other inner class name */
        public static final class C9412c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.universal_transaction.di.c f306376a;

            public C9412c(com.avito.android.universal_transaction.di.c cVar) {
                this.f306376a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f306376a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerTransactionComponent.java */
        public static final class d implements u<C50113a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.universal_transaction.di.c f306377a;

            public d(com.avito.android.universal_transaction.di.c cVar) {
                this.f306377a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f306377a.Tk();
            }
        }

        /* compiled from: DaggerTransactionComponent.java */
        public static final class e implements u<InterfaceC50459a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.universal_transaction.di.c f306378a;

            public e(com.avito.android.universal_transaction.di.c cVar) {
                this.f306378a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC50459a interfaceC50459aMe = this.f306378a.Me();
                t.c(interfaceC50459aMe);
                return interfaceC50459aMe;
            }
        }

        public c(C31138n0 c31138n0, C49834c c49834c, com.avito.android.universal_transaction.di.c cVar, String str, String str2, String str3, String str4, String str5, C28478k c28478k, C9410a c9410a) {
            this.f306354a = cVar;
            e eVar = new e(cVar);
            b bVar = new b(cVar);
            this.f306356c = bVar;
            this.f306357d = new com.avito.android.universal_transaction.mvi.domain.b(new com.avito.android.universal_transaction.mvi.data.c(eVar, bVar, RK0.c.f14341a));
            this.f306358e = l.a(str);
            this.f306359f = l.a(str2);
            this.f306360g = l.a(str3);
            this.f306361h = l.b(str4);
            l lVarB = l.b(str5);
            com.avito.android.universal_transaction.mvi.domain.b bVar2 = this.f306357d;
            this.f306362i = new com.avito.android.universal_transaction.mvi.l(bVar2, this.f306358e, this.f306359f, this.f306360g, this.f306361h, lVarB);
            this.f306364k = new j(bVar2, new C9411a(cVar));
            this.f306365l = new C9412c(cVar);
            this.f306366m = g.d(new C49835d(c49834c, this.f306365l, l.a(c28478k)));
            this.f306367n = new o(this.f306362i, this.f306364k, q.a(), s.a(), this.f306366m);
            this.f306368o = dagger.internal.B.a(C31142p0.a(c31138n0));
            this.f306369p = C31151u0.a(c31138n0);
            this.f306370q = new d(cVar);
            this.f306371r = dagger.internal.B.a(C31145r0.a(c31138n0));
            this.f306372s = dagger.internal.B.a(C31153v0.a(c31138n0));
            this.f306373t = new com.avito.android.universal_transaction.transaction.B(this.f306367n, this.f306368o, this.f306356c, this.f306369p, this.f306370q, this.f306371r, this.f306372s, C31144q0.a(c31138n0));
        }

        @Override // com.avito.android.universal_transaction.di.b
        public final void a(TransactionFragment transactionFragment) {
            transactionFragment.f306566y0 = this.f306373t;
            transactionFragment.f306560J0 = this.f306354a.Tk();
        }
    }

    public static b.a a() {
        return new b();
    }
}
