package com.avito.android.gig_motivation_payment.ui.mvi;

import com.avito.android.gig_motivation_payment.ui.mvi.entity.MotivationPaymentInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import sH.C48049a;

/* compiled from: MotivationPaymentActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LsH/a;", "it", "Lcom/avito/android/gig_motivation_payment/ui/mvi/entity/MotivationPaymentInternalAction;", "<anonymous>", "(LsH/a;)Lcom/avito/android/gig_motivation_payment/ui/mvi/entity/MotivationPaymentInternalAction;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.gig_motivation_payment.ui.mvi.MotivationPaymentActor$loadMotivationPayment$2", f = "MotivationPaymentActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class b extends SuspendLambda implements Y41.p<C48049a, Continuation<? super MotivationPaymentInternalAction>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f160219q;

    public b() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(2, continuation);
        bVar.f160219q = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(C48049a c48049a, Continuation<? super MotivationPaymentInternalAction> continuation) {
        return ((b) create(c48049a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return new MotivationPaymentInternalAction.ContentLoaded((C48049a) this.f160219q);
    }
}
