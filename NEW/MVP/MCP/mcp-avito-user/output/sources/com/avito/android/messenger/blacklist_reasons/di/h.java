package com.avito.android.messenger.blacklist_reasons.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.C30277e1;
import com.avito.android.messenger.InterfaceC32572u;
import com.avito.android.messenger.blacklist_reasons.BlacklistReasonsFragment;
import com.avito.android.messenger.blacklist_reasons.di.b;
import com.avito.android.messenger.blacklist_reasons.i;
import com.avito.android.messenger.blacklist_reasons.k;
import com.avito.android.messenger.blacklist_reasons.list_items.n;
import com.avito.android.messenger.blacklist_reasons.list_items.p;
import com.avito.android.messenger.blacklist_reasons.m;
import com.avito.android.messenger.blacklist_reasons.y;
import com.avito.android.messenger.channels.mvi.di.N;
import com.avito.android.messenger.channels.mvi.di.P;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.B;
import dagger.internal.q;
import dagger.internal.t;
import dagger.internal.u;
import ru.avito.messenger.C47743i;
import ru.avito.messenger.F0;

/* compiled from: DaggerBlacklistReasonsComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class h {

    /* compiled from: DaggerBlacklistReasonsComponent.java */
    public static final class b implements com.avito.android.messenger.blacklist_reasons.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.messenger.blacklist_reasons.di.c f186564a;

        /* renamed from: b, reason: collision with root package name */
        public final Fragment f186565b;

        /* renamed from: c, reason: collision with root package name */
        public final u<y> f186566c;

        /* renamed from: d, reason: collision with root package name */
        public final u<m> f186567d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC35741a1> f186568e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC35745a5> f186569f;

        /* renamed from: g, reason: collision with root package name */
        public final k f186570g;

        /* renamed from: h, reason: collision with root package name */
        public final u<N> f186571h;

        /* renamed from: i, reason: collision with root package name */
        public final u<F0> f186572i;

        /* renamed from: j, reason: collision with root package name */
        public final u<C30277e1> f186573j;

        /* renamed from: k, reason: collision with root package name */
        public final C47743i f186574k;

        /* compiled from: DaggerBlacklistReasonsComponent.java */
        public static final class a implements u<m> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.blacklist_reasons.di.c f186575a;

            public a(com.avito.android.messenger.blacklist_reasons.di.c cVar) {
                this.f186575a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                m mVarM7 = this.f186575a.m7();
                t.c(mVarM7);
                return mVarM7;
            }
        }

        /* compiled from: DaggerBlacklistReasonsComponent.java */
        /* renamed from: com.avito.android.messenger.blacklist_reasons.di.h$b$b, reason: collision with other inner class name */
        public static final class C5474b implements u<y> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.blacklist_reasons.di.c f186576a;

            public C5474b(com.avito.android.messenger.blacklist_reasons.di.c cVar) {
                this.f186576a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                y yVarF2 = this.f186576a.F2();
                t.c(yVarF2);
                return yVarF2;
            }
        }

        /* compiled from: DaggerBlacklistReasonsComponent.java */
        public static final class c implements u<InterfaceC35741a1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.blacklist_reasons.di.c f186577a;

            public c(com.avito.android.messenger.blacklist_reasons.di.c cVar) {
                this.f186577a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35741a1 interfaceC35741a1N = this.f186577a.n();
                t.c(interfaceC35741a1N);
                return interfaceC35741a1N;
            }
        }

        /* compiled from: DaggerBlacklistReasonsComponent.java */
        public static final class d implements u<C30277e1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.blacklist_reasons.di.c f186578a;

            public d(com.avito.android.messenger.blacklist_reasons.di.c cVar) {
                this.f186578a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f186578a.C();
            }
        }

        /* compiled from: DaggerBlacklistReasonsComponent.java */
        public static final class e implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.blacklist_reasons.di.c f186579a;

            public e(com.avito.android.messenger.blacklist_reasons.di.c cVar) {
                this.f186579a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f186579a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerBlacklistReasonsComponent.java */
        public static final class f implements u<F0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.blacklist_reasons.di.c f186580a;

            public f(com.avito.android.messenger.blacklist_reasons.di.c cVar) {
                this.f186580a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f186580a.B0();
            }
        }

        public b(com.avito.android.messenger.blacklist_reasons.di.c cVar, Fragment fragment, a aVar) {
            this.f186564a = cVar;
            this.f186565b = fragment;
            this.f186570g = new k(new C5474b(cVar), new a(cVar), new c(cVar), new e(cVar));
            q.b bVarA = q.a(1);
            bVarA.a(i.class, this.f186570g);
            this.f186571h = B.a(new P(bVarA.b()));
            this.f186574k = new C47743i(new f(cVar), new d(cVar));
        }

        @Override // com.avito.android.messenger.blacklist_reasons.di.b
        public final void a(BlacklistReasonsFragment blacklistReasonsFragment) throws BlueprintCollisionException {
            com.avito.android.messenger.blacklist_reasons.di.c cVar = this.f186564a;
            InterfaceC35745a5 interfaceC35745a5D = cVar.d();
            t.c(interfaceC35745a5D);
            blacklistReasonsFragment.f186536n0 = interfaceC35745a5D;
            N n12 = this.f186571h.get();
            int i12 = com.avito.android.messenger.blacklist_reasons.di.d.f186563a;
            blacklistReasonsFragment.f186537o0 = (com.avito.android.messenger.blacklist_reasons.e) new P0(this.f186565b, n12).a(i.class);
            blacklistReasonsFragment.f186538p0 = b();
            com.avito.konveyor.a aVarB = b();
            blacklistReasonsFragment.f186539q0 = new com.avito.konveyor.adapter.h(aVarB, aVarB, null, 4, null);
            InterfaceC32572u interfaceC32572uX0 = cVar.x0();
            t.c(interfaceC32572uX0);
            blacklistReasonsFragment.f186540r0 = interfaceC32572uX0;
            blacklistReasonsFragment.f186541s0 = this.f186574k;
        }

        public final com.avito.konveyor.a b() throws BlueprintCollisionException {
            u<N> uVar = this.f186571h;
            n nVar = new n(new p());
            N n12 = uVar.get();
            int i12 = com.avito.android.messenger.blacklist_reasons.di.d.f186563a;
            Fragment fragment = this.f186565b;
            com.avito.android.messenger.blacklist_reasons.list_items.h hVar = new com.avito.android.messenger.blacklist_reasons.list_items.h(new com.avito.android.messenger.blacklist_reasons.list_items.k((com.avito.android.messenger.blacklist_reasons.e) new P0(fragment, n12).a(i.class)));
            com.avito.android.messenger.blacklist_reasons.list_items.b bVar = new com.avito.android.messenger.blacklist_reasons.list_items.b(new com.avito.android.messenger.blacklist_reasons.list_items.e((com.avito.android.messenger.blacklist_reasons.e) new P0(fragment, uVar.get()).a(i.class)));
            a.C10493a c10493a = new a.C10493a();
            c10493a.b(nVar);
            c10493a.b(hVar);
            c10493a.b(bVar);
            return c10493a.a();
        }
    }

    /* compiled from: DaggerBlacklistReasonsComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.messenger.blacklist_reasons.di.b.a
        public final com.avito.android.messenger.blacklist_reasons.di.b a(BlacklistReasonsFragment blacklistReasonsFragment, com.avito.android.messenger.blacklist_reasons.di.c cVar) {
            return new b(cVar, blacklistReasonsFragment, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
