package com.avito.android.screens.bbip_private_v2.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2InternalAction;
import com.avito.android.util.R0;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import ih.InterfaceC41399a;
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

/* compiled from: BbipPrivateV2PostForecastUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/domain/e;", "", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC41399a f260930a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f260931b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.screens.bbip_private_v2.data.a f260932c;

    /* compiled from: BbipPrivateV2PostForecastUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.screens.bbip_private_v2.domain.BbipPrivateV2PostForecastUseCase$invoke$1", f = "BbipPrivateV2PostForecastUseCase.kt", i = {0, 1}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.USER_IGNORE_PREVIOUS_POPUP, AvailableCode.HMS_IS_SPOOF, 37}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f260933q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f260934r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f260935s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ e f260936t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ qp0.b f260937u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z12, e eVar, qp0.b bVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f260935s = z12;
            this.f260936t = eVar;
            this.f260937u = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f260935s, this.f260936t, this.f260937u, continuation);
            aVar.f260934r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f260933q
                qp0.b r2 = r8.f260937u
                boolean r3 = r8.f260935s
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                if (r1 == 0) goto L36
                if (r1 == r7) goto L2e
                if (r1 == r6) goto L26
                if (r1 == r5) goto L21
                if (r1 != r4) goto L19
                goto L21
            L19:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L21:
                kotlin.C42729a0.b(r9)
                goto La8
            L26:
                java.lang.Object r1 = r8.f260934r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L63
            L2e:
                java.lang.Object r1 = r8.f260934r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L4e
            L36:
                kotlin.C42729a0.b(r9)
                java.lang.Object r9 = r8.f260934r
                kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
                com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2InternalAction$ForecastLoading r1 = new com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2InternalAction$ForecastLoading
                r1.<init>(r3)
                r8.f260934r = r9
                r8.f260933q = r7
                java.lang.Object r1 = r9.emit(r1, r8)
                if (r1 != r0) goto L4d
                return r0
            L4d:
                r1 = r9
            L4e:
                com.avito.android.screens.bbip_private_v2.domain.e r9 = r8.f260936t
                com.avito.android.screens.bbip_private_v2.data.a r7 = r9.f260932c
                java.util.Map r7 = r7.a(r2)
                r8.f260934r = r1
                r8.f260933q = r6
                ih.a r9 = r9.f260930a
                java.lang.Object r9 = r9.a(r7, r8)
                if (r9 != r0) goto L63
                return r0
            L63:
                com.avito.android.remote.model.TypedResult r9 = (com.avito.android.remote.model.TypedResult) r9
                boolean r6 = r9 instanceof com.avito.android.remote.model.TypedResult.Success
                r7 = 0
                if (r6 == 0) goto L86
                com.avito.android.remote.model.TypedResult$Success r9 = (com.avito.android.remote.model.TypedResult.Success) r9
                java.lang.Object r9 = r9.getResult()
                jh.A r9 = (jh.C42376A) r9
                com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2InternalAction$ForecastContent r4 = new com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2InternalAction$ForecastContent
                java.lang.Integer r2 = r2.getDuration()
                r4.<init>(r9, r2, r3)
                r8.f260934r = r7
                r8.f260933q = r5
                java.lang.Object r9 = r1.emit(r4, r8)
                if (r9 != r0) goto La8
                return r0
            L86:
                boolean r2 = r9 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r2 == 0) goto Lab
                com.avito.android.remote.model.TypedResult$Error r9 = (com.avito.android.remote.model.TypedResult.Error) r9
                com.avito.android.remote.error.ApiError r2 = r9.getError()
                java.lang.Throwable r9 = r9.getCause()
                com.avito.android.util.ApiException r9 = com.avito.android.util.C35936s.a(r2, r9)
                com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2InternalAction$ForecastError r2 = new com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2InternalAction$ForecastError
                r2.<init>(r9, r3)
                r8.f260934r = r7
                r8.f260933q = r4
                java.lang.Object r9 = r1.emit(r2, r8)
                if (r9 != r0) goto La8
                return r0
            La8:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            Lab:
                kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
                r9.<init>()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.screens.bbip_private_v2.domain.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public e(@k InterfaceC41399a interfaceC41399a, @k R0 r02, @k com.avito.android.screens.bbip_private_v2.data.a aVar) {
        this.f260930a = interfaceC41399a;
        this.f260931b = r02;
        this.f260932c = aVar;
    }

    @k
    public final InterfaceC43160i<BbipPrivateV2InternalAction> a(@k qp0.b bVar, boolean z12) {
        return C43175k.I(this.f260931b.a(), C43175k.G(new a(z12, this, bVar, null)));
    }
}
