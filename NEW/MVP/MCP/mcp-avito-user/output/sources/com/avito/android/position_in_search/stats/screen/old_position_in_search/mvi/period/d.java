package com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period;

import X80.b;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PeriodInfoActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.PeriodInfoActor$processBannerClosed$1", f = "PeriodInfoActor.kt", i = {0}, l = {124, 125}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super PeriodInfoInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f220578q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f220579r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f220580s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b.C1320b f220581t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, b.C1320b c1320b, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f220580s = aVar;
        this.f220581t = c1320b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f220580s, this.f220581t, continuation);
        dVar.f220579r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PeriodInfoInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f220578q;
        b.C1320b c1320b = this.f220581t;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f220579r;
            com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.f fVar = this.f220580s.f220556a;
            String str = c1320b.f18657a;
            this.f220579r = interfaceC43172j;
            this.f220578q = 1;
            if (fVar.f220370d.a(str, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f220579r;
            C42729a0.b(obj);
        }
        PeriodInfoInternalAction.BannerClosed bannerClosed = new PeriodInfoInternalAction.BannerClosed(c1320b.f18657a);
        this.f220579r = null;
        this.f220578q = 2;
        if (interfaceC43172j.emit(bannerClosed, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
