package com.avito.android.advert_core.development_offers;

import Y41.l;
import com.avito.android.advert.item.AdvertDetailsFragment;
import com.avito.android.advert.item.Z0;
import com.avito.android.advert_core.development_offers.carousel_bottomsheet.DevelopmentOffersBottomSheetDialog;
import com.avito.android.remote.model.DevelopmentOffers;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DevelopmentOffersItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "clickedPosition", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class g extends N implements l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f83331l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DevelopmentOffersItem f83332m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, DevelopmentOffersItem developmentOffersItem) {
        super(1);
        this.f83331l = hVar;
        this.f83332m = developmentOffersItem;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        Z0 z02 = this.f83331l.f83335d;
        if (z02 != null) {
            DevelopmentOffersItem developmentOffersItem = this.f83332m;
            DevelopmentOffers developmentOffers = developmentOffersItem.f83280b;
            Integer id2 = iIntValue != -1 ? developmentOffers.getOffers().get(iIntValue).getId() : null;
            com.avito.android.advert_core.analytics.a aVar = z02.f72293B;
            if (aVar != null) {
                aVar.F(id2);
            }
            AdvertDetailsFragment advertDetailsFragment = z02.f72298c;
            if (advertDetailsFragment.getContext() != null) {
                if (iIntValue == -1) {
                    iIntValue = 0;
                }
                new DevelopmentOffersBottomSheetDialog(z02, developmentOffers, iIntValue, developmentOffersItem.f83281c, z02.f72293B, developmentOffersItem.f83287i).show(advertDetailsFragment.getChildFragmentManager(), "DevelopmentOffersBottomSheetDialog");
            }
        }
        return G0.f406611a;
    }
}
