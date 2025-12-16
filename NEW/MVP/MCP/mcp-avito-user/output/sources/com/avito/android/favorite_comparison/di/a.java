package com.avito.android.favorite_comparison.di;

import Uq.InterfaceC15558a;
import android.content.res.Resources;
import com.avito.android.favorite_comparison.di.c;
import com.avito.android.favorite_comparison.presentation.FavoriteComparisonFragment;
import com.avito.android.favorite_comparison.presentation.o;
import com.avito.android.favorite_comparison.presentation.q;
import com.avito.android.util.InterfaceC35745a5;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import sC.InterfaceC48028e;

/* compiled from: DaggerFavoriteComparisonComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerFavoriteComparisonComponent.java */
    public static final class b implements c.a {
        public b() {
        }

        @Override // com.avito.android.favorite_comparison.di.c.a
        public final com.avito.android.favorite_comparison.di.c a(f fVar, InterfaceC39417a interfaceC39417a, com.avito.android.favorite_comparison.presentation.d dVar, Resources resources) {
            interfaceC39417a.getClass();
            return new c(fVar, interfaceC39417a, dVar, resources, null);
        }
    }

    /* compiled from: DaggerFavoriteComparisonComponent.java */
    public static final class c implements com.avito.android.favorite_comparison.di.c {

        /* renamed from: a, reason: collision with root package name */
        public final f f155284a;

        /* renamed from: b, reason: collision with root package name */
        public final l f155285b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC15558a> f155286c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.favorite_comparison.presentation.items.comparison_list_item.d> f155287d = dagger.internal.g.d(com.avito.android.favorite_comparison.presentation.items.comparison_list_item.f.a());

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f155288e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.remote.error.f> f155289f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC35745a5> f155290g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC48028e> f155291h;

        /* renamed from: i, reason: collision with root package name */
        public final u<o> f155292i;

        /* renamed from: j, reason: collision with root package name */
        public final u<io.reactivex.rxjava3.subjects.e<com.avito.android.favorite_comparison.presentation.a>> f155293j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f155294k;

        /* compiled from: DaggerFavoriteComparisonComponent.java */
        /* renamed from: com.avito.android.favorite_comparison.di.a$c$a, reason: collision with other inner class name */
        public static final class C4549a implements u<InterfaceC15558a> {

            /* renamed from: a, reason: collision with root package name */
            public final f f155295a;

            public C4549a(f fVar) {
                this.f155295a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC15558a interfaceC15558aU1 = this.f155295a.U1();
                t.c(interfaceC15558aU1);
                return interfaceC15558aU1;
            }
        }

        /* compiled from: DaggerFavoriteComparisonComponent.java */
        public static final class b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f155296a;

            public b(cv.b bVar) {
                this.f155296a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f155296a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerFavoriteComparisonComponent.java */
        /* renamed from: com.avito.android.favorite_comparison.di.a$c$c, reason: collision with other inner class name */
        public static final class C4550c implements u<com.avito.android.remote.error.f> {

            /* renamed from: a, reason: collision with root package name */
            public final f f155297a;

            public C4550c(f fVar) {
                this.f155297a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f155297a.oi();
            }
        }

        /* compiled from: DaggerFavoriteComparisonComponent.java */
        public static final class d implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final f f155298a;

            public d(f fVar) {
                this.f155298a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f155298a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        public c(f fVar, cv.b bVar, com.avito.android.favorite_comparison.presentation.c cVar, Resources resources, C4548a c4548a) {
            this.f155284a = fVar;
            this.f155285b = l.a(cVar);
            this.f155286c = new C4549a(fVar);
            this.f155288e = new b(bVar);
            this.f155289f = new C4550c(fVar);
            this.f155290g = new d(fVar);
            u<InterfaceC48028e> uVarD = dagger.internal.g.d(new sC.g(l.a(resources)));
            this.f155291h = uVarD;
            u<o> uVarD2 = dagger.internal.g.d(new i(this.f155285b, new q(uVarD, this.f155286c, this.f155287d, this.f155288e, this.f155289f, this.f155290g)));
            this.f155292i = uVarD2;
            u<io.reactivex.rxjava3.subjects.e<com.avito.android.favorite_comparison.presentation.a>> uVarD3 = dagger.internal.g.d(new h(uVarD2));
            this.f155293j = uVarD3;
            this.f155294k = dagger.internal.g.d(new j(new com.avito.android.favorite_comparison.presentation.items.comparison_list_item.c(new com.avito.android.favorite_comparison.presentation.items.comparison_list_item.h(uVarD3))));
        }

        @Override // com.avito.android.favorite_comparison.di.c
        public final void a(FavoriteComparisonFragment favoriteComparisonFragment) {
            favoriteComparisonFragment.f155308t0 = this.f155294k.get();
            favoriteComparisonFragment.f155309u0 = this.f155292i.get();
            InterfaceC35745a5 interfaceC35745a5D = this.f155284a.d();
            t.c(interfaceC35745a5D);
            favoriteComparisonFragment.f155310v0 = interfaceC35745a5D;
        }
    }

    public static c.a a() {
        return new b();
    }
}
