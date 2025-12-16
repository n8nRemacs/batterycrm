package com.avito.android.advert_core.offers.offer_bottomsheet.di;

import com.avito.android.advert_core.offers.offer_bottomsheet.OfferBottomSheetDialog;
import com.avito.android.advert_core.offers.offer_bottomsheet.OfferOpenParams;
import com.avito.android.advert_core.offers.offer_bottomsheet.di.b;
import com.avito.android.advert_core.offers.offer_bottomsheet.e;
import com.avito.android.advert_core.offers.offer_bottomsheet.f;
import com.avito.android.advert_core.offers.offer_bottomsheet.g;
import com.avito.android.advert_core.offers.offer_bottomsheet.mvi.d;
import com.avito.android.advert_core.offers.offer_bottomsheet.mvi.i;
import com.avito.android.advert_core.offers.offer_bottomsheet.mvi.k;
import dagger.internal.e;
import dagger.internal.l;

/* compiled from: DaggerOfferBottomSheetComponent.java */
@e
/* loaded from: classes10.dex */
public final class a {

    /* compiled from: DaggerOfferBottomSheetComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.advert_core.offers.offer_bottomsheet.di.b.a
        public final com.avito.android.advert_core.offers.offer_bottomsheet.di.b a(OfferOpenParams offerOpenParams, boolean z12) {
            return new c(offerOpenParams, Boolean.valueOf(z12), null);
        }
    }

    /* compiled from: DaggerOfferBottomSheetComponent.java */
    public static final class c implements com.avito.android.advert_core.offers.offer_bottomsheet.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final l f83878a;

        /* renamed from: b, reason: collision with root package name */
        public final l f83879b;

        public c(OfferOpenParams offerOpenParams, Boolean bool, C2486a c2486a) {
            this.f83878a = l.a(offerOpenParams);
            l lVarA = l.a(bool);
            l lVar = this.f83878a;
            this.f83879b = l.a(new g(new f(new com.avito.android.advert_core.offers.offer_bottomsheet.mvi.g(new d(lVar, lVarA), new com.avito.android.advert_core.offers.offer_bottomsheet.mvi.b(lVar), i.a(), k.a()))));
        }

        @Override // com.avito.android.advert_core.offers.offer_bottomsheet.di.b
        public final void a(OfferBottomSheetDialog offerBottomSheetDialog) {
            offerBottomSheetDialog.f83847i0 = (e.a) this.f83879b.f393949a;
        }
    }

    public static b.a a() {
        return new b();
    }
}
