package com.avito.android.cpx_promo.priceinput.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.cpx_promo.priceinput.CpxPromoPriceInputContent;
import com.avito.android.cpx_promo.priceinput.CpxPromoPriceInputFragment;
import com.avito.android.cpx_promo.priceinput.di.a;
import com.avito.android.cpx_promo.priceinput.m;
import com.avito.android.cpx_promo.priceinput.mvi.g;
import com.avito.android.cpx_promo.priceinput.mvi.i;
import com.avito.android.cpx_promo.priceinput.mvi.k;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerCpxPromoPriceInputComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class f {

    /* compiled from: DaggerCpxPromoPriceInputComponent.java */
    public static final class b implements com.avito.android.cpx_promo.priceinput.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC28373a> f127308a;

        /* renamed from: b, reason: collision with root package name */
        public final m f127309b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28481c> f127310c;

        /* renamed from: d, reason: collision with root package name */
        public final u<C28478k> f127311d;

        /* renamed from: e, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f127312e;

        /* compiled from: DaggerCpxPromoPriceInputComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cpx_promo.impl.di.d f127313a;

            public a(com.avito.android.cpx_promo.impl.di.d dVar) {
                this.f127313a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f127313a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerCpxPromoPriceInputComponent.java */
        /* renamed from: com.avito.android.cpx_promo.priceinput.di.f$b$b, reason: collision with other inner class name */
        public static final class C3788b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cpx_promo.impl.di.d f127314a;

            public C3788b(com.avito.android.cpx_promo.impl.di.d dVar) {
                this.f127314a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f127314a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(d dVar, com.avito.android.cpx_promo.impl.di.d dVar2, cv.b bVar, r rVar, CpxPromoPriceInputContent cpxPromoPriceInputContent, a aVar) {
            l lVarA = l.a(cpxPromoPriceInputContent);
            this.f127309b = new m(new g(new com.avito.android.cpx_promo.priceinput.mvi.d(lVarA, new a(dVar2)), new com.avito.android.cpx_promo.priceinput.mvi.b(lVarA), i.a(), k.a()));
            this.f127310c = new C3788b(dVar2);
            u<C28478k> uVarD = dagger.internal.g.d(new e(dVar, l.a(rVar)));
            this.f127311d = uVarD;
            this.f127312e = com.avito.android.advert.item.delivery_suggests.l.i(this.f127310c, uVarD);
        }

        @Override // com.avito.android.cpx_promo.priceinput.di.a
        public final void a(CpxPromoPriceInputFragment cpxPromoPriceInputFragment) {
            cpxPromoPriceInputFragment.f127272h0 = this.f127309b;
            cpxPromoPriceInputFragment.f127274j0 = this.f127312e.get();
        }
    }

    /* compiled from: DaggerCpxPromoPriceInputComponent.java */
    public static final class c implements a.InterfaceC3787a {
        public c() {
        }

        @Override // com.avito.android.cpx_promo.priceinput.di.a.InterfaceC3787a
        public final com.avito.android.cpx_promo.priceinput.di.a a(com.avito.android.cpx_promo.impl.di.d dVar, InterfaceC39417a interfaceC39417a, r rVar, CpxPromoPriceInputContent cpxPromoPriceInputContent) {
            interfaceC39417a.getClass();
            return new b(new d(), dVar, interfaceC39417a, rVar, cpxPromoPriceInputContent, null);
        }
    }

    public static a.InterfaceC3787a a() {
        return new c();
    }
}
