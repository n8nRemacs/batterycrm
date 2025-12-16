package JX;

import com.avito.android.main_start_onboarding.MainStartOnboardingStep;
import com.avito.android.permissions.PermissionState;
import com.avito.android.permissions.z;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MainStartOnboardingLocationPermissionChecker.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJX/f;", "LJX/e;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final z f9016a;

    @Inject
    public f(@Y61.k z zVar) {
        this.f9016a = zVar;
    }

    @Override // JX.e
    @Y61.l
    public final MainStartOnboardingStep.LocationPermission a() {
        z zVar = this.f9016a;
        if (!zVar.b("android.permission.ACCESS_FINE_LOCATION").c() && !zVar.b("android.permission.ACCESS_COARSE_LOCATION").c()) {
            return null;
        }
        PermissionState permissionStateB = zVar.b("android.permission.ACCESS_FINE_LOCATION");
        PermissionState permissionState = PermissionState.f215106d;
        if (permissionStateB == permissionState && zVar.b("android.permission.ACCESS_COARSE_LOCATION") == permissionState) {
            return null;
        }
        return MainStartOnboardingStep.LocationPermission.f184216b;
    }
}
