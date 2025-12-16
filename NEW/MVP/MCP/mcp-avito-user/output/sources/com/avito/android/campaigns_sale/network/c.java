package com.avito.android.campaigns_sale.network;

import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction;
import java.util.ArrayList;
import java.util.List;
import jm.InterfaceC42397a;
import km.C42713a;
import km.C42714b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import pm.C47111b;

/* compiled from: CampaignsSaleInteractorImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.campaigns_sale.network.CampaignsSaleInteractorImpl$autosaveSaleV2$1", f = "CampaignsSaleInteractorImpl.kt", i = {}, l = {206}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f114315q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f114316r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ArrayList f114317s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f114316r = hVar;
        this.f114317s = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new c(this.f114316r, this.f114317s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CampaignsSaleInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f114315q;
        if (i12 == 0) {
            C42729a0.b(obj);
            h hVar = this.f114316r;
            InterfaceC42397a interfaceC42397a = hVar.f114336c.get();
            String str = hVar.f114334a.f114050b;
            ArrayList<C47111b> arrayList = this.f114317s;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            for (C47111b c47111b : arrayList) {
                String uuid = c47111b.getUuid();
                Long lValueOf = c47111b.getDiscount() != null ? Long.valueOf(r7.intValue()) : null;
                List<Long> listB = c47111b.b();
                if (listB == null) {
                    listB = C42784z0.f406748b;
                }
                arrayList2.add(new C42714b(lValueOf, listB, uuid));
            }
            C42713a c42713a = new C42713a(arrayList2);
            this.f114315q = 1;
            if (interfaceC42397a.b(str, c42713a, this) == coroutine_suspended) {
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
