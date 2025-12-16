package K40;

import Y61.k;
import com.avito.android.onboarding_manager.onboarding_priority.OnboardingStatus;
import com.avito.android.remote.model.PresentationType;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BxContentOnboardingPriorityInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LK40/c;", "LK40/b;", "_avito_onboarding-manager_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c extends b {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final PresentationType f9259e;

    @Inject
    public c(@k com.avito.android.onboarding_manager.f fVar, @k PresentationType presentationType) {
        super(fVar);
        this.f9259e = presentationType;
    }

    @Override // K40.b
    public final boolean e(@k String str, boolean z12) {
        PresentationType presentationType = this.f9259e;
        if (presentationType.isMain()) {
            return z12;
        }
        if (presentationType.isSerp() || presentationType.isFullMap()) {
            b.f9257c.getClass();
            if (!b.f9258d.contains(str)) {
                return d();
            }
            HashMap map = this.f9256b;
            Object obj = map.get("bottom_sheet_onboarding");
            OnboardingStatus onboardingStatus = OnboardingStatus.f209447c;
            boolean z13 = obj == onboardingStatus;
            boolean z14 = map.get(str) == onboardingStatus;
            if (z13 && !z14 && z12) {
                return true;
            }
        }
        return false;
    }
}
