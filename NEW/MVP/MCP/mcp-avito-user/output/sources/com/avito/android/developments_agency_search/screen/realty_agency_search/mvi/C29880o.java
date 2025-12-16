package com.avito.android.developments_agency_search.screen.realty_agency_search.mvi;

import Lw.InterfaceC14443a;
import com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.E;
import com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction;
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

/* compiled from: RealtyAgencySearchActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.RealtyAgencySearchActor$process$5", f = "RealtyAgencySearchActor.kt", i = {0}, l = {136, 137}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* renamed from: com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.o, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C29880o extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RealtyAgencySearchInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f138933q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f138934r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14443a f138935s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C29866a f138936t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Lw.c f138937u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29880o(InterfaceC14443a interfaceC14443a, Lw.c cVar, C29866a c29866a, Continuation continuation) {
        super(2, continuation);
        this.f138935s = interfaceC14443a;
        this.f138936t = c29866a;
        this.f138937u = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29866a c29866a = this.f138936t;
        C29880o c29880o = new C29880o(this.f138935s, this.f138937u, c29866a, continuation);
        c29880o.f138934r = obj;
        return c29880o;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RealtyAgencySearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C29880o) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f138933q;
        InterfaceC14443a interfaceC14443a = this.f138935s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f138934r;
            RealtyAgencySearchInternalAction.UpdateLotSortingType updateLotSortingType = new RealtyAgencySearchInternalAction.UpdateLotSortingType(((InterfaceC14443a.n) interfaceC14443a).f10209a);
            this.f138934r = interfaceC43172j;
            this.f138933q = 1;
            if (interfaceC43172j.emit(updateLotSortingType, this) == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f138934r;
            C42729a0.b(obj);
        }
        InterfaceC43160i interfaceC43160iA = E.a.a(this.f138936t.f138784a, this.f138937u, null, null, false, null, ((InterfaceC14443a.n) interfaceC14443a).f10209a, 0, 94);
        this.f138934r = null;
        this.f138933q = 2;
        if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
