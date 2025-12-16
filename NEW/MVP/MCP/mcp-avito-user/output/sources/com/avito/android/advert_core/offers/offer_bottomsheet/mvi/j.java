package com.avito.android.advert_core.offers.offer_bottomsheet.mvi;

import J9.b;
import com.avito.android.advert_core.offers.offer_bottomsheet.OfferOpenParams;
import com.avito.android.advert_core.offers.offer_bottomsheet.mvi.entity.OfferBottomSheetState;
import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: OfferBottomSheetReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert_core/offers/offer_bottomsheet/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "LJ9/b;", "Lcom/avito/android/advert_core/offers/offer_bottomsheet/mvi/entity/OfferBottomSheetState;", "<init>", "()V", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j implements u<J9.b, OfferBottomSheetState> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final OfferBottomSheetState a(J9.b bVar, OfferBottomSheetState offerBottomSheetState) {
        J9.b bVar2 = bVar;
        OfferBottomSheetState offerBottomSheetState2 = offerBottomSheetState;
        if (bVar2 instanceof b.c) {
            l lVar = l.f83913a;
            OfferOpenParams offerOpenParams = ((b.c) bVar2).f8809a;
            lVar.getClass();
            return l.a(offerOpenParams, null);
        }
        if (!(bVar2 instanceof b.a)) {
            return offerBottomSheetState2;
        }
        l lVar2 = l.f83913a;
        b.a aVar = (b.a) bVar2;
        Integer numValueOf = Integer.valueOf(aVar.f8807b);
        lVar2.getClass();
        return l.a(aVar.f8806a, numValueOf);
    }
}
