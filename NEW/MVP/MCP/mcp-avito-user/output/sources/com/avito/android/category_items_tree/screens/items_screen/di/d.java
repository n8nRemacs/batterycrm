package com.avito.android.category_items_tree.screens.items_screen.di;

import Tn.InterfaceC15379a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.category_items_tree.screens.items_screen.CategoryItemsActivity;
import com.avito.android.category_items_tree.screens.items_screen.CategoryItemsArguments;
import com.avito.android.category_items_tree.screens.items_screen.di.a;
import com.avito.android.category_items_tree.screens.items_screen.h;
import com.avito.android.category_items_tree.screens.items_screen.j;
import com.avito.android.category_items_tree.screens.items_screen.o;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.Locale;

/* compiled from: DaggerCategoryItemsComponent.java */
@e
/* loaded from: classes12.dex */
public final class d {

    /* compiled from: DaggerCategoryItemsComponent.java */
    public static final class b implements com.avito.android.category_items_tree.screens.items_screen.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final CategoryItemsArguments f116934a;

        /* renamed from: b, reason: collision with root package name */
        public final l f116935b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC15379a> f116936c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f116937d;

        /* renamed from: e, reason: collision with root package name */
        public final u<Locale> f116938e;

        /* renamed from: f, reason: collision with root package name */
        public final u<h> f116939f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28373a> f116940g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.category_items_tree.screens.items_screen.mvi.e f116941h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f116942i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.category_items_tree.screens.items_screen.mvi.c f116943j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC28481c> f116944k;

        /* renamed from: l, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f116945l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.category_items_tree.screens.items_screen.l f116946m;

        /* compiled from: DaggerCategoryItemsComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.category_items_tree.screens.items_screen.di.b f116947a;

            public a(com.avito.android.category_items_tree.screens.items_screen.di.b bVar) {
                this.f116947a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f116947a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerCategoryItemsComponent.java */
        /* renamed from: com.avito.android.category_items_tree.screens.items_screen.di.d$b$b, reason: collision with other inner class name */
        public static final class C3410b implements u<InterfaceC15379a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.category_items_tree.screens.items_screen.di.b f116948a;

            public C3410b(com.avito.android.category_items_tree.screens.items_screen.di.b bVar) {
                this.f116948a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC15379a interfaceC15379aG5 = this.f116948a.g5();
                t.c(interfaceC15379aG5);
                return interfaceC15379aG5;
            }
        }

        /* compiled from: DaggerCategoryItemsComponent.java */
        public static final class c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f116949a;

            public c(cv.b bVar) {
                this.f116949a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f116949a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerCategoryItemsComponent.java */
        /* renamed from: com.avito.android.category_items_tree.screens.items_screen.di.d$b$d, reason: collision with other inner class name */
        public static final class C3411d implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.category_items_tree.screens.items_screen.di.b f116950a;

            public C3411d(com.avito.android.category_items_tree.screens.items_screen.di.b bVar) {
                this.f116950a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f116950a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerCategoryItemsComponent.java */
        public static final class e implements u<Locale> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.category_items_tree.screens.items_screen.di.b f116951a;

            public e(com.avito.android.category_items_tree.screens.items_screen.di.b bVar) {
                this.f116951a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f116951a.locale();
            }
        }

        /* compiled from: DaggerCategoryItemsComponent.java */
        public static final class f implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30106l7 f116952a;

            public f(InterfaceC30106l7 interfaceC30106l7) {
                this.f116952a = interfaceC30106l7;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f116952a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(com.avito.android.category_items_tree.screens.items_screen.di.b bVar, cv.b bVar2, InterfaceC30106l7 interfaceC30106l7, C28478k c28478k, CategoryItemsArguments categoryItemsArguments, a aVar) {
            this.f116934a = categoryItemsArguments;
            l lVarA = l.a(categoryItemsArguments);
            this.f116935b = lVarA;
            u<h> uVarD = g.d(new j(lVarA, new C3410b(bVar), new C3411d(bVar), new o(new e(bVar))));
            this.f116939f = uVarD;
            a aVar2 = new a(bVar);
            l lVar = this.f116935b;
            this.f116941h = new com.avito.android.category_items_tree.screens.items_screen.mvi.e(lVar, uVarD, aVar2);
            this.f116943j = new com.avito.android.category_items_tree.screens.items_screen.mvi.c(lVar, uVarD, new c(bVar2), aVar2);
            this.f116944k = new f(interfaceC30106l7);
            u<ScreenPerformanceTracker> uVarD2 = com.avito.android.actions_sheet.a.D(l.a(c28478k), this.f116944k);
            this.f116945l = uVarD2;
            this.f116946m = new com.avito.android.category_items_tree.screens.items_screen.l(new com.avito.android.category_items_tree.screens.items_screen.mvi.h(this.f116941h, this.f116943j, uVarD2, com.avito.android.category_items_tree.screens.items_screen.mvi.l.a(), com.avito.android.category_items_tree.screens.items_screen.mvi.j.a()));
        }

        @Override // com.avito.android.category_items_tree.screens.items_screen.di.a
        public final void a(CategoryItemsActivity categoryItemsActivity) {
            categoryItemsActivity.f116784m = this.f116946m;
            categoryItemsActivity.f116786o = this.f116945l.get();
            categoryItemsActivity.f116788q = this.f116934a;
        }
    }

    /* compiled from: DaggerCategoryItemsComponent.java */
    public static final class c implements a.InterfaceC3409a {
        public c() {
        }

        @Override // com.avito.android.category_items_tree.screens.items_screen.di.a.InterfaceC3409a
        public final com.avito.android.category_items_tree.screens.items_screen.di.a a(com.avito.android.category_items_tree.screens.items_screen.di.b bVar, InterfaceC39417a interfaceC39417a, InterfaceC30106l7 interfaceC30106l7, C28478k c28478k, CategoryItemsArguments categoryItemsArguments) {
            interfaceC39417a.getClass();
            return new b(bVar, interfaceC39417a, interfaceC30106l7, c28478k, categoryItemsArguments, null);
        }
    }

    public static a.InterfaceC3409a a() {
        return new c();
    }
}
