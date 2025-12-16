package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.di;

import Z80.b;
import a90.b;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.b;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.n;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.p;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.q;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.s;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.w;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.x;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.SearchPositionFragment;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.a;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.C33275a;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.c;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.e;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.c;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.di.b;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.a;
import com.avito.android.position_in_search.storage.BannerStorage;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import dagger.internal.z;

/* compiled from: DaggerSearchPositionComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerSearchPositionComponent.java */
    public static final class b implements b.a {
        public b() {
        }
    }

    /* compiled from: DaggerSearchPositionComponent.java */
    public static final class c implements com.avito.android.position_in_search.stats.screen.old_position_in_search.view.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final p f220831a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.position_in_search.storage.provider.c f220832b;

        /* renamed from: c, reason: collision with root package name */
        public final d f220833c;

        /* renamed from: d, reason: collision with root package name */
        public final w f220834d;

        /* renamed from: e, reason: collision with root package name */
        public final cv.b f220835e;

        /* renamed from: f, reason: collision with root package name */
        public final u<P80.a> f220836f;

        /* renamed from: g, reason: collision with root package name */
        public final u<BannerStorage> f220837g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28481c> f220838h;

        /* renamed from: i, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f220839i;

        /* compiled from: DaggerSearchPositionComponent.java */
        /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.view.di.a$c$a, reason: collision with other inner class name */
        public static final class C6667a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final d f220840a;

            public C6667a(d dVar) {
                this.f220840a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f220840a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerSearchPositionComponent.java */
        public static final class b implements u<P80.a> {

            /* renamed from: a, reason: collision with root package name */
            public final d f220841a;

            public b(d dVar) {
                this.f220841a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                P80.a aVarTf = this.f220841a.Tf();
                t.c(aVarTf);
                return aVarTf;
            }
        }

        /* compiled from: DaggerSearchPositionComponent.java */
        /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.view.di.a$c$c, reason: collision with other inner class name */
        public static final class C6668c implements u<BannerStorage> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.position_in_search.storage.provider.c f220842a;

            public C6668c(com.avito.android.position_in_search.storage.provider.c cVar) {
                this.f220842a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f220842a.a();
            }
        }

        public c(d dVar, cv.b bVar, com.avito.android.position_in_search.storage.provider.c cVar, p pVar, w wVar, r rVar, C6666a c6666a) {
            this.f220831a = pVar;
            this.f220832b = cVar;
            this.f220833c = dVar;
            this.f220834d = wVar;
            this.f220835e = bVar;
            this.f220836f = new b(dVar);
            this.f220837g = new C6668c(cVar);
            this.f220838h = new C6667a(dVar);
            this.f220839i = dagger.internal.g.d(new h(this.f220838h, new g(l.a(rVar))));
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.di.b
        public final void a(SearchPositionFragment searchPositionFragment) throws BlueprintCollisionException {
            com.avito.android.position_in_search.storage.provider.c cVar = this.f220832b;
            com.avito.android.position_in_search.storage.e eVarC = cVar.c();
            h31.e eVarA = dagger.internal.g.a(this.f220836f);
            d dVar = this.f220833c;
            R0 r0C = dVar.c();
            t.c(r0C);
            KO.a aVarH7 = dVar.H7();
            com.avito.android.position_in_search.storage.h hVarB = cVar.b();
            h31.e eVarA2 = dagger.internal.g.a(this.f220837g);
            R0 r0C2 = dVar.c();
            t.c(r0C2);
            com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.i iVar = new com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.i(eVarA, r0C, aVarH7, hVarB, new b.a(r0C2, eVarA2));
            R0 r0C3 = dVar.c();
            t.c(r0C3);
            com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.a aVar = new com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.a(eVarC, iVar, r0C3);
            InterfaceC35863o4 interfaceC35863o4M = dVar.m();
            t.c(interfaceC35863o4M);
            q qVar = new q(interfaceC35863o4M);
            com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.l lVar = new com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.l();
            R0 r0C4 = dVar.c();
            t.c(r0C4);
            searchPositionFragment.f220697n0 = new c.a(new n(this.f220831a, aVar, qVar, lVar, r0C4, this.f220839i.get()));
            R0 r0C5 = dVar.c();
            t.c(r0C5);
            h31.e eVarA3 = dagger.internal.g.a(this.f220836f);
            KO.a aVarH72 = dVar.H7();
            h31.e eVarA4 = dagger.internal.g.a(this.f220837g);
            R0 r0C6 = dVar.c();
            t.c(r0C6);
            com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.f fVar = new com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.f(r0C5, eVarA3, aVarH72, new b.a(r0C6, eVarA4));
            R0 r0C7 = dVar.c();
            t.c(r0C7);
            cv.b bVar = this.f220835e;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = bVar.u4();
            t.c(aVarU4);
            com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.a aVar2 = new com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.a(fVar, r0C7, aVarU4);
            InterfaceC35863o4 interfaceC35863o4M2 = dVar.m();
            t.c(interfaceC35863o4M2);
            x xVar = new x(interfaceC35863o4M2, dVar.z1());
            s sVar = new s();
            R0 r0C8 = dVar.c();
            t.c(r0C8);
            searchPositionFragment.f220698o0 = new a.C6649a(new com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.u(this.f220834d, aVar2, xVar, sVar, r0C8, this.f220839i.get()));
            com.avito.android.deeplink_handler.handler.composite.a aVarU42 = bVar.u4();
            t.c(aVarU42);
            searchPositionFragment.f220699p0 = new b.a(aVarU42);
            com.avito.android.util.text.a aVarE = dVar.e();
            t.c(aVarE);
            a.b bVar2 = new a.b(aVarE, this.f220839i.get());
            com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.banner.a aVar3 = new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.banner.a();
            com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.next_page.b bVar3 = new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.next_page.b();
            com.avito.android.util.text.a aVarE2 = dVar.e();
            t.c(aVarE2);
            com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.chart_dynamic.a aVar4 = new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.chart_dynamic.a(aVarE2);
            com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.period.b bVar4 = new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.period.b();
            com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.placeholder.b bVar5 = new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.placeholder.b();
            com.avito.android.util.text.a aVarE3 = dVar.e();
            t.c(aVarE3);
            com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.position.b bVar6 = new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.position.b(aVarE3);
            com.avito.android.util.text.a aVarE4 = dVar.e();
            t.c(aVarE4);
            com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query.b bVar7 = new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query.b(aVarE4);
            com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_header.b bVar8 = new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_header.b();
            com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_header_info.b bVar9 = new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_header_info.b();
            com.avito.android.util.text.a aVarE5 = dVar.e();
            t.c(aVarE5);
            com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.b bVar10 = new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.b(aVarE5);
            com.avito.android.util.text.a aVarE6 = dVar.e();
            t.c(aVarE6);
            com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.competitors.c cVar2 = new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.competitors.c(aVarE6);
            com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.skeleton.b bVar11 = new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.skeleton.b(dVar.H7());
            com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.sort.b bVar12 = new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.sort.b();
            com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.stat.b bVar13 = new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.stat.b();
            i.f220847a.getClass();
            a.C10493a c10493a = new a.C10493a();
            c10493a.b(aVar3);
            c10493a.b(bVar3);
            c10493a.b(aVar4);
            c10493a.b(bVar4);
            c10493a.b(bVar5);
            c10493a.b(bVar6);
            c10493a.b(bVar7);
            c10493a.b(bVar8);
            c10493a.b(bVar9);
            c10493a.b(bVar10);
            c10493a.b(cVar2);
            c10493a.b(bVar11);
            c10493a.b(bVar12);
            c10493a.b(bVar13);
            com.avito.konveyor.a aVarA = c10493a.a();
            z zVar = new z(6);
            zVar.a(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.period.d());
            zVar.a(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.position.d());
            zVar.a(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query.d());
            zVar.a(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.sort.d());
            zVar.a(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.banner.c());
            zVar.a(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.chart_dynamic.d());
            searchPositionFragment.f220700q0 = new b.a(bVar2, aVarA, new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.b(zVar.c()), this.f220839i.get());
            R0 r0C9 = dVar.c();
            t.c(r0C9);
            searchPositionFragment.f220701r0 = new e.a(r0C9, dVar.z1());
            R0 r0C10 = dVar.c();
            t.c(r0C10);
            searchPositionFragment.f220702s0 = new c.a(r0C10);
            com.avito.android.position_in_search.storage.h hVarB2 = cVar.b();
            R0 r0C11 = dVar.c();
            t.c(r0C11);
            searchPositionFragment.f220703t0 = new C33275a.C6650a(hVarB2, r0C11);
            searchPositionFragment.f220704u0 = this.f220839i.get();
        }
    }
}
