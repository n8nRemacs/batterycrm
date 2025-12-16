package G40;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.onboarding.steps.analytics.OnboardingStepsAnalyticsParams;
import com.avito.android.remote.model.OnboardingStep;
import com.avito.android.util.C35755b0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: OnboardingStepsEventTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LG40/d;", "LG40/c;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f6284a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final OnboardingStepsAnalyticsParams f6285b;

    @Inject
    public d(@k InterfaceC28373a interfaceC28373a, @k OnboardingStepsAnalyticsParams onboardingStepsAnalyticsParams) {
        this.f6284a = interfaceC28373a;
        this.f6285b = onboardingStepsAnalyticsParams;
    }

    @Override // G40.c
    public final void a(@l String str) {
        this.f6284a.c(new b(C35755b0.c(P0.g(new Q("esid", this.f6285b.f209279b), new Q("from_page", str)))));
    }

    @Override // G40.c
    public final void b(@k OnboardingStep.Event event) {
        this.f6284a.c(new a(event.getEventId(), event.getVersion(), event.getParams()));
    }
}
