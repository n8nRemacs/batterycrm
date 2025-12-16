package com.avito.android.crm_paid_cvs.features.filters.di;

import Y41.l;
import Y41.p;
import android.content.res.Resources;
import androidx.view.C22977J;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.crm_paid_cvs.features.filters.di.b;
import com.avito.android.crm_paid_cvs.features.filters.logics.k;
import com.avito.android.crm_paid_cvs.features.filters.logics.s;
import com.avito.android.crm_paid_cvs.view.base.CrmPaidCvsFiltersFragment;
import com.avito.android.crm_paid_cvs.view.list_items.chips_filter.h;
import com.avito.android.crm_paid_cvs.view.list_items.list_option.i;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.g;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Set;
import jt.C42423b;
import kotlinx.coroutines.T;

/* compiled from: DaggerFiltersComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerFiltersComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.crm_paid_cvs.features.filters.di.b.a
        public final com.avito.android.crm_paid_cvs.features.filters.di.b a(d dVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, Resources resources, C22977J c22977j, List list, p pVar, p pVar2, l lVar, l lVar2, l lVar3, l lVar4) {
            interfaceC39417a.getClass();
            list.getClass();
            return new c(dVar, interfaceC39417a, c28478k, resources, c22977j, list, pVar, pVar2, lVar, lVar2, lVar3, lVar4, null);
        }
    }

    /* compiled from: DaggerFiltersComponent.java */
    public static final class c implements com.avito.android.crm_paid_cvs.features.filters.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f130596a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.crm_paid_cvs.view.list_items.list_option.f> f130597b;

        /* renamed from: c, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f130598c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.crm_paid_cvs.view.list_items.chips_filter.e> f130599d;

        /* renamed from: e, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f130600e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.crm_paid_cvs.view.list_items.range_filter.e> f130601f;

        /* renamed from: g, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f130602g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.l f130603h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.crm_paid_cvs.view.list_items.select_filter.e> f130604i;

        /* renamed from: j, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f130605j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.crm_paid_cvs.view.list_items.switch_filter.e> f130606k;

        /* renamed from: l, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f130607l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f130608m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f130609n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f130610o;

        /* renamed from: p, reason: collision with root package name */
        public final C42423b f130611p;

        /* renamed from: q, reason: collision with root package name */
        public final u<InterfaceC28481c> f130612q;

        /* renamed from: r, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f130613r;

        /* compiled from: DaggerFiltersComponent.java */
        /* renamed from: com.avito.android.crm_paid_cvs.features.filters.di.a$c$a, reason: collision with other inner class name */
        public static final class C3881a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final d f130614a;

            public C3881a(d dVar) {
                this.f130614a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f130614a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        public c() {
            throw null;
        }

        public c(d dVar, cv.b bVar, C28478k c28478k, Resources resources, T t12, List list, p pVar, p pVar2, l lVar, l lVar2, l lVar3, l lVar4, C3880a c3880a) {
            this.f130596a = B.a(com.avito.android.konveyor_adapter_module.d.a());
            u<com.avito.android.crm_paid_cvs.view.list_items.list_option.f> uVarD = g.d(new i(dagger.internal.l.a(lVar4)));
            this.f130597b = uVarD;
            this.f130598c = g.d(new com.avito.android.crm_paid_cvs.view.list_items.list_option.d(uVarD));
            u<com.avito.android.crm_paid_cvs.view.list_items.chips_filter.e> uVarD2 = g.d(new h(dagger.internal.l.a(pVar)));
            this.f130599d = uVarD2;
            this.f130600e = g.d(new com.avito.android.crm_paid_cvs.view.list_items.chips_filter.c(uVarD2));
            this.f130601f = g.d(new com.avito.android.crm_paid_cvs.view.list_items.range_filter.h(dagger.internal.l.a(pVar2)));
            this.f130602g = g.d(new com.avito.android.crm_paid_cvs.view.list_items.range_filter.c(dagger.internal.l.a(t12), this.f130601f));
            this.f130603h = dagger.internal.l.a(lVar);
            u<com.avito.android.crm_paid_cvs.view.list_items.select_filter.e> uVarD3 = g.d(new com.avito.android.crm_paid_cvs.view.list_items.select_filter.i(this.f130603h, dagger.internal.l.a(lVar3)));
            this.f130604i = uVarD3;
            this.f130605j = g.d(new com.avito.android.crm_paid_cvs.view.list_items.select_filter.c(uVarD3));
            u<com.avito.android.crm_paid_cvs.view.list_items.switch_filter.e> uVarD4 = g.d(new com.avito.android.crm_paid_cvs.view.list_items.switch_filter.h(dagger.internal.l.a(lVar2)));
            this.f130606k = uVarD4;
            this.f130607l = g.d(new com.avito.android.crm_paid_cvs.view.list_items.switch_filter.c(uVarD4));
            A.b bVarA = A.a(5, 1);
            bVarA.f393938b.add(this.f130596a);
            u<TV0.b<?, ?>> uVar = this.f130598c;
            List<u<T>> list2 = bVarA.f393937a;
            list2.add(uVar);
            list2.add(this.f130600e);
            list2.add(this.f130602g);
            list2.add(this.f130605j);
            list2.add(this.f130607l);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f130608m = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f130609n = uVarH;
            this.f130610o = g.d(new f(uVarH, this.f130608m));
            this.f130611p = new C42423b(new com.avito.android.crm_paid_cvs.features.filters.logics.i(new com.avito.android.crm_paid_cvs.features.filters.logics.f(dagger.internal.l.a(list)), com.avito.android.crm_paid_cvs.features.filters.logics.d.a(), k.a(), s.a()));
            this.f130612q = new C3881a(dVar);
            this.f130613r = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f130612q);
        }

        @Override // com.avito.android.crm_paid_cvs.features.filters.di.b
        public final void a(CrmPaidCvsFiltersFragment crmPaidCvsFiltersFragment) {
            crmPaidCvsFiltersFragment.f130690n0 = this.f130610o.get();
            crmPaidCvsFiltersFragment.f130691o0 = this.f130608m.get();
            crmPaidCvsFiltersFragment.f130692p0 = this.f130611p;
            crmPaidCvsFiltersFragment.f130694r0 = this.f130613r.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
