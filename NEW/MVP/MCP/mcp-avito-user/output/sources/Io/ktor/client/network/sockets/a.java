package io.ktor.client.network.sockets;

import Y41.p;
import Y61.k;
import Y61.l;
import io.ktor.utils.io.C41627c1;
import io.ktor.utils.io.W0;
import io.ktor.utils.io.Z;
import io.ktor.utils.io.e2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TimeoutExceptionsCommon.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/e2;", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/utils/io/e2;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.network.sockets.TimeoutExceptionsCommonKt$mapEngineExceptions$1", f = "TimeoutExceptionsCommon.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class a extends SuspendLambda implements p<e2, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f398999q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ W0 f399000r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Z f399001s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(W0 w02, Z z12, Continuation continuation) {
        super(2, continuation);
        this.f399000r = w02;
        this.f399001s = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new a(this.f399000r, this.f399001s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(e2 e2Var, Continuation<? super G0> continuation) {
        return ((a) create(e2Var, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f398999q;
        W0 w02 = this.f399000r;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                Z z12 = this.f399001s;
                this.f398999q = 1;
                if (C41627c1.a(w02, z12, Long.MAX_VALUE, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
        } catch (Throwable th2) {
            w02.f(th2);
        }
        return G0.f406611a;
    }
}
