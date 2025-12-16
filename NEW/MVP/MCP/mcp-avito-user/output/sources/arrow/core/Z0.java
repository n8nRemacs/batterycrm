package arrow.core;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Option.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"arrow-core"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes10.dex */
public final class Z0 {
    public static final <T> T a(@Y61.k Y0<? extends T> y02, @Y61.k Y41.a<? extends T> aVar) {
        if (y02 instanceof X0) {
            return aVar.invoke();
        }
        if (y02 instanceof C23703n1) {
            return ((C23703n1) y02).f56288b;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Y61.k
    public static final <T> Y0<T> b(@Y61.l T t12) {
        return t12 != null ? new C23703n1(t12) : X0.f56264b;
    }
}
