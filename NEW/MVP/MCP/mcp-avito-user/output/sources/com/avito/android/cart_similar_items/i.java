package com.avito.android.cart_similar_items;

import android.content.Context;
import android.content.Intent;
import com.avito.android.cart_similar_items.model.CartSimilarItemsArguments;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CartSimilarItemsIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_similar_items/i;", "Lcom/avito/android/cart_similar_items/h;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f115808a;

    @Inject
    public i(@Y61.k Context context) {
        this.f115808a = context;
    }

    @Override // com.avito.android.cart_similar_items.h
    @Y61.k
    public final Intent a(@Y61.k ScreenStyle screenStyle, @Y61.k String str, @Y61.k String str2, @Y61.l Map<String, ? extends Object> map) {
        CartSimilarItemsArguments cartSimilarItemsArguments = new CartSimilarItemsArguments(screenStyle, str, str2, map, null, 16, null);
        CartSimilarItemsActivity.f115665m.getClass();
        return new Intent(this.f115808a, (Class<?>) CartSimilarItemsActivity.class).putExtra("promotionData", cartSimilarItemsArguments);
    }
}
