package com.avito.android.advert_details_items.sellerprofile;

import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertSeller;
import com.avito.android.remote.model.service_seller_type.Onboarding;
import com.avito.android.remote.model.service_seller_type.ServiceSellerType;
import kotlin.Metadata;

/* compiled from: AdvertSellerPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "targetViewId", "Lkotlin/G0;", "accept", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert_details_items.sellerprofile.t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28289t<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f85644b;

    public C28289t(D d12) {
        this.f85644b = d12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        AdvertSeller seller;
        ServiceSellerType sellerType;
        Onboarding onboarding;
        a0 a0Var;
        int iIntValue = ((Number) obj).intValue();
        D d12 = this.f85644b;
        AdvertDetails advertDetails = d12.f85554l;
        if (advertDetails == null || (seller = advertDetails.getSeller()) == null || (sellerType = seller.getSellerType()) == null || (onboarding = sellerType.getOnboarding()) == null || (a0Var = d12.f85553k) == null) {
            return;
        }
        a0Var.b(iIntValue, onboarding);
    }
}
