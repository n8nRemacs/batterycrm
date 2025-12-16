package com.avito.android.str_seller_orders.orders.di;

import androidx.fragment.app.Fragment;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.str_seller_orders.orders.StrOrdersFragment;
import com.avito.android.str_seller_orders.orders.StrOrdersOpenParams;
import com.avito.android.str_seller_orders.orders.di.b;
import com.avito.android.str_seller_orders.orders.mvi.h;
import com.avito.android.str_seller_orders.orders.mvi.j;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import kz0.C43520a;
import lE.C43624b;

/* compiled from: DaggerStrOrdersFragmentComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerStrOrdersFragmentComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.str_seller_orders.orders.di.b.a
        public final com.avito.android.str_seller_orders.orders.di.b a(cz0.e eVar, InterfaceC39417a interfaceC39417a, r rVar, StrOrdersFragment strOrdersFragment, StrOrdersOpenParams strOrdersOpenParams) {
            interfaceC39417a.getClass();
            return new c(eVar, interfaceC39417a, rVar, strOrdersFragment, strOrdersOpenParams, null);
        }
    }

    /* compiled from: DaggerStrOrdersFragmentComponent.java */
    public static final class c implements com.avito.android.str_seller_orders.orders.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final l f288846a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.str_seller_orders.orders.mvi.e f288847b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28373a> f288848c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.str_seller_orders.orders.mvi.c f288849d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28481c> f288850e;

        /* renamed from: f, reason: collision with root package name */
        public final u<C28478k> f288851f;

        /* renamed from: g, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f288852g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.str_seller_orders.orders.c f288853h;

        /* renamed from: i, reason: collision with root package name */
        public final u<C43624b> f288854i;

        /* renamed from: j, reason: collision with root package name */
        public final u<C43520a> f288855j;

        /* compiled from: DaggerStrOrdersFragmentComponent.java */
        /* renamed from: com.avito.android.str_seller_orders.orders.di.a$c$a, reason: collision with other inner class name */
        public static final class C8692a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f288856a;

            public C8692a(cz0.e eVar) {
                this.f288856a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f288856a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerStrOrdersFragmentComponent.java */
        public static final class b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f288857a;

            public b(cz0.e eVar) {
                this.f288857a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f288857a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerStrOrdersFragmentComponent.java */
        /* renamed from: com.avito.android.str_seller_orders.orders.di.a$c$c, reason: collision with other inner class name */
        public static final class C8693c implements u<C43624b> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f288858a;

            public C8693c(cz0.e eVar) {
                this.f288858a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f288858a.J();
            }
        }

        public c(cz0.e eVar, cv.b bVar, r rVar, Fragment fragment, StrOrdersOpenParams strOrdersOpenParams, C8691a c8691a) {
            l lVarA = l.a(strOrdersOpenParams);
            this.f288846a = lVarA;
            this.f288847b = new com.avito.android.str_seller_orders.orders.mvi.e(lVarA);
            this.f288849d = new com.avito.android.str_seller_orders.orders.mvi.c(new C8692a(eVar));
            this.f288850e = new b(eVar);
            u<C28478k> uVarD = dagger.internal.g.d(new e(l.a(rVar)));
            this.f288851f = uVarD;
            this.f288852g = dagger.internal.g.d(new f(uVarD, this.f288850e));
            this.f288853h = new com.avito.android.str_seller_orders.orders.c(new h(this.f288847b, this.f288849d, j.a(), com.avito.android.str_seller_orders.orders.mvi.l.a(), this.f288852g));
            this.f288855j = dagger.internal.g.d(new g(l.a(fragment), this.f288846a, new C8693c(eVar)));
        }

        @Override // com.avito.android.str_seller_orders.orders.di.b
        public final void a(StrOrdersFragment strOrdersFragment) {
            strOrdersFragment.f288824n0 = this.f288853h;
            strOrdersFragment.f288826p0 = this.f288852g.get();
            strOrdersFragment.f288827q0 = this.f288855j.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
