package com.avito.android.advert_core.offers;

import Y41.l;
import com.avito.android.advert.item.AdvertDetailsFragment;
import com.avito.android.advert.item.Z0;
import com.avito.android.advert_core.offers.items.OfferItem;
import com.avito.android.advert_core.offers.offer_bottomsheet.OfferBottomSheetDialog;
import com.avito.android.advert_core.offers.offer_bottomsheet.OfferOpenParams;
import com.avito.android.remote.model.Offers;
import com.avito.android.remote.model.OffersPhoneParameters;
import com.avito.android.remote.model.SimpleAdvertAction;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: OffersItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "clickedPosition", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f83814l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ OffersItem f83815m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, OffersItem offersItem) {
        super(1);
        this.f83814l = eVar;
        this.f83815m = offersItem;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        Z0 z02 = this.f83814l.f83816b;
        if (z02 != null) {
            OffersItem offersItem = this.f83815m;
            List<OfferItem> list = offersItem.f83795c;
            String title = iIntValue != -1 ? list.get(iIntValue).getF83828c() : null;
            com.avito.android.advert_core.analytics.a aVar = z02.f72293B;
            if (aVar != null) {
                aVar.W5(title);
            }
            AdvertDetailsFragment advertDetailsFragment = z02.f72298c;
            if (advertDetailsFragment.getContext() != null) {
                Offers offers = offersItem.f83794b;
                OffersPhoneParameters offersPhoneParameters = offers.getOffersPhoneParameters();
                if (iIntValue == -1) {
                    iIntValue = 0;
                }
                SimpleAdvertAction offersPhoneUri = offers.getOffersPhoneUri();
                OfferBottomSheetDialog offerBottomSheetDialog = new OfferBottomSheetDialog();
                offerBottomSheetDialog.f83846h0.setValue(offerBottomSheetDialog, OfferBottomSheetDialog.f83845k0[0], new OfferOpenParams(offersPhoneParameters, list, iIntValue, offersPhoneUri));
                offerBottomSheetDialog.show(advertDetailsFragment.getParentFragmentManager(), "OffersBottomSheetDialog");
            }
        }
        return G0.f406611a;
    }
}
