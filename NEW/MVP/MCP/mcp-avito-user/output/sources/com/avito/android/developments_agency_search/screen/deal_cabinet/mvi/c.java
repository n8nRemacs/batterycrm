package com.avito.android.developments_agency_search.screen.deal_cabinet.mvi;

import com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: DealCabinetActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzw/b;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "<anonymous>", "(Lzw/b;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.DealCabinetActor$process$18", f = "DealCabinetActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class c extends SuspendLambda implements Y41.p<zw.b, Continuation<? super InterfaceC43160i<? extends DealCabinetInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f137070q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f137071r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<zw.d> f137072s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, Y41.a<zw.d> aVar2, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f137071r = aVar;
        this.f137072s = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f137071r, this.f137072s, continuation);
        cVar.f137070q = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(zw.b bVar, Continuation<? super InterfaceC43160i<? extends DealCabinetInternalAction>> continuation) {
        return ((c) create(bVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f137071r.b((zw.b) this.f137070q, this.f137072s.invoke());
    }
}
