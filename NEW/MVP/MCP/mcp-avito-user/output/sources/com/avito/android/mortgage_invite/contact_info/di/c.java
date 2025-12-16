package com.avito.android.mortgage_invite.contact_info.di;

import c20.InterfaceC26928e;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage_invite.common.domain.g;
import com.avito.android.mortgage_invite.contact_info.ApplicationContactInfoFragment;
import com.avito.android.mortgage_invite.contact_info.E;
import com.avito.android.mortgage_invite.contact_info.di.a;
import com.avito.android.mortgage_invite.contact_info.model.ApplicationContactInfoArguments;
import com.avito.android.mortgage_invite.contact_info.mvi.f;
import com.avito.android.mortgage_invite.contact_info.mvi.h;
import com.avito.android.mortgage_invite.contact_info.mvi.k;
import com.avito.android.mortgage_invite.contact_info.mvi.m;
import com.avito.android.mortgage_invite.contact_info.mvi.o;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import e20.InterfaceC39928a;
import q20.InterfaceC47188b;

/* compiled from: DaggerApplicationContactInfoComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class c {

    /* compiled from: DaggerApplicationContactInfoComponent.java */
    public static final class b implements com.avito.android.mortgage_invite.contact_info.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f205612a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC26928e f205613b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28481c> f205614c;

        /* renamed from: d, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f205615d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC39928a> f205616e;

        /* renamed from: f, reason: collision with root package name */
        public final u<R0> f205617f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.mortgage_invite.contact_info.domain.d f205618g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28373a> f205619h;

        /* renamed from: i, reason: collision with root package name */
        public final Z10.c f205620i;

        /* renamed from: j, reason: collision with root package name */
        public final h f205621j;

        /* renamed from: k, reason: collision with root package name */
        public final o f205622k;

        /* renamed from: l, reason: collision with root package name */
        public final u<S10.c> f205623l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.mortgage_invite.contact_info.domain.b f205624m;

        /* renamed from: n, reason: collision with root package name */
        public final E f205625n;

        /* compiled from: DaggerApplicationContactInfoComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC26928e f205626a;

            public a(InterfaceC26928e interfaceC26928e) {
                this.f205626a = interfaceC26928e;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f205626a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerApplicationContactInfoComponent.java */
        /* renamed from: com.avito.android.mortgage_invite.contact_info.di.c$b$b, reason: collision with other inner class name */
        public static final class C6128b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC26928e f205627a;

            public C6128b(InterfaceC26928e interfaceC26928e) {
                this.f205627a = interfaceC26928e;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f205627a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerApplicationContactInfoComponent.java */
        /* renamed from: com.avito.android.mortgage_invite.contact_info.di.c$b$c, reason: collision with other inner class name */
        public static final class C6129c implements u<InterfaceC39928a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC26928e f205628a;

            public C6129c(InterfaceC26928e interfaceC26928e) {
                this.f205628a = interfaceC26928e;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC39928a interfaceC39928aJb = this.f205628a.Jb();
                t.c(interfaceC39928aJb);
                return interfaceC39928aJb;
            }
        }

        /* compiled from: DaggerApplicationContactInfoComponent.java */
        public static final class d implements u<S10.c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC26928e f205629a;

            public d(InterfaceC26928e interfaceC26928e) {
                this.f205629a = interfaceC26928e;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                S10.c cVarCj = this.f205629a.cj();
                t.c(cVarCj);
                return cVarCj;
            }
        }

        /* compiled from: DaggerApplicationContactInfoComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC26928e f205630a;

            public e(InterfaceC26928e interfaceC26928e) {
                this.f205630a = interfaceC26928e;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f205630a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(InterfaceC26928e interfaceC26928e, cv.b bVar, ApplicationContactInfoArguments applicationContactInfoArguments, C28478k c28478k, a aVar) {
            this.f205612a = bVar;
            this.f205613b = interfaceC26928e;
            this.f205614c = new e(interfaceC26928e);
            this.f205615d = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f205614c);
            C6129c c6129c = new C6129c(interfaceC26928e);
            this.f205616e = c6129c;
            this.f205617f = new C6128b(interfaceC26928e);
            this.f205618g = new com.avito.android.mortgage_invite.contact_info.domain.d(c6129c, com.avito.android.mortgage_invite.contact_info.domain.mapper.c.a(), this.f205617f);
            this.f205620i = new Z10.c(new a(interfaceC26928e));
            this.f205621j = new h(this.f205618g, this.f205620i, l.a(applicationContactInfoArguments));
            this.f205622k = new o(com.avito.android.mortgage_invite.contact_info.mvi.builder.c.a());
            this.f205623l = new d(interfaceC26928e);
            this.f205624m = new com.avito.android.mortgage_invite.contact_info.domain.b(this.f205623l, this.f205617f, new g(this.f205616e, this.f205617f, com.avito.android.mortgage_invite.common.domain.c.a()));
            this.f205625n = new E(new k(this.f205621j, this.f205622k, new f(this.f205618g, this.f205624m, new com.avito.android.mortgage_invite.contact_info.domain.validation.g(com.avito.android.mortgage_invite.contact_info.domain.validation.b.a(), com.avito.android.mortgage_invite.contact_info.domain.validation.d.a()), this.f205620i), m.a(), this.f205615d));
        }

        @Override // com.avito.android.mortgage_invite.contact_info.di.a
        public final void a(ApplicationContactInfoFragment applicationContactInfoFragment) {
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f205612a.u4();
            t.c(aVarU4);
            applicationContactInfoFragment.f205578n0 = aVarU4;
            InterfaceC47188b interfaceC47188bE4 = this.f205613b.e4();
            t.c(interfaceC47188bE4);
            applicationContactInfoFragment.f205579o0 = interfaceC47188bE4;
            applicationContactInfoFragment.f205580p0 = this.f205615d.get();
            applicationContactInfoFragment.f205582r0 = this.f205625n;
        }
    }

    /* compiled from: DaggerApplicationContactInfoComponent.java */
    /* renamed from: com.avito.android.mortgage_invite.contact_info.di.c$c, reason: collision with other inner class name */
    public static final class C6130c implements a.InterfaceC6127a {
        public C6130c() {
        }

        @Override // com.avito.android.mortgage_invite.contact_info.di.a.InterfaceC6127a
        public final com.avito.android.mortgage_invite.contact_info.di.a a(InterfaceC26928e interfaceC26928e, InterfaceC39417a interfaceC39417a, ApplicationContactInfoArguments applicationContactInfoArguments, C28478k c28478k) {
            interfaceC39417a.getClass();
            return new b(interfaceC26928e, interfaceC39417a, applicationContactInfoArguments, c28478k, null);
        }
    }

    public static a.InterfaceC6127a a() {
        return new C6130c();
    }
}
