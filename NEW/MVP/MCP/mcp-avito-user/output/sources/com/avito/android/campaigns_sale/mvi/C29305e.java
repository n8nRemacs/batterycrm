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
@DebugMetadata(c = "com.avito.android.campaigns_sale.mvi.CampaignsSaleActor$process$13", f = "CampaignsSaleActor.kt", i = {2}, l = {158, 164, 170, 178, 187}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* renamed from: com.avito.android.campaigns_sale.mvi.e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29305e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f114148q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f114149r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CampaignsSaleState f114150s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC41424a f114151t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ w f114152u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29305e(w wVar, CampaignsSaleState campaignsSaleState, InterfaceC41424a interfaceC41424a, Continuation continuation) {
        super(2, continuation);
        this.f114150s = campaignsSaleState;
        this.f114151t = interfaceC41424a;
        this.f114152u = wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29305e c29305e = new C29305e(this.f114152u, this.f114150s, this.f114151t, continuation);
        c29305e.f114149r = obj;
        return c29305e;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CampaignsSaleInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C29305e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3 A[LOOP:0: B:33:0x00ad->B:35:0x00b3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e1 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.campaigns_sale.mvi.C29305e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
