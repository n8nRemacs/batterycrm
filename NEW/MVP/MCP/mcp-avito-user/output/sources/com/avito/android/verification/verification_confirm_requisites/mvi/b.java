package com.avito.android.verification.verification_confirm_requisites.mvi;

import LM0.a;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.verification.verification_confirm_requisites.mvi.entity.ConfirmRequisitesInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ConfirmRequisitesActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.verification.verification_confirm_requisites.mvi.ConfirmRequisitesActor$process$1", f = "ConfirmRequisitesActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ConfirmRequisitesInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ a f324961q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ LM0.a f324962r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, LM0.a aVar2, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f324961q = aVar;
        this.f324962r = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new b(this.f324961q, this.f324962r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ConfirmRequisitesInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        b.a.a(this.f324961q.f324958b, ((a.e) this.f324962r).f9928a, null, null, 6);
        return G0.f406611a;
    }
}
