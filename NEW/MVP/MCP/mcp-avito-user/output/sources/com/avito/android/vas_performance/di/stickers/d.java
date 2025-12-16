package com.avito.android.vas_performance.di.stickers;

import androidx.fragment.app.Fragment;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.StickersBuyVasScreen;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.vas_performance.di.stickers.g;
import com.avito.android.vas_performance.ui.stickers.buy.StickersBuyVasFragment;
import com.avito.android.vas_performance.ui.stickers.buy.v;
import com.avito.android.vas_performance.ui.stickers.buy.w;
import com.avito.android.vas_performance.ui.stickers.buy.x;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import dagger.internal.z;
import java.util.List;
import java.util.Set;
import zL0.InterfaceC50482a;

/* compiled from: DaggerStickersBuyVasComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class d {

    /* compiled from: DaggerStickersBuyVasComponent.java */
    public static final class b implements g.a {
        public b() {
        }

        @Override // com.avito.android.vas_performance.di.stickers.g.a
        public final g a(String str, String str2, boolean z12, StickersBuyVasFragment stickersBuyVasFragment, StickersBuyVasScreen stickersBuyVasScreen, String str3, com.avito.android.analytics.screens.r rVar, p pVar, InterfaceC39417a interfaceC39417a) {
            stickersBuyVasScreen.getClass();
            str3.getClass();
            interfaceC39417a.getClass();
            return new c(new q(), pVar, interfaceC39417a, str, str2, Boolean.valueOf(z12), stickersBuyVasFragment, stickersBuyVasScreen, str3, rVar, null);
        }
    }

    /* compiled from: DaggerStickersBuyVasComponent.java */
    public static final class c implements g {

        /* renamed from: A, reason: collision with root package name */
        public final u<v> f320058A;

        /* renamed from: B, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f320059B;

        /* renamed from: C, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f320060C;

        /* renamed from: a, reason: collision with root package name */
        public final p f320061a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f320062b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.ui.items.header.c> f320063c;

        /* renamed from: d, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f320064d;

        /* renamed from: e, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f320065e;

        /* renamed from: f, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f320066f;

        /* renamed from: g, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f320067g;

        /* renamed from: h, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f320068h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.ui.items.stickers.e> f320069i;

        /* renamed from: j, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f320070j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f320071k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f320072l;

        /* renamed from: m, reason: collision with root package name */
        public final u<TV0.d<?, ?>> f320073m;

        /* renamed from: n, reason: collision with root package name */
        public final u<TV0.d<?, ?>> f320074n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.l f320075o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.l f320076p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.l f320077q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.r> f320078r;

        /* renamed from: s, reason: collision with root package name */
        public final u<InterfaceC50482a> f320079s;

        /* renamed from: t, reason: collision with root package name */
        public final u<InterfaceC35745a5> f320080t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.repository.a> f320081u;

        /* renamed from: v, reason: collision with root package name */
        public final u<InterfaceC28481c> f320082v;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.l f320083w;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.l f320084x;

        /* renamed from: y, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f320085y;

        /* renamed from: z, reason: collision with root package name */
        public final u<w> f320086z;

        /* compiled from: DaggerStickersBuyVasComponent.java */
        public static final class a implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final p f320087a;

            public a(p pVar) {
                this.f320087a = pVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f320087a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerStickersBuyVasComponent.java */
        public static final class b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final p f320088a;

            public b(p pVar) {
                this.f320088a = pVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f320088a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerStickersBuyVasComponent.java */
        /* renamed from: com.avito.android.vas_performance.di.stickers.d$c$c, reason: collision with other inner class name */
        public static final class C9920c implements u<InterfaceC50482a> {

            /* renamed from: a, reason: collision with root package name */
            public final p f320089a;

            public C9920c(p pVar) {
                this.f320089a = pVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC50482a interfaceC50482aO0 = this.f320089a.o0();
                t.c(interfaceC50482aO0);
                return interfaceC50482aO0;
            }
        }

        public c(q qVar, p pVar, cv.b bVar, String str, String str2, Boolean bool, Fragment fragment, Screen screen, String str3, com.avito.android.analytics.screens.r rVar, a aVar) {
            this.f320061a = pVar;
            this.f320062b = bVar;
            u<com.avito.android.vas_performance.ui.items.header.c> uVarD = dagger.internal.g.d(new s(qVar));
            this.f320063c = uVarD;
            this.f320064d = dagger.internal.g.d(new r(qVar, uVarD));
            this.f320065e = B.a(com.avito.android.konveyor_adapter_module.d.a());
            this.f320066f = dagger.internal.g.d(new com.avito.android.vas_performance.ui.items.attributed_text.b(com.avito.android.vas_performance.ui.items.attributed_text.e.a()));
            this.f320067g = dagger.internal.g.d(new com.avito.android.vas_performance.ui.items.stickers_count.c(com.avito.android.vas_performance.ui.items.stickers_count.e.a()));
            this.f320068h = dagger.internal.g.d(new com.avito.android.vas_performance.ui.items.stickers_changes.c(com.avito.android.vas_performance.ui.items.stickers_changes.e.a()));
            u<com.avito.android.vas_performance.ui.items.stickers.e> uVarD2 = dagger.internal.g.d(com.avito.android.vas_performance.ui.items.stickers.i.a());
            this.f320069i = uVarD2;
            this.f320070j = dagger.internal.g.d(new com.avito.android.vas_performance.ui.items.stickers.d(uVarD2));
            A.b bVarA = A.a(5, 1);
            u<TV0.b<?, ?>> uVar = this.f320064d;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            bVarA.f393938b.add(this.f320065e);
            list.add(this.f320066f);
            list.add(this.f320067g);
            list.add(this.f320068h);
            list.add(this.f320070j);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f320071k = uVarK;
            this.f320072l = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f320073m = dagger.internal.g.d(com.avito.android.vas_performance.ui.items.stickers_count.e.a());
            this.f320074n = dagger.internal.g.d(com.avito.android.vas_performance.ui.items.stickers_changes.e.a());
            this.f320075o = dagger.internal.l.a(fragment);
            this.f320076p = dagger.internal.l.a(str);
            this.f320077q = dagger.internal.l.a(str2);
            this.f320078r = dagger.internal.g.d(com.avito.android.vas_performance.t.a());
            C9920c c9920c = new C9920c(pVar);
            a aVar2 = new a(pVar);
            this.f320080t = aVar2;
            this.f320081u = dagger.internal.g.d(new com.avito.android.vas_performance.repository.d(c9920c, aVar2));
            this.f320082v = new b(pVar);
            this.f320083w = dagger.internal.l.a(screen);
            this.f320084x = dagger.internal.l.a(rVar);
            u<ScreenPerformanceTracker> uVarD3 = dagger.internal.g.d(new vL0.d(this.f320083w, this.f320084x, dagger.internal.l.a(str3), this.f320082v));
            this.f320085y = uVarD3;
            u<w> uVarD4 = dagger.internal.g.d(new x(this.f320076p, this.f320077q, uVarD3, this.f320078r, this.f320081u, this.f320080t));
            this.f320086z = uVarD4;
            this.f320058A = dagger.internal.g.d(new k(this.f320075o, uVarD4));
            this.f320059B = dagger.internal.g.d(new j(this.f320072l, this.f320071k));
            this.f320060C = dagger.internal.g.d(new i(this.f320082v));
        }

        @Override // com.avito.android.vas_performance.di.stickers.g
        public final void a(StickersBuyVasFragment stickersBuyVasFragment) {
            this.f320071k.get();
            stickersBuyVasFragment.f321931n0 = this.f320072l.get();
            z zVar = new z(4);
            zVar.a(this.f320063c.get());
            zVar.a(this.f320073m.get());
            zVar.a(this.f320074n.get());
            zVar.a(this.f320069i.get());
            stickersBuyVasFragment.f321932o0 = zVar.c();
            stickersBuyVasFragment.f321933p0 = this.f320058A.get();
            stickersBuyVasFragment.f321934q0 = this.f320059B.get();
            p pVar = this.f320061a;
            InterfaceC28373a interfaceC28373aA = pVar.a();
            t.c(interfaceC28373aA);
            stickersBuyVasFragment.f321935r0 = interfaceC28373aA;
            stickersBuyVasFragment.f321936s0 = this.f320085y.get();
            stickersBuyVasFragment.f321937t0 = new com.avito.android.vas_performance.ui.recycler.e();
            stickersBuyVasFragment.f321938u0 = this.f320060C.get();
            com.avito.android.util.text.a aVarE = pVar.e();
            t.c(aVarE);
            stickersBuyVasFragment.f321939v0 = aVarE;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f320062b.u4();
            t.c(aVarU4);
            stickersBuyVasFragment.f321940w0 = aVarU4;
        }
    }

    public static g.a a() {
        return new b();
    }
}
