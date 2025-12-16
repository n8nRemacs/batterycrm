package com.avito.android.delivery_location_suggest.di;

import Gv.InterfaceC13920a;
import Y41.l;
import Y61.k;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.delivery_location_suggest.DeliveryLocationSuggestFragment;
import com.avito.android.delivery_location_suggest.DeliveryLocationSuggestParams;
import com.avito.android.di.B;
import h31.d;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DeliveryLocationSuggestComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/delivery_location_suggest/di/d;", "", "a", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes12.dex */
public interface d {

    /* compiled from: DeliveryLocationSuggestComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_location_suggest/di/d$a;", "", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        d a(@h31.b @k DeliveryLocationSuggestParams deliveryLocationSuggestParams, @h31.b @k C28478k c28478k, @h31.b @k l<? super InterfaceC13920a, G0> lVar, @k e eVar);
    }

    void a(@k DeliveryLocationSuggestFragment deliveryLocationSuggestFragment);
}
