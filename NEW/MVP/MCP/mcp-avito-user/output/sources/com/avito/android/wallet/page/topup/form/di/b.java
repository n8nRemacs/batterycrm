package com.avito.android.wallet.page.topup.form.di;

import aP0.InterfaceC19802a;
import android.content.res.Resources;
import com.avito.android.InterfaceC36134w1;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.R0;
import com.avito.android.wallet.page.topup.form.TopUpFormActivity;
import com.avito.android.wallet.page.topup.form.di.f;
import com.avito.android.wallet.page.topup.form.di.n;
import kotlin.G0;

/* compiled from: DaggerTopUpFormComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class b {

    /* compiled from: DaggerTopUpFormComponent.java */
    /* renamed from: com.avito.android.wallet.page.topup.form.di.b$b, reason: collision with other inner class name */
    public static final class C10179b implements f.a {
        public C10179b() {
        }

        @Override // com.avito.android.wallet.page.topup.form.di.f.a
        public final f a(com.avito.android.wallet.page.di.component.e eVar, C28478k c28478k, String str, Resources resources, Y41.a<G0> aVar, Y41.p<? super com.avito.android.wallet.page.topup.form.items.input.a, ? super String, G0> pVar, Y41.l<? super com.avito.android.wallet.page.topup.form.items.bubble.a, G0> lVar) {
            return new c(eVar, c28478k, str, resources, aVar, pVar, lVar, null);
        }
    }

    /* compiled from: DaggerTopUpFormComponent.java */
    public static final class c implements com.avito.android.wallet.page.topup.form.di.f {

        /* renamed from: a, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC19802a> f328245a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.wallet.page.topup.form.mvi.component.g f328246b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<hJ.i> f328247c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<hJ.e> f328248d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC36134w1> f328249e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<R0> f328250f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.wallet.page.topup.form.mvi.component.e f328251g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.wallet.page.topup.form.mvi.component.p f328252h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f328253i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f328254j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.wallet.page.topup.form.mvi.c f328255k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.f f328256l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.l f328257m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.wallet.page.topup.form.items.submit_button_item.e> f328258n;

        /* renamed from: o, reason: collision with root package name */
        public final w f328259o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.wallet.page.topup.form.items.input.c f328260p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.wallet.page.topup.form.items.bubble.e> f328261q;

        /* renamed from: r, reason: collision with root package name */
        public final s f328262r;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.a> f328263s;

        /* renamed from: t, reason: collision with root package name */
        public final o f328264t;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.a> f328265u;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.data_aware.c> f328266v;

        /* compiled from: DaggerTopUpFormComponent.java */
        public static final class a implements dagger.internal.u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.page.di.component.e f328267a;

            public a(com.avito.android.wallet.page.di.component.e eVar) {
                this.f328267a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f328267a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerTopUpFormComponent.java */
        /* renamed from: com.avito.android.wallet.page.topup.form.di.b$c$b, reason: collision with other inner class name */
        public static final class C10180b implements dagger.internal.u<hJ.e> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.page.di.component.e f328268a;

            public C10180b(com.avito.android.wallet.page.di.component.e eVar) {
                this.f328268a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                hJ.e eVarS = this.f328268a.S();
                dagger.internal.t.c(eVarS);
                return eVarS;
            }
        }

        /* compiled from: DaggerTopUpFormComponent.java */
        /* renamed from: com.avito.android.wallet.page.topup.form.di.b$c$c, reason: collision with other inner class name */
        public static final class C10181c implements dagger.internal.u<hJ.i> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.page.di.component.e f328269a;

            public C10181c(com.avito.android.wallet.page.di.component.e eVar) {
                this.f328269a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                hJ.i iVarY = this.f328269a.Y();
                dagger.internal.t.c(iVarY);
                return iVarY;
            }
        }

        /* compiled from: DaggerTopUpFormComponent.java */
        public static final class d implements dagger.internal.u<InterfaceC36134w1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.page.di.component.e f328270a;

            public d(com.avito.android.wallet.page.di.component.e eVar) {
                this.f328270a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f328270a.G1();
            }
        }

        /* compiled from: DaggerTopUpFormComponent.java */
        public static final class e implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.page.di.component.e f328271a;

            public e(com.avito.android.wallet.page.di.component.e eVar) {
                this.f328271a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f328271a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerTopUpFormComponent.java */
        public static final class f implements dagger.internal.u<InterfaceC19802a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.page.di.component.e f328272a;

            public f(com.avito.android.wallet.page.di.component.e eVar) {
                this.f328272a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC19802a interfaceC19802aMg = this.f328272a.mg();
                dagger.internal.t.c(interfaceC19802aMg);
                return interfaceC19802aMg;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.wallet.page.di.component.e eVar, C28478k c28478k, String str, Resources resources, Y41.a aVar, Y41.p pVar, Y41.l lVar, a aVar2) {
            this.f328245a = new f(eVar);
            this.f328246b = new com.avito.android.wallet.page.topup.form.mvi.component.g(new com.avito.android.wallet.page.topup.form.mvi.component.l(dagger.internal.l.b(str), this.f328245a));
            this.f328251g = new com.avito.android.wallet.page.topup.form.mvi.component.e(new p(new q(new r(dagger.internal.l.a(resources)), new C10181c(eVar), new C10180b(eVar))), new d(eVar), new a(eVar));
            this.f328252h = new com.avito.android.wallet.page.topup.form.mvi.component.p(com.avito.android.wallet.page.topup.form.mvi.component.r.a());
            this.f328253i = new e(eVar);
            this.f328254j = com.avito.android.actions_sheet.a.D(dagger.internal.l.a(c28478k), this.f328253i);
            this.f328255k = new com.avito.android.wallet.page.topup.form.mvi.c(new com.avito.android.wallet.page.topup.form.mvi.component.j(this.f328246b, this.f328251g, com.avito.android.wallet.page.topup.form.mvi.component.n.a(), this.f328252h, this.f328254j));
            this.f328256l = new dagger.internal.f();
            dagger.internal.l lVarA = dagger.internal.l.a(aVar);
            this.f328257m = lVarA;
            dagger.internal.u<com.avito.android.wallet.page.topup.form.items.submit_button_item.e> uVarD = dagger.internal.g.d(new x(lVarA));
            this.f328258n = uVarD;
            this.f328259o = new w(uVarD);
            this.f328260p = new com.avito.android.wallet.page.topup.form.items.input.c(new com.avito.android.wallet.page.topup.form.items.input.g(dagger.internal.l.a(pVar), this.f328257m));
            dagger.internal.u<com.avito.android.wallet.page.topup.form.items.bubble.e> uVarD2 = dagger.internal.g.d(new j(dagger.internal.l.a(lVar)));
            this.f328261q = uVarD2;
            s sVar = new s(new com.avito.android.wallet.page.topup.form.items.bubble.c(uVarD2));
            this.f328262r = sVar;
            dagger.internal.u<com.avito.konveyor.adapter.a> uVarD3 = dagger.internal.g.d(new u(sVar));
            this.f328263s = uVarD3;
            o oVar = new o(this.f328259o, this.f328260p, new com.avito.android.wallet.page.topup.form.items.shortcut_section.b(new com.avito.android.wallet.page.topup.form.items.shortcut_section.f(uVarD3), new v(uVarD3, this.f328262r)), new m(n.a.f328283a));
            this.f328264t = oVar;
            this.f328265u = dagger.internal.g.d(new i(oVar));
            dagger.internal.u<com.avito.android.recycler.data_aware.c> uVarD4 = dagger.internal.g.d(new k(this.f328256l, this.f328265u, new l(com.avito.android.wallet.page.topup.form.items.b.a(), com.avito.android.recycler.data_aware.k.a())));
            this.f328266v = uVarD4;
            dagger.internal.f.a(this.f328256l, dagger.internal.g.d(new t(uVarD4, this.f328264t)));
        }

        @Override // com.avito.android.wallet.page.topup.form.di.f
        public final void a(TopUpFormActivity topUpFormActivity) {
            topUpFormActivity.f328229m = this.f328255k;
            topUpFormActivity.f328231o = this.f328254j.get();
            topUpFormActivity.f328232p = (com.avito.konveyor.adapter.j) this.f328256l.get();
            topUpFormActivity.f328233q = this.f328266v.get();
        }
    }

    public static f.a a() {
        return new C10179b();
    }
}
