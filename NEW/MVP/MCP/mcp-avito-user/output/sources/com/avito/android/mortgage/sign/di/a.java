package com.avito.android.mortgage.sign.di;

import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage.di.o;
import com.avito.android.mortgage.sign.SignFragment;
import com.avito.android.mortgage.sign.di.b;
import com.avito.android.mortgage.sign.model.SignArguments;
import com.avito.android.mortgage.sign.mvi.g;
import com.avito.android.mortgage.sign.mvi.i;
import com.avito.android.mortgage.sign.mvi.k;
import com.avito.android.util.R0;
import dagger.internal.B;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerMortgageSignComponent.java */
@e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerMortgageSignComponent.java */
    public static final class b implements b.InterfaceC6069b {
        public b() {
        }

        @Override // com.avito.android.mortgage.sign.di.b.InterfaceC6069b
        public final com.avito.android.mortgage.sign.di.b a(o oVar, C28478k c28478k, SignArguments signArguments) {
            return new c(oVar, c28478k, signArguments, null);
        }
    }

    /* compiled from: DaggerMortgageSignComponent.java */
    public static final class c implements com.avito.android.mortgage.sign.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<Context> f203605a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.mortgage.sign.files.c> f203606b;

        /* renamed from: c, reason: collision with root package name */
        public final u<IZ.a> f203607c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f203608d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.mortgage.sign.mvi.b f203609e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28373a> f203610f;

        /* renamed from: g, reason: collision with root package name */
        public final k f203611g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28481c> f203612h;

        /* renamed from: i, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f203613i;

        /* renamed from: j, reason: collision with root package name */
        public final l f203614j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.mortgage.sign.u f203615k;

        /* compiled from: DaggerMortgageSignComponent.java */
        /* renamed from: com.avito.android.mortgage.sign.di.a$c$a, reason: collision with other inner class name */
        public static final class C6067a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f203616a;

            public C6067a(o oVar) {
                this.f203616a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f203616a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerMortgageSignComponent.java */
        public static final class b implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final o f203617a;

            public b(o oVar) {
                this.f203617a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f203617a.g();
            }
        }

        /* compiled from: DaggerMortgageSignComponent.java */
        /* renamed from: com.avito.android.mortgage.sign.di.a$c$c, reason: collision with other inner class name */
        public static final class C6068c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final o f203618a;

            public C6068c(o oVar) {
                this.f203618a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f203618a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerMortgageSignComponent.java */
        public static final class d implements u<IZ.a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f203619a;

            public d(o oVar) {
                this.f203619a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                IZ.a aVarLc = this.f203619a.lc();
                t.c(aVarLc);
                return aVarLc;
            }
        }

        /* compiled from: DaggerMortgageSignComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final o f203620a;

            public e(o oVar) {
                this.f203620a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f203620a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(o oVar, C28478k c28478k, SignArguments signArguments, C6066a c6066a) {
            u<com.avito.android.mortgage.sign.files.c> uVarA = B.a(new com.avito.android.mortgage.sign.files.e(new b(oVar)));
            this.f203606b = uVarA;
            d dVar = new d(oVar);
            this.f203608d = new C6068c(oVar);
            this.f203609e = new com.avito.android.mortgage.sign.mvi.b(new com.avito.android.mortgage.sign.files.b(uVarA, dVar, com.avito.android.mortgage.util.e.a(), this.f203608d));
            this.f203611g = new k(new n10.d(new C6067a(oVar)));
            this.f203612h = new e(oVar);
            this.f203613i = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f203612h);
            this.f203614j = l.a(signArguments);
            this.f203615k = new com.avito.android.mortgage.sign.u(new g(this.f203609e, i.a(), this.f203611g, this.f203613i, com.avito.android.mortgage.sign.mvi.d.a(), this.f203614j));
        }

        @Override // com.avito.android.mortgage.sign.di.b
        public final void a(SignFragment signFragment) {
            signFragment.f203589n0 = this.f203615k;
            signFragment.f203591p0 = this.f203613i.get();
        }
    }

    public static b.InterfaceC6069b a() {
        return new b();
    }
}
