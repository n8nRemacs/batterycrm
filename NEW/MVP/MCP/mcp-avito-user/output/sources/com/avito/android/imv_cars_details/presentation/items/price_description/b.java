package com.avito.android.imv_cars_details.presentation.items.price_description;

import com.avito.android.remote.imv_cars_details.models.ImvPriceDetails;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ImvCarsPriceDescriptionPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/price_description/b;", "LTV0/d;", "Lcom/avito/android/imv_cars_details/presentation/items/price_description/f;", "Lcom/avito/android/imv_cars_details/presentation/items/price_description/ImvCarsPriceDescriptionsItem;", "<init>", "()V", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements TV0.d<f, ImvCarsPriceDescriptionsItem> {
    @Inject
    public b() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        ImvCarsPriceDescriptionsItem imvCarsPriceDescriptionsItem = (ImvCarsPriceDescriptionsItem) aVar;
        ImvPriceDetails imvPriceDetails = imvCarsPriceDescriptionsItem.f170199d;
        ImvPriceDetails imvPriceDetails2 = imvCarsPriceDescriptionsItem.f170198c;
        if (imvPriceDetails2 == null && imvPriceDetails == null) {
            fVar.PS();
        } else {
            fVar.Ul();
            fVar.Ph(imvPriceDetails2, imvPriceDetails);
        }
    }
}
