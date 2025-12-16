package com.avito.android.autoteka.presentation.payment.mvi;

import com.avito.android.autoteka.deeplinks.PaymentDetails;
import com.avito.android.autoteka.presentation.payment.mvi.entity.AutotekaPaymentInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AutotekaPaymentBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/presentation/payment/mvi/m;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m implements com.avito.android.arch.mvi.b<AutotekaPaymentInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.autoteka.data.order.k f97493a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PaymentDetails f97494b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f97495c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f97496d;

    /* compiled from: AutotekaPaymentBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.autoteka.presentation.payment.mvi.AutotekaPaymentBootstrap$produce$1", f = "AutotekaPaymentBootstrap.kt", i = {0}, l = {AvailableCode.HMS_IS_SPOOF, 32, 30}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AutotekaPaymentInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public com.avito.android.autoteka.presentation.payment.mvi.mapper.b f97497q;

        /* renamed from: r, reason: collision with root package name */
        public int f97498r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f97499s;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = m.this.new a(continuation);
            aVar.f97499s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AutotekaPaymentInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0087 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
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
                int r0 = r8.f97498r
                r10 = 3
                r1 = 2
                r2 = 1
                r11 = 0
                com.avito.android.autoteka.presentation.payment.mvi.m r3 = com.avito.android.autoteka.presentation.payment.mvi.m.this
                if (r0 == 0) goto L38
                if (r0 == r2) goto L2f
                if (r0 == r1) goto L22
                if (r0 != r10) goto L1a
                kotlin.C42729a0.b(r16)
                goto L9f
            L1a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L22:
                com.avito.android.autoteka.presentation.payment.mvi.mapper.b r0 = r8.f97497q
                java.lang.Object r1 = r8.f97499s
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r16)
                r13 = r0
                r0 = r16
                goto L89
            L2f:
                java.lang.Object r0 = r8.f97499s
                kotlinx.coroutines.flow.j r0 = (kotlinx.coroutines.flow.InterfaceC43172j) r0
                kotlin.C42729a0.b(r16)
            L36:
                r12 = r0
                goto L53
            L38:
                kotlin.C42729a0.b(r16)
                java.lang.Object r0 = r8.f97499s
                kotlinx.coroutines.flow.j r0 = (kotlinx.coroutines.flow.InterfaceC43172j) r0
                boolean r4 = r3.f97495c
                if (r4 != 0) goto L9f
                com.avito.android.autoteka.presentation.payment.mvi.entity.AutotekaPaymentInternalAction$Loading r4 = new com.avito.android.autoteka.presentation.payment.mvi.entity.AutotekaPaymentInternalAction$Loading
                r4.<init>(r11, r2, r11)
                r8.f97499s = r0
                r8.f97498r = r2
                java.lang.Object r2 = r0.emit(r4, r15)
                if (r2 != r9) goto L36
                return r9
            L53:
                com.avito.android.autoteka.presentation.payment.mvi.mapper.b r13 = new com.avito.android.autoteka.presentation.payment.mvi.mapper.b
                r13.<init>()
                com.avito.android.autoteka.data.order.k r0 = r3.f97493a
                com.avito.android.autoteka.deeplinks.PaymentDetails r2 = r3.f97494b
                java.lang.String r3 = r2.getSearchKey()
                java.lang.String r4 = r2.getProductSlug()
                java.lang.String r5 = r2.getAutotekaX()
                java.lang.Long r6 = r2.getFromBlock()
                com.avito.android.util.UtmParamsV2 r7 = r2.getUtmParams()
                java.lang.String r14 = r2.getPromoCode()
                r8.f97499s = r12
                r8.f97497q = r13
                r8.f97498r = r1
                r1 = r3
                r2 = r4
                r3 = r5
                r4 = r6
                r5 = r7
                r6 = r14
                r7 = r15
                java.lang.Object r0 = r0.a(r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L88
                return r9
            L88:
                r1 = r12
            L89:
                com.avito.android.remote.model.TypedResult r0 = (com.avito.android.remote.model.TypedResult) r0
                r13.getClass()
                com.avito.android.autoteka.presentation.payment.mvi.entity.AutotekaPaymentInternalAction r0 = com.avito.android.autoteka.presentation.payment.mvi.mapper.b.a(r0)
                r8.f97499s = r11
                r8.f97497q = r11
                r8.f97498r = r10
                java.lang.Object r0 = r1.emit(r0, r15)
                if (r0 != r9) goto L9f
                return r9
            L9f:
                kotlin.G0 r0 = kotlin.G0.f406611a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.autoteka.presentation.payment.mvi.m.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public m(@Y61.k com.avito.android.autoteka.data.order.k kVar, @Y61.k PaymentDetails paymentDetails, boolean z12, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f97493a = kVar;
        this.f97494b = paymentDetails;
        this.f97495c = z12;
        this.f97496d = aVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<AutotekaPaymentInternalAction> a() {
        return C43175k.N(new l(new k(kotlinx.coroutines.rx3.y.a(this.f97496d.d9()))), C43175k.G(new a(null)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
