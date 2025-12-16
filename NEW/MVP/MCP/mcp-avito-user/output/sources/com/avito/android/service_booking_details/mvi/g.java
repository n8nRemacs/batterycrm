package com.avito.android.service_booking_details.mvi;

import Bt0.InterfaceC13184a;
import com.avito.android.service_booking_details.mvi.entity.ServiceBookingItemDetailsInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ServiceBookingItemDetailsActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LBt0/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction;", "<anonymous>", "(LBt0/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_booking_details.mvi.ServiceBookingItemDetailsActor$process$1", f = "ServiceBookingItemDetailsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class g extends SuspendLambda implements Y41.p<InterfaceC13184a, Continuation<? super InterfaceC43160i<? extends ServiceBookingItemDetailsInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f277403q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f277404r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Bt0.c> f277405s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Y41.a<Bt0.c> aVar, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f277404r = hVar;
        this.f277405s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f277404r, this.f277405s, continuation);
        gVar.f277403q = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC13184a interfaceC13184a, Continuation<? super InterfaceC43160i<? extends ServiceBookingItemDetailsInternalAction>> continuation) {
        return ((g) create(interfaceC13184a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f277404r.b((InterfaceC13184a) this.f277403q, this.f277405s.invoke());
    }
}
