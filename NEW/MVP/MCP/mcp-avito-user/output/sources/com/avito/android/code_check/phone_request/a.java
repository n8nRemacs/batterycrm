package com.avito.android.code_check.phone_request;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.code_check.phone_request.b;
import dagger.internal.t;
import dagger.internal.u;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: DaggerPhoneRequestComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerPhoneRequestComponent.java */
    public static final class b implements b.a {
        public b() {
        }
    }

    /* compiled from: DaggerPhoneRequestComponent.java */
    public static final class c implements com.avito.android.code_check.phone_request.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.code_check.phone_request.c f119056a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.l f119057b;

        /* renamed from: c, reason: collision with root package name */
        public final u<Map<String, com.avito.android.code_check_public.screen.h>> f119058c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.code_check_public.screen.d> f119059d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.code_check.d> f119060e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.code_check.phone_request.mvi.g f119061f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC43160i<To.d>> f119062g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.code_check.phone_request.mvi.i f119063h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f119064i;

        /* renamed from: j, reason: collision with root package name */
        public final u<C28478k> f119065j;

        /* renamed from: k, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f119066k;

        /* renamed from: l, reason: collision with root package name */
        public final q f119067l;

        /* compiled from: DaggerPhoneRequestComponent.java */
        /* renamed from: com.avito.android.code_check.phone_request.a$c$a, reason: collision with other inner class name */
        public static final class C3477a implements u<com.avito.android.code_check.d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.code_check.phone_request.c f119068a;

            public C3477a(com.avito.android.code_check.phone_request.c cVar) {
                this.f119068a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.code_check.d dVarVj = this.f119068a.Vj();
                t.c(dVarVj);
                return dVarVj;
            }
        }

        /* compiled from: DaggerPhoneRequestComponent.java */
        public static final class b implements u<Map<String, com.avito.android.code_check_public.screen.h>> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.code_check.phone_request.c f119069a;

            public b(com.avito.android.code_check.phone_request.c cVar) {
                this.f119069a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f119069a.w4();
            }
        }

        /* compiled from: DaggerPhoneRequestComponent.java */
        /* renamed from: com.avito.android.code_check.phone_request.a$c$c, reason: collision with other inner class name */
        public static final class C3478c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.code_check.phone_request.c f119070a;

            public C3478c(com.avito.android.code_check.phone_request.c cVar) {
                this.f119070a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f119070a.b();
            }
        }

        public c(k kVar, com.avito.android.code_check.phone_request.c cVar, cv.b bVar, String str, r rVar, C3476a c3476a) {
            this.f119056a = cVar;
            dagger.internal.l lVarA = dagger.internal.l.a(str);
            this.f119057b = lVarA;
            u<com.avito.android.code_check_public.screen.d> uVarD = dagger.internal.g.d(new n(kVar, lVarA, new b(cVar)));
            this.f119059d = uVarD;
            l lVar = new l(kVar, uVarD);
            C3477a c3477a = new C3477a(cVar);
            this.f119060e = c3477a;
            this.f119061f = new com.avito.android.code_check.phone_request.mvi.g(lVar, c3477a);
            u<InterfaceC43160i<To.d>> uVarD2 = dagger.internal.g.d(new o(kVar, uVarD));
            this.f119062g = uVarD2;
            this.f119063h = new com.avito.android.code_check.phone_request.mvi.i(uVarD2, this.f119060e);
            this.f119064i = new C3478c(cVar);
            u<C28478k> uVarD3 = dagger.internal.g.d(new m(kVar, this.f119057b, dagger.internal.l.a(rVar)));
            this.f119065j = uVarD3;
            this.f119066k = com.avito.android.advert.item.delivery_suggests.l.i(this.f119064i, uVarD3);
            this.f119067l = new q(new com.avito.android.code_check.phone_request.mvi.l(this.f119061f, com.avito.android.code_check.phone_request.mvi.n.a(), com.avito.android.code_check.phone_request.mvi.p.a(), this.f119063h, this.f119066k));
        }
    }
}
