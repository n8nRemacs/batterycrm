package com.avito.android.cpt.mass_activation.di;

import Nr.InterfaceC14604a;
import Qr.InterfaceC14925a;
import Zx.C19616a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.cpt.mass_activation.CptMassActivationDialogV2Fragment;
import com.avito.android.cpt.mass_activation.di.i;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerCptMassActivationV2Component.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class p {

    /* compiled from: DaggerCptMassActivationV2Component.java */
    public static final class b implements i {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f126544a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC14604a f126545b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC14925a> f126546c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f126547d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.cpt.mass_activation.mvi.d f126548e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.cpt.mass_activation.mvi.b f126549f;

        /* renamed from: g, reason: collision with root package name */
        public final u<C19616a> f126550g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.cpt.mass_activation.mvi.k f126551h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f126552i;

        /* renamed from: j, reason: collision with root package name */
        public final u<C28478k> f126553j;

        /* renamed from: k, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f126554k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.cpt.mass_activation.g f126555l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.cpt.mass_activation.ui.items.advert_v2.d> f126556m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f126557n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f126558o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f126559p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f126560q;

        /* compiled from: DaggerCptMassActivationV2Component.java */
        public static final class a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC14604a f126561a;

            public a(InterfaceC14604a interfaceC14604a) {
                this.f126561a = interfaceC14604a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f126561a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerCptMassActivationV2Component.java */
        /* renamed from: com.avito.android.cpt.mass_activation.di.p$b$b, reason: collision with other inner class name */
        public static final class C3766b implements u<InterfaceC14925a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC14604a f126562a;

            public C3766b(InterfaceC14604a interfaceC14604a) {
                this.f126562a = interfaceC14604a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14925a interfaceC14925aW9 = this.f126562a.W9();
                t.c(interfaceC14925aW9);
                return interfaceC14925aW9;
            }
        }

        /* compiled from: DaggerCptMassActivationV2Component.java */
        public static final class c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC14604a f126563a;

            public c(InterfaceC14604a interfaceC14604a) {
                this.f126563a = interfaceC14604a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0Tc = this.f126563a.Tc();
                t.c(r0Tc);
                return r0Tc;
            }
        }

        /* compiled from: DaggerCptMassActivationV2Component.java */
        public static final class d implements u<C19616a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC14604a f126564a;

            public d(InterfaceC14604a interfaceC14604a) {
                this.f126564a = interfaceC14604a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f126564a.l1();
            }
        }

        /* compiled from: DaggerCptMassActivationV2Component.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC14604a f126565a;

            public e(InterfaceC14604a interfaceC14604a) {
                this.f126565a = interfaceC14604a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f126565a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b() {
            throw null;
        }

        public b(InterfaceC14604a interfaceC14604a, cv.b bVar, r rVar, String[] strArr, Y41.l lVar, a aVar) {
            this.f126544a = bVar;
            this.f126545b = interfaceC14604a;
            com.avito.android.cpt.mass_activation.domain.b bVar2 = new com.avito.android.cpt.mass_activation.domain.b(dagger.internal.l.a(strArr), new C3766b(interfaceC14604a), new c(interfaceC14604a));
            this.f126548e = new com.avito.android.cpt.mass_activation.mvi.d(bVar2);
            this.f126549f = new com.avito.android.cpt.mass_activation.mvi.b(bVar2);
            this.f126551h = new com.avito.android.cpt.mass_activation.mvi.k(new Ur.c(new d(interfaceC14604a)));
            this.f126552i = new e(interfaceC14604a);
            u<C28478k> uVarD = dagger.internal.g.d(new n(dagger.internal.l.a(rVar)));
            this.f126553j = uVarD;
            this.f126554k = com.avito.android.advert.item.delivery_suggests.l.i(this.f126552i, uVarD);
            this.f126555l = new com.avito.android.cpt.mass_activation.g(new com.avito.android.cpt.mass_activation.mvi.g(this.f126548e, this.f126549f, com.avito.android.cpt.mass_activation.mvi.i.a(), this.f126551h, this.f126554k));
            u<com.avito.android.cpt.mass_activation.ui.items.advert_v2.d> uVarD2 = dagger.internal.g.d(com.avito.android.cpt.mass_activation.ui.items.advert_v2.f.a());
            this.f126556m = uVarD2;
            u<com.avito.konveyor.a> uVarD3 = dagger.internal.g.d(new l(new com.avito.android.cpt.mass_activation.ui.items.advert_v2.b(uVarD2, new a(interfaceC14604a))));
            this.f126558o = uVarD3;
            u<com.avito.konveyor.adapter.a> uVarD4 = dagger.internal.g.d(new k(uVarD3));
            this.f126559p = uVarD4;
            this.f126560q = dagger.internal.g.d(new m(uVarD4, this.f126558o));
        }

        @Override // com.avito.android.cpt.mass_activation.di.i
        public final void a(CptMassActivationDialogV2Fragment cptMassActivationDialogV2Fragment) {
            cptMassActivationDialogV2Fragment.f126447h0 = this.f126555l;
            cptMassActivationDialogV2Fragment.f126449j0 = this.f126554k.get();
            cptMassActivationDialogV2Fragment.f126450k0 = this.f126560q.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f126544a.u4();
            t.c(aVarU4);
            cptMassActivationDialogV2Fragment.f126451l0 = aVarU4;
            cptMassActivationDialogV2Fragment.f126452m0 = this.f126558o.get();
            com.avito.android.util.text.a aVarE = this.f126545b.e();
            t.c(aVarE);
            cptMassActivationDialogV2Fragment.f126453n0 = aVarE;
        }
    }

    /* compiled from: DaggerCptMassActivationV2Component.java */
    public static final class c implements i.a {
        public c() {
        }

        @Override // com.avito.android.cpt.mass_activation.di.i.a
        public final i a(InterfaceC14604a interfaceC14604a, InterfaceC39417a interfaceC39417a, r rVar, String[] strArr, Y41.l lVar) {
            interfaceC39417a.getClass();
            return new b(interfaceC14604a, interfaceC39417a, rVar, strArr, lVar, null);
        }
    }

    public static i.a a() {
        return new c();
    }
}
