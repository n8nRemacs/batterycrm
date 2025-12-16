package com.avito.android.campaigns_sale.network;

import com.adjust.sdk.Constants;
import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CampaignsSaleInteractorImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.campaigns_sale.network.CampaignsSaleInteractorImpl$saveSaleV2$1", f = "CampaignsSaleInteractorImpl.kt", i = {0, 1, 3, 4, 5}, l = {397, Constants.MINIMAL_ERROR_STATUS_CODE, 409, 411, 412, 413, 416, 422}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0"})
/* loaded from: classes12.dex */
final class q extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f114394q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f114395r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f114396s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f114397t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ArrayList f114398u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ DeepLink f114399v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(boolean z12, h hVar, ArrayList arrayList, DeepLink deepLink, Continuation continuation) {
        super(2, continuation);
        this.f114396s = z12;
        this.f114397t = hVar;
        this.f114398u = arrayList;
        this.f114399v = deepLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        q qVar = new q(this.f114396s, this.f114397t, this.f114398u, this.f114399v, continuation);
        qVar.f114395r = obj;
        return qVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CampaignsSaleInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((q) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0107  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.campaigns_sale.network.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
