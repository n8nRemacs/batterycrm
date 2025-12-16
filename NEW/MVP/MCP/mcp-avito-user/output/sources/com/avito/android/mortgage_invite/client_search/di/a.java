package com.avito.android.mortgage_invite.client_search.di;

import c20.InterfaceC26928e;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage_invite.client_search.K;
import com.avito.android.mortgage_invite.client_search.MortgageClientSearchFragment;
import com.avito.android.mortgage_invite.client_search.di.b;
import com.avito.android.mortgage_invite.client_search.model.MortgageClientSearchArguments;
import com.avito.android.mortgage_invite.client_search.mvi.g;
import com.avito.android.mortgage_invite.client_search.mvi.j;
import com.avito.android.mortgage_invite.client_search.mvi.n;
import com.avito.android.util.R0;
import com.avito.android.util.S3;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import e20.InterfaceC39928a;

/* compiled from: DaggerMortgageClientSearchComponent.java */
@e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerMortgageClientSearchComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.mortgage_invite.client_search.di.b.a
        public final com.avito.android.mortgage_invite.client_search.di.b a(InterfaceC26928e interfaceC26928e, MortgageClientSearchArguments mortgageClientSearchArguments, C28478k c28478k) {
            return new c(interfaceC26928e, mortgageClientSearchArguments, c28478k, null);
        }
    }

    /* compiled from: DaggerMortgageClientSearchComponent.java */
    public static final class c implements com.avito.android.mortgage_invite.client_search.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC28481c> f205365a;

        /* renamed from: b, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f205366b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC39928a> f205367c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f205368d;

        /* renamed from: e, reason: collision with root package name */
        public final K f205369e;

        /* compiled from: DaggerMortgageClientSearchComponent.java */
        /* renamed from: com.avito.android.mortgage_invite.client_search.di.a$c$a, reason: collision with other inner class name */
        public static final class C6119a implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC26928e f205370a;

            public C6119a(InterfaceC26928e interfaceC26928e) {
                this.f205370a = interfaceC26928e;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f205370a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerMortgageClientSearchComponent.java */
        public static final class b implements u<InterfaceC39928a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC26928e f205371a;

            public b(InterfaceC26928e interfaceC26928e) {
                this.f205371a = interfaceC26928e;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC39928a interfaceC39928aJb = this.f205371a.Jb();
                t.c(interfaceC39928aJb);
                return interfaceC39928aJb;
            }
        }

        /* compiled from: DaggerMortgageClientSearchComponent.java */
        /* renamed from: com.avito.android.mortgage_invite.client_search.di.a$c$c, reason: collision with other inner class name */
        public static final class C6120c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC26928e f205372a;

            public C6120c(InterfaceC26928e interfaceC26928e) {
                this.f205372a = interfaceC26928e;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f205372a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(InterfaceC26928e interfaceC26928e, MortgageClientSearchArguments mortgageClientSearchArguments, C28478k c28478k, C6118a c6118a) {
            this.f205365a = new C6120c(interfaceC26928e);
            this.f205366b = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f205365a);
            l lVarA = l.a(mortgageClientSearchArguments);
            com.avito.android.mortgage_invite.client_search.domain.c cVar = new com.avito.android.mortgage_invite.client_search.domain.c(new b(interfaceC26928e), new V10.c(S3.f318734a), new C6119a(interfaceC26928e));
            this.f205369e = new K(new j(new g(lVarA, cVar), new com.avito.android.mortgage_invite.client_search.mvi.e(cVar), n.a(), com.avito.android.mortgage_invite.client_search.mvi.l.a(), this.f205366b));
        }

        @Override // com.avito.android.mortgage_invite.client_search.di.b
        public final void a(MortgageClientSearchFragment mortgageClientSearchFragment) {
            mortgageClientSearchFragment.f205344n0 = this.f205366b.get();
            mortgageClientSearchFragment.f205346p0 = this.f205369e;
        }
    }

    public static b.a a() {
        return new b();
    }
}
