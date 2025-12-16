package com.avito.android.campaigns_sale.mvi;

import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction;
import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleState;
import im.InterfaceC41424a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CampaignsSaleActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.campaigns_sale.mvi.CampaignsSaleActor$process$17", f = "CampaignsSaleActor.kt", i = {0, 1}, l = {230, 239, 240}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* renamed from: com.avito.android.campaigns_sale.mvi.i, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29309i extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f114240q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f114241r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CampaignsSaleState f114242s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w f114243t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC41424a f114244u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29309i(w wVar, CampaignsSaleState campaignsSaleState, InterfaceC41424a interfaceC41424a, Continuation continuation) {
        super(2, continuation);
        this.f114242s = campaignsSaleState;
        this.f114243t = wVar;
        this.f114244u = interfaceC41424a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29309i c29309i = new C29309i(this.f114243t, this.f114242s, this.f114244u, continuation);
        c29309i.f114241r = obj;
        return c29309i;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CampaignsSaleInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C29309i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0105 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.campaigns_sale.mvi.C29309i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
