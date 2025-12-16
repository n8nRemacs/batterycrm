package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.InterfaceC43268o0;

/* compiled from: Select.kt */
@I0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/selects/r;", "R", "", "Lkotlinx/coroutines/selects/s;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface r<R> {
    void b(@Y61.k InterfaceC43268o0 interfaceC43268o0);

    void d(@Y61.l Object obj);

    boolean e(@Y61.k Object obj, @Y61.l Object obj2);

    @Y61.k
    CoroutineContext getContext();
}
