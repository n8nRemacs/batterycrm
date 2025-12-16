package com.avito.android.onboarding.steps.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.onboarding.steps.mvi.entity.OnboardingStepsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: OnboardingStepsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LH40/b;", "Lcom/avito/android/onboarding/steps/mvi/entity/OnboardingStepsInternalAction;", "LH40/d;", "LH40/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class j extends N implements Y41.l<q<H40.b, OnboardingStepsInternalAction, H40.d, H40.c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f209354l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f209355m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f209356n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ o f209357o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m f209358p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, e eVar, ScreenPerformanceTracker screenPerformanceTracker, o oVar, m mVar) {
        super(1);
        this.f209354l = hVar;
        this.f209355m = eVar;
        this.f209356n = screenPerformanceTracker;
        this.f209357o = oVar;
        this.f209358p = mVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<H40.b, OnboardingStepsInternalAction, H40.d, H40.c> qVar) {
        q<H40.b, OnboardingStepsInternalAction, H40.d, H40.c> qVar2 = qVar;
        qVar2.f92008d = this.f209354l;
        qVar2.f92009e = this.f209355m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f209356n, this.f209357o);
        qVar2.f92010f = this.f209358p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
