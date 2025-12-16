package com.avito.android.order.feature.data;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.order.OrderScreenSegment;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: OrderRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LO40/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.order.feature.data.OrderRepositoryImpl$getOrderDetails$2", f = "OrderRepositoryImpl.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super TypedResult<O40.a>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f209512q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f209513r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f209514s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f209515t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ OrderScreenSegment f209516u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, String str, String str2, OrderScreenSegment orderScreenSegment, Continuation continuation) {
        super(2, continuation);
        this.f209513r = cVar;
        this.f209514s = str;
        this.f209515t = str2;
        this.f209516u = orderScreenSegment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new b(this.f209513r, this.f209514s, this.f209515t, this.f209516u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<O40.a>> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f209512q;
        if (i12 == 0) {
            C42729a0.b(obj);
            N40.a aVar = this.f209513r.f209517a.get();
            String str = this.f209516u.f209450b;
            this.f209512q = 1;
            obj = aVar.b(this.f209514s, this.f209515t, true, str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return obj;
    }
}
