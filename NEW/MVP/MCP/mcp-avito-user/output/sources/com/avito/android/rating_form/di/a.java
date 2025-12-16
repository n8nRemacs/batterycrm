package com.avito.android.rating_form.di;

import android.content.res.Resources;
import androidx.view.S0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.photo_list_view.N;
import com.avito.android.rating_form.C;
import com.avito.android.rating_form.D;
import com.avito.android.rating_form.E;
import com.avito.android.rating_form.RatingFormActivity;
import com.avito.android.rating_form.RatingFormArguments;
import com.avito.android.rating_form.di.f;
import com.avito.android.rating_form.mvi.s;
import com.avito.android.rating_form.step.v;
import com.avito.android.rating_form.step.validations.n;
import com.avito.android.rating_form.step.validations.o;
import com.avito.android.rating_form.step.validations.q;
import com.avito.android.rating_form.step.validations.r;
import com.avito.android.rating_form.x;
import com.avito.android.rating_form.y;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerRatingFormComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerRatingFormComponent.java */
    public static final class b implements f.a {
        public b() {
        }

        @Override // com.avito.android.rating_form.di.f.a
        public final f a(S0 s02, RatingFormArguments ratingFormArguments, Resources resources, C28478k c28478k, boolean z12, boolean z13, g gVar, InterfaceC39417a interfaceC39417a) {
            ratingFormArguments.getClass();
            interfaceC39417a.getClass();
            return new c(gVar, interfaceC39417a, s02, ratingFormArguments, resources, c28478k, Boolean.valueOf(z12), Boolean.valueOf(z13), null);
        }
    }

    /* compiled from: DaggerRatingFormComponent.java */
    public static final class c implements com.avito.android.rating_form.di.f {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.rating_form.di.g f248085a;

        /* renamed from: b, reason: collision with root package name */
        public final u<Vg0.d> f248086b;

        /* renamed from: c, reason: collision with root package name */
        public final u<Gson> f248087c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.rating_form.interactor.c> f248088d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.l f248089e;

        /* renamed from: f, reason: collision with root package name */
        public final u<y> f248090f;

        /* renamed from: g, reason: collision with root package name */
        public final v f248091g;

        /* renamed from: h, reason: collision with root package name */
        public final s f248092h;

        /* renamed from: i, reason: collision with root package name */
        public final u<o> f248093i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.rating_form.step.validations.a> f248094j;

        /* renamed from: k, reason: collision with root package name */
        public final u<r> f248095k;

        /* renamed from: l, reason: collision with root package name */
        public final u<Boolean> f248096l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.rating_form.interactor.i> f248097m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f248098n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC28373a> f248099o;

        /* renamed from: p, reason: collision with root package name */
        public final u<N> f248100p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.l f248101q;

        /* renamed from: r, reason: collision with root package name */
        public final u<R0> f248102r;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.rating_form.mvi.h f248103s;

        /* renamed from: t, reason: collision with root package name */
        public final com.avito.android.rating_form.mvi.e f248104t;

        /* renamed from: u, reason: collision with root package name */
        public final com.avito.android.rating_form.mvi.m f248105u;

        /* renamed from: v, reason: collision with root package name */
        public final com.avito.android.rating_form.mvi.o f248106v;

        /* renamed from: w, reason: collision with root package name */
        public final u<InterfaceC28481c> f248107w;

        /* renamed from: x, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f248108x;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.l f248109y;

        /* compiled from: DaggerRatingFormComponent.java */
        /* renamed from: com.avito.android.rating_form.di.a$c$a, reason: collision with other inner class name */
        public static final class C7463a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating_form.di.g f248110a;

            public C7463a(com.avito.android.rating_form.di.g gVar) {
                this.f248110a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f248110a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerRatingFormComponent.java */
        public static final class b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f248111a;

            public b(cv.b bVar) {
                this.f248111a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f248111a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerRatingFormComponent.java */
        /* renamed from: com.avito.android.rating_form.di.a$c$c, reason: collision with other inner class name */
        public static final class C7464c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating_form.di.g f248112a;

            public C7464c(com.avito.android.rating_form.di.g gVar) {
                this.f248112a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f248112a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerRatingFormComponent.java */
        public static final class d implements u<Gson> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating_form.di.g f248113a;

            public d(com.avito.android.rating_form.di.g gVar) {
                this.f248113a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Gson gsonS = this.f248113a.s();
                t.c(gsonS);
                return gsonS;
            }
        }

        /* compiled from: DaggerRatingFormComponent.java */
        public static final class e implements u<Vg0.d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating_form.di.g f248114a;

            public e(com.avito.android.rating_form.di.g gVar) {
                this.f248114a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Vg0.d dVarVe = this.f248114a.ve();
                t.c(dVarVe);
                return dVarVe;
            }
        }

        /* compiled from: DaggerRatingFormComponent.java */
        public static final class f implements u<y> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating_form.di.g f248115a;

            public f(com.avito.android.rating_form.di.g gVar) {
                this.f248115a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                y yVarHc = this.f248115a.hc();
                t.c(yVarHc);
                return yVarHc;
            }
        }

        /* compiled from: DaggerRatingFormComponent.java */
        public static final class g implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating_form.di.g f248116a;

            public g(com.avito.android.rating_form.di.g gVar) {
                this.f248116a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f248116a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.rating_form.di.g gVar, cv.b bVar, S0 s02, RatingFormArguments ratingFormArguments, Resources resources, C28478k c28478k, Boolean bool, Boolean bool2, C7462a c7462a) {
            this.f248085a = gVar;
            this.f248086b = new e(gVar);
            this.f248088d = dagger.internal.g.d(new com.avito.android.rating_form.interactor.b(new d(gVar)));
            dagger.internal.l lVarA = dagger.internal.l.a(ratingFormArguments);
            this.f248089e = lVarA;
            f fVar = new f(gVar);
            this.f248090f = fVar;
            v vVar = new v(fVar);
            this.f248091g = vVar;
            this.f248092h = new s(lVarA, fVar, vVar);
            this.f248093i = dagger.internal.g.d(q.a());
            this.f248094j = dagger.internal.g.d(n.a());
            this.f248095k = dagger.internal.g.d(com.avito.android.rating_form.step.validations.t.a());
            u<Boolean> uVarD = dagger.internal.g.d(new j(this.f248089e));
            this.f248096l = uVarD;
            this.f248097m = dagger.internal.g.d(new k(this.f248086b, this.f248088d, this.f248089e, this.f248092h, this.f248090f, this.f248093i, this.f248094j, this.f248095k, uVarD));
            this.f248100p = dagger.internal.g.d(new i(new b(bVar), new C7463a(gVar)));
            this.f248101q = dagger.internal.l.a(bool);
            this.f248102r = new C7464c(gVar);
            this.f248103s = new com.avito.android.rating_form.mvi.h(this.f248101q, this.f248089e, dagger.internal.l.a(bool2), this.f248097m, this.f248102r);
            com.avito.android.rating_form.u uVar = new com.avito.android.rating_form.u(dagger.internal.l.a(resources));
            dagger.internal.l lVar = this.f248089e;
            l lVar2 = new l(lVar, this.f248096l);
            u<y> uVar2 = this.f248090f;
            this.f248104t = new com.avito.android.rating_form.mvi.e(lVar, this.f248097m, new x(uVar2, uVar, lVar2));
            this.f248105u = new com.avito.android.rating_form.mvi.m(uVar2);
            this.f248106v = new com.avito.android.rating_form.mvi.o(uVar2, this.f248091g);
            this.f248107w = new g(gVar);
            u<ScreenPerformanceTracker> uVarD2 = com.avito.android.actions_sheet.a.D(dagger.internal.l.a(c28478k), this.f248107w);
            this.f248108x = uVarD2;
            this.f248109y = dagger.internal.l.a(new E(new D(new com.avito.android.rating_form.mvi.k(this.f248103s, this.f248104t, this.f248105u, this.f248106v, uVarD2, this.f248089e))));
        }

        @Override // com.avito.android.rating_form.di.f
        public final void H8(com.avito.android.rating_form.activity.c cVar) {
            com.avito.android.rating_form.di.g gVar = this.f248085a;
            cVar.f247954m = gVar.O();
            cVar.f247957p = (C.a) this.f248109y.f393949a;
            cVar.f247959r = this.f248108x.get();
            gVar.Ai();
            cVar.f247960s = this.f248096l.get().booleanValue();
        }

        @Override // com.avito.android.rating_form.di.e
        public final com.avito.android.rating_form.interactor.i Ke() {
            return this.f248097m.get();
        }

        @Override // com.avito.android.rating_form.step.di.d
        public final N Sd() {
            return this.f248100p.get();
        }

        @Override // com.avito.android.rating_form.di.f
        public final void yb(RatingFormActivity ratingFormActivity) {
            com.avito.android.rating_form.di.g gVar = this.f248085a;
            ratingFormActivity.f247888m = gVar.O();
            ratingFormActivity.f247893r = (C.a) this.f248109y.f393949a;
            ratingFormActivity.f247895t = this.f248108x.get();
            gVar.Ai();
            ratingFormActivity.f247896u = this.f248096l.get().booleanValue();
        }
    }

    public static f.a a() {
        return new b();
    }
}
