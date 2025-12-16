package com.avito.android.select.new_districts.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.select.new_districts.SelectDistrictFragment;
import com.avito.android.select.new_districts.SelectDistrictParams;
import com.avito.android.select.new_districts.di.c;
import com.avito.android.select.new_districts.mvi.d;
import com.avito.android.select.new_districts.mvi.h;
import com.avito.android.select.new_districts.mvi.j;
import com.avito.android.select.new_districts.mvi.n;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerSelectDistrictFragmentComponent.java */
@e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerSelectDistrictFragmentComponent.java */
    public static final class b implements c.a {
        public b() {
        }

        @Override // com.avito.android.select.new_districts.di.c.a
        public final com.avito.android.select.new_districts.di.c a(C28478k c28478k, SelectDistrictParams selectDistrictParams, com.avito.android.select.new_districts.di.b bVar) {
            selectDistrictParams.getClass();
            return new c(bVar, c28478k, selectDistrictParams, null);
        }
    }

    /* compiled from: DaggerSelectDistrictFragmentComponent.java */
    public static final class c implements com.avito.android.select.new_districts.di.c {

        /* renamed from: a, reason: collision with root package name */
        public final d f265791a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28481c> f265792b;

        /* renamed from: c, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f265793c;

        /* renamed from: d, reason: collision with root package name */
        public final n f265794d;

        /* compiled from: DaggerSelectDistrictFragmentComponent.java */
        /* renamed from: com.avito.android.select.new_districts.di.a$c$a, reason: collision with other inner class name */
        public static final class C7939a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.select.new_districts.di.b f265795a;

            public C7939a(com.avito.android.select.new_districts.di.b bVar) {
                this.f265795a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f265795a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.select.new_districts.di.b bVar, C28478k c28478k, SelectDistrictParams selectDistrictParams, C7938a c7938a) {
            this.f265791a = new d(l.a(selectDistrictParams));
            this.f265792b = new C7939a(bVar);
            this.f265793c = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f265792b);
            this.f265794d = new n(new h(this.f265791a, com.avito.android.select.new_districts.mvi.b.a(), j.a(), com.avito.android.select.new_districts.mvi.l.a(), this.f265793c));
        }

        @Override // com.avito.android.select.new_districts.di.c
        public final void a(SelectDistrictFragment selectDistrictFragment) {
            selectDistrictFragment.f265666t0 = this.f265794d;
            selectDistrictFragment.f265668v0 = this.f265793c.get();
        }
    }

    public static c.a a() {
        return new b();
    }
}
