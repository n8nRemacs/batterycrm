package com.avito.android.authorization.upgrade_password;

import android.os.Bundle;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.util.C35966w1;
import kotlin.Metadata;

/* compiled from: UpgradePasswordActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/authorization/upgrade_password/UpgradePasswordActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UpgradePasswordActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        UpgradePasswordArguments upgradePasswordArguments;
        super.onCreate(bundle);
        setContentView(R.layout.fragment_container);
        if (bundle == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null || (upgradePasswordArguments = (UpgradePasswordArguments) extras.getParcelable("extra_args")) == null) {
                throw new IllegalArgumentException("Arguments must be specified");
            }
            UpgradePasswordFragment.f94767q0.getClass();
            UpgradePasswordFragment upgradePasswordFragment = new UpgradePasswordFragment();
            C35966w1.a(upgradePasswordFragment, -1, new C28692b(upgradePasswordArguments));
            H hE2 = getSupportFragmentManager().e();
            hE2.j(R.id.fragment_container, upgradePasswordFragment, "upgrade_password_tag", 1);
            hE2.e();
        }
    }
}
