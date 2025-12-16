package com.avito.android.orderBeduinV2.mvi;

import com.avito.android.clientEventBus.ConnectionState;
import com.avito.android.orderBeduinV2.mvi.a;
import com.avito.android.orderBeduinV2.mvi.entity.OrderInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43176k0;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.y;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.orderBeduinV2.mvi.OrderActor$handleOrderUpdates$$inlined$flatMapLatest$1", f = "OrderActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
public final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super OrderInternalAction>, ConnectionState, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f209842q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f209843r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f209844s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f209845t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C43197r1 f209846u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y41.a f209847v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Y41.a aVar, a aVar2, Continuation continuation, C43197r1 c43197r1) {
        super(3, continuation);
        this.f209845t = aVar2;
        this.f209846u = c43197r1;
        this.f209847v = aVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super OrderInternalAction> interfaceC43172j, ConnectionState connectionState, Continuation<? super G0> continuation) {
        Y41.a aVar = this.f209847v;
        C43197r1 c43197r1 = this.f209846u;
        b bVar = new b(aVar, this.f209845t, continuation, c43197r1);
        bVar.f209843r = interfaceC43172j;
        bVar.f209844s = connectionState;
        return bVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f209842q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f209843r;
            int i13 = a.b.f209841a[((ConnectionState) this.f209844s).ordinal()];
            Y41.a aVar = this.f209847v;
            C43197r1 c43197r1 = this.f209846u;
            a aVar2 = this.f209845t;
            InterfaceC43160i c43152f0 = i13 == 1 ? new C43152f0(C43175k.Y(new C43176k0(new e(y.a(aVar2.f209839d.c(M40.a.class)), aVar2), new c(4, null)), new f(null, aVar2)), new d(aVar, aVar2, null, c43197r1)) : a.c(aVar2, c43197r1, aVar);
            this.f209842q = 1;
            if (C43175k.u(this, c43152f0, interfaceC43172j) == coroutine_suspended) {
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
