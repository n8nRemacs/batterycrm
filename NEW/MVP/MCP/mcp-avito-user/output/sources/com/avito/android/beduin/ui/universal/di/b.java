package com.avito.android.beduin.ui.universal.di;

import Hr.InterfaceC14024a;
import androidx.view.P0;
import androidx.view.T0;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.common.action.BeduinSetNavigationBarAction;
import com.avito.android.beduin.ui.universal.UniversalBeduinFragment;
import com.avito.android.beduin.ui.universal.beduin.BeduinExpandPageAction;
import com.avito.android.beduin.ui.universal.di.d;
import com.avito.android.beduin.ui.universal.di.h;
import com.avito.android.beduin.ui.universal.q;
import com.avito.android.beduin_shared.model.action.custom.reloadScreen.BeduinReloadScreenAction;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.util.InterfaceC35745a5;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import gj.InterfaceC40691b;
import gj.d;
import kj.C42699b;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import oi.InterfaceC44779a;
import pj.C47099b;
import pj.C47101d;

/* compiled from: DaggerUniversalBeduinFragmentComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class b {

    /* compiled from: DaggerUniversalBeduinFragmentComponent.java */
    /* renamed from: com.avito.android.beduin.ui.universal.di.b$b, reason: collision with other inner class name */
    public static final class C3122b implements d.a {
        public C3122b() {
        }

        @Override // com.avito.android.beduin.ui.universal.di.d.a
        public final d a(UniversalBeduinFragment universalBeduinFragment, Long l12, String str, r rVar, String str2, InterfaceC30106l7 interfaceC30106l7, e eVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(eVar, interfaceC30106l7, interfaceC39417a, universalBeduinFragment, l12, str, rVar, str2, null);
        }
    }

    /* compiled from: DaggerUniversalBeduinFragmentComponent.java */
    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        public final T0 f104459a;

        /* renamed from: b, reason: collision with root package name */
        public final e f104460b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC30106l7 f104461c;

        /* renamed from: d, reason: collision with root package name */
        public final r f104462d;

        /* renamed from: e, reason: collision with root package name */
        public final cv.b f104463e;

        /* renamed from: f, reason: collision with root package name */
        public final Long f104464f;

        /* renamed from: g, reason: collision with root package name */
        public final String f104465g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC44779a> f104466h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.beduin.ui.universal.beduin.a> f104467i = dagger.internal.g.d(com.avito.android.beduin.ui.universal.beduin.b.a());

        /* renamed from: j, reason: collision with root package name */
        public final u<Wi.b> f104468j = dagger.internal.g.d(h.a.f104478a);

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.beduin.common.actionhandler.set_navigation_bar.a> f104469k = dagger.internal.g.d(com.avito.android.beduin.common.actionhandler.set_navigation_bar.b.a());

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC28481c> f104470l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.l f104471m;

        /* renamed from: n, reason: collision with root package name */
        public final u<Screen> f104472n;

        /* renamed from: o, reason: collision with root package name */
        public final u<C28478k> f104473o;

        /* renamed from: p, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f104474p;

        /* compiled from: DaggerUniversalBeduinFragmentComponent.java */
        public static final class a implements u<InterfaceC44779a> {

            /* renamed from: a, reason: collision with root package name */
            public final e f104475a;

            public a(e eVar) {
                this.f104475a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC44779a interfaceC44779aL5 = this.f104475a.l5();
                t.c(interfaceC44779aL5);
                return interfaceC44779aL5;
            }
        }

        /* compiled from: DaggerUniversalBeduinFragmentComponent.java */
        /* renamed from: com.avito.android.beduin.ui.universal.di.b$c$b, reason: collision with other inner class name */
        public static final class C3123b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30106l7 f104476a;

            public C3123b(InterfaceC30106l7 interfaceC30106l7) {
                this.f104476a = interfaceC30106l7;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f104476a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(e eVar, InterfaceC30106l7 interfaceC30106l7, cv.b bVar, T0 t02, Long l12, String str, r rVar, String str2, a aVar) {
            this.f104459a = t02;
            this.f104460b = eVar;
            this.f104461c = interfaceC30106l7;
            this.f104462d = rVar;
            this.f104463e = bVar;
            this.f104464f = l12;
            this.f104465g = str;
            this.f104466h = new a(eVar);
            this.f104470l = new C3123b(interfaceC30106l7);
            this.f104471m = dagger.internal.l.a(rVar);
            u<Screen> uVarD = dagger.internal.g.d(new m(dagger.internal.l.b(str2)));
            this.f104472n = uVarD;
            u<C28478k> uVarD2 = dagger.internal.g.d(new l(this.f104471m, uVarD));
            this.f104473o = uVarD2;
            this.f104474p = dagger.internal.g.d(new n(uVarD2, this.f104470l));
        }

        @Override // com.avito.android.beduin.ui.universal.di.d
        public final void a(UniversalBeduinFragment universalBeduinFragment) {
            h31.e eVarA = dagger.internal.g.a(this.f104466h);
            e eVar = this.f104460b;
            InterfaceC35745a5 interfaceC35745a5D = eVar.d();
            t.c(interfaceC35745a5D);
            com.avito.android.beduin.common.g gVar = new com.avito.android.beduin.common.g(interfaceC35745a5D, eVarA);
            InterfaceC30106l7 interfaceC30106l7 = this.f104461c;
            InterfaceC28481c interfaceC28481cB = interfaceC30106l7.b();
            t.c(interfaceC28481cB);
            D dN5 = interfaceC30106l7.N5();
            InterfaceC14024a interfaceC14024aL = eVar.L();
            t.c(interfaceC14024aL);
            gj.d dVarEl = eVar.El();
            cv.b bVar = this.f104463e;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = bVar.u4();
            t.c(aVarU4);
            a.b bVarB = bVar.b();
            t.c(bVarB);
            com.avito.android.beduin.ui.universal.beduin.a aVar = this.f104467i.get();
            Wi.b bVar2 = this.f104468j.get();
            com.avito.android.beduin.common.actionhandler.set_navigation_bar.a aVar2 = this.f104469k.get();
            ScreenPerformanceTracker screenPerformanceTracker = this.f104474p.get();
            f fVar = f.f104477a;
            fVar.getClass();
            InterfaceC40691b interfaceC40691bA = d.a.a(dVarEl, aVarU4, bVarB, screenPerformanceTracker != null ? new C47101d(screenPerformanceTracker) : C47099b.f428743a, C42756l.l0(new gj.f[]{new gj.f(BeduinReloadScreenAction.class, bVar2), new gj.f(BeduinExpandPageAction.class, aVar), new gj.f(BeduinSetNavigationBarAction.class, aVar2)}), null, null, new C42699b(null, C42784z0.f406748b, null, false), 48);
            Screen screen = this.f104472n.get();
            InterfaceC35745a5 interfaceC35745a5D2 = eVar.d();
            t.c(interfaceC35745a5D2);
            com.avito.android.beduin.ui.universal.beduin.a aVar3 = this.f104467i.get();
            Wi.b bVar3 = this.f104468j.get();
            com.avito.android.beduin.common.actionhandler.set_navigation_bar.a aVar4 = this.f104469k.get();
            q qVar = new q(interfaceC14024aL, bVar3, screen, this.f104462d, dN5, interfaceC28481cB, this.f104474p.get(), gVar, aVar4, aVar3, interfaceC35745a5D2, interfaceC40691bA, this.f104464f, this.f104465g, eVar.Se());
            fVar.getClass();
            universalBeduinFragment.f104418n0 = (com.avito.android.beduin.ui.universal.m) new P0(this.f104459a, qVar).a(com.avito.android.beduin.ui.universal.m.class);
            interfaceC30106l7.N5();
            com.avito.android.ui.status_bar.e eVarB0 = eVar.b0();
            t.c(eVarB0);
            universalBeduinFragment.f104419o0 = eVarB0;
            universalBeduinFragment.f104420p0 = new com.avito.android.beduin.common.navigation_bar.b();
            universalBeduinFragment.f104421q0 = eVar.sd();
            universalBeduinFragment.f104422r0 = eVar.Ad();
            eVar.z4();
        }
    }

    public static d.a a() {
        return new C3122b();
    }
}
