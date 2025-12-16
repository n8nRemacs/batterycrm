package com.avito.android.tariff.cpx.info.mvi.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.tariff.cpx.info.mvi.entity.TariffCpxInfoInternalAction;
import com.avito.android.util.R0;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: GetTariffCpxInfoUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/info/mvi/domain/b;", "Lcom/avito/android/tariff/cpx/info/mvi/domain/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements com.avito.android.tariff.cpx.info.mvi.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final RB0.a f296696a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f296697b;

    /* compiled from: GetTariffCpxInfoUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.tariff.cpx.info.mvi.domain.GetTariffCpxInfoUseCaseImpl$execute$1", f = "GetTariffCpxInfoUseCase.kt", i = {0, 1}, l = {22, 23, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f296698q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f296699r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f296700s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ b f296701t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z12, b bVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f296700s = z12;
            this.f296701t = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f296700s, this.f296701t, continuation);
            aVar.f296699r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
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
                int r1 = r6.f296698q
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
                goto L96
            L22:
                java.lang.Object r1 = r6.f296699r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L5d
            L2a:
                java.lang.Object r1 = r6.f296699r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L4e
            L32:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f296699r
                r1 = r7
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                boolean r7 = r6.f296700s
                if (r7 == 0) goto L4e
                com.avito.android.tariff.cpx.info.mvi.entity.TariffCpxInfoInternalAction$Loading r7 = new com.avito.android.tariff.cpx.info.mvi.entity.TariffCpxInfoInternalAction$Loading
                r7.<init>()
                r6.f296699r = r1
                r6.f296698q = r5
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L4e
                return r0
            L4e:
                com.avito.android.tariff.cpx.info.mvi.domain.b r7 = r6.f296701t
                RB0.a r7 = r7.f296696a
                r6.f296699r = r1
                r6.f296698q = r4
                java.lang.Object r7 = r7.b(r6)
                if (r7 != r0) goto L5d
                return r0
            L5d:
                com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
                boolean r4 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
                r5 = 0
                if (r4 == 0) goto L7a
                com.avito.android.tariff.cpx.info.mvi.entity.TariffCpxInfoInternalAction$Error$ScreenError r2 = new com.avito.android.tariff.cpx.info.mvi.entity.TariffCpxInfoInternalAction$Error$ScreenError
                com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
                com.avito.android.remote.error.ApiError r7 = r7.getError()
                r2.<init>(r7, r5)
                r6.f296699r = r5
                r6.f296698q = r3
                java.lang.Object r7 = r1.emit(r2, r6)
                if (r7 != r0) goto L96
                return r0
            L7a:
                boolean r3 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r3 == 0) goto L96
                com.avito.android.tariff.cpx.info.mvi.entity.TariffCpxInfoInternalAction$Content r3 = new com.avito.android.tariff.cpx.info.mvi.entity.TariffCpxInfoInternalAction$Content
                com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
                java.lang.Object r7 = r7.getResult()
                UB0.c r7 = (UB0.c) r7
                r3.<init>(r7)
                r6.f296699r = r5
                r6.f296698q = r2
                java.lang.Object r7 = r1.emit(r3, r6)
                if (r7 != r0) goto L96
                return r0
            L96:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.tariff.cpx.info.mvi.domain.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(@k RB0.a aVar, @k R0 r02) {
        this.f296696a = aVar;
        this.f296697b = r02;
    }

    @Override // com.avito.android.tariff.cpx.info.mvi.domain.a
    @k
    public final InterfaceC43160i<TariffCpxInfoInternalAction> a(boolean z12) {
        return C43175k.I(this.f296697b.a(), C43175k.G(new a(z12, this, null)));
    }
}
