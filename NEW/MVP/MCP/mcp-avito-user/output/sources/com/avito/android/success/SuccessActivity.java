package com.avito.android.success;

import android.os.Bundle;
import androidx.core.os.C22777e;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;

/* compiled from: SuccessActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/success/SuccessActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SuccessActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {
    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.success_activity;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            String stringExtra = getIntent().getStringExtra("success-context");
            if (stringExtra == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            SuccessFragment.f291545y0.getClass();
            SuccessFragment successFragment = new SuccessFragment();
            successFragment.setArguments(C22777e.b(new Q("success-context", stringExtra)));
            H hE2 = getSupportFragmentManager().e();
            hE2.j(R.id.fragment_container, successFragment, null, 1);
            hE2.e();
        }
    }
}
