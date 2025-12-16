package com.avito.android.campaigns_sale_search.mvi;

import com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import um.b;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.campaigns_sale_search.mvi.CampaignsSaleSearchActor$process$$inlined$flatMapLatest$1", f = "CampaignsSaleSearchActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
public final class d extends SuspendLambda implements Y41.q<InterfaceC43172j<? super CampaignsSaleSearchInternalAction>, um.f, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f114702q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f114703r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f114704s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f114705t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.a f114706u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Y41.a aVar, a aVar2, Continuation continuation) {
        super(3, continuation);
        this.f114705t = aVar2;
        this.f114706u = aVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super CampaignsSaleSearchInternalAction> interfaceC43172j, um.f fVar, Continuation<? super G0> continuation) {
        d dVar = new d(this.f114706u, this.f114705t, continuation);
        dVar.f114703r = interfaceC43172j;
        dVar.f114704s = fVar;
        return dVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43160i interfaceC43160iG;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f114702q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f114703r;
            um.f fVar = (um.f) this.f114704s;
            boolean zF2 = L.f(fVar, b.m.f440244a);
            Y41.a aVar = this.f114706u;
            a aVar2 = this.f114705t;
            if (zF2) {
                int i13 = a.f114635e;
                aVar2.getClass();
                interfaceC43160iG = C43175k.G(new k("", aVar2, aVar, null));
            } else {
                interfaceC43160iG = fVar instanceof b.C12727b ? C43175k.G(new g(aVar2, fVar, aVar, null)) : fVar instanceof b.p ? C43175k.G(new h(aVar2, fVar, aVar, null)) : fVar instanceof b.s ? aVar2.f114636a.a(((um.d) aVar.invoke()).f440262b, ((um.d) aVar.invoke()).f440263c) : L.f(fVar, b.r.f440249a) ? C43175k.G(new i(aVar, aVar2, null)) : C43175k.G(new j(2, null));
            }
            this.f114702q = 1;
            if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
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
