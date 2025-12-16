package com.avito.android.loyalty.di.quality_service_gray;

import bX.InterfaceC25576a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.w;
import com.avito.android.deep_linking.links.x;
import com.avito.android.loyalty.di.quality_service_gray.b;
import com.avito.android.loyalty.di.quality_service_gray.h;
import com.avito.android.loyalty.di.quality_service_gray.i;
import com.avito.android.loyalty.ui.quality_service_gray.QualityServiceGrayActivity;
import com.avito.android.loyalty.ui.quality_service_gray.QualityServiceGrayArgs;
import com.avito.android.loyalty.ui.quality_service_gray.mvi.k;
import com.avito.android.loyalty.ui.quality_service_gray.mvi.m;
import com.avito.android.util.R0;
import com.avito.konveyor.adapter.j;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Set;

/* compiled from: DaggerQualityServiceGrayComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerQualityServiceGrayComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.loyalty.di.quality_service_gray.b.a
        public final com.avito.android.loyalty.di.quality_service_gray.b a(C28478k c28478k, QualityServiceGrayArgs qualityServiceGrayArgs, com.avito.android.cpt.pre_activation.ui.c cVar, com.avito.android.auction.details.i iVar, com.avito.android.loyalty.di.quality_service_gray.c cVar2, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(cVar2, interfaceC39417a, c28478k, qualityServiceGrayArgs, cVar, iVar, null);
        }
    }

    /* compiled from: DaggerQualityServiceGrayComponent.java */
    public static final class c implements com.avito.android.loyalty.di.quality_service_gray.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.loyalty.di.quality_service_gray.c f183171a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f183172b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC25576a> f183173c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f183174d;

        /* renamed from: e, reason: collision with root package name */
        public final l f183175e;

        /* renamed from: f, reason: collision with root package name */
        public final l f183176f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.loyalty.ui.quality_service_gray.f> f183177g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28373a> f183178h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.analytics.provider.a> f183179i;

        /* renamed from: j, reason: collision with root package name */
        public final u<IW.a> f183180j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.quality_service_gray.mvi.f f183181k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.quality_service_gray.mvi.d f183182l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC28481c> f183183m;

        /* renamed from: n, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f183184n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.quality_service_gray.i f183185o;

        /* renamed from: p, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f183186p;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.items.text_item.c f183187q;

        /* renamed from: r, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.items.spacer.c f183188r;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.quality_service_gray.items.button.c f183189s;

        /* renamed from: t, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.quality_service_gray.items.progress_item.c f183190t;

        /* renamed from: u, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.quality_service_gray.items.info_card_item.c f183191u;

        /* renamed from: v, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.items.attributed_text.c f183192v;

        /* renamed from: w, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.items.title_text.c f183193w;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f183194x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.h> f183195y;

        /* renamed from: z, reason: collision with root package name */
        public final u<j> f183196z;

        /* compiled from: DaggerQualityServiceGrayComponent.java */
        /* renamed from: com.avito.android.loyalty.di.quality_service_gray.a$c$a, reason: collision with other inner class name */
        public static final class C5376a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.loyalty.di.quality_service_gray.c f183197a;

            public C5376a(com.avito.android.loyalty.di.quality_service_gray.c cVar) {
                this.f183197a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f183197a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerQualityServiceGrayComponent.java */
        public static final class b implements u<com.avito.android.analytics.provider.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.loyalty.di.quality_service_gray.c f183198a;

            public b(com.avito.android.loyalty.di.quality_service_gray.c cVar) {
                this.f183198a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.analytics.provider.a aVarV = this.f183198a.v();
                t.c(aVarV);
                return aVarV;
            }
        }

        /* compiled from: DaggerQualityServiceGrayComponent.java */
        /* renamed from: com.avito.android.loyalty.di.quality_service_gray.a$c$c, reason: collision with other inner class name */
        public static final class C5377c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.loyalty.di.quality_service_gray.c f183199a;

            public C5377c(com.avito.android.loyalty.di.quality_service_gray.c cVar) {
                this.f183199a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f183199a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerQualityServiceGrayComponent.java */
        public static final class d implements u<InterfaceC25576a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.loyalty.di.quality_service_gray.c f183200a;

            public d(com.avito.android.loyalty.di.quality_service_gray.c cVar) {
                this.f183200a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC25576a interfaceC25576aY1 = this.f183200a.y1();
                t.c(interfaceC25576aY1);
                return interfaceC25576aY1;
            }
        }

        /* compiled from: DaggerQualityServiceGrayComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.loyalty.di.quality_service_gray.c f183201a;

            public e(com.avito.android.loyalty.di.quality_service_gray.c cVar) {
                this.f183201a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f183201a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.loyalty.di.quality_service_gray.c cVar, cv.b bVar, C28478k c28478k, QualityServiceGrayArgs qualityServiceGrayArgs, w wVar, x xVar, C5375a c5375a) {
            this.f183171a = cVar;
            this.f183172b = bVar;
            this.f183173c = new d(cVar);
            this.f183174d = new C5377c(cVar);
            this.f183175e = l.a(qualityServiceGrayArgs);
            this.f183176f = l.a(wVar);
            this.f183177g = dagger.internal.g.d(new com.avito.android.loyalty.ui.quality_service_gray.g(this.f183173c, this.f183174d, this.f183175e, new com.avito.android.loyalty.ui.quality_service_gray.e(this.f183176f, l.a(xVar))));
            u<IW.a> uVarD = dagger.internal.g.d(new g(this.f183175e, new C5376a(cVar), new b(cVar)));
            this.f183180j = uVarD;
            u<com.avito.android.loyalty.ui.quality_service_gray.f> uVar = this.f183177g;
            this.f183181k = new com.avito.android.loyalty.ui.quality_service_gray.mvi.f(uVarD, uVar);
            this.f183182l = new com.avito.android.loyalty.ui.quality_service_gray.mvi.d(uVarD, uVar);
            this.f183183m = new e(cVar);
            this.f183184n = com.avito.android.actions_sheet.a.D(l.a(c28478k), this.f183183m);
            this.f183185o = new com.avito.android.loyalty.ui.quality_service_gray.i(new k(this.f183181k, this.f183182l, m.a(), this.f183184n, com.avito.android.loyalty.ui.quality_service_gray.mvi.h.a()));
            this.f183186p = B.a(com.avito.android.konveyor_adapter_module.d.a());
            this.f183187q = new com.avito.android.loyalty.ui.items.text_item.c(new com.avito.android.loyalty.ui.items.text_item.f(this.f183176f), h.a.f183209a);
            this.f183188r = new com.avito.android.loyalty.ui.items.spacer.c(com.avito.android.loyalty.ui.items.spacer.e.a());
            this.f183189s = new com.avito.android.loyalty.ui.quality_service_gray.items.button.c(new com.avito.android.loyalty.ui.quality_service_gray.items.button.e(this.f183176f));
            this.f183190t = new com.avito.android.loyalty.ui.quality_service_gray.items.progress_item.c(com.avito.android.loyalty.ui.quality_service_gray.items.progress_item.e.a());
            this.f183191u = new com.avito.android.loyalty.ui.quality_service_gray.items.info_card_item.c(com.avito.android.loyalty.ui.quality_service_gray.items.info_card_item.e.a());
            this.f183192v = new com.avito.android.loyalty.ui.items.attributed_text.c(new com.avito.android.loyalty.ui.items.attributed_text.f(this.f183176f));
            this.f183193w = new com.avito.android.loyalty.ui.items.title_text.c(com.avito.android.loyalty.ui.items.title_text.e.a(), i.a.f183210a);
            A.b bVarA = A.a(7, 1);
            bVarA.f393938b.add(this.f183186p);
            com.avito.android.loyalty.ui.items.text_item.c cVar2 = this.f183187q;
            List<u<T>> list = bVarA.f393937a;
            list.add(cVar2);
            list.add(this.f183188r);
            list.add(this.f183189s);
            list.add(this.f183190t);
            list.add(this.f183191u);
            list.add(this.f183192v);
            list.add(this.f183193w);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f183194x = uVarK;
            u<com.avito.konveyor.adapter.h> uVarD2 = dagger.internal.g.d(new f(uVarK));
            this.f183195y = uVarD2;
            this.f183196z = dagger.internal.g.d(new com.avito.android.loyalty.di.quality_service_gray.e(uVarD2, this.f183194x));
        }

        @Override // com.avito.android.loyalty.di.quality_service_gray.b
        public final void a(QualityServiceGrayActivity qualityServiceGrayActivity) {
            qualityServiceGrayActivity.f184033m = this.f183185o;
            com.avito.android.loyalty.di.quality_service_gray.c cVar = this.f183171a;
            qualityServiceGrayActivity.f184035o = cVar.O();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f183172b.u4();
            t.c(aVarU4);
            qualityServiceGrayActivity.f184036p = aVarU4;
            qualityServiceGrayActivity.f184037q = cVar.h();
            qualityServiceGrayActivity.f184038r = this.f183184n.get();
            qualityServiceGrayActivity.f184039s = this.f183196z.get();
            qualityServiceGrayActivity.f184040t = this.f183195y.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
