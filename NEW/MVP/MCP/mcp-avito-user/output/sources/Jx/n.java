package JX;

import com.avito.android.iac_util_deeplinks.public_module.permission_request.PermissionRequestSystemPopupLink;
import com.avito.android.main_start_onboarding.MainStartOnboardingStep;
import com.avito.android.permissions.G;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MainStartOnboardingNotificationPermissionChecker.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJX/n;", "LJX/m;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final G f9020a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final P30.a f9021b;

    @Inject
    public n(@Y61.k G g12, @Y61.k P30.a aVar) {
        this.f9020a = g12;
        this.f9021b = aVar;
    }

    @Override // JX.m
    @Y61.l
    public final MainStartOnboardingStep.NotificationPermission a() {
        P30.a aVar = this.f9021b;
        String strB = aVar.b();
        if (strB == null || this.f9020a.j(strB) || aVar.a()) {
            return null;
        }
        return new MainStartOnboardingStep.NotificationPermission(new PermissionRequestSystemPopupLink(Collections.singletonList(strB), null, null, null, null, null, 62, null));
    }
}
