package com.avito.avcalls.android.call;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: CallSession.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.android.call.CallSession$terminateCallSession$1", f = "CallSession.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class u extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f331627q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractC36187o f331628r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ xQ0.k f331629s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f331630t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(AbstractC36187o abstractC36187o, xQ0.k kVar, boolean z12, Continuation<? super u> continuation) {
        super(2, continuation);
        this.f331628r = abstractC36187o;
        this.f331629s = kVar;
        this.f331630t = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new u(this.f331628r, this.f331629s, this.f331630t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((u) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f331627q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f331627q = 1;
            if (this.f331628r.h(this.f331629s, this.f331630t, this) == coroutine_suspended) {
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
