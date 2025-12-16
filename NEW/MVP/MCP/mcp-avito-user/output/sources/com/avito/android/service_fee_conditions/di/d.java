package com.avito.android.service_fee_conditions.di;

import com.avito.android.analytics.screens.r;
import com.avito.android.di.B;
import com.avito.android.paid_services.PaidServicesResultRepository;
import com.avito.android.service_fee_conditions.ui.ServiceFeeConditionsFragment;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: ServiceFeeConditionsComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_fee_conditions/di/d;", "", "a", "_avito_service-fee-conditions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes3.dex */
public interface d {

    /* compiled from: ServiceFeeConditionsComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_fee_conditions/di/d$a;", "", "_avito_service-fee-conditions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        d a(@h31.b @c @Y61.k String str, @com.avito.android.service_fee_conditions.di.a @h31.b boolean z12, @h31.b @Y61.k r rVar, @h31.b @Y61.k PaidServicesResultRepository paidServicesResultRepository, @Y61.k g gVar, @Y61.k InterfaceC39417a interfaceC39417a);
    }

    void a(@Y61.k ServiceFeeConditionsFragment serviceFeeConditionsFragment);
}
