package kotlinx.coroutines.flow;

import kotlin.Metadata;

/* compiled from: StateFlow.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/flow/Z1;", "T", "Lkotlinx/coroutines/flow/n2;", "Lkotlinx/coroutines/flow/Y1;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface Z1<T> extends n2<T>, Y1<T> {
    boolean N3(T t12, T t13);

    @Override // kotlinx.coroutines.flow.n2
    T getValue();

    void setValue(T t12);
}
