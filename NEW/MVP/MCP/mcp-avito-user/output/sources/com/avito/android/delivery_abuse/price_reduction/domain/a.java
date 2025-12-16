package com.avito.android.delivery_abuse.price_reduction.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.delivery_abuse.price_reduction.mvi.entity.PriceReductionInternalAction;
import com.avito.android.remote.error.f;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
import h31.e;
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
import zv.InterfaceC50632a;

/* compiled from: PriceConfirmationUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_abuse/price_reduction/domain/a;", "", "_avito_delivery-abuse_price-reduction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final R0 f134827a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e<InterfaceC50632a> f134828b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final f f134829c;

    /* compiled from: PriceConfirmationUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/delivery_abuse/price_reduction/mvi/entity/PriceReductionInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.delivery_abuse.price_reduction.domain.PriceConfirmationUseCase$invoke$1", f = "PriceConfirmationUseCase.kt", i = {0, 1}, l = {21, 22, AvailableCode.USER_IGNORE_PREVIOUS_POPUP, 35}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.delivery_abuse.price_reduction.domain.a$a, reason: collision with other inner class name */
    public static final class C4073a extends SuspendLambda implements p<InterfaceC43172j<? super PriceReductionInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f134830q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f134831r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f134833t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f134834u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ long f134835v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4073a(long j12, long j13, long j14, Continuation<? super C4073a> continuation) {
            super(2, continuation);
            this.f134833t = j12;
            this.f134834u = j13;
            this.f134835v = j14;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C4073a c4073a = a.this.new C4073a(this.f134833t, this.f134834u, this.f134835v, continuation);
            c4073a.f134831r = obj;
            return c4073a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super PriceReductionInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C4073a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r13.f134830q
                com.avito.android.delivery_abuse.price_reduction.domain.a r2 = com.avito.android.delivery_abuse.price_reduction.domain.a.this
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L34
                if (r1 == r6) goto L2c
                if (r1 == r5) goto L24
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                goto L1f
            L17:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1f:
                kotlin.C42729a0.b(r14)
                goto Lab
            L24:
                java.lang.Object r1 = r13.f134831r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r14)
                goto L62
            L2c:
                java.lang.Object r1 = r13.f134831r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r14)
                goto L49
            L34:
                kotlin.C42729a0.b(r14)
                java.lang.Object r14 = r13.f134831r
                kotlinx.coroutines.flow.j r14 = (kotlinx.coroutines.flow.InterfaceC43172j) r14
                com.avito.android.delivery_abuse.price_reduction.mvi.entity.PriceReductionInternalAction$Loading r1 = com.avito.android.delivery_abuse.price_reduction.mvi.entity.PriceReductionInternalAction.Loading.f134903b
                r13.f134831r = r14
                r13.f134830q = r6
                java.lang.Object r1 = r14.emit(r1, r13)
                if (r1 != r0) goto L48
                return r0
            L48:
                r1 = r14
            L49:
                h31.e<zv.a> r14 = r2.f134828b
                java.lang.Object r14 = r14.get()
                r7 = r14
                zv.a r7 = (zv.InterfaceC50632a) r7
                r13.f134831r = r1
                r13.f134830q = r5
                long r8 = r13.f134833t
                long r10 = r13.f134834u
                r12 = r13
                java.lang.Object r14 = r7.a(r8, r10, r12)
                if (r14 != r0) goto L62
                return r0
            L62:
                com.avito.android.remote.model.TypedResult r14 = (com.avito.android.remote.model.TypedResult) r14
                boolean r5 = r14 instanceof com.avito.android.remote.model.TypedResult.Success
                r7 = 0
                if (r5 == 0) goto L83
                com.avito.android.remote.model.TypedResult$Success r14 = (com.avito.android.remote.model.TypedResult.Success) r14
                java.lang.Object r14 = r14.getResult()
                Av.a r14 = (Av.C13084a) r14
                com.avito.android.delivery_abuse.price_reduction.mvi.entity.PriceReductionInternalAction$SelectPrice r14 = new com.avito.android.delivery_abuse.price_reduction.mvi.entity.PriceReductionInternalAction$SelectPrice
                long r2 = r13.f134835v
                r14.<init>(r2, r6)
                r13.f134831r = r7
                r13.f134830q = r4
                java.lang.Object r14 = r1.emit(r14, r13)
                if (r14 != r0) goto Lab
                return r0
            L83:
                boolean r4 = r14 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r4 == 0) goto Lae
                com.avito.android.remote.model.TypedResult$Error r14 = (com.avito.android.remote.model.TypedResult.Error) r14
                com.avito.android.remote.error.ApiError r4 = r14.getError()
                java.lang.Throwable r14 = r14.getCause()
                com.avito.android.util.ApiException r14 = com.avito.android.util.C35936s.a(r4, r14)
                com.avito.android.delivery_abuse.price_reduction.mvi.entity.PriceReductionInternalAction$Error r4 = new com.avito.android.delivery_abuse.price_reduction.mvi.entity.PriceReductionInternalAction$Error
                com.avito.android.remote.error.f r2 = r2.f134829c
                com.avito.android.remote.error.ApiError r14 = r2.a(r14)
                r4.<init>(r14)
                r13.f134831r = r7
                r13.f134830q = r3
                java.lang.Object r14 = r1.emit(r4, r13)
                if (r14 != r0) goto Lab
                return r0
            Lab:
                kotlin.G0 r14 = kotlin.G0.f406611a
                return r14
            Lae:
                kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
                r14.<init>()
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.delivery_abuse.price_reduction.domain.a.C4073a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@k R0 r02, @k e<InterfaceC50632a> eVar, @k f fVar) {
        this.f134827a = r02;
        this.f134828b = eVar;
        this.f134829c = fVar;
    }

    @k
    public final InterfaceC43160i<PriceReductionInternalAction> a(long j12, long j13, long j14) {
        return C43175k.I(this.f134827a.a(), C43175k.G(new C4073a(j12, j14, j13, null)));
    }
}
