package com.avito.android.competitor_analytics.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.competitor_analytics.domain.model.StateType;
import com.avito.android.competitor_analytics.mvi.entity.CompetitorAnalyticsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CompetitorAnalyticsUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.competitor_analytics.domain.CompetitorAnalyticsUseCaseImpl$request$1", f = "CompetitorAnalyticsUseCase.kt", i = {0, 1, 4}, l = {36, 39, 44, 47, 53, 58, 61}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes12.dex */
final class e extends SuspendLambda implements p<InterfaceC43172j<? super CompetitorAnalyticsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f124287q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f124288r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f124289s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f124290t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ StateType f124291u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z12, f fVar, StateType stateType, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f124289s = z12;
        this.f124290t = fVar;
        this.f124291u = stateType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        e eVar = new e(this.f124289s, this.f124290t, this.f124291u, continuation);
        eVar.f124288r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CompetitorAnalyticsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.competitor_analytics.domain.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
