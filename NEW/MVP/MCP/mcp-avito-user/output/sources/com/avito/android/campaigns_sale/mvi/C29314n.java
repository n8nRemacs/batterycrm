package com.avito.android.campaigns_sale.mvi;

import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction;
import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleState;
import gm.C40705b;
import im.InterfaceC41424a;
import java.util.ArrayList;
import java.util.Iterator;
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
@DebugMetadata(c = "com.avito.android.campaigns_sale.mvi.CampaignsSaleActor$process$21", f = "CampaignsSaleActor.kt", i = {}, l = {297}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.campaigns_sale.mvi.n, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29314n extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f114261q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f114262r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f114263s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ CampaignsSaleState f114264t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC41424a f114265u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29314n(w wVar, CampaignsSaleState campaignsSaleState, InterfaceC41424a interfaceC41424a, Continuation<? super C29314n> continuation) {
        super(2, continuation);
        this.f114263s = wVar;
        this.f114264t = campaignsSaleState;
        this.f114265u = interfaceC41424a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29314n c29314n = new C29314n(this.f114263s, this.f114264t, this.f114265u, continuation);
        c29314n.f114262r = obj;
        return c29314n;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CampaignsSaleInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C29314n) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f114261q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f114262r;
            z zVar = this.f114263s.f114305b;
            CampaignsSaleState campaignsSaleState = this.f114264t;
            CampaignsSaleState.c cVar = campaignsSaleState.f114199m;
            List<C40705b> list = campaignsSaleState.f114191e;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C40705b.a((C40705b) it.next(), null, null, null, null, null, null, null, false, false, false, 3583));
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            InterfaceC41424a.o oVar = (InterfaceC41424a.o) this.f114265u;
            arrayList2.add(oVar.f398732b, oVar.f398731a);
            G0 g02 = G0.f406611a;
            InterfaceC43160i<CampaignsSaleInternalAction> interfaceC43160iB = zVar.b(cVar, arrayList2);
            this.f114261q = 1;
            if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
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
