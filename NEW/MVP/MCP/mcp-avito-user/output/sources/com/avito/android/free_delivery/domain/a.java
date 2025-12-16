package com.avito.android.free_delivery.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.free_delivery.FreeDeliveryDetails;
import com.avito.android.free_delivery.mvi.entity.FreeDeliveryInternalAction;
import com.avito.android.remote.error.f;
import com.avito.android.util.R0;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
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

/* compiled from: UpdateDeliverySubsidyUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/free_delivery/domain/a;", "", "_avito_free-delivery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final R0 f158683a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e<SE.a> f158684b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final FreeDeliveryDetails f158685c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final f f158686d;

    /* compiled from: UpdateDeliverySubsidyUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/free_delivery/mvi/entity/FreeDeliveryInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.free_delivery.domain.UpdateDeliverySubsidyUseCase$invoke$1", f = "UpdateDeliverySubsidyUseCase.kt", i = {0, 1}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.ERROR_ON_ACTIVITY_RESULT, 30, 33}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.free_delivery.domain.a$a, reason: collision with other inner class name */
    public static final class C4638a extends SuspendLambda implements p<InterfaceC43172j<? super FreeDeliveryInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f158687q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f158688r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f158690t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4638a(int i12, Continuation<? super C4638a> continuation) {
            super(2, continuation);
            this.f158690t = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C4638a c4638a = a.this.new C4638a(this.f158690t, continuation);
            c4638a.f158688r = obj;
            return c4638a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super FreeDeliveryInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C4638a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r14.f158687q
                int r2 = r14.f158690t
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                com.avito.android.free_delivery.domain.a r7 = com.avito.android.free_delivery.domain.a.this
                if (r1 == 0) goto L36
                if (r1 == r6) goto L2e
                if (r1 == r5) goto L26
                if (r1 == r4) goto L21
                if (r1 != r3) goto L19
                goto L21
            L19:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L21:
                kotlin.C42729a0.b(r15)
                goto Lae
            L26:
                java.lang.Object r1 = r14.f158688r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r15)
                goto L67
            L2e:
                java.lang.Object r1 = r14.f158688r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r15)
                goto L4b
            L36:
                kotlin.C42729a0.b(r15)
                java.lang.Object r15 = r14.f158688r
                kotlinx.coroutines.flow.j r15 = (kotlinx.coroutines.flow.InterfaceC43172j) r15
                com.avito.android.free_delivery.mvi.entity.FreeDeliveryInternalAction$Loading r1 = com.avito.android.free_delivery.mvi.entity.FreeDeliveryInternalAction.Loading.f158790b
                r14.f158688r = r15
                r14.f158687q = r6
                java.lang.Object r1 = r15.emit(r1, r14)
                if (r1 != r0) goto L4a
                return r0
            L4a:
                r1 = r15
            L4b:
                h31.e<SE.a> r15 = r7.f158684b
                java.lang.Object r15 = r15.get()
                r8 = r15
                SE.a r8 = (SE.a) r8
                com.avito.android.free_delivery.FreeDeliveryDetails r15 = r7.f158685c
                long r11 = r15.getItemId()
                long r9 = (long) r2
                r14.f158688r = r1
                r14.f158687q = r5
                r13 = r14
                java.lang.Object r15 = r8.a(r9, r11, r13)
                if (r15 != r0) goto L67
                return r0
            L67:
                com.avito.android.remote.model.TypedResult r15 = (com.avito.android.remote.model.TypedResult) r15
                boolean r5 = r15 instanceof com.avito.android.remote.model.TypedResult.Success
                r6 = 0
                if (r5 == 0) goto L86
                com.avito.android.remote.model.TypedResult$Success r15 = (com.avito.android.remote.model.TypedResult.Success) r15
                java.lang.Object r15 = r15.getResult()
                TE.a r15 = (TE.a) r15
                com.avito.android.free_delivery.mvi.entity.FreeDeliveryInternalAction$Updated r15 = new com.avito.android.free_delivery.mvi.entity.FreeDeliveryInternalAction$Updated
                r15.<init>(r2)
                r14.f158688r = r6
                r14.f158687q = r4
                java.lang.Object r15 = r1.emit(r15, r14)
                if (r15 != r0) goto Lae
                return r0
            L86:
                boolean r2 = r15 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r2 == 0) goto Lb1
                com.avito.android.remote.model.TypedResult$Error r15 = (com.avito.android.remote.model.TypedResult.Error) r15
                com.avito.android.remote.error.ApiError r2 = r15.getError()
                java.lang.Throwable r15 = r15.getCause()
                com.avito.android.util.ApiException r15 = com.avito.android.util.C35936s.a(r2, r15)
                com.avito.android.free_delivery.mvi.entity.FreeDeliveryInternalAction$Error r2 = new com.avito.android.free_delivery.mvi.entity.FreeDeliveryInternalAction$Error
                com.avito.android.remote.error.f r4 = r7.f158686d
                com.avito.android.remote.error.ApiError r15 = r4.a(r15)
                r2.<init>(r15)
                r14.f158688r = r6
                r14.f158687q = r3
                java.lang.Object r15 = r1.emit(r2, r14)
                if (r15 != r0) goto Lae
                return r0
            Lae:
                kotlin.G0 r15 = kotlin.G0.f406611a
                return r15
            Lb1:
                kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
                r15.<init>()
                throw r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.free_delivery.domain.a.C4638a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@k R0 r02, @k e<SE.a> eVar, @k FreeDeliveryDetails freeDeliveryDetails, @k f fVar) {
        this.f158683a = r02;
        this.f158684b = eVar;
        this.f158685c = freeDeliveryDetails;
        this.f158686d = fVar;
    }

    @k
    public final InterfaceC43160i<FreeDeliveryInternalAction> a(int i12) {
        return C43175k.I(this.f158683a.a(), C43175k.G(new C4638a(i12, null)));
    }
}
