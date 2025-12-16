package com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi;

import MI0.b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PanelSoaActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LMI0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.PanelSoaActor$processTooltipDismiss$1", f = "PanelSoaActor.kt", i = {0}, l = {96, 97}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class u extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MI0.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f313626q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f313627r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C35597a f313628s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(C35597a c35597a, Continuation<? super u> continuation) {
        super(2, continuation);
        this.f313628s = c35597a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        u uVar = new u(this.f313628s, continuation);
        uVar.f313627r = obj;
        return uVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MI0.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((u) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f313626q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f313627r;
            com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.l lVar = this.f313628s.f313522h;
            this.f313627r = interfaceC43172j;
            this.f313626q = 1;
            if (lVar.a(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f313627r;
            C42729a0.b(obj);
        }
        b.i iVar = b.i.f10567a;
        this.f313627r = null;
        this.f313626q = 2;
        if (interfaceC43172j.emit(iVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
