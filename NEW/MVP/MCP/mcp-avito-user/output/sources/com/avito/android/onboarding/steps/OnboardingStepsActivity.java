package com.avito.android.onboarding.steps;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.util.C35966w1;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: OnboardingStepsActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/onboarding/steps/OnboardingStepsActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OnboardingStepsActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_onboarding_steps);
        if (bundle == null) {
            Intent intent = getIntent();
            OnboardingStepsScreenParams onboardingStepsScreenParams = (OnboardingStepsScreenParams) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("extra_onboarding_screen_params", OnboardingStepsScreenParams.class) : intent.getParcelableExtra("extra_onboarding_screen_params"));
            if (onboardingStepsScreenParams == null) {
                throw new IllegalStateException("OnboardingStepsScreenParams from intent must not be null");
            }
            OnboardingStepsFragment.f209259v0.getClass();
            OnboardingStepsFragment onboardingStepsFragment = new OnboardingStepsFragment();
            C35966w1.a(onboardingStepsFragment, 1, new e(onboardingStepsScreenParams));
            H hE2 = getSupportFragmentManager().e();
            hE2.j(R.id.fragment_container, onboardingStepsFragment, null, 1);
            hE2.e();
        }
    }
}
