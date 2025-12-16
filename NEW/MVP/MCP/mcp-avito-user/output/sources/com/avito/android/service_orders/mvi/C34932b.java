package com.avito.android.service_orders.mvi;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.e2;
import st0.C48414c;

/* compiled from: AnalyticsTracker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_orders.mvi.AnalyticsTrackerImpl$track$1", f = "AnalyticsTracker.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.service_orders.mvi.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34932b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f279453q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C34935e f279454r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34932b(C34935e c34935e, Continuation<? super C34932b> continuation) {
        super(2, continuation);
        this.f279454r = c34935e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C34932b(this.f279454r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C34932b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f279453q;
        if (i12 == 0) {
            C42729a0.b(obj);
            e2 e2Var = this.f279454r.f279522d;
            C48414c c48414c = new C48414c("list_seller");
            this.f279453q = 1;
            if (e2Var.emit(c48414c, this) == coroutine_suspended) {
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
