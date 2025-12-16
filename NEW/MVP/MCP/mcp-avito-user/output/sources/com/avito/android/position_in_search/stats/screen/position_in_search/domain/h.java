package com.avito.android.position_in_search.stats.screen.position_in_search.domain;

import Y41.p;
import androidx.compose.runtime.internal.P;
import com.avito.android.position_in_search.stats.screen.position_in_search.domain.model.PeriodType;
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

/* compiled from: PositionInSearchNextPageUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/domain/h;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/domain/g;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final long f221408a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final P80.a f221409b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final d f221410c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f221411d;

    /* compiled from: PositionInSearchNextPageUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.position_in_search.domain.PositionInSearchNextPageUseCaseImpl$invoke$1", f = "PositionInSearchNextPageUseCase.kt", i = {0, 1}, l = {34, 35, 45, 48}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f221412q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f221413r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ PeriodType f221415t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f221416u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PeriodType periodType, long j12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f221415t = periodType;
            this.f221416u = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = h.this.new a(this.f221415t, this.f221416u, continuation);
            aVar.f221413r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
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
                int r1 = r14.f221412q
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
                goto Lb3
            L22:
                java.lang.Object r1 = r14.f221413r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r15)
                goto L70
            L2a:
                java.lang.Object r1 = r14.f221413r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r15)
                goto L4a
            L32:
                kotlin.C42729a0.b(r15)
                java.lang.Object r15 = r14.f221413r
                kotlinx.coroutines.flow.j r15 = (kotlinx.coroutines.flow.InterfaceC43172j) r15
                com.avito.android.position_in_search.stats.screen.position_in_search.mvi.entity.PositionInSearchInternalAction$NextPageLoaded$Loading r1 = new com.avito.android.position_in_search.stats.screen.position_in_search.mvi.entity.PositionInSearchInternalAction$NextPageLoaded$Loading
                r1.<init>()
                r14.f221413r = r15
                r14.f221412q = r5
                java.lang.Object r1 = r15.emit(r1, r14)
                if (r1 != r0) goto L49
                return r0
            L49:
                r1 = r15
            L4a:
                com.avito.android.position_in_search.stats.screen.position_in_search.domain.h r15 = com.avito.android.position_in_search.stats.screen.position_in_search.domain.h.this
                P80.a r5 = r15.f221409b
                com.avito.android.position_in_search.stats.screen.position_in_search.domain.model.PeriodType r6 = r14.f221415t
                java.lang.String r8 = r6.f221448b
                long r6 = r14.f221416u
                java.lang.Long r9 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r6)
                com.avito.android.position_in_search.stats.screen.position_in_search.domain.model.PositionInfoPeriodAction r6 = com.avito.android.position_in_search.stats.screen.position_in_search.domain.model.PositionInfoPeriodAction.f221451d
                com.avito.android.position_in_search.stats.screen.position_in_search.domain.d r7 = r15.f221410c
                com.avito.android.position_in_search.stats.generated.api.api_search_position_period_v_1.ActionType r10 = r7.f(r6)
                r14.f221413r = r1
                r14.f221412q = r4
                r11 = 0
                r12 = 0
                long r6 = r15.f221408a
                r13 = r14
                java.lang.Object r15 = r5.a(r6, r8, r9, r10, r11, r12, r13)
                if (r15 != r0) goto L70
                return r0
            L70:
                com.avito.android.remote.model.TypedResult r15 = (com.avito.android.remote.model.TypedResult) r15
                boolean r4 = r15 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto L91
                com.avito.android.remote.model.TypedResult$Success r15 = (com.avito.android.remote.model.TypedResult.Success) r15
                java.lang.Object r15 = r15.getResult()
                Q80.d r15 = (Q80.d) r15
                Q80.d$b r15 = (Q80.d.b) r15
                com.avito.android.position_in_search.stats.screen.position_in_search.mvi.entity.PositionInSearchInternalAction$NextPageLoaded$Content r2 = new com.avito.android.position_in_search.stats.screen.position_in_search.mvi.entity.PositionInSearchInternalAction$NextPageLoaded$Content
                r2.<init>(r15)
                r14.f221413r = r5
                r14.f221412q = r3
                java.lang.Object r15 = r1.emit(r2, r14)
                if (r15 != r0) goto Lb3
                return r0
            L91:
                boolean r3 = r15 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto Lb6
                com.avito.android.remote.model.TypedResult$Error r15 = (com.avito.android.remote.model.TypedResult.Error) r15
                com.avito.android.remote.error.ApiError r3 = r15.getError()
                java.lang.Throwable r15 = r15.getCause()
                com.avito.android.util.ApiException r15 = com.avito.android.util.C35936s.a(r3, r15)
                com.avito.android.position_in_search.stats.screen.position_in_search.mvi.entity.PositionInSearchInternalAction$NextPageLoaded$Error r3 = new com.avito.android.position_in_search.stats.screen.position_in_search.mvi.entity.PositionInSearchInternalAction$NextPageLoaded$Error
                r3.<init>(r15)
                r14.f221413r = r5
                r14.f221412q = r2
                java.lang.Object r15 = r1.emit(r3, r14)
                if (r15 != r0) goto Lb3
                return r0
            Lb3:
                kotlin.G0 r15 = kotlin.G0.f406611a
                return r15
            Lb6:
                kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
                r15.<init>()
                throw r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.position_in_search.stats.screen.position_in_search.domain.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public h(long j12, @Y61.k P80.a aVar, @Y61.k d dVar, @Y61.k R0 r02) {
        this.f221408a = j12;
        this.f221409b = aVar;
        this.f221410c = dVar;
        this.f221411d = r02;
    }

    @Override // com.avito.android.position_in_search.stats.screen.position_in_search.domain.g
    @Y61.k
    public final InterfaceC43160i<PositionInSearchInternalAction> a(@Y61.k PeriodType periodType, long j12) {
        return C43175k.I(this.f221411d.a(), C43175k.G(new a(periodType, j12, null)));
    }
}
