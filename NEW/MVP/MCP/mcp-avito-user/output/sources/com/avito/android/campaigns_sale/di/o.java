package com.avito.android.campaigns_sale.di;

import android.content.res.Resources;
import com.avito.android.Z0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.campaigns_sale.CampaignsSaleFragment;
import com.avito.android.campaigns_sale.F;
import com.avito.android.campaigns_sale.di.e;
import com.avito.android.campaigns_sale.di.g;
import com.avito.android.campaigns_sale.model.CampaignsSaleArguments;
import com.avito.android.campaigns_sale.mvi.E;
import com.avito.android.campaigns_sale.mvi.J;
import com.avito.android.campaigns_sale.mvi.M;
import com.avito.android.campaigns_sale.mvi.O;
import com.avito.android.campaigns_sale.mvi.S;
import com.avito.android.campaigns_sale.mvi.y;
import com.avito.android.campaigns_sale.mvi.z;
import com.avito.android.deep_linking.x;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import fm.C40443c;
import fm.InterfaceC40441a;
import gj.InterfaceC40691b;
import java.util.List;
import java.util.Set;
import jm.InterfaceC42397a;
import lj.InterfaceC43779a;
import om.InterfaceC44818a;
import vm.InterfaceC49348c;

/* compiled from: DaggerCampaignsSaleComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class o {

    /* compiled from: DaggerCampaignsSaleComponent.java */
    public static final class b implements com.avito.android.campaigns_sale.di.g {

        /* renamed from: A, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f113913A;

        /* renamed from: B, reason: collision with root package name */
        public final dagger.internal.l f113914B;

        /* renamed from: C, reason: collision with root package name */
        public final u<InterfaceC40441a> f113915C;

        /* renamed from: D, reason: collision with root package name */
        public final u<InterfaceC49348c> f113916D;

        /* renamed from: E, reason: collision with root package name */
        public final com.avito.android.campaigns_sale.konveyor.editBlock.c f113917E;

        /* renamed from: F, reason: collision with root package name */
        public final com.avito.android.campaigns_sale.konveyor.viewBlock.b f113918F;

        /* renamed from: G, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f113919G;

        /* renamed from: H, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f113920H;

        /* renamed from: I, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f113921I;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.campaigns_sale.di.i f113922a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f113923b;

        /* renamed from: c, reason: collision with root package name */
        public final CampaignsSaleArguments f113924c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.campaigns_sale.beduin.custom_actions.c> f113925d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.campaigns_sale.beduin.custom_actions.a> f113926e;

        /* renamed from: f, reason: collision with root package name */
        public final u<Wi.b> f113927f;

        /* renamed from: g, reason: collision with root package name */
        public final u<gj.d> f113928g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f113929h;

        /* renamed from: i, reason: collision with root package name */
        public final u<a.b> f113930i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC28481c> f113931j;

        /* renamed from: k, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f113932k;

        /* renamed from: l, reason: collision with root package name */
        public final u<Set<gj.f<?>>> f113933l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC40691b> f113934m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC43779a> f113935n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.l f113936o;

        /* renamed from: p, reason: collision with root package name */
        public final u<InterfaceC44818a> f113937p;

        /* renamed from: q, reason: collision with root package name */
        public final u<InterfaceC42397a> f113938q;

        /* renamed from: r, reason: collision with root package name */
        public final u<R0> f113939r;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.l f113940s;

        /* renamed from: t, reason: collision with root package name */
        public final u<Z0> f113941t;

        /* renamed from: u, reason: collision with root package name */
        public final u<x> f113942u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.campaigns_sale.network.a> f113943v;

        /* renamed from: w, reason: collision with root package name */
        public final J f113944w;

        /* renamed from: x, reason: collision with root package name */
        public final u<z> f113945x;

        /* renamed from: y, reason: collision with root package name */
        public final u<InterfaceC28373a> f113946y;

        /* renamed from: z, reason: collision with root package name */
        public final F f113947z;

        /* compiled from: DaggerCampaignsSaleComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.campaigns_sale.di.i f113948a;

            public a(com.avito.android.campaigns_sale.di.i iVar) {
                this.f113948a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f113948a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerCampaignsSaleComponent.java */
        /* renamed from: com.avito.android.campaigns_sale.di.o$b$b, reason: collision with other inner class name */
        public static final class C3336b implements u<gj.d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.campaigns_sale.di.i f113949a;

            public C3336b(com.avito.android.campaigns_sale.di.i iVar) {
                this.f113949a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f113949a.El();
            }
        }

        /* compiled from: DaggerCampaignsSaleComponent.java */
        public static final class c implements u<InterfaceC44818a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.campaigns_sale.di.i f113950a;

            public c(com.avito.android.campaigns_sale.di.i iVar) {
                this.f113950a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC44818a interfaceC44818aY5 = this.f113950a.y5();
                t.c(interfaceC44818aY5);
                return interfaceC44818aY5;
            }
        }

        /* compiled from: DaggerCampaignsSaleComponent.java */
        public static final class d implements u<InterfaceC42397a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.campaigns_sale.di.i f113951a;

            public d(com.avito.android.campaigns_sale.di.i iVar) {
                this.f113951a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC42397a interfaceC42397aUg = this.f113951a.Ug();
                t.c(interfaceC42397aUg);
                return interfaceC42397aUg;
            }
        }

        /* compiled from: DaggerCampaignsSaleComponent.java */
        public static final class e implements u<InterfaceC49348c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.campaigns_sale.di.i f113952a;

            public e(com.avito.android.campaigns_sale.di.i iVar) {
                this.f113952a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f113952a.C3();
            }
        }

        /* compiled from: DaggerCampaignsSaleComponent.java */
        public static final class f implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.campaigns_sale.di.i f113953a;

            public f(com.avito.android.campaigns_sale.di.i iVar) {
                this.f113953a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarT = this.f113953a.t();
                t.c(xVarT);
                return xVarT;
            }
        }

        /* compiled from: DaggerCampaignsSaleComponent.java */
        public static final class g implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f113954a;

            public g(cv.b bVar) {
                this.f113954a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f113954a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerCampaignsSaleComponent.java */
        public static final class h implements u<a.b> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f113955a;

            public h(cv.b bVar) {
                this.f113955a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                a.b bVarB = this.f113955a.b();
                t.c(bVarB);
                return bVarB;
            }
        }

        /* compiled from: DaggerCampaignsSaleComponent.java */
        public static final class i implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.campaigns_sale.di.i f113956a;

            public i(com.avito.android.campaigns_sale.di.i iVar) {
                this.f113956a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f113956a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerCampaignsSaleComponent.java */
        public static final class j implements u<Z0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.campaigns_sale.di.i f113957a;

            public j(com.avito.android.campaigns_sale.di.i iVar) {
                this.f113957a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f113957a.W();
            }
        }

        /* compiled from: DaggerCampaignsSaleComponent.java */
        public static final class k implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30106l7 f113958a;

            public k(InterfaceC30106l7 interfaceC30106l7) {
                this.f113958a = interfaceC30106l7;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f113958a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b() {
            throw null;
        }

        public b(com.avito.android.campaigns_sale.di.i iVar, cv.b bVar, InterfaceC30106l7 interfaceC30106l7, CampaignsSaleArguments campaignsSaleArguments, C28478k c28478k, Y41.l lVar, String str, Resources resources, a aVar) {
            this.f113922a = iVar;
            this.f113923b = bVar;
            this.f113924c = campaignsSaleArguments;
            this.f113925d = dagger.internal.g.d(com.avito.android.campaigns_sale.beduin.custom_actions.d.a());
            this.f113926e = dagger.internal.g.d(com.avito.android.campaigns_sale.beduin.custom_actions.b.a());
            this.f113927f = dagger.internal.g.d(e.a.f113908a);
            this.f113928g = new C3336b(iVar);
            this.f113929h = new g(bVar);
            this.f113930i = new h(bVar);
            this.f113931j = new k(interfaceC30106l7);
            this.f113932k = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f113931j);
            u<Set<gj.f<?>>> uVarD = dagger.internal.g.d(new com.avito.android.campaigns_sale.di.c(this.f113925d, this.f113926e, this.f113927f));
            this.f113933l = uVarD;
            u<InterfaceC40691b> uVarD2 = dagger.internal.g.d(new com.avito.android.campaigns_sale.di.d(uVarD, this.f113928g, this.f113929h, this.f113930i, this.f113932k));
            this.f113934m = uVarD2;
            this.f113935n = dagger.internal.g.d(new com.avito.android.campaigns_sale.di.f(uVarD2));
            this.f113936o = dagger.internal.l.a(campaignsSaleArguments);
            this.f113937p = new c(iVar);
            this.f113938q = new d(iVar);
            this.f113939r = new i(iVar);
            dagger.internal.l lVarA = dagger.internal.l.a(str);
            this.f113940s = lVarA;
            u<com.avito.android.campaigns_sale.network.a> uVarD3 = dagger.internal.g.d(new com.avito.android.campaigns_sale.network.t(this.f113936o, lVarA, this.f113937p, this.f113938q, this.f113939r, this.f113935n, new j(iVar), new f(iVar)));
            this.f113943v = uVarD3;
            this.f113944w = new J(uVarD3, this.f113934m, this.f113935n);
            u<z> uVarD4 = dagger.internal.g.d(new E(dagger.internal.l.a(resources), this.f113943v));
            this.f113945x = uVarD4;
            y yVar = new y(this.f113940s, uVarD4, this.f113943v);
            a aVar2 = new a(iVar);
            u<InterfaceC40691b> uVar = this.f113934m;
            this.f113947z = new F(this.f113925d, this.f113926e, this.f113927f, uVar, new M(this.f113944w, yVar, new O(aVar2, uVar), new S(uVarD4), this.f113932k));
            this.f113913A = B.a(com.avito.android.konveyor_adapter_module.d.a());
            this.f113914B = dagger.internal.l.a(lVar);
            u<InterfaceC40441a> uVarD5 = dagger.internal.g.d(new C40443c(this.f113936o, this.f113940s));
            this.f113915C = uVarD5;
            e eVar = new e(iVar);
            dagger.internal.l lVar2 = this.f113914B;
            this.f113917E = new com.avito.android.campaigns_sale.konveyor.editBlock.c(new com.avito.android.campaigns_sale.konveyor.editBlock.m(lVar2, uVarD5, eVar));
            this.f113918F = new com.avito.android.campaigns_sale.konveyor.viewBlock.b(new com.avito.android.campaigns_sale.konveyor.viewBlock.e(lVar2));
            A.b bVarA = A.a(2, 1);
            bVarA.f393938b.add(this.f113913A);
            com.avito.android.campaigns_sale.konveyor.editBlock.c cVar = this.f113917E;
            List<u<T>> list = bVarA.f393937a;
            list.add(cVar);
            list.add(this.f113918F);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f113919G = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f113920H = uVarH;
            this.f113921I = dagger.internal.g.d(new m(uVarH, this.f113919G));
        }

        @Override // com.avito.android.campaigns_sale.di.g
        public final void a(CampaignsSaleFragment campaignsSaleFragment) {
            campaignsSaleFragment.f113815n0 = this.f113947z;
            com.avito.android.campaigns_sale.di.i iVar = this.f113922a;
            campaignsSaleFragment.f113817p0 = iVar.Ad();
            campaignsSaleFragment.f113819r0 = iVar.sd();
            campaignsSaleFragment.f113820s0 = this.f113921I.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f113923b.u4();
            t.c(aVarU4);
            campaignsSaleFragment.f113821t0 = aVarU4;
            InterfaceC28373a interfaceC28373aA = iVar.a();
            t.c(interfaceC28373aA);
            campaignsSaleFragment.f113822u0 = interfaceC28373aA;
            campaignsSaleFragment.f113823v0 = this.f113932k.get();
            campaignsSaleFragment.f113824w0 = this.f113924c;
            SK0.b bVarP = iVar.p();
            t.c(bVarP);
            campaignsSaleFragment.f113825x0 = bVarP;
        }
    }

    /* compiled from: DaggerCampaignsSaleComponent.java */
    public static final class c implements g.a {
        public c() {
        }

        @Override // com.avito.android.campaigns_sale.di.g.a
        public final g a(CampaignsSaleArguments campaignsSaleArguments, C28478k c28478k, Y41.l lVar, String str, Resources resources, i iVar, InterfaceC39417a interfaceC39417a, InterfaceC30106l7 interfaceC30106l7) {
            str.getClass();
            interfaceC39417a.getClass();
            return new b(iVar, interfaceC39417a, interfaceC30106l7, campaignsSaleArguments, c28478k, lVar, str, resources, null);
        }
    }

    public static g.a a() {
        return new c();
    }
}
