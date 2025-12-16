package com.avito.android.authorization.complete_registration;

import com.avito.android.authorization.complete_registration.CompleteRegistrationFragment;
import com.avito.android.authorization.complete_registration.mvi.entity.InputType;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CompleteRegistrationFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(I)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.authorization.complete_registration.CompleteRegistrationFragment$setupCallbacks$2", f = "CompleteRegistrationFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class h extends SuspendLambda implements Y41.p<Integer, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ CompleteRegistrationFragment f93445q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CompleteRegistrationFragment completeRegistrationFragment, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f93445q = completeRegistrationFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new h(this.f93445q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Integer num, Continuation<? super G0> continuation) {
        return ((h) create(num, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InputType inputType = InputType.f93480c;
        CompleteRegistrationFragment.a aVar = CompleteRegistrationFragment.f93381E0;
        this.f93445q.t5(inputType);
        return G0.f406611a;
    }
}
