package com.avito.android.campaigns_sale_search.mvi;

import com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CampaignsSaleSearchActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lum/b;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "<anonymous>", "(Lum/b;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.campaigns_sale_search.mvi.CampaignsSaleSearchActor$process$17", f = "CampaignsSaleSearchActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class f extends SuspendLambda implements Y41.p<um.b, Continuation<? super InterfaceC43160i<? extends CampaignsSaleSearchInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f114751q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f114752r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<um.d> f114753s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Y41.a aVar, a aVar2, Continuation continuation) {
        super(2, continuation);
        this.f114752r = aVar2;
        this.f114753s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f114753s, this.f114752r, continuation);
        fVar.f114751q = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(um.b bVar, Continuation<? super InterfaceC43160i<? extends CampaignsSaleSearchInternalAction>> continuation) {
        return ((f) create(bVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f114752r.b((um.b) this.f114751q, this.f114753s.invoke());
    }
}
