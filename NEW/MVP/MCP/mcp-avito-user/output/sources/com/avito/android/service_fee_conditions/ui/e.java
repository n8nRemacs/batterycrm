package com.avito.android.service_fee_conditions.ui;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.service_fee_conditions.deeplink.ServiceFeeConditionsLink;
import kotlin.Metadata;

/* compiled from: ServiceFeeConditionsFragmentFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_fee_conditions/ui/e;", "LA50/b;", "Lcom/avito/android/service_fee_conditions/deeplink/ServiceFeeConditionsLink;", "<init>", "()V", "_avito_service-fee-conditions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements A50.b<ServiceFeeConditionsLink> {
    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        ServiceFeeConditionsLink serviceFeeConditionsLink = (ServiceFeeConditionsLink) deepLink;
        ServiceFeeConditionsFragment.f278467s0.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("closable", serviceFeeConditionsLink.f278408c);
        bundle.putString("context", serviceFeeConditionsLink.f278407b);
        ServiceFeeConditionsFragment serviceFeeConditionsFragment = new ServiceFeeConditionsFragment();
        serviceFeeConditionsFragment.setArguments(bundle);
        return serviceFeeConditionsFragment;
    }
}
