package com.avito.android.referral_contacts.di;

import AK0.l;
import Si0.InterfaceC15188a;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.x;
import com.avito.android.referral_contacts.di.b;
import com.avito.android.referral_contacts.j;
import com.avito.android.referral_contacts.mvi.n;
import com.avito.android.referral_contacts.mvi.p;
import com.avito.android.referral_contacts.mvi.r;
import com.avito.android.referral_contacts.ui.ReferralContactsActivity;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerReferralContactsComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerReferralContactsComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.referral_contacts.di.b.a
        public final com.avito.android.referral_contacts.di.b a(Resources resources, com.avito.android.referral_contacts.di.c cVar, InterfaceC39417a interfaceC39417a, C28478k c28478k) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, resources, c28478k, null);
        }
    }

    /* compiled from: DaggerReferralContactsComponent.java */
    public static final class c implements com.avito.android.referral_contacts.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f252412a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.referral_contacts.h> f252413b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.referral_contacts.g f252414c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC15188a> f252415d;

        /* renamed from: e, reason: collision with root package name */
        public final u<Application> f252416e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.referral_contacts.domain.d f252417f;

        /* renamed from: g, reason: collision with root package name */
        public final u<x> f252418g;

        /* renamed from: h, reason: collision with root package name */
        public final u<l> f252419h;

        /* renamed from: i, reason: collision with root package name */
        public final u<Context> f252420i;

        /* renamed from: j, reason: collision with root package name */
        public final u<R0> f252421j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.referral_contacts.storage.a> f252422k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC28373a> f252423l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.referral_contacts.mvi.g f252424m;

        /* renamed from: n, reason: collision with root package name */
        public final com.avito.android.referral_contacts.mvi.i f252425n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC28481c> f252426o;

        /* renamed from: p, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f252427p;

        /* renamed from: q, reason: collision with root package name */
        public final r f252428q;

        /* renamed from: r, reason: collision with root package name */
        public final com.avito.android.referral_contacts.di.e f252429r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f252430s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f252431t;

        /* compiled from: DaggerReferralContactsComponent.java */
        /* renamed from: com.avito.android.referral_contacts.di.a$c$a, reason: collision with other inner class name */
        public static final class C7578a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.referral_contacts.di.c f252432a;

            public C7578a(com.avito.android.referral_contacts.di.c cVar) {
                this.f252432a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f252432a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerReferralContactsComponent.java */
        public static final class b implements u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.referral_contacts.di.c f252433a;

            public b(com.avito.android.referral_contacts.di.c cVar) {
                this.f252433a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationGd = this.f252433a.gd();
                t.c(applicationGd);
                return applicationGd;
            }
        }

        /* compiled from: DaggerReferralContactsComponent.java */
        /* renamed from: com.avito.android.referral_contacts.di.a$c$c, reason: collision with other inner class name */
        public static final class C7579c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.referral_contacts.di.c f252434a;

            public C7579c(com.avito.android.referral_contacts.di.c cVar) {
                this.f252434a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f252434a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerReferralContactsComponent.java */
        public static final class d implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.referral_contacts.di.c f252435a;

            public d(com.avito.android.referral_contacts.di.c cVar) {
                this.f252435a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f252435a.g();
            }
        }

        /* compiled from: DaggerReferralContactsComponent.java */
        public static final class e implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.referral_contacts.di.c f252436a;

            public e(com.avito.android.referral_contacts.di.c cVar) {
                this.f252436a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarQ = this.f252436a.q();
                t.c(xVarQ);
                return xVarQ;
            }
        }

        /* compiled from: DaggerReferralContactsComponent.java */
        public static final class f implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f252437a;

            public f(cv.b bVar) {
                this.f252437a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f252437a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerReferralContactsComponent.java */
        public static final class g implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.referral_contacts.di.c f252438a;

            public g(com.avito.android.referral_contacts.di.c cVar) {
                this.f252438a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f252438a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerReferralContactsComponent.java */
        public static final class h implements u<InterfaceC15188a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.referral_contacts.di.c f252439a;

            public h(com.avito.android.referral_contacts.di.c cVar) {
                this.f252439a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC15188a interfaceC15188aDa = this.f252439a.da();
                t.c(interfaceC15188aDa);
                return interfaceC15188aDa;
            }
        }

        /* compiled from: DaggerReferralContactsComponent.java */
        public static final class i implements u<l> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.referral_contacts.di.c f252440a;

            public i(com.avito.android.referral_contacts.di.c cVar) {
                this.f252440a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f252440a.r();
            }
        }

        public c(com.avito.android.referral_contacts.di.c cVar, cv.b bVar, Resources resources, C28478k c28478k, C7577a c7577a) {
            this.f252412a = new f(bVar);
            u<com.avito.android.referral_contacts.h> uVarD = dagger.internal.g.d(new j(dagger.internal.l.a(resources)));
            this.f252413b = uVarD;
            this.f252414c = new com.avito.android.referral_contacts.g(uVarD, this.f252412a);
            this.f252415d = new h(cVar);
            this.f252417f = new com.avito.android.referral_contacts.domain.d(new b(cVar));
            this.f252418g = new e(cVar);
            u<com.avito.android.referral_contacts.storage.a> uVarD2 = dagger.internal.g.d(new com.avito.android.referral_contacts.storage.d(new i(cVar), new d(cVar), new g(cVar)));
            this.f252422k = uVarD2;
            com.avito.android.referral_contacts.domain.i iVar = new com.avito.android.referral_contacts.domain.i(this.f252415d, this.f252413b, this.f252417f, this.f252418g, uVarD2);
            C7578a c7578a = new C7578a(cVar);
            u<com.avito.android.deeplink_handler.handler.composite.a> uVar = this.f252412a;
            com.avito.android.referral_contacts.g gVar = this.f252414c;
            this.f252424m = new com.avito.android.referral_contacts.mvi.g(uVar, gVar, iVar, c7578a);
            this.f252425n = new com.avito.android.referral_contacts.mvi.i(iVar, gVar, c7578a);
            this.f252426o = new C7579c(cVar);
            this.f252427p = com.avito.android.actions_sheet.a.D(dagger.internal.l.a(c28478k), this.f252426o);
            this.f252428q = new r(new com.avito.android.referral_contacts.mvi.l(this.f252424m, n.a(), this.f252425n, p.a(), this.f252427p));
            com.avito.android.referral_contacts.di.e eVar = new com.avito.android.referral_contacts.di.e(new com.avito.android.referral_contacts.contacts_list.b(com.avito.android.referral_contacts.contacts_list.e.a()));
            this.f252429r = eVar;
            u<com.avito.konveyor.adapter.a> uVarD3 = dagger.internal.g.d(new com.avito.android.referral_contacts.di.f(eVar));
            this.f252430s = uVarD3;
            this.f252431t = dagger.internal.g.d(new com.avito.android.referral_contacts.di.g(uVarD3, this.f252429r));
        }

        @Override // com.avito.android.referral_contacts.di.b
        public final void a(ReferralContactsActivity referralContactsActivity) {
            referralContactsActivity.f252575m = this.f252428q;
            referralContactsActivity.f252577o = this.f252431t.get();
            referralContactsActivity.f252579q = this.f252427p.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
