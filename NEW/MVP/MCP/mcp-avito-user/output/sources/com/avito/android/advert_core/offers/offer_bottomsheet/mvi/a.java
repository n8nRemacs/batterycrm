package com.avito.android.advert_core.offers.offer_bottomsheet.mvi;

import J9.a;
import J9.b;
import com.avito.android.advert_core.offers.offer_bottomsheet.OfferOpenParams;
import com.avito.android.advert_core.offers.offer_bottomsheet.mvi.entity.OfferBottomSheetState;
import com.avito.android.arch.mvi.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: OfferBottomSheetActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert_core/offers/offer_bottomsheet/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LJ9/a;", "LJ9/b;", "Lcom/avito/android/advert_core/offers/offer_bottomsheet/mvi/entity/OfferBottomSheetState;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements com.avito.android.arch.mvi.a<J9.a, J9.b, OfferBottomSheetState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final OfferOpenParams f83892a;

    @Inject
    public a(@Y61.k OfferOpenParams offerOpenParams) {
        this.f83892a = offerOpenParams;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<J9.b> b(J9.a aVar, OfferBottomSheetState offerBottomSheetState) {
        J9.a aVar2 = aVar;
        if (aVar2 instanceof a.C0508a) {
            return new C43210w(new b.C0509b(((a.C0508a) aVar2).f8804a));
        }
        if (aVar2 instanceof a.b) {
            return new C43210w(new b.a(this.f83892a, ((a.b) aVar2).f8805a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
