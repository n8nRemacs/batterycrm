package com.avito.android.developments_agency_search.screen.realty_agency_search.mvi;

import Lw.InterfaceC14443a;
import com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction;
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
@DebugMetadata(c = "com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.RealtyAgencySearchActor$process$11", f = "RealtyAgencySearchActor.kt", i = {}, l = {264}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C29869d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RealtyAgencySearchInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f138801q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f138802r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14443a f138803s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Lw.c f138804t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29869d(InterfaceC14443a interfaceC14443a, Lw.c cVar, Continuation<? super C29869d> continuation) {
        super(2, continuation);
        this.f138803s = interfaceC14443a;
        this.f138804t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29869d c29869d = new C29869d(this.f138803s, this.f138804t, continuation);
        c29869d.f138802r = obj;
        return c29869d;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RealtyAgencySearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C29869d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f138801q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f138802r;
            boolean z12 = ((InterfaceC14443a.m) this.f138803s).f10208a;
            if (z12 == this.f138804t.f10240d.f10256a) {
                return G0.f406611a;
            }
            RealtyAgencySearchInternalAction.UpdateInlineFiltersLoadingState updateInlineFiltersLoadingState = new RealtyAgencySearchInternalAction.UpdateInlineFiltersLoadingState(z12);
            this.f138801q = 1;
            if (interfaceC43172j.emit(updateInlineFiltersLoadingState, this) == coroutine_suspended) {
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
