package com.avito.android.developments_agency_search.screen.realty_agency_search.mvi;

import Lw.InterfaceC14443a;
import com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction;
import com.avito.android.remote.model.SearchParams;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RealtyAgencySearchActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.RealtyAgencySearchActor$process$7", f = "RealtyAgencySearchActor.kt", i = {}, l = {202}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.q, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C29882q extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RealtyAgencySearchInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f138943q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f138944r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C29866a f138945s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Lw.c f138946t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14443a f138947u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29882q(InterfaceC14443a interfaceC14443a, Lw.c cVar, C29866a c29866a, Continuation continuation) {
        super(2, continuation);
        this.f138945s = c29866a;
        this.f138946t = cVar;
        this.f138947u = interfaceC14443a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29882q c29882q = new C29882q(this.f138947u, this.f138946t, this.f138945s, continuation);
        c29882q.f138944r = obj;
        return c29882q;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RealtyAgencySearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C29882q) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f138943q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f138944r;
            C29866a c29866a = this.f138945s;
            Kw.e eVar = c29866a.f138786c;
            SearchParams searchParams = this.f138946t.f10238b;
            InterfaceC14443a.c.b bVar = (InterfaceC14443a.c.b) this.f138947u;
            eVar.a(new RealtyAgencySearchInternalAction.AnalyticsEvent.ClientFixationOptionClicked(searchParams, "jk_snippet", bVar.f10182a, null));
            RealtyAgencySearchInternalAction.ShowClientFixationScreen showClientFixationScreen = new RealtyAgencySearchInternalAction.ShowClientFixationScreen(bVar.f10182a, c29866a.f138787d.f138671i);
            this.f138943q = 1;
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
