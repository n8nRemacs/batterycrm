package com.avito.android.comfortable_deal.deal.mvi;

import Ep.InterfaceC13517a;
import com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: DealActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.deal.mvi.DealActor$process$3", f = "DealActor.kt", i = {0}, l = {147, 154}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes12.dex */
final class l extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f121686q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f121687r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC13517a f121688s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Ep.c f121689t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(InterfaceC13517a interfaceC13517a, Ep.c cVar, Continuation<? super l> continuation) {
        super(2, continuation);
        this.f121688s = interfaceC13517a;
        this.f121689t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        l lVar = new l(this.f121688s, this.f121689t, continuation);
        lVar.f121687r = obj;
        return lVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super DealInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((l) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f121686q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f121687r;
            if (((InterfaceC13517a.u) this.f121688s).f4293a) {
                Ep.c cVar = this.f121689t;
                String str = cVar.f4331h.f4335d;
                String str2 = cVar.f4325b;
                if (str2 == null) {
                    str2 = "";
                }
                DealInternalAction.OpenAddCommentDialog openAddCommentDialog = new DealInternalAction.OpenAddCommentDialog(str, str2);
                this.f121687r = interfaceC43172j;
                this.f121686q = 1;
                if (interfaceC43172j.emit(openAddCommentDialog, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f121687r;
            C42729a0.b(obj);
        }
        DealInternalAction.UpdateComment updateComment = new DealInternalAction.UpdateComment(null);
        this.f121687r = null;
        this.f121686q = 2;
        if (interfaceC43172j.emit(updateComment, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
