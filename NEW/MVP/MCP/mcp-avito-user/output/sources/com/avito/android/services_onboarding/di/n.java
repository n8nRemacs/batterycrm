package com.avito.android.services_onboarding.di;

import android.content.Context;
import android.content.Intent;
import com.avito.android.services_onboarding.ServicesOnboardingActivity;
import com.avito.android.services_onboarding.ServicesOnboardingTarget;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServicesSteppedOnboardingIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_onboarding/di/n;", "Lcom/avito/android/services_onboarding/i;", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n implements com.avito.android.services_onboarding.i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f279865a;

    @Inject
    public n(@Y61.k Context context) {
        this.f279865a = context;
    }

    @Override // com.avito.android.services_onboarding.i
    @Y61.k
    public final Intent a(@Y61.k ServicesOnboardingTarget.Stepped stepped, @Y61.l Integer num) {
        ServicesOnboardingActivity.f279768m.getClass();
        return new Intent(this.f279865a, (Class<?>) ServicesOnboardingActivity.class).putExtra("services_onboarding_target_extra_key", stepped).putExtra("services_onboarding_step_extra_key", num);
    }
}
