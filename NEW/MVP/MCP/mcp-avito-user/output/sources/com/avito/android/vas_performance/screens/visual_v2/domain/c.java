package com.avito.android.vas_performance.screens.visual_v2.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.R0;
import com.avito.android.vas_performance.screens.visual_v2.mvi.entity.VisualVasV2InternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import wL0.InterfaceC49533a;

/* compiled from: GetVisualVasV2UseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual_v2/domain/c;", "", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC49533a f321221a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f321222b;

    /* compiled from: GetVisualVasV2UseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.vas_performance.screens.visual_v2.domain.GetVisualVasV2UseCase$invoke$1", f = "GetVisualVasV2UseCase.kt", i = {0, 1}, l = {19, 21, 22, 23}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f321223q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f321224r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f321226t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f321227u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j12, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f321226t = j12;
            this.f321227u = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = c.this.new a(this.f321226t, this.f321227u, continuation);
            aVar.f321224r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
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
                int r1 = r7.f321223q
                java.lang.String r2 = r7.f321227u
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
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                kotlin.C42729a0.b(r8)
                goto L96
            L24:
                java.lang.Object r1 = r7.f321224r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L5d
            L2c:
                java.lang.Object r1 = r7.f321224r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L4c
            L34:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f321224r
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                com.avito.android.vas_performance.screens.visual_v2.mvi.entity.VisualVasV2InternalAction$Loading r1 = new com.avito.android.vas_performance.screens.visual_v2.mvi.entity.VisualVasV2InternalAction$Loading
                r1.<init>()
                r7.f321224r = r8
                r7.f321223q = r6
                java.lang.Object r1 = r8.emit(r1, r7)
                if (r1 != r0) goto L4b
                return r0
            L4b:
                r1 = r8
            L4c:
                com.avito.android.vas_performance.screens.visual_v2.domain.c r8 = com.avito.android.vas_performance.screens.visual_v2.domain.c.this
                wL0.a r8 = r8.f321221a
                r7.f321224r = r1
                r7.f321223q = r5
                long r5 = r7.f321226t
                java.lang.Object r8 = r8.a(r5, r2, r7)
                if (r8 != r0) goto L5d
                return r0
            L5d:
                com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
                boolean r5 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
                r6 = 0
                if (r5 == 0) goto L7c
                com.avito.android.vas_performance.screens.visual_v2.mvi.entity.VisualVasV2InternalAction$Content r3 = new com.avito.android.vas_performance.screens.visual_v2.mvi.entity.VisualVasV2InternalAction$Content
                com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
                java.lang.Object r8 = r8.getResult()
                xL0.a r8 = (xL0.C49858a) r8
                r3.<init>(r8, r2)
                r7.f321224r = r6
                r7.f321223q = r4
                java.lang.Object r8 = r1.emit(r3, r7)
                if (r8 != r0) goto L96
                return r0
            L7c:
                boolean r2 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r2 == 0) goto L96
                com.avito.android.vas_performance.screens.visual_v2.mvi.entity.VisualVasV2InternalAction$Error r2 = new com.avito.android.vas_performance.screens.visual_v2.mvi.entity.VisualVasV2InternalAction$Error
                com.avito.android.remote.model.TypedResult$Error r8 = (com.avito.android.remote.model.TypedResult.Error) r8
                com.avito.android.remote.error.ApiError r8 = r8.getError()
                r2.<init>(r8)
                r7.f321224r = r6
                r7.f321223q = r3
                java.lang.Object r8 = r1.emit(r2, r7)
                if (r8 != r0) goto L96
                return r0
            L96:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.vas_performance.screens.visual_v2.domain.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public c(@k InterfaceC49533a interfaceC49533a, @k R0 r02) {
        this.f321221a = interfaceC49533a;
        this.f321222b = r02;
    }

    @k
    public final InterfaceC43160i<VisualVasV2InternalAction> a(long j12, @k String str) {
        return C43175k.I(this.f321222b.a(), C43175k.G(new a(j12, str, null)));
    }
}
