package com.avito.android.safedeal_checkout.delivery_universal_checkout;

import android.os.Bundle;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.DeliveryUniversalCheckoutFragment;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.model.DeliveryUniversalCheckoutData;
import com.avito.android.util.C35966w1;
import kotlin.Metadata;

/* compiled from: DeliveryUniversalCheckoutActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/DeliveryUniversalCheckoutActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeliveryUniversalCheckoutActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {
    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.delivery_universal_checkout_activity;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            DeliveryUniversalCheckoutData deliveryUniversalCheckoutData = (DeliveryUniversalCheckoutData) getIntent().getParcelableExtra("initial_data");
            DeliveryUniversalCheckoutFragment.a aVar = DeliveryUniversalCheckoutFragment.f256862L0;
            if (deliveryUniversalCheckoutData == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            aVar.getClass();
            DeliveryUniversalCheckoutFragment deliveryUniversalCheckoutFragment = new DeliveryUniversalCheckoutFragment();
            C35966w1.a(deliveryUniversalCheckoutFragment, -1, new f(deliveryUniversalCheckoutData));
            H hE2 = getSupportFragmentManager().e();
            hE2.j(R.id.fragment_container, deliveryUniversalCheckoutFragment, null, 1);
            hE2.e();
        }
    }
}
