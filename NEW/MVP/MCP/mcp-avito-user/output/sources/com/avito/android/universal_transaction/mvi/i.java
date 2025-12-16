package com.avito.android.universal_transaction.mvi;

import com.avito.android.universal_transaction.mvi.entity.TransactionInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TransactionActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LCG0/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/universal_transaction/mvi/entity/TransactionInternalAction;", "<anonymous>", "(LCG0/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.universal_transaction.mvi.TransactionActor$process$1", f = "TransactionActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class i extends SuspendLambda implements Y41.p<CG0.a, Continuation<? super InterfaceC43160i<? extends TransactionInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f306439q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f306440r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<CG0.c> f306441s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Y41.a aVar, a aVar2, Continuation continuation) {
        super(2, continuation);
        this.f306440r = aVar2;
        this.f306441s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        i iVar = new i(this.f306441s, this.f306440r, continuation);
        iVar.f306439q = obj;
        return iVar;
    }

    @Override // Y41.p
    public final Object invoke(CG0.a aVar, Continuation<? super InterfaceC43160i<? extends TransactionInternalAction>> continuation) {
        return ((i) create(aVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f306440r.b((CG0.a) this.f306439q, this.f306441s.invoke());
    }
}
