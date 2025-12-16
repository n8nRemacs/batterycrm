package com.avito.android.rubricator.list.category.di;

import android.content.res.Resources;
import com.avito.android.J0;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.rubricator.list.category.CategoryListFragment;
import com.avito.android.rubricator.list.category.di.a;
import com.avito.android.rubricator.list.category.di.e;
import com.avito.android.rubricator.list.category.i;
import com.avito.android.rubricator.list.category.j;
import com.avito.android.rubricator.list.category.k;
import com.avito.android.rubricator.list.category.model.CategoryListArguments;
import com.avito.android.rubricator.list.category.mvi.h;
import cv.InterfaceC39417a;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import un0.InterfaceC49081a;

/* compiled from: DaggerCategoryListComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class f {

    /* compiled from: DaggerCategoryListComponent.java */
    public static final class b implements com.avito.android.rubricator.list.category.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f255901a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.rubricator.list.category.di.b f255902b;

        /* renamed from: c, reason: collision with root package name */
        public final l f255903c;

        /* renamed from: d, reason: collision with root package name */
        public final u<J0> f255904d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC49081a> f255905e;

        /* renamed from: f, reason: collision with root package name */
        public final l f255906f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28481c> f255907g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f255908h;

        /* compiled from: DaggerCategoryListComponent.java */
        public static final class a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rubricator.list.category.di.b f255909a;

            public a(com.avito.android.rubricator.list.category.di.b bVar) {
                this.f255909a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f255909a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(com.avito.android.rubricator.list.category.di.b bVar, cv.b bVar2, CategoryListArguments categoryListArguments, CategoryListFragment categoryListFragment, Resources resources, C28478k c28478k, a aVar) {
            this.f255901a = bVar2;
            this.f255902b = bVar;
            this.f255903c = l.a(categoryListArguments);
            u<J0> uVarD = g.d(e.a.f255900a);
            this.f255904d = uVarD;
            u<InterfaceC49081a> uVarD2 = g.d(new d(uVarD));
            this.f255905e = uVarD2;
            this.f255906f = l.a(new k(new j(new com.avito.android.rubricator.list.category.mvi.f(this.f255903c, uVarD2, com.avito.android.rubricator.list.category.mvi.b.a(), h.a(), com.avito.android.rubricator.list.category.mvi.j.a()))));
            this.f255907g = new a(bVar);
            this.f255908h = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f255907g);
        }

        @Override // com.avito.android.rubricator.list.category.di.a
        public final void a(CategoryListFragment categoryListFragment) {
            categoryListFragment.f255837t0 = (i.a) this.f255906f.f393949a;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f255901a.u4();
            t.c(aVarU4);
            categoryListFragment.f255839v0 = aVarU4;
            com.avito.android.deeplink_handler.mapping.checker.c cVarJ6 = this.f255902b.j6();
            t.c(cVarJ6);
            categoryListFragment.f255840w0 = cVarJ6;
            categoryListFragment.f255841x0 = this.f255908h.get();
        }
    }

    /* compiled from: DaggerCategoryListComponent.java */
    public static final class c implements a.InterfaceC7661a {
        public c() {
        }

        @Override // com.avito.android.rubricator.list.category.di.a.InterfaceC7661a
        public final com.avito.android.rubricator.list.category.di.a a(com.avito.android.rubricator.list.category.di.b bVar, InterfaceC39417a interfaceC39417a, CategoryListArguments categoryListArguments, CategoryListFragment categoryListFragment, Resources resources, C28478k c28478k) {
            interfaceC39417a.getClass();
            return new b(bVar, interfaceC39417a, categoryListArguments, categoryListFragment, resources, c28478k, null);
        }
    }

    public static a.InterfaceC7661a a() {
        return new c();
    }
}
