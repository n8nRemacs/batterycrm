package com.avito.android.campaigns_sale.mvi;

import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction;
import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleState;
import hm.AbstractC40959a;
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
@DebugMetadata(c = "com.avito.android.campaigns_sale.mvi.CampaignsSaleActor$process$2", f = "CampaignsSaleActor.kt", i = {}, l = {46, 49}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.campaigns_sale.mvi.o, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29315o extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f114266q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f114267r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CampaignsSaleState f114268s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29315o(CampaignsSaleState campaignsSaleState, Continuation<? super C29315o> continuation) {
        super(2, continuation);
        this.f114268s = campaignsSaleState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29315o c29315o = new C29315o(this.f114268s, continuation);
        c29315o.f114267r = obj;
        return c29315o;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CampaignsSaleInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C29315o) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f114266q;
        if (i12 != 0) {
            if (i12 == 1) {
                C42729a0.b(obj);
                return G0.f406611a;
            }
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return G0.f406611a;
        }
        C42729a0.b(obj);
        InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f114267r;
        if (this.f114268s.f114195i == CampaignsSaleState.FloatingButton.f114211c) {
            CampaignsSaleInternalAction.ShowAlert showAlert = new CampaignsSaleInternalAction.ShowAlert(AbstractC40959a.c.f397405a);
            this.f114266q = 1;
            if (interfaceC43172j.emit(showAlert, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
        CampaignsSaleInternalAction.CloseScreen closeScreen = CampaignsSaleInternalAction.CloseScreen.f114159b;
        this.f114266q = 2;
        if (interfaceC43172j.emit(closeScreen, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
