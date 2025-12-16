package com.avito.android.verification.di.form_builder;

import android.content.res.Resources;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.w;
import com.avito.android.remote.A1;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.R0;
import com.avito.android.verification.di.form_builder.b;
import com.avito.android.verification.inn.o;
import com.avito.android.verification.verification_form_builder.FormBuilderArgs;
import com.avito.android.verification.verification_form_builder.FormBuilderFragment;
import com.avito.android.verification.verification_form_builder.h;
import com.avito.android.verification.verification_form_builder.i;
import com.avito.android.verification.verification_form_builder.mvi.m;
import com.avito.android.verification.verification_form_builder.mvi.q;
import com.avito.konveyor.adapter.j;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Set;

/* compiled from: DaggerFormBuilderComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerFormBuilderComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.verification.di.form_builder.b.a
        public final com.avito.android.verification.di.form_builder.b a(r rVar, FormBuilderArgs formBuilderArgs, Resources resources, com.avito.android.tariff.cpa.configure_info.items.feature.e eVar, com.avito.android.verification.verification_form_builder.a aVar, com.avito.android.verification.verification_form_builder.b bVar, com.avito.android.verification.verification_form_builder.c cVar, com.avito.android.verification.verification_form_builder.e eVar2, com.avito.android.verification.verification_form_builder.d dVar, com.avito.android.verification.di.form_builder.c cVar2, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(cVar2, interfaceC39417a, rVar, formBuilderArgs, resources, eVar, aVar, bVar, cVar, eVar2, dVar, null);
        }
    }

    /* compiled from: DaggerFormBuilderComponent.java */
    public static final class c implements com.avito.android.verification.di.form_builder.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<com.avito.android.verification.inn.list.button.e> f323644A;

        /* renamed from: B, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f323645B;

        /* renamed from: C, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f323646C;

        /* renamed from: D, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f323647D;

        /* renamed from: E, reason: collision with root package name */
        public final u<com.avito.android.verification.common.list.space.d> f323648E;

        /* renamed from: F, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f323649F;

        /* renamed from: G, reason: collision with root package name */
        public final u<com.avito.android.verification.inn.list.group_card.d> f323650G;

        /* renamed from: H, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f323651H;

        /* renamed from: I, reason: collision with root package name */
        public final com.avito.android.verification.list_items.banner.c f323652I;

        /* renamed from: J, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f323653J;

        /* renamed from: K, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f323654K;

        /* renamed from: L, reason: collision with root package name */
        public final u<j> f323655L;

        /* renamed from: a, reason: collision with root package name */
        public final u<A1> f323656a;

        /* renamed from: b, reason: collision with root package name */
        public final u<R0> f323657b;

        /* renamed from: c, reason: collision with root package name */
        public final u<h> f323658c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.verification.verification_form_builder.mvi.j f323659d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f323660e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC35741a1> f323661f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.verification.verification_form_builder.mvi.h f323662g;

        /* renamed from: h, reason: collision with root package name */
        public final vM0.g f323663h;

        /* renamed from: i, reason: collision with root package name */
        public final q f323664i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC28481c> f323665j;

        /* renamed from: k, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f323666k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.verification.verification_form_builder.r f323667l;

        /* renamed from: m, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f323668m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.verification.inn.list.disclosure.f> f323669n;

        /* renamed from: o, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f323670o;

        /* renamed from: p, reason: collision with root package name */
        public final l f323671p;

        /* renamed from: q, reason: collision with root package name */
        public final l f323672q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.verification.inn.list.checkbox.g> f323673r;

        /* renamed from: s, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f323674s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f323675t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.android.verification.inn.list.input.e> f323676u;

        /* renamed from: v, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f323677v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.android.verification.inn.list.select.g> f323678w;

        /* renamed from: x, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f323679x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.android.verification.inn.list.inn_info.f> f323680y;

        /* renamed from: z, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f323681z;

        /* compiled from: DaggerFormBuilderComponent.java */
        /* renamed from: com.avito.android.verification.di.form_builder.a$c$a, reason: collision with other inner class name */
        public static final class C10013a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.verification.di.form_builder.c f323682a;

            public C10013a(com.avito.android.verification.di.form_builder.c cVar) {
                this.f323682a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f323682a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerFormBuilderComponent.java */
        public static final class b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f323683a;

            public b(cv.b bVar) {
                this.f323683a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f323683a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerFormBuilderComponent.java */
        /* renamed from: com.avito.android.verification.di.form_builder.a$c$c, reason: collision with other inner class name */
        public static final class C10014c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.verification.di.form_builder.c f323684a;

            public C10014c(com.avito.android.verification.di.form_builder.c cVar) {
                this.f323684a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f323684a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerFormBuilderComponent.java */
        public static final class d implements u<InterfaceC35741a1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.verification.di.form_builder.c f323685a;

            public d(com.avito.android.verification.di.form_builder.c cVar) {
                this.f323685a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35741a1 interfaceC35741a1N = this.f323685a.n();
                t.c(interfaceC35741a1N);
                return interfaceC35741a1N;
            }
        }

        /* compiled from: DaggerFormBuilderComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.verification.di.form_builder.c f323686a;

            public e(com.avito.android.verification.di.form_builder.c cVar) {
                this.f323686a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f323686a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerFormBuilderComponent.java */
        public static final class f implements u<A1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.verification.di.form_builder.c f323687a;

            public f(com.avito.android.verification.di.form_builder.c cVar) {
                this.f323687a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                A1 a1S0 = this.f323687a.s0();
                t.c(a1S0);
                return a1S0;
            }
        }

        public c(com.avito.android.verification.di.form_builder.c cVar, cv.b bVar, r rVar, FormBuilderArgs formBuilderArgs, Resources resources, w wVar, com.avito.android.verification.inn.list.button.c cVar2, com.avito.android.verification.inn.list.checkbox.d dVar, com.avito.android.verification.inn.list.select.c cVar3, com.avito.android.verification.inn.list.disclosure.d dVar2, com.avito.android.verification.inn.list.inn_info.d dVar3, C10012a c10012a) {
            this.f323656a = new f(cVar);
            this.f323657b = new C10014c(cVar);
            u<h> uVarD = dagger.internal.g.d(new i(l.a(formBuilderArgs), this.f323656a, this.f323657b));
            this.f323658c = uVarD;
            this.f323659d = new com.avito.android.verification.verification_form_builder.mvi.j(uVarD);
            b bVar2 = new b(bVar);
            d dVar4 = new d(cVar);
            this.f323661f = dVar4;
            this.f323662g = new com.avito.android.verification.verification_form_builder.mvi.h(uVarD, bVar2, dVar4, o.a());
            this.f323663h = new vM0.g(l.a(resources));
            this.f323664i = new q(this.f323661f, new com.avito.android.verification.inn.q(com.avito.android.verification.inn.validation.c.a(), this.f323663h));
            this.f323665j = new e(cVar);
            this.f323666k = dagger.internal.g.d(new g(l.a(rVar), this.f323665j));
            this.f323667l = new com.avito.android.verification.verification_form_builder.r(new m(this.f323659d, this.f323662g, com.avito.android.verification.verification_form_builder.mvi.o.a(), this.f323664i, this.f323666k));
            this.f323668m = B.a(com.avito.android.konveyor_adapter_module.d.a());
            u<com.avito.android.verification.inn.list.disclosure.f> uVarD2 = dagger.internal.g.d(new com.avito.android.verification.inn.list.disclosure.g(l.a(dVar2)));
            this.f323669n = uVarD2;
            this.f323670o = dagger.internal.g.d(new com.avito.android.verification.inn.list.disclosure.c(uVarD2));
            this.f323671p = l.a(dVar);
            l lVarA = l.a(wVar);
            this.f323672q = lVarA;
            u<com.avito.android.verification.inn.list.checkbox.g> uVarD3 = dagger.internal.g.d(new com.avito.android.verification.inn.list.checkbox.h(lVarA, this.f323671p));
            this.f323673r = uVarD3;
            this.f323674s = dagger.internal.g.d(new com.avito.android.verification.inn.list.checkbox.c(uVarD3));
            C10013a c10013a = new C10013a(cVar);
            this.f323675t = c10013a;
            u<com.avito.android.verification.inn.list.input.e> uVarD4 = dagger.internal.g.d(new com.avito.android.verification.inn.list.input.f(c10013a, this.f323672q));
            this.f323676u = uVarD4;
            this.f323677v = dagger.internal.g.d(new com.avito.android.verification.inn.list.input.c(uVarD4));
            u<com.avito.android.verification.inn.list.select.g> uVarD5 = dagger.internal.g.d(new com.avito.android.verification.inn.list.select.h(this.f323672q, l.a(cVar3), this.f323675t));
            this.f323678w = uVarD5;
            this.f323679x = dagger.internal.g.d(new com.avito.android.verification.inn.list.select.b(uVarD5));
            u<com.avito.android.verification.inn.list.inn_info.f> uVarD6 = dagger.internal.g.d(new com.avito.android.verification.inn.list.inn_info.g(l.a(dVar3)));
            this.f323680y = uVarD6;
            this.f323681z = dagger.internal.g.d(new com.avito.android.verification.inn.list.inn_info.c(uVarD6));
            u<com.avito.android.verification.inn.list.button.e> uVarD7 = dagger.internal.g.d(new com.avito.android.verification.inn.list.button.f(l.a(cVar2)));
            this.f323644A = uVarD7;
            this.f323645B = dagger.internal.g.d(new com.avito.android.verification.inn.list.button.b(uVarD7));
            this.f323646C = dagger.internal.g.d(new com.avito.android.verification.inn.list.footer.c(new com.avito.android.verification.inn.list.footer.f(this.f323672q)));
            this.f323647D = dagger.internal.g.d(new com.avito.android.verification.inn.list.text.c(new com.avito.android.verification.inn.list.text.f(this.f323672q)));
            u<com.avito.android.verification.common.list.space.d> uVarD8 = dagger.internal.g.d(com.avito.android.verification.common.list.space.e.a());
            this.f323648E = uVarD8;
            this.f323649F = dagger.internal.g.d(new com.avito.android.verification.common.list.space.c(uVarD8));
            u<com.avito.android.verification.inn.list.group_card.d> uVarD9 = dagger.internal.g.d(new com.avito.android.verification.inn.list.group_card.e(this.f323672q));
            this.f323650G = uVarD9;
            this.f323651H = dagger.internal.g.d(new com.avito.android.verification.inn.list.group_card.b(uVarD9));
            this.f323652I = new com.avito.android.verification.list_items.banner.c(new com.avito.android.verification.list_items.banner.f(this.f323672q));
            A.b bVarA = A.a(11, 1);
            bVarA.f393938b.add(this.f323668m);
            u<TV0.b<?, ?>> uVar = this.f323670o;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f323674s);
            list.add(this.f323677v);
            list.add(this.f323679x);
            list.add(this.f323681z);
            list.add(this.f323645B);
            list.add(this.f323646C);
            list.add(this.f323647D);
            list.add(this.f323649F);
            list.add(this.f323651H);
            list.add(this.f323652I);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f323653J = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f323654K = uVarH;
            this.f323655L = dagger.internal.g.d(new com.avito.android.verification.di.form_builder.e(uVarH, this.f323653J));
        }

        @Override // com.avito.android.verification.di.form_builder.b
        public final void a(FormBuilderFragment formBuilderFragment) {
            formBuilderFragment.f325336n0 = this.f323667l;
            formBuilderFragment.f325338p0 = this.f323666k.get();
            formBuilderFragment.f325339q0 = this.f323655L.get();
            formBuilderFragment.f325340r0 = this.f323654K.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
