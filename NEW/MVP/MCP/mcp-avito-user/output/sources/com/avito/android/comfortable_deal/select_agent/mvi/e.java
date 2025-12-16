package com.avito.android.comfortable_deal.select_agent.mvi;

import Y41.p;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.select_agent.model.SelectAgentArguments;
import com.avito.android.comfortable_deal.select_agent.mvi.entity.SelectAgentInternalAction;
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

/* compiled from: SelectAgentBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/select_agent/mvi/e;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements com.avito.android.arch.mvi.b<SelectAgentInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal.repository.a f122750a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SelectAgentArguments f122751b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f122752c;

    /* compiled from: SelectAgentBootstrap.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.select_agent.mvi.SelectAgentBootstrap$produce$1", f = "SelectAgentBootstrap.kt", i = {0, 1, 2}, l = {22, 23, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.ERROR_NO_ACTIVITY, AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super SelectAgentInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f122753q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f122754r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = e.this.new a(continuation);
            aVar.f122754r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super SelectAgentInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x007e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.f122753q
                com.avito.android.comfortable_deal.select_agent.mvi.e r2 = com.avito.android.comfortable_deal.select_agent.mvi.e.this
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                if (r1 == 0) goto L3f
                if (r1 == r7) goto L37
                if (r1 == r6) goto L2f
                if (r1 == r5) goto L27
                if (r1 == r4) goto L22
                if (r1 != r3) goto L1a
                goto L22
            L1a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L22:
                kotlin.C42729a0.b(r10)
                goto Lc4
            L27:
                java.lang.Object r1 = r9.f122754r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L7f
            L2f:
                java.lang.Object r1 = r9.f122754r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L72
            L37:
                java.lang.Object r1 = r9.f122754r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L62
            L3f:
                kotlin.C42729a0.b(r10)
                java.lang.Object r10 = r9.f122754r
                r1 = r10
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                boolean r10 = r2.f122752c
                if (r10 == 0) goto L4e
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            L4e:
                r2.f122752c = r7
                com.avito.android.comfortable_deal.select_agent.mvi.entity.SelectAgentInternalAction$Init r10 = new com.avito.android.comfortable_deal.select_agent.mvi.entity.SelectAgentInternalAction$Init
                com.avito.android.comfortable_deal.select_agent.model.SelectAgentArguments r8 = r2.f122751b
                r10.<init>(r8)
                r9.f122754r = r1
                r9.f122753q = r7
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L62
                return r0
            L62:
                com.avito.android.comfortable_deal.select_agent.mvi.entity.SelectAgentInternalAction$StartLoading r10 = new com.avito.android.comfortable_deal.select_agent.mvi.entity.SelectAgentInternalAction$StartLoading
                r10.<init>()
                r9.f122754r = r1
                r9.f122753q = r6
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L72
                return r0
            L72:
                com.avito.android.comfortable_deal.repository.a r10 = r2.f122750a
                r9.f122754r = r1
                r9.f122753q = r5
                java.lang.Object r10 = r10.m(r9)
                if (r10 != r0) goto L7f
                return r0
            L7f:
                com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
                boolean r2 = r10 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r2 == 0) goto L9e
                com.avito.android.remote.model.TypedResult$Success r10 = (com.avito.android.remote.model.TypedResult.Success) r10
                java.lang.Object r10 = r10.getResult()
                java.util.List r10 = (java.util.List) r10
                com.avito.android.comfortable_deal.select_agent.mvi.entity.SelectAgentInternalAction$AgentsLoaded r2 = new com.avito.android.comfortable_deal.select_agent.mvi.entity.SelectAgentInternalAction$AgentsLoaded
                r2.<init>(r10)
                r9.f122754r = r5
                r9.f122753q = r4
                java.lang.Object r10 = r1.emit(r2, r9)
                if (r10 != r0) goto Lc4
                return r0
            L9e:
                boolean r2 = r10 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r2 == 0) goto Lc7
                com.avito.android.remote.model.TypedResult$Error r10 = (com.avito.android.remote.model.TypedResult.Error) r10
                com.avito.android.remote.error.ApiError r2 = r10.getError()
                java.lang.Throwable r10 = r10.getCause()
                com.avito.android.util.ApiException r10 = com.avito.android.util.C35936s.a(r2, r10)
                com.avito.android.comfortable_deal.select_agent.mvi.entity.SelectAgentInternalAction$LoadingError r2 = new com.avito.android.comfortable_deal.select_agent.mvi.entity.SelectAgentInternalAction$LoadingError
                com.avito.android.remote.error.ApiError r10 = com.avito.android.error.z.n(r10)
                r2.<init>(r10)
                r9.f122754r = r5
                r9.f122753q = r3
                java.lang.Object r10 = r1.emit(r2, r9)
                if (r10 != r0) goto Lc4
                return r0
            Lc4:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            Lc7:
                kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
                r10.<init>()
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.select_agent.mvi.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public e(@Y61.k com.avito.android.comfortable_deal.repository.a aVar, @Y61.k SelectAgentArguments selectAgentArguments) {
        this.f122750a = aVar;
        this.f122751b = selectAgentArguments;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<SelectAgentInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
