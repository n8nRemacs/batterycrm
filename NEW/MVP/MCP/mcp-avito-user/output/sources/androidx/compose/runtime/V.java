package androidx.compose.runtime;

import androidx.compose.runtime.internal.J;
import kotlin.Metadata;

/* compiled from: CompositionLocalMap.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class V {
    public static final <T> T a(@Y61.k O1 o12, @Y61.k O<T> o13) {
        T3 t3A = o12.get(o13);
        if (t3A == null) {
            t3A = o13.a();
        }
        return (T) t3A.a(o12);
    }

    @Y61.k
    public static final O1 b(@Y61.k Y1<?>[] y1Arr, @Y61.k O1 o12, @Y61.k O1 o13) {
        androidx.compose.runtime.internal.J jA2 = androidx.compose.runtime.internal.K.a();
        jA2.getClass();
        J.a aVar = new J.a(jA2);
        aVar.f38427h = jA2;
        for (Y1<?> y12 : y1Arr) {
            X1 x12 = y12.f38165a;
            if (y12.f38171g || !o12.containsKey(x12)) {
                aVar.put(x12, x12.c(y12, (T3) o13.get(x12)));
            }
        }
        return aVar.build();
    }
}
