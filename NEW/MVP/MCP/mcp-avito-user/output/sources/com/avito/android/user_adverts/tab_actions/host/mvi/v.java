package com.avito.android.user_adverts.tab_actions.host.mvi;

import YI0.a;
import com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_actions.host.mvi.UserAdvertsActionsActor$processPrepareActivate$$inlined$flatMapLatest$1", f = "UserAdvertsActionsActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class v extends SuspendLambda implements Y41.q<InterfaceC43172j<? super UserAdvertsActionsInternalAction>, Object, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f314592q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f314593r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f314594s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C35641a f314595t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a.d f314596u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(a.d dVar, C35641a c35641a, Continuation continuation) {
        super(3, continuation);
        this.f314595t = c35641a;
        this.f314596u = dVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super UserAdvertsActionsInternalAction> interfaceC43172j, Object obj, Continuation<? super G0> continuation) {
        C35641a c35641a = this.f314595t;
        v vVar = new v(this.f314596u, c35641a, continuation);
        vVar.f314593r = interfaceC43172j;
        vVar.f314594s = obj;
        return vVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f314592q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f314593r;
            Object obj2 = this.f314594s;
            InterfaceC43160i interfaceC43160iG = obj2 instanceof UserAdvertsActionsInternalAction.ResultActionHandling.Multiple.Redirect ? C43175k.G(new C35644d((UserAdvertsActionsInternalAction.ResultActionHandling.Multiple.Redirect) obj2, new C35643c(new C35642b(kotlinx.coroutines.rx3.y.a(this.f314595t.f314399c.d9())), this.f314596u), null)) : new C43210w(obj2);
            this.f314592q = 1;
            if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
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
