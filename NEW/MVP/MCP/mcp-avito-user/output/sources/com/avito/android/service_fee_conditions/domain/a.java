package com.avito.android.service_fee_conditions.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.service_fee_conditions.di.c;
import com.avito.android.service_fee_conditions.mvi.entity.ServiceFeeConditionsInternalAction;
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
import ou0.InterfaceC44941a;

/* compiled from: GetServiceFeeConditionsUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_fee_conditions/domain/a;", "", "_avito_service-fee-conditions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f278429a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC44941a f278430b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f278431c;

    /* compiled from: GetServiceFeeConditionsUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_fee_conditions.domain.GetServiceFeeConditionsUseCase$invoke$1", f = "GetServiceFeeConditionsUseCase.kt", i = {0, 1}, l = {19, 21, AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.service_fee_conditions.domain.a$a, reason: collision with other inner class name */
    public static final class C8278a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f278432q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f278433r;

        public C8278a(Continuation<? super C8278a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C8278a c8278a = a.this.new C8278a(continuation);
            c8278a.f278433r = obj;
            return c8278a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C8278a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
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
                int r1 = r6.f278432q
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
                goto L9c
            L22:
                java.lang.Object r1 = r6.f278433r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L5b
            L2a:
                java.lang.Object r1 = r6.f278433r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L4a
            L32:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f278433r
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
                com.avito.android.service_fee_conditions.mvi.entity.ServiceFeeConditionsInternalAction$Loading r1 = new com.avito.android.service_fee_conditions.mvi.entity.ServiceFeeConditionsInternalAction$Loading
                r1.<init>()
                r6.f278433r = r7
                r6.f278432q = r5
                java.lang.Object r1 = r7.emit(r1, r6)
                if (r1 != r0) goto L49
                return r0
            L49:
                r1 = r7
            L4a:
                com.avito.android.service_fee_conditions.domain.a r7 = com.avito.android.service_fee_conditions.domain.a.this
                ou0.a r5 = r7.f278430b
                r6.f278433r = r1
                r6.f278432q = r4
                java.lang.String r7 = r7.f278429a
                java.lang.Object r7 = r5.a(r7, r6)
                if (r7 != r0) goto L5b
                return r0
            L5b:
                com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
                boolean r4 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto L7a
                com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
                java.lang.Object r7 = r7.getResult()
                pu0.a r7 = (pu0.C47142a) r7
                com.avito.android.service_fee_conditions.mvi.entity.ServiceFeeConditionsInternalAction$Content r2 = new com.avito.android.service_fee_conditions.mvi.entity.ServiceFeeConditionsInternalAction$Content
                r2.<init>(r7)
                r6.f278433r = r5
                r6.f278432q = r3
                java.lang.Object r7 = r1.emit(r2, r6)
                if (r7 != r0) goto L9c
                return r0
            L7a:
                boolean r3 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto L9f
                com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
                com.avito.android.remote.error.ApiError r3 = r7.getError()
                java.lang.Throwable r7 = r7.getCause()
                com.avito.android.util.ApiException r7 = com.avito.android.util.C35936s.a(r3, r7)
                com.avito.android.service_fee_conditions.mvi.entity.ServiceFeeConditionsInternalAction$Error r3 = new com.avito.android.service_fee_conditions.mvi.entity.ServiceFeeConditionsInternalAction$Error
                r3.<init>(r7)
                r6.f278433r = r5
                r6.f278432q = r2
                java.lang.Object r7 = r1.emit(r3, r6)
                if (r7 != r0) goto L9c
                return r0
            L9c:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            L9f:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_fee_conditions.domain.a.C8278a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@c @k String str, @k InterfaceC44941a interfaceC44941a, @k R0 r02) {
        this.f278429a = str;
        this.f278430b = interfaceC44941a;
        this.f278431c = r02;
    }

    @k
    public final InterfaceC43160i<ServiceFeeConditionsInternalAction> a() {
        return C43175k.I(this.f278431c.a(), C43175k.G(new C8278a(null)));
    }
}
