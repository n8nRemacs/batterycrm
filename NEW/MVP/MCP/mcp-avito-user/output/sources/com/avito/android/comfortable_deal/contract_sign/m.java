package com.avito.android.comfortable_deal.contract_sign;

import Jp.InterfaceC14233a;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.contract_sign.mvi.entity.ContractSignInternalAction;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.squareup.anvil.annotations.ContributesBinding;
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

/* compiled from: ContractSignInteractor.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/contract_sign/m;", "Lcom/avito/android/comfortable_deal/contract_sign/l;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14233a f120835a;

    /* compiled from: ContractSignInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/comfortable_deal/contract_sign/mvi/entity/ContractSignInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.contract_sign.ContractSignInteractorImpl$loadOfferForAgent$1", f = "ContractSignInteractor.kt", i = {0, 1}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 30, 34}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ContractSignInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f120836q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f120837r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = m.this.new a(continuation);
            aVar.f120837r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ContractSignInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
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
                int r1 = r13.f120836q
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L35
                if (r1 == r6) goto L2d
                if (r1 == r5) goto L25
                if (r1 == r4) goto L20
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L20
            L18:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L20:
                kotlin.C42729a0.b(r14)
                goto Lc5
            L25:
                java.lang.Object r1 = r13.f120837r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r14)
                goto L5c
            L2d:
                java.lang.Object r1 = r13.f120837r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r14)
                goto L4d
            L35:
                kotlin.C42729a0.b(r14)
                java.lang.Object r14 = r13.f120837r
                kotlinx.coroutines.flow.j r14 = (kotlinx.coroutines.flow.InterfaceC43172j) r14
                com.avito.android.comfortable_deal.contract_sign.mvi.entity.ContractSignInternalAction$LoadingOffer r1 = new com.avito.android.comfortable_deal.contract_sign.mvi.entity.ContractSignInternalAction$LoadingOffer
                r1.<init>()
                r13.f120837r = r14
                r13.f120836q = r6
                java.lang.Object r1 = r14.emit(r1, r13)
                if (r1 != r0) goto L4c
                return r0
            L4c:
                r1 = r14
            L4d:
                com.avito.android.comfortable_deal.contract_sign.m r14 = com.avito.android.comfortable_deal.contract_sign.m.this
                Jp.a r14 = r14.f120835a
                r13.f120837r = r1
                r13.f120836q = r5
                java.lang.Object r14 = r14.f(r13)
                if (r14 != r0) goto L5c
                return r0
            L5c:
                com.avito.android.remote.model.TypedResult r14 = (com.avito.android.remote.model.TypedResult) r14
                boolean r5 = r14 instanceof com.avito.android.remote.model.TypedResult.Success
                r6 = 0
                if (r5 == 0) goto Lab
                com.avito.android.remote.model.TypedResult$Success r14 = (com.avito.android.remote.model.TypedResult.Success) r14
                java.lang.Object r2 = r14.getResult()
                Kp.a r2 = (Kp.C14339a) r2
                java.lang.String r2 = r2.getUrl()
                int r2 = r2.length()
                if (r2 <= 0) goto L8f
                com.avito.android.comfortable_deal.contract_sign.mvi.entity.ContractSignInternalAction$LoadedOffer r2 = new com.avito.android.comfortable_deal.contract_sign.mvi.entity.ContractSignInternalAction$LoadedOffer
                java.lang.Object r14 = r14.getResult()
                Kp.a r14 = (Kp.C14339a) r14
                java.lang.String r14 = r14.getUrl()
                r2.<init>(r14)
                r13.f120837r = r6
                r13.f120836q = r4
                java.lang.Object r14 = r1.emit(r2, r13)
                if (r14 != r0) goto Lc5
                return r0
            L8f:
                com.avito.android.comfortable_deal.contract_sign.mvi.entity.ContractSignInternalAction$FailedOffer r14 = new com.avito.android.comfortable_deal.contract_sign.mvi.entity.ContractSignInternalAction$FailedOffer
                com.avito.android.remote.error.ApiError$UnknownError r2 = new com.avito.android.remote.error.ApiError$UnknownError
                r9 = 0
                r10 = 0
                java.lang.String r8 = ""
                r11 = 6
                r12 = 0
                r7 = r2
                r7.<init>(r8, r9, r10, r11, r12)
                r14.<init>(r2)
                r13.f120837r = r6
                r13.f120836q = r3
                java.lang.Object r14 = r1.emit(r14, r13)
                if (r14 != r0) goto Lc5
                return r0
            Lab:
                boolean r3 = r14 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto Lc5
                com.avito.android.comfortable_deal.contract_sign.mvi.entity.ContractSignInternalAction$FailedOffer r3 = new com.avito.android.comfortable_deal.contract_sign.mvi.entity.ContractSignInternalAction$FailedOffer
                com.avito.android.remote.model.TypedResult$Error r14 = (com.avito.android.remote.model.TypedResult.Error) r14
                com.avito.android.remote.error.ApiError r14 = r14.getError()
                r3.<init>(r14)
                r13.f120837r = r6
                r13.f120836q = r2
                java.lang.Object r14 = r1.emit(r3, r13)
                if (r14 != r0) goto Lc5
                return r0
            Lc5:
                kotlin.G0 r14 = kotlin.G0.f406611a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.contract_sign.m.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public m(@Y61.k InterfaceC14233a interfaceC14233a) {
        this.f120835a = interfaceC14233a;
    }

    @Override // com.avito.android.comfortable_deal.contract_sign.l
    @Y61.k
    public final InterfaceC43160i<ContractSignInternalAction> a() {
        return C43175k.G(new a(null));
    }
}
