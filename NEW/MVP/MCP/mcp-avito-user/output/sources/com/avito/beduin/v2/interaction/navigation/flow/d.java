package com.avito.beduin.v2.interaction.navigation.flow;

import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BackInteractionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LdU0/f;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.beduin.v2.interaction.navigation.flow.BackInteractionHandler$handle$1", f = "BackInteractionHandler.kt", i = {}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP, 31}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super dU0.f>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f337518q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f337519r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C36326a f337520s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f337521t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C36326a c36326a, e eVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f337520s = c36326a;
        this.f337521t = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f337520s, this.f337521t, continuation);
        dVar.f337519r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super dU0.f> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f337518q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f337519r;
            C36326a c36326a = this.f337520s;
            Y41.a<dU0.f> aVar = c36326a.f337514b;
            e eVar = this.f337521t;
            boolean f336892a = eVar.f337523d.getF336892a();
            u uVar = c36326a.f337513a;
            com.avito.beduin.v2.interaction.navigation_controller.e eVar2 = eVar.f337522c;
            if (!f336892a || aVar == null) {
                dU0.f fVarF = eVar2.f(uVar);
                if (fVarF != null) {
                    this.f337518q = 1;
                    if (interfaceC43172j.emit(fVarF, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (!eVar2.f337566b.g(uVar)) {
                dU0.f fVarInvoke = aVar.invoke();
                this.f337518q = 2;
                if (interfaceC43172j.emit(fVarInvoke, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
