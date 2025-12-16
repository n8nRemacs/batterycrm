package com.avito.android.comfortable_deal.repository;

import Y41.p;
import com.avito.android.comfortable_deal.api.model.DealResponse;
import com.avito.android.comfortable_deal.api.model.PageInfo;
import com.avito.android.comfortable_deal.common.view.client.ClientCardData;
import com.avito.android.comfortable_deal.repository.model.Stage;
import com.avito.android.remote.model.TypedResult;
import cp.InterfaceC39387a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: ComfortableDealRepository.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Ldp/j;", "Lcom/avito/android/comfortable_deal/common/view/client/ClientCardData;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.repository.ComfortableDealRepositoryImpl$archiveClients$2", f = "ComfortableDealRepository.kt", i = {}, l = {220}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super TypedResult<dp.j<ClientCardData>>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f122527q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f122528r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f122529s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ List<Stage> f122530t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f122531u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(d dVar, int i12, List<? extends Stage> list, int i13, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f122528r = dVar;
        this.f122529s = i12;
        this.f122530t = list;
        this.f122531u = i13;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new c(this.f122528r, this.f122529s, this.f122530t, this.f122531u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<dp.j<ClientCardData>>> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f122527q;
        if (i12 == 0) {
            C42729a0.b(obj);
            d dVar = this.f122528r;
            InterfaceC39387a interfaceC39387aY = d.y(dVar);
            LinkedHashMap linkedHashMapX = d.x(dVar, this.f122529s, this.f122530t, this.f122531u);
            this.f122527q = 1;
            obj = interfaceC39387aY.k(linkedHashMapX, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (!(typedResult instanceof TypedResult.Success)) {
            if (typedResult instanceof TypedResult.Error) {
                return typedResult;
            }
            throw new NoWhenBranchMatchedException();
        }
        dp.k kVar = (dp.k) ((TypedResult.Success) typedResult).getResult();
        PageInfo pageInfo = kVar.getPageInfo();
        List<DealResponse> listA = kVar.a();
        ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
        for (DealResponse dealResponse : listA) {
            arrayList.add(com.avito.android.comfortable_deal.common.view.client.d.b(dealResponse.getStage(), dealResponse.getClient(), dealResponse.getItem(), dealResponse.getId()));
        }
        return new TypedResult.Success(new dp.j(new dp.k(pageInfo, arrayList), null, 2, null));
    }
}
