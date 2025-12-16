package com.avito.android.tariff_lf_constructor.configure.size.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.tariff_lf_constructor.configure.size.ConstructorConfigureSizeFragment;
import com.avito.android.tariff_lf_constructor.configure.size.di.a;
import com.avito.android.tariff_lf_constructor.configure.size.viewmodel.C35226c;
import com.avito.android.tariff_lf_constructor.configure.size.viewmodel.InterfaceC35224a;
import com.avito.android.tariff_lf_constructor.configure.size.viewmodel.InterfaceC35228e;
import com.avito.android.tariff_lf_constructor.configure.size.viewmodel.i;
import com.avito.android.tariff_lf_constructor.configure.size.viewmodel.k;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.konveyor.adapter.j;
import dagger.internal.A;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import gD0.InterfaceC40574b;
import java.util.Collections;
import pD0.InterfaceC46937a;

/* compiled from: DaggerConstructorConfigureSizeComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class h {

    /* compiled from: DaggerConstructorConfigureSizeComponent.java */
    public static final class b implements com.avito.android.tariff_lf_constructor.configure.size.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf_constructor.configure.size.items.size.d> f300276a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f300277b;

        /* renamed from: c, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f300278c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f300279d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f300280e;

        /* renamed from: f, reason: collision with root package name */
        public final u<j> f300281f;

        /* renamed from: g, reason: collision with root package name */
        public final l f300282g;

        /* renamed from: h, reason: collision with root package name */
        public final l f300283h;

        /* renamed from: i, reason: collision with root package name */
        public final l f300284i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC35224a> f300285j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC46937a> f300286k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC35745a5> f300287l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC35228e> f300288m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf_constructor.configure.a> f300289n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC28481c> f300290o;

        /* renamed from: p, reason: collision with root package name */
        public final u<C28478k> f300291p;

        /* renamed from: q, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f300292q;

        /* renamed from: r, reason: collision with root package name */
        public final u<P0.c> f300293r;

        /* renamed from: s, reason: collision with root package name */
        public final u<i> f300294s;

        /* compiled from: DaggerConstructorConfigureSizeComponent.java */
        public static final class a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40574b f300295a;

            public a(InterfaceC40574b interfaceC40574b) {
                this.f300295a = interfaceC40574b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f300295a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerConstructorConfigureSizeComponent.java */
        /* renamed from: com.avito.android.tariff_lf_constructor.configure.size.di.h$b$b, reason: collision with other inner class name */
        public static final class C9184b implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40574b f300296a;

            public C9184b(InterfaceC40574b interfaceC40574b) {
                this.f300296a = interfaceC40574b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f300296a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerConstructorConfigureSizeComponent.java */
        public static final class c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40574b f300297a;

            public c(InterfaceC40574b interfaceC40574b) {
                this.f300297a = interfaceC40574b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f300297a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerConstructorConfigureSizeComponent.java */
        public static final class d implements u<InterfaceC46937a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40574b f300298a;

            public d(InterfaceC40574b interfaceC40574b) {
                this.f300298a = interfaceC40574b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC46937a interfaceC46937aJd = this.f300298a.Jd();
                t.c(interfaceC46937aJd);
                return interfaceC46937aJd;
            }
        }

        public b(InterfaceC40574b interfaceC40574b, Fragment fragment, String str, String str2, r rVar, a aVar) {
            u<com.avito.android.tariff_lf_constructor.configure.size.items.size.d> uVarD = dagger.internal.g.d(com.avito.android.tariff_lf_constructor.configure.size.items.size.g.a());
            this.f300276a = uVarD;
            this.f300278c = dagger.internal.g.d(new com.avito.android.tariff_lf_constructor.configure.size.items.size.c(uVarD, new a(interfaceC40574b)));
            A.b bVarA = A.a(1, 0);
            bVarA.f393937a.add(this.f300278c);
            u<com.avito.konveyor.a> uVarD2 = dagger.internal.g.d(new com.avito.android.tariff_lf_constructor.configure.size.di.d(bVarA.b()));
            this.f300279d = uVarD2;
            u<com.avito.konveyor.adapter.a> uVarD3 = dagger.internal.g.d(new com.avito.android.tariff_lf_constructor.configure.size.di.c(uVarD2));
            this.f300280e = uVarD3;
            this.f300281f = dagger.internal.g.d(new f(uVarD3, this.f300279d));
            this.f300282g = l.a(fragment);
            this.f300283h = l.a(str);
            this.f300284i = l.a(str2);
            this.f300285j = dagger.internal.g.d(C35226c.a());
            d dVar = new d(interfaceC40574b);
            this.f300286k = dVar;
            C9184b c9184b = new C9184b(interfaceC40574b);
            this.f300287l = c9184b;
            this.f300288m = dagger.internal.g.d(new com.avito.android.tariff_lf_constructor.configure.size.viewmodel.h(dVar, c9184b));
            this.f300289n = dagger.internal.g.d(new com.avito.android.tariff_lf_constructor.configure.c(this.f300286k, this.f300287l));
            this.f300290o = new c(interfaceC40574b);
            u<C28478k> uVarD4 = dagger.internal.g.d(new e(l.a(rVar)));
            this.f300291p = uVarD4;
            u<ScreenPerformanceTracker> uVarI = com.avito.android.advert.item.delivery_suggests.l.i(this.f300290o, uVarD4);
            this.f300292q = uVarI;
            u<P0.c> uVarD5 = dagger.internal.g.d(new k(this.f300283h, this.f300284i, uVarI, this.f300285j, this.f300288m, this.f300289n, this.f300287l));
            this.f300293r = uVarD5;
            this.f300294s = dagger.internal.g.d(new g(this.f300282g, uVarD5));
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.size.di.a
        public final void a(ConstructorConfigureSizeFragment constructorConfigureSizeFragment) {
            constructorConfigureSizeFragment.f300247n0 = this.f300280e.get();
            constructorConfigureSizeFragment.f300248o0 = this.f300281f.get();
            constructorConfigureSizeFragment.f300249p0 = this.f300294s.get();
            constructorConfigureSizeFragment.f300250q0 = this.f300292q.get();
            constructorConfigureSizeFragment.f300251r0 = new com.avito.android.tariff_lf_constructor.configure.size.ui.c(this.f300279d.get());
            constructorConfigureSizeFragment.f300252s0 = Collections.singleton(this.f300276a.get());
        }
    }

    /* compiled from: DaggerConstructorConfigureSizeComponent.java */
    public static final class c implements a.InterfaceC9182a {
        public c() {
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.size.di.a.InterfaceC9182a
        public final com.avito.android.tariff_lf_constructor.configure.size.di.a a(ConstructorConfigureSizeFragment constructorConfigureSizeFragment, String str, String str2, InterfaceC40574b interfaceC40574b, r rVar) {
            return new b(interfaceC40574b, constructorConfigureSizeFragment, str, str2, rVar, null);
        }
    }

    public static a.InterfaceC9182a a() {
        return new c();
    }
}
