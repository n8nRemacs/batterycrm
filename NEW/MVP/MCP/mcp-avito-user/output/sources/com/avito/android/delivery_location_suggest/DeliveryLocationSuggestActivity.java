package com.avito.android.delivery_location_suggest;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.util.C35966w1;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DeliveryLocationSuggestActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/delivery_location_suggest/DeliveryLocationSuggestActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryLocationSuggestActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {
    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        com.avito.android.delivery_location_suggest.di.activity.a.a().a((com.avito.android.delivery_location_suggest.di.activity.c) C29972i.a(C29972i.b(this), com.avito.android.delivery_location_suggest.di.activity.c.class));
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        finish();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.delivery_activity_location_suggest);
        if (bundle == null) {
            Intent intent = getIntent();
            DeliveryLocationSuggestParams deliveryLocationSuggestParams = (DeliveryLocationSuggestParams) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("extra_params", DeliveryLocationSuggestParams.class) : intent.getParcelableExtra("extra_params"));
            if (deliveryLocationSuggestParams == null) {
                throw new IllegalArgumentException("Params not found");
            }
            H hE2 = getSupportFragmentManager().e();
            DeliveryLocationSuggestFragment.f135018v0.getClass();
            DeliveryLocationSuggestFragment deliveryLocationSuggestFragment = new DeliveryLocationSuggestFragment();
            C35966w1.a(deliveryLocationSuggestFragment, -1, new c(deliveryLocationSuggestParams));
            hE2.j(R.id.fragment_container, deliveryLocationSuggestFragment, null, 1);
            hE2.c(null);
            hE2.e();
        }
    }
}
