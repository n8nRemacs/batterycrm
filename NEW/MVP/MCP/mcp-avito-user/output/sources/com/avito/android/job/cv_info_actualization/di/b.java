package com.avito.android.job.cv_info_actualization.di;

import Y41.l;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.module.C30065i;
import com.avito.android.job.cv_info_actualization.di.c;
import com.avito.android.job.cv_info_actualization.mvi.domain.j;
import com.avito.android.job.cv_info_actualization.mvi.h;
import com.avito.android.job.cv_info_actualization.mvi.k;
import com.avito.android.job.cv_info_actualization.mvi.m;
import com.avito.android.job.cv_info_actualization.mvi.o;
import com.avito.android.job.cv_info_actualization.ui.JsxCvInfoActualizationActivity;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Set;

/* compiled from: DaggerJsxCvInfoActualizationComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class b {

    /* compiled from: DaggerJsxCvInfoActualizationComponent.java */
    /* renamed from: com.avito.android.job.cv_info_actualization.di.b$b, reason: collision with other inner class name */
    public static final class C5130b implements c.a {
        public C5130b() {
        }

        @Override // com.avito.android.job.cv_info_actualization.di.c.a
        public final com.avito.android.job.cv_info_actualization.di.c a(d dVar, InterfaceC39417a interfaceC39417a, String str, r rVar, l lVar, DeepLink deepLink) {
            interfaceC39417a.getClass();
            str.getClass();
            return new c(dVar, interfaceC39417a, str, rVar, lVar, deepLink, null);
        }
    }

    /* compiled from: DaggerJsxCvInfoActualizationComponent.java */
    public static final class c implements com.avito.android.job.cv_info_actualization.di.c {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f174047a;

        /* renamed from: b, reason: collision with root package name */
        public final u<PP.a> f174048b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f174049c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.job.cv_info_actualization.mvi.action_handler.d f174050d;

        /* renamed from: e, reason: collision with root package name */
        public final h f174051e;

        /* renamed from: f, reason: collision with root package name */
        public final m f174052f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f174053g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.job.cv_info_actualization.mvi.f f174054h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f174055i;

        /* renamed from: j, reason: collision with root package name */
        public final u<C28478k> f174056j;

        /* renamed from: k, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f174057k;

        /* renamed from: l, reason: collision with root package name */
        public final VP.b f174058l;

        /* renamed from: m, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f174059m;

        /* renamed from: n, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f174060n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.l f174061o;

        /* renamed from: p, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f174062p;

        /* renamed from: q, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f174063q;

        /* renamed from: r, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f174064r;

        /* renamed from: s, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f174065s;

        /* renamed from: t, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f174066t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f174067u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f174068v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f174069w;

        /* compiled from: DaggerJsxCvInfoActualizationComponent.java */
        public static final class a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final d f174070a;

            public a(d dVar) {
                this.f174070a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f174070a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerJsxCvInfoActualizationComponent.java */
        /* renamed from: com.avito.android.job.cv_info_actualization.di.b$c$b, reason: collision with other inner class name */
        public static final class C5131b implements u<PP.a> {

            /* renamed from: a, reason: collision with root package name */
            public final d f174071a;

            public C5131b(d dVar) {
                this.f174071a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                PP.a aVarUa = this.f174071a.ua();
                t.c(aVarUa);
                return aVarUa;
            }
        }

        /* compiled from: DaggerJsxCvInfoActualizationComponent.java */
        /* renamed from: com.avito.android.job.cv_info_actualization.di.b$c$c, reason: collision with other inner class name */
        public static final class C5132c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f174072a;

            public C5132c(cv.b bVar) {
                this.f174072a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f174072a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        public c() {
            throw null;
        }

        public c(d dVar, cv.b bVar, String str, r rVar, l lVar, DeepLink deepLink, a aVar) {
            this.f174047a = bVar;
            this.f174048b = new C5131b(dVar);
            this.f174049c = dagger.internal.l.a(str);
            com.avito.android.job.cv_info_actualization.mvi.action_handler.d dVar2 = new com.avito.android.job.cv_info_actualization.mvi.action_handler.d(new com.avito.android.job.cv_info_actualization.mvi.domain.h(this.f174048b, com.avito.android.job.cv_info_actualization.data.mapper.b.a(), this.f174049c));
            this.f174050d = dVar2;
            this.f174051e = new h(dVar2);
            this.f174052f = new m(dagger.internal.l.b(deepLink));
            this.f174054h = new com.avito.android.job.cv_info_actualization.mvi.f(this.f174050d, new C5132c(bVar), new com.avito.android.job.cv_info_actualization.mvi.action_handler.f(new j(this.f174049c, this.f174048b)));
            this.f174055i = new a(dVar);
            u<C28478k> uVarD = dagger.internal.g.d(new f(dagger.internal.l.a(rVar)));
            this.f174056j = uVarD;
            this.f174057k = dagger.internal.g.d(new C30065i(this.f174055i, uVarD));
            this.f174058l = new VP.b(new k(this.f174051e, o.a(), this.f174052f, this.f174054h, this.f174057k));
            this.f174059m = B.a(com.avito.android.konveyor_adapter_module.d.a());
            this.f174060n = dagger.internal.g.d(new com.avito.android.job.cv_info_actualization.ui.items.header.b(com.avito.android.job.cv_info_actualization.ui.items.header.f.a()));
            dagger.internal.l lVarA = dagger.internal.l.a(lVar);
            this.f174061o = lVarA;
            this.f174062p = dagger.internal.g.d(new com.avito.android.job.cv_info_actualization.ui.items.radio.b(new com.avito.android.job.cv_info_actualization.ui.items.radio.f(lVarA)));
            this.f174063q = dagger.internal.g.d(new com.avito.android.job.cv_info_actualization.ui.items.checkbox.b(new com.avito.android.job.cv_info_actualization.ui.items.checkbox.f(this.f174061o)));
            this.f174064r = dagger.internal.g.d(new com.avito.android.job.cv_info_actualization.ui.items.chips.c(new com.avito.android.job.cv_info_actualization.ui.items.chips.f(this.f174061o)));
            this.f174065s = dagger.internal.g.d(new com.avito.android.job.cv_info_actualization.ui.items.error.b(new com.avito.android.job.cv_info_actualization.ui.items.error.f(this.f174061o)));
            this.f174066t = dagger.internal.g.d(new com.avito.android.job.cv_info_actualization.ui.items.loading.b(com.avito.android.job.cv_info_actualization.ui.items.loading.f.a()));
            A.b bVarA = A.a(6, 1);
            bVarA.f393938b.add(this.f174059m);
            u<TV0.b<?, ?>> uVar = this.f174060n;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f174062p);
            list.add(this.f174063q);
            list.add(this.f174064r);
            list.add(this.f174065s);
            list.add(this.f174066t);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f174067u = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f174068v = uVarH;
            this.f174069w = dagger.internal.g.d(new g(uVarH, this.f174067u));
        }

        @Override // com.avito.android.job.cv_info_actualization.di.c
        public final void a(JsxCvInfoActualizationActivity jsxCvInfoActualizationActivity) {
            jsxCvInfoActualizationActivity.f174194m = this.f174058l;
            jsxCvInfoActualizationActivity.f174195n = this.f174069w.get();
            jsxCvInfoActualizationActivity.f174196o = this.f174057k.get();
            jsxCvInfoActualizationActivity.f174197p = new UP.c(new UP.a(new com.avito.android.job.cv_info_actualization.mvi.mapper.items.a(), new com.avito.android.job.cv_info_actualization.mvi.mapper.items.c(), new com.avito.android.job.cv_info_actualization.mvi.mapper.items.e(), new com.avito.android.job.cv_info_actualization.mvi.mapper.items.g()));
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f174047a.u4();
            t.c(aVarU4);
            jsxCvInfoActualizationActivity.f174198q = aVarU4;
        }
    }

    public static c.a a() {
        return new C5130b();
    }
}
