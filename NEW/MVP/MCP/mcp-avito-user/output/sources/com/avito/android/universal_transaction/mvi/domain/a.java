package com.avito.android.universal_transaction.mvi.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.universal_transaction.mvi.entity.TransactionInternalAction;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
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

/* compiled from: GetTransactionDetailsUseCase.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_transaction/mvi/domain/a;", "", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.universal_transaction.mvi.data.a f306403a;

    /* compiled from: GetTransactionDetailsUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/universal_transaction/mvi/entity/TransactionInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.universal_transaction.mvi.domain.GetTransactionDetailsUseCase$invoke$1", f = "GetTransactionDetailsUseCase.kt", i = {0, 1}, l = {22, 23, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.universal_transaction.mvi.domain.a$a, reason: collision with other inner class name */
    public static final class C9414a extends SuspendLambda implements p<InterfaceC43172j<? super TransactionInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f306404q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f306405r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ BG0.a f306407t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9414a(BG0.a aVar, Continuation<? super C9414a> continuation) {
            super(2, continuation);
            this.f306407t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C9414a c9414a = a.this.new C9414a(this.f306407t, continuation);
            c9414a.f306405r = obj;
            return c9414a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TransactionInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C9414a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.f306404q
                com.avito.android.universal_transaction.mvi.domain.a r2 = com.avito.android.universal_transaction.mvi.domain.a.this
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
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1f:
                kotlin.C42729a0.b(r11)
                goto Lce
            L24:
                java.lang.Object r1 = r10.f306405r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto L5b
            L2c:
                java.lang.Object r1 = r10.f306405r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto L4c
            L34:
                kotlin.C42729a0.b(r11)
                java.lang.Object r11 = r10.f306405r
                kotlinx.coroutines.flow.j r11 = (kotlinx.coroutines.flow.InterfaceC43172j) r11
                com.avito.android.universal_transaction.mvi.entity.TransactionInternalAction$LoadingStarted r1 = new com.avito.android.universal_transaction.mvi.entity.TransactionInternalAction$LoadingStarted
                r1.<init>()
                r10.f306405r = r11
                r10.f306404q = r6
                java.lang.Object r1 = r11.emit(r1, r10)
                if (r1 != r0) goto L4b
                return r0
            L4b:
                r1 = r11
            L4c:
                com.avito.android.universal_transaction.mvi.data.a r11 = r2.f306403a
                r10.f306405r = r1
                r10.f306404q = r5
                BG0.a r5 = r10.f306407t
                java.lang.Object r11 = r11.a(r5, r10)
                if (r11 != r0) goto L5b
                return r0
            L5b:
                com.avito.android.remote.model.TypedResult r11 = (com.avito.android.remote.model.TypedResult) r11
                boolean r5 = r11 instanceof com.avito.android.remote.model.TypedResult.Error
                r6 = 0
                if (r5 == 0) goto L78
                com.avito.android.universal_transaction.mvi.entity.TransactionInternalAction$LoadingFailed r2 = new com.avito.android.universal_transaction.mvi.entity.TransactionInternalAction$LoadingFailed
                com.avito.android.remote.model.TypedResult$Error r11 = (com.avito.android.remote.model.TypedResult.Error) r11
                com.avito.android.remote.error.ApiError r11 = r11.getError()
                r2.<init>(r11)
                r10.f306405r = r6
                r10.f306404q = r4
                java.lang.Object r11 = r1.emit(r2, r10)
                if (r11 != r0) goto Lce
                return r0
            L78:
                boolean r4 = r11 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r4 == 0) goto Lce
                com.avito.android.remote.model.TypedResult$Success r11 = (com.avito.android.remote.model.TypedResult.Success) r11
                java.lang.Object r11 = r11.getResult()
                AG0.a r11 = (AG0.a) r11
                com.avito.android.universal_transaction.mvi.entity.TransactionInternalAction$ContentLoaded r4 = new com.avito.android.universal_transaction.mvi.entity.TransactionInternalAction$ContentLoaded
                AG0.c r5 = r11.getResult()
                com.avito.android.remote.model.BeduinV2 r5 = r5.getContent()
                java.lang.String r5 = r5.getJson()
                AG0.c r11 = r11.getResult()
                AG0.d r11 = r11.getStatusBarColor()
                r2.getClass()
                com.avito.android.remote.model.UniversalColor r2 = new com.avito.android.remote.model.UniversalColor
                java.lang.String r7 = r11.getValueName()
                com.avito.android.remote.model.Color r8 = new com.avito.android.remote.model.Color
                java.lang.String r9 = r11.getValueDark()
                int r9 = android.graphics.Color.parseColor(r9)
                r8.<init>(r9)
                com.avito.android.remote.model.Color r9 = new com.avito.android.remote.model.Color
                java.lang.String r11 = r11.getValue()
                int r11 = android.graphics.Color.parseColor(r11)
                r9.<init>(r11)
                r2.<init>(r7, r8, r9)
                r4.<init>(r5, r2)
                r10.f306405r = r6
                r10.f306404q = r3
                java.lang.Object r11 = r1.emit(r4, r10)
                if (r11 != r0) goto Lce
                return r0
            Lce:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.universal_transaction.mvi.domain.a.C9414a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@k com.avito.android.universal_transaction.mvi.data.a aVar) {
        this.f306403a = aVar;
    }

    @k
    public final InterfaceC43160i<TransactionInternalAction> a(@k BG0.a aVar) {
        return C43175k.G(new C9414a(aVar, null));
    }
}
