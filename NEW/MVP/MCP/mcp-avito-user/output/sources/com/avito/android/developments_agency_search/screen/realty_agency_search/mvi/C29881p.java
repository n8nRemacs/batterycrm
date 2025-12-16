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
@DebugMetadata(c = "com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.RealtyAgencySearchActor$process$6", f = "RealtyAgencySearchActor.kt", i = {0}, l = {149, 151}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* renamed from: com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.p, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C29881p extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RealtyAgencySearchInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f138938q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f138939r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C29866a f138940s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14443a f138941t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Lw.c f138942u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29881p(InterfaceC14443a interfaceC14443a, Lw.c cVar, C29866a c29866a, Continuation continuation) {
        super(2, continuation);
        this.f138940s = c29866a;
        this.f138941t = interfaceC14443a;
        this.f138942u = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29881p c29881p = new C29881p(this.f138941t, this.f138942u, this.f138940s, continuation);
        c29881p.f138939r = obj;
        return c29881p;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RealtyAgencySearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C29881p) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f138938q;
        C29866a c29866a = this.f138940s;
        InterfaceC14443a interfaceC14443a = this.f138941t;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f138939r;
            InterfaceC14443a.h hVar = (InterfaceC14443a.h) interfaceC14443a;
            c29866a.f138785b.c(hVar.f10203a);
            RealtyAgencySearchInternalAction.UpdateClientMode updateClientMode = new RealtyAgencySearchInternalAction.UpdateClientMode(hVar.f10203a);
            this.f138939r = interfaceC43172j;
            this.f138938q = 1;
            if (interfaceC43172j.emit(updateClientMode, this) == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f138939r;
            C42729a0.b(obj);
        }
        InterfaceC43160i interfaceC43160iA = E.a.a(c29866a.f138784a, this.f138942u, null, null, ((InterfaceC14443a.h) interfaceC14443a).f10203a, null, null, 0, 118);
        this.f138939r = null;
        this.f138938q = 2;
        if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
