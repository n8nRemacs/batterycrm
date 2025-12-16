package com.avito.android.cpt.mass_activation.di;

import Nr.InterfaceC14604a;
import Qr.InterfaceC14925a;
import Zx.C19616a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.cpt.mass_activation.CptMassActivationDialogFragment;
import com.avito.android.cpt.mass_activation.di.a;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerCptMassActivationComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class o {

    /* compiled from: DaggerCptMassActivationComponent.java */
    public static final class b implements com.avito.android.cpt.mass_activation.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f126520a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC14604a f126521b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC14925a> f126522c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f126523d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.cpt.mass_activation.mvi.d f126524e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.cpt.mass_activation.mvi.b f126525f;

        /* renamed from: g, reason: collision with root package name */
        public final u<C19616a> f126526g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.cpt.mass_activation.mvi.k f126527h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f126528i;

        /* renamed from: j, reason: collision with root package name */
        public final u<C28478k> f126529j;

        /* renamed from: k, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f126530k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.cpt.mass_activation.g f126531l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.cpt.mass_activation.ui.items.header.d> f126532m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f126533n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.cpt.mass_activation.ui.items.header.b f126534o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.cpt.mass_activation.ui.items.advert.d> f126535p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f126536q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f126537r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f126538s;

        /* compiled from: DaggerCptMassActivationComponent.java */
        public static final class a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC14604a f126539a;

            public a(InterfaceC14604a interfaceC14604a) {
                this.f126539a = interfaceC14604a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f126539a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerCptMassActivationComponent.java */
        /* renamed from: com.avito.android.cpt.mass_activation.di.o$b$b, reason: collision with other inner class name */
        public static final class C3765b implements u<InterfaceC14925a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC14604a f126540a;

            public C3765b(InterfaceC14604a interfaceC14604a) {
                this.f126540a = interfaceC14604a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14925a interfaceC14925aW9 = this.f126540a.W9();
                t.c(interfaceC14925aW9);
                return interfaceC14925aW9;
            }
        }

        /* compiled from: DaggerCptMassActivationComponent.java */
        public static final class c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC14604a f126541a;

            public c(InterfaceC14604a interfaceC14604a) {
                this.f126541a = interfaceC14604a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0Tc = this.f126541a.Tc();
                t.c(r0Tc);
                return r0Tc;
            }
        }

        /* compiled from: DaggerCptMassActivationComponent.java */
        public static final class d implements u<C19616a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC14604a f126542a;

            public d(InterfaceC14604a interfaceC14604a) {
                this.f126542a = interfaceC14604a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f126542a.l1();
            }
        }

        /* compiled from: DaggerCptMassActivationComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC14604a f126543a;

            public e(InterfaceC14604a interfaceC14604a) {
                this.f126543a = interfaceC14604a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f126543a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b() {
            throw null;
        }

        public b(InterfaceC14604a interfaceC14604a, cv.b bVar, r rVar, String[] strArr, Y41.l lVar, a aVar) {
            this.f126520a = bVar;
            this.f126521b = interfaceC14604a;
            com.avito.android.cpt.mass_activation.domain.b bVar2 = new com.avito.android.cpt.mass_activation.domain.b(dagger.internal.l.a(strArr), new C3765b(interfaceC14604a), new c(interfaceC14604a));
            this.f126524e = new com.avito.android.cpt.mass_activation.mvi.d(bVar2);
            this.f126525f = new com.avito.android.cpt.mass_activation.mvi.b(bVar2);
            this.f126527h = new com.avito.android.cpt.mass_activation.mvi.k(new Ur.c(new d(interfaceC14604a)));
            this.f126528i = new e(interfaceC14604a);
            u<C28478k> uVarD = dagger.internal.g.d(new h(dagger.internal.l.a(rVar)));
            this.f126529j = uVarD;
            this.f126530k = com.avito.android.advert.item.delivery_suggests.l.i(this.f126528i, uVarD);
            this.f126531l = new com.avito.android.cpt.mass_activation.g(new com.avito.android.cpt.mass_activation.mvi.g(this.f126524e, this.f126525f, com.avito.android.cpt.mass_activation.mvi.i.a(), this.f126527h, this.f126530k));
            u<com.avito.android.cpt.mass_activation.ui.items.header.d> uVarD2 = dagger.internal.g.d(com.avito.android.cpt.mass_activation.ui.items.header.f.a());
            this.f126532m = uVarD2;
            a aVar2 = new a(interfaceC14604a);
            this.f126533n = aVar2;
            this.f126534o = new com.avito.android.cpt.mass_activation.ui.items.header.b(uVarD2, aVar2);
            u<com.avito.android.cpt.mass_activation.ui.items.advert.d> uVarD3 = dagger.internal.g.d(com.avito.android.cpt.mass_activation.ui.items.advert.f.a());
            this.f126535p = uVarD3;
            u<com.avito.konveyor.a> uVarD4 = dagger.internal.g.d(new f(this.f126534o, new com.avito.android.cpt.mass_activation.ui.items.advert.b(uVarD3, this.f126533n)));
            this.f126536q = uVarD4;
            u<com.avito.konveyor.adapter.a> uVarD5 = dagger.internal.g.d(new com.avito.android.cpt.mass_activation.di.e(uVarD4));
            this.f126537r = uVarD5;
            this.f126538s = dagger.internal.g.d(new g(uVarD5, this.f126536q));
        }

        @Override // com.avito.android.cpt.mass_activation.di.a
        public final void a(CptMassActivationDialogFragment cptMassActivationDialogFragment) {
            cptMassActivationDialogFragment.f126413h0 = this.f126531l;
            cptMassActivationDialogFragment.f126415j0 = this.f126530k.get();
            cptMassActivationDialogFragment.f126416k0 = this.f126538s.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f126520a.u4();
            t.c(aVarU4);
            cptMassActivationDialogFragment.f126417l0 = aVarU4;
            cptMassActivationDialogFragment.f126418m0 = this.f126536q.get();
            com.avito.android.util.text.a aVarE = this.f126521b.e();
            t.c(aVarE);
            cptMassActivationDialogFragment.f126419n0 = aVarE;
        }
    }

    /* compiled from: DaggerCptMassActivationComponent.java */
    public static final class c implements a.InterfaceC3764a {
        public c() {
        }

        @Override // com.avito.android.cpt.mass_activation.di.a.InterfaceC3764a
        public final com.avito.android.cpt.mass_activation.di.a a(InterfaceC14604a interfaceC14604a, InterfaceC39417a interfaceC39417a, r rVar, String[] strArr, Y41.l lVar) {
            interfaceC39417a.getClass();
            return new b(interfaceC14604a, interfaceC39417a, rVar, strArr, lVar, null);
        }
    }

    public static a.InterfaceC3764a a() {
        return new c();
    }
}
