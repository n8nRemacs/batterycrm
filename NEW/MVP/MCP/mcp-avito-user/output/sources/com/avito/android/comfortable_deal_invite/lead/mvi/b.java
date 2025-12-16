package com.avito.android.comfortable_deal_invite.lead.mvi;

import Y41.p;
import com.avito.android.comfortable_deal_invite.lead.mvi.entity.ComfortableDealInviteInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import zq.InterfaceC50609a;

/* compiled from: ComfortableDealInviteActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal_invite.lead.mvi.ComfortableDealInviteActor$process$3", f = "ComfortableDealInviteActor.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super ComfortableDealInviteInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f123673q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f123674r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC50609a f123675s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC50609a interfaceC50609a, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f123675s = interfaceC50609a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f123675s, continuation);
        bVar.f123674r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ComfortableDealInviteInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f123673q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f123674r;
            InterfaceC50609a.d dVar = (InterfaceC50609a.d) this.f123675s;
            if (dVar.f444264a.length() > 2000) {
                return G0.f406611a;
            }
            ComfortableDealInviteInternalAction.CommissionInputValueChanged commissionInputValueChanged = new ComfortableDealInviteInternalAction.CommissionInputValueChanged(dVar.f444264a);
            this.f123673q = 1;
            if (interfaceC43172j.emit(commissionInputValueChanged, this) == coroutine_suspended) {
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
