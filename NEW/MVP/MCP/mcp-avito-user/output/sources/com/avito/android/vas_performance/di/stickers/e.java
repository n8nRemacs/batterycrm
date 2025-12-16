package com.avito.android.vas_performance.di.stickers;

import androidx.fragment.app.Fragment;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.StickersEditVasScreen;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.vas_performance.di.stickers.l;
import com.avito.android.vas_performance.ui.stickers.edit.StickersEditVasFragment;
import com.avito.android.vas_performance.v;
import com.avito.android.vas_performance.x;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import dagger.internal.z;
import java.util.List;
import java.util.Set;
import zL0.InterfaceC50482a;

/* compiled from: DaggerStickersEditVasComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class e {

    /* compiled from: DaggerStickersEditVasComponent.java */
    public static final class b implements l.a {
        public b() {
        }

        @Override // com.avito.android.vas_performance.di.stickers.l.a
        public final l a(String str, boolean z12, StickersEditVasFragment stickersEditVasFragment, StickersEditVasScreen stickersEditVasScreen, String str2, com.avito.android.analytics.screens.r rVar, p pVar, InterfaceC39417a interfaceC39417a) {
            stickersEditVasScreen.getClass();
            str2.getClass();
            interfaceC39417a.getClass();
            return new c(new q(), pVar, interfaceC39417a, str, Boolean.valueOf(z12), stickersEditVasFragment, stickersEditVasScreen, str2, rVar, null);
        }
    }

    /* compiled from: DaggerStickersEditVasComponent.java */
    public static final class c implements l {

        /* renamed from: A, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f320090A;

        /* renamed from: a, reason: collision with root package name */
        public final p f320091a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f320092b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.ui.items.header.c> f320093c;

        /* renamed from: d, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f320094d;

        /* renamed from: e, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f320095e;

        /* renamed from: f, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f320096f;

        /* renamed from: g, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f320097g;

        /* renamed from: h, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f320098h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.ui.items.stickers.e> f320099i;

        /* renamed from: j, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f320100j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f320101k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f320102l;

        /* renamed from: m, reason: collision with root package name */
        public final u<TV0.d<?, ?>> f320103m;

        /* renamed from: n, reason: collision with root package name */
        public final u<TV0.d<?, ?>> f320104n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.l f320105o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.l f320106p;

        /* renamed from: q, reason: collision with root package name */
        public final u<v> f320107q;

        /* renamed from: r, reason: collision with root package name */
        public final u<InterfaceC50482a> f320108r;

        /* renamed from: s, reason: collision with root package name */
        public final u<InterfaceC35745a5> f320109s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.repository.a> f320110t;

        /* renamed from: u, reason: collision with root package name */
        public final u<InterfaceC28481c> f320111u;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.l f320112v;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.l f320113w;

        /* renamed from: x, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f320114x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.ui.stickers.edit.r> f320115y;

        /* renamed from: z, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.ui.stickers.edit.q> f320116z;

        /* compiled from: DaggerStickersEditVasComponent.java */
        public static final class a implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final p f320117a;

            public a(p pVar) {
                this.f320117a = pVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f320117a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerStickersEditVasComponent.java */
        public static final class b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final p f320118a;

            public b(p pVar) {
                this.f320118a = pVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f320118a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerStickersEditVasComponent.java */
        /* renamed from: com.avito.android.vas_performance.di.stickers.e$c$c, reason: collision with other inner class name */
        public static final class C9921c implements u<InterfaceC50482a> {

            /* renamed from: a, reason: collision with root package name */
            public final p f320119a;

            public C9921c(p pVar) {
                this.f320119a = pVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC50482a interfaceC50482aO0 = this.f320119a.o0();
                t.c(interfaceC50482aO0);
                return interfaceC50482aO0;
            }
        }

        public c(q qVar, p pVar, cv.b bVar, String str, Boolean bool, Fragment fragment, Screen screen, String str2, com.avito.android.analytics.screens.r rVar, a aVar) {
            this.f320091a = pVar;
            this.f320092b = bVar;
            u<com.avito.android.vas_performance.ui.items.header.c> uVarD = dagger.internal.g.d(new s(qVar));
            this.f320093c = uVarD;
            this.f320094d = dagger.internal.g.d(new r(qVar, uVarD));
            this.f320095e = B.a(com.avito.android.konveyor_adapter_module.d.a());
            this.f320096f = dagger.internal.g.d(new com.avito.android.vas_performance.ui.items.attributed_text.b(com.avito.android.vas_performance.ui.items.attributed_text.e.a()));
            this.f320097g = dagger.internal.g.d(new com.avito.android.vas_performance.ui.items.stickers_count.c(com.avito.android.vas_performance.ui.items.stickers_count.e.a()));
            this.f320098h = dagger.internal.g.d(new com.avito.android.vas_performance.ui.items.stickers_changes.c(com.avito.android.vas_performance.ui.items.stickers_changes.e.a()));
            u<com.avito.android.vas_performance.ui.items.stickers.e> uVarD2 = dagger.internal.g.d(com.avito.android.vas_performance.ui.items.stickers.i.a());
            this.f320099i = uVarD2;
            this.f320100j = dagger.internal.g.d(new com.avito.android.vas_performance.ui.items.stickers.d(uVarD2));
            A.b bVarA = A.a(5, 1);
            u<TV0.b<?, ?>> uVar = this.f320094d;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            bVarA.f393938b.add(this.f320095e);
            list.add(this.f320096f);
            list.add(this.f320097g);
            list.add(this.f320098h);
            list.add(this.f320100j);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f320101k = uVarK;
            this.f320102l = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f320103m = dagger.internal.g.d(com.avito.android.vas_performance.ui.items.stickers_count.e.a());
            this.f320104n = dagger.internal.g.d(com.avito.android.vas_performance.ui.items.stickers_changes.e.a());
            this.f320105o = dagger.internal.l.a(fragment);
            this.f320106p = dagger.internal.l.a(str);
            this.f320107q = dagger.internal.g.d(x.a());
            C9921c c9921c = new C9921c(pVar);
            a aVar2 = new a(pVar);
            this.f320109s = aVar2;
            this.f320110t = dagger.internal.g.d(new com.avito.android.vas_performance.repository.d(c9921c, aVar2));
            this.f320111u = new b(pVar);
            this.f320112v = dagger.internal.l.a(screen);
            this.f320113w = dagger.internal.l.a(rVar);
            u<ScreenPerformanceTracker> uVarD3 = dagger.internal.g.d(new vL0.d(this.f320112v, this.f320113w, dagger.internal.l.a(str2), this.f320111u));
            this.f320114x = uVarD3;
            u<com.avito.android.vas_performance.ui.stickers.edit.r> uVarD4 = dagger.internal.g.d(new com.avito.android.vas_performance.ui.stickers.edit.s(this.f320106p, uVarD3, this.f320107q, this.f320110t, this.f320109s));
            this.f320115y = uVarD4;
            this.f320116z = dagger.internal.g.d(new n(this.f320105o, uVarD4));
            this.f320090A = dagger.internal.g.d(new o(this.f320102l, this.f320101k));
        }

        @Override // com.avito.android.vas_performance.di.stickers.l
        public final void a(StickersEditVasFragment stickersEditVasFragment) {
            this.f320101k.get();
            stickersEditVasFragment.f322007n0 = this.f320102l.get();
            z zVar = new z(4);
            zVar.a(this.f320093c.get());
            zVar.a(this.f320103m.get());
            zVar.a(this.f320104n.get());
            zVar.a(this.f320099i.get());
            stickersEditVasFragment.f322008o0 = zVar.c();
            stickersEditVasFragment.f322009p0 = this.f320116z.get();
            stickersEditVasFragment.f322010q0 = this.f320090A.get();
            InterfaceC28373a interfaceC28373aA = this.f320091a.a();
            t.c(interfaceC28373aA);
            stickersEditVasFragment.f322011r0 = interfaceC28373aA;
            stickersEditVasFragment.f322012s0 = this.f320114x.get();
            stickersEditVasFragment.f322013t0 = new com.avito.android.vas_performance.ui.recycler.e();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f320092b.u4();
            t.c(aVarU4);
            stickersEditVasFragment.f322014u0 = aVarU4;
        }
    }

    public static l.a a() {
        return new b();
    }
}
