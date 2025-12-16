package com.avito.android.tariff_lf_constructor.configure.category.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.tariff_lf_constructor.configure.category.ConstructorConfigureCategoryFragment;
import com.avito.android.tariff_lf_constructor.configure.category.di.a;
import com.avito.android.tariff_lf_constructor.configure.category.viewmodel.i;
import com.avito.android.tariff_lf_constructor.configure.category.viewmodel.k;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.konveyor.adapter.j;
import dagger.internal.A;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import dagger.internal.z;
import fD0.C40279a;
import gD0.InterfaceC40574b;
import java.util.List;
import pD0.InterfaceC46937a;

/* compiled from: DaggerConstructorConfigureCategoryComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class h {

    /* compiled from: DaggerConstructorConfigureCategoryComponent.java */
    public static final class b implements com.avito.android.tariff_lf_constructor.configure.category.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf_constructor.configure.category.items.content.d> f299366a;

        /* renamed from: b, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f299367b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf_constructor.configure.header_item.d> f299368c;

        /* renamed from: d, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f299369d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f299370e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f299371f;

        /* renamed from: g, reason: collision with root package name */
        public final u<j> f299372g;

        /* renamed from: h, reason: collision with root package name */
        public final l f299373h;

        /* renamed from: i, reason: collision with root package name */
        public final l f299374i;

        /* renamed from: j, reason: collision with root package name */
        public final l f299375j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf_constructor.configure.category.viewmodel.a> f299376k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC46937a> f299377l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC35745a5> f299378m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf_constructor.configure.category.viewmodel.e> f299379n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf_constructor.configure.a> f299380o;

        /* renamed from: p, reason: collision with root package name */
        public final u<InterfaceC28481c> f299381p;

        /* renamed from: q, reason: collision with root package name */
        public final u<C28478k> f299382q;

        /* renamed from: r, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f299383r;

        /* renamed from: s, reason: collision with root package name */
        public final u<P0.c> f299384s;

        /* renamed from: t, reason: collision with root package name */
        public final u<i> f299385t;

        /* compiled from: DaggerConstructorConfigureCategoryComponent.java */
        public static final class a implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40574b f299386a;

            public a(InterfaceC40574b interfaceC40574b) {
                this.f299386a = interfaceC40574b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f299386a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerConstructorConfigureCategoryComponent.java */
        /* renamed from: com.avito.android.tariff_lf_constructor.configure.category.di.h$b$b, reason: collision with other inner class name */
        public static final class C9154b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40574b f299387a;

            public C9154b(InterfaceC40574b interfaceC40574b) {
                this.f299387a = interfaceC40574b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f299387a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerConstructorConfigureCategoryComponent.java */
        public static final class c implements u<InterfaceC46937a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40574b f299388a;

            public c(InterfaceC40574b interfaceC40574b) {
                this.f299388a = interfaceC40574b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC46937a interfaceC46937aJd = this.f299388a.Jd();
                t.c(interfaceC46937aJd);
                return interfaceC46937aJd;
            }
        }

        public b(InterfaceC40574b interfaceC40574b, Fragment fragment, String str, String str2, r rVar, a aVar) {
            u<com.avito.android.tariff_lf_constructor.configure.category.items.content.d> uVarD = dagger.internal.g.d(com.avito.android.tariff_lf_constructor.configure.category.items.content.g.a());
            this.f299366a = uVarD;
            this.f299367b = dagger.internal.g.d(new com.avito.android.tariff_lf_constructor.configure.category.items.content.c(uVarD));
            u<com.avito.android.tariff_lf_constructor.configure.header_item.d> uVarD2 = dagger.internal.g.d(com.avito.android.tariff_lf_constructor.configure.header_item.f.a());
            this.f299368c = uVarD2;
            this.f299369d = dagger.internal.g.d(new com.avito.android.tariff_lf_constructor.configure.header_item.c(uVarD2));
            A.b bVarA = A.a(2, 0);
            u<TV0.b<?, ?>> uVar = this.f299367b;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f299369d);
            u<com.avito.konveyor.a> uVarD3 = dagger.internal.g.d(new d(bVarA.b()));
            this.f299370e = uVarD3;
            u<com.avito.konveyor.adapter.a> uVarD4 = dagger.internal.g.d(new com.avito.android.tariff_lf_constructor.configure.category.di.c(uVarD3));
            this.f299371f = uVarD4;
            this.f299372g = dagger.internal.g.d(new f(uVarD4, this.f299370e));
            this.f299373h = l.a(fragment);
            this.f299374i = l.a(str);
            this.f299375j = l.a(str2);
            this.f299376k = dagger.internal.g.d(com.avito.android.tariff_lf_constructor.configure.category.viewmodel.c.a());
            c cVar = new c(interfaceC40574b);
            this.f299377l = cVar;
            a aVar2 = new a(interfaceC40574b);
            this.f299378m = aVar2;
            this.f299379n = dagger.internal.g.d(new com.avito.android.tariff_lf_constructor.configure.category.viewmodel.h(cVar, aVar2));
            this.f299380o = dagger.internal.g.d(new com.avito.android.tariff_lf_constructor.configure.c(this.f299377l, this.f299378m));
            this.f299381p = new C9154b(interfaceC40574b);
            u<C28478k> uVarD5 = dagger.internal.g.d(new e(l.a(rVar)));
            this.f299382q = uVarD5;
            u<ScreenPerformanceTracker> uVarI = com.avito.android.advert.item.delivery_suggests.l.i(this.f299381p, uVarD5);
            this.f299383r = uVarI;
            u<P0.c> uVarD6 = dagger.internal.g.d(new k(this.f299374i, this.f299375j, uVarI, this.f299376k, this.f299379n, this.f299380o, this.f299378m));
            this.f299384s = uVarD6;
            this.f299385t = dagger.internal.g.d(new g(this.f299373h, uVarD6));
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.category.di.a
        public final void a(ConstructorConfigureCategoryFragment constructorConfigureCategoryFragment) {
            constructorConfigureCategoryFragment.f299340n0 = this.f299371f.get();
            constructorConfigureCategoryFragment.f299341o0 = this.f299372g.get();
            constructorConfigureCategoryFragment.f299342p0 = this.f299385t.get();
            constructorConfigureCategoryFragment.f299343q0 = this.f299383r.get();
            constructorConfigureCategoryFragment.f299344r0 = new C40279a(this.f299370e.get());
            z zVar = new z(2);
            zVar.a(this.f299366a.get());
            zVar.a(this.f299368c.get());
            constructorConfigureCategoryFragment.f299345s0 = zVar.c();
        }
    }

    /* compiled from: DaggerConstructorConfigureCategoryComponent.java */
    public static final class c implements a.InterfaceC9152a {
        public c() {
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.category.di.a.InterfaceC9152a
        public final com.avito.android.tariff_lf_constructor.configure.category.di.a a(ConstructorConfigureCategoryFragment constructorConfigureCategoryFragment, String str, String str2, InterfaceC40574b interfaceC40574b, r rVar) {
            return new b(interfaceC40574b, constructorConfigureCategoryFragment, str, str2, rVar, null);
        }
    }

    public static a.InterfaceC9152a a() {
        return new c();
    }
}
