package com.avito.android.cart_snippet_actions;

import com.avito.android.cart_recommendations.model.FromPage;
import com.avito.android.cart_recommendations.model.Srcp;
import com.avito.android.cart_snippet_actions.models.CartItemQuantityChange;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: CartActionsAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_snippet_actions/a;", "", "_avito_cart-snippet-actions_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface a {

    /* compiled from: CartActionsAnalyticsInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.cart_snippet_actions.a$a, reason: collision with other inner class name */
    public static final class C3391a {
        public static /* synthetic */ void a(a aVar, Map map, FromPage fromPage, String str, boolean z12, Map map2, int i12) {
            if ((i12 & 32) != 0) {
                map2 = null;
            }
            aVar.a(map, fromPage, str, z12, null, map2);
        }
    }

    void a(@Y61.k Map<String, ? extends List<? extends CartItemQuantityChange>> map, @Y61.k FromPage fromPage, @Y61.l String str, boolean z12, @Y61.l Srcp srcp, @Y61.l Map<String, ? extends Object> map2);
}
