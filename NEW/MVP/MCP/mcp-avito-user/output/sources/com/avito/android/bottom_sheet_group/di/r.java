package com.avito.android.bottom_sheet_group.di;

import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bottom_sheet_group.bottomsheetgroup.BottomSheetGroupMviFragment;
import com.avito.android.bottom_sheet_group.bottomsheetgroup.i;
import com.avito.android.bottom_sheet_group.di.f;
import com.avito.android.bottom_sheet_group.di.g;
import com.avito.android.bottom_sheet_group.di.m;
import com.avito.android.bottom_sheet_group.di.n;
import com.avito.android.bottom_sheet_group.di.p;
import com.avito.android.bottom_sheet_group.t;
import com.avito.android.bottom_sheet_group.x;
import com.avito.android.remote.model.category_parameters.BottomSheetGroupParameter;
import dagger.internal.u;

/* compiled from: DaggerBottomSheetGroupMviComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class r {

    /* compiled from: DaggerBottomSheetGroupMviComponent.java */
    public static final class b implements p {

        /* renamed from: a, reason: collision with root package name */
        public final t f107319a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.l f107320b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.bottom_sheet_group.bottomsheetgroup.mvi.o f107321c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28481c> f107322d;

        /* renamed from: e, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f107323e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.l f107324f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.bottom_sheet_group.items.checkable_item.c> f107325g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f107326h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.h> f107327i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.bottom_sheet_group.items.multiselect_item.c> f107328j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f107329k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.h> f107330l;

        /* compiled from: DaggerBottomSheetGroupMviComponent.java */
        public static final class a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.bottom_sheet_group.di.b f107331a;

            public a(com.avito.android.bottom_sheet_group.di.b bVar) {
                this.f107331a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f107331a.f();
                dagger.internal.t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        public b(com.avito.android.bottom_sheet_group.di.b bVar, C28478k c28478k, Resources resources, BottomSheetGroupParameter bottomSheetGroupParameter, a aVar) {
            this.f107319a = new t(dagger.internal.l.a(resources));
            this.f107320b = dagger.internal.l.a(bottomSheetGroupParameter);
            this.f107321c = new com.avito.android.bottom_sheet_group.bottomsheetgroup.mvi.o(x.a(), this.f107319a, this.f107320b);
            this.f107322d = new a(bVar);
            this.f107323e = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f107322d);
            this.f107324f = dagger.internal.l.a(new com.avito.android.bottom_sheet_group.bottomsheetgroup.k(new com.avito.android.bottom_sheet_group.bottomsheetgroup.j(new com.avito.android.bottom_sheet_group.bottomsheetgroup.mvi.k(com.avito.android.bottom_sheet_group.bottomsheetgroup.mvi.h.a(), com.avito.android.bottom_sheet_group.bottomsheetgroup.mvi.f.a(), com.avito.android.bottom_sheet_group.bottomsheetgroup.mvi.m.a(), this.f107321c, this.f107323e), g.a.f107296a, n.a.f107302a)));
            u<com.avito.android.bottom_sheet_group.items.checkable_item.c> uVarD = dagger.internal.g.d(new com.avito.android.bottom_sheet_group.items.checkable_item.f(f.a.f107295a));
            this.f107325g = uVarD;
            u<com.avito.konveyor.a> uVarD2 = dagger.internal.g.d(new k(new com.avito.android.bottom_sheet_group.items.checkable_item.b(uVarD)));
            this.f107326h = uVarD2;
            u<com.avito.konveyor.adapter.h> uVarD3 = dagger.internal.g.d(new l(uVarD2));
            this.f107327i = uVarD3;
            u<com.avito.android.bottom_sheet_group.items.multiselect_item.c> uVarD4 = dagger.internal.g.d(new com.avito.android.bottom_sheet_group.items.multiselect_item.f(uVarD3, this.f107326h, this.f107319a, m.a.f107301a));
            this.f107328j = uVarD4;
            u<com.avito.konveyor.a> uVarD5 = dagger.internal.g.d(new j(new com.avito.android.bottom_sheet_group.items.multiselect_item.b(uVarD4)));
            this.f107329k = uVarD5;
            this.f107330l = dagger.internal.g.d(new i(uVarD5));
        }

        @Override // com.avito.android.bottom_sheet_group.di.p
        public final void a(BottomSheetGroupMviFragment bottomSheetGroupMviFragment) {
            bottomSheetGroupMviFragment.f107193h0 = (i.a) this.f107324f.f393949a;
            bottomSheetGroupMviFragment.f107195j0 = this.f107323e.get();
            bottomSheetGroupMviFragment.f107196k0 = this.f107329k.get();
            bottomSheetGroupMviFragment.f107197l0 = this.f107330l.get();
        }
    }

    /* compiled from: DaggerBottomSheetGroupMviComponent.java */
    public static final class c implements p.a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.bottom_sheet_group.di.b f107332a;

        /* renamed from: b, reason: collision with root package name */
        public C28478k f107333b;

        /* renamed from: c, reason: collision with root package name */
        public Resources f107334c;

        /* renamed from: d, reason: collision with root package name */
        public BottomSheetGroupParameter f107335d;

        public c() {
        }

        @Override // com.avito.android.bottom_sheet_group.di.p.a
        public final p.a a(com.avito.android.bottom_sheet_group.di.b bVar) {
            this.f107332a = bVar;
            return this;
        }

        @Override // com.avito.android.bottom_sheet_group.di.p.a
        public final p.a b(Resources resources) {
            this.f107334c = resources;
            return this;
        }

        @Override // com.avito.android.bottom_sheet_group.di.p.a
        public final p build() {
            dagger.internal.t.a(com.avito.android.bottom_sheet_group.di.b.class, this.f107332a);
            dagger.internal.t.a(C28478k.class, this.f107333b);
            dagger.internal.t.a(Resources.class, this.f107334c);
            dagger.internal.t.a(BottomSheetGroupParameter.class, this.f107335d);
            return new b(this.f107332a, this.f107333b, this.f107334c, this.f107335d, null);
        }

        @Override // com.avito.android.bottom_sheet_group.di.p.a
        public final p.a c(C28478k c28478k) {
            this.f107333b = c28478k;
            return this;
        }

        @Override // com.avito.android.bottom_sheet_group.di.p.a
        public final p.a d(BottomSheetGroupParameter bottomSheetGroupParameter) {
            this.f107335d = bottomSheetGroupParameter;
            return this;
        }
    }

    public static p.a a() {
        return new c();
    }
}
