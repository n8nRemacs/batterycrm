package com.avito.android.campaigns_sale.mvi;

import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction;
import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleState;
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
@DebugMetadata(c = "com.avito.android.campaigns_sale.mvi.CampaignsSaleActor$process$14", f = "CampaignsSaleActor.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.campaigns_sale.mvi.f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29306f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f114227q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f114228r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f114229s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ CampaignsSaleState f114230t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC41424a f114231u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29306f(w wVar, CampaignsSaleState campaignsSaleState, InterfaceC41424a interfaceC41424a, Continuation<? super C29306f> continuation) {
        super(2, continuation);
        this.f114229s = wVar;
        this.f114230t = campaignsSaleState;
        this.f114231u = interfaceC41424a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29306f c29306f = new C29306f(this.f114229s, this.f114230t, this.f114231u, continuation);
        c29306f.f114228r = obj;
        return c29306f;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CampaignsSaleInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C29306f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f114227q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f114228r;
            String str = ((InterfaceC41424a.h) this.f114231u).f398724a;
            this.f114227q = 1;
            if (w.c(this.f114229s, interfaceC43172j, this.f114230t, str, this) == coroutine_suspended) {
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
