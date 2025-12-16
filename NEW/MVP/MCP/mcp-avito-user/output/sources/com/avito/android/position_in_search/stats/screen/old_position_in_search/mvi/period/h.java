package com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period;

import Ju.InterfaceC14249c;
import X80.c;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PeriodSortDirection;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PositionInfoPeriodAction;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction;
import com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.SearchPositionSortDeepLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kv.C43501a;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.PeriodInfoActor$processDeeplinkResult$$inlined$flatMapLatest$1", f = "PeriodInfoActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
public final class h extends SuspendLambda implements Y41.q<InterfaceC43172j<? super PeriodInfoInternalAction>, C43501a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f220637q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f220638r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f220639s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.a f220640t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a f220641u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Y41.a aVar, a aVar2, Continuation continuation) {
        super(3, continuation);
        this.f220640t = aVar;
        this.f220641u = aVar2;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super PeriodInfoInternalAction> interfaceC43172j, C43501a c43501a, Continuation<? super G0> continuation) {
        h hVar = new h(this.f220640t, this.f220641u, continuation);
        hVar.f220638r = interfaceC43172j;
        hVar.f220639s = c43501a;
        return hVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43160i c43210w;
        X80.i iVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f220637q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f220638r;
            InterfaceC14249c interfaceC14249c = ((C43501a) this.f220639s).f413261b;
            if (interfaceC14249c instanceof SearchPositionSortDeepLink.b.C6694b) {
                X80.j jVar = (X80.j) this.f220640t.invoke();
                SearchPositionSortDeepLink.b.C6694b c6694b = (SearchPositionSortDeepLink.b.C6694b) interfaceC14249c;
                String str = c6694b.f221333b;
                C43210w c43210w2 = new C43210w(new PeriodInfoInternalAction.ChangeSortItem(str, c6694b.f221334c));
                PositionInfoPeriodAction positionInfoPeriodAction = PositionInfoPeriodAction.f220481e;
                c.a aVarA = X80.k.a(jVar.f18714f);
                PeriodSortDirection periodSortDirection = (aVarA == null || (iVar = aVarA.f18675e) == null) ? null : iVar.f18708c;
                a aVar = this.f220641u;
                c43210w = C43175k.N(c43210w2, new i(aVar.c(a.e(aVar, jVar, positionInfoPeriodAction, str, periodSortDirection, 1))));
            } else {
                c43210w = new C43210w(PeriodInfoInternalAction.NoChange.f220607b);
            }
            this.f220637q = 1;
            if (C43175k.u(this, c43210w, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
