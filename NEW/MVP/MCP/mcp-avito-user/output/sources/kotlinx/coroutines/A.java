package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: CompletableDeferred.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/A;", "T", "Lkotlinx/coroutines/V0;", "Lkotlinx/coroutines/z;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class A<T> extends V0 implements InterfaceC43314z<T> {
    @Override // kotlinx.coroutines.InterfaceC43076a0
    @Y61.l
    public final Object F(@Y61.k Continuation<? super T> continuation) throws Throwable {
        Object objT = T(continuation);
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return objT;
    }

    @Override // kotlinx.coroutines.InterfaceC43314z
    public final boolean b(@Y61.k Throwable th2) {
        return p0(new E(th2, false, 2, null));
    }

    @Override // kotlinx.coroutines.InterfaceC43076a0
    public final T i() throws Throwable {
        Object objJ0 = j0();
        if (objJ0 instanceof F0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (objJ0 instanceof E) {
            throw ((E) objJ0).f410693a;
        }
        return (T) C43077a1.a(objJ0);
    }
}
