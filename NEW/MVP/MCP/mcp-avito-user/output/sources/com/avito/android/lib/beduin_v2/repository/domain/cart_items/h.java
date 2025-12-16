package com.avito.android.lib.beduin_v2.repository.domain.cart_items;

import com.avito.android.lib.beduin_v2.repository.domain.cart_items.model.CartItemInfo;
import kotlin.Metadata;
import kotlin.Q;
import kotlinx.coroutines.flow.InterfaceC43160i;
import rU.C47595a;

/* compiled from: CartStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/domain/cart_items/h;", "", "_design-modules_beduin-v2_interactions_repository_domain_cart-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface h {
    @Y61.k
    InterfaceC43160i<Q<String, CartItemInfo>> a();

    void b(@Y61.k String str, @Y61.k CartItemInfo cartItemInfo);

    void c(@Y61.k C47595a c47595a);

    void clear();

    @Y61.l
    CartItemInfo get(@Y61.k String str);

    void remove(@Y61.k String str);
}
