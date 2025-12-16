package com.avito.android.tariff_lf_constructor.configure.subcategories.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.C30060h5;
import com.avito.android.tariff_lf_constructor.configure.checkbox_selector.group.m;
import com.avito.android.tariff_lf_constructor.configure.checkbox_selector.l;
import com.avito.android.tariff_lf_constructor.configure.subcategories.ConstructorConfigureSubCategoryFragment;
import com.avito.android.tariff_lf_constructor.configure.subcategories.di.a;
import com.avito.android.tariff_lf_constructor.configure.subcategories.di.g;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.konveyor.adapter.j;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.u;
import dagger.internal.z;
import gD0.InterfaceC40574b;
import java.util.List;
import pD0.InterfaceC46937a;

/* compiled from: DaggerConfigureSubCategoriesComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class i {

    /* compiled from: DaggerConfigureSubCategoriesComponent.java */
    public static final class b implements com.avito.android.tariff_lf_constructor.configure.subcategories.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final u<l> f300450a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf_constructor.configure.checkbox_selector.group.c> f300451b;

        /* renamed from: c, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f300452c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf_constructor.configure.checkbox_selector.single.c> f300453d;

        /* renamed from: e, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f300454e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f300455f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f300456g;

        /* renamed from: h, reason: collision with root package name */
        public final u<j> f300457h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.l f300458i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.l f300459j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.l f300460k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.l f300461l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC46937a> f300462m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC35745a5> f300463n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.d> f300464o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf_constructor.configure.a> f300465p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf_constructor.configure.checkbox_selector.a> f300466q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.a> f300467r;

        /* renamed from: s, reason: collision with root package name */
        public final u<InterfaceC28481c> f300468s;

        /* renamed from: t, reason: collision with root package name */
        public final u<C28478k> f300469t;

        /* renamed from: u, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f300470u;

        /* renamed from: v, reason: collision with root package name */
        public final u<P0.c> f300471v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.h> f300472w;

        /* compiled from: DaggerConfigureSubCategoriesComponent.java */
        public static final class a implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40574b f300473a;

            public a(InterfaceC40574b interfaceC40574b) {
                this.f300473a = interfaceC40574b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f300473a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerConfigureSubCategoriesComponent.java */
        /* renamed from: com.avito.android.tariff_lf_constructor.configure.subcategories.di.i$b$b, reason: collision with other inner class name */
        public static final class C9188b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40574b f300474a;

            public C9188b(InterfaceC40574b interfaceC40574b) {
                this.f300474a = interfaceC40574b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f300474a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerConfigureSubCategoriesComponent.java */
        public static final class c implements u<InterfaceC46937a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40574b f300475a;

            public c(InterfaceC40574b interfaceC40574b) {
                this.f300475a = interfaceC40574b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC46937a interfaceC46937aJd = this.f300475a.Jd();
                t.c(interfaceC46937aJd);
                return interfaceC46937aJd;
            }
        }

        public b(InterfaceC40574b interfaceC40574b, Fragment fragment, String str, String str2, String str3, r rVar, a aVar) {
            u<l> uVarD = dagger.internal.g.d(g.a.f300447a);
            this.f300450a = uVarD;
            u<com.avito.android.tariff_lf_constructor.configure.checkbox_selector.group.c> uVarD2 = dagger.internal.g.d(new m(uVarD));
            this.f300451b = uVarD2;
            this.f300452c = dagger.internal.g.d(new com.avito.android.tariff_lf_constructor.configure.checkbox_selector.group.b(uVarD2));
            u<com.avito.android.tariff_lf_constructor.configure.checkbox_selector.single.c> uVarD3 = dagger.internal.g.d(new com.avito.android.tariff_lf_constructor.configure.checkbox_selector.single.f(this.f300450a));
            this.f300453d = uVarD3;
            this.f300454e = dagger.internal.g.d(new com.avito.android.tariff_lf_constructor.configure.checkbox_selector.single.b(uVarD3));
            A.b bVarA = A.a(2, 0);
            u<TV0.b<?, ?>> uVar = this.f300452c;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f300454e);
            u<com.avito.konveyor.a> uVarD4 = dagger.internal.g.d(new d(bVarA.b()));
            this.f300455f = uVarD4;
            u<com.avito.konveyor.adapter.a> uVarD5 = dagger.internal.g.d(new com.avito.android.tariff_lf_constructor.configure.subcategories.di.c(uVarD4));
            this.f300456g = uVarD5;
            this.f300457h = dagger.internal.g.d(new f(uVarD5, this.f300455f));
            this.f300458i = dagger.internal.l.a(fragment);
            this.f300459j = dagger.internal.l.a(str);
            this.f300460k = dagger.internal.l.a(str2);
            this.f300461l = dagger.internal.l.a(str3);
            c cVar = new c(interfaceC40574b);
            this.f300462m = cVar;
            a aVar2 = new a(interfaceC40574b);
            this.f300463n = aVar2;
            this.f300464o = dagger.internal.g.d(new com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.g(cVar, aVar2));
            this.f300465p = dagger.internal.g.d(new com.avito.android.tariff_lf_constructor.configure.c(this.f300462m, this.f300463n));
            u<com.avito.android.tariff_lf_constructor.configure.checkbox_selector.a> uVarD6 = dagger.internal.g.d(com.avito.android.tariff_lf_constructor.configure.checkbox_selector.c.a());
            this.f300466q = uVarD6;
            this.f300467r = dagger.internal.g.d(new com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.c(uVarD6));
            this.f300468s = new C9188b(interfaceC40574b);
            u<C28478k> uVarD7 = dagger.internal.g.d(new e(dagger.internal.l.a(rVar)));
            this.f300469t = uVarD7;
            u<ScreenPerformanceTracker> uVarD8 = dagger.internal.g.d(new C30060h5(this.f300468s, uVarD7));
            this.f300470u = uVarD8;
            u<P0.c> uVarD9 = dagger.internal.g.d(new com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.j(this.f300459j, this.f300460k, this.f300461l, uVarD8, this.f300464o, this.f300465p, this.f300467r, this.f300450a, this.f300463n));
            this.f300471v = uVarD9;
            this.f300472w = dagger.internal.g.d(new h(this.f300458i, uVarD9));
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.subcategories.di.a
        public final void a(ConstructorConfigureSubCategoryFragment constructorConfigureSubCategoryFragment) {
            constructorConfigureSubCategoryFragment.f300419n0 = this.f300456g.get();
            constructorConfigureSubCategoryFragment.f300420o0 = this.f300457h.get();
            constructorConfigureSubCategoryFragment.f300421p0 = this.f300472w.get();
            constructorConfigureSubCategoryFragment.f300422q0 = this.f300470u.get();
            z zVar = new z(2);
            zVar.a(this.f300451b.get());
            zVar.a(this.f300453d.get());
            constructorConfigureSubCategoryFragment.f300423r0 = zVar.c();
        }
    }

    /* compiled from: DaggerConfigureSubCategoriesComponent.java */
    public static final class c implements a.InterfaceC9186a {
        public c() {
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.subcategories.di.a.InterfaceC9186a
        public final com.avito.android.tariff_lf_constructor.configure.subcategories.di.a a(ConstructorConfigureSubCategoryFragment constructorConfigureSubCategoryFragment, String str, String str2, String str3, InterfaceC40574b interfaceC40574b, r rVar) {
            return new b(interfaceC40574b, constructorConfigureSubCategoryFragment, str, str2, str3, rVar, null);
        }
    }

    public static a.InterfaceC9186a a() {
        return new c();
    }
}
