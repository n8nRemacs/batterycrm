package com.avito.android.screens.bbip_private_v2.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.screens.bbip_private_v2.di.a;
import com.avito.android.screens.bbip_private_v2.mvi.f;
import com.avito.android.screens.bbip_private_v2.mvi.i;
import com.avito.android.screens.bbip_private_v2.mvi.k;
import com.avito.android.screens.bbip_private_v2.mvi.n;
import com.avito.android.screens.bbip_private_v2.ui.BbipPrivateV2Fragment;
import com.avito.android.screens.bbip_private_v2.ui.g;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import hh.InterfaceC40934b;
import ih.InterfaceC41399a;

/* compiled from: DaggerBbipPrivateV2Component.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class e {

    /* compiled from: DaggerBbipPrivateV2Component.java */
    public static final class b implements com.avito.android.screens.bbip_private_v2.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f260891a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC40934b f260892b;

        /* renamed from: c, reason: collision with root package name */
        public final l f260893c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC41399a> f260894d;

        /* renamed from: e, reason: collision with root package name */
        public final u<R0> f260895e;

        /* renamed from: f, reason: collision with root package name */
        public final f f260896f;

        /* renamed from: g, reason: collision with root package name */
        public final u<Gson> f260897g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.screens.bbip_private_v2.mvi.d f260898h;

        /* renamed from: i, reason: collision with root package name */
        public final n f260899i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC28481c> f260900j;

        /* renamed from: k, reason: collision with root package name */
        public final u<C28478k> f260901k;

        /* renamed from: l, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f260902l;

        /* renamed from: m, reason: collision with root package name */
        public final g f260903m;

        /* compiled from: DaggerBbipPrivateV2Component.java */
        public static final class a implements u<InterfaceC41399a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40934b f260904a;

            public a(InterfaceC40934b interfaceC40934b) {
                this.f260904a = interfaceC40934b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC41399a interfaceC41399aPc = this.f260904a.Pc();
                t.c(interfaceC41399aPc);
                return interfaceC41399aPc;
            }
        }

        /* compiled from: DaggerBbipPrivateV2Component.java */
        /* renamed from: com.avito.android.screens.bbip_private_v2.di.e$b$b, reason: collision with other inner class name */
        public static final class C7815b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40934b f260905a;

            public C7815b(InterfaceC40934b interfaceC40934b) {
                this.f260905a = interfaceC40934b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f260905a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerBbipPrivateV2Component.java */
        public static final class c implements u<Gson> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40934b f260906a;

            public c(InterfaceC40934b interfaceC40934b) {
                this.f260906a = interfaceC40934b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Gson gsonS = this.f260906a.s();
                t.c(gsonS);
                return gsonS;
            }
        }

        /* compiled from: DaggerBbipPrivateV2Component.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40934b f260907a;

            public d(InterfaceC40934b interfaceC40934b) {
                this.f260907a = interfaceC40934b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f260907a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(InterfaceC40934b interfaceC40934b, cv.b bVar, r rVar, String str, String str2, a aVar) {
            this.f260891a = bVar;
            this.f260892b = interfaceC40934b;
            this.f260893c = l.a(str2);
            l lVarA = l.a(str);
            a aVar2 = new a(interfaceC40934b);
            C7815b c7815b = new C7815b(interfaceC40934b);
            com.avito.android.screens.bbip_private_v2.domain.b bVar2 = new com.avito.android.screens.bbip_private_v2.domain.b(lVarA, aVar2, c7815b);
            l lVar = this.f260893c;
            this.f260896f = new f(lVar, bVar2);
            com.avito.android.screens.bbip_private_v2.data.d dVar = new com.avito.android.screens.bbip_private_v2.data.d(lVarA, lVar, new c(interfaceC40934b));
            this.f260898h = new com.avito.android.screens.bbip_private_v2.mvi.d(lVar, bVar2, new com.avito.android.screens.bbip_private_v2.domain.f(aVar2, c7815b, dVar), new com.avito.android.screens.bbip_private_v2.domain.d(aVar2, c7815b, dVar), dVar);
            this.f260899i = new n(dVar);
            this.f260900j = new d(interfaceC40934b);
            u<C28478k> uVarD = dagger.internal.g.d(new com.avito.android.screens.bbip_private_v2.di.c(l.a(rVar)));
            this.f260901k = uVarD;
            this.f260902l = com.avito.android.advert.item.delivery_suggests.l.i(this.f260900j, uVarD);
            this.f260903m = new g(new i(this.f260896f, this.f260898h, k.a(), this.f260899i, this.f260902l));
        }

        @Override // com.avito.android.screens.bbip_private_v2.di.a
        public final void a(BbipPrivateV2Fragment bbipPrivateV2Fragment) {
            bbipPrivateV2Fragment.f261119n0 = this.f260903m;
            bbipPrivateV2Fragment.f261121p0 = this.f260902l.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f260891a.u4();
            t.c(aVarU4);
            bbipPrivateV2Fragment.f261122q0 = aVarU4;
            SK0.b bVarP = this.f260892b.p();
            t.c(bVarP);
            bbipPrivateV2Fragment.f261123r0 = new ZK0.b(bVarP);
        }
    }

    /* compiled from: DaggerBbipPrivateV2Component.java */
    public static final class c implements a.InterfaceC7814a {
        public c() {
        }

        @Override // com.avito.android.screens.bbip_private_v2.di.a.InterfaceC7814a
        public final com.avito.android.screens.bbip_private_v2.di.a a(InterfaceC40934b interfaceC40934b, InterfaceC39417a interfaceC39417a, r rVar, String str, String str2) {
            interfaceC39417a.getClass();
            return new b(interfaceC40934b, interfaceC39417a, rVar, str, str2, null);
        }
    }

    public static a.InterfaceC7814a a() {
        return new c();
    }
}
