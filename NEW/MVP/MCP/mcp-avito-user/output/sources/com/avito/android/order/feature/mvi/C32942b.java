package com.avito.android.order.feature.mvi;

import com.avito.android.clientEventBus.ConnectionState;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.order.feature.mvi.C32941a;
import com.avito.android.order.feature.mvi.entity.OrderInternalAction;
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

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.order.feature.mvi.OrderActor$handleOrderUpdates$$inlined$flatMapLatest$1", f = "OrderActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.order.feature.mvi.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32942b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super OrderInternalAction>, ConnectionState, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f209603q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f209604r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f209605s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C32941a f209606t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C43197r1 f209607u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y41.a f209608v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32942b(Y41.a aVar, C32941a c32941a, Continuation continuation, C43197r1 c43197r1) {
        super(3, continuation);
        this.f209606t = c32941a;
        this.f209607u = c43197r1;
        this.f209608v = aVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super OrderInternalAction> interfaceC43172j, ConnectionState connectionState, Continuation<? super G0> continuation) {
        Y41.a aVar = this.f209608v;
        C43197r1 c43197r1 = this.f209607u;
        C32942b c32942b = new C32942b(aVar, this.f209606t, continuation, c43197r1);
        c32942b.f209604r = interfaceC43172j;
        c32942b.f209605s = connectionState;
        return c32942b.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43160i interfaceC43160iD;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f209603q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f209604r;
            int i13 = C32941a.b.f209602a[((ConnectionState) this.f209605s).ordinal()];
            Y41.a aVar = this.f209608v;
            C43197r1 c43197r1 = this.f209607u;
            C32941a c32941a = this.f209606t;
            if (i13 == 1) {
                interfaceC43160iD = new C43152f0(C43175k.Y(new C43176k0(new e(kotlinx.coroutines.rx3.y.a(c32941a.f209599d.c(M40.a.class)), c32941a), new C32943c(4, null)), new f(null, c32941a)), new d(aVar, c32941a, null, c43197r1));
            } else {
                c32941a.f209601f.c(new NonFatalErrorEvent("Observe order update events was not started by disconnected state", null, null, null, 14, null));
                interfaceC43160iD = c32941a.d(c43197r1, aVar);
            }
            this.f209603q = 1;
            if (C43175k.u(this, interfaceC43160iD, interfaceC43172j) == coroutine_suspended) {
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
