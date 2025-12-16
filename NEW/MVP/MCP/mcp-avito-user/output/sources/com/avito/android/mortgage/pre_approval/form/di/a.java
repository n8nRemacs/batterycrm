package com.avito.android.mortgage.pre_approval.form.di;

import Y41.l;
import com.avito.android.account.G;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage.di.o;
import com.avito.android.mortgage.pre_approval.form.PreApprovalFormFragment;
import com.avito.android.mortgage.pre_approval.form.di.b;
import com.avito.android.mortgage.pre_approval.form.f;
import com.avito.android.mortgage.pre_approval.form.list.items.input.j;
import com.avito.android.mortgage.pre_approval.form.mvi.builders.h;
import com.avito.android.mortgage.pre_approval.form.mvi.builders.k;
import com.avito.android.mortgage.pre_approval.form.mvi.builders.n;
import com.avito.android.mortgage.pre_approval.form.mvi.domain.i;
import com.avito.android.mortgage.pre_approval.model.PreApprovalArguments;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.g;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Set;

/* compiled from: DaggerPreApprovalFormComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerPreApprovalFormComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.mortgage.pre_approval.form.di.b.a
        public final com.avito.android.mortgage.pre_approval.form.di.b a(o oVar, com.avito.android.mortgage.pre_approval.form.di.c cVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, l lVar, PreApprovalArguments preApprovalArguments) {
            interfaceC39417a.getClass();
            return new c(oVar, interfaceC39417a, cVar, c28478k, lVar, preApprovalArguments, null);
        }
    }

    /* compiled from: DaggerPreApprovalFormComponent.java */
    public static final class c implements com.avito.android.mortgage.pre_approval.form.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f201711a;

        /* renamed from: b, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f201712b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f201713c;

        /* renamed from: d, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f201714d;

        /* renamed from: e, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f201715e;

        /* renamed from: f, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f201716f;

        /* renamed from: g, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f201717g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f201718h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f201719i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.a> f201720j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.a> f201721k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.a> f201722l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f201723m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC28481c> f201724n;

        /* renamed from: o, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f201725o;

        /* renamed from: p, reason: collision with root package name */
        public final u<InterfaceC28373a> f201726p;

        /* renamed from: q, reason: collision with root package name */
        public final M00.d f201727q;

        /* renamed from: r, reason: collision with root package name */
        public final com.avito.android.mortgage.pre_approval.form.mvi.l f201728r;

        /* renamed from: s, reason: collision with root package name */
        public final u<IZ.a> f201729s;

        /* renamed from: t, reason: collision with root package name */
        public final com.avito.android.mortgage.pre_approval.form.mvi.domain.b f201730t;

        /* renamed from: u, reason: collision with root package name */
        public final u<G> f201731u;

        /* renamed from: v, reason: collision with root package name */
        public final com.avito.android.mortgage.pre_approval.form.mvi.e f201732v;

        /* renamed from: w, reason: collision with root package name */
        public final f f201733w;

        /* compiled from: DaggerPreApprovalFormComponent.java */
        /* renamed from: com.avito.android.mortgage.pre_approval.form.di.a$c$a, reason: collision with other inner class name */
        public static final class C5980a implements u<G> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.mortgage.pre_approval.form.di.c f201734a;

            public C5980a(com.avito.android.mortgage.pre_approval.form.di.c cVar) {
                this.f201734a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                G gW2 = this.f201734a.w();
                t.c(gW2);
                return gW2;
            }
        }

        /* compiled from: DaggerPreApprovalFormComponent.java */
        public static final class b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f201735a;

            public b(o oVar) {
                this.f201735a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f201735a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerPreApprovalFormComponent.java */
        /* renamed from: com.avito.android.mortgage.pre_approval.form.di.a$c$c, reason: collision with other inner class name */
        public static final class C5981c implements u<IZ.a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f201736a;

            public C5981c(o oVar) {
                this.f201736a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                IZ.a aVarLc = this.f201736a.lc();
                t.c(aVarLc);
                return aVarLc;
            }
        }

        /* compiled from: DaggerPreApprovalFormComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final o f201737a;

            public d(o oVar) {
                this.f201737a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f201737a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c() {
            throw null;
        }

        public c(o oVar, cv.b bVar, com.avito.android.mortgage.pre_approval.form.di.c cVar, C28478k c28478k, l lVar, PreApprovalArguments preApprovalArguments, C5979a c5979a) {
            this.f201711a = bVar;
            this.f201712b = B.a(com.avito.android.konveyor_adapter_module.d.a());
            dagger.internal.l lVarA = dagger.internal.l.a(lVar);
            this.f201713c = lVarA;
            this.f201714d = g.d(new com.avito.android.mortgage.pre_approval.form.list.items.input.b(new j(lVarA)));
            this.f201715e = g.d(new com.avito.android.mortgage.pre_approval.form.list.items.select.b(new com.avito.android.mortgage.pre_approval.form.list.items.select.f(this.f201713c)));
            this.f201716f = g.d(new com.avito.android.mortgage.pre_approval.form.list.items.chips.b(new com.avito.android.mortgage.pre_approval.form.list.items.chips.f(this.f201713c)));
            this.f201717g = g.d(new com.avito.android.mortgage.pre_approval.list.items.title.b(com.avito.android.mortgage.pre_approval.list.items.title.e.a()));
            A.b bVarA = A.a(4, 1);
            bVarA.f393938b.add(this.f201712b);
            u<TV0.b<?, ?>> uVar = this.f201714d;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f201715e);
            list.add(this.f201716f);
            list.add(this.f201717g);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f201718h = uVarK;
            this.f201719i = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f201720j = g.d(com.avito.android.mortgage.pre_approval.form.list.items.input.payload.c.a());
            this.f201721k = g.d(com.avito.android.mortgage.pre_approval.form.list.items.select.payload.c.a());
            this.f201722l = g.d(com.avito.android.mortgage.pre_approval.form.list.items.chips.payload.c.a());
            A.b bVarA2 = A.a(3, 0);
            u<com.avito.android.recycler.data_aware.a> uVar2 = this.f201720j;
            List<u<T>> list2 = bVarA2.f393937a;
            list2.add(uVar2);
            list2.add(this.f201721k);
            list2.add(this.f201722l);
            this.f201723m = g.d(new L00.b(this.f201719i, this.f201718h, new S00.b(bVarA2.b())));
            this.f201724n = new d(oVar);
            this.f201725o = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f201724n);
            k kVar = new k(new h(n.a()));
            this.f201727q = new M00.d(new b(oVar));
            this.f201728r = new com.avito.android.mortgage.pre_approval.form.mvi.l(kVar, com.avito.android.mortgage.pre_approval.form.mvi.builders.d.a(), this.f201727q);
            this.f201729s = new C5981c(oVar);
            this.f201730t = new com.avito.android.mortgage.pre_approval.form.mvi.domain.b(dagger.internal.l.a(preApprovalArguments), this.f201729s);
            com.avito.android.mortgage.pre_approval.form.mvi.domain.g gVar = new com.avito.android.mortgage.pre_approval.form.mvi.domain.g(new i(n.a()), new C5980a(cVar));
            com.avito.android.mortgage.pre_approval.form.mvi.domain.b bVar2 = this.f201730t;
            com.avito.android.mortgage.pre_approval.form.mvi.c cVar2 = new com.avito.android.mortgage.pre_approval.form.mvi.c(bVar2, gVar);
            this.f201732v = new com.avito.android.mortgage.pre_approval.form.mvi.e(bVar2);
            this.f201733w = new f(new com.avito.android.mortgage.pre_approval.form.mvi.j(this.f201728r, cVar2, com.avito.android.mortgage.pre_approval.form.mvi.g.a(), this.f201732v, this.f201725o));
        }

        @Override // com.avito.android.mortgage.pre_approval.form.di.b
        public final void a(PreApprovalFormFragment preApprovalFormFragment) {
            preApprovalFormFragment.f201683n0 = new com.avito.android.mortgage.pre_approval.form.d(this.f201723m.get());
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f201711a.u4();
            t.c(aVarU4);
            preApprovalFormFragment.f201684o0 = aVarU4;
            preApprovalFormFragment.f201685p0 = this.f201725o.get();
            preApprovalFormFragment.f201686q0 = this.f201733w;
        }
    }

    public static b.a a() {
        return new b();
    }
}
