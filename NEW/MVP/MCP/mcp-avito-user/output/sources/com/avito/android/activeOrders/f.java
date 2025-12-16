package com.avito.android.activeOrders;

import com.avito.android.clientEventBus.k;
import com.avito.android.remote.model.TypedResult;
import com.facebook.imageutils.JfifUtil;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.activeOrders.UpdatedActiveOrdersInteractorImpl$observeEventsWithForceUpdate$$inlined$flatMapLatest$1", f = "UpdatedActiveOrdersInteractorImpl.kt", i = {}, l = {JfifUtil.MARKER_SOS, JfifUtil.MARKER_APP1, 189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
public final class f extends SuspendLambda implements Y41.q<InterfaceC43172j<? super TypedResult<OrdersNeedActionResponse>>, com.avito.android.clientEventBus.k<M40.a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f68217q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f68218r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f68219s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f68220t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Continuation continuation, r rVar) {
        super(3, continuation);
        this.f68220t = rVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super TypedResult<OrdersNeedActionResponse>> interfaceC43172j, com.avito.android.clientEventBus.k<M40.a> kVar, Continuation<? super G0> continuation) {
        f fVar = new f(continuation, this.f68220t);
        fVar.f68218r = interfaceC43172j;
        fVar.f68219s = kVar;
        return fVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        InterfaceC43160i interfaceC43160iW;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f68217q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = this.f68218r;
            com.avito.android.clientEventBus.k kVar = (com.avito.android.clientEventBus.k) this.f68219s;
            boolean z12 = kVar instanceof k.a;
            r rVar = this.f68220t;
            if (z12) {
                if (L.f(((M40.a) ((k.a) kVar).f118550a).getIsActionRequired(), Boxing.boxBoolean(true))) {
                    c cVar = rVar.f68252b;
                    this.f68218r = interfaceC43172j;
                    this.f68217q = 1;
                    obj = cVar.a(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    interfaceC43160iW = new C43210w(obj);
                } else {
                    interfaceC43160iW = C43175k.w();
                }
            } else {
                if (!(kVar instanceof k.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                c cVar2 = rVar.f68252b;
                this.f68218r = interfaceC43172j;
                this.f68217q = 2;
                obj = cVar2.a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC43160iW = new C43210w(obj);
            }
        } else if (i12 == 1) {
            interfaceC43172j = this.f68218r;
            C42729a0.b(obj);
            interfaceC43160iW = new C43210w(obj);
        } else {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = this.f68218r;
            C42729a0.b(obj);
            interfaceC43160iW = new C43210w(obj);
        }
        this.f68218r = null;
        this.f68217q = 3;
        if (C43175k.u(this, interfaceC43160iW, interfaceC43172j) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
