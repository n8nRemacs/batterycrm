package com.avito.android.campaigns_sale.mvi;

import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction;
import im.InterfaceC41424a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CampaignsSaleActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.campaigns_sale.mvi.CampaignsSaleActor$process$19", f = "CampaignsSaleActor.kt", i = {0}, l = {287, 288}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* renamed from: com.avito.android.campaigns_sale.mvi.k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29311k extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f114250q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f114251r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f114252s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC41424a f114253t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29311k(w wVar, InterfaceC41424a interfaceC41424a, Continuation<? super C29311k> continuation) {
        super(2, continuation);
        this.f114252s = wVar;
        this.f114253t = interfaceC41424a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29311k c29311k = new C29311k(this.f114252s, this.f114253t, continuation);
        c29311k.f114251r = obj;
        return c29311k;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CampaignsSaleInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C29311k) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f114250q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f114251r;
            CampaignsSaleInternalAction.TrackClickStreamEvent trackClickStreamEvent = new CampaignsSaleInternalAction.TrackClickStreamEvent(new em.d(this.f114252s.f114306c));
            this.f114251r = interfaceC43172j;
            this.f114250q = 1;
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
            interfaceC43172j = (InterfaceC43172j) this.f114251r;
            C42729a0.b(obj);
        }
        CampaignsSaleInternalAction.HandleDeepLink handleDeepLink = new CampaignsSaleInternalAction.HandleDeepLink(((InterfaceC41424a.c) this.f114253t).f398719a);
        this.f114251r = null;
        this.f114250q = 2;
        if (interfaceC43172j.emit(handleDeepLink, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
