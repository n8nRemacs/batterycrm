package com.avito.android.autoteka.presentation.payment.mvi;

import Nf.InterfaceC14568a;
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
@DebugMetadata(c = "com.avito.android.autoteka.presentation.payment.mvi.AutotekaPaymentActor$process$2", f = "AutotekaPaymentActor.kt", i = {1}, l = {62, 64, 67, 65}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* renamed from: com.avito.android.autoteka.presentation.payment.mvi.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28720b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AutotekaPaymentInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public com.avito.android.autoteka.presentation.payment.mvi.mapper.b f97418q;

    /* renamed from: r, reason: collision with root package name */
    public int f97419r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f97420s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AutotekaPaymentState f97421t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14568a f97422u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ i f97423v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28720b(AutotekaPaymentState autotekaPaymentState, InterfaceC14568a interfaceC14568a, i iVar, Continuation<? super C28720b> continuation) {
        super(2, continuation);
        this.f97421t = autotekaPaymentState;
        this.f97422u = interfaceC14568a;
        this.f97423v = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C28720b c28720b = new C28720b(this.f97421t, this.f97422u, this.f97423v, continuation);
        c28720b.f97420s = obj;
        return c28720b;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super AutotekaPaymentInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C28720b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r16) {
        /*
            r15 = this;
            r8 = r15
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r8.f97419r
            r10 = 4
            r1 = 3
            r2 = 2
            r3 = 1
            r11 = 0
            if (r0 == 0) goto L3b
            if (r0 == r3) goto L36
            if (r0 == r2) goto L2d
            if (r0 == r1) goto L1f
            if (r0 != r10) goto L17
            goto L36
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1f:
            com.avito.android.autoteka.presentation.payment.mvi.mapper.b r0 = r8.f97418q
            java.lang.Object r1 = r8.f97420s
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r16)
            r13 = r0
            r0 = r16
            goto Lac
        L2d:
            java.lang.Object r0 = r8.f97420s
            kotlinx.coroutines.flow.j r0 = (kotlinx.coroutines.flow.InterfaceC43172j) r0
            kotlin.C42729a0.b(r16)
        L34:
            r12 = r0
            goto L73
        L36:
            kotlin.C42729a0.b(r16)
            goto Lc2
        L3b:
            kotlin.C42729a0.b(r16)
            java.lang.Object r0 = r8.f97420s
            kotlinx.coroutines.flow.j r0 = (kotlinx.coroutines.flow.InterfaceC43172j) r0
            com.avito.android.autoteka.presentation.payment.mvi.entity.AutotekaPaymentState r4 = r8.f97421t
            boolean r5 = r4 instanceof com.avito.android.autoteka.presentation.payment.mvi.entity.AutotekaPaymentState.Error
            if (r5 == 0) goto Lc2
            com.avito.android.autoteka.presentation.payment.mvi.entity.AutotekaPaymentState$Error r4 = (com.avito.android.autoteka.presentation.payment.mvi.entity.AutotekaPaymentState.Error) r4
            com.avito.android.remote.error.ApiError r4 = r4.f97461f
            boolean r4 = r4 instanceof com.avito.android.remote.error.ApiError.Unauthorized
            if (r4 == 0) goto L63
            Nf.a r4 = r8.f97422u
            Nf.a$h r4 = (Nf.InterfaceC14568a.h) r4
            boolean r4 = r4.f11691a
            if (r4 == 0) goto L63
            com.avito.android.autoteka.presentation.payment.mvi.entity.AutotekaPaymentInternalAction$OpenAuthScreen r1 = com.avito.android.autoteka.presentation.payment.mvi.entity.AutotekaPaymentInternalAction.OpenAuthScreen.f97444b
            r8.f97419r = r3
            java.lang.Object r0 = r0.emit(r1, r15)
            if (r0 != r9) goto Lc2
            return r9
        L63:
            com.avito.android.autoteka.presentation.payment.mvi.entity.AutotekaPaymentInternalAction$Loading r4 = new com.avito.android.autoteka.presentation.payment.mvi.entity.AutotekaPaymentInternalAction$Loading
            r4.<init>(r11, r3, r11)
            r8.f97420s = r0
            r8.f97419r = r2
            java.lang.Object r2 = r0.emit(r4, r15)
            if (r2 != r9) goto L34
            return r9
        L73:
            com.avito.android.autoteka.presentation.payment.mvi.mapper.b r13 = new com.avito.android.autoteka.presentation.payment.mvi.mapper.b
            r13.<init>()
            com.avito.android.autoteka.presentation.payment.mvi.i r0 = r8.f97423v
            com.avito.android.autoteka.data.order.k r2 = r0.f97475a
            com.avito.android.autoteka.deeplinks.PaymentDetails r0 = r0.f97478d
            java.lang.String r3 = r0.getSearchKey()
            java.lang.String r4 = r0.getProductSlug()
            java.lang.String r5 = r0.getAutotekaX()
            java.lang.Long r6 = r0.getFromBlock()
            com.avito.android.util.UtmParamsV2 r7 = r0.getUtmParams()
            java.lang.String r14 = r0.getPromoCode()
            r8.f97420s = r12
            r8.f97418q = r13
            r8.f97419r = r1
            r0 = r2
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r14
            r7 = r15
            java.lang.Object r0 = r0.a(r1, r2, r3, r4, r5, r6, r7)
            if (r0 != r9) goto Lab
            return r9
        Lab:
            r1 = r12
        Lac:
            com.avito.android.remote.model.TypedResult r0 = (com.avito.android.remote.model.TypedResult) r0
            r13.getClass()
            com.avito.android.autoteka.presentation.payment.mvi.entity.AutotekaPaymentInternalAction r0 = com.avito.android.autoteka.presentation.payment.mvi.mapper.b.a(r0)
            r8.f97420s = r11
            r8.f97418q = r11
            r8.f97419r = r10
            java.lang.Object r0 = r1.emit(r0, r15)
            if (r0 != r9) goto Lc2
            return r9
        Lc2:
            kotlin.G0 r0 = kotlin.G0.f406611a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.autoteka.presentation.payment.mvi.C28720b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
