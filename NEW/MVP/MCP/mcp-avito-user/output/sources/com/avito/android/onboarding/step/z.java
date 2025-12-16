package com.avito.android.onboarding.step;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BxOnboardingReplaceMainExitStepInteractorImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.onboarding.step.BxOnboardingReplaceMainExitStepInteractorImpl", f = "BxOnboardingReplaceMainExitStepInteractorImpl.kt", i = {}, l = {15}, m = "fetch", n = {}, s = {})
/* loaded from: classes15.dex */
final class z extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f209256q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ A f209257r;

    /* renamed from: s, reason: collision with root package name */
    public int f209258s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(A a12, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f209257r = a12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f209256q = obj;
        this.f209258s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f209257r.b(this);
    }
}
