package com.avito.android.str_seller_orders.strsellerordersrange;

import Ez0.b;
import Y61.k;
import android.app.Application;
import android.content.Intent;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrSellerOrdersRangeIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersrange/a;", "LEz0/b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f290207a;

    @Inject
    public a(@k Application application) {
        this.f290207a = application;
    }

    @Override // Ez0.b
    @k
    public final Intent a(@k String str, @k String str2, @k String str3) {
        StrSellerOrdersRangeActivity.f290206m.getClass();
        Intent intent = new Intent(this.f290207a, (Class<?>) StrSellerOrdersRangeActivity.class);
        intent.putExtra("start_date_param", str);
        intent.putExtra("end_date_param", str2);
        intent.putExtra("item_id_param", str3);
        return intent;
    }
}
