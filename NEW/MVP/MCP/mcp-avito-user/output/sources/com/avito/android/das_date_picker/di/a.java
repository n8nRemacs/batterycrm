package com.avito.android.das_date_picker.di;

import androidx.fragment.app.ActivityC22955m;
import androidx.view.T0;
import com.avito.android.J0;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.das_date_picker.DasCalendarFragment;
import com.avito.android.das_date_picker.di.b;
import com.avito.android.das_date_picker.model.DasCalendarInitParameters;
import com.avito.android.das_date_picker.mvi.m;
import com.avito.android.das_date_picker.mvi.n;
import com.avito.android.das_date_picker.mvi.p;
import com.avito.android.das_date_picker.mvi.v;
import com.avito.android.das_date_picker.mvi.x;
import com.avito.android.util.L0;
import com.avito.android.util.R0;
import dagger.internal.A;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;

/* compiled from: DaggerDasCalendarComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerDasCalendarComponent.java */
    public static final class b implements com.avito.android.das_date_picker.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.das_date_picker.di.c f132267a;

        /* renamed from: b, reason: collision with root package name */
        public final l f132268b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f132269c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.das_date_picker.mvi.g> f132270d;

        /* renamed from: e, reason: collision with root package name */
        public final u<n> f132271e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.server_time.f> f132272f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.das_date_picker.mvi.f f132273g;

        /* renamed from: h, reason: collision with root package name */
        public final u<J0> f132274h;

        /* renamed from: i, reason: collision with root package name */
        public final u<v> f132275i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.das_date_picker.mvi.u f132276j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC28481c> f132277k;

        /* renamed from: l, reason: collision with root package name */
        public final u<C28478k> f132278l;

        /* renamed from: m, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f132279m;

        /* renamed from: n, reason: collision with root package name */
        public final com.avito.android.das_date_picker.j f132280n;

        /* renamed from: o, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f132281o;

        /* renamed from: p, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f132282p;

        /* renamed from: q, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f132283q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f132284r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f132285s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f132286t;

        /* compiled from: DaggerDasCalendarComponent.java */
        /* renamed from: com.avito.android.das_date_picker.di.a$b$a, reason: collision with other inner class name */
        public static final class C3958a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.das_date_picker.di.c f132287a;

            public C3958a(com.avito.android.das_date_picker.di.c cVar) {
                this.f132287a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f132287a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerDasCalendarComponent.java */
        /* renamed from: com.avito.android.das_date_picker.di.a$b$b, reason: collision with other inner class name */
        public static final class C3959b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.das_date_picker.di.c f132288a;

            public C3959b(com.avito.android.das_date_picker.di.c cVar) {
                this.f132288a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f132288a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerDasCalendarComponent.java */
        public static final class c implements u<J0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.das_date_picker.di.c f132289a;

            public c(com.avito.android.das_date_picker.di.c cVar) {
                this.f132289a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                J0 j0F0 = this.f132289a.f0();
                t.c(j0F0);
                return j0F0;
            }
        }

        /* compiled from: DaggerDasCalendarComponent.java */
        public static final class d implements u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.das_date_picker.di.c f132290a;

            public d(com.avito.android.das_date_picker.di.c cVar) {
                this.f132290a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f132290a.l();
                t.c(fVarL);
                return fVarL;
            }
        }

        public b() {
            throw null;
        }

        public b(h hVar, com.avito.android.das_date_picker.di.d dVar, com.avito.android.das_date_picker.di.c cVar, r rVar, DasCalendarInitParameters dasCalendarInitParameters, T0 t02, Y41.l lVar, C3957a c3957a) {
            this.f132267a = cVar;
            this.f132268b = l.a(dasCalendarInitParameters);
            C3959b c3959b = new C3959b(cVar);
            this.f132269c = c3959b;
            u<com.avito.android.das_date_picker.mvi.g> uVarD = dagger.internal.g.d(new com.avito.android.das_date_picker.mvi.j(c3959b));
            this.f132270d = uVarD;
            u<n> uVarD2 = dagger.internal.g.d(new p(uVarD, this.f132269c));
            this.f132271e = uVarD2;
            this.f132273g = new com.avito.android.das_date_picker.mvi.f(this.f132268b, uVarD2, new d(cVar));
            u<v> uVarD3 = dagger.internal.g.d(new x(new c(cVar)));
            this.f132275i = uVarD3;
            this.f132276j = new com.avito.android.das_date_picker.mvi.u(uVarD3);
            this.f132277k = new C3958a(cVar);
            u<C28478k> uVarD4 = dagger.internal.g.d(new i(hVar, l.a(rVar)));
            this.f132278l = uVarD4;
            this.f132279m = dagger.internal.g.d(new j(hVar, this.f132277k, uVarD4));
            this.f132280n = new com.avito.android.das_date_picker.j(new m(this.f132273g, com.avito.android.das_date_picker.mvi.d.a(), com.avito.android.das_date_picker.mvi.r.a(), this.f132276j, this.f132279m));
            this.f132281o = dagger.internal.g.d(new com.avito.android.das_date_picker.items.day.c(new com.avito.android.das_date_picker.items.day.f(l.a(lVar))));
            this.f132282p = dagger.internal.g.d(new com.avito.android.das_date_picker.items.empty.c(com.avito.android.das_date_picker.items.empty.e.a()));
            this.f132283q = dagger.internal.g.d(new com.avito.android.das_date_picker.items.month.c(com.avito.android.das_date_picker.items.month.e.a()));
            A.b bVarA = A.a(3, 0);
            u<TV0.b<?, ?>> uVar = this.f132281o;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f132282p);
            list.add(this.f132283q);
            u<com.avito.konveyor.a> uVarD5 = dagger.internal.g.d(new f(dVar, bVarA.b()));
            this.f132284r = uVarD5;
            u<com.avito.konveyor.adapter.a> uVarD6 = dagger.internal.g.d(new e(dVar, uVarD5));
            this.f132285s = uVarD6;
            this.f132286t = dagger.internal.g.d(new g(dVar, uVarD6, this.f132284r));
        }

        @Override // com.avito.android.das_date_picker.di.b
        public final void a(DasCalendarFragment dasCalendarFragment) {
            dasCalendarFragment.f132227h0 = this.f132280n;
            dasCalendarFragment.f132229j0 = this.f132279m.get();
            L0 l0Z = this.f132267a.z();
            t.c(l0Z);
            dasCalendarFragment.f132230k0 = l0Z;
            dasCalendarFragment.f132231l0 = this.f132284r.get();
            dasCalendarFragment.f132232m0 = this.f132285s.get();
            dasCalendarFragment.f132233n0 = this.f132286t.get();
        }
    }

    /* compiled from: DaggerDasCalendarComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.das_date_picker.di.b.a
        public final com.avito.android.das_date_picker.di.b a(com.avito.android.das_date_picker.di.c cVar, r rVar, DasCalendarInitParameters dasCalendarInitParameters, ActivityC22955m activityC22955m, Y41.l lVar) {
            dasCalendarInitParameters.getClass();
            return new b(new h(), new d(), cVar, rVar, dasCalendarInitParameters, activityC22955m, lVar, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
