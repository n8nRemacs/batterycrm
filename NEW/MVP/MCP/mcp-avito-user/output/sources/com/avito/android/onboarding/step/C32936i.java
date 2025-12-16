package com.avito.android.onboarding.step;

import com.avito.android.onboarding.model.BxOnboardingStep;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.s0;

/* compiled from: BxOnboardingLocationStepInteractorImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/step/i;", "Lcom/avito/android/onboarding/E;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@com.avito.android.onboarding.x
/* renamed from: com.avito.android.onboarding.step.i, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32936i implements com.avito.android.onboarding.E {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.permissions.z f209217a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<String> f209218b = C42745f0.U("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");

    @Inject
    public C32936i(@Y61.k com.avito.android.permissions.z zVar) {
        this.f209217a = zVar;
    }

    @Override // com.avito.android.onboarding.E
    @Y61.l
    public final Object b(@Y61.k ContinuationImpl continuationImpl) {
        List<String> list = this.f209218b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.L.f(this.f209217a.b((String) it.next()).a(), Boolean.TRUE)) {
                    return BxOnboardingStep.View.LocationPermission.f209128d;
                }
            }
        }
        return null;
    }

    @Override // com.avito.android.onboarding.E
    @Y61.l
    public final BxOnboardingStep a(@Y61.k BxOnboardingStep bxOnboardingStep) {
        return bxOnboardingStep;
    }
}
