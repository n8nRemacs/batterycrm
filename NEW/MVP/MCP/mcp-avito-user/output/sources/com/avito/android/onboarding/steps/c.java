package com.avito.android.onboarding.steps;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.OnboardingStepsLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: OnboardingStepsDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/onboarding/steps/c;", "Lev/b;", "Lcom/avito/android/deep_linking/links/OnboardingStepsLink;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c extends AbstractC40162b<OnboardingStepsLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final h f209280d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f209281e;

    @Inject
    public c(@Y61.k h hVar, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f209280d = hVar;
        this.f209281e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        OnboardingStepsLink onboardingStepsLink = (OnboardingStepsLink) deepLink;
        OnboardingStepsLink.Arguments.f133523c.getClass();
        this.f209281e.R(this.f209280d.a(onboardingStepsLink.f133521b, onboardingStepsLink.f133522c, bundle != null ? (OnboardingStepsLink.Arguments) bundle.getParcelable("onboarding_steps_argument_key") : null), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
