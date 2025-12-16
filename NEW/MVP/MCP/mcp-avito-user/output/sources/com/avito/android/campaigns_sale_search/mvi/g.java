package com.avito.android.campaigns_sale_search.mvi;

import com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import um.AbstractC49075a;

/* compiled from: CampaignsSaleSearchActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.campaigns_sale_search.mvi.CampaignsSaleSearchActor$process$18$1", f = "CampaignsSaleSearchActor.kt", i = {0, 1, 2, 2, 2}, l = {174, 183, 198, 200}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "bState", "validationText"}, s = {"L$0", "L$0", "L$0", "L$1", "L$2"})
/* loaded from: classes12.dex */
final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleSearchInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public AbstractC49075a.b f114754q;

    /* renamed from: r, reason: collision with root package name */
    public String f114755r;

    /* renamed from: s, reason: collision with root package name */
    public int f114756s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f114757t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a f114758u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ um.f f114759v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Y41.a<um.d> f114760w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a aVar, um.f fVar, Y41.a<um.d> aVar2, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f114758u = aVar;
        this.f114759v = fVar;
        this.f114760w = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f114758u, this.f114759v, this.f114760w, continuation);
        gVar.f114757t = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CampaignsSaleSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0137 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.campaigns_sale_search.mvi.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
