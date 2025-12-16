package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.J;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.V;
import androidx.compose.ui.text.g0;
import androidx.compose.ui.text.style.m;
import kotlin.Metadata;

/* compiled from: TextForegroundStyle.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* loaded from: classes.dex */
public final class l {
    @Y61.k
    public static final m a(@Y61.k m mVar, @Y61.k m mVar2, float f12) {
        boolean z12 = mVar instanceof c;
        if (!z12 && !(mVar2 instanceof c)) {
            m.a aVar = m.f42697a;
            long jH2 = V.h(mVar.getF42633b(), mVar2.getF42633b(), f12);
            aVar.getClass();
            return m.a.b(jH2);
        }
        if (!z12 || !(mVar2 instanceof c)) {
            return (m) g0.b(f12, mVar, mVar2);
        }
        m.a aVar2 = m.f42697a;
        J j12 = (J) g0.b(f12, ((c) mVar).f42631b, ((c) mVar2).f42631b);
        float fB2 = E0.e.b(((c) mVar).f42632c, ((c) mVar2).f42632c, f12);
        aVar2.getClass();
        return m.a.a(j12, fB2);
    }

    public static final long b(long j12, float f12) {
        return (Float.isNaN(f12) || f12 >= 1.0f) ? j12 : T.c(j12, T.e(j12) * f12);
    }
}
