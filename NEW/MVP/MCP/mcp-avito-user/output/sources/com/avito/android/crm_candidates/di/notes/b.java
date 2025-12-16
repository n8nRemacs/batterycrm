package com.avito.android.crm_candidates.di.notes;

import Y41.l;
import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.crm_candidates.di.notes.h;
import com.avito.android.crm_candidates.features.notes_list.logics.k;
import com.avito.android.crm_candidates.features.notes_list.logics.m;
import com.avito.android.crm_candidates.features.notes_list.logics.o;
import com.avito.android.crm_candidates.view.base.JobCrmNotesListFragment;
import com.avito.android.crm_candidates.view.list_items.notes_list.j;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Set;

/* compiled from: DaggerJobCrmNotesListComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class b {

    /* compiled from: DaggerJobCrmNotesListComponent.java */
    /* renamed from: com.avito.android.crm_candidates.di.notes.b$b, reason: collision with other inner class name */
    public static final class C3843b implements h.a {
        public C3843b() {
        }

        @Override // com.avito.android.crm_candidates.di.notes.h.a
        public final h a(i iVar, InterfaceC39417a interfaceC39417a, String str, String str2, String str3, String str4, String str5, l lVar, List list, C28478k c28478k, Resources resources) {
            interfaceC39417a.getClass();
            list.getClass();
            return new c(iVar, interfaceC39417a, str, str2, str3, str4, str5, lVar, list, c28478k, resources, null);
        }
    }

    /* compiled from: DaggerJobCrmNotesListComponent.java */
    public static final class c implements h {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.crm_candidates.features.notes_list.logics.f f129313a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.l f129314b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f129315c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.l f129316d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.l f129317e;

        /* renamed from: f, reason: collision with root package name */
        public final k f129318f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28481c> f129319g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f129320h;

        /* renamed from: i, reason: collision with root package name */
        public final o f129321i;

        /* renamed from: j, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f129322j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.crm_candidates.view.list_items.notes_list.c> f129323k;

        /* renamed from: l, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f129324l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f129325m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f129326n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f129327o;

        /* compiled from: DaggerJobCrmNotesListComponent.java */
        public static final class a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final i f129328a;

            public a(i iVar) {
                this.f129328a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f129328a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        public c() {
            throw null;
        }

        public c(i iVar, cv.b bVar, String str, String str2, String str3, String str4, String str5, l lVar, List list, C28478k c28478k, Resources resources, a aVar) {
            this.f129313a = new com.avito.android.crm_candidates.features.notes_list.logics.f(dagger.internal.l.a(list));
            this.f129314b = dagger.internal.l.a(str);
            this.f129315c = dagger.internal.l.a(str2);
            this.f129316d = dagger.internal.l.a(str3);
            this.f129317e = dagger.internal.l.b(str4);
            this.f129318f = new k(this.f129314b, this.f129315c, this.f129316d, this.f129317e, dagger.internal.l.b(str5));
            this.f129319g = new a(iVar);
            this.f129320h = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f129319g);
            this.f129321i = new o(new com.avito.android.crm_candidates.features.notes_list.logics.i(this.f129313a, com.avito.android.crm_candidates.features.notes_list.logics.d.a(), this.f129318f, m.a(), this.f129320h));
            this.f129322j = B.a(com.avito.android.konveyor_adapter_module.d.a());
            u<com.avito.android.crm_candidates.view.list_items.notes_list.c> uVarD = dagger.internal.g.d(new com.avito.android.crm_candidates.view.list_items.notes_list.f(dagger.internal.l.a(lVar)));
            this.f129323k = uVarD;
            this.f129324l = dagger.internal.g.d(new com.avito.android.crm_candidates.view.list_items.notes_list.b(uVarD));
            A.b bVarA = A.a(1, 1);
            bVarA.f393938b.add(this.f129322j);
            bVarA.f393937a.add(this.f129324l);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f129325m = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f129326n = uVarH;
            this.f129327o = dagger.internal.g.d(new j(uVarH, this.f129325m));
        }

        @Override // com.avito.android.crm_candidates.di.notes.h
        public final void a(JobCrmNotesListFragment jobCrmNotesListFragment) {
            jobCrmNotesListFragment.f129878n0 = this.f129321i;
            jobCrmNotesListFragment.f129880p0 = this.f129327o.get();
            jobCrmNotesListFragment.f129881q0 = this.f129320h.get();
        }
    }

    public static h.a a() {
        return new C3843b();
    }
}
