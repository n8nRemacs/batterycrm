package com.avito.android.tariff_lf_constructor.configure.setting.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.tariff_lf_constructor.configure.setting.ConstructorSettingFragment;
import com.avito.android.tariff_lf_constructor.configure.setting.di.a;
import com.avito.android.tariff_lf_constructor.configure.setting.viewmodel.C35217c;
import com.avito.android.tariff_lf_constructor.configure.setting.viewmodel.C35223i;
import com.avito.android.tariff_lf_constructor.configure.setting.viewmodel.InterfaceC35215a;
import com.avito.android.tariff_lf_constructor.configure.setting.viewmodel.InterfaceC35219e;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.konveyor.adapter.j;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import dagger.internal.z;
import gD0.InterfaceC40574b;
import java.util.List;
import pD0.InterfaceC46937a;

/* compiled from: DaggerConstructorSettingComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class h {

    /* compiled from: DaggerConstructorSettingComponent.java */
    public static final class b implements com.avito.android.tariff_lf_constructor.configure.setting.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f300051a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package.d> f300052b;

        /* renamed from: c, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f300053c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf_constructor.configure.header_item.d> f300054d;

        /* renamed from: e, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f300055e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf_constructor.configure.setting.items.placing.d> f300056f;

        /* renamed from: g, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f300057g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.f> f300058h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f300059i;

        /* renamed from: j, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f300060j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f300061k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f300062l;

        /* renamed from: m, reason: collision with root package name */
        public final u<j> f300063m;

        /* renamed from: n, reason: collision with root package name */
        public final l f300064n;

        /* renamed from: o, reason: collision with root package name */
        public final l f300065o;

        /* renamed from: p, reason: collision with root package name */
        public final u<InterfaceC35215a> f300066p;

        /* renamed from: q, reason: collision with root package name */
        public final u<InterfaceC46937a> f300067q;

        /* renamed from: r, reason: collision with root package name */
        public final u<InterfaceC35745a5> f300068r;

        /* renamed from: s, reason: collision with root package name */
        public final u<InterfaceC35219e> f300069s;

        /* renamed from: t, reason: collision with root package name */
        public final u<InterfaceC28481c> f300070t;

        /* renamed from: u, reason: collision with root package name */
        public final u<C28478k> f300071u;

        /* renamed from: v, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f300072v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f300073w;

        /* renamed from: x, reason: collision with root package name */
        public final u<P0.c> f300074x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf_constructor.configure.setting.viewmodel.j> f300075y;

        /* compiled from: DaggerConstructorSettingComponent.java */
        public static final class a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40574b f300076a;

            public a(InterfaceC40574b interfaceC40574b) {
                this.f300076a = interfaceC40574b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f300076a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerConstructorSettingComponent.java */
        /* renamed from: com.avito.android.tariff_lf_constructor.configure.setting.di.h$b$b, reason: collision with other inner class name */
        public static final class C9181b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f300077a;

            public C9181b(cv.b bVar) {
                this.f300077a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f300077a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerConstructorSettingComponent.java */
        public static final class c implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40574b f300078a;

            public c(InterfaceC40574b interfaceC40574b) {
                this.f300078a = interfaceC40574b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f300078a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerConstructorSettingComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40574b f300079a;

            public d(InterfaceC40574b interfaceC40574b) {
                this.f300079a = interfaceC40574b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f300079a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerConstructorSettingComponent.java */
        public static final class e implements u<InterfaceC46937a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40574b f300080a;

            public e(InterfaceC40574b interfaceC40574b) {
                this.f300080a = interfaceC40574b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC46937a interfaceC46937aJd = this.f300080a.Jd();
                t.c(interfaceC46937aJd);
                return interfaceC46937aJd;
            }
        }

        public b(InterfaceC40574b interfaceC40574b, cv.b bVar, Fragment fragment, String str, r rVar, a aVar) {
            this.f300051a = bVar;
            u<com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package.d> uVarD = dagger.internal.g.d(com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package.g.a());
            this.f300052b = uVarD;
            this.f300053c = dagger.internal.g.d(new com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package.c(uVarD));
            u<com.avito.android.tariff_lf_constructor.configure.header_item.d> uVarD2 = dagger.internal.g.d(com.avito.android.tariff_lf_constructor.configure.header_item.f.a());
            this.f300054d = uVarD2;
            this.f300055e = dagger.internal.g.d(new com.avito.android.tariff_lf_constructor.configure.header_item.c(uVarD2));
            u<com.avito.android.tariff_lf_constructor.configure.setting.items.placing.d> uVarD3 = dagger.internal.g.d(com.avito.android.tariff_lf_constructor.configure.setting.items.placing.g.a());
            this.f300056f = uVarD3;
            this.f300057g = dagger.internal.g.d(new com.avito.android.tariff_lf_constructor.configure.setting.items.placing.c(uVarD3));
            u<com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.f> uVarD4 = dagger.internal.g.d(com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.j.a());
            this.f300058h = uVarD4;
            this.f300060j = dagger.internal.g.d(new com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.e(uVarD4, new a(interfaceC40574b)));
            A.b bVarA = A.a(4, 0);
            u<TV0.b<?, ?>> uVar = this.f300053c;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f300055e);
            list.add(this.f300057g);
            list.add(this.f300060j);
            u<com.avito.konveyor.a> uVarD5 = dagger.internal.g.d(new com.avito.android.tariff_lf_constructor.configure.setting.di.d(bVarA.b()));
            this.f300061k = uVarD5;
            u<com.avito.konveyor.adapter.a> uVarD6 = dagger.internal.g.d(new com.avito.android.tariff_lf_constructor.configure.setting.di.c(uVarD5));
            this.f300062l = uVarD6;
            this.f300063m = dagger.internal.g.d(new f(uVarD6, this.f300061k));
            this.f300064n = l.a(fragment);
            this.f300065o = l.b(str);
            this.f300066p = dagger.internal.g.d(C35217c.a());
            e eVar = new e(interfaceC40574b);
            c cVar = new c(interfaceC40574b);
            this.f300068r = cVar;
            this.f300069s = dagger.internal.g.d(new C35223i(eVar, cVar));
            this.f300070t = new d(interfaceC40574b);
            u<C28478k> uVarD7 = dagger.internal.g.d(new com.avito.android.tariff_lf_constructor.configure.setting.di.e(l.a(rVar)));
            this.f300071u = uVarD7;
            u<ScreenPerformanceTracker> uVarI = com.avito.android.advert.item.delivery_suggests.l.i(this.f300070t, uVarD7);
            this.f300072v = uVarI;
            u<P0.c> uVarD8 = dagger.internal.g.d(new com.avito.android.tariff_lf_constructor.configure.setting.viewmodel.l(this.f300065o, uVarI, this.f300066p, this.f300069s, this.f300068r, new C9181b(bVar)));
            this.f300074x = uVarD8;
            this.f300075y = dagger.internal.g.d(new g(this.f300064n, uVarD8));
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.setting.di.a
        public final void a(ConstructorSettingFragment constructorSettingFragment) {
            constructorSettingFragment.f300024n0 = this.f300062l.get();
            constructorSettingFragment.f300025o0 = this.f300063m.get();
            constructorSettingFragment.f300026p0 = this.f300075y.get();
            constructorSettingFragment.f300027q0 = this.f300072v.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f300051a.u4();
            t.c(aVarU4);
            constructorSettingFragment.f300028r0 = aVarU4;
            constructorSettingFragment.f300029s0 = new BD0.b(this.f300061k.get());
            z zVar = new z(4);
            zVar.a(this.f300052b.get());
            zVar.a(this.f300054d.get());
            zVar.a(this.f300056f.get());
            zVar.a(this.f300058h.get());
            constructorSettingFragment.f300030t0 = zVar.c();
        }
    }

    /* compiled from: DaggerConstructorSettingComponent.java */
    public static final class c implements a.InterfaceC9180a {
        public c() {
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.setting.di.a.InterfaceC9180a
        public final com.avito.android.tariff_lf_constructor.configure.setting.di.a a(ConstructorSettingFragment constructorSettingFragment, String str, InterfaceC40574b interfaceC40574b, InterfaceC39417a interfaceC39417a, r rVar) {
            interfaceC39417a.getClass();
            return new b(interfaceC40574b, interfaceC39417a, constructorSettingFragment, str, rVar, null);
        }
    }

    public static a.InterfaceC9180a a() {
        return new c();
    }
}
