package com.avito.android.onboarding;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Z1;

/* compiled from: BxOnboardingChainController.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\b\u00028\u0000H\u008a@"}, d2 = {"T", "it", "Lkotlin/G0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.onboarding.BxOnboardingChainControllerImpl$awaitIterator$3", f = "BxOnboardingChainController.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.onboarding.f, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32922f extends SuspendLambda implements Y41.p<Object, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f209068q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C32924h f209069r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32922f(C32924h c32924h, Continuation<? super C32922f> continuation) {
        super(2, continuation);
        this.f209069r = c32924h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C32922f(this.f209069r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Continuation<? super G0> continuation) {
        return ((C32922f) create(obj, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f209068q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Z1 z12 = (Z1) this.f209069r.f209076b.getValue();
            Boolean boolBoxBoolean = Boxing.boxBoolean(false);
            this.f209068q = 1;
            if (z12.emit(boolBoxBoolean, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
