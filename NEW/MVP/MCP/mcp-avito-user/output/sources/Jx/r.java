package JX;

import com.avito.android.main_start_onboarding.MainStartOnboardingStep;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MainStartOnboardingReplaceMainExitChecker.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJX/r;", "LJX/q;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.replace_main.exit_onboarding.b f9024a;

    @Inject
    public r(@Y61.k com.avito.android.replace_main.exit_onboarding.b bVar) {
        this.f9024a = bVar;
    }

    @Override // JX.q
    @Y61.l
    public final MainStartOnboardingStep.ReplaceMainExitOnboarding a() {
        if (this.f9024a.a()) {
            return MainStartOnboardingStep.ReplaceMainExitOnboarding.f184222b;
        }
        return null;
    }
}
