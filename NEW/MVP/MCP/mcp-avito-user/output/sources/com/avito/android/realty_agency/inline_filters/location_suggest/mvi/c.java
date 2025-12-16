package com.avito.android.realty_agency.inline_filters.location_suggest.mvi;

import com.avito.android.realty_agency.inline_filters.location_suggest.mvi.entity.LocationSuggestInternalAction;
import ji0.InterfaceC42386a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: LocationSuggestActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lji0/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/entity/LocationSuggestInternalAction;", "<anonymous>", "(Lji0/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.realty_agency.inline_filters.location_suggest.mvi.LocationSuggestActor$process$4", f = "LocationSuggestActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC42386a, Continuation<? super InterfaceC43160i<? extends LocationSuggestInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f251689q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f251690r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<ji0.c> f251691s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, Y41.a<ji0.c> aVar2, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f251690r = aVar;
        this.f251691s = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f251690r, this.f251691s, continuation);
        cVar.f251689q = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC42386a interfaceC42386a, Continuation<? super InterfaceC43160i<? extends LocationSuggestInternalAction>> continuation) {
        return ((c) create(interfaceC42386a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f251690r.b((InterfaceC42386a) this.f251689q, this.f251691s.invoke());
    }
}
