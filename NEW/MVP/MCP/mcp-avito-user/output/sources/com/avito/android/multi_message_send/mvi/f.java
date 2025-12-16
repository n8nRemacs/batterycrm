package com.avito.android.multi_message_send.mvi;

import G20.b;
import com.avito.android.multi_message_send.mvi.entity.MultiMessageSendInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MultiMessageSendActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.multi_message_send.mvi.MultiMessageSendActor$process$6", f = "MultiMessageSendActor.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MultiMessageSendInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f206771q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f206772r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ G20.b f206773s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(G20.b bVar, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f206773s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f206773s, continuation);
        fVar.f206772r = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MultiMessageSendInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f206771q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f206772r;
            MultiMessageSendInternalAction.OnAnchorClicked onAnchorClicked = new MultiMessageSendInternalAction.OnAnchorClicked(((b.c) this.f206773s).f6232a);
            this.f206771q = 1;
            if (interfaceC43172j.emit(onAnchorClicked, this) == coroutine_suspended) {
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
