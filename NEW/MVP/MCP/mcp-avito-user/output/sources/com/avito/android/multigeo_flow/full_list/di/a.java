package com.avito.android.multigeo_flow.full_list.di;

import Y41.l;
import com.avito.android.multigeo_flow.full_list.di.b;
import com.avito.android.multigeo_flow.full_list.view.JobMultiGeoFullListFragment;
import com.avito.android.multigeo_flow.full_list.view.i;
import com.avito.android.multigeo_flow.mvi.entity.JobMultiGeoState;
import com.avito.android.multigeo_flow.mvi.logics.h;
import com.avito.android.multigeo_flow.mvi.logics.j;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerJobMultiGeoFullListComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerJobMultiGeoFullListComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.multigeo_flow.full_list.di.b.a
        public final com.avito.android.multigeo_flow.full_list.di.b a(InterfaceC39417a interfaceC39417a, com.avito.android.multigeo_flow.full_list.di.c cVar, l lVar, JobMultiGeoState jobMultiGeoState) {
            interfaceC39417a.getClass();
            return new c(interfaceC39417a, cVar, lVar, jobMultiGeoState, null);
        }
    }

    /* compiled from: DaggerJobMultiGeoFullListComponent.java */
    public static final class c implements com.avito.android.multigeo_flow.full_list.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f206890a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.multigeo_flow.full_list.list.c> f206891b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f206892c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f206893d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f206894e;

        /* renamed from: f, reason: collision with root package name */
        public final u<M20.a> f206895f;

        /* renamed from: g, reason: collision with root package name */
        public final u<R0> f206896g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.multigeo_flow.domain.b> f206897h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f206898i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.multigeo_flow.mvi.logics.c f206899j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.l f206900k;

        /* renamed from: l, reason: collision with root package name */
        public final i f206901l;

        /* compiled from: DaggerJobMultiGeoFullListComponent.java */
        /* renamed from: com.avito.android.multigeo_flow.full_list.di.a$c$a, reason: collision with other inner class name */
        public static final class C6164a implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f206902a;

            public C6164a(cv.b bVar) {
                this.f206902a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f206902a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerJobMultiGeoFullListComponent.java */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.multigeo_flow.full_list.di.c f206903a;

            public b(com.avito.android.multigeo_flow.full_list.di.c cVar) {
                this.f206903a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f206903a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerJobMultiGeoFullListComponent.java */
        /* renamed from: com.avito.android.multigeo_flow.full_list.di.a$c$c, reason: collision with other inner class name */
        public static final class C6165c implements u<M20.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.multigeo_flow.full_list.di.c f206904a;

            public C6165c(com.avito.android.multigeo_flow.full_list.di.c cVar) {
                this.f206904a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                M20.a aVarXb = this.f206904a.xb();
                t.c(aVarXb);
                return aVarXb;
            }
        }

        public c() {
            throw null;
        }

        public c(cv.b bVar, com.avito.android.multigeo_flow.full_list.di.c cVar, l lVar, JobMultiGeoState jobMultiGeoState, C6163a c6163a) {
            this.f206890a = bVar;
            u<com.avito.android.multigeo_flow.full_list.list.c> uVarD = dagger.internal.g.d(new com.avito.android.multigeo_flow.full_list.list.f(dagger.internal.l.a(lVar)));
            this.f206891b = uVarD;
            u<com.avito.konveyor.a> uVarD2 = dagger.internal.g.d(new f(new com.avito.android.multigeo_flow.full_list.list.b(uVarD)));
            this.f206892c = uVarD2;
            u<com.avito.konveyor.adapter.a> uVarD3 = dagger.internal.g.d(new e(uVarD2));
            this.f206893d = uVarD3;
            this.f206894e = dagger.internal.g.d(new g(uVarD3, this.f206892c));
            u<com.avito.android.multigeo_flow.domain.b> uVarD4 = dagger.internal.g.d(new com.avito.android.multigeo_flow.domain.e(new C6165c(cVar), new b(cVar)));
            this.f206897h = uVarD4;
            this.f206899j = new com.avito.android.multigeo_flow.mvi.logics.c(uVarD4, new C6164a(bVar));
            this.f206900k = dagger.internal.l.a(jobMultiGeoState);
            this.f206901l = new i(new com.avito.android.multigeo_flow.mvi.logics.f(this.f206899j, h.a(), j.a(), this.f206900k));
        }

        @Override // com.avito.android.multigeo_flow.full_list.di.b
        public final void a(JobMultiGeoFullListFragment jobMultiGeoFullListFragment) {
            jobMultiGeoFullListFragment.f206925o0 = this.f206894e.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f206890a.u4();
            t.c(aVarU4);
            jobMultiGeoFullListFragment.f206926p0 = aVarU4;
            jobMultiGeoFullListFragment.f206927q0 = this.f206901l;
        }
    }

    public static b.a a() {
        return new b();
    }
}
