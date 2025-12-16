package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Builders.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/c2;", "T", "Lkotlinx/coroutines/flow/a;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class c2<T> extends AbstractC43136a<T> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SuspendLambda f411348d;

    /* JADX WARN: Multi-variable type inference failed */
    public c2(@Y61.k Y41.p<? super InterfaceC43172j<? super T>, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar) {
        this.f411348d = (SuspendLambda) pVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlinx.coroutines.flow.AbstractC43136a
    @Y61.l
    public final Object collectSafely(@Y61.k InterfaceC43172j<? super T> interfaceC43172j, @Y61.k Continuation<? super kotlin.G0> continuation) {
        Object objInvoke = this.f411348d.invoke(interfaceC43172j, continuation);
        return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : kotlin.G0.f406611a;
    }
}
