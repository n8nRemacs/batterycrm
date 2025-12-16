package com.avito.android.safety.password_change;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.safety.password_change.PasswordChangeFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PasswordChangeActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/safety/password_change/PasswordChangeActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PasswordChangeActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {
    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        Intent intent = this.f304538c;
        if (intent != null) {
            startActivity(intent);
        }
        finish();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        PasswordChangeParams passwordChangeParams;
        super.onCreate(bundle);
        setContentView(R.layout.fragment_container);
        if (bundle == null) {
            PasswordChangeFragment.a aVar = PasswordChangeFragment.f257203H0;
            Bundle extras = getIntent().getExtras();
            Intent intent = null;
            if (extras != null) {
                passwordChangeParams = (PasswordChangeParams) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras.getParcelable("extra_params", PasswordChangeParams.class) : extras.getParcelable("extra_params"));
            } else {
                passwordChangeParams = null;
            }
            Bundle extras2 = getIntent().getExtras();
            if (extras2 != null) {
                intent = (Intent) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras2.getParcelable("up_intent", Intent.class) : extras2.getParcelable("up_intent"));
            }
            aVar.getClass();
            PasswordChangeFragment passwordChangeFragment = new PasswordChangeFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("params", passwordChangeParams);
            bundle2.putParcelable("up_intent", intent);
            passwordChangeFragment.setArguments(bundle2);
            H hE2 = getSupportFragmentManager().e();
            hE2.j(R.id.fragment_container, passwordChangeFragment, "change_password_tag", 1);
            hE2.e();
        }
    }
}
