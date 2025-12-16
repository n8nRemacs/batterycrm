package com.avito.android.authorization.auto_recovery;

import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.authorization.auto_recovery.factor_unavailable_reason.FactorUnavailableReasonArguments;
import com.avito.android.authorization.auto_recovery.factor_unavailable_reason.FactorUnavailableReasonFragment;
import com.avito.android.authorization.auto_recovery.recovery_availability.RecoveryAvailabilityArguments;
import com.avito.android.authorization.auto_recovery.recovery_availability.RecoveryAvailabilityFragment;
import com.avito.android.authorization.auto_recovery.require_tfa.RequireTfaArguments;
import com.avito.android.authorization.auto_recovery.require_tfa.RequireTfaFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AutoRecoveryActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/AutoRecoveryActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutoRecoveryActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f93068m = new a(null);

    /* compiled from: AutoRecoveryActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/AutoRecoveryActivity$a;", "", "<init>", "()V", "", "EXTRA_FACTOR_UNAVAILABLE_REASON_ARGS", "Ljava/lang/String;", "EXTRA_RECOVERY_AVAILABILITY_ARGS", "EXTRA_REQUIRE_TFA_ARGS", "EXTRA_SCREEN_NAME", "SCREEN_FACTOR_UNAVAILABLE_REASON", "SCREEN_RECOVERY_AVAILABILITY", "SCREEN_REQUIRE_TFA", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    public final void a2(Intent intent) {
        String stringExtra = intent.getStringExtra("automated_recovery.screen_name");
        if (stringExtra != null) {
            int iHashCode = stringExtra.hashCode();
            if (iHashCode != -1167423035) {
                if (iHashCode != 676531371) {
                    if (iHashCode == 743250393 && stringExtra.equals("automated_recovery.factor_unavailable_reason")) {
                        Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("require_tfa.availability.args", FactorUnavailableReasonArguments.class) : intent.getParcelableExtra("require_tfa.availability.args");
                        FactorUnavailableReasonFragment.f93079y0.getClass();
                        FactorUnavailableReasonFragment factorUnavailableReasonFragment = new FactorUnavailableReasonFragment();
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("phone_unavailable_reason.args", (FactorUnavailableReasonArguments) parcelableExtra);
                        factorUnavailableReasonFragment.setArguments(bundle);
                        H hE2 = getSupportFragmentManager().e();
                        hE2.n(R.id.fragment_container, factorUnavailableReasonFragment, null);
                        hE2.c(FactorUnavailableReasonFragment.class.getName());
                        hE2.e();
                        return;
                    }
                } else if (stringExtra.equals("automated_recovery.require_tfa")) {
                    Parcelable parcelableExtra2 = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("require_tfa.availability.args", RequireTfaArguments.class) : intent.getParcelableExtra("require_tfa.availability.args");
                    RequireTfaFragment.f93297w0.getClass();
                    RequireTfaFragment requireTfaFragment = new RequireTfaFragment();
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("require_tfa.args", (RequireTfaArguments) parcelableExtra2);
                    requireTfaFragment.setArguments(bundle2);
                    H hE3 = getSupportFragmentManager().e();
                    hE3.n(R.id.fragment_container, requireTfaFragment, null);
                    hE3.c(RequireTfaFragment.class.getName());
                    hE3.e();
                    return;
                }
            } else if (stringExtra.equals("automated_recovery.availability")) {
                RecoveryAvailabilityArguments recoveryAvailabilityArguments = (RecoveryAvailabilityArguments) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("automated_recovery.availability.args", RecoveryAvailabilityArguments.class) : intent.getParcelableExtra("automated_recovery.availability.args"));
                if (getSupportFragmentManager().L() >= 1) {
                    getSupportFragmentManager().a0(1, getSupportFragmentManager().K(0).getName());
                }
                RecoveryAvailabilityFragment.f93270y0.getClass();
                RecoveryAvailabilityFragment recoveryAvailabilityFragment = new RecoveryAvailabilityFragment();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("recovery_availability.args", recoveryAvailabilityArguments);
                recoveryAvailabilityFragment.setArguments(bundle3);
                H hE4 = getSupportFragmentManager().e();
                hE4.n(R.id.fragment_container, recoveryAvailabilityFragment, null);
                hE4.c(RecoveryAvailabilityFragment.class.getName());
                hE4.e();
                return;
            }
        }
        finish();
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        if (getSupportFragmentManager().L() > 1) {
            getSupportFragmentManager().Y();
        } else {
            finish();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            a2(getIntent());
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@k Intent intent) {
        super.onNewIntent(intent);
        a2(intent);
    }
}
