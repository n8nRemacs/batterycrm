package K31;

import N41.g;
import androidx.compose.runtime.A;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.V;
import w2.AbstractC49425a;

/* loaded from: classes8.dex */
public abstract class b {
    public static final long a(g gVar, A a12) {
        long jA2;
        a12.I(2074114795);
        Integer num = gVar.f11195b;
        T tA2 = num != null ? T.a(V.b(num.intValue())) : null;
        Integer num2 = gVar.f11196c;
        T tA3 = num2 != null ? T.a(V.b(num2.intValue())) : null;
        if (ic1.d.a(a12)) {
            tA2 = tA3;
        }
        if (tA2 == null) {
            T.a aVar = T.f39320b;
            jA2 = AbstractC49425a.a(a12);
        } else {
            jA2 = tA2.f39331a;
        }
        a12.O();
        return jA2;
    }
}
