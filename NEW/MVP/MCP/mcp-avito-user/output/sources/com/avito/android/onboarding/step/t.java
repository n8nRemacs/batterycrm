package com.avito.android.onboarding.step;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BxOnboardingPriceLoweredStepInteractorImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.onboarding.step.BxOnboardingPriceLoweredStepInteractorImpl", f = "BxOnboardingPriceLoweredStepInteractorImpl.kt", i = {0}, l = {48}, m = "fetch", n = {"this"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class t extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public s f209236q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f209237r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s f209238s;

    /* renamed from: t, reason: collision with root package name */
    public int f209239t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(s sVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f209238s = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f209237r = obj;
        this.f209239t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f209238s.b(this);
    }
}
