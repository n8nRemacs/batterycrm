package com.avito.android.mortgage.consultation.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.consultation.mvi.entity.MortgageConsultationInternalAction;
import com.avito.android.util.R0;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
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

/* compiled from: MortgageLoadConsultationFormUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/consultation/domain/c;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.mortgage.consultation.data.a f198571a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f198572b;

    /* compiled from: MortgageLoadConsultationFormUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.consultation.domain.MortgageLoadConsultationFormUseCase$invoke$1", f = "MortgageLoadConsultationFormUseCase.kt", i = {0, 1}, l = {20, 22, 23, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f198573q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f198574r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = c.this.new a(continuation);
            aVar.f198574r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f198573q
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L32
                if (r1 == r5) goto L2a
                if (r1 == r4) goto L22
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                goto L1d
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                kotlin.C42729a0.b(r7)
                goto L9e
            L22:
                java.lang.Object r1 = r6.f198574r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L59
            L2a:
                java.lang.Object r1 = r6.f198574r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L4a
            L32:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f198574r
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
                com.avito.android.mortgage.consultation.mvi.entity.MortgageConsultationInternalAction$SlotsLoadingStarted r1 = new com.avito.android.mortgage.consultation.mvi.entity.MortgageConsultationInternalAction$SlotsLoadingStarted
                r1.<init>()
                r6.f198574r = r7
                r6.f198573q = r5
                java.lang.Object r1 = r7.emit(r1, r6)
                if (r1 != r0) goto L49
                return r0
            L49:
                r1 = r7
            L4a:
                com.avito.android.mortgage.consultation.domain.c r7 = com.avito.android.mortgage.consultation.domain.c.this
                com.avito.android.mortgage.consultation.data.a r7 = r7.f198571a
                r6.f198574r = r1
                r6.f198573q = r4
                java.lang.Object r7 = r7.b(r6)
                if (r7 != r0) goto L59
                return r0
            L59:
                com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
                boolean r4 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto L78
                com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
                java.lang.Object r7 = r7.getResult()
                WZ.c r7 = (WZ.c) r7
                com.avito.android.mortgage.consultation.mvi.entity.MortgageConsultationInternalAction$SlotsLoadingCompleted r2 = new com.avito.android.mortgage.consultation.mvi.entity.MortgageConsultationInternalAction$SlotsLoadingCompleted
                r2.<init>(r7)
                r6.f198574r = r5
                r6.f198573q = r3
                java.lang.Object r7 = r1.emit(r2, r6)
                if (r7 != r0) goto L9e
                return r0
            L78:
                boolean r3 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto La1
                com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
                com.avito.android.remote.error.ApiError r3 = r7.getError()
                java.lang.Throwable r7 = r7.getCause()
                com.avito.android.util.ApiException r7 = com.avito.android.util.C35936s.a(r3, r7)
                com.avito.android.mortgage.consultation.mvi.entity.MortgageConsultationInternalAction$SlotsLoadingFailed r3 = new com.avito.android.mortgage.consultation.mvi.entity.MortgageConsultationInternalAction$SlotsLoadingFailed
                com.avito.android.remote.error.ApiError r7 = com.avito.android.error.z.n(r7)
                r3.<init>(r7)
                r6.f198574r = r5
                r6.f198573q = r2
                java.lang.Object r7 = r1.emit(r3, r6)
                if (r7 != r0) goto L9e
                return r0
            L9e:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            La1:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.consultation.domain.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public c(@k com.avito.android.mortgage.consultation.data.a aVar, @k R0 r02) {
        this.f198571a = aVar;
        this.f198572b = r02;
    }

    @k
    public final InterfaceC43160i<MortgageConsultationInternalAction> a() {
        return C43175k.I(this.f198572b.a(), C43175k.G(new a(null)));
    }
}
