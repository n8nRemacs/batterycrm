package com.avito.android.onboarding.step;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BxOnboardingPriceLoweredStepInteractorImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.onboarding.step.BxOnboardingPriceLoweredStepInteractorImpl", f = "BxOnboardingPriceLoweredStepInteractorImpl.kt", i = {}, l = {78}, m = "isApiTooltipAvailable", n = {}, s = {})
/* loaded from: classes15.dex */
final class u extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f209240q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s f209241r;

    /* renamed from: s, reason: collision with root package name */
    public int f209242s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(s sVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f209241r = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f209240q = obj;
        this.f209242s |= BeduinInputModel.MIN_TEXT_VERSION;
        int i12 = s.f209228h;
        return this.f209241r.c(this);
    }
}
