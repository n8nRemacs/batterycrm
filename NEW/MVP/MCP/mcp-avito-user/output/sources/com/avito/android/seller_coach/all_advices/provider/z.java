package com.avito.android.seller_coach.all_advices.provider;

import Cq0.C13345d;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.C;
import androidx.view.InterfaceC22983P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.seller_coach.all_advices.provider.a;
import com.avito.android.seller_coach.all_advices.view.AllAdvicesFragment;
import com.avito.android.seller_coach.hints_dialog.view.h;
import com.avito.android.util.InterfaceC35745a5;
import cv.InterfaceC39417a;
import java.util.Set;
import sI0.InterfaceC48055a;

/* compiled from: DaggerAllAdvicesComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class z {

    /* compiled from: DaggerAllAdvicesComponent.java */
    public static final class b implements com.avito.android.seller_coach.all_advices.provider.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.seller_coach.all_advices.provider.d f267373a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.seller_coach.hints_dialog.provider.l f267374b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC48055a> f267375c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f267376d;

        /* renamed from: e, reason: collision with root package name */
        public final C13345d f267377e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f267378f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f267379g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f267380h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.seller_coach.all_advices.vm.c f267381i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.f f267382j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<C> f267383k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.seller_coach.all_advices.item.c> f267384l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f267385m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.h> f267386n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.data_aware.e> f267387o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.a> f267388p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<Set<TV0.d<?, ?>>> f267389q;

        /* compiled from: DaggerAllAdvicesComponent.java */
        public static final class a implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.seller_coach.all_advices.provider.d f267390a;

            public a(com.avito.android.seller_coach.all_advices.provider.d dVar) {
                this.f267390a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f267390a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerAllAdvicesComponent.java */
        /* renamed from: com.avito.android.seller_coach.all_advices.provider.z$b$b, reason: collision with other inner class name */
        public static final class C7987b implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.seller_coach.all_advices.provider.d f267391a;

            public C7987b(com.avito.android.seller_coach.all_advices.provider.d dVar) {
                this.f267391a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f267391a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerAllAdvicesComponent.java */
        public static final class c implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.seller_coach.all_advices.provider.d f267392a;

            public c(com.avito.android.seller_coach.all_advices.provider.d dVar) {
                this.f267392a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f267392a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerAllAdvicesComponent.java */
        public static final class d implements dagger.internal.u<InterfaceC48055a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.seller_coach.all_advices.provider.d f267393a;

            public d(com.avito.android.seller_coach.all_advices.provider.d dVar) {
                this.f267393a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC48055a interfaceC48055aA1 = this.f267393a.A1();
                dagger.internal.t.c(interfaceC48055aA1);
                return interfaceC48055aA1;
            }
        }

        public b(com.avito.android.seller_coach.all_advices.provider.d dVar, cv.b bVar, com.avito.android.seller_coach.hints_dialog.provider.l lVar, Fragment fragment, com.avito.android.analytics.screens.r rVar, InterfaceC22983P interfaceC22983P, a aVar) {
            this.f267373a = dVar;
            this.f267374b = lVar;
            d dVar2 = new d(dVar);
            C7987b c7987b = new C7987b(dVar);
            this.f267376d = c7987b;
            this.f267377e = new C13345d(dVar2, c7987b);
            this.f267378f = new a(dVar);
            this.f267379g = new c(dVar);
            dagger.internal.u<ScreenPerformanceTracker> uVarD = dagger.internal.g.d(new y(dagger.internal.l.a(rVar), this.f267379g));
            this.f267380h = uVarD;
            this.f267381i = new com.avito.android.seller_coach.all_advices.vm.c(this.f267377e, this.f267376d, this.f267378f, uVarD);
            dagger.internal.f fVar = new dagger.internal.f();
            this.f267382j = fVar;
            this.f267383k = dagger.internal.g.d(new s(fVar));
            dagger.internal.u<com.avito.android.seller_coach.all_advices.item.c> uVarD2 = dagger.internal.g.d(com.avito.android.seller_coach.all_advices.item.f.a());
            this.f267384l = uVarD2;
            dagger.internal.u<com.avito.konveyor.a> uVarD3 = dagger.internal.g.d(new q(new com.avito.android.seller_coach.all_advices.item.b(uVarD2)));
            this.f267385m = uVarD3;
            this.f267386n = dagger.internal.g.d(new n(uVarD3));
            dagger.internal.u<com.avito.android.recycler.data_aware.e> uVarD4 = dagger.internal.g.d(new p(com.avito.android.seller_coach.all_advices.item.j.a(), com.avito.android.seller_coach.all_advices.item.l.a()));
            this.f267387o = uVarD4;
            dagger.internal.u<com.avito.konveyor.adapter.a> uVarD5 = dagger.internal.g.d(new o(uVarD4, this.f267383k, this.f267386n));
            this.f267388p = uVarD5;
            dagger.internal.f.a(this.f267382j, dagger.internal.g.d(new t(uVarD5, this.f267385m)));
            this.f267389q = dagger.internal.g.d(new r(this.f267384l));
        }

        @Override // com.avito.android.seller_coach.all_advices.provider.a
        public final void a(AllAdvicesFragment allAdvicesFragment) {
            InterfaceC28373a interfaceC28373aA = this.f267373a.a();
            dagger.internal.t.c(interfaceC28373aA);
            allAdvicesFragment.f267401t0 = interfaceC28373aA;
            allAdvicesFragment.f267402u0 = this.f267381i;
            allAdvicesFragment.f267403v0 = (com.avito.konveyor.adapter.j) this.f267382j.get();
            allAdvicesFragment.f267404w0 = this.f267388p.get();
            allAdvicesFragment.f267405x0 = this.f267389q.get();
            allAdvicesFragment.f267406y0 = this.f267380h.get();
            h.b bVarA = this.f267374b.a();
            dagger.internal.t.c(bVarA);
            allAdvicesFragment.f267407z0 = bVarA;
        }
    }

    /* compiled from: DaggerAllAdvicesComponent.java */
    public static final class c implements a.InterfaceC7986a {
        public c() {
        }

        @Override // com.avito.android.seller_coach.all_advices.provider.a.InterfaceC7986a
        public final com.avito.android.seller_coach.all_advices.provider.a a(InterfaceC39417a interfaceC39417a, d dVar, com.avito.android.seller_coach.hints_dialog.provider.l lVar, AllAdvicesFragment allAdvicesFragment, com.avito.android.analytics.screens.r rVar, AllAdvicesFragment allAdvicesFragment2) {
            interfaceC39417a.getClass();
            lVar.getClass();
            return new b(dVar, interfaceC39417a, lVar, allAdvicesFragment, rVar, allAdvicesFragment2, null);
        }
    }

    public static a.InterfaceC7986a a() {
        return new c();
    }
}
