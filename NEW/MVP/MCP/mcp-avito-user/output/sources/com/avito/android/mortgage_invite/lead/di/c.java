package com.avito.android.mortgage_invite.lead.di;

import c20.InterfaceC26928e;
import com.avito.android.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage_invite.lead.ApplicationLeadFragment;
import com.avito.android.mortgage_invite.lead.di.a;
import com.avito.android.mortgage_invite.lead.model.ApplicationLeadArguments;
import com.avito.android.mortgage_invite.lead.mvi.h;
import com.avito.android.mortgage_invite.lead.mvi.j;
import com.avito.android.mortgage_invite.lead.z;
import cv.InterfaceC39417a;
import d20.C39487a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import q20.InterfaceC47188b;

/* compiled from: DaggerApplicationLeadComponent.java */
@e
/* loaded from: classes15.dex */
public final class c {

    /* compiled from: DaggerApplicationLeadComponent.java */
    public static final class b implements com.avito.android.mortgage_invite.lead.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f205859a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC26928e f205860b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28481c> f205861c;

        /* renamed from: d, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f205862d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28373a> f205863e;

        /* renamed from: f, reason: collision with root package name */
        public final u<P> f205864f;

        /* renamed from: g, reason: collision with root package name */
        public final u<C39487a> f205865g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.mortgage_invite.lead.mvi.c f205866h;

        /* renamed from: i, reason: collision with root package name */
        public final z f205867i;

        /* compiled from: DaggerApplicationLeadComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC26928e f205868a;

            public a(InterfaceC26928e interfaceC26928e) {
                this.f205868a = interfaceC26928e;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f205868a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerApplicationLeadComponent.java */
        /* renamed from: com.avito.android.mortgage_invite.lead.di.c$b$b, reason: collision with other inner class name */
        public static final class C6134b implements u<P> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC26928e f205869a;

            public C6134b(InterfaceC26928e interfaceC26928e) {
                this.f205869a = interfaceC26928e;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f205869a.E();
            }
        }

        /* compiled from: DaggerApplicationLeadComponent.java */
        /* renamed from: com.avito.android.mortgage_invite.lead.di.c$b$c, reason: collision with other inner class name */
        public static final class C6135c implements u<C39487a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC26928e f205870a;

            public C6135c(InterfaceC26928e interfaceC26928e) {
                this.f205870a = interfaceC26928e;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f205870a.M2();
            }
        }

        /* compiled from: DaggerApplicationLeadComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC26928e f205871a;

            public d(InterfaceC26928e interfaceC26928e) {
                this.f205871a = interfaceC26928e;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f205871a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(InterfaceC26928e interfaceC26928e, cv.b bVar, ApplicationLeadArguments applicationLeadArguments, C28478k c28478k, a aVar) {
            this.f205859a = bVar;
            this.f205860b = interfaceC26928e;
            this.f205861c = new d(interfaceC26928e);
            this.f205862d = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f205861c);
            l lVarA = l.a(applicationLeadArguments);
            m20.d dVar = new m20.d(new a(interfaceC26928e));
            com.avito.android.mortgage_invite.lead.mvi.e eVar = new com.avito.android.mortgage_invite.lead.mvi.e(dVar, lVarA);
            this.f205866h = new com.avito.android.mortgage_invite.lead.mvi.c(new C6134b(interfaceC26928e), new C6135c(interfaceC26928e), dVar);
            this.f205867i = new z(new h(lVarA, eVar, com.avito.android.mortgage_invite.lead.mvi.l.a(), this.f205866h, j.a(), this.f205862d));
        }

        @Override // com.avito.android.mortgage_invite.lead.di.a
        public final void a(ApplicationLeadFragment applicationLeadFragment) {
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f205859a.u4();
            t.c(aVarU4);
            applicationLeadFragment.f205842n0 = aVarU4;
            InterfaceC47188b interfaceC47188bE4 = this.f205860b.e4();
            t.c(interfaceC47188bE4);
            applicationLeadFragment.f205843o0 = interfaceC47188bE4;
            applicationLeadFragment.f205844p0 = this.f205862d.get();
            applicationLeadFragment.f205846r0 = this.f205867i;
        }
    }

    /* compiled from: DaggerApplicationLeadComponent.java */
    /* renamed from: com.avito.android.mortgage_invite.lead.di.c$c, reason: collision with other inner class name */
    public static final class C6136c implements a.InterfaceC6133a {
        public C6136c() {
        }

        @Override // com.avito.android.mortgage_invite.lead.di.a.InterfaceC6133a
        public final com.avito.android.mortgage_invite.lead.di.a a(InterfaceC26928e interfaceC26928e, InterfaceC39417a interfaceC39417a, ApplicationLeadArguments applicationLeadArguments, C28478k c28478k) {
            interfaceC39417a.getClass();
            return new b(interfaceC26928e, interfaceC39417a, applicationLeadArguments, c28478k, null);
        }
    }

    public static a.InterfaceC6133a a() {
        return new C6136c();
    }
}
