package com.avito.android.orderBeduinV2.mvi;

import com.avito.android.orderBeduinV2.mvi.entity.OrderInternalAction;
import com.avito.android.util.V2;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: OrderActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/orderBeduinV2/mvi/entity/OrderInternalAction;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.orderBeduinV2.mvi.OrderActor$handleOrderUpdates$1$4", f = "OrderActor.kt", i = {}, l = {UpdateStatusCode.DialogButton.CONFIRM}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class d extends SuspendLambda implements Y41.q<InterfaceC43172j<? super OrderInternalAction>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f209850q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f209851r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f209852s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f209853t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C43197r1 f209854u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y41.a<U40.c> f209855v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Y41.a aVar, a aVar2, Continuation continuation, C43197r1 c43197r1) {
        super(3, continuation);
        this.f209853t = aVar2;
        this.f209854u = c43197r1;
        this.f209855v = aVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super OrderInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        Y41.a<U40.c> aVar = this.f209855v;
        C43197r1 c43197r1 = this.f209854u;
        d dVar = new d(aVar, this.f209853t, continuation, c43197r1);
        dVar.f209851r = interfaceC43172j;
        dVar.f209852s = th2;
        return dVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f209850q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f209851r;
            V2.f318762a.e("OrderActor", this.f209852s);
            InterfaceC43160i interfaceC43160iC = a.c(this.f209853t, this.f209854u, this.f209855v);
            this.f209851r = null;
            this.f209850q = 1;
            if (C43175k.u(this, interfaceC43160iC, interfaceC43172j) == coroutine_suspended) {
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
