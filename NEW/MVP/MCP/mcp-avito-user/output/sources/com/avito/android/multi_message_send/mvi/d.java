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
@DebugMetadata(c = "com.avito.android.multi_message_send.mvi.MultiMessageSendActor$process$4", f = "MultiMessageSendActor.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MultiMessageSendInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f206749q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f206750r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ G20.b f206751s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(G20.b bVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f206751s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f206751s, continuation);
        dVar.f206750r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MultiMessageSendInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f206749q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f206750r;
            MultiMessageSendInternalAction.KeyboardStateChangedInternal keyboardStateChangedInternal = new MultiMessageSendInternalAction.KeyboardStateChangedInternal(((b.C0329b) this.f206751s).f6231a);
            this.f206749q = 1;
            if (interfaceC43172j.emit(keyboardStateChangedInternal, this) == coroutine_suspended) {
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
