package com.avito.android.universal_transaction.mvi;

import com.avito.android.universal_transaction.mvi.entity.TransactionInternalAction;
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
import wG0.C49504b;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.universal_transaction.mvi.TransactionActor$handleTransactionUpdates$lambda$4$$inlined$flatMapLatest$1", f = "TransactionActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class f extends SuspendLambda implements Y41.q<InterfaceC43172j<? super TransactionInternalAction>, C49504b, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f306422q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f306423r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f306424s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f306425t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.a f306426u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Y41.a aVar, a aVar2, Continuation continuation) {
        super(3, continuation);
        this.f306425t = aVar2;
        this.f306426u = aVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super TransactionInternalAction> interfaceC43172j, C49504b c49504b, Continuation<? super G0> continuation) {
        f fVar = new f(this.f306426u, this.f306425t, continuation);
        fVar.f306423r = interfaceC43172j;
        fVar.f306424s = c49504b;
        return fVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f306422q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f306423r;
            InterfaceC43160i<TransactionInternalAction> interfaceC43160iA = this.f306425t.f306381a.a(((CG0.c) this.f306426u.invoke()).f2067d);
            this.f306422q = 1;
            if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
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
