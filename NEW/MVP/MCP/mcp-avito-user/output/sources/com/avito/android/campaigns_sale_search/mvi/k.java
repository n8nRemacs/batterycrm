package com.avito.android.campaigns_sale_search.mvi;

import com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CampaignsSaleSearchActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.campaigns_sale_search.mvi.CampaignsSaleSearchActor$showHistoryOrSearch$1", f = "CampaignsSaleSearchActor.kt", i = {}, l = {249, 254}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class k extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleSearchInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f114770q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f114771r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f114772s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f114773t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.a<um.d> f114774u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, a aVar, Y41.a<um.d> aVar2, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f114772s = str;
        this.f114773t = aVar;
        this.f114774u = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        k kVar = new k(this.f114772s, this.f114773t, this.f114774u, continuation);
        kVar.f114771r = obj;
        return kVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CampaignsSaleSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((k) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f114770q;
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
        InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f114771r;
        String str = this.f114772s;
        int length = str.length();
        a aVar = this.f114773t;
        if (length == 0) {
            List<String> listE = aVar.f114637b.e();
            if (!listE.isEmpty()) {
                CampaignsSaleSearchInternalAction.SearchHistoryLoaded searchHistoryLoaded = new CampaignsSaleSearchInternalAction.SearchHistoryLoaded(listE);
                this.f114770q = 1;
                if (interfaceC43172j.emit(searchHistoryLoaded, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return G0.f406611a;
            }
        }
        if (str.length() > 0 && str.length() < 3) {
            return G0.f406611a;
        }
        InterfaceC43160i interfaceC43160iA = aVar.f114636a.a(str, this.f114774u.invoke().f440263c);
        this.f114770q = 2;
        if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
