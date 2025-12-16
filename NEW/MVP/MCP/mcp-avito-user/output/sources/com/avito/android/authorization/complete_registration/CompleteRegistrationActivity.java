package com.avito.android.authorization.complete_registration;

import android.os.Bundle;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.authorization.complete_registration.CompleteRegistrationFragment;
import com.avito.android.util.C35966w1;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CompleteRegistrationActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/authorization/complete_registration/CompleteRegistrationActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CompleteRegistrationActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {
    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            boolean booleanExtra = getIntent().getBooleanExtra("opened_by_register_link", false);
            H hE2 = getSupportFragmentManager().e();
            CompleteRegistrationFragment.a aVar = CompleteRegistrationFragment.f93381E0;
            String strB = Zd.f.b(this);
            String strA = Zd.f.a(this);
            aVar.getClass();
            CompleteRegistrationFragment completeRegistrationFragment = new CompleteRegistrationFragment();
            C35966w1.a(completeRegistrationFragment, -1, new c(strB, strA, booleanExtra));
            hE2.n(R.id.fragment_container, completeRegistrationFragment, null);
            hE2.e();
        }
    }
}
