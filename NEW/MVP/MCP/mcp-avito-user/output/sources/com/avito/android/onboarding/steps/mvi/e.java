package com.avito.android.onboarding.steps.mvi;

import H40.b;
import com.avito.android.arch.mvi.a;
import com.avito.android.onboarding.steps.mvi.entity.OnboardingStepsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: OnboardingStepsActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/onboarding/steps/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "LH40/b;", "Lcom/avito/android/onboarding/steps/mvi/entity/OnboardingStepsInternalAction;", "LH40/d;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements com.avito.android.arch.mvi.a<H40.b, OnboardingStepsInternalAction, H40.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.onboarding.steps.l f209331a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final G40.c f209332b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f209333c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f209334d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f209335e;

    @Inject
    public e(@Y61.k com.avito.android.onboarding.steps.l lVar, @Y61.k G40.c cVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.util.text.a aVar2, @Y61.k String str) {
        this.f209331a = lVar;
        this.f209332b = cVar;
        this.f209333c = aVar;
        this.f209334d = aVar2;
        this.f209335e = str;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<OnboardingStepsInternalAction> b(H40.b bVar, H40.d dVar) {
        H40.b bVar2 = bVar;
        H40.d dVar2 = dVar;
        if (bVar2 instanceof b.d) {
            return C43175k.G(new a(this, null));
        }
        if (bVar2 instanceof b.c) {
            return C43175k.G(new b(dVar2, bVar2, this, null));
        }
        if (bVar2 instanceof b.a) {
            return C43175k.G(new c(dVar2, bVar2, this, null));
        }
        if (bVar2 instanceof b.C0395b) {
            return C43175k.G(new d(this, bVar2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
