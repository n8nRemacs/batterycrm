package com.avito.android.campaigns_sale_search.mvi;

import com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction;
import com.facebook.imageutils.JfifUtil;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import um.g;

/* compiled from: CampaignsSaleSearchActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.campaigns_sale_search.mvi.CampaignsSaleSearchActor$process$18$3", f = "CampaignsSaleSearchActor.kt", i = {}, l = {JfifUtil.MARKER_APP1}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class i extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleSearchInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f114766q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f114767r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<um.d> f114768s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f114769t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Y41.a<um.d> aVar, a aVar2, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f114768s = aVar;
        this.f114769t = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        i iVar = new i(this.f114768s, this.f114769t, continuation);
        iVar.f114767r = obj;
        return iVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CampaignsSaleSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f114766q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f114767r;
            Y41.a<um.d> aVar = this.f114768s;
            um.g gVar = aVar.invoke().f440267g;
            g.e eVar = gVar instanceof g.e ? (g.e) gVar : null;
            if (eVar == null) {
                return G0.f406611a;
            }
            int i13 = eVar.f440274a + 1;
            List list = (List) C42745f0.K(i13, aVar.invoke().f440264d);
            if (list == null) {
                return G0.f406611a;
            }
            InterfaceC43160i interfaceC43160iD = this.f114769t.f114636a.d(i13, list);
            this.f114766q = 1;
            if (C43175k.u(this, interfaceC43160iD, interfaceC43172j) == coroutine_suspended) {
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
