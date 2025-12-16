package com.avito.android.str_seller_orders.strsellerorders;

import android.app.Application;
import android.content.Intent;
import com.avito.android.str_seller_orders.strsellerorders.StrSellerOrdersIntentFactory;
import com.avito.android.util.C35961v3;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: StrSellerOrdersIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/g;", "Lcom/avito/android/str_seller_orders/strsellerorders/StrSellerOrdersIntentFactory;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements StrSellerOrdersIntentFactory {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f289813a;

    /* compiled from: StrSellerOrdersIntentFactoryImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[StrSellerOrdersIntentFactory.InitialTab.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                StrSellerOrdersIntentFactory.InitialTab initialTab = StrSellerOrdersIntentFactory.InitialTab.f289693b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public g(@Y61.k Application application) {
        this.f289813a = application;
    }

    @Override // com.avito.android.str_seller_orders.strsellerorders.StrSellerOrdersIntentFactory
    @Y61.k
    public final Intent a(@Y61.k StrSellerOrdersIntentFactory.ScreenState screenState, @Y61.k Map<String, String> map) {
        String str;
        if (screenState instanceof StrSellerOrdersIntentFactory.ScreenState.SinglePage.Seller) {
            str = "extra_screen_state_value_single_seller";
        } else if (screenState instanceof StrSellerOrdersIntentFactory.ScreenState.SinglePage.Buyer) {
            str = "extra_screen_state_value_single_buyer";
        } else {
            if (!(screenState instanceof StrSellerOrdersIntentFactory.ScreenState.TabsPages)) {
                throw new NoWhenBranchMatchedException();
            }
            int iOrdinal = ((StrSellerOrdersIntentFactory.ScreenState.TabsPages) screenState).f289699b.ordinal();
            if (iOrdinal == 0) {
                str = "extra_screen_state_value_tabs_seller";
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "extra_screen_state_value_tabs_buyer";
            }
        }
        StrSellerOrdersOpenParams strSellerOrdersOpenParams = new StrSellerOrdersOpenParams(str, map);
        StrSellerOrdersActivity.f289651o.getClass();
        Intent intent = new Intent(this.f289813a, (Class<?>) StrSellerOrdersActivity.class);
        C35961v3.b(intent, strSellerOrdersOpenParams);
        return intent;
    }
}
