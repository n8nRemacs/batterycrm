package com.avito.android.developments_agency_search.screen.realty_agency_search.mvi;

import Lw.InterfaceC14443a;
import com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction;
import com.avito.android.remote.model.SearchParams;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RealtyAgencySearchActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.RealtyAgencySearchActor$process$8", f = "RealtyAgencySearchActor.kt", i = {}, l = {220}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class r extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RealtyAgencySearchInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f138948q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f138949r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C29866a f138950s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Lw.c f138951t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14443a f138952u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(InterfaceC14443a interfaceC14443a, Lw.c cVar, C29866a c29866a, Continuation continuation) {
        super(2, continuation);
        this.f138950s = c29866a;
        this.f138951t = cVar;
        this.f138952u = interfaceC14443a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        r rVar = new r(this.f138952u, this.f138951t, this.f138950s, continuation);
        rVar.f138949r = obj;
        return rVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RealtyAgencySearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((r) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f138948q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f138949r;
            C29866a c29866a = this.f138950s;
            Kw.e eVar = c29866a.f138786c;
            SearchParams searchParams = this.f138951t.f10238b;
            InterfaceC14443a.e.d dVar = (InterfaceC14443a.e.d) this.f138952u;
            eVar.a(new RealtyAgencySearchInternalAction.AnalyticsEvent.ClientFixationOptionClicked(searchParams, "flat_snippet", dVar.f10192a, Boxing.boxLong(dVar.f10193b)));
            RealtyAgencySearchInternalAction.ShowClientFixationScreen showClientFixationScreen = new RealtyAgencySearchInternalAction.ShowClientFixationScreen(dVar.f10192a, c29866a.f138787d.f138671i);
            this.f138948q = 1;
            if (interfaceC43172j.emit(showClientFixationScreen, this) == coroutine_suspended) {
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
