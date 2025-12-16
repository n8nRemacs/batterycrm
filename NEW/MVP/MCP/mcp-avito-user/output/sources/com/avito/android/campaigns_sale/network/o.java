package com.avito.android.campaigns_sale.network;

import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.TypedResult;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CampaignsSaleInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.campaigns_sale.network.CampaignsSaleInteractorImpl$saveSaleV1$1", f = "CampaignsSaleInteractorImpl.kt", i = {0, 1, 3, 3, 4, 4, 5, 5, 6}, l = {356, 359, 367, 369, 370, 371, 374, 378, 384}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "pageResult", "$this$flow", "pageResult", "$this$flow", "pageResult", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0"})
/* loaded from: classes12.dex */
final class o extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public TypedResult f114384q;

    /* renamed from: r, reason: collision with root package name */
    public int f114385r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f114386s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f114387t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ h f114388u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ArrayList f114389v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ DeepLink f114390w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(boolean z12, h hVar, ArrayList arrayList, DeepLink deepLink, Continuation continuation) {
        super(2, continuation);
        this.f114387t = z12;
        this.f114388u = hVar;
        this.f114389v = arrayList;
        this.f114390w = deepLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        o oVar = new o(this.f114387t, this.f114388u, this.f114389v, this.f114390w, continuation);
        oVar.f114386s = obj;
        return oVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CampaignsSaleInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((o) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.campaigns_sale.network.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
