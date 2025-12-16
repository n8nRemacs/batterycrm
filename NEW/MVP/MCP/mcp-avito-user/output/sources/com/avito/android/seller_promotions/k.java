package com.avito.android.seller_promotions;

import android.content.Context;
import android.content.Intent;
import com.avito.android.seller_promotions.model.SellerPromotionsArguments;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SellerPromotionsIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_promotions/k;", "Lcom/avito/android/seller_promotions/j;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f267758a;

    @Inject
    public k(@Y61.k Context context) {
        this.f267758a = context;
    }

    @Override // com.avito.android.seller_promotions.j
    @Y61.k
    public final Intent a(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.l String str5, @Y61.l Map<String, ? extends Object> map) {
        SellerPromotionsArguments sellerPromotionsArguments = new SellerPromotionsArguments(str, str2, str3, str4, str5, map, null, 64, null);
        SellerPromotionsActivity.f267622m.getClass();
        return new Intent(this.f267758a, (Class<?>) SellerPromotionsActivity.class).putExtra("promotionData", sellerPromotionsArguments);
    }
}
