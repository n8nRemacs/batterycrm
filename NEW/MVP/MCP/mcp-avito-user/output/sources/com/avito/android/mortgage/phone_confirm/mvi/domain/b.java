package com.avito.android.mortgage.phone_confirm.mvi.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.phone_confirm.mvi.entity.PhoneConfirmInternalAction;
import com.avito.android.util.R0;
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

/* compiled from: ConfirmCodeUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/phone_confirm/mvi/domain/b;", "Lcom/avito/android/mortgage/phone_confirm/mvi/domain/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.mortgage.phone_confirm.mvi.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final IZ.a f201616a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f201617b;

    /* compiled from: ConfirmCodeUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.phone_confirm.mvi.domain.ConfirmCodeUseCaseImpl$confirmPhone$1", f = "ConfirmCodeUseCase.kt", i = {0, 1}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP, AvailableCode.HMS_IS_SPOOF, 30, 31}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f201618q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f201619r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f201621t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f201622u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f201623v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f201621t = str;
            this.f201622u = str2;
            this.f201623v = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(this.f201621t, this.f201622u, this.f201623v, continuation);
            aVar.f201619r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f201618q
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
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                kotlin.C42729a0.b(r8)
                goto Lac
            L22:
                java.lang.Object r1 = r7.f201619r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L5f
            L2a:
                java.lang.Object r1 = r7.f201619r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L4a
            L32:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f201619r
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                com.avito.android.mortgage.phone_confirm.mvi.entity.PhoneConfirmInternalAction$ConfirmationStarted r1 = new com.avito.android.mortgage.phone_confirm.mvi.entity.PhoneConfirmInternalAction$ConfirmationStarted
                r1.<init>()
                r7.f201619r = r8
                r7.f201618q = r5
                java.lang.Object r1 = r8.emit(r1, r7)
                if (r1 != r0) goto L49
                return r0
            L49:
                r1 = r8
            L4a:
                com.avito.android.mortgage.phone_confirm.mvi.domain.b r8 = com.avito.android.mortgage.phone_confirm.mvi.domain.b.this
                IZ.a r8 = r8.f201616a
                r7.f201619r = r1
                r7.f201618q = r4
                java.lang.String r4 = r7.f201622u
                java.lang.String r5 = r7.f201623v
                java.lang.String r6 = r7.f201621t
                java.lang.Object r8 = r8.A(r6, r4, r5, r7)
                if (r8 != r0) goto L5f
                return r0
            L5f:
                com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
                boolean r4 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto L86
                com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
                java.lang.Object r8 = r8.getResult()
                com.avito.android.mortgage.api.model.ConfirmAccessModel r8 = (com.avito.android.mortgage.api.model.ConfirmAccessModel) r8
                com.avito.android.mortgage.phone_confirm.mvi.entity.PhoneConfirmInternalAction$ConfirmationCompleted r2 = new com.avito.android.mortgage.phone_confirm.mvi.entity.PhoneConfirmInternalAction$ConfirmationCompleted
                boolean r4 = r8.getAccess()
                java.lang.String r8 = r8.getError()
                r2.<init>(r4, r8)
                r7.f201619r = r5
                r7.f201618q = r3
                java.lang.Object r8 = r1.emit(r2, r7)
                if (r8 != r0) goto Lac
                return r0
            L86:
                boolean r3 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto Laf
                com.avito.android.remote.model.TypedResult$Error r8 = (com.avito.android.remote.model.TypedResult.Error) r8
                com.avito.android.remote.error.ApiError r3 = r8.getError()
                java.lang.Throwable r8 = r8.getCause()
                com.avito.android.util.ApiException r8 = com.avito.android.util.C35936s.a(r3, r8)
                com.avito.android.mortgage.phone_confirm.mvi.entity.PhoneConfirmInternalAction$ConfirmationFailed r3 = new com.avito.android.mortgage.phone_confirm.mvi.entity.PhoneConfirmInternalAction$ConfirmationFailed
                com.avito.android.remote.error.ApiError r8 = com.avito.android.error.z.n(r8)
                r3.<init>(r8)
                r7.f201619r = r5
                r7.f201618q = r2
                java.lang.Object r8 = r1.emit(r3, r7)
                if (r8 != r0) goto Lac
                return r0
            Lac:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            Laf:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.phone_confirm.mvi.domain.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(@k IZ.a aVar, @k R0 r02) {
        this.f201616a = aVar;
        this.f201617b = r02;
    }

    @Override // com.avito.android.mortgage.phone_confirm.mvi.domain.a
    @k
    public final InterfaceC43160i<PhoneConfirmInternalAction> a(@k String str, @k String str2, @k String str3) {
        return C43175k.I(this.f201617b.a(), C43175k.G(new a(str, str2, str3, null)));
    }
}
