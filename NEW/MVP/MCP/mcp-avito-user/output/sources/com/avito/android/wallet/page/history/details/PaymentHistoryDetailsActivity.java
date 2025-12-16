package com.avito.android.wallet.page.history.details;

import Ae0.c;
import Y61.l;
import android.os.Bundle;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.ui.activity.a;
import com.avito.android.wallet.page.history.details.mvi.PaymentHistoryDetailsFragment;
import com.avito.android.wallet.page.history.details.mvi.PaymentHistoryDetailsOpenParams;
import kotlin.Metadata;

/* compiled from: PaymentHistoryDetailsActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/wallet/page/history/details/PaymentHistoryDetailsActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentHistoryDetailsActivity extends a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f327833m = 0;

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        getSupportFragmentManager().p0("PAYMENT_DETAILS_FRAGMENT_REQUEST_KEY", this, new c(this, 5));
        if (bundle == null) {
            String stringExtra = getIntent().getStringExtra("EXTRA_PAYMENT_DETAILS_ID");
            if (stringExtra == null) {
                stringExtra = "";
            }
            PaymentHistoryDetailsFragment.f327856q0.getClass();
            PaymentHistoryDetailsFragment paymentHistoryDetailsFragment = new PaymentHistoryDetailsFragment();
            PaymentHistoryDetailsOpenParams paymentHistoryDetailsOpenParams = new PaymentHistoryDetailsOpenParams(stringExtra);
            paymentHistoryDetailsFragment.f327864n0.setValue(paymentHistoryDetailsFragment, PaymentHistoryDetailsFragment.f327857r0[0], paymentHistoryDetailsOpenParams);
            paymentHistoryDetailsFragment.show(getSupportFragmentManager(), (String) null);
        }
    }
}
