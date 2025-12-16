package com.avito.android.category_with_params.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.category_with_params.CategoryWithParamsFragment;
import com.avito.android.category_with_params.di.a;
import com.avito.android.category_with_params.entity.CategoryParams;
import com.avito.android.category_with_params.g;
import com.avito.android.category_with_params.mvi.h;
import com.avito.android.category_with_params.mvi.j;
import com.avito.android.category_with_params.mvi.l;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerCategoryWithParamsComponent.java */
@e
/* loaded from: classes12.dex */
public final class c {

    /* compiled from: DaggerCategoryWithParamsComponent.java */
    public static final class b implements com.avito.android.category_with_params.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.category_with_params.mvi.e f117666a;

        /* renamed from: b, reason: collision with root package name */
        public final l f117667b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28481c> f117668c;

        /* renamed from: d, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f117669d;

        /* renamed from: e, reason: collision with root package name */
        public final g f117670e;

        /* compiled from: DaggerCategoryWithParamsComponent.java */
        public static final class a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.category_with_params.di.b f117671a;

            public a(com.avito.android.category_with_params.di.b bVar) {
                this.f117671a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f117671a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(com.avito.android.category_with_params.di.b bVar, CategoryParams categoryParams, C28478k c28478k, a aVar) {
            dagger.internal.l lVarA = dagger.internal.l.a(categoryParams);
            this.f117666a = new com.avito.android.category_with_params.mvi.e(lVarA);
            this.f117667b = new l(lVarA);
            this.f117668c = new a(bVar);
            this.f117669d = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f117668c);
            this.f117670e = new g(new h(this.f117666a, com.avito.android.category_with_params.mvi.c.a(), j.a(), this.f117667b, this.f117669d));
        }

        @Override // com.avito.android.category_with_params.di.a
        public final void a(CategoryWithParamsFragment categoryWithParamsFragment) {
            categoryWithParamsFragment.f117649h0 = this.f117670e;
            categoryWithParamsFragment.f117651j0 = this.f117669d.get();
        }
    }

    /* compiled from: DaggerCategoryWithParamsComponent.java */
    /* renamed from: com.avito.android.category_with_params.di.c$c, reason: collision with other inner class name */
    public static final class C3421c implements a.InterfaceC3420a {
        public C3421c() {
        }

        @Override // com.avito.android.category_with_params.di.a.InterfaceC3420a
        public final com.avito.android.category_with_params.di.a a(com.avito.android.category_with_params.di.b bVar, CategoryParams categoryParams, C28478k c28478k) {
            return new b(bVar, categoryParams, c28478k, null);
        }
    }

    public static a.InterfaceC3420a a() {
        return new C3421c();
    }
}
