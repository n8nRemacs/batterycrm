package com.avito.android.user_adverts.tab_actions.info.di;

import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.user_adverts.tab_actions.info.UserAdvertsActionResultInfo;
import com.avito.android.user_adverts.tab_actions.info.UserAdvertsActionResultInfoFragment;
import com.avito.android.user_adverts.tab_actions.info.c;
import com.avito.android.user_adverts.tab_actions.info.di.b;
import com.avito.android.user_adverts.tab_actions.info.mvi.i;
import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.l;
import dagger.internal.u;
import xJ0.InterfaceC49850b;

/* compiled from: DaggerUserAdvertsActionResultInfoComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerUserAdvertsActionResultInfoComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.user_adverts.tab_actions.info.di.b.a
        public final com.avito.android.user_adverts.tab_actions.info.di.b a(r rVar, UserAdvertsActionResultInfo userAdvertsActionResultInfo, com.avito.android.user_adverts.tab_actions.info.di.c cVar) {
            userAdvertsActionResultInfo.getClass();
            return new c(cVar, rVar, userAdvertsActionResultInfo, null);
        }
    }

    /* compiled from: DaggerUserAdvertsActionResultInfoComponent.java */
    public static final class c implements com.avito.android.user_adverts.tab_actions.info.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.user_adverts.tab_actions.info.di.c f314636a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC49850b> f314637b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f314638c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f314639d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f314640e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28481c> f314641f;

        /* renamed from: g, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f314642g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC35863o4> f314643h;

        /* renamed from: i, reason: collision with root package name */
        public final i f314644i;

        /* renamed from: j, reason: collision with root package name */
        public final l f314645j;

        /* compiled from: DaggerUserAdvertsActionResultInfoComponent.java */
        /* renamed from: com.avito.android.user_adverts.tab_actions.info.di.a$c$a, reason: collision with other inner class name */
        public static final class C9729a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.tab_actions.info.di.c f314646a;

            public C9729a(com.avito.android.user_adverts.tab_actions.info.di.c cVar) {
                this.f314646a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f314646a.e();
            }
        }

        /* compiled from: DaggerUserAdvertsActionResultInfoComponent.java */
        public static final class b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.tab_actions.info.di.c f314647a;

            public b(com.avito.android.user_adverts.tab_actions.info.di.c cVar) {
                this.f314647a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f314647a.f();
            }
        }

        /* compiled from: DaggerUserAdvertsActionResultInfoComponent.java */
        /* renamed from: com.avito.android.user_adverts.tab_actions.info.di.a$c$c, reason: collision with other inner class name */
        public static final class C9730c implements u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.tab_actions.info.di.c f314648a;

            public C9730c(com.avito.android.user_adverts.tab_actions.info.di.c cVar) {
                this.f314648a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f314648a.m();
            }
        }

        /* compiled from: DaggerUserAdvertsActionResultInfoComponent.java */
        public static final class d implements u<InterfaceC49850b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.tab_actions.info.di.c f314649a;

            public d(com.avito.android.user_adverts.tab_actions.info.di.c cVar) {
                this.f314649a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f314649a.x1();
            }
        }

        public c(com.avito.android.user_adverts.tab_actions.info.di.c cVar, r rVar, UserAdvertsActionResultInfo userAdvertsActionResultInfo, C9728a c9728a) {
            this.f314636a = cVar;
            this.f314637b = new d(cVar);
            this.f314638c = new C9729a(cVar);
            com.avito.android.user_adverts.tab_actions.info.items.block.f fVarA = com.avito.android.user_adverts.tab_actions.info.items.block.f.a();
            u<com.avito.android.util.text.a> uVar = this.f314638c;
            u<com.avito.konveyor.a> uVarD = dagger.internal.g.d(new f(this.f314637b, uVar, new com.avito.android.user_adverts.tab_actions.info.items.block.c(fVarA, uVar)));
            this.f314639d = uVarD;
            this.f314640e = dagger.internal.g.d(new e(uVarD));
            this.f314641f = new b(cVar);
            this.f314642g = dagger.internal.g.d(new g(l.a(rVar), this.f314641f));
            l lVarA = l.a(userAdvertsActionResultInfo);
            this.f314644i = new i(new C9730c(cVar));
            this.f314645j = l.a(new com.avito.android.user_adverts.tab_actions.info.e(new com.avito.android.user_adverts.tab_actions.info.d(new com.avito.android.user_adverts.tab_actions.info.mvi.g(lVarA, com.avito.android.user_adverts.tab_actions.info.mvi.d.a(), this.f314644i, this.f314642g))));
        }

        @Override // com.avito.android.user_adverts.tab_actions.info.di.b
        public final void a(UserAdvertsActionResultInfoFragment userAdvertsActionResultInfoFragment) {
            userAdvertsActionResultInfoFragment.f314613h0 = this.f314640e.get();
            userAdvertsActionResultInfoFragment.f314614i0 = this.f314636a.m();
            userAdvertsActionResultInfoFragment.f314615j0 = new ZI0.a(this.f314639d.get());
            userAdvertsActionResultInfoFragment.f314616k0 = this.f314642g.get();
            userAdvertsActionResultInfoFragment.f314617l0 = (c.a) this.f314645j.f393949a;
        }
    }

    public static b.a a() {
        return new b();
    }
}
