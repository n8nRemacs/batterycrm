package com.avito.android.seller_promotions.mvi;

import Oq0.f;
import com.avito.android.R;
import com.avito.android.beduin_shared.model.transform.LocalParameterTransform;
import com.avito.android.remote.error.ApiError;
import com.avito.android.seller_promotions.mvi.entity.SellerPromotionsInternalAction;
import java.io.Serializable;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import lj.d;

/* compiled from: SellerPromotionsOneTimeEventProducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/F;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "LOq0/f;", "<init>", "()V", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class F implements com.avito.android.arch.mvi.t<SellerPromotionsInternalAction, Oq0.f> {
    @Inject
    public F() {
    }

    public static f.a a(boolean z12) {
        return new f.a(new d.e(Collections.singletonMap("loadingParameters", Collections.singletonList(new LocalParameterTransform("isLoading", Boolean.valueOf(z12))))));
    }

    @Override // com.avito.android.arch.mvi.t
    public final Oq0.f b(SellerPromotionsInternalAction sellerPromotionsInternalAction) {
        Oq0.f iVar;
        SellerPromotionsInternalAction sellerPromotionsInternalAction2 = sellerPromotionsInternalAction;
        if (sellerPromotionsInternalAction2.equals(SellerPromotionsInternalAction.CloseScreen.f267960b)) {
            return f.b.f12593a;
        }
        if (sellerPromotionsInternalAction2 instanceof SellerPromotionsInternalAction.OpenDeepLink) {
            iVar = new f.e(((SellerPromotionsInternalAction.OpenDeepLink) sellerPromotionsInternalAction2).f267971b, null, null, 6, null);
        } else if (sellerPromotionsInternalAction2 instanceof SellerPromotionsInternalAction.OpenAdvertDetails) {
            SellerPromotionsInternalAction.OpenAdvertDetails openAdvertDetails = (SellerPromotionsInternalAction.OpenAdvertDetails) sellerPromotionsInternalAction2;
            iVar = new f.d(openAdvertDetails.f267967b, openAdvertDetails.f267968c, openAdvertDetails.f267969d, openAdvertDetails.f267970e);
        } else if (sellerPromotionsInternalAction2 instanceof SellerPromotionsInternalAction.PageLoadingError) {
            ApiError apiError = ((SellerPromotionsInternalAction.PageLoadingError) sellerPromotionsInternalAction2).f267974b;
            iVar = new f.h(com.avito.android.printable_text.b.f(com.avito.android.error.z.k(apiError)), apiError);
        } else if (sellerPromotionsInternalAction2 instanceof SellerPromotionsInternalAction.HandleBeduinActions) {
            iVar = new f.c(((SellerPromotionsInternalAction.HandleBeduinActions) sellerPromotionsInternalAction2).f267963b);
        } else if (sellerPromotionsInternalAction2 instanceof SellerPromotionsInternalAction.BeduinFormLoaded) {
            SellerPromotionsInternalAction.BeduinFormLoaded beduinFormLoaded = (SellerPromotionsInternalAction.BeduinFormLoaded) sellerPromotionsInternalAction2;
            iVar = new f.C0812f(beduinFormLoaded.f267955b, beduinFormLoaded.f267956c, beduinFormLoaded.f267957d);
        } else {
            if (!(sellerPromotionsInternalAction2 instanceof SellerPromotionsInternalAction.UpdateCartIconQuantity)) {
                if (sellerPromotionsInternalAction2 instanceof SellerPromotionsInternalAction.UpdatePromotionConditionLoading) {
                    return a(((SellerPromotionsInternalAction.UpdatePromotionConditionLoading) sellerPromotionsInternalAction2).f267990d);
                }
                if (sellerPromotionsInternalAction2 instanceof SellerPromotionsInternalAction.UpdatePromotionConditionError) {
                    ApiError apiError2 = ((SellerPromotionsInternalAction.UpdatePromotionConditionError) sellerPromotionsInternalAction2).f267987b;
                    String strI = com.avito.android.error.z.i(apiError2);
                    return new f.g(apiError2, strI != null ? com.avito.android.printable_text.b.f(strI) : com.avito.android.printable_text.b.c(R.string.update_cart_items_error, new Serializable[0]), new f.g.a(com.avito.android.printable_text.b.c(R.string.seller_promotions_update_promotion_condition_error_button_text, new Serializable[0]), E.f267922l), false, 8, null);
                }
                if (sellerPromotionsInternalAction2 instanceof SellerPromotionsInternalAction.UpdatePromotionItemsLoading) {
                    return a(((SellerPromotionsInternalAction.UpdatePromotionItemsLoading) sellerPromotionsInternalAction2).f267992d);
                }
                if (!(sellerPromotionsInternalAction2 instanceof SellerPromotionsInternalAction.UpdatePromotionsItemsError)) {
                    return null;
                }
                ApiError apiError3 = ((SellerPromotionsInternalAction.UpdatePromotionsItemsError) sellerPromotionsInternalAction2).f267994b;
                String strI2 = com.avito.android.error.z.i(apiError3);
                return new f.g(apiError3, strI2 != null ? com.avito.android.printable_text.b.f(strI2) : com.avito.android.printable_text.b.c(R.string.update_cart_items_error, new Serializable[0]), null, true, 4, null);
            }
            iVar = new f.i(((SellerPromotionsInternalAction.UpdateCartIconQuantity) sellerPromotionsInternalAction2).f267982b);
        }
        return iVar;
    }
}
