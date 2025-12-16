package com.avito.android.advert_core.price_list.dialog.di;

import com.avito.android.advert_core.price_list.dialog.AdvertPriceListBottomSheetDialogFragment;
import com.avito.android.advert_core.price_list.dialog.AdvertPriceListBottomSheetDialogOpenParams;
import com.avito.android.advert_core.price_list.dialog.di.a;
import com.avito.android.advert_core.price_list.v2.section.i;
import com.avito.android.advert_core.price_list.v2.section.l;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.recycler.data_aware.h;
import com.avito.konveyor.adapter.j;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerAdvertPriceListBottomSheetDialogComponent.java */
@dagger.internal.e
/* loaded from: classes10.dex */
public final class g {

    /* compiled from: DaggerAdvertPriceListBottomSheetDialogComponent.java */
    public static final class b implements com.avito.android.advert_core.price_list.dialog.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.advert_core.price_list.dialog.di.b f84065a;

        /* renamed from: b, reason: collision with root package name */
        public final u<i> f84066b = dagger.internal.g.d(l.a());

        /* renamed from: c, reason: collision with root package name */
        public final L9.c f84067c = new L9.c(h.a());

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f84068d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.h> f84069e;

        /* renamed from: f, reason: collision with root package name */
        public final u<j> f84070f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.l f84071g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.advert_core.price_list.converter.a> f84072h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.advert_core.price_list.dialog.mvi.b f84073i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC28481c> f84074j;

        /* renamed from: k, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f84075k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.advert_core.price_list.dialog.e f84076l;

        /* compiled from: DaggerAdvertPriceListBottomSheetDialogComponent.java */
        public static final class a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert_core.price_list.dialog.di.b f84077a;

            public a(com.avito.android.advert_core.price_list.dialog.di.b bVar) {
                this.f84077a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f84077a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        public b(com.avito.android.advert_core.price_list.dialog.di.c cVar, com.avito.android.advert_core.price_list.dialog.di.b bVar, AdvertPriceListBottomSheetDialogOpenParams advertPriceListBottomSheetDialogOpenParams, com.avito.android.advert_core.price_list.dialog.f fVar, C28478k c28478k, a aVar) {
            this.f84065a = bVar;
            u<com.avito.konveyor.a> uVarD = dagger.internal.g.d(new e(cVar, new com.avito.android.advert_core.price_list.v2.section.b(this.f84066b, this.f84067c, new L9.d(new com.avito.android.advert_core.price_list.v2.b(new com.avito.android.advert_core.price_list.v2.h(dagger.internal.l.a(fVar)))))));
            this.f84068d = uVarD;
            u<com.avito.konveyor.adapter.h> uVarD2 = dagger.internal.g.d(new d(cVar, uVarD));
            this.f84069e = uVarD2;
            this.f84070f = dagger.internal.g.d(new f(cVar, uVarD2, this.f84068d));
            this.f84071g = dagger.internal.l.a(advertPriceListBottomSheetDialogOpenParams);
            u<com.avito.android.advert_core.price_list.converter.a> uVarD3 = dagger.internal.g.d(com.avito.android.advert_core.price_list.converter.c.a());
            this.f84072h = uVarD3;
            this.f84073i = new com.avito.android.advert_core.price_list.dialog.mvi.b(this.f84071g, uVarD3);
            this.f84074j = new a(bVar);
            this.f84075k = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f84074j);
            this.f84076l = new com.avito.android.advert_core.price_list.dialog.e(new com.avito.android.advert_core.price_list.dialog.mvi.e(this.f84073i, com.avito.android.advert_core.price_list.dialog.mvi.g.a(), this.f84075k));
        }

        @Override // com.avito.android.advert_core.price_list.dialog.di.a
        public final void a(AdvertPriceListBottomSheetDialogFragment advertPriceListBottomSheetDialogFragment) {
            advertPriceListBottomSheetDialogFragment.f84036i0 = this.f84069e.get();
            advertPriceListBottomSheetDialogFragment.f84037j0 = this.f84070f.get();
            advertPriceListBottomSheetDialogFragment.f84038k0 = this.f84065a.Q4();
            advertPriceListBottomSheetDialogFragment.f84039l0 = this.f84076l;
            advertPriceListBottomSheetDialogFragment.f84041n0 = this.f84075k.get();
        }
    }

    /* compiled from: DaggerAdvertPriceListBottomSheetDialogComponent.java */
    public static final class c implements a.InterfaceC2493a {
        public c() {
        }

        @Override // com.avito.android.advert_core.price_list.dialog.di.a.InterfaceC2493a
        public final com.avito.android.advert_core.price_list.dialog.di.a a(AdvertPriceListBottomSheetDialogOpenParams advertPriceListBottomSheetDialogOpenParams, com.avito.android.advert_core.price_list.dialog.a aVar, C28478k c28478k, com.avito.android.advert_core.price_list.dialog.di.b bVar) {
            return new b(new com.avito.android.advert_core.price_list.dialog.di.c(), bVar, advertPriceListBottomSheetDialogOpenParams, aVar, c28478k, null);
        }
    }

    public static a.InterfaceC2493a a() {
        return new c();
    }
}
