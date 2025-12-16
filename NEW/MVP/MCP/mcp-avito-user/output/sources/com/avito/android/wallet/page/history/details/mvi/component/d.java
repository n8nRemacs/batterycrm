package com.avito.android.wallet.page.history.details.mvi.component;

import com.avito.android.wallet.page.history.details.mvi.entity.PaymentHistoryDetailsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PaymentHistoryDetailsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.wallet.page.history.details.mvi.component.PaymentHistoryDetailsActor$process$3", f = "PaymentHistoryDetailsActor.kt", i = {0}, l = {53, 54, 54}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super PaymentHistoryDetailsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f327891q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f327892r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f327893s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f327893s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f327893s, continuation);
        dVar.f327892r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PaymentHistoryDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.f327891q
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L25
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.C42729a0.b(r6)
            goto L60
        L15:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1d:
            java.lang.Object r1 = r5.f327892r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r6)
            goto L54
        L25:
            java.lang.Object r1 = r5.f327892r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r6)
            goto L45
        L2d:
            kotlin.C42729a0.b(r6)
            java.lang.Object r6 = r5.f327892r
            kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.InterfaceC43172j) r6
            com.avito.android.wallet.page.history.details.mvi.entity.PaymentHistoryDetailsInternalAction$Loading r1 = new com.avito.android.wallet.page.history.details.mvi.entity.PaymentHistoryDetailsInternalAction$Loading
            r1.<init>()
            r5.f327892r = r6
            r5.f327891q = r4
            java.lang.Object r1 = r6.emit(r1, r5)
            if (r1 != r0) goto L44
            return r0
        L44:
            r1 = r6
        L45:
            com.avito.android.wallet.page.history.details.mvi.component.a r6 = r5.f327893s
            com.avito.android.wallet.page.history.details.mvi.i r6 = r6.f327883a
            r5.f327892r = r1
            r5.f327891q = r3
            java.lang.Object r6 = r6.b(r5)
            if (r6 != r0) goto L54
            return r0
        L54:
            r3 = 0
            r5.f327892r = r3
            r5.f327891q = r2
            java.lang.Object r6 = r1.emit(r6, r5)
            if (r6 != r0) goto L60
            return r0
        L60:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.wallet.page.history.details.mvi.component.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
