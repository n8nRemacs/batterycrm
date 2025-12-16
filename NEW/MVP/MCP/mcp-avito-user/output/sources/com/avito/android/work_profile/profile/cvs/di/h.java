package com.avito.android.work_profile.profile.cvs.di;

import android.content.res.Resources;
import bQ0.InterfaceC25545a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.x;
import com.avito.android.di.module.C30060h5;
import com.avito.android.di.module.C30103l4;
import com.avito.android.di.module.C30114m4;
import com.avito.android.work_profile.profile.cvs.di.a;
import com.avito.android.work_profile.profile.cvs.mvi.i;
import com.avito.android.work_profile.profile.cvs.mvi.k;
import com.avito.android.work_profile.profile.cvs.ui.CvsFragment;
import com.avito.konveyor.adapter.j;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import fQ0.InterfaceC40329a;
import java.util.Locale;
import nQ0.InterfaceC44322a;

/* compiled from: DaggerCvsComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class h {

    /* compiled from: DaggerCvsComponent.java */
    public static final class b implements com.avito.android.work_profile.profile.cvs.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final u<com.avito.android.work_profile.item.c> f331008a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f331009b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f331010c;

        /* renamed from: d, reason: collision with root package name */
        public final u<j> f331011d;

        /* renamed from: e, reason: collision with root package name */
        public final u<ZP0.a> f331012e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC25545a> f331013f;

        /* renamed from: g, reason: collision with root package name */
        public final u<x> f331014g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.work_profile.domain.mapper.b f331015h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.work_profile.domain.j> f331016i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.server_time.f> f331017j;

        /* renamed from: k, reason: collision with root package name */
        public final u<Locale> f331018k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC40329a> f331019l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f331020m;

        /* renamed from: n, reason: collision with root package name */
        public final com.avito.android.work_profile.profile.cvs.mvi.e f331021n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC28481c> f331022o;

        /* renamed from: p, reason: collision with root package name */
        public final u<C28478k> f331023p;

        /* renamed from: q, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f331024q;

        /* renamed from: r, reason: collision with root package name */
        public final lQ0.b f331025r;

        /* compiled from: DaggerCvsComponent.java */
        public static final class a implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.work_profile.profile.cvs.di.b f331026a;

            public a(com.avito.android.work_profile.profile.cvs.di.b bVar) {
                this.f331026a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarT = this.f331026a.t();
                t.c(xVarT);
                return xVarT;
            }
        }

        /* compiled from: DaggerCvsComponent.java */
        /* renamed from: com.avito.android.work_profile.profile.cvs.di.h$b$b, reason: collision with other inner class name */
        public static final class C10286b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f331027a;

            public C10286b(cv.b bVar) {
                this.f331027a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f331027a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerCvsComponent.java */
        public static final class c implements u<InterfaceC25545a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.work_profile.profile.cvs.di.b f331028a;

            public c(com.avito.android.work_profile.profile.cvs.di.b bVar) {
                this.f331028a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC25545a interfaceC25545aEj = this.f331028a.ej();
                t.c(interfaceC25545aEj);
                return interfaceC25545aEj;
            }
        }

        /* compiled from: DaggerCvsComponent.java */
        public static final class d implements u<Locale> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.work_profile.profile.cvs.di.b f331029a;

            public d(com.avito.android.work_profile.profile.cvs.di.b bVar) {
                this.f331029a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f331029a.locale();
            }
        }

        /* compiled from: DaggerCvsComponent.java */
        public static final class e implements u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.work_profile.profile.cvs.di.b f331030a;

            public e(com.avito.android.work_profile.profile.cvs.di.b bVar) {
                this.f331030a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f331030a.l();
                t.c(fVarL);
                return fVarL;
            }
        }

        /* compiled from: DaggerCvsComponent.java */
        public static final class f implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.work_profile.profile.cvs.di.b f331031a;

            public f(com.avito.android.work_profile.profile.cvs.di.b bVar) {
                this.f331031a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cT3 = this.f331031a.t3();
                t.c(interfaceC28481cT3);
                return interfaceC28481cT3;
            }
        }

        /* compiled from: DaggerCvsComponent.java */
        public static final class g implements u<ZP0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.work_profile.profile.cvs.di.b f331032a;

            public g(com.avito.android.work_profile.profile.cvs.di.b bVar) {
                this.f331032a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                ZP0.a aVarK7 = this.f331032a.k7();
                t.c(aVarK7);
                return aVarK7;
            }
        }

        /* compiled from: DaggerCvsComponent.java */
        /* renamed from: com.avito.android.work_profile.profile.cvs.di.h$b$h, reason: collision with other inner class name */
        public static final class C10287h implements u<InterfaceC40329a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.work_profile.profile.cvs.di.b f331033a;

            public C10287h(com.avito.android.work_profile.profile.cvs.di.b bVar) {
                this.f331033a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f331033a.Fc();
            }
        }

        public b(com.avito.android.work_profile.profile.cvs.di.b bVar, cv.b bVar2, Resources resources, InterfaceC44322a interfaceC44322a, r rVar, a aVar) {
            u<com.avito.android.work_profile.item.c> uVarD = dagger.internal.g.d(new com.avito.android.work_profile.item.e(l.a(interfaceC44322a)));
            this.f331008a = uVarD;
            u<com.avito.konveyor.a> uVarD2 = dagger.internal.g.d(new com.avito.android.work_profile.profile.cvs.di.e(new com.avito.android.work_profile.item.b(uVarD)));
            this.f331009b = uVarD2;
            u<com.avito.konveyor.adapter.a> uVarD3 = dagger.internal.g.d(new com.avito.android.work_profile.profile.cvs.di.d(uVarD2));
            this.f331010c = uVarD3;
            this.f331011d = dagger.internal.g.d(new com.avito.android.work_profile.profile.cvs.di.g(uVarD3, this.f331009b));
            g gVar = new g(bVar);
            c cVar = new c(bVar);
            this.f331015h = new com.avito.android.work_profile.domain.mapper.b(new a(bVar));
            this.f331016i = dagger.internal.g.d(new com.avito.android.work_profile.data.d(gVar, cVar, com.avito.android.work_profile.domain.mapper.d.a(), this.f331015h));
            this.f331017j = new e(bVar);
            this.f331021n = new com.avito.android.work_profile.profile.cvs.mvi.e(this.f331016i, new i(new C30103l4(this.f331017j, new C30114m4(com.avito.android.date_time_formatter.i.b(new com.avito.android.date_time_formatter.h(l.a(resources)))), new d(bVar))), new C10287h(bVar), new C10286b(bVar2));
            this.f331022o = new f(bVar);
            u<C28478k> uVarD4 = dagger.internal.g.d(new com.avito.android.work_profile.profile.cvs.di.f(l.a(rVar)));
            this.f331023p = uVarD4;
            this.f331024q = dagger.internal.g.d(new C30060h5(this.f331022o, uVarD4));
            this.f331025r = new lQ0.b(new com.avito.android.work_profile.profile.cvs.mvi.g(this.f331021n, k.a(), this.f331024q));
        }

        @Override // com.avito.android.work_profile.profile.cvs.di.a
        public final void a(CvsFragment cvsFragment) {
            cvsFragment.f331066n0 = this.f331010c.get();
            cvsFragment.f331067o0 = this.f331011d.get();
            cvsFragment.f331068p0 = this.f331025r;
            cvsFragment.f331070r0 = this.f331024q.get();
        }
    }

    /* compiled from: DaggerCvsComponent.java */
    public static final class c implements a.InterfaceC10285a {
        public c() {
        }

        @Override // com.avito.android.work_profile.profile.cvs.di.a.InterfaceC10285a
        public final com.avito.android.work_profile.profile.cvs.di.a a(com.avito.android.work_profile.profile.cvs.di.b bVar, InterfaceC39417a interfaceC39417a, Resources resources, CvsFragment cvsFragment, r rVar) {
            interfaceC39417a.getClass();
            return new b(bVar, interfaceC39417a, resources, cvsFragment, rVar, null);
        }
    }

    public static a.InterfaceC10285a a() {
        return new c();
    }
}
