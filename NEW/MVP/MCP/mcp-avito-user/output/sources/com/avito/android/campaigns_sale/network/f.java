package com.avito.android.campaigns_sale.network;

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
@DebugMetadata(c = "com.avito.android.campaigns_sale.network.CampaignsSaleInteractorImpl$enterSaleV2$1", f = "CampaignsSaleInteractorImpl.kt", i = {0, 1, 2}, l = {255, 257, 267, 268, 272}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes12.dex */
final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f114326q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f114327r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f114328s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ArrayList f114329t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ DeepLink f114330u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, ArrayList arrayList, DeepLink deepLink, Continuation continuation) {
        super(2, continuation);
        this.f114328s = hVar;
        this.f114329t = arrayList;
        this.f114330u = deepLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f114328s, this.f114329t, this.f114330u, continuation);
        fVar.f114327r = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CampaignsSaleInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.campaigns_sale.network.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
