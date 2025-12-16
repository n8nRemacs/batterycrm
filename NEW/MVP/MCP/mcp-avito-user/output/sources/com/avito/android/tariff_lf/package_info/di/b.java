package com.avito.android.tariff_lf.package_info.di;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.view.P0;
import bD0.InterfaceC25499a;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.C30060h5;
import com.avito.android.tariff_lf.package_info.TariffPackageInfoFragment;
import com.avito.android.tariff_lf.package_info.di.c;
import com.avito.android.util.InterfaceC35745a5;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.u;
import dagger.internal.z;
import java.util.List;

/* compiled from: DaggerTariffPackageInfoComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class b {

    /* compiled from: DaggerTariffPackageInfoComponent.java */
    /* renamed from: com.avito.android.tariff_lf.package_info.di.b$b, reason: collision with other inner class name */
    public static final class C9145b implements c.a {
        public C9145b() {
        }

        @Override // com.avito.android.tariff_lf.package_info.di.c.a
        public final com.avito.android.tariff_lf.package_info.di.c a(TariffPackageInfoFragment tariffPackageInfoFragment, String str, String str2, com.avito.android.tariff_lf.common.di.a aVar, InterfaceC39417a interfaceC39417a, r rVar, Resources resources) {
            interfaceC39417a.getClass();
            return new c(aVar, interfaceC39417a, tariffPackageInfoFragment, str, str2, rVar, resources, null);
        }
    }

    /* compiled from: DaggerTariffPackageInfoComponent.java */
    public static final class c implements com.avito.android.tariff_lf.package_info.di.c {

        /* renamed from: A, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f299182A;

        /* renamed from: B, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f299183B;

        /* renamed from: C, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f299184C;

        /* renamed from: D, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f299185D;

        /* renamed from: E, reason: collision with root package name */
        public final u<TV0.d<?, ?>> f299186E;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.tariff_lf.common.di.a f299187a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f299188b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f299189c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.l f299190d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.l f299191e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf.bar.i> f299192f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf.package_info.viewmodel.a> f299193g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC25499a> f299194h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC35745a5> f299195i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf.package_info.viewmodel.e> f299196j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC28481c> f299197k;

        /* renamed from: l, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f299198l;

        /* renamed from: m, reason: collision with root package name */
        public final u<P0.c> f299199m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf.package_info.viewmodel.l> f299200n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf.package_info.recycler.f> f299201o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf.package_info.recycler.microcategory.g> f299202p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f299203q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f299204r;

        /* renamed from: s, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f299205s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf.package_info.recycler.header.f> f299206t;

        /* renamed from: u, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f299207u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf.bar.d> f299208v;

        /* renamed from: w, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f299209w;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf.package_info.viewmodel.i> f299210x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf.package_info.recycler.price_segment.g> f299211y;

        /* renamed from: z, reason: collision with root package name */
        public final com.avito.android.tariff_lf.package_info.recycler.price_segment.m f299212z;

        /* compiled from: DaggerTariffPackageInfoComponent.java */
        public static final class a implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.tariff_lf.common.di.a f299213a;

            public a(com.avito.android.tariff_lf.common.di.a aVar) {
                this.f299213a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f299213a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerTariffPackageInfoComponent.java */
        /* renamed from: com.avito.android.tariff_lf.package_info.di.b$c$b, reason: collision with other inner class name */
        public static final class C9146b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.tariff_lf.common.di.a f299214a;

            public C9146b(com.avito.android.tariff_lf.common.di.a aVar) {
                this.f299214a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f299214a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerTariffPackageInfoComponent.java */
        /* renamed from: com.avito.android.tariff_lf.package_info.di.b$c$c, reason: collision with other inner class name */
        public static final class C9147c implements u<InterfaceC25499a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.tariff_lf.common.di.a f299215a;

            public C9147c(com.avito.android.tariff_lf.common.di.a aVar) {
                this.f299215a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC25499a interfaceC25499aQl = this.f299215a.Ql();
                t.c(interfaceC25499aQl);
                return interfaceC25499aQl;
            }
        }

        public c(com.avito.android.tariff_lf.common.di.a aVar, cv.b bVar, Fragment fragment, String str, String str2, r rVar, Resources resources, a aVar2) {
            this.f299187a = aVar;
            this.f299188b = bVar;
            this.f299189c = dagger.internal.l.a(fragment);
            this.f299190d = dagger.internal.l.a(str);
            this.f299191e = dagger.internal.l.a(str2);
            u<com.avito.android.tariff_lf.bar.i> uVarD = dagger.internal.g.d(com.avito.android.tariff_lf.bar.k.a());
            this.f299192f = uVarD;
            this.f299193g = dagger.internal.g.d(new com.avito.android.tariff_lf.package_info.viewmodel.c(uVarD));
            C9147c c9147c = new C9147c(aVar);
            a aVar3 = new a(aVar);
            this.f299195i = aVar3;
            this.f299196j = dagger.internal.g.d(new com.avito.android.tariff_lf.package_info.viewmodel.h(c9147c, aVar3));
            this.f299197k = new C9146b(aVar);
            u<ScreenPerformanceTracker> uVarD2 = dagger.internal.g.d(new C30060h5(this.f299197k, new m(dagger.internal.l.a(rVar))));
            this.f299198l = uVarD2;
            u<P0.c> uVarD3 = dagger.internal.g.d(new com.avito.android.tariff_lf.package_info.viewmodel.n(this.f299190d, this.f299191e, uVarD2, this.f299193g, this.f299196j, this.f299195i));
            this.f299199m = uVarD3;
            this.f299200n = dagger.internal.g.d(new o(this.f299189c, uVarD3));
            this.f299201o = dagger.internal.g.d(com.avito.android.tariff_lf.package_info.recycler.g.a());
            u<com.avito.android.tariff_lf.package_info.recycler.microcategory.g> uVarD4 = dagger.internal.g.d(com.avito.android.tariff_lf.package_info.recycler.microcategory.h.a());
            this.f299202p = uVarD4;
            u<com.avito.konveyor.a> uVarD5 = dagger.internal.g.d(new l(new com.avito.android.tariff_lf.package_info.recycler.microcategory.b(uVarD4)));
            this.f299203q = uVarD5;
            u<com.avito.konveyor.adapter.a> uVarD6 = dagger.internal.g.d(new k(uVarD5));
            this.f299204r = uVarD6;
            this.f299205s = dagger.internal.g.d(new com.avito.android.tariff_lf.package_info.recycler.b(uVarD6, this.f299201o, this.f299203q));
            u<com.avito.android.tariff_lf.package_info.recycler.header.f> uVarD7 = dagger.internal.g.d(com.avito.android.tariff_lf.package_info.recycler.header.g.a());
            this.f299206t = uVarD7;
            this.f299207u = dagger.internal.g.d(new com.avito.android.tariff_lf.package_info.recycler.header.b(uVarD7));
            u<com.avito.android.tariff_lf.bar.d> uVarD8 = dagger.internal.g.d(com.avito.android.tariff_lf.bar.f.a());
            this.f299208v = uVarD8;
            this.f299209w = dagger.internal.g.d(new com.avito.android.tariff_lf.bar.c(uVarD8));
            u<com.avito.android.tariff_lf.package_info.viewmodel.i> uVarD9 = dagger.internal.g.d(new com.avito.android.tariff_lf.package_info.viewmodel.k(dagger.internal.l.a(resources)));
            this.f299210x = uVarD9;
            u<com.avito.android.tariff_lf.package_info.recycler.price_segment.g> uVarD10 = dagger.internal.g.d(new com.avito.android.tariff_lf.package_info.recycler.price_segment.i(uVarD9));
            this.f299211y = uVarD10;
            com.avito.android.tariff_lf.package_info.recycler.price_segment.m mVar = new com.avito.android.tariff_lf.package_info.recycler.price_segment.m(uVarD10);
            this.f299212z = mVar;
            this.f299182A = dagger.internal.g.d(new com.avito.android.tariff_lf.package_info.recycler.price_segment.c(mVar));
            A.b bVarA = A.a(4, 0);
            u<TV0.b<?, ?>> uVar = this.f299205s;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f299207u);
            list.add(this.f299209w);
            list.add(this.f299182A);
            u<com.avito.konveyor.a> uVarD11 = dagger.internal.g.d(new j(bVarA.b()));
            this.f299183B = uVarD11;
            u<com.avito.konveyor.adapter.a> uVarD12 = dagger.internal.g.d(new i(uVarD11));
            this.f299184C = uVarD12;
            this.f299185D = dagger.internal.g.d(new n(uVarD12, this.f299183B));
            this.f299186E = dagger.internal.g.d(this.f299212z);
        }

        @Override // com.avito.android.tariff_lf.package_info.di.c
        public final void a(TariffPackageInfoFragment tariffPackageInfoFragment) {
            tariffPackageInfoFragment.f299162n0 = this.f299200n.get();
            this.f299183B.get();
            tariffPackageInfoFragment.f299163o0 = this.f299184C.get();
            tariffPackageInfoFragment.f299164p0 = this.f299185D.get();
            com.avito.android.util.text.a aVarE = this.f299187a.e();
            t.c(aVarE);
            tariffPackageInfoFragment.f299165q0 = aVarE;
            z zVar = new z(4);
            zVar.a(this.f299201o.get());
            zVar.a(this.f299206t.get());
            zVar.a(this.f299208v.get());
            zVar.a(this.f299186E.get());
            tariffPackageInfoFragment.f299166r0 = zVar.c();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f299188b.u4();
            t.c(aVarU4);
            tariffPackageInfoFragment.f299167s0 = aVarU4;
            tariffPackageInfoFragment.f299168t0 = this.f299198l.get();
        }
    }

    public static c.a a() {
        return new C9145b();
    }
}
