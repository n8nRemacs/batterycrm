package com.avito.android.travel_search.mvi;

import com.avito.android.travel_search.mvi.entity.TravelSearchInternalAction;
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

/* compiled from: TravelSearchActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.travel_search.mvi.TravelSearchActor$process$4", f = "TravelSearchActor.kt", i = {0}, l = {105, 111}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TravelSearchInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f303137q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f303138r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f303139s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ vF0.g f303140t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, vF0.g gVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f303139s = eVar;
        this.f303140t = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f303139s, this.f303140t, continuation);
        dVar.f303138r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TravelSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f303137q;
        vF0.g gVar = this.f303140t;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f303138r;
            InterfaceC43160i interfaceC43160iA = this.f303139s.f303141a.a(gVar.f440607b, gVar.f440608c);
            this.f303138r = interfaceC43172j;
            this.f303137q = 1;
            if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f303138r;
            C42729a0.b(obj);
        }
        TravelSearchInternalAction.InitInlineFilters initInlineFilters = new TravelSearchInternalAction.InitInlineFilters(gVar.f440607b);
        this.f303138r = null;
        this.f303137q = 2;
        if (interfaceC43172j.emit(initInlineFilters, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
