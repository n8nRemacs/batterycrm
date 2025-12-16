package com.avito.android.safety.safety_settings;

import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.safety.safety_settings.SafetySettingsFragment;
import com.avito.android.safety.safety_settings.mvi.entity.a;
import com.avito.android.safety.tfa_disable_password.TfaDisablePasswordFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SafetySettingsActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/safety/safety_settings/SafetySettingsActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SafetySettingsActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {
    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        Fragment fragmentG = getSupportFragmentManager().G(R.id.fragment_container);
        if (fragmentG instanceof TfaDisablePasswordFragment) {
            TfaDisablePasswordFragment.a aVar = TfaDisablePasswordFragment.f258071x0;
            ((TfaDisablePasswordFragment) fragmentG).s5(false);
        } else {
            Intent intent = this.f304538c;
            if (intent != null) {
                startActivity(intent);
            }
            finish();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fragment_container);
        if (bundle == null) {
            Bundle extras = getIntent().getExtras();
            String string = extras != null ? extras.getString("safety_settings_deeplink_source_param") : null;
            H hE2 = getSupportFragmentManager().e();
            SafetySettingsFragment.a aVar = SafetySettingsFragment.f257523w0;
            Intent intent = this.f304538c;
            aVar.getClass();
            SafetySettingsFragment safetySettingsFragment = new SafetySettingsFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("up_intent", intent);
            bundle2.putString("safety_settings_deeplink_source_param", string);
            safetySettingsFragment.setArguments(bundle2);
            hE2.j(R.id.fragment_container, safetySettingsFragment, "safety_settings_fragment_tag", 1);
            hE2.e();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@k Intent intent) {
        super.onNewIntent(intent);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            Boolean boolValueOf = extras.containsKey("needed_update_param") ? Boolean.valueOf(extras.getBoolean("needed_update_param")) : null;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                return;
            }
            Fragment fragmentH = getSupportFragmentManager().H("safety_settings_fragment_tag");
            SafetySettingsFragment safetySettingsFragment = fragmentH instanceof SafetySettingsFragment ? (SafetySettingsFragment) fragmentH : null;
            if (safetySettingsFragment != null) {
                safetySettingsFragment.q5().accept(a.n.f257738a);
            }
        }
    }
}
