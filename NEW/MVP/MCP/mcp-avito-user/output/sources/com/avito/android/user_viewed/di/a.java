package com.avito.android.user_viewed.di;

import Y41.l;
import android.content.res.Resources;
import com.avito.android.ab_tests.groups.SimpleTestGroup;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.date_time_formatter.g;
import com.avito.android.di.module.C30070i4;
import com.avito.android.favorite.h;
import com.avito.android.favorites.adapter.advert.p;
import com.avito.android.user_viewed.di.b;
import com.avito.android.user_viewed.domain.business.g;
import com.avito.android.user_viewed.domain.business.j;
import com.avito.android.user_viewed.domain.business.n;
import com.avito.android.user_viewed.domain.mapper.i;
import com.avito.android.user_viewed.screen.mvi.m;
import com.avito.android.user_viewed.screen.mvi.o;
import com.avito.android.user_viewed.screen.mvi.x;
import com.avito.android.user_viewed.screen.ui.UserViewedFragment;
import com.avito.android.user_viewed.screen.ui.e;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;
import dagger.internal.z;
import fK0.InterfaceC40305b;
import iK0.InterfaceC41310a;
import java.util.Iterator;
import java.util.Set;
import kotlin.G0;
import lK0.InterfaceC43650a;
import nK0.C44287b;
import oK0.C44660b;

/* compiled from: DaggerUserViewedComponent.java */
@e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerUserViewedComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.user_viewed.di.b.a
        public final com.avito.android.user_viewed.di.b a(InterfaceC40305b interfaceC40305b, InterfaceC39417a interfaceC39417a, Resources resources, C28478k c28478k, l lVar) {
            interfaceC39417a.getClass();
            return new c(interfaceC40305b, interfaceC39417a, resources, c28478k, lVar, null);
        }
    }

    /* compiled from: DaggerUserViewedComponent.java */
    public static final class c implements com.avito.android.user_viewed.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC40305b f318299a;

        /* renamed from: b, reason: collision with root package name */
        public final C28478k f318300b;

        /* renamed from: c, reason: collision with root package name */
        public final l<? super InterfaceC43650a, G0> f318301c;

        /* renamed from: d, reason: collision with root package name */
        public final cv.b f318302d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.advert.viewed.persistance.b> f318303e;

        /* renamed from: f, reason: collision with root package name */
        public final j f318304f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC41310a> f318305g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.user_viewed.domain.mapper.c f318306h;

        /* renamed from: i, reason: collision with root package name */
        public final u<h> f318307i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.user_viewed.domain.business.a> f318308j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC28373a> f318309k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.user_viewed.screen.mvi.j f318310l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.analytics.provider.e> f318311m;

        /* renamed from: n, reason: collision with root package name */
        public final com.avito.android.user_viewed.screen.mvi.f f318312n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC28481c> f318313o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.user_viewed.di.module.internal.h f318314p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.l f318315q;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.l f318316r;

        /* compiled from: DaggerUserViewedComponent.java */
        /* renamed from: com.avito.android.user_viewed.di.a$c$a, reason: collision with other inner class name */
        public static final class C9880a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40305b f318317a;

            public C9880a(InterfaceC40305b interfaceC40305b) {
                this.f318317a = interfaceC40305b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f318317a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerUserViewedComponent.java */
        public static final class b implements u<h> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40305b f318318a;

            public b(InterfaceC40305b interfaceC40305b) {
                this.f318318a = interfaceC40305b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f318318a.P0();
            }
        }

        /* compiled from: DaggerUserViewedComponent.java */
        /* renamed from: com.avito.android.user_viewed.di.a$c$c, reason: collision with other inner class name */
        public static final class C9881c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40305b f318319a;

            public C9881c(InterfaceC40305b interfaceC40305b) {
                this.f318319a = interfaceC40305b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f318319a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerUserViewedComponent.java */
        public static final class d implements u<com.avito.android.analytics.provider.e> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40305b f318320a;

            public d(InterfaceC40305b interfaceC40305b) {
                this.f318320a = interfaceC40305b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f318320a.Z0();
            }
        }

        /* compiled from: DaggerUserViewedComponent.java */
        public static final class e implements u<InterfaceC41310a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40305b f318321a;

            public e(InterfaceC40305b interfaceC40305b) {
                this.f318321a = interfaceC40305b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC41310a interfaceC41310aVi = this.f318321a.Vi();
                t.c(interfaceC41310aVi);
                return interfaceC41310aVi;
            }
        }

        /* compiled from: DaggerUserViewedComponent.java */
        public static final class f implements u<com.avito.android.advert.viewed.persistance.b> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40305b f318322a;

            public f(InterfaceC40305b interfaceC40305b) {
                this.f318322a = interfaceC40305b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.advert.viewed.persistance.b bVarI5 = this.f318322a.i5();
                t.c(bVarI5);
                return bVarI5;
            }
        }

        public c() {
            throw null;
        }

        public c(InterfaceC40305b interfaceC40305b, cv.b bVar, Resources resources, C28478k c28478k, l lVar, C9879a c9879a) {
            this.f318299a = interfaceC40305b;
            this.f318300b = c28478k;
            this.f318301c = lVar;
            this.f318302d = bVar;
            this.f318304f = new j(new f(interfaceC40305b));
            this.f318305g = new e(interfaceC40305b);
            this.f318306h = new com.avito.android.user_viewed.domain.mapper.c(com.avito.android.user_viewed.domain.mapper.l.a(), com.avito.android.user_viewed.domain.mapper.f.a());
            n nVar = new n(this.f318305g, i.a(), this.f318306h);
            b bVar2 = new b(interfaceC40305b);
            this.f318307i = bVar2;
            u<com.avito.android.user_viewed.domain.business.a> uVarA = B.a(new g(this.f318304f, nVar, bVar2));
            this.f318308j = uVarA;
            C9880a c9880a = new C9880a(interfaceC40305b);
            u<h> uVar = this.f318307i;
            this.f318310l = new com.avito.android.user_viewed.screen.mvi.j(uVarA, uVar, c9880a);
            this.f318312n = new com.avito.android.user_viewed.screen.mvi.f(uVarA, uVar, new d(interfaceC40305b), c9880a);
            this.f318313o = new C9881c(interfaceC40305b);
            this.f318314p = new com.avito.android.user_viewed.di.module.internal.h(dagger.internal.l.a(c28478k), this.f318313o);
            this.f318315q = dagger.internal.l.a(new com.avito.android.user_viewed.screen.ui.g(new com.avito.android.user_viewed.screen.ui.f(new m(this.f318310l, this.f318312n, o.a(), x.a(), this.f318314p))));
            this.f318316r = com.avito.android.date_time_formatter.i.b(new com.avito.android.date_time_formatter.h(dagger.internal.l.a(resources)));
        }

        @Override // com.avito.android.user_viewed.di.b
        public final void a(UserViewedFragment userViewedFragment) throws BlueprintCollisionException {
            userViewedFragment.f318466t0 = (e.a) this.f318315q.f393949a;
            InterfaceC28481c interfaceC28481cB = this.f318299a.b();
            t.c(interfaceC28481cB);
            int i12 = com.avito.android.user_viewed.di.module.internal.g.f318327a;
            userViewedFragment.f318468v0 = interfaceC28481cB.a(this.f318300b);
            new com.avito.android.user_viewed.screen.ui.mapper.b();
            userViewedFragment.f318469w0 = new C44660b();
            com.avito.konveyor.a aVarB = b();
            com.avito.android.user_viewed.di.module.internal.b bVar = com.avito.android.user_viewed.di.module.internal.b.f318326a;
            bVar.getClass();
            com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVarB, aVarB, null, 4, null);
            com.avito.konveyor.a aVarB2 = b();
            bVar.getClass();
            userViewedFragment.f318470x0 = new com.avito.konveyor.adapter.d(hVar, aVarB2, null, 4, null);
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f318302d.u4();
            t.c(aVarU4);
            userViewedFragment.f318471y0 = aVarU4;
        }

        public final com.avito.konveyor.a b() throws BlueprintCollisionException {
            z zVar = new z(5);
            l<? super InterfaceC43650a, G0> lVar = this.f318301c;
            C44287b c44287b = new C44287b(lVar);
            InterfaceC40305b interfaceC40305b = this.f318299a;
            u3.h<SimpleTestGroup> hVarU3 = interfaceC40305b.U3();
            t.c(hVarU3);
            p pVar = new p(c44287b, hVarU3);
            com.avito.android.server_time.h hVarY = interfaceC40305b.y();
            t.c(hVarY);
            g.a aVar = (g.a) this.f318316r.f393949a;
            int i12 = C30070i4.f144347a;
            zVar.a(new com.avito.android.favorites.adapter.advert.a(pVar, new com.avito.android.date_time_formatter.c(hVarY, aVar.a(1), interfaceC40305b.locale()), interfaceC40305b.D()));
            zVar.a(new com.avito.android.user_viewed.screen.ui.item.loading.a());
            zVar.a(new com.avito.android.user_viewed.screen.ui.item.empty.a());
            zVar.a(new com.avito.android.user_viewed.screen.ui.item.error.b(new com.avito.android.user_viewed.screen.ui.item.error.e(lVar)));
            zVar.a(new com.avito.android.user_viewed.screen.ui.item.tracker.c(new com.avito.android.user_viewed.screen.ui.item.tracker.f(lVar)));
            Set setC = zVar.c();
            com.avito.android.user_viewed.di.module.internal.b.f318326a.getClass();
            a.C10493a c10493a = new a.C10493a();
            Iterator it = setC.iterator();
            while (it.hasNext()) {
                c10493a.b((TV0.b) it.next());
            }
            return c10493a.a();
        }
    }

    public static b.a a() {
        return new b();
    }
}
