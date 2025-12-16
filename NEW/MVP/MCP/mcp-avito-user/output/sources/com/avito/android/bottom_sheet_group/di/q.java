package com.avito.android.bottom_sheet_group.di;

import android.content.res.Resources;
import com.avito.android.bottom_sheet_group.BottomSheetGroupFragment;
import com.avito.android.bottom_sheet_group.BottomSheetGroupParameterWrapper;
import com.avito.android.bottom_sheet_group.di.a;
import com.avito.android.bottom_sheet_group.di.f;
import com.avito.android.bottom_sheet_group.di.m;
import com.avito.android.bottom_sheet_group.t;
import com.avito.android.bottom_sheet_group.x;
import com.avito.android.remote.model.category_parameters.BottomSheetGroupParameter;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;

/* compiled from: DaggerBottomSheetGroupComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class q {

    /* compiled from: DaggerBottomSheetGroupComponent.java */
    public static final class b implements com.avito.android.bottom_sheet_group.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC35745a5> f107303a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.bottom_sheet_group.items.checkable_item.c> f107304b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f107305c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.h> f107306d;

        /* renamed from: e, reason: collision with root package name */
        public final t f107307e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.bottom_sheet_group.items.multiselect_item.c> f107308f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f107309g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.h> f107310h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.l f107311i;

        /* renamed from: j, reason: collision with root package name */
        public final u<BottomSheetGroupParameterWrapper> f107312j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.bottom_sheet_group.a> f107313k;

        /* compiled from: DaggerBottomSheetGroupComponent.java */
        public static final class a implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.bottom_sheet_group.di.b f107314a;

            public a(com.avito.android.bottom_sheet_group.di.b bVar) {
                this.f107314a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f107314a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        public b(com.avito.android.bottom_sheet_group.di.b bVar, BottomSheetGroupParameterWrapper.ParameterState parameterState, Resources resources, BottomSheetGroupParameter bottomSheetGroupParameter, a aVar) {
            this.f107303a = new a(bVar);
            u<com.avito.android.bottom_sheet_group.items.checkable_item.c> uVarD = dagger.internal.g.d(new com.avito.android.bottom_sheet_group.items.checkable_item.f(f.a.f107295a));
            this.f107304b = uVarD;
            u<com.avito.konveyor.a> uVarD2 = dagger.internal.g.d(new k(new com.avito.android.bottom_sheet_group.items.checkable_item.b(uVarD)));
            this.f107305c = uVarD2;
            this.f107306d = dagger.internal.g.d(new l(uVarD2));
            t tVar = new t(dagger.internal.l.a(resources));
            this.f107307e = tVar;
            u<com.avito.android.bottom_sheet_group.items.multiselect_item.c> uVarD3 = dagger.internal.g.d(new com.avito.android.bottom_sheet_group.items.multiselect_item.f(this.f107306d, this.f107305c, tVar, m.a.f107301a));
            this.f107308f = uVarD3;
            u<com.avito.konveyor.a> uVarD4 = dagger.internal.g.d(new j(new com.avito.android.bottom_sheet_group.items.multiselect_item.b(uVarD3)));
            this.f107309g = uVarD4;
            this.f107310h = dagger.internal.g.d(new i(uVarD4));
            this.f107311i = dagger.internal.l.a(bottomSheetGroupParameter);
            this.f107312j = dagger.internal.g.d(new com.avito.android.bottom_sheet_group.r(this.f107311i, dagger.internal.l.b(parameterState)));
            this.f107313k = dagger.internal.g.d(new com.avito.android.bottom_sheet_group.k(this.f107303a, this.f107310h, this.f107307e, this.f107304b, this.f107308f, x.a(), this.f107312j));
        }

        @Override // com.avito.android.bottom_sheet_group.di.a
        public final void a(BottomSheetGroupFragment bottomSheetGroupFragment) {
            bottomSheetGroupFragment.f107180h0 = this.f107313k.get();
            bottomSheetGroupFragment.f107181i0 = this.f107309g.get();
            bottomSheetGroupFragment.f107182j0 = this.f107310h.get();
        }
    }

    /* compiled from: DaggerBottomSheetGroupComponent.java */
    public static final class c implements a.InterfaceC3206a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.bottom_sheet_group.di.b f107315a;

        /* renamed from: b, reason: collision with root package name */
        public BottomSheetGroupParameterWrapper.ParameterState f107316b;

        /* renamed from: c, reason: collision with root package name */
        public Resources f107317c;

        /* renamed from: d, reason: collision with root package name */
        public BottomSheetGroupParameter f107318d;

        public c() {
        }

        @Override // com.avito.android.bottom_sheet_group.di.a.InterfaceC3206a
        public final a.InterfaceC3206a a(com.avito.android.bottom_sheet_group.di.b bVar) {
            this.f107315a = bVar;
            return this;
        }

        @Override // com.avito.android.bottom_sheet_group.di.a.InterfaceC3206a
        public final a.InterfaceC3206a b(Resources resources) {
            this.f107317c = resources;
            return this;
        }

        @Override // com.avito.android.bottom_sheet_group.di.a.InterfaceC3206a
        public final com.avito.android.bottom_sheet_group.di.a build() {
            dagger.internal.t.a(com.avito.android.bottom_sheet_group.di.b.class, this.f107315a);
            dagger.internal.t.a(Resources.class, this.f107317c);
            dagger.internal.t.a(BottomSheetGroupParameter.class, this.f107318d);
            return new b(this.f107315a, this.f107316b, this.f107317c, this.f107318d, null);
        }

        @Override // com.avito.android.bottom_sheet_group.di.a.InterfaceC3206a
        public final a.InterfaceC3206a d(BottomSheetGroupParameter bottomSheetGroupParameter) {
            this.f107318d = bottomSheetGroupParameter;
            return this;
        }

        @Override // com.avito.android.bottom_sheet_group.di.a.InterfaceC3206a
        public final a.InterfaceC3206a e(BottomSheetGroupParameterWrapper.ParameterState parameterState) {
            this.f107316b = parameterState;
            return this;
        }
    }

    public static a.InterfaceC3206a a() {
        return new c();
    }
}
