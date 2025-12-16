package com.avito.android.iac_dialer.impl_module.device_status.connection_status;

import Y41.p;
import Y61.k;
import Y61.l;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;

/* compiled from: IacConnectionStatusProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.device_status.connection_status.IacConnectionStatusProviderImpl$initializeIfNeeded$5$1", f = "IacConnectionStatusProvider.kt", i = {0}, l = {164}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes14.dex */
final class g extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f165959q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f165960r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f165961s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b bVar, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f165961s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        g gVar = new g(this.f165961s, continuation);
        gVar.f165960r = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        T t12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f165959q;
        if (i12 == 0) {
            C42729a0.b(obj);
            t12 = (T) this.f165960r;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t12 = (T) this.f165960r;
            C42729a0.b(obj);
        }
        while (U.e(t12)) {
            b bVar = this.f165961s;
            b.b(bVar, bVar.getStatus());
            this.f165960r = t12;
            this.f165959q = 1;
            if (C43131e0.b(3000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
