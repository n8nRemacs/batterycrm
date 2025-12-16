package androidx.compose.foundation.text.selection;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import l0.g;

/* compiled from: TextSelectionDelegate.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class F1 {
    public static final long a(@Y61.k androidx.compose.ui.text.o0 o0Var, int i12, boolean z12, boolean z13) {
        androidx.compose.ui.text.G g12 = o0Var.f42527b;
        if (g12.d(i12) >= g12.f41921f) {
            l0.g.f413384b.getClass();
            return l0.g.f413386d;
        }
        boolean z14 = o0Var.a(((!z12 || z13) && (z12 || !z13)) ? Math.max(i12 + (-1), 0) : i12) == o0Var.j(i12);
        g12.n(i12);
        int length = g12.f41916a.f41924a.f42127c.length();
        ArrayList arrayList = g12.f41923h;
        androidx.compose.ui.text.M m12 = (androidx.compose.ui.text.M) arrayList.get(i12 == length ? C42745f0.J(arrayList) : androidx.compose.ui.text.J.a(i12, arrayList));
        float fV2 = m12.f41932a.v(m12.d(i12), z14);
        long j12 = o0Var.f42528c;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(kotlin.ranges.s.f(g12.b(r2), 0.0f, (int) (j12 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(kotlin.ranges.s.f(fV2, 0.0f, (int) (j12 >> 32))) << 32);
        g.a aVar = l0.g.f413384b;
        return jFloatToRawIntBits;
    }
}
