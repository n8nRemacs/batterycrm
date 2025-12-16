package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: SharedFlow.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/flow/Y1;", "T", "Lkotlinx/coroutines/flow/d2;", "Lkotlinx/coroutines/flow/j;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface Y1<T> extends d2<T>, InterfaceC43172j<T> {
    boolean K5(T t12);

    @Y61.k
    n2<Integer> ac();

    @Y61.l
    Object emit(T t12, @Y61.k Continuation<? super kotlin.G0> continuation);

    @kotlinx.coroutines.B0
    void h4();
}
