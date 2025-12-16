package com.avito.android.universal_transaction.mvi;

import com.avito.android.clientEventBus.ConnectionState;
import com.avito.android.universal_transaction.mvi.a;
import com.avito.android.universal_transaction.mvi.entity.TransactionInternalAction;
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
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.y;
import wG0.C49504b;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.universal_transaction.mvi.TransactionActor$handleTransactionUpdates$$inlined$flatMapLatest$1", f = "TransactionActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super TransactionInternalAction>, ConnectionState, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f306384q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f306385r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f306386s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f306387t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.a f306388u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Y41.a aVar, a aVar2, Continuation continuation) {
        super(3, continuation);
        this.f306387t = aVar2;
        this.f306388u = aVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super TransactionInternalAction> interfaceC43172j, ConnectionState connectionState, Continuation<? super G0> continuation) {
        b bVar = new b(this.f306388u, this.f306387t, continuation);
        bVar.f306385r = interfaceC43172j;
        bVar.f306386s = connectionState;
        return bVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43160i interfaceC43160iW;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f306384q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f306385r;
            if (a.b.f306383a[((ConnectionState) this.f306386s).ordinal()] == 1) {
                a aVar = this.f306387t;
                com.avito.android.clientEventBus.a aVar2 = aVar.f306382b;
                StringBuilder sb2 = new StringBuilder();
                Y41.a aVar3 = this.f306388u;
                interfaceC43160iW = new C43152f0(C43175k.Y(new C43176k0(new e(aVar3, y.a(aVar2.b(C49504b.class, new mx0.e(AK.c.s(sb2, ((CG0.c) aVar3.invoke()).f2067d.f1269c, ".trxPageChanged"), null, false, 6, null)))), new c(4, null)), new f(aVar3, aVar, null)), new d(3, null));
            } else {
                interfaceC43160iW = C43175k.w();
            }
            this.f306384q = 1;
            if (C43175k.u(this, interfaceC43160iW, interfaceC43172j) == coroutine_suspended) {
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
