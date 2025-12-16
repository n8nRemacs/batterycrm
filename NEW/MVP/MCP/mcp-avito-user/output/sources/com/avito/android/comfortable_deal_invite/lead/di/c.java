package com.avito.android.comfortable_deal_invite.lead.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.comfortable_deal_invite.lead.ComfortableDealInviteFragment;
import com.avito.android.comfortable_deal_invite.lead.V;
import com.avito.android.comfortable_deal_invite.lead.di.a;
import com.avito.android.comfortable_deal_invite.lead.mvi.h;
import com.avito.android.comfortable_deal_invite.lead.mvi.k;
import com.avito.android.comfortable_deal_invite.lead.mvi.m;
import com.avito.android.comfortable_deal_invite.lead.mvi.o;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import wq.InterfaceC49671c;
import xq.InterfaceC49982a;

/* compiled from: DaggerComfortableDealInviteComponent.java */
@e
/* loaded from: classes12.dex */
public final class c {

    /* compiled from: DaggerComfortableDealInviteComponent.java */
    public static final class b implements com.avito.android.comfortable_deal_invite.lead.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f123634a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28481c> f123635b;

        /* renamed from: c, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f123636c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC49982a> f123637d;

        /* renamed from: e, reason: collision with root package name */
        public final u<R0> f123638e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.comfortable_deal_invite.lead.interactor.a> f123639f;

        /* renamed from: g, reason: collision with root package name */
        public final h f123640g;

        /* renamed from: h, reason: collision with root package name */
        public final V f123641h;

        /* compiled from: DaggerComfortableDealInviteComponent.java */
        public static final class a implements u<InterfaceC49982a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC49671c f123642a;

            public a(InterfaceC49671c interfaceC49671c) {
                this.f123642a = interfaceC49671c;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC49982a interfaceC49982aXe = this.f123642a.Xe();
                t.c(interfaceC49982aXe);
                return interfaceC49982aXe;
            }
        }

        /* compiled from: DaggerComfortableDealInviteComponent.java */
        /* renamed from: com.avito.android.comfortable_deal_invite.lead.di.c$b$b, reason: collision with other inner class name */
        public static final class C3694b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC49671c f123643a;

            public C3694b(InterfaceC49671c interfaceC49671c) {
                this.f123643a = interfaceC49671c;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f123643a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerComfortableDealInviteComponent.java */
        /* renamed from: com.avito.android.comfortable_deal_invite.lead.di.c$b$c, reason: collision with other inner class name */
        public static final class C3695c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC49671c f123644a;

            public C3695c(InterfaceC49671c interfaceC49671c) {
                this.f123644a = interfaceC49671c;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f123644a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(InterfaceC49671c interfaceC49671c, cv.b bVar, C28478k c28478k, a aVar) {
            this.f123634a = bVar;
            this.f123635b = new C3695c(interfaceC49671c);
            this.f123636c = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f123635b);
            u<com.avito.android.comfortable_deal_invite.lead.interactor.a> uVarA = B.a(new com.avito.android.comfortable_deal_invite.lead.interactor.c(new a(interfaceC49671c), new C3694b(interfaceC49671c)));
            this.f123639f = uVarA;
            this.f123640g = new h(uVarA);
            this.f123641h = new V(new k(o.a(), this.f123640g, m.a(), this.f123636c));
        }

        @Override // com.avito.android.comfortable_deal_invite.lead.di.a
        public final void a(ComfortableDealInviteFragment comfortableDealInviteFragment) {
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f123634a.u4();
            t.c(aVarU4);
            comfortableDealInviteFragment.f123524n0 = aVarU4;
            comfortableDealInviteFragment.f123525o0 = this.f123636c.get();
            comfortableDealInviteFragment.f123527q0 = this.f123641h;
        }
    }

    /* compiled from: DaggerComfortableDealInviteComponent.java */
    /* renamed from: com.avito.android.comfortable_deal_invite.lead.di.c$c, reason: collision with other inner class name */
    public static final class C3696c implements a.InterfaceC3693a {
        public C3696c() {
        }

        @Override // com.avito.android.comfortable_deal_invite.lead.di.a.InterfaceC3693a
        public final com.avito.android.comfortable_deal_invite.lead.di.a a(InterfaceC49671c interfaceC49671c, InterfaceC39417a interfaceC39417a, C28478k c28478k) {
            interfaceC39417a.getClass();
            return new b(interfaceC49671c, interfaceC39417a, c28478k, null);
        }
    }

    public static a.InterfaceC3693a a() {
        return new C3696c();
    }
}
