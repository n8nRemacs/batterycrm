package com.avito.android.publish.slots.delivery_summary;

import Y41.p;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.DeliverySummaryRequest;
import dl0.InterfaceC39749a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43066x;
import kotlinx.coroutines.T;
import ml0.C44094a;

/* compiled from: DeliverySummarySlotWrapper.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lml0/p;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.slots.delivery_summary.DeliverySummarySlotWrapper$loadDeliverySummaryV2$1$1", f = "DeliverySummarySlotWrapper.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class h extends SuspendLambda implements p<T, Continuation<? super TypedResult<ml0.p>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f243568q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l f243569r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ DeliverySummaryRequest f243570s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, DeliverySummaryRequest deliverySummaryRequest, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f243569r = lVar;
        this.f243570s = deliverySummaryRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new h(this.f243569r, this.f243570s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<ml0.p>> continuation) {
        return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f243568q;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return obj;
        }
        C42729a0.b(obj);
        InterfaceC39749a interfaceC39749a = this.f243569r.f243666g;
        DeliverySummaryRequest deliverySummaryRequest = this.f243570s;
        String locationJwt = deliverySummaryRequest.getLocationJwt();
        Long lZ02 = C43066x.z0(deliverySummaryRequest.getCategoryId());
        C44094a c44094a = new C44094a(lZ02 != null ? lZ02.longValue() : 0L, null, null, null, null, locationJwt, deliverySummaryRequest.getParamsTree(), C43066x.z0(deliverySummaryRequest.getPrice()), null, deliverySummaryRequest.getSlotsTree(), null);
        this.f243568q = 1;
        Object objA = interfaceC39749a.a(c44094a, this);
        return objA == coroutine_suspended ? coroutine_suspended : objA;
    }
}
