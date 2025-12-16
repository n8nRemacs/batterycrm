package com.avito.android.code_check.pre_request;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.code_check.pre_request.b;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.Map;

/* compiled from: DaggerPreRequestComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerPreRequestComponent.java */
    public static final class b implements b.a {
        public b() {
        }
    }

    /* compiled from: DaggerPreRequestComponent.java */
    public static final class c implements com.avito.android.code_check.pre_request.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.code_check.pre_request.c f119167a;

        /* renamed from: b, reason: collision with root package name */
        public final l f119168b;

        /* renamed from: c, reason: collision with root package name */
        public final u<Map<String, com.avito.android.code_check_public.screen.h>> f119169c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.code_check_public.screen.g> f119170d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.code_check.d> f119171e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.code_check.pre_request.mvi.e f119172f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28481c> f119173g;

        /* renamed from: h, reason: collision with root package name */
        public final u<C28478k> f119174h;

        /* renamed from: i, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f119175i;

        /* renamed from: j, reason: collision with root package name */
        public final j f119176j;

        /* compiled from: DaggerPreRequestComponent.java */
        /* renamed from: com.avito.android.code_check.pre_request.a$c$a, reason: collision with other inner class name */
        public static final class C3489a implements u<com.avito.android.code_check.d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.code_check.pre_request.c f119177a;

            public C3489a(com.avito.android.code_check.pre_request.c cVar) {
                this.f119177a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.code_check.d dVarVj = this.f119177a.Vj();
                t.c(dVarVj);
                return dVarVj;
            }
        }

        /* compiled from: DaggerPreRequestComponent.java */
        public static final class b implements u<Map<String, com.avito.android.code_check_public.screen.h>> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.code_check.pre_request.c f119178a;

            public b(com.avito.android.code_check.pre_request.c cVar) {
                this.f119178a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f119178a.w4();
            }
        }

        /* compiled from: DaggerPreRequestComponent.java */
        /* renamed from: com.avito.android.code_check.pre_request.a$c$c, reason: collision with other inner class name */
        public static final class C3490c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.code_check.pre_request.c f119179a;

            public C3490c(com.avito.android.code_check.pre_request.c cVar) {
                this.f119179a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f119179a.b();
            }
        }

        public c(e eVar, com.avito.android.code_check.pre_request.c cVar, cv.b bVar, String str, r rVar, C3488a c3488a) {
            this.f119167a = cVar;
            l lVarA = l.a(str);
            this.f119168b = lVarA;
            u<com.avito.android.code_check_public.screen.g> uVarD = dagger.internal.g.d(new h(eVar, lVarA, new b(cVar)));
            this.f119170d = uVarD;
            this.f119172f = new com.avito.android.code_check.pre_request.mvi.e(new f(eVar, uVarD), new C3489a(cVar));
            this.f119173g = new C3490c(cVar);
            u<C28478k> uVarD2 = dagger.internal.g.d(new g(eVar, this.f119168b, l.a(rVar)));
            this.f119174h = uVarD2;
            this.f119175i = com.avito.android.advert.item.delivery_suggests.l.i(this.f119173g, uVarD2);
            this.f119176j = new j(new com.avito.android.code_check.pre_request.mvi.h(this.f119172f, com.avito.android.code_check.pre_request.mvi.j.a(), com.avito.android.code_check.pre_request.mvi.l.a(), this.f119175i));
        }
    }
}
