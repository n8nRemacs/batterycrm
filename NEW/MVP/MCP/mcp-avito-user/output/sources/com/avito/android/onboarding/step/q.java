package com.avito.android.onboarding.step;

import com.avito.android.iac_util_deeplinks.public_module.permission_request.PermissionRequestSystemPopupLink;
import com.avito.android.onboarding.model.BxOnboardingStep;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.s0;

/* compiled from: BxOnboardingNotificationStepInteractorImpl.kt */
@s0
@com.avito.android.onboarding.B
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/step/q;", "Lcom/avito/android/onboarding/E;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class q implements com.avito.android.onboarding.E {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.permissions.G f209224a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final P30.a f209225b;

    @Inject
    public q(@Y61.k com.avito.android.permissions.G g12, @Y61.k P30.a aVar) {
        this.f209224a = g12;
        this.f209225b = aVar;
    }

    @Override // com.avito.android.onboarding.E
    @Y61.l
    public final Object b(@Y61.k ContinuationImpl continuationImpl) {
        P30.a aVar = this.f209225b;
        String strB = aVar.b();
        if (strB == null) {
            return null;
        }
        if (this.f209224a.j(strB) || aVar.a()) {
            strB = null;
        }
        if (strB == null) {
            return null;
        }
        return new BxOnboardingStep.NotificationPermission(new PermissionRequestSystemPopupLink(Collections.singletonList(strB), null, null, null, null, null, 62, null));
    }

    @Override // com.avito.android.onboarding.E
    @Y61.l
    public final BxOnboardingStep a(@Y61.k BxOnboardingStep bxOnboardingStep) {
        return bxOnboardingStep;
    }
}
