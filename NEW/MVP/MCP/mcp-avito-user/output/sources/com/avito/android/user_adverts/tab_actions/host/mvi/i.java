package com.avito.android.user_adverts.tab_actions.host.mvi;

import com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsInternalAction;
import com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_actions.host.mvi.UserAdvertsActionsActor$groupClickActions$$inlined$flatMapLatest$1", f = "UserAdvertsActionsActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class i extends SuspendLambda implements Y41.q<InterfaceC43172j<? super UserAdvertsActionsInternalAction>, YI0.a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f314522q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f314523r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f314524s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C35641a f314525t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.a f314526u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Continuation continuation, C35641a c35641a, Y41.a aVar) {
        super(3, continuation);
        this.f314525t = c35641a;
        this.f314526u = aVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super UserAdvertsActionsInternalAction> interfaceC43172j, YI0.a aVar, Continuation<? super G0> continuation) {
        i iVar = new i(continuation, this.f314525t, this.f314526u);
        iVar.f314523r = interfaceC43172j;
        iVar.f314524s = aVar;
        return iVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f314522q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f314523r;
            InterfaceC43160i<UserAdvertsActionsInternalAction> interfaceC43160iB = this.f314525t.b((YI0.a) this.f314524s, (UserAdvertsActionsState) this.f314526u.invoke());
            this.f314522q = 1;
            if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
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
