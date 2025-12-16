package com.avito.android.position_in_search.stats.screen.position_in_search.domain;

import Y41.p;
import com.avito.android.position_in_search.stats.screen.position_in_search.domain.model.PeriodType;
import com.avito.android.position_in_search.stats.screen.position_in_search.domain.model.PositionInfoPeriodAction;
import com.avito.android.position_in_search.stats.screen.position_in_search.mvi.entity.PositionInSearchInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PositionInSearchUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.position_in_search.domain.PositionInSearchUseCaseImpl$invoke$1", f = "PositionInSearchUseCase.kt", i = {0, 1, 2}, l = {36, 38, 43, 44, 53}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes15.dex */
final class k extends SuspendLambda implements p<InterfaceC43172j<? super PositionInSearchInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public l f221421q;

    /* renamed from: r, reason: collision with root package name */
    public PeriodType f221422r;

    /* renamed from: s, reason: collision with root package name */
    public PositionInfoPeriodAction f221423s;

    /* renamed from: t, reason: collision with root package name */
    public int f221424t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f221425u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ l f221426v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PeriodType f221427w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PositionInfoPeriodAction f221428x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, PeriodType periodType, PositionInfoPeriodAction positionInfoPeriodAction, Continuation continuation) {
        super(2, continuation);
        this.f221426v = lVar;
        this.f221427w = periodType;
        this.f221428x = positionInfoPeriodAction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        k kVar = new k(this.f221426v, this.f221427w, this.f221428x, continuation);
        kVar.f221425u = obj;
        return kVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PositionInSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((k) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.position_in_search.stats.screen.position_in_search.domain.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
