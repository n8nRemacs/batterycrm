package com.avito.android.comfortable_deal.contract_sign.mvi;

import Y41.p;
import com.avito.android.comfortable_deal.contract_sign.mvi.entity.ContractSignInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import op.InterfaceC44835a;
import pp.C47122c;

/* compiled from: ContractSignActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/comfortable_deal/contract_sign/mvi/entity/ContractSignInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.contract_sign.mvi.ContractSignActor$process$1", f = "ContractSignActor.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super ContractSignInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f120840q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f120841r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f120842s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C47122c f120843t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Continuation continuation, C47122c c47122c) {
        super(2, continuation);
        this.f120842s = cVar;
        this.f120843t = c47122c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f120842s, continuation, this.f120843t);
        aVar.f120841r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ContractSignInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f120840q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f120841r;
            InterfaceC44835a interfaceC44835a = this.f120842s.f120849b;
            C47122c c47122c = this.f120843t;
            interfaceC44835a.a(c47122c.f428774c);
            String str = c47122c.f428773b;
            if (str.length() > 0) {
                ContractSignInternalAction.OpenContractLink openContractLink = new ContractSignInternalAction.OpenContractLink(str);
                this.f120840q = 1;
                if (interfaceC43172j.emit(openContractLink, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
