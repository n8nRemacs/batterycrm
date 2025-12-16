package com.avito.android.onboarding.steps;

import android.content.Context;
import android.content.Intent;
import com.avito.android.deep_linking.links.OnboardingStepsLink;
import com.avito.android.onboarding.steps.analytics.OnboardingStepsAnalyticsParams;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: OnboardingStepsIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/steps/i;", "Lcom/avito/android/onboarding/steps/h;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f209308a;

    @Inject
    public i(@Y61.k Context context) {
        this.f209308a = context;
    }

    @Override // com.avito.android.onboarding.steps.h
    @Y61.k
    public final Intent a(@Y61.k String str, @Y61.l String str2, @Y61.l OnboardingStepsLink.Arguments arguments) {
        return new Intent(this.f209308a, (Class<?>) OnboardingStepsActivity.class).putExtra("extra_onboarding_screen_params", new OnboardingStepsScreenParams(str, str2, new OnboardingStepsAnalyticsParams(arguments != null ? arguments.f133524b : null)));
    }
}
