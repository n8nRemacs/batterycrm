package com.avito.android.publish.slots.delivery_summary_edit;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary_edit.DeliverySummaryEditRequest;
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
import ll0.C43790a;

/* compiled from: DeliverySummaryEditSlotWrapper.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lll0/f;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.slots.delivery_summary_edit.DeliverySummaryEditSlotWrapper$loadDeliverySummaryEditV2$1$1", f = "DeliverySummaryEditSlotWrapper.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class h extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<ll0.f>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f243775q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f243776r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ DeliverySummaryEditRequest f243777s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, DeliverySummaryEditRequest deliverySummaryEditRequest, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f243776r = fVar;
        this.f243777s = deliverySummaryEditRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new h(this.f243776r, this.f243777s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<ll0.f>> continuation) {
        return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f243775q;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return obj;
        }
        C42729a0.b(obj);
        InterfaceC39749a interfaceC39749a = this.f243776r.f243761f;
        DeliverySummaryEditRequest deliverySummaryEditRequest = this.f243777s;
        Long lZ02 = C43066x.z0(deliverySummaryEditRequest.getCategoryId());
        long jLongValue = lZ02 != null ? lZ02.longValue() : 0L;
        String description = deliverySummaryEditRequest.getDescription();
        Long lZ03 = C43066x.z0(deliverySummaryEditRequest.getItemId());
        C43790a c43790a = new C43790a(jLongValue, description, lZ03 != null ? lZ03.longValue() : 0L, deliverySummaryEditRequest.getLocationJwt(), deliverySummaryEditRequest.getParamsTree(), C43066x.z0(deliverySummaryEditRequest.getPrice()), null, null, deliverySummaryEditRequest.getSlotsTree(), deliverySummaryEditRequest.getTitle());
        this.f243775q = 1;
        Object objJ = interfaceC39749a.j(c43790a, this);
        return objJ == coroutine_suspended ? coroutine_suspended : objJ;
    }
}
