package com.avito.android.cpt.activation.domain;

import Qr.InterfaceC14925a;
import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.cpt.activation.di.j;
import com.avito.android.cpt.activation.mvi.entity.CptActivationInternalAction;
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

/* compiled from: GetCptActivationUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpt/activation/domain/a;", "", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f126271a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC14925a f126272b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f126273c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.cpt.activation.data.mapper.a f126274d;

    /* compiled from: GetCptActivationUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cpt.activation.domain.GetCptActivationUseCase$invoke$1", f = "GetCptActivationUseCase.kt", i = {0, 1}, l = {23, AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.HMS_IS_SPOOF, 32}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.cpt.activation.domain.a$a, reason: collision with other inner class name */
    public static final class C3753a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f126275q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f126276r;

        public C3753a(Continuation<? super C3753a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C3753a c3753a = a.this.new C3753a(continuation);
            c3753a.f126276r = obj;
            return c3753a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C3753a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) throws java.lang.NumberFormatException {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f126275q
                com.avito.android.cpt.activation.domain.a r2 = com.avito.android.cpt.activation.domain.a.this
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
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                kotlin.C42729a0.b(r9)
                goto Lbd
            L24:
                java.lang.Object r1 = r8.f126276r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L5f
            L2c:
                java.lang.Object r1 = r8.f126276r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L4c
            L34:
                kotlin.C42729a0.b(r9)
                java.lang.Object r9 = r8.f126276r
                kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
                com.avito.android.cpt.activation.mvi.entity.CptActivationInternalAction$Loading r1 = new com.avito.android.cpt.activation.mvi.entity.CptActivationInternalAction$Loading
                r1.<init>()
                r8.f126276r = r9
                r8.f126275q = r6
                java.lang.Object r1 = r9.emit(r1, r8)
                if (r1 != r0) goto L4b
                return r0
            L4b:
                r1 = r9
            L4c:
                Qr.a r9 = r2.f126272b
                java.lang.String r6 = r2.f126271a
                long r6 = java.lang.Long.parseLong(r6)
                r8.f126276r = r1
                r8.f126275q = r5
                java.lang.Object r9 = r9.a(r6, r8)
                if (r9 != r0) goto L5f
                return r0
            L5f:
                com.avito.android.remote.model.TypedResult r9 = (com.avito.android.remote.model.TypedResult) r9
                boolean r5 = r9 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r5 == 0) goto L7a
                com.avito.android.remote.model.TypedResult$Success r9 = (com.avito.android.remote.model.TypedResult.Success) r9
                java.lang.Object r9 = r9.getResult()
                Sr.o r9 = (Sr.o) r9
                com.avito.android.cpt.activation.data.mapper.a r2 = r2.f126274d
                com.avito.android.cpt.remote.model.ActivationEstimateResponseV2 r9 = r2.b(r9)
                com.avito.android.remote.model.TypedResult$Success r2 = new com.avito.android.remote.model.TypedResult$Success
                r2.<init>(r9)
                r9 = r2
                goto L7e
            L7a:
                boolean r2 = r9 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r2 == 0) goto Lc6
            L7e:
                boolean r2 = r9 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r2 == 0) goto L9b
                com.avito.android.remote.model.TypedResult$Success r9 = (com.avito.android.remote.model.TypedResult.Success) r9
                java.lang.Object r9 = r9.getResult()
                com.avito.android.cpt.remote.model.ActivationEstimateResponseV2 r9 = (com.avito.android.cpt.remote.model.ActivationEstimateResponseV2) r9
                com.avito.android.cpt.activation.mvi.entity.CptActivationInternalAction$Content r2 = new com.avito.android.cpt.activation.mvi.entity.CptActivationInternalAction$Content
                r2.<init>(r9)
                r8.f126276r = r5
                r8.f126275q = r4
                java.lang.Object r9 = r1.emit(r2, r8)
                if (r9 != r0) goto Lbd
                return r0
            L9b:
                boolean r2 = r9 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r2 == 0) goto Lc0
                com.avito.android.remote.model.TypedResult$Error r9 = (com.avito.android.remote.model.TypedResult.Error) r9
                com.avito.android.remote.error.ApiError r2 = r9.getError()
                java.lang.Throwable r9 = r9.getCause()
                com.avito.android.util.ApiException r9 = com.avito.android.util.C35936s.a(r2, r9)
                com.avito.android.cpt.activation.mvi.entity.CptActivationInternalAction$Error r2 = new com.avito.android.cpt.activation.mvi.entity.CptActivationInternalAction$Error
                r2.<init>(r9)
                r8.f126276r = r5
                r8.f126275q = r3
                java.lang.Object r9 = r1.emit(r2, r8)
                if (r9 != r0) goto Lbd
                return r0
            Lbd:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            Lc0:
                kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
                r9.<init>()
                throw r9
            Lc6:
                kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
                r9.<init>()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpt.activation.domain.a.C3753a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@j @k String str, @k InterfaceC14925a interfaceC14925a, @k R0 r02, @k com.avito.android.cpt.activation.data.mapper.a aVar) {
        this.f126271a = str;
        this.f126272b = interfaceC14925a;
        this.f126273c = r02;
        this.f126274d = aVar;
    }

    @k
    public final InterfaceC43160i<CptActivationInternalAction> a() {
        return C43175k.I(this.f126273c.a(), C43175k.G(new C3753a(null)));
    }
}
