package com.avito.android.mortgage.root.mvi.domain;

import com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
import i00.InterfaceC41203a;
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

/* compiled from: OpenBankApplicationUseCase.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/domain/E;", "Lcom/avito/android/mortgage/root/mvi/domain/D;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class E implements D {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC41203a> f202986a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f202987b;

    /* compiled from: OpenBankApplicationUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.root.mvi.domain.OpenBankApplicationUseCaseImpl$invoke$1", f = "OpenBankApplicationUseCase.kt", i = {0, 1}, l = {23, AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f202988q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f202989r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f202990s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ E f202991t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f202992u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, E e12, String str2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f202990s = str;
            this.f202991t = e12;
            this.f202992u = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f202990s, this.f202991t, this.f202992u, continuation);
            aVar.f202989r = obj;
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
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f202988q
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
                java.lang.Object r1 = r7.f202989r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L63
            L2a:
                java.lang.Object r1 = r7.f202989r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L4c
            L32:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f202989r
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$OpenBankApplicationLoadingStarted r1 = new com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$OpenBankApplicationLoadingStarted
                java.lang.String r6 = r7.f202990s
                r1.<init>(r6)
                r7.f202989r = r8
                r7.f202988q = r5
                java.lang.Object r1 = r8.emit(r1, r7)
                if (r1 != r0) goto L4b
                return r0
            L4b:
                r1 = r8
            L4c:
                com.avito.android.mortgage.root.mvi.domain.E r8 = r7.f202991t
                h31.e<i00.a> r8 = r8.f202986a
                java.lang.Object r8 = r8.get()
                i00.a r8 = (i00.InterfaceC41203a) r8
                r7.f202989r = r1
                r7.f202988q = r4
                java.lang.String r4 = r7.f202992u
                java.lang.Object r8 = r8.e(r4, r7)
                if (r8 != r0) goto L63
                return r0
            L63:
                com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
                boolean r4 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto L86
                com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
                java.lang.Object r8 = r8.getResult()
                j00.a r8 = (j00.C42171a) r8
                com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$OpenBankApplicationLoadingCompleted r2 = new com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$OpenBankApplicationLoadingCompleted
                com.avito.android.deep_linking.links.DeepLink r8 = r8.getDeeplink()
                r2.<init>(r8)
                r7.f202989r = r5
                r7.f202988q = r3
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
                com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$OpenBankApplicationLoadingFailed r3 = new com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$OpenBankApplicationLoadingFailed
                com.avito.android.remote.error.ApiError r8 = com.avito.android.error.z.n(r8)
                r3.<init>(r8)
                r7.f202989r = r5
                r7.f202988q = r2
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
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.root.mvi.domain.E.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public E(@Y61.k R0 r02, @Y61.k h31.e eVar) {
        this.f202986a = eVar;
        this.f202987b = r02;
    }

    @Override // com.avito.android.mortgage.root.mvi.domain.D
    @Y61.k
    public final InterfaceC43160i<MortgageRootInternalAction> a(@Y61.k String str, @Y61.k String str2) {
        return C43175k.I(this.f202987b.a(), C43175k.G(new a(str, this, str2, null)));
    }
}
