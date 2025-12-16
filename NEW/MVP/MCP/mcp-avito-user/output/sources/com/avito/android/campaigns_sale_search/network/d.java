package com.avito.android.campaigns_sale_search.network;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction;
import com.avito.android.campaigns_sale_search.mvi.entity.Filter;
import com.avito.android.remote.model.TypedResult;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CampaignsSaleSearchInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.campaigns_sale_search.network.CampaignsSaleSearchInteractorImpl$search$1", f = "CampaignsSaleSearchInteractor.kt", i = {0, 1, 3, 3}, l = {56, 58, 61, 64, 65, 71}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "result"}, s = {"L$0", "L$0", "L$0", "L$1"})
/* loaded from: classes12.dex */
final class d extends SuspendLambda implements p<InterfaceC43172j<? super CampaignsSaleSearchInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public TypedResult.Success f114834q;

    /* renamed from: r, reason: collision with root package name */
    public int f114835r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f114836s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f114837t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f114838u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Filter f114839v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, String str, Filter filter, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f114837t = bVar;
        this.f114838u = str;
        this.f114839v = filter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        d dVar = new d(this.f114837t, this.f114838u, this.f114839v, continuation);
        dVar.f114836s = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CampaignsSaleSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.campaigns_sale_search.network.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
