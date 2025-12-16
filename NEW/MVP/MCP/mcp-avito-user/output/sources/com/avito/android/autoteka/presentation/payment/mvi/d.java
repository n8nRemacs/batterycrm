package com.avito.android.autoteka.presentation.payment.mvi;

import com.avito.android.autoteka.presentation.payment.mvi.entity.AutotekaPaymentInternalAction;
import com.avito.android.autoteka.presentation.payment.mvi.entity.AutotekaPaymentState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AutotekaPaymentActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.autoteka.presentation.payment.mvi.AutotekaPaymentActor$process$4", f = "AutotekaPaymentActor.kt", i = {0, 0, 1, 3, 3}, l = {89, 98, 109, 111, 112}, m = "invokeSuspend", n = {"$this$flow", "promoCodeWidget", "$this$flow", "$this$flow", "paymentAction"}, s = {"L$0", "L$1", "L$0", "L$0", "L$1"})
/* loaded from: classes11.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AutotekaPaymentInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object f97427q;

    /* renamed from: r, reason: collision with root package name */
    public AutotekaPaymentState f97428r;

    /* renamed from: s, reason: collision with root package name */
    public i f97429s;

    /* renamed from: t, reason: collision with root package name */
    public int f97430t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f97431u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AutotekaPaymentState f97432v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f97433w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AutotekaPaymentState autotekaPaymentState, i iVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f97432v = autotekaPaymentState;
        this.f97433w = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f97432v, this.f97433w, continuation);
        dVar.f97431u = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super AutotekaPaymentInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011f A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.autoteka.presentation.payment.mvi.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
