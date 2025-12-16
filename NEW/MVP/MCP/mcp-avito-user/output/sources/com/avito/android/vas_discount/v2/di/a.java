package com.avito.android.vas_discount.v2.di;

import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.C30060h5;
import com.avito.android.util.R0;
import com.avito.android.vas_discount.v2.di.c;
import com.avito.android.vas_discount.v2.di.h;
import com.avito.android.vas_discount.v2.di.i;
import com.avito.android.vas_discount.v2.ui.VasDiscountV2DialogFragment;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import dagger.internal.z;
import java.util.List;
import java.util.Set;
import mL0.InterfaceC43978a;
import rL0.C47562b;
import xJ0.InterfaceC49849a;
import xJ0.InterfaceC49850b;

/* compiled from: DaggerVasDiscountV2Component.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerVasDiscountV2Component.java */
    public static final class b implements c.a {
        public b() {
        }

        @Override // com.avito.android.vas_discount.v2.di.c.a
        public final com.avito.android.vas_discount.v2.di.c a(InterfaceC39417a interfaceC39417a, com.avito.android.vas_discount.di.d dVar, r rVar, String str) {
            interfaceC39417a.getClass();
            return new c(interfaceC39417a, dVar, rVar, str, null);
        }
    }

    /* compiled from: DaggerVasDiscountV2Component.java */
    public static final class c implements com.avito.android.vas_discount.v2.di.c {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f319747a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.vas_discount.v2.di.b> f319748b = dagger.internal.g.d(i.a.f319785a);

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28481c> f319749c;

        /* renamed from: d, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f319750d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC43978a> f319751e;

        /* renamed from: f, reason: collision with root package name */
        public final u<R0> f319752f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.vas_discount.v2.mvi.d f319753g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.vas_discount.v2.mvi.b f319754h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.vas_discount.business.d> f319755i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.vas_discount.v2.mvi.k f319756j;

        /* renamed from: k, reason: collision with root package name */
        public final C47562b f319757k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC49850b> f319758l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f319759m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC49849a> f319760n;

        /* renamed from: o, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f319761o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.vas_discount.ui.items.title.e> f319762p;

        /* renamed from: q, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f319763q;

        /* renamed from: r, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f319764r;

        /* renamed from: s, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f319765s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.vas_discount.ui.items.button.e> f319766t;

        /* renamed from: u, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f319767u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f319768v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f319769w;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f319770x;

        /* renamed from: y, reason: collision with root package name */
        public final u<TV0.d<?, ?>> f319771y;

        /* renamed from: z, reason: collision with root package name */
        public final u<TV0.d<?, ?>> f319772z;

        /* compiled from: DaggerVasDiscountV2Component.java */
        /* renamed from: com.avito.android.vas_discount.v2.di.a$c$a, reason: collision with other inner class name */
        public static final class C9911a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.vas_discount.di.d f319773a;

            public C9911a(com.avito.android.vas_discount.di.d dVar) {
                this.f319773a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f319773a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerVasDiscountV2Component.java */
        public static final class b implements u<InterfaceC43978a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.vas_discount.di.d f319774a;

            public b(com.avito.android.vas_discount.di.d dVar) {
                this.f319774a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC43978a interfaceC43978aAa = this.f319774a.Aa();
                t.c(interfaceC43978aAa);
                return interfaceC43978aAa;
            }
        }

        /* compiled from: DaggerVasDiscountV2Component.java */
        /* renamed from: com.avito.android.vas_discount.v2.di.a$c$c, reason: collision with other inner class name */
        public static final class C9912c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.vas_discount.di.d f319775a;

            public C9912c(com.avito.android.vas_discount.di.d dVar) {
                this.f319775a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f319775a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerVasDiscountV2Component.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.vas_discount.di.d f319776a;

            public d(com.avito.android.vas_discount.di.d dVar) {
                this.f319776a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f319776a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerVasDiscountV2Component.java */
        public static final class e implements u<InterfaceC49850b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.vas_discount.di.d f319777a;

            public e(com.avito.android.vas_discount.di.d dVar) {
                this.f319777a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f319777a.x1();
            }
        }

        public c(cv.b bVar, com.avito.android.vas_discount.di.d dVar, r rVar, String str, C9910a c9910a) {
            this.f319747a = bVar;
            this.f319749c = new d(dVar);
            this.f319750d = dagger.internal.g.d(new C30060h5(this.f319749c, new com.avito.android.vas_discount.v2.di.e(dagger.internal.l.a(rVar))));
            dagger.internal.l lVarA = dagger.internal.l.a(str);
            com.avito.android.vas_discount.v2.domain.b bVar2 = new com.avito.android.vas_discount.v2.domain.b(new b(dVar), new C9912c(dVar));
            this.f319753g = new com.avito.android.vas_discount.v2.mvi.d(lVarA, bVar2);
            this.f319754h = new com.avito.android.vas_discount.v2.mvi.b(lVarA, bVar2);
            u<com.avito.android.vas_discount.business.d> uVarD = dagger.internal.g.d(com.avito.android.vas_discount.business.f.a());
            this.f319755i = uVarD;
            this.f319756j = new com.avito.android.vas_discount.v2.mvi.k(uVarD);
            this.f319757k = new C47562b(new com.avito.android.vas_discount.v2.mvi.g(this.f319753g, this.f319754h, com.avito.android.vas_discount.v2.mvi.i.a(), this.f319756j, this.f319750d));
            u<InterfaceC49849a> uVarD2 = dagger.internal.g.d(new k(new e(dVar), new C9911a(dVar), this.f319748b));
            this.f319760n = uVarD2;
            this.f319761o = dagger.internal.g.d(new j(uVarD2));
            u<com.avito.android.vas_discount.ui.items.title.e> uVarD3 = dagger.internal.g.d(h.a.f319784a);
            this.f319762p = uVarD3;
            this.f319763q = dagger.internal.g.d(new g(uVarD3));
            this.f319764r = B.a(com.avito.android.konveyor_adapter_module.d.a());
            this.f319765s = dagger.internal.g.d(new com.avito.android.vas_discount.ui.items.description.c(com.avito.android.vas_discount.ui.items.description.g.a()));
            u<com.avito.android.vas_discount.ui.items.button.e> uVarD4 = dagger.internal.g.d(com.avito.android.vas_discount.ui.items.button.f.a());
            this.f319766t = uVarD4;
            this.f319767u = dagger.internal.g.d(new com.avito.android.vas_discount.ui.items.button.c(uVarD4));
            A.b bVarA = A.a(4, 1);
            u<TV0.b<?, ?>> uVar = this.f319761o;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f319763q);
            bVarA.f393938b.add(this.f319764r);
            list.add(this.f319765s);
            list.add(this.f319767u);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f319768v = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f319769w = uVarH;
            this.f319770x = dagger.internal.g.d(new f(uVarH, this.f319768v));
            this.f319771y = dagger.internal.g.d(new l(this.f319760n));
            this.f319772z = dagger.internal.g.d(com.avito.android.vas_discount.ui.items.description.g.a());
        }

        @Override // com.avito.android.vas_discount.v2.di.c
        public final void a(VasDiscountV2DialogFragment vasDiscountV2DialogFragment) {
            vasDiscountV2DialogFragment.f319827i0 = this.f319748b.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f319747a.u4();
            t.c(aVarU4);
            vasDiscountV2DialogFragment.f319828j0 = aVarU4;
            vasDiscountV2DialogFragment.f319829k0 = this.f319750d.get();
            vasDiscountV2DialogFragment.f319830l0 = this.f319757k;
            vasDiscountV2DialogFragment.f319832n0 = this.f319769w.get();
            vasDiscountV2DialogFragment.f319833o0 = this.f319770x.get();
            z zVar = new z(4);
            zVar.a(this.f319771y.get());
            zVar.a(this.f319772z.get());
            zVar.a(this.f319766t.get());
            zVar.a(this.f319762p.get());
            vasDiscountV2DialogFragment.f319834p0 = zVar.c();
        }
    }

    public static c.a a() {
        return new b();
    }
}
