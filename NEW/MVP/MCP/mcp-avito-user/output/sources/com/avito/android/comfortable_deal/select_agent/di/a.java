package com.avito.android.comfortable_deal.select_agent.di;

import Jp.InterfaceC14233a;
import Y41.l;
import com.avito.android.P;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.comfortable_deal.select_agent.SelectAgentDialog;
import com.avito.android.comfortable_deal.select_agent.di.f;
import com.avito.android.comfortable_deal.select_agent.di.i;
import com.avito.android.comfortable_deal.select_agent.model.SelectAgentArguments;
import com.avito.android.comfortable_deal.select_agent.mvi.k;
import com.avito.android.comfortable_deal.select_agent.mvi.m;
import com.avito.android.util.R0;
import com.avito.konveyor.adapter.j;
import cp.InterfaceC39387a;
import d20.C39487a;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.u;
import dq.InterfaceC39778a;
import kotlin.G0;

/* compiled from: DaggerSelectAgentComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerSelectAgentComponent.java */
    public static final class b implements f.a {
        public b() {
        }

        @Override // com.avito.android.comfortable_deal.select_agent.di.f.a
        public final f a(com.avito.android.comfortable_deal.di.a aVar, C28478k c28478k, SelectAgentArguments selectAgentArguments, l<? super InterfaceC39778a, G0> lVar) {
            return new c(aVar, c28478k, selectAgentArguments, lVar, null);
        }
    }

    /* compiled from: DaggerSelectAgentComponent.java */
    public static final class c implements com.avito.android.comfortable_deal.select_agent.di.f {

        /* renamed from: a, reason: collision with root package name */
        public final l<? super InterfaceC39778a, G0> f122679a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC39387a> f122680b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f122681c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC14233a> f122682d;

        /* renamed from: e, reason: collision with root package name */
        public final u<AK0.l> f122683e;

        /* renamed from: f, reason: collision with root package name */
        public final u<P> f122684f;

        /* renamed from: g, reason: collision with root package name */
        public final u<C39487a> f122685g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.comfortable_deal.repository.l f122686h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.comfortable_deal.select_agent.mvi.f f122687i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.comfortable_deal.select_agent.mvi.d f122688j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.comfortable_deal.select_agent.mvi.builder.c f122689k;

        /* renamed from: l, reason: collision with root package name */
        public final m f122690l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC28481c> f122691m;

        /* renamed from: n, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f122692n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.comfortable_deal.select_agent.h f122693o;

        /* renamed from: p, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f122694p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f122695q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f122696r;

        /* compiled from: DaggerSelectAgentComponent.java */
        /* renamed from: com.avito.android.comfortable_deal.select_agent.di.a$c$a, reason: collision with other inner class name */
        public static final class C3638a implements u<InterfaceC14233a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f122697a;

            public C3638a(com.avito.android.comfortable_deal.di.a aVar) {
                this.f122697a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14233a interfaceC14233aV8 = this.f122697a.v8();
                t.c(interfaceC14233aV8);
                return interfaceC14233aV8;
            }
        }

        /* compiled from: DaggerSelectAgentComponent.java */
        public static final class b implements u<InterfaceC39387a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f122698a;

            public b(com.avito.android.comfortable_deal.di.a aVar) {
                this.f122698a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC39387a interfaceC39387aQ2 = this.f122698a.Q2();
                t.c(interfaceC39387aQ2);
                return interfaceC39387aQ2;
            }
        }

        /* compiled from: DaggerSelectAgentComponent.java */
        /* renamed from: com.avito.android.comfortable_deal.select_agent.di.a$c$c, reason: collision with other inner class name */
        public static final class C3639c implements u<P> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f122699a;

            public C3639c(com.avito.android.comfortable_deal.di.a aVar) {
                this.f122699a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f122699a.E();
            }
        }

        /* compiled from: DaggerSelectAgentComponent.java */
        public static final class d implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f122700a;

            public d(com.avito.android.comfortable_deal.di.a aVar) {
                this.f122700a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f122700a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerSelectAgentComponent.java */
        public static final class e implements u<C39487a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f122701a;

            public e(com.avito.android.comfortable_deal.di.a aVar) {
                this.f122701a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f122701a.M2();
            }
        }

        /* compiled from: DaggerSelectAgentComponent.java */
        public static final class f implements u<AK0.l> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f122702a;

            public f(com.avito.android.comfortable_deal.di.a aVar) {
                this.f122702a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f122702a.r();
            }
        }

        /* compiled from: DaggerSelectAgentComponent.java */
        public static final class g implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f122703a;

            public g(com.avito.android.comfortable_deal.di.a aVar) {
                this.f122703a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f122703a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.comfortable_deal.di.a aVar, C28478k c28478k, SelectAgentArguments selectAgentArguments, l lVar, C3637a c3637a) {
            this.f122679a = lVar;
            this.f122686h = new com.avito.android.comfortable_deal.repository.l(new f(aVar), new C3639c(aVar), new e(aVar), new b(aVar), new d(aVar), new C3638a(aVar));
            dagger.internal.l lVarA = dagger.internal.l.a(selectAgentArguments);
            com.avito.android.comfortable_deal.repository.l lVar2 = this.f122686h;
            this.f122687i = new com.avito.android.comfortable_deal.select_agent.mvi.f(lVar2, lVarA);
            this.f122688j = new com.avito.android.comfortable_deal.select_agent.mvi.d(lVar2);
            this.f122689k = new com.avito.android.comfortable_deal.select_agent.mvi.builder.c(i.a.f122709a);
            this.f122690l = new m(com.avito.android.comfortable_deal.select_agent.mvi.builder.f.a(), this.f122689k);
            this.f122691m = new g(aVar);
            this.f122692n = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f122691m);
            this.f122693o = new com.avito.android.comfortable_deal.select_agent.h(new com.avito.android.comfortable_deal.select_agent.mvi.i(this.f122687i, this.f122688j, k.a(), this.f122690l, this.f122692n));
            this.f122694p = dagger.internal.g.d(new com.avito.android.comfortable_deal.select_agent.item.agent.b(new com.avito.android.comfortable_deal.select_agent.item.agent.f(dagger.internal.l.a(lVar))));
            A.b bVarA = A.a(1, 0);
            bVarA.f393937a.add(this.f122694p);
            u<com.avito.konveyor.a> uVarD = dagger.internal.g.d(new com.avito.android.comfortable_deal.select_agent.di.d(bVarA.b()));
            this.f122695q = uVarD;
            this.f122696r = dagger.internal.g.d(new com.avito.android.comfortable_deal.select_agent.di.c(uVarD));
        }

        @Override // com.avito.android.comfortable_deal.select_agent.di.f
        public final void a(SelectAgentDialog selectAgentDialog) {
            u<com.avito.konveyor.adapter.a> uVar = this.f122696r;
            selectAgentDialog.f122642h0 = this.f122693o;
            selectAgentDialog.f122644j0 = this.f122692n.get();
            com.avito.konveyor.adapter.a aVar = uVar.get();
            com.avito.konveyor.a aVar2 = this.f122695q.get();
            int i12 = com.avito.android.comfortable_deal.select_agent.di.b.f122704a;
            selectAgentDialog.f122645k0 = new com.avito.android.comfortable_deal.select_agent.d(new j(aVar, aVar2), uVar.get(), this.f122679a);
        }
    }

    public static f.a a() {
        return new b();
    }
}
