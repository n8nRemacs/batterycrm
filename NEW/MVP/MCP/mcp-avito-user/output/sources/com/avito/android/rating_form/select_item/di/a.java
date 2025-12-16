package com.avito.android.rating_form.select_item.di;

import Y41.l;
import androidx.view.T0;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.rating_form.custom_params.k;
import com.avito.android.rating_form.custom_params.n;
import com.avito.android.rating_form.custom_params.o;
import com.avito.android.rating_form.select_item.RatingFormSelectItemArguments;
import com.avito.android.rating_form.select_item.RatingFormSelectItemFragment;
import com.avito.android.rating_form.select_item.di.g;
import com.avito.android.rating_form.select_item.di.i;
import com.avito.android.rating_form.select_item.mvi.m;
import com.avito.android.rating_form.y;
import com.avito.android.recycler.responsive.j;
import com.avito.android.util.R0;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Set;

/* compiled from: DaggerRatingFormSelectItemMviComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerRatingFormSelectItemMviComponent.java */
    public static final class b implements i.a {
        public b() {
        }

        @Override // com.avito.android.rating_form.select_item.di.i.a
        public final i a(RatingFormSelectItemFragment ratingFormSelectItemFragment, String str, RatingFormSelectItemArguments ratingFormSelectItemArguments, C28478k c28478k, boolean z12, l lVar, Y41.a aVar, com.avito.android.rating_form.di.g gVar, com.avito.android.rating_form.di.e eVar) {
            str.getClass();
            return new c(gVar, eVar, ratingFormSelectItemFragment, str, ratingFormSelectItemArguments, c28478k, Boolean.valueOf(z12), lVar, aVar, null);
        }
    }

    /* compiled from: DaggerRatingFormSelectItemMviComponent.java */
    public static final class c implements i {

        /* renamed from: A, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f248968A;

        /* renamed from: B, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f248969B;

        /* renamed from: C, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f248970C;

        /* renamed from: D, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f248971D;

        /* renamed from: E, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f248972E;

        /* renamed from: F, reason: collision with root package name */
        public final u<com.avito.android.recycler.responsive.a> f248973F;

        /* renamed from: G, reason: collision with root package name */
        public final u<com.avito.android.recycler.responsive.e> f248974G;

        /* renamed from: H, reason: collision with root package name */
        public final u<j> f248975H;

        /* renamed from: a, reason: collision with root package name */
        public final Boolean f248976a;

        /* renamed from: b, reason: collision with root package name */
        public final u<Vg0.d> f248977b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f248978c;

        /* renamed from: d, reason: collision with root package name */
        public final u<y> f248979d;

        /* renamed from: e, reason: collision with root package name */
        public final u<n> f248980e;

        /* renamed from: f, reason: collision with root package name */
        public final u<k> f248981f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.rating_form.custom_params.d> f248982g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.rating_form.select_item.d> f248983h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.rating_form.interactor.i> f248984i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.rating_form.select_item.mvi.f f248985j;

        /* renamed from: k, reason: collision with root package name */
        public final u<R0> f248986k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.rating_form.select_item.mvi.d f248987l;

        /* renamed from: m, reason: collision with root package name */
        public final m f248988m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC28481c> f248989n;

        /* renamed from: o, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f248990o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.rating_form.select_item.j f248991p;

        /* renamed from: q, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f248992q;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.l f248993r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.android.rating_form.select_item.adapter.advert.d> f248994s;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.l f248995t;

        /* renamed from: u, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f248996u;

        /* renamed from: v, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f248997v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.android.rating_form.select_item.adapter.empty_search.d> f248998w;

        /* renamed from: x, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f248999x;

        /* renamed from: y, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f249000y;

        /* renamed from: z, reason: collision with root package name */
        public final u<com.avito.android.rating_form.select_item.adapter.loading_error.d> f249001z;

        /* compiled from: DaggerRatingFormSelectItemMviComponent.java */
        /* renamed from: com.avito.android.rating_form.select_item.di.a$c$a, reason: collision with other inner class name */
        public static final class C7477a implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating_form.di.g f249002a;

            public C7477a(com.avito.android.rating_form.di.g gVar) {
                this.f249002a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f249002a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerRatingFormSelectItemMviComponent.java */
        public static final class b implements u<com.avito.android.rating_form.interactor.i> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating_form.di.e f249003a;

            public b(com.avito.android.rating_form.di.e eVar) {
                this.f249003a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.rating_form.interactor.i iVarKe = this.f249003a.Ke();
                t.c(iVarKe);
                return iVarKe;
            }
        }

        /* compiled from: DaggerRatingFormSelectItemMviComponent.java */
        /* renamed from: com.avito.android.rating_form.select_item.di.a$c$c, reason: collision with other inner class name */
        public static final class C7478c implements u<Vg0.d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating_form.di.g f249004a;

            public C7478c(com.avito.android.rating_form.di.g gVar) {
                this.f249004a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Vg0.d dVarVe = this.f249004a.ve();
                t.c(dVarVe);
                return dVarVe;
            }
        }

        /* compiled from: DaggerRatingFormSelectItemMviComponent.java */
        public static final class d implements u<y> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating_form.di.g f249005a;

            public d(com.avito.android.rating_form.di.g gVar) {
                this.f249005a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                y yVarHc = this.f249005a.hc();
                t.c(yVarHc);
                return yVarHc;
            }
        }

        /* compiled from: DaggerRatingFormSelectItemMviComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating_form.di.g f249006a;

            public e(com.avito.android.rating_form.di.g gVar) {
                this.f249006a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f249006a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.rating_form.di.g gVar, com.avito.android.rating_form.di.e eVar, T0 t02, String str, RatingFormSelectItemArguments ratingFormSelectItemArguments, C28478k c28478k, Boolean bool, l lVar, Y41.a aVar, C7476a c7476a) {
            this.f248976a = bool;
            this.f248977b = new C7478c(gVar);
            this.f248978c = dagger.internal.l.a(ratingFormSelectItemArguments);
            this.f248979d = new d(gVar);
            this.f248980e = dagger.internal.g.d(o.a());
            this.f248981f = dagger.internal.g.d(com.avito.android.rating_form.custom_params.l.a());
            A.b bVarA = A.a(2, 0);
            u<n> uVar = this.f248980e;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f248981f);
            u<com.avito.android.rating_form.custom_params.d> uVarD = dagger.internal.g.d(new com.avito.android.rating_form.custom_params.e(bVarA.b()));
            this.f248982g = uVarD;
            this.f248983h = dagger.internal.g.d(new com.avito.android.rating_form.select_item.h(this.f248978c, uVarD, this.f248977b, this.f248979d));
            this.f248984i = new b(eVar);
            dagger.internal.l lVarA = dagger.internal.l.a(str);
            u<com.avito.android.rating_form.select_item.d> uVar2 = this.f248983h;
            u<com.avito.android.rating_form.interactor.i> uVar3 = this.f248984i;
            dagger.internal.l lVar2 = this.f248978c;
            u<y> uVar4 = this.f248979d;
            this.f248985j = new com.avito.android.rating_form.select_item.mvi.f(lVar2, lVarA, uVar2, uVar3, uVar4, this.f248982g);
            this.f248987l = new com.avito.android.rating_form.select_item.mvi.d(lVarA, lVar2, uVar3, uVar2, new C7477a(gVar), uVar4);
            this.f248988m = new m(lVar2, uVar4);
            this.f248989n = new e(gVar);
            this.f248990o = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f248989n);
            this.f248991p = new com.avito.android.rating_form.select_item.j(new com.avito.android.rating_form.select_item.mvi.i(this.f248985j, this.f248987l, com.avito.android.rating_form.select_item.mvi.k.a(), this.f248988m, this.f248990o));
            this.f248992q = B.a(com.avito.android.konveyor_adapter_module.d.a());
            dagger.internal.l lVarA2 = dagger.internal.l.a(lVar);
            this.f248993r = lVarA2;
            this.f248994s = dagger.internal.g.d(new com.avito.android.rating_form.select_item.adapter.advert.h(lVarA2));
            dagger.internal.l lVarA3 = dagger.internal.l.a(bool);
            this.f248995t = lVarA3;
            this.f248996u = dagger.internal.g.d(new com.avito.android.rating_form.select_item.adapter.advert.c(lVarA3, this.f248994s));
            this.f248997v = dagger.internal.g.d(new com.avito.android.rating_form.select_item.adapter.advert.j(this.f248995t, this.f248994s));
            u<com.avito.android.rating_form.select_item.adapter.empty_search.d> uVarD2 = dagger.internal.g.d(com.avito.android.rating_form.select_item.adapter.empty_search.f.a());
            this.f248998w = uVarD2;
            this.f248999x = dagger.internal.g.d(new com.avito.android.rating_form.select_item.adapter.empty_search.c(this.f248995t, uVarD2));
            this.f249000y = dagger.internal.g.d(new com.avito.android.rating_form.select_item.adapter.empty_search.h(this.f248995t, this.f248998w));
            u<com.avito.android.rating_form.select_item.adapter.loading_error.d> uVarD3 = dagger.internal.g.d(new com.avito.android.rating_form.select_item.adapter.loading_error.h(this.f248993r));
            this.f249001z = uVarD3;
            this.f248968A = dagger.internal.g.d(new com.avito.android.rating_form.select_item.adapter.loading_error.c(this.f248995t, uVarD3));
            this.f248969B = dagger.internal.g.d(new com.avito.android.rating_form.select_item.adapter.loading_error.j(this.f248995t, this.f249001z));
            this.f248970C = dagger.internal.g.d(new com.avito.android.rating_ui.loading.b(new com.avito.android.rating_ui.loading.e(dagger.internal.l.a(aVar))));
            A.b bVarA2 = A.a(7, 1);
            bVarA2.f393938b.add(this.f248992q);
            u<TV0.b<?, ?>> uVar5 = this.f248996u;
            List<u<T>> list2 = bVarA2.f393937a;
            list2.add(uVar5);
            list2.add(this.f248997v);
            list2.add(this.f248999x);
            list2.add(this.f249000y);
            list2.add(this.f248968A);
            list2.add(this.f248969B);
            list2.add(this.f248970C);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA2.b());
            this.f248971D = uVarK;
            this.f248972E = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            u<com.avito.android.recycler.responsive.a> uVarD4 = dagger.internal.g.d(g.a.f249010a);
            this.f248973F = uVarD4;
            u<com.avito.android.recycler.responsive.e> uVarD5 = dagger.internal.g.d(new f(uVarD4, this.f248972E));
            this.f248974G = uVarD5;
            this.f248975H = dagger.internal.g.d(new h(uVarD5, this.f248971D));
        }

        @Override // com.avito.android.rating_form.select_item.di.i
        public final void a(RatingFormSelectItemFragment ratingFormSelectItemFragment) {
            ratingFormSelectItemFragment.f248871n0 = this.f248991p;
            ratingFormSelectItemFragment.f248873p0 = this.f248990o.get();
            ratingFormSelectItemFragment.f248874q0 = this.f248975H.get();
            ratingFormSelectItemFragment.f248875r0 = this.f248974G.get();
            ratingFormSelectItemFragment.f248876s0 = this.f248976a.booleanValue();
        }
    }

    public static i.a a() {
        return new b();
    }
}
