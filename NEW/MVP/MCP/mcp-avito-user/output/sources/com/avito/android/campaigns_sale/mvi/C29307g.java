package com.avito.android.campaigns_sale.mvi;

import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction;
import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleState;
import em.C40128c;
import gm.C40705b;
import im.InterfaceC41424a;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CampaignsSaleActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.campaigns_sale.mvi.CampaignsSaleActor$process$15", f = "CampaignsSaleActor.kt", i = {0}, l = {197, 206}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* renamed from: com.avito.android.campaigns_sale.mvi.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29307g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f114232q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f114233r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f114234s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC41424a f114235t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ CampaignsSaleState f114236u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29307g(w wVar, CampaignsSaleState campaignsSaleState, InterfaceC41424a interfaceC41424a, Continuation continuation) {
        super(2, continuation);
        this.f114234s = wVar;
        this.f114235t = interfaceC41424a;
        this.f114236u = campaignsSaleState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        InterfaceC41424a interfaceC41424a = this.f114235t;
        C29307g c29307g = new C29307g(this.f114234s, this.f114236u, interfaceC41424a, continuation);
        c29307g.f114233r = obj;
        return c29307g;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CampaignsSaleInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C29307g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f114232q;
        InterfaceC41424a interfaceC41424a = this.f114235t;
        w wVar = this.f114234s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f114233r;
            String str = wVar.f114306c;
            Integer num = ((InterfaceC41424a.t) interfaceC41424a).f398738b;
            CampaignsSaleInternalAction.TrackClickStreamEvent trackClickStreamEvent = new CampaignsSaleInternalAction.TrackClickStreamEvent(new C40128c(str, "sale.discount", num != null ? num.toString() : null));
            this.f114233r = interfaceC43172j;
            this.f114232q = 1;
            if (interfaceC43172j.emit(trackClickStreamEvent, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f114233r;
            C42729a0.b(obj);
        }
        z zVar = wVar.f114305b;
        CampaignsSaleState campaignsSaleState = this.f114236u;
        CampaignsSaleState.c cVar = campaignsSaleState.f114199m;
        List<C40705b> list = campaignsSaleState.f114191e;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (C40705b c40705bA : list) {
            InterfaceC41424a.t tVar = (InterfaceC41424a.t) interfaceC41424a;
            if (kotlin.jvm.internal.L.f(c40705bA.f396773b, tVar.f398737a)) {
                c40705bA = C40705b.a(c40705bA, null, null, null, null, null, tVar.f398738b, null, false, false, false, 4031);
            }
            arrayList.add(c40705bA);
        }
        InterfaceC43160i<CampaignsSaleInternalAction> interfaceC43160iB = zVar.b(cVar, arrayList);
        this.f114233r = null;
        this.f114232q = 2;
        if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
