package com.avito.android.service_orders.mvi;

import com.avito.android.service_orders.analytics.ServiceOrdersListErrorScreenEvent;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.e2;

/* compiled from: AnalyticsTracker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_orders.mvi.AnalyticsTrackerImpl$track$2", f = "AnalyticsTracker.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.service_orders.mvi.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34933c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f279455q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C34935e f279456r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34933c(C34935e c34935e, Continuation<? super C34933c> continuation) {
        super(2, continuation);
        this.f279456r = c34935e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C34933c(this.f279456r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C34933c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f279455q;
        if (i12 == 0) {
            C42729a0.b(obj);
            e2 e2Var = this.f279456r.f279522d;
            ServiceOrdersListErrorScreenEvent serviceOrdersListErrorScreenEvent = new ServiceOrdersListErrorScreenEvent(ServiceOrdersListErrorScreenEvent.ActionType.f279064c);
            this.f279455q = 1;
            if (e2Var.emit(serviceOrdersListErrorScreenEvent, this) == coroutine_suspended) {
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
