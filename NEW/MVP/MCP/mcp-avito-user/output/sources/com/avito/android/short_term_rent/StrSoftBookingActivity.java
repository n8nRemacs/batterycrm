package com.avito.android.short_term_rent;

import android.os.Bundle;
import androidx.core.os.C22777e;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.short_term_rent.soft_booking.StrSoftBookingFragment;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: StrSoftBookingActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/short_term_rent/StrSoftBookingActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StrSoftBookingActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.soft_booking_activity);
        if (bundle == null) {
            String stringExtra = getIntent().getStringExtra("advert_id");
            if (stringExtra == null) {
                throw new IllegalStateException("advertId is null");
            }
            String stringExtra2 = getIntent().getStringExtra(SearchParamsConverterKt.SOURCE);
            if (stringExtra2 == null) {
                throw new IllegalStateException("source is null");
            }
            String stringExtra3 = getIntent().getStringExtra("check_in_date");
            String stringExtra4 = getIntent().getStringExtra("check_out_date");
            int intExtra = getIntent().getIntExtra("guest_count", 2);
            String stringExtra5 = getIntent().getStringExtra("guests_detailed");
            boolean booleanExtra = getIntent().getBooleanExtra("is_children", false);
            String stringExtra6 = getIntent().getStringExtra("x_hash");
            boolean booleanExtra2 = getIntent().getBooleanExtra("no_refund", false);
            String stringExtra7 = getIntent().getStringExtra("payment_type");
            String stringExtra8 = getIntent().getStringExtra("from_page");
            new StrSoftBookingFragment.b();
            Boolean boolValueOf = Boolean.valueOf(booleanExtra2);
            StrSoftBookingFragment strSoftBookingFragment = new StrSoftBookingFragment();
            strSoftBookingFragment.setArguments(C22777e.b(new Q("advert_id", stringExtra), new Q(SearchParamsConverterKt.SOURCE, stringExtra2), new Q("guest_count", Integer.valueOf(intExtra)), new Q("check_in_date", stringExtra3), new Q("check_out_date", stringExtra4), new Q("guests_detailed", stringExtra5), new Q("is_children", Boolean.valueOf(booleanExtra)), new Q("x_hash", stringExtra6), new Q("no_refund", boolValueOf), new Q("payment_type", stringExtra7), new Q("from_page", stringExtra8)));
            H hE2 = getSupportFragmentManager().e();
            hE2.j(R.id.fragment_container, strSoftBookingFragment, null, 1);
            hE2.e();
        }
    }
}
