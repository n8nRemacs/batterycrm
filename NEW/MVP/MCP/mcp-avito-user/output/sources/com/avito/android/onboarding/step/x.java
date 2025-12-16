package com.avito.android.onboarding.step;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BxOnboardingPriceLoweredStepInteractorImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.onboarding.step.BxOnboardingPriceLoweredStepInteractorImpl", f = "BxOnboardingPriceLoweredStepInteractorImpl.kt", i = {0}, l = {57, 58}, m = "isTooltipAvailable", n = {"this"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class x extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public s f209245q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f209246r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s f209247s;

    /* renamed from: t, reason: collision with root package name */
    public int f209248t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(s sVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f209247s = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f209246r = obj;
        this.f209248t |= BeduinInputModel.MIN_TEXT_VERSION;
        int i12 = s.f209228h;
        return this.f209247s.d(this);
    }
}
