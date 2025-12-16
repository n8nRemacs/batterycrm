package com.avito.android.loyalty.di.quality_service;

import bX.InterfaceC25576a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.w;
import com.avito.android.loyalty.di.quality_service.g;
import com.avito.android.loyalty.ui.quality_service.QualityServiceActivity;
import com.avito.android.loyalty.ui.quality_service.QualityServiceArgs;
import com.avito.android.loyalty.ui.quality_service.mvi.o;
import com.avito.android.loyalty.ui.quality_service.q;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Set;
import mX.InterfaceC44026a;

/* compiled from: DaggerQualityServiceComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class c {

    /* compiled from: DaggerQualityServiceComponent.java */
    public static final class b implements g.a {
        public b() {
        }

        @Override // com.avito.android.loyalty.di.quality_service.g.a
        public final g a(C28478k c28478k, QualityServiceArgs qualityServiceArgs, com.avito.android.cpt.pre_activation.ui.c cVar, com.avito.android.loyalty.ui.quality_service.f fVar, com.avito.android.loyalty.ui.quality_service.g gVar, h hVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new C5373c(hVar, interfaceC39417a, c28478k, qualityServiceArgs, cVar, fVar, gVar, null);
        }
    }

    /* compiled from: DaggerQualityServiceComponent.java */
    /* renamed from: com.avito.android.loyalty.di.quality_service.c$c, reason: collision with other inner class name */
    public static final class C5373c implements g {

        /* renamed from: a, reason: collision with root package name */
        public final h f183130a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f183131b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC25576a> f183132c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f183133d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.l f183134e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.loyalty.ui.quality_service.k> f183135f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28373a> f183136g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.analytics.provider.a> f183137h;

        /* renamed from: i, reason: collision with root package name */
        public final u<MW.a> f183138i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.quality_service.mvi.h f183139j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f183140k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.quality_service.mvi.f f183141l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC28481c> f183142m;

        /* renamed from: n, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f183143n;

        /* renamed from: o, reason: collision with root package name */
        public final q f183144o;

        /* renamed from: p, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f183145p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.f f183146q;

        /* renamed from: r, reason: collision with root package name */
        public final j f183147r;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.quality_service.items.effects.d f183148s;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.l f183149t;

        /* renamed from: u, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.quality_service.items.effect.c f183150u;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.l f183151v;

        /* renamed from: w, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.quality_service.items.faq.c f183152w;

        /* renamed from: x, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.quality_service.items.text.b f183153x;

        /* renamed from: y, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.quality_service.items.grade_info.d f183154y;

        /* compiled from: DaggerQualityServiceComponent.java */
        /* renamed from: com.avito.android.loyalty.di.quality_service.c$c$a */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final h f183155a;

            public a(h hVar) {
                this.f183155a = hVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f183155a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerQualityServiceComponent.java */
        /* renamed from: com.avito.android.loyalty.di.quality_service.c$c$b */
        public static final class b implements u<com.avito.android.analytics.provider.a> {

            /* renamed from: a, reason: collision with root package name */
            public final h f183156a;

            public b(h hVar) {
                this.f183156a = hVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.analytics.provider.a aVarV = this.f183156a.v();
                t.c(aVarV);
                return aVarV;
            }
        }

        /* compiled from: DaggerQualityServiceComponent.java */
        /* renamed from: com.avito.android.loyalty.di.quality_service.c$c$c, reason: collision with other inner class name */
        public static final class C5374c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f183157a;

            public C5374c(cv.b bVar) {
                this.f183157a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f183157a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerQualityServiceComponent.java */
        /* renamed from: com.avito.android.loyalty.di.quality_service.c$c$d */
        public static final class d implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final h f183158a;

            public d(h hVar) {
                this.f183158a = hVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f183158a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerQualityServiceComponent.java */
        /* renamed from: com.avito.android.loyalty.di.quality_service.c$c$e */
        public static final class e implements u<InterfaceC25576a> {

            /* renamed from: a, reason: collision with root package name */
            public final h f183159a;

            public e(h hVar) {
                this.f183159a = hVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC25576a interfaceC25576aY1 = this.f183159a.y1();
                t.c(interfaceC25576aY1);
                return interfaceC25576aY1;
            }
        }

        /* compiled from: DaggerQualityServiceComponent.java */
        /* renamed from: com.avito.android.loyalty.di.quality_service.c$c$f */
        public static final class f implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final h f183160a;

            public f(h hVar) {
                this.f183160a = hVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f183160a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public C5373c(h hVar, cv.b bVar, C28478k c28478k, QualityServiceArgs qualityServiceArgs, w wVar, InterfaceC44026a interfaceC44026a, com.avito.android.loyalty.ui.quality_service.items.grade_info.a aVar, a aVar2) {
            this.f183130a = hVar;
            this.f183131b = bVar;
            this.f183132c = new e(hVar);
            this.f183133d = new d(hVar);
            dagger.internal.l lVarA = dagger.internal.l.a(qualityServiceArgs);
            this.f183134e = lVarA;
            this.f183135f = dagger.internal.g.d(new com.avito.android.loyalty.ui.quality_service.l(this.f183132c, this.f183133d, lVarA, com.avito.android.loyalty.ui.quality_service.j.a()));
            u<MW.a> uVarD = dagger.internal.g.d(new l(this.f183134e, new a(hVar), new b(hVar)));
            this.f183138i = uVarD;
            u<com.avito.android.loyalty.ui.quality_service.k> uVar = this.f183135f;
            this.f183139j = new com.avito.android.loyalty.ui.quality_service.mvi.h(uVarD, uVar);
            this.f183141l = new com.avito.android.loyalty.ui.quality_service.mvi.f(uVarD, uVar, new C5374c(bVar));
            this.f183142m = new f(hVar);
            this.f183143n = com.avito.android.actions_sheet.a.D(dagger.internal.l.a(c28478k), this.f183142m);
            this.f183144o = new q(new com.avito.android.loyalty.ui.quality_service.mvi.m(this.f183139j, this.f183141l, o.a(), this.f183143n, com.avito.android.loyalty.ui.quality_service.mvi.j.a()));
            this.f183145p = B.a(com.avito.android.konveyor_adapter_module.d.a());
            dagger.internal.f fVar = new dagger.internal.f();
            this.f183146q = fVar;
            this.f183147r = new j(new k(fVar), fVar);
            this.f183148s = new com.avito.android.loyalty.ui.quality_service.items.effects.d(com.avito.android.loyalty.ui.quality_service.items.effects.f.a(), this.f183147r);
            dagger.internal.l lVarA2 = dagger.internal.l.a(interfaceC44026a);
            this.f183149t = lVarA2;
            this.f183150u = new com.avito.android.loyalty.ui.quality_service.items.effect.c(new com.avito.android.loyalty.ui.quality_service.items.effect.f(lVarA2));
            dagger.internal.l lVarA3 = dagger.internal.l.a(wVar);
            this.f183151v = lVarA3;
            this.f183152w = new com.avito.android.loyalty.ui.quality_service.items.faq.c(new com.avito.android.loyalty.ui.quality_service.items.faq.g(lVarA3, this.f183149t));
            this.f183153x = new com.avito.android.loyalty.ui.quality_service.items.text.b(new com.avito.android.loyalty.ui.quality_service.items.text.d(lVarA3));
            this.f183154y = new com.avito.android.loyalty.ui.quality_service.items.grade_info.d(new com.avito.android.loyalty.ui.quality_service.items.grade_info.g(this.f183151v, dagger.internal.l.a(aVar)));
            A.b bVarA = A.a(5, 1);
            bVarA.f393938b.add(this.f183145p);
            com.avito.android.loyalty.ui.quality_service.items.effects.d dVar = this.f183148s;
            List<u<T>> list = bVarA.f393937a;
            list.add(dVar);
            list.add(this.f183150u);
            list.add(this.f183152w);
            list.add(this.f183153x);
            list.add(this.f183154y);
            dagger.internal.f.a(this.f183146q, B.a(new com.avito.android.konveyor_adapter_module.c(bVarA.b())));
        }

        @Override // com.avito.android.loyalty.di.quality_service.g
        public final void a(QualityServiceActivity qualityServiceActivity) {
            qualityServiceActivity.f183778m = this.f183144o;
            qualityServiceActivity.f183780o = this.f183130a.O();
            qualityServiceActivity.f183781p = this.f183143n.get();
            com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f183146q.get();
            i iVar = i.f183161a;
            iVar.getClass();
            com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
            com.avito.konveyor.a aVar2 = (com.avito.konveyor.a) this.f183146q.get();
            iVar.getClass();
            qualityServiceActivity.f183782q = new com.avito.konveyor.adapter.d(hVar, aVar2, null, 4, null);
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f183131b.u4();
            t.c(aVarU4);
            qualityServiceActivity.f183783r = aVarU4;
        }
    }

    public static g.a a() {
        return new b();
    }
}
