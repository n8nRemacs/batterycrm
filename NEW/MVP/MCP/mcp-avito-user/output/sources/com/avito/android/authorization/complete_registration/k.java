package com.avito.android.authorization.complete_registration;

import com.avito.android.authorization.complete_registration.CompleteRegistrationFragment;
import ee.InterfaceC40093a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CompleteRegistrationFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.authorization.complete_registration.CompleteRegistrationFragment$setupCallbacks$6", f = "CompleteRegistrationFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class k extends SuspendLambda implements Y41.p<G0, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ CompleteRegistrationFragment f93448q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(CompleteRegistrationFragment completeRegistrationFragment, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f93448q = completeRegistrationFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new k(this.f93448q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(G0 g02, Continuation<? super G0> continuation) {
        return ((k) create(g02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        CompleteRegistrationFragment completeRegistrationFragment = this.f93448q;
        CompleteRegistrationFragment.a aVar = CompleteRegistrationFragment.f93381E0;
        completeRegistrationFragment.s5(new InterfaceC40093a.c(completeRegistrationFragment.r5().b()));
        return G0.f406611a;
    }
}
