package com.avito.android.onboarding.step;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BxOnboardingUserViewedStepInteractorImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.onboarding.step.BxOnboardingUserViewedStepInteractorImpl", f = "BxOnboardingUserViewedStepInteractorImpl.kt", i = {0, 1}, l = {62, 63, 64}, m = "isTooltipAvailable", n = {"this", "this"}, s = {"L$0", "L$0"})
/* loaded from: classes15.dex */
final class K extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public F f209173q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f209174r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ F f209175s;

    /* renamed from: t, reason: collision with root package name */
    public int f209176t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(F f12, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f209175s = f12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f209174r = obj;
        this.f209176t |= BeduinInputModel.MIN_TEXT_VERSION;
        int i12 = F.f209154j;
        return this.f209175s.d(this);
    }
}
