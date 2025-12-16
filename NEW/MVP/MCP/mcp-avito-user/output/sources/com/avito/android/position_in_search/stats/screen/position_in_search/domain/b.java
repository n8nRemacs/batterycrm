package com.avito.android.position_in_search.stats.screen.position_in_search.domain;

import Y41.p;
import androidx.compose.runtime.internal.P;
import com.avito.android.position_in_search.stats.screen.position_in_search.domain.model.PeriodType;
import com.avito.android.position_in_search.stats.screen.position_in_search.domain.model.PositionInfoPeriodAction;
import com.avito.android.position_in_search.stats.screen.position_in_search.mvi.entity.PositionInSearchInternalAction;
import com.avito.android.util.R0;
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

/* compiled from: PositionInSearchByPeriodUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/domain/b;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/domain/a;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.position_in_search.stats.screen.position_in_search.domain.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f221390a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final P80.a f221391b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final d f221392c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f221393d;

    /* compiled from: PositionInSearchByPeriodUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.position_in_search.domain.PositionInSearchByPeriodUseCaseImpl$invoke$1", f = "PositionInSearchByPeriodUseCase.kt", i = {0, 1}, l = {36, 37, 47, 50}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f221394q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f221395r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ PeriodType f221397t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Long f221398u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ PositionInfoPeriodAction f221399v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PeriodType periodType, Long l12, PositionInfoPeriodAction positionInfoPeriodAction, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f221397t = periodType;
            this.f221398u = l12;
            this.f221399v = positionInfoPeriodAction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = b.this.new a(this.f221397t, this.f221398u, this.f221399v, continuation);
            aVar.f221395r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
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
                int r1 = r14.f221394q
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
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L1d:
                kotlin.C42729a0.b(r15)
                goto Laf
            L22:
                java.lang.Object r1 = r14.f221395r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r15)
                goto L6c
            L2a:
                java.lang.Object r1 = r14.f221395r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r15)
                goto L4a
            L32:
                kotlin.C42729a0.b(r15)
                java.lang.Object r15 = r14.f221395r
                kotlinx.coroutines.flow.j r15 = (kotlinx.coroutines.flow.InterfaceC43172j) r15
                com.avito.android.position_in_search.stats.screen.position_in_search.mvi.entity.PositionInSearchInternalAction$PeriodInfo$Loading r1 = new com.avito.android.position_in_search.stats.screen.position_in_search.mvi.entity.PositionInSearchInternalAction$PeriodInfo$Loading
                r1.<init>()
                r14.f221395r = r15
                r14.f221394q = r5
                java.lang.Object r1 = r15.emit(r1, r14)
                if (r1 != r0) goto L49
                return r0
            L49:
                r1 = r15
            L4a:
                com.avito.android.position_in_search.stats.screen.position_in_search.domain.b r15 = com.avito.android.position_in_search.stats.screen.position_in_search.domain.b.this
                P80.a r5 = r15.f221391b
                com.avito.android.position_in_search.stats.screen.position_in_search.domain.model.PeriodType r6 = r14.f221397t
                java.lang.String r8 = r6.f221448b
                com.avito.android.position_in_search.stats.screen.position_in_search.domain.model.PositionInfoPeriodAction r6 = r14.f221399v
                com.avito.android.position_in_search.stats.screen.position_in_search.domain.d r7 = r15.f221392c
                com.avito.android.position_in_search.stats.generated.api.api_search_position_period_v_1.ActionType r10 = r7.f(r6)
                r14.f221395r = r1
                r14.f221394q = r4
                r11 = 0
                r12 = 0
                long r6 = r15.f221390a
                java.lang.Long r9 = r14.f221398u
                r13 = r14
                java.lang.Object r15 = r5.a(r6, r8, r9, r10, r11, r12, r13)
                if (r15 != r0) goto L6c
                return r0
            L6c:
                com.avito.android.remote.model.TypedResult r15 = (com.avito.android.remote.model.TypedResult) r15
                boolean r4 = r15 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto L8d
                com.avito.android.remote.model.TypedResult$Success r15 = (com.avito.android.remote.model.TypedResult.Success) r15
                java.lang.Object r15 = r15.getResult()
                Q80.d r15 = (Q80.d) r15
                Q80.d$a r15 = (Q80.d.a) r15
                com.avito.android.position_in_search.stats.screen.position_in_search.mvi.entity.PositionInSearchInternalAction$PeriodInfo$Content r2 = new com.avito.android.position_in_search.stats.screen.position_in_search.mvi.entity.PositionInSearchInternalAction$PeriodInfo$Content
                r2.<init>(r15)
                r14.f221395r = r5
                r14.f221394q = r3
                java.lang.Object r15 = r1.emit(r2, r14)
                if (r15 != r0) goto Laf
                return r0
            L8d:
                boolean r3 = r15 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto Lb2
                com.avito.android.remote.model.TypedResult$Error r15 = (com.avito.android.remote.model.TypedResult.Error) r15
                com.avito.android.remote.error.ApiError r3 = r15.getError()
                java.lang.Throwable r15 = r15.getCause()
                com.avito.android.util.ApiException r15 = com.avito.android.util.C35936s.a(r3, r15)
                com.avito.android.position_in_search.stats.screen.position_in_search.mvi.entity.PositionInSearchInternalAction$PeriodInfo$Error r3 = new com.avito.android.position_in_search.stats.screen.position_in_search.mvi.entity.PositionInSearchInternalAction$PeriodInfo$Error
                r3.<init>(r15)
                r14.f221395r = r5
                r14.f221394q = r2
                java.lang.Object r15 = r1.emit(r3, r14)
                if (r15 != r0) goto Laf
                return r0
            Laf:
                kotlin.G0 r15 = kotlin.G0.f406611a
                return r15
            Lb2:
                kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
                r15.<init>()
                throw r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.position_in_search.stats.screen.position_in_search.domain.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(long j12, @Y61.k P80.a aVar, @Y61.k d dVar, @Y61.k R0 r02) {
        this.f221390a = j12;
        this.f221391b = aVar;
        this.f221392c = dVar;
        this.f221393d = r02;
    }

    @Override // com.avito.android.position_in_search.stats.screen.position_in_search.domain.a
    @Y61.k
    public final InterfaceC43160i<PositionInSearchInternalAction> a(@Y61.k PeriodType periodType, @Y61.l Long l12, @Y61.k PositionInfoPeriodAction positionInfoPeriodAction) {
        return C43175k.I(this.f221393d.a(), C43175k.G(new a(periodType, l12, positionInfoPeriodAction, null)));
    }
}
