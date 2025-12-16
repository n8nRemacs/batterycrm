package com.avito.android.tariff.cpa.prepaid_expense.di;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.TariffPublicationAdvanceScreen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.tariff.cpa.prepaid_expense.PublicationAdvanceFragment;
import com.avito.android.tariff.cpa.prepaid_expense.di.b;
import com.avito.android.tariff.cpa.prepaid_expense.viewmodel.InterfaceC35206a;
import com.avito.android.tariff.cpa.prepaid_expense.viewmodel.o;
import com.avito.android.tariff.cpa.prepaid_expense.viewmodel.p;
import com.avito.android.util.InterfaceC35745a5;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.u;
import dagger.internal.z;
import java.util.List;
import v50.g;

/* compiled from: DaggerPublicationAdvanceComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerPublicationAdvanceComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.tariff.cpa.prepaid_expense.di.b.a
        public final com.avito.android.tariff.cpa.prepaid_expense.di.b a(PublicationAdvanceFragment publicationAdvanceFragment, Resources resources, WA0.b bVar, InterfaceC39417a interfaceC39417a, String str, TariffPublicationAdvanceScreen tariffPublicationAdvanceScreen, r rVar) {
            interfaceC39417a.getClass();
            tariffPublicationAdvanceScreen.getClass();
            return new c(bVar, interfaceC39417a, publicationAdvanceFragment, resources, str, tariffPublicationAdvanceScreen, rVar, "tariffPublicationAdvance", null);
        }
    }

    /* compiled from: DaggerPublicationAdvanceComponent.java */
    public static final class c implements com.avito.android.tariff.cpa.prepaid_expense.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<p> f294961A;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f294962a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.tariff.cpa.prepaid_expense.items.extra_info.d> f294963b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f294964c;

        /* renamed from: d, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f294965d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.tariff.cpa.prepaid_expense.items.advance_Info.d> f294966e;

        /* renamed from: f, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f294967f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.tariff.cpa.prepaid_expense.items.header.d> f294968g;

        /* renamed from: h, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f294969h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f294970i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f294971j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f294972k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.l f294973l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.l f294974m;

        /* renamed from: n, reason: collision with root package name */
        public final u<WB0.a> f294975n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC35745a5> f294976o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.tariff.cpa.prepaid_expense.viewmodel.j> f294977p;

        /* renamed from: q, reason: collision with root package name */
        public final u<InterfaceC35206a> f294978q;

        /* renamed from: r, reason: collision with root package name */
        public final u<InterfaceC28481c> f294979r;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.l f294980s;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.l f294981t;

        /* renamed from: u, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f294982u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.tariff.cpa.prepaid_expense.viewmodel.g> f294983v;

        /* renamed from: w, reason: collision with root package name */
        public final u<g.b> f294984w;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f294985x;

        /* renamed from: y, reason: collision with root package name */
        public final u<v50.g> f294986y;

        /* renamed from: z, reason: collision with root package name */
        public final u<P0.c> f294987z;

        /* compiled from: DaggerPublicationAdvanceComponent.java */
        /* renamed from: com.avito.android.tariff.cpa.prepaid_expense.di.a$c$a, reason: collision with other inner class name */
        public static final class C8967a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final WA0.b f294988a;

            public C8967a(WA0.b bVar) {
                this.f294988a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f294988a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerPublicationAdvanceComponent.java */
        public static final class b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f294989a;

            public b(cv.b bVar) {
                this.f294989a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f294989a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerPublicationAdvanceComponent.java */
        /* renamed from: com.avito.android.tariff.cpa.prepaid_expense.di.a$c$c, reason: collision with other inner class name */
        public static final class C8968c implements u<g.b> {

            /* renamed from: a, reason: collision with root package name */
            public final WA0.b f294990a;

            public C8968c(WA0.b bVar) {
                this.f294990a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f294990a.S1();
            }
        }

        /* compiled from: DaggerPublicationAdvanceComponent.java */
        public static final class d implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final WA0.b f294991a;

            public d(WA0.b bVar) {
                this.f294991a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f294991a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerPublicationAdvanceComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final WA0.b f294992a;

            public e(WA0.b bVar) {
                this.f294992a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f294992a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerPublicationAdvanceComponent.java */
        public static final class f implements u<WB0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final WA0.b f294993a;

            public f(WA0.b bVar) {
                this.f294993a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                WB0.a aVarT6 = this.f294993a.T6();
                t.c(aVarT6);
                return aVarT6;
            }
        }

        public c(WA0.b bVar, cv.b bVar2, Fragment fragment, Resources resources, String str, Screen screen, r rVar, String str2, C8966a c8966a) {
            this.f294962a = bVar2;
            u<com.avito.android.tariff.cpa.prepaid_expense.items.extra_info.d> uVarD = dagger.internal.g.d(com.avito.android.tariff.cpa.prepaid_expense.items.extra_info.f.a());
            this.f294963b = uVarD;
            this.f294965d = dagger.internal.g.d(new com.avito.android.tariff.cpa.prepaid_expense.items.extra_info.c(uVarD, new C8967a(bVar)));
            u<com.avito.android.tariff.cpa.prepaid_expense.items.advance_Info.d> uVarD2 = dagger.internal.g.d(com.avito.android.tariff.cpa.prepaid_expense.items.advance_Info.g.a());
            this.f294966e = uVarD2;
            this.f294967f = dagger.internal.g.d(new com.avito.android.tariff.cpa.prepaid_expense.items.advance_Info.c(uVarD2));
            u<com.avito.android.tariff.cpa.prepaid_expense.items.header.d> uVarD3 = dagger.internal.g.d(com.avito.android.tariff.cpa.prepaid_expense.items.header.f.a());
            this.f294968g = uVarD3;
            this.f294969h = dagger.internal.g.d(new com.avito.android.tariff.cpa.prepaid_expense.items.header.c(uVarD3));
            A.b bVarA = A.a(3, 0);
            u<TV0.b<?, ?>> uVar = this.f294965d;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f294967f);
            list.add(this.f294969h);
            u<com.avito.konveyor.a> uVarD4 = dagger.internal.g.d(new i(bVarA.b()));
            this.f294970i = uVarD4;
            u<com.avito.konveyor.adapter.a> uVarD5 = dagger.internal.g.d(new h(uVarD4));
            this.f294971j = uVarD5;
            this.f294972k = dagger.internal.g.d(new k(uVarD5, this.f294970i));
            this.f294973l = dagger.internal.l.a(fragment);
            this.f294974m = dagger.internal.l.a(str);
            f fVar = new f(bVar);
            d dVar = new d(bVar);
            this.f294976o = dVar;
            this.f294977p = dagger.internal.g.d(new o(fVar, dVar));
            this.f294978q = dagger.internal.g.d(com.avito.android.tariff.cpa.prepaid_expense.viewmodel.c.a());
            this.f294979r = new e(bVar);
            this.f294980s = dagger.internal.l.a(screen);
            this.f294981t = dagger.internal.l.a(rVar);
            this.f294982u = dagger.internal.g.d(new QB0.c(dagger.internal.l.a(str2), this.f294979r, this.f294980s, this.f294981t));
            this.f294983v = dagger.internal.g.d(com.avito.android.tariff.cpa.prepaid_expense.viewmodel.i.a());
            C8968c c8968c = new C8968c(bVar);
            b bVar3 = new b(bVar2);
            this.f294985x = bVar3;
            u<v50.g> uVarD6 = dagger.internal.g.d(new j(c8968c, bVar3));
            this.f294986y = uVarD6;
            u<P0.c> uVarD7 = dagger.internal.g.d(new com.avito.android.tariff.cpa.prepaid_expense.viewmodel.f(this.f294974m, uVarD6, this.f294977p, this.f294978q, this.f294976o, this.f294982u, this.f294983v, this.f294985x));
            this.f294987z = uVarD7;
            this.f294961A = dagger.internal.g.d(new l(this.f294973l, uVarD7));
        }

        @Override // com.avito.android.tariff.cpa.prepaid_expense.di.b
        public final void a(PublicationAdvanceFragment publicationAdvanceFragment) {
            publicationAdvanceFragment.f294941n0 = this.f294972k.get();
            publicationAdvanceFragment.f294942o0 = this.f294961A.get();
            z zVar = new z(3);
            zVar.a(this.f294963b.get());
            zVar.a(this.f294966e.get());
            zVar.a(this.f294968g.get());
            publicationAdvanceFragment.f294943p0 = zVar.c();
            publicationAdvanceFragment.f294944q0 = this.f294982u.get();
            publicationAdvanceFragment.f294945r0 = new com.avito.android.tariff.cpa.prepaid_expense.ui.d();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f294962a.u4();
            t.c(aVarU4);
            publicationAdvanceFragment.f294946s0 = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}
