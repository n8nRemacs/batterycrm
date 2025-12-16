package com.avito.android.gig_motivation_payment.ui.mvi;

import com.avito.android.gig_motivation_payment.ui.mvi.entity.MotivationPaymentInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MotivationPaymentActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/gig_motivation_payment/ui/mvi/entity/MotivationPaymentInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.gig_motivation_payment.ui.mvi.MotivationPaymentActor$process$3", f = "MotivationPaymentActor.kt", i = {0, 1}, l = {54, 55, 56}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes13.dex */
final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MotivationPaymentInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f160234q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f160235r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f160236s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f160236s = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f160236s, continuation);
        fVar.f160235r = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MotivationPaymentInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[RETURN] */
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
            int r1 = r5.f160234q
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L25
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.C42729a0.b(r6)
            goto L61
        L15:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1d:
            java.lang.Object r1 = r5.f160235r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r6)
            goto L53
        L25:
            java.lang.Object r1 = r5.f160235r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r6)
            goto L42
        L2d:
            kotlin.C42729a0.b(r6)
            java.lang.Object r6 = r5.f160235r
            kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.InterfaceC43172j) r6
            com.avito.android.gig_motivation_payment.ui.mvi.entity.MotivationPaymentInternalAction$d r1 = com.avito.android.gig_motivation_payment.ui.mvi.entity.MotivationPaymentInternalAction.d.f160231b
            r5.f160235r = r6
            r5.f160234q = r4
            java.lang.Object r1 = r6.emit(r1, r5)
            if (r1 != r0) goto L41
            return r0
        L41:
            r1 = r6
        L42:
            com.avito.android.gig_motivation_payment.ui.mvi.h r6 = r5.f160236s
            com.avito.android.gig_motivation_payment.ui.MotivationPaymentOpenParams r4 = r6.f160240a
            java.lang.String r4 = r4.f160119b
            r5.f160235r = r1
            r5.f160234q = r3
            java.lang.Object r6 = com.avito.android.gig_motivation_payment.ui.mvi.h.c(r6, r4, r5)
            if (r6 != r0) goto L53
            return r0
        L53:
            com.avito.android.gig_motivation_payment.ui.mvi.entity.MotivationPaymentInternalAction r6 = (com.avito.android.gig_motivation_payment.ui.mvi.entity.MotivationPaymentInternalAction) r6
            r3 = 0
            r5.f160235r = r3
            r5.f160234q = r2
            java.lang.Object r6 = r1.emit(r6, r5)
            if (r6 != r0) goto L61
            return r0
        L61:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.gig_motivation_payment.ui.mvi.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
