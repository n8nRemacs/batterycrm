package com.avito.android.bxcontent.mvi;

import com.avito.android.main_start_onboarding.MainStartOnboardingStep;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BxContentActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$subscribeMainStartOnboardingSteps$1", f = "BxContentActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.bxcontent.mvi.l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29206l extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MainStartOnboardingStep>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C29105a f112481q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29206l(C29105a c29105a, Continuation<? super C29206l> continuation) {
        super(2, continuation);
        this.f112481q = c29105a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C29206l(this.f112481q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MainStartOnboardingStep> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C29206l) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f112481q.f111548v.start();
        return kotlin.G0.f406611a;
    }
}
