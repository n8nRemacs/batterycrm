package com.avito.android.onboarding.step;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BxOnboardingUnreadMessagesStepInteractorImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.onboarding.step.BxOnboardingUnreadMessagesStepInteractorImpl", f = "BxOnboardingUnreadMessagesStepInteractorImpl.kt", i = {}, l = {19}, m = "fetch", n = {}, s = {})
/* loaded from: classes15.dex */
final class C extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f209149q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ D f209150r;

    /* renamed from: s, reason: collision with root package name */
    public int f209151s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(D d12, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f209150r = d12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f209149q = obj;
        this.f209151s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f209150r.b(this);
    }
}
