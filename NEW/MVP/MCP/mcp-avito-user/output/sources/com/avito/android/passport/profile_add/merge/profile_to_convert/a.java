package com.avito.android.passport.profile_add.merge.profile_to_convert;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.passport.profile_add.merge.profile_to_convert.b;
import com.avito.android.passport.profile_list_item.n;
import com.avito.android.passport.profile_list_item.q;
import d60.InterfaceC39512a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Set;

/* compiled from: DaggerProfileToConvertComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerProfileToConvertComponent.java */
    public static final class b implements b.a {
        public b() {
        }
    }

    /* compiled from: DaggerProfileToConvertComponent.java */
    public static final class c implements com.avito.android.passport.profile_add.merge.profile_to_convert.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f213097a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.passport.profile_list_item.e> f213098b;

        /* renamed from: c, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f213099c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.passport.profile_add.merge.profile_to_convert.recycler.e> f213100d;

        /* renamed from: e, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f213101e;

        /* renamed from: f, reason: collision with root package name */
        public final u<n> f213102f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.passport.profile_list_item.a> f213103g;

        /* renamed from: h, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f213104h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f213105i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f213106j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f213107k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC28481c> f213108l;

        /* renamed from: m, reason: collision with root package name */
        public final u<C28478k> f213109m;

        /* renamed from: n, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f213110n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f213111o;

        /* renamed from: p, reason: collision with root package name */
        public final u<InterfaceC28373a> f213112p;

        /* renamed from: q, reason: collision with root package name */
        public final u<r60.d> f213113q;

        /* renamed from: r, reason: collision with root package name */
        public final com.avito.android.passport.profile_add.merge.profile_to_convert.mvi.i f213114r;

        /* renamed from: s, reason: collision with root package name */
        public final m f213115s;

        /* compiled from: DaggerProfileToConvertComponent.java */
        /* renamed from: com.avito.android.passport.profile_add.merge.profile_to_convert.a$c$a, reason: collision with other inner class name */
        public static final class C6380a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC39512a f213116a;

            public C6380a(InterfaceC39512a interfaceC39512a) {
                this.f213116a = interfaceC39512a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f213116a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerProfileToConvertComponent.java */
        public static final class b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f213117a;

            public b(cv.b bVar) {
                this.f213117a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f213117a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerProfileToConvertComponent.java */
        /* renamed from: com.avito.android.passport.profile_add.merge.profile_to_convert.a$c$c, reason: collision with other inner class name */
        public static final class C6381c implements u<r60.d> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC39512a f213118a;

            public C6381c(InterfaceC39512a interfaceC39512a) {
                this.f213118a = interfaceC39512a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f213118a.X1();
            }
        }

        /* compiled from: DaggerProfileToConvertComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC39512a f213119a;

            public d(InterfaceC39512a interfaceC39512a) {
                this.f213119a = interfaceC39512a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f213119a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c() {
            throw null;
        }

        public c(h hVar, com.avito.android.passport.profile_add.merge.profile_to_convert.recycler.c cVar, InterfaceC39512a interfaceC39512a, cv.b bVar, List list, r rVar, Y41.l lVar, C6379a c6379a) {
            this.f213097a = B.a(com.avito.android.konveyor_adapter_module.d.a());
            u<com.avito.android.passport.profile_list_item.e> uVarD = dagger.internal.g.d(new com.avito.android.passport.profile_add.merge.profile_to_convert.recycler.k(dagger.internal.l.a(lVar)));
            this.f213098b = uVarD;
            this.f213099c = dagger.internal.g.d(new com.avito.android.passport.profile_list_item.c(uVarD));
            u<com.avito.android.passport.profile_add.merge.profile_to_convert.recycler.e> uVarD2 = dagger.internal.g.d(new com.avito.android.passport.profile_add.merge.profile_to_convert.recycler.d(cVar));
            this.f213100d = uVarD2;
            this.f213101e = dagger.internal.g.d(new com.avito.android.passport.profile_add.merge.profile_to_convert.recycler.b(uVarD2));
            this.f213102f = dagger.internal.g.d(q.a());
            u<com.avito.android.passport.profile_list_item.a> uVarD3 = dagger.internal.g.d(com.avito.android.passport.profile_add.merge.profile_to_convert.recycler.m.a());
            this.f213103g = uVarD3;
            this.f213104h = dagger.internal.g.d(new com.avito.android.passport.profile_list_item.l(uVarD3, this.f213102f));
            A.b bVarA = A.a(3, 1);
            bVarA.f393938b.add(this.f213097a);
            u<TV0.b<?, ?>> uVar = this.f213099c;
            List<u<T>> list2 = bVarA.f393937a;
            list2.add(uVar);
            list2.add(this.f213101e);
            list2.add(this.f213104h);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f213105i = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f213106j = uVarH;
            this.f213107k = dagger.internal.g.d(new i(hVar, uVarH, this.f213105i));
            this.f213108l = new d(interfaceC39512a);
            u<C28478k> uVarD4 = dagger.internal.g.d(new k(dagger.internal.l.a(rVar)));
            this.f213109m = uVarD4;
            this.f213110n = com.avito.android.advert.item.delivery_suggests.l.i(this.f213108l, uVarD4);
            dagger.internal.l lVarA = dagger.internal.l.a(list);
            b bVar2 = new b(bVar);
            com.avito.android.passport.profile_add.merge.profile_to_convert.mvi.g gVar = new com.avito.android.passport.profile_add.merge.profile_to_convert.mvi.g(lVarA, bVar2, new C6380a(interfaceC39512a), new C6381c(interfaceC39512a));
            this.f213114r = new com.avito.android.passport.profile_add.merge.profile_to_convert.mvi.i(bVar2);
            this.f213115s = new m(new com.avito.android.passport.profile_add.merge.profile_to_convert.mvi.l(gVar, com.avito.android.passport.profile_add.merge.profile_to_convert.mvi.b.a(), this.f213114r, this.f213110n, com.avito.android.passport.profile_add.merge.profile_to_convert.mvi.n.a()));
        }
    }
}
