package com.avito.android.comfortable_deal.phone_call.di;

import Jp.InterfaceC14233a;
import Y41.l;
import com.avito.android.P;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.comfortable_deal.phone_call.PhoneCallDialog;
import com.avito.android.comfortable_deal.phone_call.di.b;
import com.avito.android.comfortable_deal.phone_call.di.c;
import com.avito.android.comfortable_deal.phone_call.h;
import com.avito.android.comfortable_deal.phone_call.model.PhoneCallArguments;
import com.avito.android.comfortable_deal.phone_call.mvi.i;
import com.avito.android.comfortable_deal.phone_call.mvi.k;
import com.avito.android.comfortable_deal.phone_call.mvi.m;
import com.avito.android.util.R0;
import cp.InterfaceC39387a;
import cv.InterfaceC39417a;
import d20.C39487a;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerPhoneCallComponent.java */
@e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerPhoneCallComponent.java */
    public static final class b implements b.InterfaceC3627b {
        public b() {
        }

        @Override // com.avito.android.comfortable_deal.phone_call.di.b.InterfaceC3627b
        public final com.avito.android.comfortable_deal.phone_call.di.b a(InterfaceC39417a interfaceC39417a, d dVar, C28478k c28478k, PhoneCallArguments phoneCallArguments, l lVar) {
            interfaceC39417a.getClass();
            return new c(dVar, interfaceC39417a, c28478k, phoneCallArguments, lVar, null);
        }
    }

    /* compiled from: DaggerPhoneCallComponent.java */
    public static final class c implements com.avito.android.comfortable_deal.phone_call.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f122449a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC39387a> f122450b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f122451c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC14233a> f122452d;

        /* renamed from: e, reason: collision with root package name */
        public final u<AK0.l> f122453e;

        /* renamed from: f, reason: collision with root package name */
        public final u<P> f122454f;

        /* renamed from: g, reason: collision with root package name */
        public final u<C39487a> f122455g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.comfortable_deal.repository.l f122456h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.l f122457i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.comfortable_deal.phone_call.mvi.f f122458j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.comfortable_deal.phone_call.mvi.d f122459k;

        /* renamed from: l, reason: collision with root package name */
        public final m f122460l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC28481c> f122461m;

        /* renamed from: n, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f122462n;

        /* renamed from: o, reason: collision with root package name */
        public final h f122463o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.comfortable_deal.phone_call.b> f122464p;

        /* compiled from: DaggerPhoneCallComponent.java */
        /* renamed from: com.avito.android.comfortable_deal.phone_call.di.a$c$a, reason: collision with other inner class name */
        public static final class C3624a implements u<InterfaceC14233a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.phone_call.di.d f122465a;

            public C3624a(com.avito.android.comfortable_deal.phone_call.di.d dVar) {
                this.f122465a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14233a interfaceC14233aV8 = this.f122465a.v8();
                t.c(interfaceC14233aV8);
                return interfaceC14233aV8;
            }
        }

        /* compiled from: DaggerPhoneCallComponent.java */
        public static final class b implements u<InterfaceC39387a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.phone_call.di.d f122466a;

            public b(com.avito.android.comfortable_deal.phone_call.di.d dVar) {
                this.f122466a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC39387a interfaceC39387aQ2 = this.f122466a.Q2();
                t.c(interfaceC39387aQ2);
                return interfaceC39387aQ2;
            }
        }

        /* compiled from: DaggerPhoneCallComponent.java */
        /* renamed from: com.avito.android.comfortable_deal.phone_call.di.a$c$c, reason: collision with other inner class name */
        public static final class C3625c implements u<P> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.phone_call.di.d f122467a;

            public C3625c(com.avito.android.comfortable_deal.phone_call.di.d dVar) {
                this.f122467a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f122467a.E();
            }
        }

        /* compiled from: DaggerPhoneCallComponent.java */
        public static final class d implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.phone_call.di.d f122468a;

            public d(com.avito.android.comfortable_deal.phone_call.di.d dVar) {
                this.f122468a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f122468a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerPhoneCallComponent.java */
        public static final class e implements u<C39487a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.phone_call.di.d f122469a;

            public e(com.avito.android.comfortable_deal.phone_call.di.d dVar) {
                this.f122469a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f122469a.M2();
            }
        }

        /* compiled from: DaggerPhoneCallComponent.java */
        public static final class f implements u<AK0.l> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.phone_call.di.d f122470a;

            public f(com.avito.android.comfortable_deal.phone_call.di.d dVar) {
                this.f122470a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f122470a.r();
            }
        }

        /* compiled from: DaggerPhoneCallComponent.java */
        public static final class g implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.phone_call.di.d f122471a;

            public g(com.avito.android.comfortable_deal.phone_call.di.d dVar) {
                this.f122471a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f122471a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.comfortable_deal.phone_call.di.d dVar, cv.b bVar, C28478k c28478k, PhoneCallArguments phoneCallArguments, l lVar, C3623a c3623a) {
            this.f122449a = bVar;
            this.f122456h = new com.avito.android.comfortable_deal.repository.l(new f(dVar), new C3625c(dVar), new e(dVar), new b(dVar), new d(dVar), new C3624a(dVar));
            dagger.internal.l lVarA = dagger.internal.l.a(phoneCallArguments);
            this.f122457i = lVarA;
            com.avito.android.comfortable_deal.repository.l lVar2 = this.f122456h;
            this.f122458j = new com.avito.android.comfortable_deal.phone_call.mvi.f(lVar2, lVarA);
            this.f122459k = new com.avito.android.comfortable_deal.phone_call.mvi.d(lVar2);
            this.f122460l = new m(com.avito.android.comfortable_deal.phone_call.mvi.builder.c.a(), c.a.f122474a);
            this.f122461m = new g(dVar);
            this.f122462n = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f122461m);
            this.f122463o = new h(new i(this.f122458j, this.f122459k, this.f122460l, k.a(), this.f122462n, this.f122457i));
            this.f122464p = dagger.internal.g.d(new com.avito.android.comfortable_deal.phone_call.e(dagger.internal.l.a(lVar)));
        }

        @Override // com.avito.android.comfortable_deal.phone_call.di.b
        public final void a(PhoneCallDialog phoneCallDialog) {
            phoneCallDialog.f122415h0 = this.f122463o;
            phoneCallDialog.f122417j0 = this.f122462n.get();
            phoneCallDialog.f122418k0 = this.f122464p.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f122449a.u4();
            t.c(aVarU4);
            phoneCallDialog.f122419l0 = aVarU4;
        }
    }

    public static b.InterfaceC3627b a() {
        return new b();
    }
}
