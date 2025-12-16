package com.avito.android.campaigns_sale.network;

import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CampaignsSaleInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.campaigns_sale.network.CampaignsSaleInteractorImpl$reloadPage$1", f = "CampaignsSaleInteractorImpl.kt", i = {0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7}, l = {297, 303, 309, 310, 320, 321, 324, 325, 327, 331}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "pageResult", "$this$flow", "pageResult", "$this$flow", "pageResult", "$this$flow", "pageResult", "$this$flow", "pageResult", "$this$flow", "blocksWithId", "$this$flow"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0"})
/* loaded from: classes12.dex */
final class m extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object f114377q;

    /* renamed from: r, reason: collision with root package name */
    public int f114378r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f114379s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f114380t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(h hVar, Continuation<? super m> continuation) {
        super(2, continuation);
        this.f114380t = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        m mVar = new m(this.f114380t, continuation);
        mVar.f114379s = obj;
        return mVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CampaignsSaleInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((m) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0196 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a6  */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.campaigns_sale.network.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
