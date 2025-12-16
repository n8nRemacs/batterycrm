package com.avito.android.comfortable_deal.stages_transition.di;

import Jp.InterfaceC14233a;
import Y41.l;
import com.avito.android.P;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.comfortable_deal.stages_transition.StagesTransitionDialog;
import com.avito.android.comfortable_deal.stages_transition.di.f;
import com.avito.android.comfortable_deal.stages_transition.model.StagesTransitionArguments;
import com.avito.android.comfortable_deal.stages_transition.mvi.j;
import com.avito.android.util.R0;
import cp.InterfaceC39387a;
import d20.C39487a;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.u;
import fq.InterfaceC40463a;
import java.util.List;
import kotlin.G0;

/* compiled from: DaggerStagesTransitionComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerStagesTransitionComponent.java */
    public static final class b implements f.a {
        public b() {
        }

        @Override // com.avito.android.comfortable_deal.stages_transition.di.f.a
        public final f a(com.avito.android.comfortable_deal.di.a aVar, C28478k c28478k, StagesTransitionArguments stagesTransitionArguments, l<? super InterfaceC40463a, G0> lVar) {
            return new c(aVar, c28478k, stagesTransitionArguments, lVar, null);
        }
    }

    /* compiled from: DaggerStagesTransitionComponent.java */
    public static final class c implements com.avito.android.comfortable_deal.stages_transition.di.f {

        /* renamed from: a, reason: collision with root package name */
        public final l<? super InterfaceC40463a, G0> f122823a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC39387a> f122824b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f122825c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC14233a> f122826d;

        /* renamed from: e, reason: collision with root package name */
        public final u<AK0.l> f122827e;

        /* renamed from: f, reason: collision with root package name */
        public final u<P> f122828f;

        /* renamed from: g, reason: collision with root package name */
        public final u<C39487a> f122829g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.comfortable_deal.stages_transition.mvi.c f122830h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.comfortable_deal.stages_transition.mvi.builder.a> f122831i;

        /* renamed from: j, reason: collision with root package name */
        public final j f122832j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.l f122833k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.comfortable_deal.stages_transition.h f122834l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC28481c> f122835m;

        /* renamed from: n, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f122836n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.comfortable_deal.stages_transition.mvi.builder.e> f122837o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.l f122838p;

        /* renamed from: q, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f122839q;

        /* renamed from: r, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f122840r;

        /* renamed from: s, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f122841s;

        /* renamed from: t, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f122842t;

        /* renamed from: u, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f122843u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f122844v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f122845w;

        /* compiled from: DaggerStagesTransitionComponent.java */
        /* renamed from: com.avito.android.comfortable_deal.stages_transition.di.a$c$a, reason: collision with other inner class name */
        public static final class C3648a implements u<InterfaceC14233a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f122846a;

            public C3648a(com.avito.android.comfortable_deal.di.a aVar) {
                this.f122846a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14233a interfaceC14233aV8 = this.f122846a.v8();
                t.c(interfaceC14233aV8);
                return interfaceC14233aV8;
            }
        }

        /* compiled from: DaggerStagesTransitionComponent.java */
        public static final class b implements u<InterfaceC39387a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f122847a;

            public b(com.avito.android.comfortable_deal.di.a aVar) {
                this.f122847a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC39387a interfaceC39387aQ2 = this.f122847a.Q2();
                t.c(interfaceC39387aQ2);
                return interfaceC39387aQ2;
            }
        }

        /* compiled from: DaggerStagesTransitionComponent.java */
        /* renamed from: com.avito.android.comfortable_deal.stages_transition.di.a$c$c, reason: collision with other inner class name */
        public static final class C3649c implements u<P> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f122848a;

            public C3649c(com.avito.android.comfortable_deal.di.a aVar) {
                this.f122848a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f122848a.E();
            }
        }

        /* compiled from: DaggerStagesTransitionComponent.java */
        public static final class d implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f122849a;

            public d(com.avito.android.comfortable_deal.di.a aVar) {
                this.f122849a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f122849a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerStagesTransitionComponent.java */
        public static final class e implements u<C39487a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f122850a;

            public e(com.avito.android.comfortable_deal.di.a aVar) {
                this.f122850a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f122850a.M2();
            }
        }

        /* compiled from: DaggerStagesTransitionComponent.java */
        public static final class f implements u<AK0.l> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f122851a;

            public f(com.avito.android.comfortable_deal.di.a aVar) {
                this.f122851a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f122851a.r();
            }
        }

        /* compiled from: DaggerStagesTransitionComponent.java */
        public static final class g implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f122852a;

            public g(com.avito.android.comfortable_deal.di.a aVar) {
                this.f122852a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f122852a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.comfortable_deal.di.a aVar, C28478k c28478k, StagesTransitionArguments stagesTransitionArguments, l lVar, C3647a c3647a) {
            this.f122823a = lVar;
            this.f122830h = new com.avito.android.comfortable_deal.stages_transition.mvi.c(new com.avito.android.comfortable_deal.repository.l(new f(aVar), new C3649c(aVar), new e(aVar), new b(aVar), new d(aVar), new C3648a(aVar)));
            u<com.avito.android.comfortable_deal.stages_transition.mvi.builder.a> uVarD = dagger.internal.g.d(com.avito.android.comfortable_deal.stages_transition.mvi.builder.d.a());
            this.f122831i = uVarD;
            this.f122832j = new j(uVarD);
            this.f122833k = dagger.internal.l.a(stagesTransitionArguments);
            this.f122834l = new com.avito.android.comfortable_deal.stages_transition.h(new com.avito.android.comfortable_deal.stages_transition.mvi.f(this.f122830h, com.avito.android.comfortable_deal.stages_transition.mvi.h.a(), this.f122832j, this.f122833k, this.f122831i));
            this.f122835m = new g(aVar);
            this.f122836n = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f122835m);
            this.f122837o = dagger.internal.g.d(com.avito.android.comfortable_deal.stages_transition.mvi.builder.g.a());
            dagger.internal.l lVarA = dagger.internal.l.a(lVar);
            this.f122838p = lVarA;
            this.f122839q = dagger.internal.g.d(new com.avito.android.comfortable_deal.stages_transition.item.comment.b(new com.avito.android.comfortable_deal.stages_transition.item.comment.f(lVarA)));
            this.f122840r = dagger.internal.g.d(new com.avito.android.comfortable_deal.stages_transition.item.datetime.b(new com.avito.android.comfortable_deal.stages_transition.item.datetime.g(this.f122838p)));
            this.f122841s = dagger.internal.g.d(new com.avito.android.comfortable_deal.stages_transition.item.input.link.b(new com.avito.android.comfortable_deal.stages_transition.item.input.d(this.f122838p)));
            this.f122842t = dagger.internal.g.d(new com.avito.android.comfortable_deal.stages_transition.item.reasonslist.b(com.avito.android.comfortable_deal.stages_transition.item.reasonslist.e.a(), this.f122838p));
            this.f122843u = dagger.internal.g.d(new com.avito.android.comfortable_deal.stages_transition.item.title.b(com.avito.android.comfortable_deal.stages_transition.item.title.e.a()));
            A.b bVarA = A.a(5, 0);
            u<TV0.b<?, ?>> uVar = this.f122839q;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f122840r);
            list.add(this.f122841s);
            list.add(this.f122842t);
            list.add(this.f122843u);
            u<com.avito.konveyor.a> uVarD2 = dagger.internal.g.d(new com.avito.android.comfortable_deal.stages_transition.di.d(bVarA.b()));
            this.f122844v = uVarD2;
            this.f122845w = dagger.internal.g.d(new com.avito.android.comfortable_deal.stages_transition.di.c(uVarD2));
        }

        @Override // com.avito.android.comfortable_deal.stages_transition.di.f
        public final void a(StagesTransitionDialog stagesTransitionDialog) {
            u<com.avito.konveyor.adapter.a> uVar = this.f122845w;
            stagesTransitionDialog.f122783h0 = this.f122834l;
            stagesTransitionDialog.f122785j0 = this.f122836n.get();
            stagesTransitionDialog.f122786k0 = this.f122837o.get();
            com.avito.konveyor.adapter.a aVar = uVar.get();
            com.avito.konveyor.a aVar2 = this.f122844v.get();
            int i12 = com.avito.android.comfortable_deal.stages_transition.di.b.f122853a;
            stagesTransitionDialog.f122787l0 = new com.avito.android.comfortable_deal.stages_transition.d(new com.avito.konveyor.adapter.j(aVar, aVar2), uVar.get(), this.f122823a);
        }
    }

    public static f.a a() {
        return new b();
    }
}
