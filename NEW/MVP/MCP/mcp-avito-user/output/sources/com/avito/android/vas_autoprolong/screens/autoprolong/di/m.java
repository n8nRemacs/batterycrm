package com.avito.android.vas_autoprolong.screens.autoprolong.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.R0;
import com.avito.android.vas_autoprolong.screens.autoprolong.AutoprolongFragment;
import com.avito.android.vas_autoprolong.screens.autoprolong.di.b;
import com.avito.android.vas_autoprolong.screens.autoprolong.mvi.n;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import eL0.InterfaceC40020a;
import fL0.InterfaceC40310a;

/* compiled from: DaggerAutoprolongComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class m {

    /* compiled from: DaggerAutoprolongComponent.java */
    public static final class b implements com.avito.android.vas_autoprolong.screens.autoprolong.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f319487a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.l f319488b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC40310a> f319489c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f319490d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC40020a> f319491e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.vas_autoprolong.screens.autoprolong.domain.a> f319492f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.vas_autoprolong.screens.autoprolong.mvi.f f319493g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.vas_autoprolong.screens.autoprolong.mvi.d f319494h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f319495i;

        /* renamed from: j, reason: collision with root package name */
        public final u<C28478k> f319496j;

        /* renamed from: k, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f319497k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.vas_autoprolong.screens.autoprolong.j f319498l;

        /* compiled from: DaggerAutoprolongComponent.java */
        public static final class a implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final e f319499a;

            public a(e eVar) {
                this.f319499a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f319499a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerAutoprolongComponent.java */
        /* renamed from: com.avito.android.vas_autoprolong.screens.autoprolong.di.m$b$b, reason: collision with other inner class name */
        public static final class C9899b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final e f319500a;

            public C9899b(e eVar) {
                this.f319500a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f319500a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerAutoprolongComponent.java */
        public static final class c implements u<InterfaceC40020a> {

            /* renamed from: a, reason: collision with root package name */
            public final e f319501a;

            public c(e eVar) {
                this.f319501a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f319501a.s7();
            }
        }

        /* compiled from: DaggerAutoprolongComponent.java */
        public static final class d implements u<InterfaceC40310a> {

            /* renamed from: a, reason: collision with root package name */
            public final e f319502a;

            public d(e eVar) {
                this.f319502a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC40310a interfaceC40310aVk = this.f319502a.Vk();
                t.c(interfaceC40310aVk);
                return interfaceC40310aVk;
            }
        }

        public b(e eVar, cv.b bVar, r rVar, Long l12, String str, a aVar) {
            this.f319487a = bVar;
            this.f319488b = dagger.internal.l.a(l12);
            u<com.avito.android.vas_autoprolong.screens.autoprolong.domain.a> uVarD = dagger.internal.g.d(new com.avito.android.vas_autoprolong.screens.autoprolong.domain.c(this.f319488b, dagger.internal.l.a(str), new d(eVar), new a(eVar), new c(eVar)));
            this.f319492f = uVarD;
            this.f319493g = new com.avito.android.vas_autoprolong.screens.autoprolong.mvi.f(uVarD);
            this.f319494h = new com.avito.android.vas_autoprolong.screens.autoprolong.mvi.d(uVarD);
            this.f319495i = new C9899b(eVar);
            u<C28478k> uVarD2 = dagger.internal.g.d(new j(dagger.internal.l.a(rVar)));
            this.f319496j = uVarD2;
            this.f319497k = com.avito.android.advert.item.delivery_suggests.l.i(this.f319495i, uVarD2);
            this.f319498l = new com.avito.android.vas_autoprolong.screens.autoprolong.j(new com.avito.android.vas_autoprolong.screens.autoprolong.mvi.i(this.f319493g, this.f319494h, com.avito.android.vas_autoprolong.screens.autoprolong.mvi.k.a(), n.a(), this.f319497k));
        }

        @Override // com.avito.android.vas_autoprolong.screens.autoprolong.di.b
        public final void a(AutoprolongFragment autoprolongFragment) {
            autoprolongFragment.f319457n0 = this.f319498l;
            autoprolongFragment.f319458o0 = this.f319497k.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f319487a.u4();
            t.c(aVarU4);
            autoprolongFragment.f319459p0 = aVarU4;
        }
    }

    /* compiled from: DaggerAutoprolongComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.vas_autoprolong.screens.autoprolong.di.b.a
        public final com.avito.android.vas_autoprolong.screens.autoprolong.di.b a(e eVar, InterfaceC39417a interfaceC39417a, r rVar, long j12, String str) {
            interfaceC39417a.getClass();
            return new b(eVar, interfaceC39417a, rVar, Long.valueOf(j12), str, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
