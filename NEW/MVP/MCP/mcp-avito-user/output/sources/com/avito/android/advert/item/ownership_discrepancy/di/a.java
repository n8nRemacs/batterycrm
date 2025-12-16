package com.avito.android.advert.item.ownership_discrepancy.di;

import com.avito.android.advert.item.ownership_discrepancy.AdvertDetailsOwnershipDiscrepancyBottomSheet;
import com.avito.android.advert.item.ownership_discrepancy.OwnershipDiscrepancyOpenParams;
import com.avito.android.advert.item.ownership_discrepancy.di.b;
import com.avito.android.advert.item.ownership_discrepancy.mvi.f;
import com.avito.android.advert.item.ownership_discrepancy.mvi.h;
import com.avito.android.advert.item.ownership_discrepancy.mvi.j;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.InterfaceC30106l7;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerOwnershipDiscrepancyComponent.java */
@e
/* loaded from: classes10.dex */
public final class a {

    /* compiled from: DaggerOwnershipDiscrepancyComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.advert.item.ownership_discrepancy.di.b.a
        public final com.avito.android.advert.item.ownership_discrepancy.di.b a(InterfaceC30106l7 interfaceC30106l7, com.avito.android.advert.item.ownership_discrepancy.di.c cVar, C28478k c28478k, OwnershipDiscrepancyOpenParams ownershipDiscrepancyOpenParams) {
            return new c(interfaceC30106l7, cVar, c28478k, ownershipDiscrepancyOpenParams, null);
        }
    }

    /* compiled from: DaggerOwnershipDiscrepancyComponent.java */
    public static final class c implements com.avito.android.advert.item.ownership_discrepancy.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.advert.item.ownership_discrepancy.di.c f78100a;

        /* renamed from: b, reason: collision with root package name */
        public final l f78101b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.advert.item.ownership_discrepancy.mvi.c f78102c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28481c> f78103d;

        /* renamed from: e, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f78104e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.advert.item.ownership_discrepancy.e f78105f;

        /* compiled from: DaggerOwnershipDiscrepancyComponent.java */
        /* renamed from: com.avito.android.advert.item.ownership_discrepancy.di.a$c$a, reason: collision with other inner class name */
        public static final class C2311a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30106l7 f78106a;

            public C2311a(InterfaceC30106l7 interfaceC30106l7) {
                this.f78106a = interfaceC30106l7;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f78106a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(InterfaceC30106l7 interfaceC30106l7, com.avito.android.advert.item.ownership_discrepancy.di.c cVar, C28478k c28478k, OwnershipDiscrepancyOpenParams ownershipDiscrepancyOpenParams, C2310a c2310a) {
            this.f78100a = cVar;
            l lVarA = l.a(ownershipDiscrepancyOpenParams);
            this.f78101b = lVarA;
            this.f78102c = new com.avito.android.advert.item.ownership_discrepancy.mvi.c(lVarA);
            this.f78103d = new C2311a(interfaceC30106l7);
            this.f78104e = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f78103d);
            this.f78105f = new com.avito.android.advert.item.ownership_discrepancy.e(new f(this.f78102c, h.a(), j.a(), this.f78104e, this.f78101b));
        }

        @Override // com.avito.android.advert.item.ownership_discrepancy.di.b
        public final void a(AdvertDetailsOwnershipDiscrepancyBottomSheet advertDetailsOwnershipDiscrepancyBottomSheet) {
            advertDetailsOwnershipDiscrepancyBottomSheet.f78074h0 = this.f78105f;
            advertDetailsOwnershipDiscrepancyBottomSheet.f78076j0 = this.f78104e.get();
            com.avito.android.advert.item.ownership_discrepancy.di.c cVar = this.f78100a;
            com.avito.android.autoteka.data.a aVarT1 = cVar.T1();
            t.c(aVarT1);
            advertDetailsOwnershipDiscrepancyBottomSheet.f78077k0 = aVarT1;
            advertDetailsOwnershipDiscrepancyBottomSheet.f78078l0 = cVar.h();
        }
    }

    public static b.a a() {
        return new b();
    }
}
