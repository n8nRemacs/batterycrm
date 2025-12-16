package com.avito.android.autoteka.presentation.payment.mvi;

import Nf.InterfaceC14568a;
import com.avito.android.autoteka.presentation.payment.mvi.entity.AutotekaPaymentInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AutotekaPaymentActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.autoteka.presentation.payment.mvi.AutotekaPaymentActor$process$3", f = "AutotekaPaymentActor.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AutotekaPaymentInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f97424q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f97425r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14568a f97426s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC14568a interfaceC14568a, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f97426s = interfaceC14568a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f97426s, continuation);
        cVar.f97425r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super AutotekaPaymentInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f97424q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f97425r;
            AutotekaPaymentInternalAction.OpenLicenseAgreement openLicenseAgreement = new AutotekaPaymentInternalAction.OpenLicenseAgreement(((InterfaceC14568a.b) this.f97426s).f11685a);
            this.f97424q = 1;
            if (interfaceC43172j.emit(openLicenseAgreement, this) == coroutine_suspended) {
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
