package com.avito.android.email.email_confirmation;

import Y61.l;
import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import kotlin.Metadata;

/* compiled from: EmailConfirmationActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/email/email_confirmation/EmailConfirmationActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"NonComposeScreen"})
/* loaded from: classes13.dex */
public final class EmailConfirmationActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {
    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.email_confirmation_activity_layout;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            boolean booleanExtra = getIntent().getBooleanExtra("update_existed_key", false);
            String stringExtra = getIntent().getStringExtra("confirmation_code_key");
            if (stringExtra == null) {
                stringExtra = "";
            }
            H hE2 = getSupportFragmentManager().e();
            EmailConfirmationFragment.f147077r0.getClass();
            EmailConfirmationFragment emailConfirmationFragment = new EmailConfirmationFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("update_existed_key", booleanExtra);
            bundle2.putString("confirmation_code_key", stringExtra);
            emailConfirmationFragment.setArguments(bundle2);
            hE2.j(R.id.email_confirmation_activity_container, emailConfirmationFragment, "email_confirmation", 1);
            hE2.e();
        }
    }
}
