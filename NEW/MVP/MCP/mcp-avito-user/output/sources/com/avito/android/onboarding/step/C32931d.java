package com.avito.android.onboarding.step;

import com.avito.android.C36135w2;
import com.avito.android.onboarding.model.BxOnboardingStep;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: BxOnboardingAuthorizationStepInteractorImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/step/d;", "Lcom/avito/android/onboarding/E;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.onboarding.step.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32931d implements com.avito.android.onboarding.E {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.E f209197a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C36135w2 f209198b;

    @Inject
    public C32931d(@Y61.k com.avito.android.account.E e12, @Y61.k C36135w2 c36135w2) {
        this.f209197a = e12;
        this.f209198b = c36135w2;
    }

    @Override // com.avito.android.onboarding.E
    @Y61.l
    public final Object b(@Y61.k ContinuationImpl continuationImpl) {
        if (!this.f209197a.b()) {
            C36135w2 c36135w2 = this.f209198b;
            c36135w2.getClass();
            kotlin.reflect.n<Object> nVar = C36135w2.f327457X[33];
            if (!((Boolean) c36135w2.f327461D.a().invoke()).booleanValue()) {
                return BxOnboardingStep.View.Authorization.f209127d;
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
