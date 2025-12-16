package K40;

import Y61.k;
import com.avito.android.onboarding_manager.OnboardingType;
import kotlin.Metadata;

/* compiled from: FavoritesOnboardingPriorityInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LK40/e;", "LK40/a;", "_avito_onboarding-manager_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e extends a {
    @Override // com.avito.android.onboarding_manager.e
    public final boolean b(@k String str, @k OnboardingType onboardingType) {
        if (this.f9255a.b(str)) {
            return false;
        }
        if (onboardingType == OnboardingType.f209410c) {
            return true;
        }
        return d();
    }
}
