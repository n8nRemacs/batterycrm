package com.avito.android.delivery_location_suggest.mvi;

import Gv.InterfaceC13920a;
import Y41.p;
import com.avito.android.delivery_location_suggest.mvi.entity.DeliveryLocationSuggestInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: DeliveryLocationSuggestActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LGv/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/delivery_location_suggest/mvi/entity/DeliveryLocationSuggestInternalAction;", "<anonymous>", "(LGv/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.delivery_location_suggest.mvi.DeliveryLocationSuggestActor$process$1", f = "DeliveryLocationSuggestActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class d extends SuspendLambda implements p<InterfaceC13920a, Continuation<? super InterfaceC43160i<? extends DeliveryLocationSuggestInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f135162q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f135163r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Gv.c> f135164s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, Y41.a<Gv.c> aVar2, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f135163r = aVar;
        this.f135164s = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f135163r, this.f135164s, continuation);
        dVar.f135162q = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC13920a interfaceC13920a, Continuation<? super InterfaceC43160i<? extends DeliveryLocationSuggestInternalAction>> continuation) {
        return ((d) create(interfaceC13920a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC13920a interfaceC13920a = (InterfaceC13920a) this.f135162q;
        this.f135164s.invoke();
        return this.f135163r.c(interfaceC13920a);
    }
}
