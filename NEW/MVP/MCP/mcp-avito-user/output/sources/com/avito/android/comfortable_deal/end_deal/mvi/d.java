package com.avito.android.comfortable_deal.end_deal.mvi;

import Hp.InterfaceC14016a;
import Y41.p;
import com.avito.android.comfortable_deal.end_deal.mvi.entity.EndDealInternalAction;
import java.time.Instant;
import java.time.ZoneId;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: EndDealActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.end_deal.mvi.EndDealActor$process$4", f = "EndDealActor.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class d extends SuspendLambda implements p<InterfaceC43172j<? super EndDealInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f122305q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f122306r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14016a f122307s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InterfaceC14016a interfaceC14016a, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f122307s = interfaceC14016a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f122307s, continuation);
        dVar.f122306r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super EndDealInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f122305q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f122306r;
            EndDealInternalAction.UpdateCalendarValue updateCalendarValue = new EndDealInternalAction.UpdateCalendarValue(Instant.ofEpochMilli(((InterfaceC14016a.e) this.f122307s).f7714a.f406915b).atZone(ZoneId.systemDefault()).toLocalDate());
            this.f122305q = 1;
            if (interfaceC43172j.emit(updateCalendarValue, this) == coroutine_suspended) {
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
