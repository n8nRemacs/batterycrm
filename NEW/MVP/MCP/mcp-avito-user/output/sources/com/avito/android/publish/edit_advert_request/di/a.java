package com.avito.android.publish.edit_advert_request.di;

import Pd.InterfaceC14769a;
import android.content.res.Resources;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.publish.C0;
import com.avito.android.publish.edit_advert_request.EditAdvertRequestFragment;
import com.avito.android.publish.edit_advert_request.di.c;
import com.avito.android.publish.edit_advert_request_mvi.EditRequestFragment;
import com.avito.android.publish.edit_advert_request_mvi.m;
import com.avito.android.publish.edit_advert_request_mvi.mvi.n;
import com.avito.android.publish.edit_advert_request_mvi.o;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;
import de0.C39717b;
import de0.InterfaceC39718c;
import de0.InterfaceC39719d;
import lD.C43617a;
import nI0.InterfaceC44261b;
import sj0.InterfaceC48373a;
import yc.C50213a;

/* compiled from: DaggerEditAdvertRequestComponent.java */
@e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerEditAdvertRequestComponent.java */
    public static final class b implements c.a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.publish.edit_advert_request.di.b f235468a;

        /* renamed from: b, reason: collision with root package name */
        public Resources f235469b;

        /* renamed from: c, reason: collision with root package name */
        public InterfaceC39417a f235470c;

        public b() {
        }

        @Override // com.avito.android.publish.edit_advert_request.di.c.a
        public final c.a a(InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            this.f235470c = interfaceC39417a;
            return this;
        }

        @Override // com.avito.android.publish.edit_advert_request.di.c.a
        public final c.a b(Resources resources) {
            this.f235469b = resources;
            return this;
        }

        @Override // com.avito.android.publish.edit_advert_request.di.c.a
        public final com.avito.android.publish.edit_advert_request.di.c build() {
            t.a(com.avito.android.publish.edit_advert_request.di.b.class, this.f235468a);
            t.a(Resources.class, this.f235469b);
            t.a(cv.b.class, this.f235470c);
            return new c(this.f235468a, this.f235470c, this.f235469b, null);
        }

        @Override // com.avito.android.publish.edit_advert_request.di.c.a
        public final c.a c(com.avito.android.publish.edit_advert_request.di.b bVar) {
            this.f235468a = bVar;
            return this;
        }
    }

    /* compiled from: DaggerEditAdvertRequestComponent.java */
    public static final class c implements com.avito.android.publish.edit_advert_request.di.c {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.publish.edit_advert_request.di.b f235471a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f235472b;

        /* renamed from: c, reason: collision with root package name */
        public final u<H0> f235473c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC39718c> f235474d;

        /* renamed from: e, reason: collision with root package name */
        public final u<CategoryParametersConverter> f235475e;

        /* renamed from: f, reason: collision with root package name */
        public final u<C50213a> f235476f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC39719d> f235477g;

        /* renamed from: h, reason: collision with root package name */
        public final u<C0> f235478h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28373a> f235479i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC14769a> f235480j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC48373a> f235481k;

        /* renamed from: l, reason: collision with root package name */
        public final u<C43617a> f235482l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC35745a5> f235483m;

        /* renamed from: n, reason: collision with root package name */
        public final u<R0> f235484n;

        /* renamed from: o, reason: collision with root package name */
        public final u<eH0.c> f235485o;

        /* renamed from: p, reason: collision with root package name */
        public final u<InterfaceC44261b> f235486p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.publish.edit_advert_request_mvi.f> f235487q;

        /* renamed from: r, reason: collision with root package name */
        public final o f235488r;

        /* compiled from: DaggerEditAdvertRequestComponent.java */
        /* renamed from: com.avito.android.publish.edit_advert_request.di.a$c$a, reason: collision with other inner class name */
        public static final class C7100a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.edit_advert_request.di.b f235489a;

            public C7100a(com.avito.android.publish.edit_advert_request.di.b bVar) {
                this.f235489a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f235489a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerEditAdvertRequestComponent.java */
        public static final class b implements u<InterfaceC14769a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.edit_advert_request.di.b f235490a;

            public b(com.avito.android.publish.edit_advert_request.di.b bVar) {
                this.f235490a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14769a interfaceC14769aR7 = this.f235490a.r7();
                t.c(interfaceC14769aR7);
                return interfaceC14769aR7;
            }
        }

        /* compiled from: DaggerEditAdvertRequestComponent.java */
        /* renamed from: com.avito.android.publish.edit_advert_request.di.a$c$c, reason: collision with other inner class name */
        public static final class C7101c implements u<C43617a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.edit_advert_request.di.b f235491a;

            public C7101c(com.avito.android.publish.edit_advert_request.di.b bVar) {
                this.f235491a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f235491a.C0();
            }
        }

        /* compiled from: DaggerEditAdvertRequestComponent.java */
        public static final class d implements u<CategoryParametersConverter> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.edit_advert_request.di.b f235492a;

            public d(com.avito.android.publish.edit_advert_request.di.b bVar) {
                this.f235492a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                CategoryParametersConverter categoryParametersConverterI = this.f235492a.I();
                t.c(categoryParametersConverterI);
                return categoryParametersConverterI;
            }
        }

        /* compiled from: DaggerEditAdvertRequestComponent.java */
        public static final class e implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.edit_advert_request.di.b f235493a;

            public e(com.avito.android.publish.edit_advert_request.di.b bVar) {
                this.f235493a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f235493a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerEditAdvertRequestComponent.java */
        public static final class f implements u<InterfaceC48373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.edit_advert_request.di.b f235494a;

            public f(com.avito.android.publish.edit_advert_request.di.b bVar) {
                this.f235494a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC48373a interfaceC48373aV7 = this.f235494a.v7();
                t.c(interfaceC48373aV7);
                return interfaceC48373aV7;
            }
        }

        /* compiled from: DaggerEditAdvertRequestComponent.java */
        public static final class g implements u<C50213a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.edit_advert_request.di.b f235495a;

            public g(com.avito.android.publish.edit_advert_request.di.b bVar) {
                this.f235495a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C50213a c50213aD1 = this.f235495a.D1();
                t.c(c50213aD1);
                return c50213aD1;
            }
        }

        /* compiled from: DaggerEditAdvertRequestComponent.java */
        public static final class h implements u<H0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.edit_advert_request.di.b f235496a;

            public h(com.avito.android.publish.edit_advert_request.di.b bVar) {
                this.f235496a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                H0 h0I3 = this.f235496a.I3();
                t.c(h0I3);
                return h0I3;
            }
        }

        /* compiled from: DaggerEditAdvertRequestComponent.java */
        public static final class i implements u<C0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.edit_advert_request.di.b f235497a;

            public i(com.avito.android.publish.edit_advert_request.di.b bVar) {
                this.f235497a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C0 c0U = this.f235497a.u();
                t.c(c0U);
                return c0U;
            }
        }

        /* compiled from: DaggerEditAdvertRequestComponent.java */
        public static final class j implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.edit_advert_request.di.b f235498a;

            public j(com.avito.android.publish.edit_advert_request.di.b bVar) {
                this.f235498a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f235498a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerEditAdvertRequestComponent.java */
        public static final class k implements u<eH0.c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.edit_advert_request.di.b f235499a;

            public k(com.avito.android.publish.edit_advert_request.di.b bVar) {
                this.f235499a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f235499a.m2();
            }
        }

        /* compiled from: DaggerEditAdvertRequestComponent.java */
        public static final class l implements u<InterfaceC44261b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.edit_advert_request.di.b f235500a;

            public l(com.avito.android.publish.edit_advert_request.di.b bVar) {
                this.f235500a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f235500a.i1();
            }
        }

        public c(com.avito.android.publish.edit_advert_request.di.b bVar, cv.b bVar2, Resources resources, C7099a c7099a) {
            this.f235471a = bVar;
            this.f235472b = bVar2;
            u<InterfaceC39718c> uVarD = dagger.internal.g.d(new C39717b(new h(bVar)));
            this.f235474d = uVarD;
            d dVar = new d(bVar);
            g gVar = new g(bVar);
            this.f235476f = gVar;
            u<InterfaceC39719d> uVarD2 = dagger.internal.g.d(new de0.f(uVarD, dVar, gVar));
            this.f235477g = uVarD2;
            i iVar = new i(bVar);
            this.f235478h = iVar;
            u<com.avito.android.publish.edit_advert_request_mvi.f> uVarD3 = dagger.internal.g.d(new m(uVarD2, iVar, new C7100a(bVar), this.f235476f, new com.avito.android.publish.edit_advert_request.d(new b(bVar), new f(bVar), new C7101c(bVar), new j(bVar)), new e(bVar), new k(bVar), new l(bVar)));
            this.f235487q = uVarD3;
            this.f235488r = new o(new com.avito.android.publish.edit_advert_request_mvi.mvi.j(new com.avito.android.publish.edit_advert_request_mvi.mvi.g(uVarD3), new com.avito.android.publish.edit_advert_request_mvi.mvi.e(uVarD3, this.f235478h), com.avito.android.publish.edit_advert_request_mvi.mvi.l.a(), n.a()));
        }

        @Override // com.avito.android.publish.edit_advert_request.di.c
        public final void a(EditAdvertRequestFragment editAdvertRequestFragment) {
            InterfaceC39719d interfaceC39719d = this.f235477g.get();
            com.avito.android.publish.edit_advert_request.di.b bVar = this.f235471a;
            InterfaceC35745a5 interfaceC35745a5D = bVar.d();
            t.c(interfaceC35745a5D);
            InterfaceC28373a interfaceC28373aA = bVar.a();
            t.c(interfaceC28373aA);
            C50213a c50213aD1 = bVar.D1();
            t.c(c50213aD1);
            C0 c0U = bVar.u();
            t.c(c0U);
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f235472b.u4();
            t.c(aVarU4);
            InterfaceC14769a interfaceC14769aR7 = bVar.r7();
            t.c(interfaceC14769aR7);
            InterfaceC48373a interfaceC48373aV7 = bVar.v7();
            t.c(interfaceC48373aV7);
            C43617a c43617aC0 = bVar.C0();
            InterfaceC35745a5 interfaceC35745a5D2 = bVar.d();
            t.c(interfaceC35745a5D2);
            editAdvertRequestFragment.f235445n0 = new com.avito.android.publish.edit_advert_request.m(interfaceC39719d, interfaceC35745a5D, interfaceC28373aA, c50213aD1, c0U, aVarU4, new com.avito.android.publish.edit_advert_request.a(interfaceC14769aR7, interfaceC48373aV7, c43617aC0, interfaceC35745a5D2), bVar.m2(), bVar.i1());
            InterfaceC28373a interfaceC28373aA2 = bVar.a();
            t.c(interfaceC28373aA2);
            editAdvertRequestFragment.f235446o0 = interfaceC28373aA2;
            com.avito.android.lib.deprecated_design.dialog.a aVarH2 = bVar.H2();
            t.c(aVarH2);
            editAdvertRequestFragment.f235447p0 = aVarH2;
        }

        @Override // com.avito.android.publish.edit_advert_request.di.c
        public final void b(EditRequestFragment editRequestFragment) {
            editRequestFragment.f235540n0 = this.f235488r;
            com.avito.android.publish.edit_advert_request.di.b bVar = this.f235471a;
            InterfaceC28373a interfaceC28373aA = bVar.a();
            t.c(interfaceC28373aA);
            editRequestFragment.f235542p0 = interfaceC28373aA;
            com.avito.android.lib.deprecated_design.dialog.a aVarH2 = bVar.H2();
            t.c(aVarH2);
            editRequestFragment.f235543q0 = aVarH2;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f235472b.u4();
            t.c(aVarU4);
            editRequestFragment.f235544r0 = aVarU4;
        }
    }

    public static c.a a() {
        return new b();
    }
}
