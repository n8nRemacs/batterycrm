package com.avito.android.cv_actualization.view.phone_select.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.cv_actualization.view.phone_select.di.b;
import com.avito.android.cv_actualization.view.phone_select.mvi.k;
import com.avito.android.cv_actualization.view.phone_select.ui.JsxCvActualizationPhoneSelectFragment;
import com.avito.android.remote.InterfaceC34401z0;
import dagger.internal.A;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import wt.C49681b;

/* compiled from: DaggerJsxCvActualizationPhoneSelectComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerJsxCvActualizationPhoneSelectComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.cv_actualization.view.phone_select.di.b.a
        public final com.avito.android.cv_actualization.view.phone_select.di.b a(com.avito.android.cv_actualization.view.phone_select.di.c cVar, r rVar, boolean z12) {
            return new c(cVar, rVar, Boolean.valueOf(z12), null);
        }
    }

    /* compiled from: DaggerJsxCvActualizationPhoneSelectComponent.java */
    public static final class c implements com.avito.android.cv_actualization.view.phone_select.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC34401z0> f131304a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.cv_actualization.view.phone_select.mvi.d f131305b;

        /* renamed from: c, reason: collision with root package name */
        public final u<DP.a> f131306c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.cv_actualization.view.phone_select.mvi.b f131307d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28481c> f131308e;

        /* renamed from: f, reason: collision with root package name */
        public final u<C28478k> f131309f;

        /* renamed from: g, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f131310g;

        /* renamed from: h, reason: collision with root package name */
        public final C49681b f131311h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.cv_actualization.view.phone_select.ui.items.add_phone.d> f131312i;

        /* renamed from: j, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f131313j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.cv_actualization.view.phone_select.ui.items.error.d> f131314k;

        /* renamed from: l, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f131315l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.cv_actualization.view.phone_select.ui.items.header.d> f131316m;

        /* renamed from: n, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f131317n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.cv_actualization.view.phone_select.ui.items.loading.d> f131318o;

        /* renamed from: p, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f131319p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.cv_actualization.view.phone_select.ui.items.phone.e> f131320q;

        /* renamed from: r, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f131321r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f131322s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f131323t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f131324u;

        /* compiled from: DaggerJsxCvActualizationPhoneSelectComponent.java */
        /* renamed from: com.avito.android.cv_actualization.view.phone_select.di.a$c$a, reason: collision with other inner class name */
        public static final class C3914a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cv_actualization.view.phone_select.di.c f131325a;

            public C3914a(com.avito.android.cv_actualization.view.phone_select.di.c cVar) {
                this.f131325a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f131325a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerJsxCvActualizationPhoneSelectComponent.java */
        public static final class b implements u<DP.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cv_actualization.view.phone_select.di.c f131326a;

            public b(com.avito.android.cv_actualization.view.phone_select.di.c cVar) {
                this.f131326a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                DP.a aVarU1 = this.f131326a.u1();
                t.c(aVarU1);
                return aVarU1;
            }
        }

        /* compiled from: DaggerJsxCvActualizationPhoneSelectComponent.java */
        /* renamed from: com.avito.android.cv_actualization.view.phone_select.di.a$c$c, reason: collision with other inner class name */
        public static final class C3915c implements u<InterfaceC34401z0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cv_actualization.view.phone_select.di.c f131327a;

            public C3915c(com.avito.android.cv_actualization.view.phone_select.di.c cVar) {
                this.f131327a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34401z0 interfaceC34401z0B = this.f131327a.B();
                t.c(interfaceC34401z0B);
                return interfaceC34401z0B;
            }
        }

        public c(com.avito.android.cv_actualization.view.phone_select.di.c cVar, r rVar, Boolean bool, C3913a c3913a) {
            this.f131304a = new C3915c(cVar);
            this.f131305b = new com.avito.android.cv_actualization.view.phone_select.mvi.d(new com.avito.android.cv_actualization.view.phone_select.domain.phone_loading.d(l.a(bool), this.f131304a));
            this.f131307d = new com.avito.android.cv_actualization.view.phone_select.mvi.b(new com.avito.android.cv_actualization.view.phone_select.domain.phone_update.d(new b(cVar)));
            this.f131308e = new C3914a(cVar);
            u<C28478k> uVarD = dagger.internal.g.d(new g(l.a(rVar)));
            this.f131309f = uVarD;
            this.f131310g = com.avito.android.advert.item.delivery_suggests.l.i(this.f131308e, uVarD);
            this.f131311h = new C49681b(new com.avito.android.cv_actualization.view.phone_select.mvi.g(this.f131305b, k.a(), this.f131307d, com.avito.android.cv_actualization.view.phone_select.mvi.i.a(), this.f131310g));
            u<com.avito.android.cv_actualization.view.phone_select.ui.items.add_phone.d> uVarD2 = dagger.internal.g.d(com.avito.android.cv_actualization.view.phone_select.ui.items.add_phone.g.a());
            this.f131312i = uVarD2;
            this.f131313j = dagger.internal.g.d(new com.avito.android.cv_actualization.view.phone_select.ui.items.add_phone.b(uVarD2));
            u<com.avito.android.cv_actualization.view.phone_select.ui.items.error.d> uVarD3 = dagger.internal.g.d(com.avito.android.cv_actualization.view.phone_select.ui.items.error.f.a());
            this.f131314k = uVarD3;
            this.f131315l = dagger.internal.g.d(new com.avito.android.cv_actualization.view.phone_select.ui.items.error.b(uVarD3));
            u<com.avito.android.cv_actualization.view.phone_select.ui.items.header.d> uVarD4 = dagger.internal.g.d(com.avito.android.cv_actualization.view.phone_select.ui.items.header.f.a());
            this.f131316m = uVarD4;
            this.f131317n = dagger.internal.g.d(new com.avito.android.cv_actualization.view.phone_select.ui.items.header.b(uVarD4));
            u<com.avito.android.cv_actualization.view.phone_select.ui.items.loading.d> uVarD5 = dagger.internal.g.d(com.avito.android.cv_actualization.view.phone_select.ui.items.loading.f.a());
            this.f131318o = uVarD5;
            this.f131319p = dagger.internal.g.d(new com.avito.android.cv_actualization.view.phone_select.ui.items.loading.b(uVarD5));
            u<com.avito.android.cv_actualization.view.phone_select.ui.items.phone.e> uVarD6 = dagger.internal.g.d(com.avito.android.cv_actualization.view.phone_select.ui.items.phone.h.a());
            this.f131320q = uVarD6;
            this.f131321r = dagger.internal.g.d(new com.avito.android.cv_actualization.view.phone_select.ui.items.phone.c(uVarD6));
            A.b bVarA = A.a(5, 0);
            u<TV0.b<?, ?>> uVar = this.f131313j;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f131315l);
            list.add(this.f131317n);
            list.add(this.f131319p);
            list.add(this.f131321r);
            u<com.avito.konveyor.a> uVarD7 = dagger.internal.g.d(new f(bVarA.b()));
            this.f131322s = uVarD7;
            u<com.avito.konveyor.adapter.a> uVarD8 = dagger.internal.g.d(new e(uVarD7));
            this.f131323t = uVarD8;
            this.f131324u = dagger.internal.g.d(new h(uVarD8, this.f131322s));
        }

        @Override // com.avito.android.cv_actualization.view.phone_select.di.b
        public final void a(JsxCvActualizationPhoneSelectFragment jsxCvActualizationPhoneSelectFragment) {
            jsxCvActualizationPhoneSelectFragment.f131375n0 = this.f131311h;
            jsxCvActualizationPhoneSelectFragment.f131376o0 = this.f131324u.get();
            jsxCvActualizationPhoneSelectFragment.f131377p0 = new com.avito.android.cv_actualization.view.phone_select.ui.state.b();
            jsxCvActualizationPhoneSelectFragment.f131378q0 = this.f131312i.get();
            jsxCvActualizationPhoneSelectFragment.f131379r0 = this.f131320q.get();
            jsxCvActualizationPhoneSelectFragment.f131380s0 = this.f131310g.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
