package com.avito.android.campaigns_sale.network;

import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction;
import com.avito.android.campaigns_sale.network.remote.model.CampaignsSaleAutosaveResult;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.A4;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import om.InterfaceC44818a;

/* compiled from: CampaignsSaleInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.campaigns_sale.network.CampaignsSaleInteractorImpl$autosaveSaleV1$1", f = "CampaignsSaleInteractorImpl.kt", i = {0}, l = {188, 195}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes12.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f114311q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f114312r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f114313s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ArrayList f114314t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h hVar, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f114313s = hVar;
        this.f114314t = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f114313s, this.f114314t, continuation);
        bVar.f114312r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CampaignsSaleInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f114311q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f114312r;
            h hVar = this.f114313s;
            InterfaceC44818a interfaceC44818a = hVar.f114335b.get();
            String str = hVar.f114334a.f114050b;
            A4 a42 = A4.f318516a;
            ArrayList arrayList = this.f114314t;
            a42.getClass();
            Map<String, String> mapH = A4.h(arrayList, "blocks");
            this.f114312r = interfaceC43172j;
            this.f114311q = 1;
            obj = interfaceC44818a.b(str, mapH, this);
            if (obj == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f114312r;
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            List<BeduinAction> actions = ((CampaignsSaleAutosaveResult) ((TypedResult.Success) typedResult).getResult()).getActions();
            if (actions != null) {
                CampaignsSaleInternalAction.HandleBeduinActions handleBeduinActions = new CampaignsSaleInternalAction.HandleBeduinActions(actions);
                this.f114312r = null;
                this.f114311q = 2;
                if (interfaceC43172j.emit(handleBeduinActions, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            boolean z12 = typedResult instanceof TypedResult.Error;
        }
        return G0.f406611a;
    }
}
