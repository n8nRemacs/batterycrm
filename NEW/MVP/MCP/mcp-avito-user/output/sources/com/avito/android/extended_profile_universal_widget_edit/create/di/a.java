package com.avito.android.extended_profile_universal_widget_edit.create.di;

import Y41.l;
import Za0.InterfaceC19524a;
import androidx.fragment.app.Fragment;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.extended_profile_universal_widget_edit.UniversalWidgetCreateArguments;
import com.avito.android.extended_profile_universal_widget_edit.create.UniversalWidgetCreateFragment;
import com.avito.android.extended_profile_universal_widget_edit.create.di.b;
import com.avito.android.extended_profile_universal_widget_edit.create.h;
import com.avito.android.extended_profile_universal_widget_edit.create.mvi.g;
import com.avito.android.extended_profile_universal_widget_edit.create.mvi.i;
import com.avito.android.extended_profile_universal_widget_edit.create.mvi.k;
import com.avito.android.extended_profile_universal_widget_edit.f;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import java.util.Set;

/* compiled from: DaggerUniversalWidgetCreateComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerUniversalWidgetCreateComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.extended_profile_universal_widget_edit.create.di.b.a
        public final com.avito.android.extended_profile_universal_widget_edit.create.di.b a(UniversalWidgetCreateArguments universalWidgetCreateArguments, C28478k c28478k, UniversalWidgetCreateFragment universalWidgetCreateFragment, l lVar, com.avito.android.extended_profile_universal_widget_edit.create.di.c cVar, InterfaceC39417a interfaceC39417a) {
            universalWidgetCreateArguments.getClass();
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, universalWidgetCreateArguments, c28478k, universalWidgetCreateFragment, lVar, null);
        }
    }

    /* compiled from: DaggerUniversalWidgetCreateComponent.java */
    public static final class c implements com.avito.android.extended_profile_universal_widget_edit.create.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC19524a> f153695a;

        /* renamed from: b, reason: collision with root package name */
        public final u<R0> f153696b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC35863o4> f153697c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.l f153698d;

        /* renamed from: e, reason: collision with root package name */
        public final u<f> f153699e;

        /* renamed from: f, reason: collision with root package name */
        public final k f153700f;

        /* renamed from: g, reason: collision with root package name */
        public final h f153701g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28481c> f153702h;

        /* renamed from: i, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f153703i;

        /* renamed from: j, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f153704j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.extended_profile_universal_widget_edit.create.adapter.section.c> f153705k;

        /* renamed from: l, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f153706l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f153707m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f153708n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f153709o;

        /* compiled from: DaggerUniversalWidgetCreateComponent.java */
        /* renamed from: com.avito.android.extended_profile_universal_widget_edit.create.di.a$c$a, reason: collision with other inner class name */
        public static final class C4483a implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_universal_widget_edit.create.di.c f153710a;

            public C4483a(com.avito.android.extended_profile_universal_widget_edit.create.di.c cVar) {
                this.f153710a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f153710a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerUniversalWidgetCreateComponent.java */
        public static final class b implements u<InterfaceC19524a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_universal_widget_edit.create.di.c f153711a;

            public b(com.avito.android.extended_profile_universal_widget_edit.create.di.c cVar) {
                this.f153711a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC19524a interfaceC19524aV6 = this.f153711a.V6();
                t.c(interfaceC19524aV6);
                return interfaceC19524aV6;
            }
        }

        /* compiled from: DaggerUniversalWidgetCreateComponent.java */
        /* renamed from: com.avito.android.extended_profile_universal_widget_edit.create.di.a$c$c, reason: collision with other inner class name */
        public static final class C4484c implements u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_universal_widget_edit.create.di.c f153712a;

            public C4484c(com.avito.android.extended_profile_universal_widget_edit.create.di.c cVar) {
                this.f153712a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35863o4 interfaceC35863o4M = this.f153712a.m();
                t.c(interfaceC35863o4M);
                return interfaceC35863o4M;
            }
        }

        /* compiled from: DaggerUniversalWidgetCreateComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_universal_widget_edit.create.di.c f153713a;

            public d(com.avito.android.extended_profile_universal_widget_edit.create.di.c cVar) {
                this.f153713a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f153713a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerUniversalWidgetCreateComponent.java */
        public static final class e implements u<f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_universal_widget_edit.create.di.c f153714a;

            public e(com.avito.android.extended_profile_universal_widget_edit.create.di.c cVar) {
                this.f153714a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f153714a.T4();
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.extended_profile_universal_widget_edit.create.di.c cVar, cv.b bVar, UniversalWidgetCreateArguments universalWidgetCreateArguments, C28478k c28478k, Fragment fragment, l lVar, C4482a c4482a) {
            this.f153695a = new b(cVar);
            this.f153696b = new C4483a(cVar);
            this.f153697c = new C4484c(cVar);
            dagger.internal.l lVarA = dagger.internal.l.a(universalWidgetCreateArguments);
            this.f153698d = lVarA;
            com.avito.android.extended_profile_universal_widget_edit.create.mvi.b bVar2 = new com.avito.android.extended_profile_universal_widget_edit.create.mvi.b(new com.avito.android.extended_profile_universal_widget_edit.create.interactor.c(this.f153695a, this.f153696b, this.f153697c, lVarA, new e(cVar), com.avito.android.extended_profile_universal_widget_edit.l.a()));
            this.f153700f = new k(this.f153698d);
            this.f153701g = new h(new g(bVar2, i.a(), this.f153700f, com.avito.android.extended_profile_universal_widget_edit.create.mvi.d.a()));
            this.f153702h = new d(cVar);
            this.f153703i = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f153702h);
            this.f153704j = B.a(com.avito.android.konveyor_adapter_module.d.a());
            u<com.avito.android.extended_profile_universal_widget_edit.create.adapter.section.c> uVarD = dagger.internal.g.d(new com.avito.android.extended_profile_universal_widget_edit.create.adapter.section.f(dagger.internal.l.a(lVar)));
            this.f153705k = uVarD;
            this.f153706l = dagger.internal.g.d(new com.avito.android.extended_profile_universal_widget_edit.create.adapter.section.b(uVarD));
            A.b bVarA = A.a(1, 1);
            bVarA.f393938b.add(this.f153704j);
            bVarA.f393937a.add(this.f153706l);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f153707m = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f153708n = uVarH;
            this.f153709o = dagger.internal.g.d(new com.avito.android.extended_profile_universal_widget_edit.create.di.e(uVarH, this.f153707m));
        }

        @Override // com.avito.android.extended_profile_universal_widget_edit.create.di.b
        public final void a(UniversalWidgetCreateFragment universalWidgetCreateFragment) {
            universalWidgetCreateFragment.f153662n0 = this.f153701g;
            universalWidgetCreateFragment.f153664p0 = this.f153703i.get();
            universalWidgetCreateFragment.f153665q0 = this.f153709o.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
