package JX;

import com.avito.android.iac_problems.public_module.deeplink.IacMiuiDisplayOnLockedScreenPermissionLink;
import com.avito.android.main_start_onboarding.MainStartOnboardingStep;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import nM.InterfaceC44291a;

/* compiled from: MainStartOnboardingMiuiProblemSheetChecker.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJX/j;", "LJX/i;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44291a f9018a;

    @Inject
    public j(@Y61.k InterfaceC44291a interfaceC44291a) {
        this.f9018a = interfaceC44291a;
    }

    @Override // JX.i
    @Y61.l
    public final MainStartOnboardingStep.MiuiProblemSheet a() {
        IacMiuiDisplayOnLockedScreenPermissionLink iacMiuiDisplayOnLockedScreenPermissionLinkA = this.f9018a.a();
        if (iacMiuiDisplayOnLockedScreenPermissionLinkA != null) {
            return new MainStartOnboardingStep.MiuiProblemSheet(iacMiuiDisplayOnLockedScreenPermissionLinkA);
        }
        return null;
    }

    @Override // JX.i
    public final void b() {
        this.f9018a.d();
    }
}
