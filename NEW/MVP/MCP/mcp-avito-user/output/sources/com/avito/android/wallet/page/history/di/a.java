package com.avito.android.wallet.page.history.di;

import aP0.InterfaceC19802a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.wallet.page.history.di.b;
import com.avito.android.wallet.page.history.mvi.PaymentHistoryFragment;
import com.avito.android.wallet.page.history.mvi.component.g;
import com.avito.android.wallet.page.history.mvi.component.j;
import com.avito.android.wallet.page.history.mvi.component.n;
import com.avito.android.wallet.page.history.mvi.component.p;
import com.avito.android.wallet.page.history.mvi.component.r;
import com.avito.android.wallet.page.history.mvi.component.t;
import com.avito.android.wallet.page.history.mvi.f;
import dagger.internal.l;
import dagger.internal.u;

/* compiled from: DaggerPaymentHistoryComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerPaymentHistoryComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.wallet.page.history.di.b.a
        public final com.avito.android.wallet.page.history.di.b a(com.avito.android.wallet.page.di.component.e eVar, String str, C28478k c28478k) {
            return new c(eVar, str, c28478k, null);
        }
    }

    /* compiled from: DaggerPaymentHistoryComponent.java */
    public static final class c implements com.avito.android.wallet.page.history.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC19802a> f327970a;

        /* renamed from: b, reason: collision with root package name */
        public final g f327971b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.wallet.page.c> f327972c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28373a> f327973d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.wallet.page.history.mvi.component.e f327974e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.wallet.page.feature.a> f327975f;

        /* renamed from: g, reason: collision with root package name */
        public final t f327976g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28481c> f327977h;

        /* renamed from: i, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f327978i;

        /* renamed from: j, reason: collision with root package name */
        public final f f327979j;

        /* compiled from: DaggerPaymentHistoryComponent.java */
        /* renamed from: com.avito.android.wallet.page.history.di.a$c$a, reason: collision with other inner class name */
        public static final class C10170a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.page.di.component.e f327980a;

            public C10170a(com.avito.android.wallet.page.di.component.e eVar) {
                this.f327980a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f327980a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerPaymentHistoryComponent.java */
        public static final class b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.page.di.component.e f327981a;

            public b(com.avito.android.wallet.page.di.component.e eVar) {
                this.f327981a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f327981a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerPaymentHistoryComponent.java */
        /* renamed from: com.avito.android.wallet.page.history.di.a$c$c, reason: collision with other inner class name */
        public static final class C10171c implements u<InterfaceC19802a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.page.di.component.e f327982a;

            public C10171c(com.avito.android.wallet.page.di.component.e eVar) {
                this.f327982a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC19802a interfaceC19802aMg = this.f327982a.mg();
                dagger.internal.t.c(interfaceC19802aMg);
                return interfaceC19802aMg;
            }
        }

        /* compiled from: DaggerPaymentHistoryComponent.java */
        public static final class d implements u<com.avito.android.wallet.page.c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.page.di.component.e f327983a;

            public d(com.avito.android.wallet.page.di.component.e eVar) {
                this.f327983a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f327983a.l3();
            }
        }

        /* compiled from: DaggerPaymentHistoryComponent.java */
        public static final class e implements u<com.avito.android.wallet.page.feature.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.page.di.component.e f327984a;

            public e(com.avito.android.wallet.page.di.component.e eVar) {
                this.f327984a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f327984a.Te();
            }
        }

        public c(com.avito.android.wallet.page.di.component.e eVar, String str, C28478k c28478k, C10169a c10169a) {
            this.f327970a = new C10171c(eVar);
            l lVarA = l.a(str);
            n nVar = new n(lVarA, this.f327970a);
            this.f327971b = new g(nVar);
            this.f327974e = new com.avito.android.wallet.page.history.mvi.component.e(nVar, new d(eVar), new C10170a(eVar));
            this.f327976g = new t(new p(lVarA, new e(eVar)));
            this.f327977h = new b(eVar);
            this.f327978i = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f327977h);
            this.f327979j = new f(new j(this.f327971b, this.f327974e, r.a(), this.f327976g, this.f327978i));
        }

        @Override // com.avito.android.wallet.page.history.di.b
        public final void a(PaymentHistoryFragment paymentHistoryFragment) {
            paymentHistoryFragment.f327988n0 = this.f327979j;
            paymentHistoryFragment.f327990p0 = this.f327978i.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
