package com.avito.android.str_seller_orders_calendar.navigation;

import Y61.k;
import android.app.Application;
import android.content.Intent;
import com.avito.android.str_seller_orders_calendar.StrOrdersCalendarActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrSellerOrdersCalendarIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/navigation/f;", "Lcom/avito/android/str_seller_orders_calendar/navigation/e;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f290488a;

    @Inject
    public f(@k Application application) {
        this.f290488a = application;
    }

    @Override // com.avito.android.str_seller_orders_calendar.navigation.e
    @k
    public final Intent a() {
        StrOrdersCalendarActivity.f290359m.getClass();
        return new Intent(this.f290488a, (Class<?>) StrOrdersCalendarActivity.class);
    }
}
