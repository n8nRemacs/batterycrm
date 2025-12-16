package com.avito.android.mortgage.pre_approval.result.di;

import Y41.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage.di.o;
import com.avito.android.mortgage.pre_approval.model.PreApprovalArguments;
import com.avito.android.mortgage.pre_approval.result.PreApprovalResultFragment;
import com.avito.android.mortgage.pre_approval.result.di.b;
import com.avito.android.mortgage.pre_approval.result.mvi.domain.f;
import com.avito.android.mortgage.pre_approval.result.mvi.j;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Set;

/* compiled from: DaggerPreApprovalResultComponent.java */
@e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerPreApprovalResultComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.mortgage.pre_approval.result.di.b.a
        public final com.avito.android.mortgage.pre_approval.result.di.b a(o oVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, l lVar, PreApprovalArguments preApprovalArguments) {
            interfaceC39417a.getClass();
            return new c(oVar, interfaceC39417a, c28478k, lVar, preApprovalArguments, null);
        }
    }

    /* compiled from: DaggerPreApprovalResultComponent.java */
    public static final class c implements com.avito.android.mortgage.pre_approval.result.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final com.avito.android.mortgage.pre_approval.result.d f202003A;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f202004a;

        /* renamed from: b, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f202005b;

        /* renamed from: c, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f202006c;

        /* renamed from: d, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f202007d;

        /* renamed from: e, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f202008e;

        /* renamed from: f, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f202009f;

        /* renamed from: g, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f202010g;

        /* renamed from: h, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f202011h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f202012i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f202013j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.a> f202014k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.a> f202015l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f202016m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC28481c> f202017n;

        /* renamed from: o, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f202018o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.mortgage.pre_approval.result.mvi.builders.a> f202019p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.mortgage.pre_approval.result.mvi.builders.e> f202020q;

        /* renamed from: r, reason: collision with root package name */
        public final u<InterfaceC28373a> f202021r;

        /* renamed from: s, reason: collision with root package name */
        public final u<U00.c> f202022s;

        /* renamed from: t, reason: collision with root package name */
        public final com.avito.android.mortgage.pre_approval.result.mvi.l f202023t;

        /* renamed from: u, reason: collision with root package name */
        public final u<IZ.a> f202024u;

        /* renamed from: v, reason: collision with root package name */
        public final com.avito.android.mortgage.pre_approval.result.mvi.domain.b f202025v;

        /* renamed from: w, reason: collision with root package name */
        public final u<f> f202026w;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.avito.android.mortgage.pre_approval.result.mvi.domain.d> f202027x;

        /* renamed from: y, reason: collision with root package name */
        public final com.avito.android.mortgage.pre_approval.result.mvi.c f202028y;

        /* renamed from: z, reason: collision with root package name */
        public final com.avito.android.mortgage.pre_approval.result.mvi.e f202029z;

        /* compiled from: DaggerPreApprovalResultComponent.java */
        /* renamed from: com.avito.android.mortgage.pre_approval.result.di.a$c$a, reason: collision with other inner class name */
        public static final class C5993a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f202030a;

            public C5993a(o oVar) {
                this.f202030a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f202030a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerPreApprovalResultComponent.java */
        public static final class b implements u<IZ.a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f202031a;

            public b(o oVar) {
                this.f202031a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                IZ.a aVarLc = this.f202031a.lc();
                t.c(aVarLc);
                return aVarLc;
            }
        }

        /* compiled from: DaggerPreApprovalResultComponent.java */
        /* renamed from: com.avito.android.mortgage.pre_approval.result.di.a$c$c, reason: collision with other inner class name */
        public static final class C5994c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final o f202032a;

            public C5994c(o oVar) {
                this.f202032a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f202032a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c() {
            throw null;
        }

        public c(o oVar, cv.b bVar, C28478k c28478k, l lVar, PreApprovalArguments preApprovalArguments, C5992a c5992a) {
            this.f202004a = bVar;
            this.f202005b = B.a(com.avito.android.konveyor_adapter_module.d.a());
            this.f202006c = g.d(new com.avito.android.mortgage.pre_approval.result.list.items.timer.b(com.avito.android.mortgage.pre_approval.result.list.items.timer.e.a()));
            this.f202007d = g.d(new com.avito.android.mortgage.pre_approval.result.list.items.status.b(com.avito.android.mortgage.pre_approval.result.list.items.status.e.a()));
            this.f202008e = g.d(new com.avito.android.mortgage.pre_approval.result.list.items.point.b(com.avito.android.mortgage.pre_approval.result.list.items.point.e.a()));
            this.f202009f = g.d(new com.avito.android.mortgage.pre_approval.result.list.items.expandable_block.b(new com.avito.android.mortgage.pre_approval.result.list.items.expandable_block.f(dagger.internal.l.a(lVar))));
            this.f202010g = g.d(new com.avito.android.mortgage.pre_approval.result.list.items.description.b(com.avito.android.mortgage.pre_approval.result.list.items.description.e.a()));
            this.f202011h = g.d(new com.avito.android.mortgage.pre_approval.list.items.title.b(com.avito.android.mortgage.pre_approval.list.items.title.e.a()));
            A.b bVarA = A.a(6, 1);
            bVarA.f393938b.add(this.f202005b);
            u<TV0.b<?, ?>> uVar = this.f202006c;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f202007d);
            list.add(this.f202008e);
            list.add(this.f202009f);
            list.add(this.f202010g);
            list.add(this.f202011h);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f202012i = uVarK;
            this.f202013j = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f202014k = g.d(com.avito.android.mortgage.pre_approval.result.list.items.timer.payloads.c.a());
            this.f202015l = g.d(com.avito.android.mortgage.pre_approval.result.list.items.expandable_block.payloads.c.a());
            A.b bVarA2 = A.a(2, 0);
            u<com.avito.android.recycler.data_aware.a> uVar2 = this.f202014k;
            List<u<T>> list2 = bVarA2.f393937a;
            list2.add(uVar2);
            list2.add(this.f202015l);
            this.f202016m = g.d(new L00.b(this.f202013j, this.f202012i, new S00.b(bVarA2.b())));
            this.f202017n = new C5994c(oVar);
            this.f202018o = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f202017n);
            u<com.avito.android.mortgage.pre_approval.result.mvi.builders.a> uVarD = g.d(com.avito.android.mortgage.pre_approval.result.mvi.builders.c.a());
            this.f202019p = uVarD;
            this.f202020q = g.d(new com.avito.android.mortgage.pre_approval.result.mvi.builders.g(uVarD));
            u<U00.c> uVarD2 = g.d(new U00.e(new C5993a(oVar)));
            this.f202022s = uVarD2;
            this.f202023t = new com.avito.android.mortgage.pre_approval.result.mvi.l(uVarD2, this.f202020q);
            b bVar2 = new b(oVar);
            this.f202024u = bVar2;
            this.f202025v = new com.avito.android.mortgage.pre_approval.result.mvi.domain.b(bVar2);
            u<f> uVarD3 = g.d(com.avito.android.mortgage.pre_approval.result.mvi.domain.g.a());
            this.f202026w = uVarD3;
            u<com.avito.android.mortgage.pre_approval.result.mvi.domain.d> uVarD4 = g.d(new com.avito.android.mortgage.pre_approval.result.mvi.domain.e(uVarD3, this.f202024u));
            this.f202027x = uVarD4;
            this.f202028y = new com.avito.android.mortgage.pre_approval.result.mvi.c(this.f202025v, uVarD4);
            this.f202029z = new com.avito.android.mortgage.pre_approval.result.mvi.e(dagger.internal.l.a(preApprovalArguments), this.f202027x, this.f202026w);
            this.f202003A = new com.avito.android.mortgage.pre_approval.result.d(new j(this.f202023t, this.f202028y, com.avito.android.mortgage.pre_approval.result.mvi.g.a(), this.f202029z, this.f202018o));
        }

        @Override // com.avito.android.mortgage.pre_approval.result.di.b
        public final void a(PreApprovalResultFragment preApprovalResultFragment) {
            preApprovalResultFragment.f201979n0 = new com.avito.android.mortgage.pre_approval.result.b(this.f202016m.get(), this.f202012i.get());
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f202004a.u4();
            t.c(aVarU4);
            preApprovalResultFragment.f201980o0 = aVarU4;
            preApprovalResultFragment.f201981p0 = this.f202018o.get();
            preApprovalResultFragment.f201982q0 = this.f202003A;
        }
    }

    public static b.a a() {
        return new b();
    }
}
