package com.avito.android.mortgage_invite.client_form.di;

import c20.InterfaceC26928e;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage_invite.client_form.ApplicationClientFormFragment;
import com.avito.android.mortgage_invite.client_form.di.a;
import com.avito.android.mortgage_invite.client_form.domain.j;
import com.avito.android.mortgage_invite.client_form.domain.k;
import com.avito.android.mortgage_invite.client_form.domain.m;
import com.avito.android.mortgage_invite.client_form.h0;
import com.avito.android.mortgage_invite.client_form.model.ApplicationClientFormArguments;
import com.avito.android.mortgage_invite.client_form.mvi.f;
import com.avito.android.mortgage_invite.client_form.mvi.h;
import com.avito.android.mortgage_invite.client_form.mvi.o;
import com.avito.android.mortgage_invite.common.domain.g;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import e20.InterfaceC39928a;

/* compiled from: DaggerApplicationClientFormComponent.java */
@e
/* loaded from: classes15.dex */
public final class c {

    /* compiled from: DaggerApplicationClientFormComponent.java */
    public static final class b implements com.avito.android.mortgage_invite.client_form.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f205115a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC26928e f205116b;

        /* renamed from: c, reason: collision with root package name */
        public final l f205117c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC39928a> f205118d;

        /* renamed from: e, reason: collision with root package name */
        public final u<R0> f205119e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.mortgage_invite.client_form.domain.mapper.d> f205120f;

        /* renamed from: g, reason: collision with root package name */
        public final u<k> f205121g;

        /* renamed from: h, reason: collision with root package name */
        public final h f205122h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.mortgage_invite.common.domain.a> f205123i;

        /* renamed from: j, reason: collision with root package name */
        public final g f205124j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.mortgage_invite.client_form.domain.mapper.a> f205125k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.mortgage.domain.check_access.b> f205126l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.mortgage_invite.client_form.domain.a> f205127m;

        /* renamed from: n, reason: collision with root package name */
        public final f f205128n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC28481c> f205129o;

        /* renamed from: p, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f205130p;

        /* renamed from: q, reason: collision with root package name */
        public final h0 f205131q;

        /* compiled from: DaggerApplicationClientFormComponent.java */
        public static final class a implements u<com.avito.android.mortgage.domain.check_access.b> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC26928e f205132a;

            public a(InterfaceC26928e interfaceC26928e) {
                this.f205132a = interfaceC26928e;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f205132a.O5();
            }
        }

        /* compiled from: DaggerApplicationClientFormComponent.java */
        /* renamed from: com.avito.android.mortgage_invite.client_form.di.c$b$b, reason: collision with other inner class name */
        public static final class C6113b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC26928e f205133a;

            public C6113b(InterfaceC26928e interfaceC26928e) {
                this.f205133a = interfaceC26928e;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f205133a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerApplicationClientFormComponent.java */
        /* renamed from: com.avito.android.mortgage_invite.client_form.di.c$b$c, reason: collision with other inner class name */
        public static final class C6114c implements u<InterfaceC39928a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC26928e f205134a;

            public C6114c(InterfaceC26928e interfaceC26928e) {
                this.f205134a = interfaceC26928e;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC39928a interfaceC39928aJb = this.f205134a.Jb();
                t.c(interfaceC39928aJb);
                return interfaceC39928aJb;
            }
        }

        /* compiled from: DaggerApplicationClientFormComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC26928e f205135a;

            public d(InterfaceC26928e interfaceC26928e) {
                this.f205135a = interfaceC26928e;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f205135a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(InterfaceC26928e interfaceC26928e, cv.b bVar, C28478k c28478k, ApplicationClientFormArguments applicationClientFormArguments, a aVar) {
            this.f205115a = bVar;
            this.f205116b = interfaceC26928e;
            this.f205117c = l.a(applicationClientFormArguments);
            this.f205118d = new C6114c(interfaceC26928e);
            this.f205119e = new C6113b(interfaceC26928e);
            u<com.avito.android.mortgage_invite.client_form.domain.mapper.d> uVarD = dagger.internal.g.d(com.avito.android.mortgage_invite.client_form.domain.mapper.f.a());
            this.f205120f = uVarD;
            u<k> uVarD2 = dagger.internal.g.d(new m(uVarD, this.f205118d, this.f205119e));
            this.f205121g = uVarD2;
            this.f205122h = new h(this.f205117c, uVarD2);
            u<com.avito.android.mortgage_invite.common.domain.a> uVarD3 = dagger.internal.g.d(com.avito.android.mortgage_invite.common.domain.c.a());
            this.f205123i = uVarD3;
            this.f205124j = new g(this.f205118d, this.f205119e, uVarD3);
            u<com.avito.android.mortgage_invite.client_form.domain.mapper.a> uVarD4 = dagger.internal.g.d(new com.avito.android.mortgage_invite.client_form.domain.mapper.c(uVarD3));
            this.f205125k = uVarD4;
            u<com.avito.android.mortgage_invite.client_form.domain.a> uVarD5 = dagger.internal.g.d(new com.avito.android.mortgage_invite.client_form.domain.f(this.f205119e, this.f205124j, new j(uVarD4, this.f205118d), new a(interfaceC26928e)));
            this.f205127m = uVarD5;
            this.f205128n = new f(this.f205117c, uVarD5, this.f205121g);
            this.f205129o = new d(interfaceC26928e);
            this.f205130p = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f205129o);
            this.f205131q = new h0(new com.avito.android.mortgage_invite.client_form.mvi.k(this.f205122h, this.f205128n, com.avito.android.mortgage_invite.client_form.mvi.m.a(), o.a(), this.f205130p));
        }

        @Override // com.avito.android.mortgage_invite.client_form.di.a
        public final void a(ApplicationClientFormFragment applicationClientFormFragment) {
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f205115a.u4();
            t.c(aVarU4);
            applicationClientFormFragment.f205016n0 = aVarU4;
            com.avito.android.mortgage.phone_confirm.m mVarQ8 = this.f205116b.q8();
            t.c(mVarQ8);
            applicationClientFormFragment.f205017o0 = mVarQ8;
            applicationClientFormFragment.f205018p0 = this.f205131q;
            applicationClientFormFragment.f205020r0 = this.f205130p.get();
        }
    }

    /* compiled from: DaggerApplicationClientFormComponent.java */
    /* renamed from: com.avito.android.mortgage_invite.client_form.di.c$c, reason: collision with other inner class name */
    public static final class C6115c implements a.InterfaceC6112a {
        public C6115c() {
        }

        @Override // com.avito.android.mortgage_invite.client_form.di.a.InterfaceC6112a
        public final com.avito.android.mortgage_invite.client_form.di.a a(C28478k c28478k, ApplicationClientFormArguments applicationClientFormArguments, InterfaceC26928e interfaceC26928e, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new b(interfaceC26928e, interfaceC39417a, c28478k, applicationClientFormArguments, null);
        }
    }

    public static a.InterfaceC6112a a() {
        return new C6115c();
    }
}
