package com.avito.android.esia_redirect_screen.di;

import Gz.C13934a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.x;
import com.avito.android.esia_redirect_screen.di.j;
import com.avito.android.esia_redirect_screen.ui.EsiaRedirectActivity;
import com.avito.android.remote.H;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;

/* compiled from: DaggerEsiaRedirectComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class i {

    /* compiled from: DaggerEsiaRedirectComponent.java */
    public static final class b implements j {

        /* renamed from: a, reason: collision with root package name */
        public final l f148010a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f148011b;

        /* renamed from: c, reason: collision with root package name */
        public final u<x> f148012c;

        /* renamed from: d, reason: collision with root package name */
        public final u<IF.a> f148013d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.esia_redirect_screen.mvi.f f148014e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.esia_redirect_screen.mvi.i f148015f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.l f148016g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.esia_redirect_screen.mvi.r f148017h;

        /* renamed from: i, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f148018i;

        /* renamed from: j, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f148019j;

        /* renamed from: k, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f148020k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f148021l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f148022m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f148023n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.l f148024o;

        /* renamed from: p, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f148025p;

        /* renamed from: q, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f148026q;

        /* renamed from: r, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f148027r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f148028s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f148029t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f148030u;

        /* compiled from: DaggerEsiaRedirectComponent.java */
        public static final class a implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final l f148031a;

            public a(l lVar) {
                this.f148031a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarQ = this.f148031a.q();
                t.c(xVarQ);
                return xVarQ;
            }
        }

        /* compiled from: DaggerEsiaRedirectComponent.java */
        /* renamed from: com.avito.android.esia_redirect_screen.di.i$b$b, reason: collision with other inner class name */
        public static final class C4332b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f148032a;

            public C4332b(cv.b bVar) {
                this.f148032a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f148032a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerEsiaRedirectComponent.java */
        public static final class c implements u<IF.a> {

            /* renamed from: a, reason: collision with root package name */
            public final l f148033a;

            public c(l lVar) {
                this.f148033a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                IF.a aVarKc = this.f148033a.Kc();
                t.c(aVarKc);
                return aVarKc;
            }
        }

        public b() {
            throw null;
        }

        public b(l lVar, cv.b bVar, Y41.l lVar2, Y41.a aVar, a aVar2) {
            this.f148010a = lVar;
            C4332b c4332b = new C4332b(bVar);
            com.avito.android.esia_redirect_screen.mvi.data_loaders.c cVar = new com.avito.android.esia_redirect_screen.mvi.data_loaders.c(c4332b, new com.avito.android.esia_redirect_screen.domain.b(new a(lVar), new c(lVar)));
            this.f148014e = new com.avito.android.esia_redirect_screen.mvi.f(cVar, c4332b);
            this.f148015f = new com.avito.android.esia_redirect_screen.mvi.i(cVar, c4332b);
            this.f148016g = dagger.internal.l.a(aVar);
            this.f148017h = new com.avito.android.esia_redirect_screen.mvi.r(new com.avito.android.esia_redirect_screen.mvi.l(this.f148014e, com.avito.android.esia_redirect_screen.mvi.n.a(), this.f148015f, com.avito.android.esia_redirect_screen.mvi.p.a(), this.f148016g));
            this.f148018i = dagger.internal.g.d(new com.avito.android.esia_redirect_screen.content_list.logo_item.b(com.avito.android.esia_redirect_screen.content_list.logo_item.e.a()));
            this.f148019j = dagger.internal.g.d(new com.avito.android.esia_redirect_screen.content_list.title_item.b(com.avito.android.esia_redirect_screen.content_list.title_item.e.a()));
            this.f148020k = dagger.internal.g.d(new com.avito.android.esia_redirect_screen.content_list.requirement_item.b(com.avito.android.esia_redirect_screen.content_list.requirement_item.e.a()));
            A.b bVarA = A.a(3, 0);
            u<TV0.b<?, ?>> uVar = this.f148018i;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f148019j);
            list.add(this.f148020k);
            u<com.avito.konveyor.a> uVarD = dagger.internal.g.d(new r(bVarA.b()));
            this.f148021l = uVarD;
            u<com.avito.konveyor.adapter.a> uVarD2 = dagger.internal.g.d(new q(uVarD));
            this.f148022m = uVarD2;
            this.f148023n = dagger.internal.g.d(new s(uVarD2, this.f148021l));
            dagger.internal.l lVarA = dagger.internal.l.a(lVar2);
            this.f148024o = lVarA;
            this.f148025p = dagger.internal.g.d(new com.avito.android.esia_redirect_screen.buttons_list.primary_item.b(new com.avito.android.esia_redirect_screen.buttons_list.primary_item.e(lVarA)));
            this.f148026q = dagger.internal.g.d(new com.avito.android.esia_redirect_screen.buttons_list.secondary_item.b(new com.avito.android.esia_redirect_screen.buttons_list.secondary_item.e(this.f148024o)));
            this.f148027r = dagger.internal.g.d(new com.avito.android.esia_redirect_screen.buttons_list.link_item.b(new com.avito.android.esia_redirect_screen.buttons_list.link_item.e(this.f148024o)));
            A.b bVarA2 = A.a(3, 0);
            u<TV0.b<?, ?>> uVar2 = this.f148025p;
            List<u<T>> list2 = bVarA2.f393937a;
            list2.add(uVar2);
            list2.add(this.f148026q);
            list2.add(this.f148027r);
            u<com.avito.konveyor.a> uVarD3 = dagger.internal.g.d(new o(bVarA2.b()));
            this.f148028s = uVarD3;
            u<com.avito.konveyor.adapter.a> uVarD4 = dagger.internal.g.d(new n(uVarD3));
            this.f148029t = uVarD4;
            this.f148030u = dagger.internal.g.d(new p(uVarD4, this.f148028s));
        }

        @Override // com.avito.android.esia_redirect_screen.di.j
        public final void a(EsiaRedirectActivity esiaRedirectActivity) {
            esiaRedirectActivity.f148096m = this.f148017h;
            esiaRedirectActivity.f148098o = this.f148023n.get();
            esiaRedirectActivity.f148099p = this.f148030u.get();
            l lVar = this.f148010a;
            InterfaceC28373a interfaceC28373aA = lVar.a();
            t.c(interfaceC28373aA);
            com.avito.android.analytics.provider.a aVarV = lVar.v();
            t.c(aVarV);
            com.avito.android.server_time.f fVarL = lVar.l();
            t.c(fVarL);
            H hK2 = lVar.K();
            t.c(hK2);
            esiaRedirectActivity.f148100q = new C13934a(interfaceC28373aA, aVarV, fVarL, hK2);
        }
    }

    /* compiled from: DaggerEsiaRedirectComponent.java */
    public static final class c implements j.a {
        public c() {
        }

        @Override // com.avito.android.esia_redirect_screen.di.j.a
        public final j a(Y41.l lVar, Y41.a aVar, l lVar2, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new b(lVar2, interfaceC39417a, lVar, aVar, null);
        }
    }

    public static j.a a() {
        return new c();
    }
}
