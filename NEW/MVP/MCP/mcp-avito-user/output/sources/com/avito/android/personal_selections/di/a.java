package com.avito.android.personal_selections.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.personal_selections.di.b;
import com.avito.android.personal_selections.di.c;
import com.avito.android.personal_selections.mvi.j;
import com.avito.android.personal_selections.mvi.n;
import com.avito.android.personal_selections.mvi.o;
import com.avito.android.user_adverts.tab_screens.di.m;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import n70.InterfaceC44207a;

/* compiled from: DaggerPersonalSelectionsFeatureComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerPersonalSelectionsFeatureComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.personal_selections.di.c.b
        public final com.avito.android.personal_selections.di.c a(m mVar, InterfaceC39417a interfaceC39417a, com.avito.android.user_adverts.tab_screens.adverts.dataProvider.h hVar, com.avito.android.personal_selections.mvi.a aVar) {
            interfaceC39417a.getClass();
            return new c(mVar, interfaceC39417a, hVar, aVar, null);
        }
    }

    /* compiled from: DaggerPersonalSelectionsFeatureComponent.java */
    public static final class c implements com.avito.android.personal_selections.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<com.avito.android.personal_selections.view.d> f215771a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.personal_selections.view.a> f215772b;

        /* renamed from: c, reason: collision with root package name */
        public final l f215773c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f215774d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC44207a> f215775e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28373a> f215776f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.personal_selections.domain.b> f215777g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f215778h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.personal_selections.mvi.g f215779i;

        /* renamed from: j, reason: collision with root package name */
        public final u<o.a> f215780j;

        /* compiled from: DaggerPersonalSelectionsFeatureComponent.java */
        /* renamed from: com.avito.android.personal_selections.di.a$c$a, reason: collision with other inner class name */
        public static final class C6468a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final c.a f215781a;

            public C6468a(c.a aVar) {
                this.f215781a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f215781a.a();
            }
        }

        /* compiled from: DaggerPersonalSelectionsFeatureComponent.java */
        public static final class b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f215782a;

            public b(cv.b bVar) {
                this.f215782a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f215782a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerPersonalSelectionsFeatureComponent.java */
        /* renamed from: com.avito.android.personal_selections.di.a$c$c, reason: collision with other inner class name */
        public static final class C6469c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final c.a f215783a;

            public C6469c(c.a aVar) {
                this.f215783a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f215783a.c();
            }
        }

        /* compiled from: DaggerPersonalSelectionsFeatureComponent.java */
        public static final class d implements u<InterfaceC44207a> {

            /* renamed from: a, reason: collision with root package name */
            public final c.a f215784a;

            public d(c.a aVar) {
                this.f215784a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f215784a.y6();
            }
        }

        public c(c.a aVar, cv.b bVar, com.avito.android.personal_selections.domain.a aVar2, com.avito.android.personal_selections.mvi.a aVar3, C6467a c6467a) {
            u<com.avito.android.personal_selections.view.d> uVarD = dagger.internal.g.d(com.avito.android.personal_selections.view.g.a());
            this.f215771a = uVarD;
            this.f215772b = dagger.internal.g.d(new com.avito.android.personal_selections.view.c(uVarD));
            l lVarA = l.a(aVar3);
            this.f215773c = lVarA;
            C6469c c6469c = new C6469c(aVar);
            d dVar = new d(aVar);
            C6468a c6468a = new C6468a(aVar);
            this.f215776f = c6468a;
            this.f215777g = dagger.internal.g.d(new com.avito.android.personal_selections.domain.e(lVarA, c6469c, dVar, c6468a));
            l lVarA2 = l.a(aVar2);
            b bVar2 = new b(bVar);
            u<com.avito.android.personal_selections.domain.b> uVar = this.f215777g;
            u<InterfaceC28373a> uVar2 = this.f215776f;
            l lVar = this.f215773c;
            this.f215779i = new com.avito.android.personal_selections.mvi.g(lVarA2, lVar, uVar, bVar2, uVar2);
            this.f215780j = dagger.internal.g.d(new com.avito.android.personal_selections.mvi.l(new j(lVar, n.a(), this.f215779i)));
        }

        @Override // com.avito.android.personal_selections.di.c
        public final o.a a() {
            return this.f215780j.get();
        }

        @Override // com.avito.android.personal_selections.di.c
        public final com.avito.android.personal_selections.view.a b() {
            return this.f215772b.get();
        }

        @Override // com.avito.android.personal_selections.di.c
        public final com.avito.android.personal_selections.view.d c() {
            return this.f215771a.get();
        }
    }
}
